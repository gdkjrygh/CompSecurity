// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.support.v7.internal.view.StandaloneActionMode;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.DecorContentParent;
import android.support.v7.internal.widget.FitWindowsViewGroup;
import android.support.v7.internal.widget.TintCheckBox;
import android.support.v7.internal.widget.TintCheckedTextView;
import android.support.v7.internal.widget.TintEditText;
import android.support.v7.internal.widget.TintRadioButton;
import android.support.v7.internal.widget.TintSpinner;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBarActivity, ActionBar

class ActionBarActivityDelegateBase extends ActionBarActivityDelegate
    implements android.support.v7.internal.view.menu.MenuBuilder.Callback
{
    final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ActionBarActivityDelegateBase this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            checkCloseActionMenu(menubuilder);
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            WindowCallback windowcallback = getWindowCallback();
            if (windowcallback != null)
            {
                windowcallback.onMenuOpened(8, menubuilder);
            }
            return true;
        }

        private ActionMenuPresenterCallback()
        {
            this$0 = ActionBarActivityDelegateBase.this;
            super();
        }

    }

    final class ActionModeCallbackWrapper
        implements android.support.v7.view.ActionMode.Callback
    {

        private android.support.v7.view.ActionMode.Callback mWrapped;
        final ActionBarActivityDelegateBase this$0;

        public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            return mWrapped.onActionItemClicked(actionmode, menuitem);
        }

        public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onCreateActionMode(actionmode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionmode)
        {
            mWrapped.onDestroyActionMode(actionmode);
            if (mActionModePopup != null)
            {
                mActivity.getWindow().getDecorView().removeCallbacks(mShowActionModePopup);
                mActionModePopup.dismiss();
            } else
            if (mActionModeView != null)
            {
                mActionModeView.setVisibility(8);
                if (mActionModeView.getParent() != null)
                {
                    ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
                }
            }
            if (mActionModeView != null)
            {
                mActionModeView.removeAllViews();
            }
            if (mActivity != null)
            {
                try
                {
                    actionmode = mActivity;
                    actionmode = mActionMode;
                }
                // Misplaced declaration of an exception variable
                catch (ActionMode actionmode) { }
            }
            mActionMode = null;
        }

        public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onPrepareActionMode(actionmode, menu);
        }

        public ActionModeCallbackWrapper(android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarActivityDelegateBase.this;
            super();
            mWrapped = callback;
        }
    }

    static final class PanelFeatureState
    {

        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        View shownPanelView;

        final MenuView getListMenuView(android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
        {
            if (menu == null)
            {
                return null;
            }
            if (listMenuPresenter == null)
            {
                listMenuPresenter = new ListMenuPresenter(listPresenterContext, android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
                listMenuPresenter.setCallback(callback);
                menu.addMenuPresenter(listMenuPresenter);
            }
            return listMenuPresenter.getMenuView(decorView);
        }

        public final boolean hasPanelItems()
        {
            while (shownPanelView == null || listMenuPresenter.getAdapter().getCount() <= 0) 
            {
                return false;
            }
            return true;
        }

        final void setMenu(MenuBuilder menubuilder)
        {
            if (menubuilder != menu)
            {
                if (menu != null)
                {
                    menu.removeMenuPresenter(listMenuPresenter);
                }
                menu = menubuilder;
                if (menubuilder != null && listMenuPresenter != null)
                {
                    menubuilder.addMenuPresenter(listMenuPresenter);
                    return;
                }
            }
        }

        final void setStyle(Context context)
        {
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            context = new ContextThemeWrapper(context, 0);
            context.getTheme().setTo(theme);
            listPresenterContext = context;
        }

        PanelFeatureState(int i)
        {
            featureId = i;
            refreshDecorView = false;
        }
    }

    final class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ActionBarActivityDelegateBase this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
label0:
            {
                MenuBuilder menubuilder1 = menubuilder.getRootMenu();
                ActionBarActivityDelegateBase actionbaractivitydelegatebase;
                boolean flag1;
                if (menubuilder1 != menubuilder)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                actionbaractivitydelegatebase = ActionBarActivityDelegateBase.this;
                if (flag1)
                {
                    menubuilder = menubuilder1;
                }
                menubuilder = actionbaractivitydelegatebase.findMenuPanel(menubuilder);
                if (menubuilder != null)
                {
                    if (!flag1)
                    {
                        break label0;
                    }
                    callOnPanelClosed(((PanelFeatureState) (menubuilder)).featureId, menubuilder, menubuilder1);
                    closePanel(menubuilder, true);
                }
                return;
            }
            mActivity.closeOptionsMenu();
            closePanel(menubuilder, flag);
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null && mHasActionBar)
            {
                WindowCallback windowcallback = getWindowCallback();
                if (windowcallback != null && !isDestroyed())
                {
                    windowcallback.onMenuOpened(8, menubuilder);
                }
            }
            return true;
        }

        private PanelMenuPresenterCallback()
        {
            this$0 = ActionBarActivityDelegateBase.this;
            super();
        }

    }


    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable = new Runnable() {

        final ActionBarActivityDelegateBase this$0;

        public final void run()
        {
            if ((mInvalidatePanelMenuFeatures & 1) != 0)
            {
                doInvalidatePanelMenu(0);
            }
            if ((mInvalidatePanelMenuFeatures & 0x100) != 0)
            {
                doInvalidatePanelMenu(8);
            }
            mInvalidatePanelMenuPosted = false;
            mInvalidatePanelMenuFeatures = 0;
        }

            
            {
                this$0 = ActionBarActivityDelegateBase.this;
                super();
            }
    };
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState mPanels[];
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private CharSequence mTitleToSet;
    private ListMenuPresenter mToolbarListMenuPresenter;
    private ViewGroup mWindowDecor;

    ActionBarActivityDelegateBase(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    private void applyFixedSizeWindow()
    {
        TypedArray typedarray = mActivity.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        TypedValue typedvalue = null;
        TypedValue typedvalue2 = null;
        TypedValue typedvalue1 = null;
        TypedValue typedvalue3 = null;
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMajor))
        {
            typedvalue = new TypedValue();
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMajor, typedvalue);
        }
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMinor))
        {
            typedvalue2 = new TypedValue();
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMinor, typedvalue2);
        }
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMajor))
        {
            typedvalue1 = new TypedValue();
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMajor, typedvalue1);
        }
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMinor))
        {
            typedvalue3 = new TypedValue();
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMinor, typedvalue3);
        }
        DisplayMetrics displaymetrics = mActivity.getResources().getDisplayMetrics();
        int i;
        int j;
        byte byte0;
        byte byte1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        byte1 = -1;
        byte0 = -1;
        if (j == 0)
        {
            typedvalue2 = typedvalue;
        }
        i = byte1;
        if (typedvalue2 != null)
        {
            i = byte1;
            if (typedvalue2.type != 0)
            {
                if (typedvalue2.type == 5)
                {
                    i = (int)typedvalue2.getDimension(displaymetrics);
                } else
                {
                    i = byte1;
                    if (typedvalue2.type == 6)
                    {
                        i = (int)typedvalue2.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
                    }
                }
            }
        }
        if (j == 0)
        {
            typedvalue1 = typedvalue3;
        }
        j = byte0;
        if (typedvalue1 != null)
        {
            j = byte0;
            if (typedvalue1.type != 0)
            {
                if (typedvalue1.type == 5)
                {
                    j = (int)typedvalue1.getDimension(displaymetrics);
                } else
                {
                    j = byte0;
                    if (typedvalue1.type == 6)
                    {
                        j = (int)typedvalue1.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
                    }
                }
            }
        }
        if (i != -1 || j != -1)
        {
            mActivity.getWindow().setLayout(i, j);
        }
        typedarray.recycle();
    }

    private void callOnPanelClosed(int i, PanelFeatureState panelfeaturestate, Menu menu)
    {
        PanelFeatureState panelfeaturestate2 = panelfeaturestate;
        Object obj = menu;
        if (menu == null)
        {
            PanelFeatureState panelfeaturestate1 = panelfeaturestate;
            if (panelfeaturestate == null)
            {
                panelfeaturestate1 = panelfeaturestate;
                if (i >= 0)
                {
                    panelfeaturestate1 = panelfeaturestate;
                    if (i < mPanels.length)
                    {
                        panelfeaturestate1 = mPanels[i];
                    }
                }
            }
            panelfeaturestate2 = panelfeaturestate1;
            obj = menu;
            if (panelfeaturestate1 != null)
            {
                obj = panelfeaturestate1.menu;
                panelfeaturestate2 = panelfeaturestate1;
            }
        }
        if (panelfeaturestate2 != null && !panelfeaturestate2.isOpen)
        {
            return;
        } else
        {
            getWindowCallback().onPanelClosed(i, ((Menu) (obj)));
            return;
        }
    }

    private void checkCloseActionMenu(MenuBuilder menubuilder)
    {
        if (mClosingActionMenu)
        {
            return;
        }
        mClosingActionMenu = true;
        mDecorContentParent.dismissPopups();
        WindowCallback windowcallback = getWindowCallback();
        if (windowcallback != null && !isDestroyed())
        {
            windowcallback.onPanelClosed(8, menubuilder);
        }
        mClosingActionMenu = false;
    }

    private void closePanel(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.featureId == 0 && mDecorContentParent != null && mDecorContentParent.isOverflowMenuShowing())
        {
            checkCloseActionMenu(panelfeaturestate.menu);
        } else
        {
            if (panelfeaturestate.isOpen && flag)
            {
                callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, null);
            }
            panelfeaturestate.isPrepared = false;
            panelfeaturestate.isHandled = false;
            panelfeaturestate.isOpen = false;
            panelfeaturestate.shownPanelView = null;
            panelfeaturestate.refreshDecorView = true;
            if (mPreparedPanel == panelfeaturestate)
            {
                mPreparedPanel = null;
                return;
            }
        }
    }

    private void doInvalidatePanelMenu(int i)
    {
        PanelFeatureState panelfeaturestate = getPanelState(i, true);
        if (panelfeaturestate.menu != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.frozenActionViewState = bundle;
            }
            panelfeaturestate.menu.stopDispatchingItemsChanged();
            panelfeaturestate.menu.clear();
        }
        panelfeaturestate.refreshMenuContent = true;
        panelfeaturestate.refreshDecorView = true;
        if ((i == 8 || i == 0) && mDecorContentParent != null)
        {
            PanelFeatureState panelfeaturestate1 = getPanelState(0, false);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.isPrepared = false;
                preparePanel(panelfeaturestate1, null);
            }
        }
    }

    private void ensureSubDecor()
    {
        if (!mSubDecorInstalled)
        {
            if (mHasActionBar)
            {
                Object obj = new TypedValue();
                mActivity.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
                if (((TypedValue) (obj)).resourceId != 0)
                {
                    obj = new ContextThemeWrapper(mActivity, ((TypedValue) (obj)).resourceId);
                } else
                {
                    obj = mActivity;
                }
                mSubDecor = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, null);
                mDecorContentParent = (DecorContentParent)mSubDecor.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
                mDecorContentParent.setWindowCallback(getWindowCallback());
                if (mOverlayActionBar)
                {
                    mDecorContentParent.initFeature(9);
                }
                if (mFeatureProgress)
                {
                    mDecorContentParent.initFeature(2);
                }
                if (mFeatureIndeterminateProgress)
                {
                    mDecorContentParent.initFeature(5);
                }
            } else
            {
                if (mOverlayActionMode)
                {
                    mSubDecor = (ViewGroup)LayoutInflater.from(mActivity).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, null);
                } else
                {
                    mSubDecor = (ViewGroup)LayoutInflater.from(mActivity).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, null);
                }
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    ViewCompat.setOnApplyWindowInsetsListener(mSubDecor, new OnApplyWindowInsetsListener() {

                        final ActionBarActivityDelegateBase this$0;

                        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
                        {
                            int i = windowinsetscompat.getSystemWindowInsetTop();
                            int j = updateStatusGuard(i);
                            view = windowinsetscompat;
                            if (i != j)
                            {
                                view = windowinsetscompat.replaceSystemWindowInsets(windowinsetscompat.getSystemWindowInsetLeft(), j, windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
                            }
                            return view;
                        }

            
            {
                this$0 = ActionBarActivityDelegateBase.this;
                super();
            }
                    });
                } else
                {
                    ((FitWindowsViewGroup)mSubDecor).setOnFitSystemWindowsListener(new android.support.v7.internal.widget.FitWindowsViewGroup.OnFitSystemWindowsListener() {

                        final ActionBarActivityDelegateBase this$0;

                        public final void onFitSystemWindows(Rect rect)
                        {
                            rect.top = updateStatusGuard(rect.top);
                        }

            
            {
                this$0 = ActionBarActivityDelegateBase.this;
                super();
            }
                    });
                }
            }
            ViewUtils.makeOptionalFitsSystemWindows(mSubDecor);
            mActivity.superSetContentView(mSubDecor);
            obj = mActivity.findViewById(0x1020002);
            ((View) (obj)).setId(-1);
            mActivity.findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content).setId(0x1020002);
            if (obj instanceof FrameLayout)
            {
                ((FrameLayout)obj).setForeground(null);
            }
            if (mTitleToSet != null && mDecorContentParent != null)
            {
                mDecorContentParent.setWindowTitle(mTitleToSet);
                mTitleToSet = null;
            }
            applyFixedSizeWindow();
            onSubDecorInstalled();
            mSubDecorInstalled = true;
            obj = getPanelState(0, false);
            if (!isDestroyed() && (obj == null || ((PanelFeatureState) (obj)).menu == null))
            {
                invalidatePanelMenu(8);
            }
        }
    }

    private void ensureToolbarListMenuPresenter()
    {
        if (mToolbarListMenuPresenter == null)
        {
            TypedValue typedvalue = new TypedValue();
            mActivity.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
            ActionBarActivity actionbaractivity = mActivity;
            int i;
            if (typedvalue.resourceId != 0)
            {
                i = typedvalue.resourceId;
            } else
            {
                i = android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu;
            }
            mToolbarListMenuPresenter = new ListMenuPresenter(new ContextThemeWrapper(actionbaractivity, i), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
        }
    }

    private PanelFeatureState findMenuPanel(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = mPanels;
        int i;
        int j;
        if (apanelfeaturestate != null)
        {
            i = apanelfeaturestate.length;
        } else
        {
            i = 0;
        }
        for (j = 0; j < i; j++)
        {
            PanelFeatureState panelfeaturestate = apanelfeaturestate[j];
            if (panelfeaturestate != null && panelfeaturestate.menu == menu)
            {
                return panelfeaturestate;
            }
        }

        return null;
    }

    private PanelFeatureState getPanelState(int i, boolean flag)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = mPanels;
            if (apanelfeaturestate1 != null)
            {
                apanelfeaturestate = apanelfeaturestate1;
                if (apanelfeaturestate1.length > i)
                {
                    break label0;
                }
            }
            PanelFeatureState apanelfeaturestate2[] = new PanelFeatureState[i + 1];
            if (apanelfeaturestate1 != null)
            {
                System.arraycopy(apanelfeaturestate1, 0, apanelfeaturestate2, 0, apanelfeaturestate1.length);
            }
            apanelfeaturestate = apanelfeaturestate2;
            mPanels = apanelfeaturestate2;
        }
        PanelFeatureState panelfeaturestate1 = apanelfeaturestate[i];
        PanelFeatureState panelfeaturestate = panelfeaturestate1;
        if (panelfeaturestate1 == null)
        {
            panelfeaturestate = new PanelFeatureState(i);
            apanelfeaturestate[i] = panelfeaturestate;
        }
        return panelfeaturestate;
    }

    private boolean initializePanelContent(PanelFeatureState panelfeaturestate)
    {
        if (panelfeaturestate.menu != null)
        {
            if (mPanelMenuPresenterCallback == null)
            {
                mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
            }
            panelfeaturestate.shownPanelView = (View)panelfeaturestate.getListMenuView(mPanelMenuPresenterCallback);
            if (panelfeaturestate.shownPanelView != null)
            {
                return true;
            }
        }
        return false;
    }

    private void initializePanelDecor(PanelFeatureState panelfeaturestate)
    {
        panelfeaturestate.decorView = mWindowDecor;
        panelfeaturestate.setStyle(getActionBarThemedContext());
    }

    private boolean initializePanelMenu(PanelFeatureState panelfeaturestate)
    {
label0:
        {
            ActionBarActivity actionbaractivity = mActivity;
            Object obj;
            if (panelfeaturestate.featureId != 0)
            {
                obj = actionbaractivity;
                if (panelfeaturestate.featureId != 8)
                {
                    break label0;
                }
            }
            obj = actionbaractivity;
            if (mDecorContentParent != null)
            {
                TypedValue typedvalue = new TypedValue();
                android.content.res.Resources.Theme theme = actionbaractivity.getTheme();
                theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
                obj = null;
                Object obj1;
                if (typedvalue.resourceId != 0)
                {
                    obj = actionbaractivity.getResources().newTheme();
                    ((android.content.res.Resources.Theme) (obj)).setTo(theme);
                    ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
                    ((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
                } else
                {
                    theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
                }
                obj1 = obj;
                if (typedvalue.resourceId != 0)
                {
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = actionbaractivity.getResources().newTheme();
                        ((android.content.res.Resources.Theme) (obj1)).setTo(theme);
                    }
                    ((android.content.res.Resources.Theme) (obj1)).applyStyle(typedvalue.resourceId, true);
                }
                obj = actionbaractivity;
                if (obj1 != null)
                {
                    obj = new ContextThemeWrapper(actionbaractivity, 0);
                    ((Context) (obj)).getTheme().setTo(((android.content.res.Resources.Theme) (obj1)));
                }
            }
        }
        obj = new MenuBuilder(((Context) (obj)));
        ((MenuBuilder) (obj)).setCallback(this);
        panelfeaturestate.setMenu(((MenuBuilder) (obj)));
        return true;
    }

    private void invalidatePanelMenu(int i)
    {
        mInvalidatePanelMenuFeatures = mInvalidatePanelMenuFeatures | 1 << i;
        if (!mInvalidatePanelMenuPosted && mWindowDecor != null)
        {
            ViewCompat.postOnAnimation(mWindowDecor, mInvalidatePanelMenuRunnable);
            mInvalidatePanelMenuPosted = true;
        }
    }

    private void openPanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!panelfeaturestate.isOpen && !isDestroyed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (panelfeaturestate.featureId != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = mActivity;
        boolean flag;
        boolean flag1;
        if ((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L1; else goto _L3
_L3:
        obj = getWindowCallback();
        if (obj != null && !((WindowCallback) (obj)).onMenuOpened(panelfeaturestate.featureId, panelfeaturestate.menu))
        {
            closePanel(panelfeaturestate, true);
            return;
        }
        if (preparePanel(panelfeaturestate, keyevent))
        {
            if (panelfeaturestate.decorView == null || panelfeaturestate.refreshDecorView)
            {
                initializePanelDecor(panelfeaturestate);
            }
            if (initializePanelContent(panelfeaturestate) && panelfeaturestate.hasPanelItems())
            {
                panelfeaturestate.isHandled = false;
                panelfeaturestate.isOpen = true;
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean performPanelShortcut(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent, int j)
    {
        if (!keyevent.isSystem()) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        boolean flag;
label0:
        {
            flag1 = false;
            if (!panelfeaturestate.isPrepared)
            {
                flag = flag1;
                if (!preparePanel(panelfeaturestate, keyevent))
                {
                    break label0;
                }
            }
            flag = flag1;
            if (panelfeaturestate.menu != null)
            {
                flag = panelfeaturestate.menu.performShortcut(i, keyevent, j);
            }
        }
        flag1 = flag;
        if (flag)
        {
            flag1 = flag;
            if ((j & 1) == 0)
            {
                flag1 = flag;
                if (mDecorContentParent == null)
                {
                    closePanel(panelfeaturestate, true);
                    return flag;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean preparePanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!isDestroyed()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        if (panelfeaturestate.isPrepared)
        {
            return true;
        }
        if (mPreparedPanel != null && mPreparedPanel != panelfeaturestate)
        {
            closePanel(mPreparedPanel, false);
        }
        if (panelfeaturestate.featureId == 0 || panelfeaturestate.featureId == 8)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i && mDecorContentParent != null)
        {
            mDecorContentParent.setMenuPrepared();
        }
        if (panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (panelfeaturestate.menu == null && (!initializePanelMenu(panelfeaturestate) || panelfeaturestate.menu == null))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i && mDecorContentParent != null)
        {
            if (mActionMenuPresenterCallback == null)
            {
                mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
            }
            mDecorContentParent.setMenu(panelfeaturestate.menu, mActionMenuPresenterCallback);
        }
        panelfeaturestate.menu.stopDispatchingItemsChanged();
        if (getWindowCallback().onCreatePanelMenu(panelfeaturestate.featureId, panelfeaturestate.menu))
        {
            break; /* Loop/switch isn't completed */
        }
        panelfeaturestate.setMenu(null);
        if (i && mDecorContentParent != null)
        {
            mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        panelfeaturestate.refreshMenuContent = false;
        panelfeaturestate.menu.stopDispatchingItemsChanged();
        if (panelfeaturestate.frozenActionViewState != null)
        {
            panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
            panelfeaturestate.frozenActionViewState = null;
        }
        if (!getWindowCallback().onPreparePanel(0, null, panelfeaturestate.menu))
        {
            if (i && mDecorContentParent != null)
            {
                mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
            }
            panelfeaturestate.menu.startDispatchingItemsChanged();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            i = keyevent.getDeviceId();
        } else
        {
            i = -1;
        }
        if (KeyCharacterMap.load(i).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        panelfeaturestate.qwertyMode = flag;
        panelfeaturestate.menu.setQwertyMode(panelfeaturestate.qwertyMode);
        panelfeaturestate.menu.startDispatchingItemsChanged();
        panelfeaturestate.isPrepared = true;
        panelfeaturestate.isHandled = false;
        mPreparedPanel = panelfeaturestate;
        return true;
    }

    private void reopenMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mActivity)) && !mDecorContentParent.isOverflowMenuShowPending())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        menubuilder = getWindowCallback();
        if (mDecorContentParent.isOverflowMenuShowing() && flag) goto _L2; else goto _L1
_L1:
        if (menubuilder != null && !isDestroyed())
        {
            if (mInvalidatePanelMenuPosted && (mInvalidatePanelMenuFeatures & 1) != 0)
            {
                mWindowDecor.removeCallbacks(mInvalidatePanelMenuRunnable);
                mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState panelfeaturestate = getPanelState(0, true);
            if (panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent && menubuilder.onPreparePanel(0, null, panelfeaturestate.menu))
            {
                menubuilder.onMenuOpened(8, panelfeaturestate.menu);
                mDecorContentParent.showOverflowMenu();
            }
        }
_L4:
        return;
_L2:
        mDecorContentParent.hideOverflowMenu();
        if (isDestroyed()) goto _L4; else goto _L3
_L3:
        menubuilder = getPanelState(0, true);
        mActivity.onPanelClosed(8, ((PanelFeatureState) (menubuilder)).menu);
        return;
        menubuilder = getPanelState(0, true);
        menubuilder.refreshDecorView = true;
        closePanel(menubuilder, false);
        openPanel(menubuilder, null);
        return;
    }

    private int updateStatusGuard(int i)
    {
        boolean flag3 = false;
        boolean flag = false;
        boolean flag4 = false;
        boolean flag2 = flag;
        int j = i;
        if (mActionModeView != null)
        {
            flag2 = flag;
            j = i;
            if (mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)
            {
                Object obj = (android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
                int k = 0;
                j = 0;
                boolean flag1;
                int l;
                if (mActionModeView.isShown())
                {
                    if (mTempRect1 == null)
                    {
                        mTempRect1 = new Rect();
                        mTempRect2 = new Rect();
                    }
                    Rect rect = mTempRect1;
                    Rect rect1 = mTempRect2;
                    rect.set(0, i, 0, 0);
                    ViewUtils.computeFitSystemWindows(mSubDecor, rect, rect1);
                    if (rect1.top == 0)
                    {
                        k = i;
                    } else
                    {
                        k = 0;
                    }
                    if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != k)
                    {
                        k = 1;
                        obj.topMargin = i;
                        if (mStatusGuard == null)
                        {
                            mStatusGuard = new View(mActivity);
                            mStatusGuard.setBackgroundColor(mActivity.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
                            mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
                            j = k;
                        } else
                        {
                            android.view.ViewGroup.LayoutParams layoutparams = mStatusGuard.getLayoutParams();
                            j = k;
                            if (layoutparams.height != i)
                            {
                                layoutparams.height = i;
                                mStatusGuard.setLayoutParams(layoutparams);
                                j = k;
                            }
                        }
                    }
                    if (mStatusGuard != null)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    k = j;
                    flag1 = flag2;
                    l = i;
                    if (!mOverlayActionMode)
                    {
                        k = j;
                        flag1 = flag2;
                        l = i;
                        if (flag2)
                        {
                            l = 0;
                            flag1 = flag2;
                            k = j;
                        }
                    }
                } else
                {
                    flag1 = flag4;
                    l = i;
                    if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
                    {
                        k = 1;
                        obj.topMargin = 0;
                        flag1 = flag4;
                        l = i;
                    }
                }
                flag2 = flag1;
                j = l;
                if (k != 0)
                {
                    mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                    j = l;
                    flag2 = flag1;
                }
            }
        }
        if (mStatusGuard != null)
        {
            obj = mStatusGuard;
            if (flag2)
            {
                i = ((flag3) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
        }
        return j;
    }

    public final void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        ((ViewGroup)mActivity.findViewById(0x1020002)).addView(view, layoutparams);
        view = mActivity;
    }

    public final ActionBar createSupportActionBar()
    {
        ensureSubDecor();
        WindowDecorActionBar windowdecoractionbar = new WindowDecorActionBar(mActivity, mOverlayActionBar);
        windowdecoractionbar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
        return windowdecoractionbar;
    }

    final View createView(String s, Context context, AttributeSet attributeset)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 64
    //                   -1455429095: 166
    //                   -339785223: 118
    //                   776382189: 150
    //                   1601505219: 134
    //                   1666676343: 102;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        byte0;
        JVM INSTR tableswitch 0 4: default 100
    //                   0 182
    //                   1 192
    //                   2 202
    //                   3 212
    //                   4 222;
           goto _L2 _L9 _L10 _L11 _L12 _L13
_L2:
        return null;
_L8:
        if (s.equals("EditText"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (s.equals("Spinner"))
        {
            byte0 = 1;
        }
          goto _L3
_L7:
        if (s.equals("CheckBox"))
        {
            byte0 = 2;
        }
          goto _L3
_L6:
        if (s.equals("RadioButton"))
        {
            byte0 = 3;
        }
          goto _L3
_L4:
        if (s.equals("CheckedTextView"))
        {
            byte0 = 4;
        }
          goto _L3
_L9:
        return new TintEditText(context, attributeset);
_L10:
        return new TintSpinner(context, attributeset);
_L11:
        return new TintCheckBox(context, attributeset);
_L12:
        return new TintRadioButton(context, attributeset);
_L13:
        return new TintCheckedTextView(context, attributeset);
    }

    final int getHomeAsUpIndicatorAttrId()
    {
        return android.support.v7.appcompat.R.attr.homeAsUpIndicator;
    }

    public final boolean onBackPressed()
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        } else
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar == null || !actionbar.collapseActionView())
            {
                return false;
            }
        }
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        if (mHasActionBar && mSubDecorInstalled)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.onConfigurationChanged(configuration);
            }
        }
    }

    final void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            mWindowDecor = (ViewGroup)mActivity.getWindow().getDecorView();
            if (NavUtils.getParentActivityName(mActivity) != null)
            {
                bundle = peekSupportActionBar();
                if (bundle != null)
                {
                    break label0;
                }
                mEnableDefaultActionBarUp = true;
            }
            return;
        }
        bundle.setDefaultDisplayHomeAsUpEnabled(true);
    }

    public final boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i != 0)
        {
            return getWindowCallback().onCreatePanelMenu(i, menu);
        } else
        {
            return false;
        }
    }

    public final View onCreatePanelView(int i)
    {
        Object obj = null;
        View view = null;
        if (mActionMode == null)
        {
            obj = getWindowCallback();
            if (obj != null)
            {
                view = ((WindowCallback) (obj)).onCreatePanelView(i);
            }
            obj = view;
            if (view == null)
            {
                obj = view;
                if (mToolbarListMenuPresenter == null)
                {
                    PanelFeatureState panelfeaturestate = getPanelState(i, true);
                    openPanel(panelfeaturestate, null);
                    obj = view;
                    if (panelfeaturestate.isOpen)
                    {
                        obj = panelfeaturestate.shownPanelView;
                    }
                }
            }
        }
        return ((View) (obj));
    }

    boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return onKeyShortcut(i, keyevent);
    }

    final boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        if (mPreparedPanel == null || !performPanelShortcut(mPreparedPanel, keyevent.getKeyCode(), keyevent, 1)) goto _L2; else goto _L1
_L1:
        if (mPreparedPanel != null)
        {
            mPreparedPanel.isHandled = true;
        }
_L4:
        return true;
_L2:
        boolean flag;
        if (mPreparedPanel != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = getPanelState(0, true);
        preparePanel(panelfeaturestate, keyevent);
        flag = performPanelShortcut(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
        panelfeaturestate.isPrepared = false;
        if (flag) goto _L4; else goto _L3
_L3:
        return false;
    }

    public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        WindowCallback windowcallback = getWindowCallback();
        if (windowcallback != null && !isDestroyed())
        {
            menubuilder = findMenuPanel(menubuilder.getRootMenu());
            if (menubuilder != null)
            {
                return windowcallback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
            }
        }
        return false;
    }

    public final void onMenuModeChange(MenuBuilder menubuilder)
    {
        reopenMenu(menubuilder, true);
    }

    final boolean onMenuOpened(int i, Menu menu)
    {
        if (i == 8)
        {
            menu = getSupportActionBar();
            if (menu != null)
            {
                menu.dispatchMenuVisibilityChanged(true);
            }
            return true;
        } else
        {
            return mActivity.superOnMenuOpened(i, menu);
        }
    }

    public final void onPanelClosed(int i, Menu menu)
    {
        PanelFeatureState panelfeaturestate = getPanelState(i, false);
        if (panelfeaturestate != null)
        {
            closePanel(panelfeaturestate, false);
        }
        if (i == 8)
        {
            menu = getSupportActionBar();
            if (menu != null)
            {
                menu.dispatchMenuVisibilityChanged(false);
            }
        } else
        if (!isDestroyed())
        {
            mActivity.superOnPanelClosed(i, menu);
            return;
        }
    }

    public final void onPostResume()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setShowHideAnimationEnabled(true);
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i != 0)
        {
            return getWindowCallback().onPreparePanel(i, view, menu);
        } else
        {
            return false;
        }
    }

    public final void onStop()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setShowHideAnimationEnabled(false);
        }
    }

    void onSubDecorInstalled()
    {
    }

    public final void onTitleChanged(CharSequence charsequence)
    {
        if (mDecorContentParent != null)
        {
            mDecorContentParent.setWindowTitle(charsequence);
            return;
        }
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setWindowTitle(charsequence);
            return;
        } else
        {
            mTitleToSet = charsequence;
            return;
        }
    }

    public final void setContentView(int i)
    {
        ensureSubDecor();
        Object obj = (ViewGroup)mActivity.findViewById(0x1020002);
        ((ViewGroup) (obj)).removeAllViews();
        mActivity.getLayoutInflater().inflate(i, ((ViewGroup) (obj)));
        obj = mActivity;
    }

    public final void setContentView(View view)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mActivity.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        view = mActivity;
    }

    public final void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mActivity.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        view = mActivity;
    }

    final void setSupportActionBar(Toolbar toolbar)
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar instanceof WindowDecorActionBar)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        if (actionbar instanceof ToolbarActionBar)
        {
            ((ToolbarActionBar)actionbar).setListMenuPresenter(null);
        }
        toolbar = new ToolbarActionBar(toolbar, mActivity.getTitle(), mActivity.getWindow(), mDefaultWindowCallback);
        ensureToolbarListMenuPresenter();
        toolbar.setListMenuPresenter(mToolbarListMenuPresenter);
        setSupportActionBar(((ActionBar) (toolbar)));
        setWindowCallback(toolbar.getWrappedWindowCallback());
        toolbar.invalidateOptionsMenu();
    }

    public final ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        callback = new ActionModeCallbackWrapper(callback);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            mActionMode = actionbar.startActionMode(callback);
            if (mActionMode != null)
            {
                Object obj = mActivity;
                obj = mActionMode;
            }
        }
        if (mActionMode == null)
        {
            mActionMode = startSupportActionModeFromWindow(callback);
        }
        return mActionMode;
    }

    final ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback)
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        Object obj = new ActionModeCallbackWrapper(callback);
        Context context = getActionBarThemedContext();
        if (mActionModeView == null)
        {
            if (mIsFloating)
            {
                mActionModeView = new ActionBarContextView(context);
                mActionModePopup = new PopupWindow(context, null, android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
                mActionModePopup.setContentView(mActionModeView);
                mActionModePopup.setWidth(-1);
                TypedValue typedvalue = new TypedValue();
                mActivity.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, typedvalue, true);
                int i = TypedValue.complexToDimensionPixelSize(typedvalue.data, mActivity.getResources().getDisplayMetrics());
                mActionModeView.setContentHeight(i);
                mActionModePopup.setHeight(-2);
                mShowActionModePopup = new Runnable() {

                    final ActionBarActivityDelegateBase this$0;

                    public final void run()
                    {
                        mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
                    }

            
            {
                this$0 = ActionBarActivityDelegateBase.this;
                super();
            }
                };
            } else
            {
                ViewStubCompat viewstubcompat = (ViewStubCompat)mActivity.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub);
                if (viewstubcompat != null)
                {
                    viewstubcompat.setLayoutInflater(LayoutInflater.from(context));
                    mActionModeView = (ActionBarContextView)viewstubcompat.inflate();
                }
            }
        }
        if (mActionModeView != null)
        {
            mActionModeView.killMode();
            ActionBarContextView actionbarcontextview = mActionModeView;
            boolean flag;
            if (mActionModePopup == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new StandaloneActionMode(context, actionbarcontextview, ((android.support.v7.view.ActionMode.Callback) (obj)), flag);
            if (callback.onCreateActionMode(((ActionMode) (obj)), ((ActionMode) (obj)).getMenu()))
            {
                ((ActionMode) (obj)).invalidate();
                mActionModeView.initForMode(((ActionMode) (obj)));
                mActionModeView.setVisibility(0);
                mActionMode = ((ActionMode) (obj));
                if (mActionModePopup != null)
                {
                    mActivity.getWindow().getDecorView().post(mShowActionModePopup);
                }
                mActionModeView.sendAccessibilityEvent(32);
                if (mActionModeView.getParent() != null)
                {
                    ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
                }
            } else
            {
                mActionMode = null;
            }
        }
        if (mActionMode != null && mActivity != null)
        {
            callback = mActivity;
            callback = mActionMode;
        }
        return mActionMode;
    }

    public final void supportInvalidateOptionsMenu()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null && actionbar.invalidateOptionsMenu())
        {
            return;
        } else
        {
            invalidatePanelMenu(0);
            return;
        }
    }



/*
    static int access$002(ActionBarActivityDelegateBase actionbaractivitydelegatebase, int i)
    {
        actionbaractivitydelegatebase.mInvalidatePanelMenuFeatures = i;
        return i;
    }

*/



/*
    static boolean access$202(ActionBarActivityDelegateBase actionbaractivitydelegatebase, boolean flag)
    {
        actionbaractivitydelegatebase.mInvalidatePanelMenuPosted = flag;
        return flag;
    }

*/





}
