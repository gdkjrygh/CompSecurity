// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.NavUtils;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.internal.app.AppCompatViewInflater;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.DecorContentParent;
import android.support.v7.internal.widget.FitWindowsViewGroup;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplBase, ActionBar, AppCompatCallback

class AppCompatDelegateImplV7 extends AppCompatDelegateImplBase
    implements LayoutInflaterFactory, android.support.v7.internal.view.menu.MenuBuilder.Callback
{
    private class PanelFeatureState
    {
        private static class SavedState
            implements Parcelable
        {

            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final volatile Object createFromParcel(Parcel parcel)
                {
                    return boolean flag = true;
                }

                public final volatile Object[] newArray(int i)
                {
                    return new SavedState[i];
                }

            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            public int describeContents()
            {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                parcel.writeInt(featureId);
                if (isOpen)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel.writeInt(i);
                if (isOpen)
                {
                    parcel.writeBundle(menuState);
                }
            }



/*
            static SavedState access$1100(Parcel parcel)
            {
                boolean flag = true;
                SavedState savedstate = new SavedState();
                savedstate.featureId = parcel.readInt();
                if (parcel.readInt() != 1)
                {
                    flag = false;
                }
                savedstate.isOpen = flag;
                if (savedstate.isOpen)
                {
                    savedstate.menuState = parcel.readBundle();
                }
                return savedstate;
            }

*/

            private SavedState()
            {
            }
        }


        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        int gravity;
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
        int windowAnimations;

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

        PanelFeatureState(int i)
        {
            featureId = i;
            refreshDecorView = false;
        }
    }

    private final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final AppCompatDelegateImplV7 this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            checkCloseActionMenu(menubuilder);
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            android.view.Window.Callback callback = mWindow.getCallback();
            if (callback != null)
            {
                callback.onMenuOpened(8, menubuilder);
            }
            return true;
        }

        private ActionMenuPresenterCallback()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }

        ActionMenuPresenterCallback(byte byte0)
        {
            this();
        }
    }

    final class ActionModeCallbackWrapperV7
        implements android.support.v7.view.ActionMode.Callback
    {

        private android.support.v7.view.ActionMode.Callback mWrapped;
        final AppCompatDelegateImplV7 this$0;

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
            if (mActionModePopup == null) goto _L2; else goto _L1
_L1:
            mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
            mActionModePopup.dismiss();
_L4:
            if (mActionModeView != null)
            {
                mActionModeView.removeAllViews();
            }
            mActionMode = null;
            return;
_L2:
            if (mActionModeView != null)
            {
                mActionModeView.setVisibility(8);
                if (mActionModeView.getParent() != null)
                {
                    ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onPrepareActionMode(actionmode, menu);
        }

        public ActionModeCallbackWrapperV7(android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
            mWrapped = callback;
        }
    }

    private final class ListMenuDecorView extends FrameLayout
    {

        final AppCompatDelegateImplV7 this$0;

        public final boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return AppCompatDelegateImplV7.this.dispatchKeyEvent(keyevent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                int i = (int)motionevent.getX();
                int j = (int)motionevent.getY();
                boolean flag;
                if (i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    motionevent = AppCompatDelegateImplV7.this;
                    motionevent.closePanel(motionevent.getPanelState$5103c037(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionevent);
        }

        public final void setBackgroundResource(int i)
        {
            setBackgroundDrawable(TintManager.getDrawable(getContext(), i));
        }

        public ListMenuDecorView(Context context)
        {
            this$0 = AppCompatDelegateImplV7.this;
            super(context);
        }
    }

    private final class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final AppCompatDelegateImplV7 this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
label0:
            {
                MenuBuilder menubuilder1 = menubuilder.getRootMenu();
                AppCompatDelegateImplV7 appcompatdelegateimplv7;
                boolean flag1;
                if (menubuilder1 != menubuilder)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                appcompatdelegateimplv7 = AppCompatDelegateImplV7.this;
                if (flag1)
                {
                    menubuilder = menubuilder1;
                }
                menubuilder = appcompatdelegateimplv7.findMenuPanel(menubuilder);
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
            closePanel(menubuilder, flag);
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null && mHasActionBar)
            {
                android.view.Window.Callback callback = mWindow.getCallback();
                if (callback != null && !mIsDestroyed)
                {
                    callback.onMenuOpened(8, menubuilder);
                }
            }
            return true;
        }

        private PanelMenuPresenterCallback()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }

        PanelMenuPresenterCallback(byte byte0)
        {
            this();
        }
    }


    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private AppCompatViewInflater mAppCompatViewInflater;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable = new Runnable() {

        final AppCompatDelegateImplV7 this$0;

        public final void run()
        {
            if ((mInvalidatePanelMenuFeatures & 1) != 0)
            {
                PanelFeatureState panelfeaturestate = this.getPanelState$5103c037(<returnValue>);
            }
            if ((mInvalidatePanelMenuFeatures & 0x100) != 0)
            {
                PanelFeatureState panelfeaturestate = this.getPanelState$5103c037(<returnValue>);
            }
            mInvalidatePanelMenuPosted = false;
            mInvalidatePanelMenuFeatures = 0;
        }

            
            {
                this$0 = AppCompatDelegateImplV7.this;
                super();
            }
    };
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState mPanels[];
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private TextView mTitleView;
    private ViewGroup mWindowDecor;

    AppCompatDelegateImplV7(Context context, Window window, AppCompatCallback appcompatcallback)
    {
        super(context, window, appcompatcallback);
    }

    private void ensureSubDecor()
    {
        Object obj;
        if (mSubDecorInstalled)
        {
            break MISSING_BLOCK_LABEL_810;
        }
        obj = LayoutInflater.from(mContext);
        if (mWindowNoTitle) goto _L2; else goto _L1
_L1:
        if (!mIsFloating) goto _L4; else goto _L3
_L3:
        mSubDecor = (ViewGroup)((LayoutInflater) (obj)).inflate(0x7f04000a, null);
        mOverlayActionBar = false;
        mHasActionBar = false;
_L6:
        if (mSubDecor == null)
        {
            throw new IllegalArgumentException("AppCompat does not support the current theme features");
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (mHasActionBar)
        {
            obj = new TypedValue();
            mContext.getTheme().resolveAttribute(0x7f0100ff, ((TypedValue) (obj)), true);
            if (((TypedValue) (obj)).resourceId != 0)
            {
                obj = new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = mContext;
            }
            mSubDecor = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(0x7f040014, null);
            mDecorContentParent = (DecorContentParent)mSubDecor.findViewById(0x7f0d00c9);
            mDecorContentParent.setWindowCallback(super.mWindow.getCallback());
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
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (mOverlayActionMode)
        {
            mSubDecor = (ViewGroup)((LayoutInflater) (obj)).inflate(0x7f040013, null);
        } else
        {
            mSubDecor = (ViewGroup)((LayoutInflater) (obj)).inflate(0x7f040012, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ViewCompat.setOnApplyWindowInsetsListener(mSubDecor, new OnApplyWindowInsetsListener() {

                final AppCompatDelegateImplV7 this$0;

                public final WindowInsetsCompat onApplyWindowInsets(View view1, WindowInsetsCompat windowinsetscompat)
                {
                    int i1 = windowinsetscompat.getSystemWindowInsetTop();
                    int j1 = int k = 1;
                    WindowInsetsCompat windowinsetscompat1 = windowinsetscompat;
                    if (i1 != j1)
                    {
                        windowinsetscompat1 = windowinsetscompat.replaceSystemWindowInsets(windowinsetscompat.getSystemWindowInsetLeft(), j1, windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
                    }
                    return ViewCompat.onApplyWindowInsets(view1, windowinsetscompat1);
                }

            
            {
                this$0 = AppCompatDelegateImplV7.this;
                super();
            }
            });
        } else
        {
            ((FitWindowsViewGroup)mSubDecor).setOnFitSystemWindowsListener(new android.support.v7.internal.widget.FitWindowsViewGroup.OnFitSystemWindowsListener() {

                final AppCompatDelegateImplV7 this$0;

                public final void onFitSystemWindows(Rect rect)
                {
                    rect.top = int k = 1;
                }

            
            {
                this$0 = AppCompatDelegateImplV7.this;
                super();
            }
            });
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (mDecorContentParent == null)
        {
            mTitleView = (TextView)mSubDecor.findViewById(0x7f0d0075);
        }
        ViewUtils.makeOptionalFitsSystemWindows(mSubDecor);
        Object obj1 = (ViewGroup)mWindow.findViewById(0x1020002);
        ContentFrameLayout contentframelayout = (ContentFrameLayout)mSubDecor.findViewById(0x7f0d000c);
        View view;
        for (; ((ViewGroup) (obj1)).getChildCount() > 0; contentframelayout.addView(view))
        {
            view = ((ViewGroup) (obj1)).getChildAt(0);
            ((ViewGroup) (obj1)).removeViewAt(0);
        }

        mWindow.setContentView(mSubDecor);
        ((ViewGroup) (obj1)).setId(-1);
        contentframelayout.setId(0x1020002);
        if (obj1 instanceof FrameLayout)
        {
            ((FrameLayout)obj1).setForeground(null);
        }
        int i;
        int j;
        int k;
        int l;
        if (super.mOriginalWindowCallback instanceof Activity)
        {
            obj1 = ((Activity)super.mOriginalWindowCallback).getTitle();
        } else
        {
            obj1 = super.mTitle;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            onTitleChanged(((CharSequence) (obj1)));
        }
        i = mWindowDecor.getPaddingLeft();
        j = mWindowDecor.getPaddingTop();
        k = mWindowDecor.getPaddingRight();
        l = mWindowDecor.getPaddingBottom();
        contentframelayout.mDecorPadding.set(i, j, k, l);
        if (ViewCompat.isLaidOut(contentframelayout))
        {
            contentframelayout.requestLayout();
        }
        obj1 = mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        if (contentframelayout.mMinWidthMajor == null)
        {
            contentframelayout.mMinWidthMajor = new TypedValue();
        }
        ((TypedArray) (obj1)).getValue(10, contentframelayout.mMinWidthMajor);
        if (contentframelayout.mMinWidthMinor == null)
        {
            contentframelayout.mMinWidthMinor = new TypedValue();
        }
        ((TypedArray) (obj1)).getValue(11, contentframelayout.mMinWidthMinor);
        if (((TypedArray) (obj1)).hasValue(6))
        {
            if (contentframelayout.mFixedWidthMajor == null)
            {
                contentframelayout.mFixedWidthMajor = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(6, contentframelayout.mFixedWidthMajor);
        }
        if (((TypedArray) (obj1)).hasValue(8))
        {
            if (contentframelayout.mFixedWidthMinor == null)
            {
                contentframelayout.mFixedWidthMinor = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(8, contentframelayout.mFixedWidthMinor);
        }
        if (((TypedArray) (obj1)).hasValue(9))
        {
            if (contentframelayout.mFixedHeightMajor == null)
            {
                contentframelayout.mFixedHeightMajor = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(9, contentframelayout.mFixedHeightMajor);
        }
        if (((TypedArray) (obj1)).hasValue(7))
        {
            if (contentframelayout.mFixedHeightMinor == null)
            {
                contentframelayout.mFixedHeightMinor = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(7, contentframelayout.mFixedHeightMinor);
        }
        ((TypedArray) (obj1)).recycle();
        contentframelayout.requestLayout();
        mSubDecorInstalled = true;
        obj1 = getPanelState$5103c037(0);
        if (!super.mIsDestroyed && (obj1 == null || ((PanelFeatureState) (obj1)).menu == null))
        {
            invalidatePanelMenu(8);
        }
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
        if (!panelfeaturestate.isOpen && !super.mIsDestroyed) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (panelfeaturestate.featureId != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = mContext;
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
        WindowManager windowmanager;
        obj = super.mWindow.getCallback();
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(panelfeaturestate.featureId, panelfeaturestate.menu))
        {
            closePanel(panelfeaturestate, true);
            return;
        }
        windowmanager = (WindowManager)mContext.getSystemService("window");
        if (windowmanager == null || !preparePanel(panelfeaturestate, keyevent)) goto _L1; else goto _L4
_L4:
        byte byte0;
        byte0 = -2;
        if (panelfeaturestate.decorView != null && !panelfeaturestate.refreshDecorView)
        {
            break MISSING_BLOCK_LABEL_754;
        }
        if (panelfeaturestate.decorView != null) goto _L6; else goto _L5
_L5:
        int i;
        Object obj1 = getActionBarThemedContext();
        TypedValue typedvalue = new TypedValue();
        keyevent = ((Context) (obj1)).getResources().newTheme();
        keyevent.setTo(((Context) (obj1)).getTheme());
        keyevent.resolveAttribute(0x7f0100fc, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        }
        keyevent.resolveAttribute(0x7f01013a, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        } else
        {
            keyevent.applyStyle(0x7f1101a1, true);
        }
        obj1 = new ContextThemeWrapper(((Context) (obj1)), 0);
        ((Context) (obj1)).getTheme().setTo(keyevent);
        panelfeaturestate.listPresenterContext = ((Context) (obj1));
        keyevent = ((Context) (obj1)).obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        panelfeaturestate.background = keyevent.getResourceId(77, 0);
        panelfeaturestate.windowAnimations = keyevent.getResourceId(1, 0);
        keyevent.recycle();
        panelfeaturestate.decorView = new ListMenuDecorView(panelfeaturestate.listPresenterContext);
        panelfeaturestate.gravity = 81;
        if (panelfeaturestate.decorView == null) goto _L1; else goto _L7
_L7:
        if (panelfeaturestate.createdPanelView != null)
        {
            panelfeaturestate.shownPanelView = panelfeaturestate.createdPanelView;
            i = 1;
        } else
        {
label0:
            {
                if (panelfeaturestate.menu == null)
                {
                    break label0;
                }
                if (mPanelMenuPresenterCallback == null)
                {
                    mPanelMenuPresenterCallback = new PanelMenuPresenterCallback((byte)0);
                }
                keyevent = mPanelMenuPresenterCallback;
                if (panelfeaturestate.menu == null)
                {
                    keyevent = null;
                } else
                {
                    if (panelfeaturestate.listMenuPresenter == null)
                    {
                        panelfeaturestate.listMenuPresenter = new ListMenuPresenter(panelfeaturestate.listPresenterContext, 0x7f04000e);
                        panelfeaturestate.listMenuPresenter.mCallback = keyevent;
                        panelfeaturestate.menu.addMenuPresenter(panelfeaturestate.listMenuPresenter);
                    }
                    keyevent = panelfeaturestate.listMenuPresenter.getMenuView(panelfeaturestate.decorView);
                }
                panelfeaturestate.shownPanelView = (View)keyevent;
                if (panelfeaturestate.shownPanelView == null)
                {
                    break label0;
                }
                i = 1;
            }
        }
_L14:
        if (i == 0) goto _L1; else goto _L8
_L8:
        if (panelfeaturestate.shownPanelView == null) goto _L10; else goto _L9
_L9:
        if (panelfeaturestate.createdPanelView == null) goto _L12; else goto _L11
_L11:
        i = 1;
_L16:
        if (i == 0) goto _L1; else goto _L13
_L13:
        obj1 = panelfeaturestate.shownPanelView.getLayoutParams();
        keyevent = ((KeyEvent) (obj1));
        if (obj1 == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        i = panelfeaturestate.background;
        panelfeaturestate.decorView.setBackgroundResource(i);
        obj1 = panelfeaturestate.shownPanelView.getParent();
        if (obj1 != null && (obj1 instanceof ViewGroup))
        {
            ((ViewGroup)obj1).removeView(panelfeaturestate.shownPanelView);
        }
        panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, keyevent);
        i = byte0;
        if (!panelfeaturestate.shownPanelView.hasFocus())
        {
            panelfeaturestate.shownPanelView.requestFocus();
            i = byte0;
        }
_L17:
        panelfeaturestate.isHandled = false;
        keyevent = new android.view.WindowManager.LayoutParams(i, -2, 0, 0, 1002, 0x820000, -3);
        keyevent.gravity = panelfeaturestate.gravity;
        keyevent.windowAnimations = panelfeaturestate.windowAnimations;
        windowmanager.addView(panelfeaturestate.decorView, keyevent);
        panelfeaturestate.isOpen = true;
        return;
_L6:
        if (panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
        {
            panelfeaturestate.decorView.removeAllViews();
        }
          goto _L7
        i = 0;
          goto _L14
_L12:
        if (panelfeaturestate.listMenuPresenter.getAdapter().getCount() <= 0) goto _L10; else goto _L15
_L15:
        i = 1;
          goto _L16
_L10:
        i = 0;
          goto _L16
        i = byte0;
        if (panelfeaturestate.createdPanelView != null)
        {
            keyevent = panelfeaturestate.createdPanelView.getLayoutParams();
            i = byte0;
            if (keyevent != null)
            {
                i = byte0;
                if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1)
                {
                    i = -1;
                }
            }
        }
          goto _L17
    }

    private boolean performPanelShortcut$1f243752(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent)
    {
        while (keyevent.isSystem() || !panelfeaturestate.isPrepared && !preparePanel(panelfeaturestate, keyevent) || panelfeaturestate.menu == null) 
        {
            return false;
        }
        return panelfeaturestate.menu.performShortcut(i, keyevent, 1);
    }

    private boolean preparePanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!super.mIsDestroyed) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Context context;
        android.view.Window.Callback callback;
        int i;
        if (panelfeaturestate.isPrepared)
        {
            return true;
        }
        if (mPreparedPanel != null && mPreparedPanel != panelfeaturestate)
        {
            closePanel(mPreparedPanel, false);
        }
        callback = super.mWindow.getCallback();
        if (callback != null)
        {
            panelfeaturestate.createdPanelView = callback.onCreatePanelView(panelfeaturestate.featureId);
        }
        android.content.res.Resources.Theme theme;
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
        if (panelfeaturestate.createdPanelView != null) goto _L4; else goto _L3
_L3:
        if (panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.menu != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = mContext;
        if (panelfeaturestate.featureId != 0 && panelfeaturestate.featureId != 8 || mDecorContentParent == null)
        {
            break MISSING_BLOCK_LABEL_634;
        }
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(0x7f0100ff, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(0x7f010100, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(0x7f010100, typedvalue, true);
            obj = null;
        }
        theme = ((android.content.res.Resources.Theme) (obj));
        if (typedvalue.resourceId != 0)
        {
            theme = ((android.content.res.Resources.Theme) (obj));
            if (obj == null)
            {
                theme = context.getResources().newTheme();
                theme.setTo(theme1);
            }
            theme.applyStyle(typedvalue.resourceId, true);
        }
        if (theme == null)
        {
            break MISSING_BLOCK_LABEL_634;
        }
        obj = new ContextThemeWrapper(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L8:
        obj = new MenuBuilder(((Context) (obj)));
        ((MenuBuilder) (obj)).setCallback(this);
        panelfeaturestate.setMenu(((MenuBuilder) (obj)));
        if (panelfeaturestate.menu == null) goto _L1; else goto _L7
_L7:
label0:
        {
            if (i && mDecorContentParent != null)
            {
                if (mActionMenuPresenterCallback == null)
                {
                    mActionMenuPresenterCallback = new ActionMenuPresenterCallback((byte)0);
                }
                mDecorContentParent.setMenu(panelfeaturestate.menu, mActionMenuPresenterCallback);
            }
            panelfeaturestate.menu.stopDispatchingItemsChanged();
            if (callback.onCreatePanelMenu(panelfeaturestate.featureId, panelfeaturestate.menu))
            {
                break label0;
            }
            panelfeaturestate.setMenu(null);
            if (i && mDecorContentParent != null)
            {
                mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
                return false;
            }
        }
          goto _L1
        panelfeaturestate.refreshMenuContent = false;
_L6:
        panelfeaturestate.menu.stopDispatchingItemsChanged();
        if (panelfeaturestate.frozenActionViewState != null)
        {
            panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
            panelfeaturestate.frozenActionViewState = null;
        }
        if (!callback.onPreparePanel(0, panelfeaturestate.createdPanelView, panelfeaturestate.menu))
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
_L4:
        panelfeaturestate.isPrepared = true;
        panelfeaturestate.isHandled = false;
        mPreparedPanel = panelfeaturestate;
        return true;
        obj = context;
          goto _L8
    }

    public final void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        ((ViewGroup)mSubDecor.findViewById(0x1020002)).addView(view, layoutparams);
        mOriginalWindowCallback.onContentChanged();
    }

    View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        if (mOriginalWindowCallback instanceof android.view.LayoutInflater.Factory)
        {
            view = ((android.view.LayoutInflater.Factory)mOriginalWindowCallback).onCreateView(s, context, attributeset);
            if (view != null)
            {
                return view;
            }
        }
        return null;
    }

    final void callOnPanelClosed(int i, PanelFeatureState panelfeaturestate, Menu menu)
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
        if (panelfeaturestate2 == null || panelfeaturestate2.isOpen)
        {
            if ((panelfeaturestate = super.mWindow.getCallback()) != null)
            {
                panelfeaturestate.onPanelClosed(i, ((Menu) (obj)));
                return;
            }
        }
    }

    final void checkCloseActionMenu(MenuBuilder menubuilder)
    {
        if (mClosingActionMenu)
        {
            return;
        }
        mClosingActionMenu = true;
        mDecorContentParent.dismissPopups();
        android.view.Window.Callback callback = super.mWindow.getCallback();
        if (callback != null && !super.mIsDestroyed)
        {
            callback.onPanelClosed(8, menubuilder);
        }
        mClosingActionMenu = false;
    }

    final void closePanel(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.featureId == 0 && mDecorContentParent != null && mDecorContentParent.isOverflowMenuShowing())
        {
            checkCloseActionMenu(panelfeaturestate.menu);
        } else
        {
            boolean flag1 = panelfeaturestate.isOpen;
            WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
            if (windowmanager != null && flag1 && panelfeaturestate.decorView != null)
            {
                windowmanager.removeView(panelfeaturestate.decorView);
            }
            panelfeaturestate.isPrepared = false;
            panelfeaturestate.isHandled = false;
            panelfeaturestate.isOpen = false;
            if (flag1 && flag)
            {
                callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, null);
            }
            panelfeaturestate.shownPanelView = null;
            panelfeaturestate.refreshDecorView = true;
            if (mPreparedPanel == panelfeaturestate)
            {
                mPreparedPanel = null;
                return;
            }
        }
    }

    public final ActionBar createSupportActionBar()
    {
        WindowDecorActionBar windowdecoractionbar;
        ensureSubDecor();
        windowdecoractionbar = null;
        if (!(mOriginalWindowCallback instanceof Activity)) goto _L2; else goto _L1
_L1:
        windowdecoractionbar = new WindowDecorActionBar((Activity)mOriginalWindowCallback, mOverlayActionBar);
_L4:
        if (windowdecoractionbar != null)
        {
            windowdecoractionbar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
        }
        return windowdecoractionbar;
_L2:
        if (mOriginalWindowCallback instanceof Dialog)
        {
            windowdecoractionbar = new WindowDecorActionBar((Dialog)mOriginalWindowCallback);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        int i;
        i = keyevent.getKeyCode();
        boolean flag;
        if (keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            switch (i)
            {
            default:
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    return onKeyShortcut(i, keyevent);
                } else
                {
                    return false;
                }

            case 82: // 'R'
                break;
            }
            if (keyevent.getRepeatCount() == 0)
            {
                PanelFeatureState panelfeaturestate = getPanelState$5103c037(0);
                if (!panelfeaturestate.isOpen)
                {
                    preparePanel(panelfeaturestate, keyevent);
                }
            }
            return true;
        }
        i;
        JVM INSTR lookupswitch 2: default 120
    //                   4: 336
    //                   82: 122;
           goto _L1 _L2 _L3
_L1:
        return false;
_L3:
        if (mActionMode != null) goto _L5; else goto _L4
_L4:
        PanelFeatureState panelfeaturestate1 = getPanelState$5103c037(0);
        boolean flag2;
        if (mDecorContentParent != null && mDecorContentParent.canShowOverflowMenu() && !ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mContext)))
        {
            if (!mDecorContentParent.isOverflowMenuShowing())
            {
                if (super.mIsDestroyed || !preparePanel(panelfeaturestate1, keyevent))
                {
                    break MISSING_BLOCK_LABEL_409;
                }
                flag2 = mDecorContentParent.showOverflowMenu();
            } else
            {
                flag2 = mDecorContentParent.hideOverflowMenu();
            }
        } else
        if (panelfeaturestate1.isOpen || panelfeaturestate1.isHandled)
        {
            flag2 = panelfeaturestate1.isOpen;
            closePanel(panelfeaturestate1, true);
        } else
        {
            if (!panelfeaturestate1.isPrepared)
            {
                break MISSING_BLOCK_LABEL_409;
            }
            boolean flag1;
            if (panelfeaturestate1.refreshMenuContent)
            {
                panelfeaturestate1.isPrepared = false;
                flag2 = preparePanel(panelfeaturestate1, keyevent);
            } else
            {
                flag2 = true;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_409;
            }
            openPanel(panelfeaturestate1, keyevent);
            flag2 = true;
        }
_L6:
        if (flag2)
        {
            keyevent = (AudioManager)mContext.getSystemService("audio");
            if (keyevent != null)
            {
                keyevent.playSoundEffect(0);
            } else
            {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
_L5:
        return true;
_L2:
        keyevent = getPanelState$5103c037(0);
        if (keyevent != null && ((PanelFeatureState) (keyevent)).isOpen)
        {
            closePanel(keyevent, true);
            return true;
        }
        if (mActionMode != null)
        {
            mActionMode.finish();
            flag1 = true;
        } else
        {
            keyevent = getSupportActionBar();
            if (keyevent != null && keyevent.collapseActionView())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            return true;
        }
          goto _L1
        flag2 = false;
          goto _L6
    }

    final PanelFeatureState findMenuPanel(Menu menu)
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

    final PanelFeatureState getPanelState$5103c037(int i)
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

    public final void installViewFactory()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(mContext);
        if (layoutinflater.getFactory() == null)
        {
            LayoutInflaterCompat.setFactory(layoutinflater, this);
            return;
        } else
        {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
            return;
        }
    }

    public final void invalidateOptionsMenu()
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

    public final void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            mWindowDecor = (ViewGroup)mWindow.getDecorView();
            if ((mOriginalWindowCallback instanceof Activity) && NavUtils.getParentActivityName((Activity)mOriginalWindowCallback) != null)
            {
                bundle = super.mActionBar;
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

    public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        boolean flag = false;
        Object obj = callActivityOnCreateView(view, s, context, attributeset);
        if (obj != null)
        {
            return ((View) (obj));
        }
        byte byte0;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mAppCompatViewInflater == null)
        {
            mAppCompatViewInflater = new AppCompatViewInflater();
        }
        if (flag1 && mSubDecorInstalled && view != null && view.getId() != 0x1020002 && !ViewCompat.isAttachedToWindow(view))
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        obj = mAppCompatViewInflater;
        if (byte0 != 0 && view != null)
        {
            view = view.getContext();
        } else
        {
            view = context;
        }
        view = AppCompatViewInflater.themifyContext(view, attributeset, flag1, true);
        s.hashCode();
        JVM INSTR lookupswitch 10: default 212
    //                   -1946472170: 413
    //                   -1455429095: 364
    //                   -1346021293: 396
    //                   -938935918: 447
    //                   -339785223: 316
    //                   776382189: 348
    //                   1413872058: 380
    //                   1601505219: 332
    //                   1666676343: 299
    //                   2001146706: 430;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        byte0 = -1;
_L13:
        switch (byte0)
        {
        default:
            if (context != view)
            {
                return ((AppCompatViewInflater) (obj)).createViewFromTag(view, s, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new AppCompatEditText(view, attributeset);

        case 1: // '\001'
            return new AppCompatSpinner(view, attributeset);

        case 2: // '\002'
            return new AppCompatCheckBox(view, attributeset);

        case 3: // '\003'
            return new AppCompatRadioButton(view, attributeset);

        case 4: // '\004'
            return new AppCompatCheckedTextView(view, attributeset);

        case 5: // '\005'
            return new AppCompatAutoCompleteTextView(view, attributeset);

        case 6: // '\006'
            return new AppCompatMultiAutoCompleteTextView(view, attributeset);

        case 7: // '\007'
            return new AppCompatRatingBar(view, attributeset);

        case 8: // '\b'
            return new AppCompatButton(view, attributeset);

        case 9: // '\t'
            return new AppCompatTextView(view, attributeset);
        }
_L10:
        if (!s.equals("EditText")) goto _L1; else goto _L12
_L12:
        byte0 = flag;
          goto _L13
_L6:
        if (!s.equals("Spinner")) goto _L1; else goto _L14
_L14:
        byte0 = 1;
          goto _L13
_L9:
        if (!s.equals("CheckBox")) goto _L1; else goto _L15
_L15:
        byte0 = 2;
          goto _L13
_L7:
        if (!s.equals("RadioButton")) goto _L1; else goto _L16
_L16:
        byte0 = 3;
          goto _L13
_L3:
        if (!s.equals("CheckedTextView")) goto _L1; else goto _L17
_L17:
        byte0 = 4;
          goto _L13
_L8:
        if (!s.equals("AutoCompleteTextView")) goto _L1; else goto _L18
_L18:
        byte0 = 5;
          goto _L13
_L4:
        if (!s.equals("MultiAutoCompleteTextView")) goto _L1; else goto _L19
_L19:
        byte0 = 6;
          goto _L13
_L2:
        if (!s.equals("RatingBar")) goto _L1; else goto _L20
_L20:
        byte0 = 7;
          goto _L13
_L11:
        if (!s.equals("Button")) goto _L1; else goto _L21
_L21:
        byte0 = 8;
          goto _L13
_L5:
        if (!s.equals("TextView")) goto _L1; else goto _L22
_L22:
        byte0 = 9;
          goto _L13
    }

    final boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar == null || !actionbar.onKeyShortcut(i, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (mPreparedPanel == null || !performPanelShortcut$1f243752(mPreparedPanel, keyevent.getKeyCode(), keyevent))
        {
            break; /* Loop/switch isn't completed */
        }
        if (mPreparedPanel != null)
        {
            mPreparedPanel.isHandled = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (mPreparedPanel != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = getPanelState$5103c037(0);
        preparePanel(panelfeaturestate, keyevent);
        flag = performPanelShortcut$1f243752(panelfeaturestate, keyevent.getKeyCode(), keyevent);
        panelfeaturestate.isPrepared = false;
        if (flag) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.mWindow.getCallback();
        if (callback != null && !super.mIsDestroyed)
        {
            menubuilder = findMenuPanel(menubuilder.getRootMenu());
            if (menubuilder != null)
            {
                return callback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
            }
        }
        return false;
    }

    public final void onMenuModeChange(MenuBuilder menubuilder)
    {
        if (mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mContext)) && !mDecorContentParent.isOverflowMenuShowPending())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        menubuilder = super.mWindow.getCallback();
        if (mDecorContentParent.isOverflowMenuShowing()) goto _L2; else goto _L1
_L1:
        if (menubuilder != null && !super.mIsDestroyed)
        {
            if (mInvalidatePanelMenuPosted && (mInvalidatePanelMenuFeatures & 1) != 0)
            {
                mWindowDecor.removeCallbacks(mInvalidatePanelMenuRunnable);
                mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState panelfeaturestate = getPanelState$5103c037(0);
            if (panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent && menubuilder.onPreparePanel(0, panelfeaturestate.createdPanelView, panelfeaturestate.menu))
            {
                menubuilder.onMenuOpened(8, panelfeaturestate.menu);
                mDecorContentParent.showOverflowMenu();
            }
        }
_L4:
        return;
_L2:
        mDecorContentParent.hideOverflowMenu();
        if (super.mIsDestroyed) goto _L4; else goto _L3
_L3:
        menubuilder.onPanelClosed(8, getPanelState$5103c037(0).menu);
        return;
        menubuilder = getPanelState$5103c037(0);
        menubuilder.refreshDecorView = true;
        closePanel(menubuilder, false);
        openPanel(menubuilder, null);
        return;
    }

    final boolean onMenuOpened$2fef5512(int i)
    {
        if (i == 8)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.dispatchMenuVisibilityChanged(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    final boolean onPanelClosed$2fef5512(int i)
    {
        boolean flag1 = false;
        boolean flag;
        if (i == 8)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.dispatchMenuVisibilityChanged(false);
            }
            flag = true;
        } else
        {
            flag = flag1;
            if (i == 0)
            {
                PanelFeatureState panelfeaturestate = getPanelState$5103c037(i);
                flag = flag1;
                if (panelfeaturestate.isOpen)
                {
                    closePanel(panelfeaturestate, false);
                    return false;
                }
            }
        }
        return flag;
    }

    public final void onPostCreate$79e5e33f()
    {
        ensureSubDecor();
    }

    public final void onPostResume()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setShowHideAnimationEnabled(true);
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

    final void onTitleChanged(CharSequence charsequence)
    {
        if (mDecorContentParent != null)
        {
            mDecorContentParent.setWindowTitle(charsequence);
        } else
        {
            if (super.mActionBar != null)
            {
                super.mActionBar.setWindowTitle(charsequence);
                return;
            }
            if (mTitleView != null)
            {
                mTitleView.setText(charsequence);
                return;
            }
        }
    }

    public final boolean requestWindowFeature(int i)
    {
        if (mSubDecorInstalled)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            mWindowNoTitle = true;
            return true;
        }
    }

    public final void setContentView(int i)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(mContext).inflate(i, viewgroup);
        mOriginalWindowCallback.onContentChanged();
    }

    public final void setContentView(View view)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        mOriginalWindowCallback.onContentChanged();
    }

    public final void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        mOriginalWindowCallback.onContentChanged();
    }

    public final void setSupportActionBar(Toolbar toolbar)
    {
        if (!(mOriginalWindowCallback instanceof Activity))
        {
            return;
        }
        if (getSupportActionBar() instanceof WindowDecorActionBar)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            toolbar = new ToolbarActionBar(toolbar, ((Activity)mContext).getTitle(), mWindow);
            super.mActionBar = toolbar;
            mWindow.setCallback(((ToolbarActionBar) (toolbar)).mWindowCallback);
            toolbar.invalidateOptionsMenu();
            return;
        }
    }


/*
    static void access$100(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i)
    {
        PanelFeatureState panelfeaturestate = appcompatdelegateimplv7.getPanelState$5103c037(i);
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
        if ((i == 8 || i == 0) && appcompatdelegateimplv7.mDecorContentParent != null)
        {
            PanelFeatureState panelfeaturestate1 = appcompatdelegateimplv7.getPanelState$5103c037(0);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.isPrepared = false;
                appcompatdelegateimplv7.preparePanel(panelfeaturestate1, null);
            }
        }
        return;
    }

*/


/*
    static int access$300(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i)
    {
        int k = 1;
        boolean flag = true;
        boolean flag1 = false;
        int j;
        if (appcompatdelegateimplv7.mActionModeView != null && (appcompatdelegateimplv7.mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)appcompatdelegateimplv7.mActionModeView.getLayoutParams();
            if (appcompatdelegateimplv7.mActionModeView.isShown())
            {
                if (appcompatdelegateimplv7.mTempRect1 == null)
                {
                    appcompatdelegateimplv7.mTempRect1 = new Rect();
                    appcompatdelegateimplv7.mTempRect2 = new Rect();
                }
                Rect rect = appcompatdelegateimplv7.mTempRect1;
                Rect rect1 = appcompatdelegateimplv7.mTempRect2;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(appcompatdelegateimplv7.mSubDecor, rect, rect1);
                if (rect1.top == 0)
                {
                    j = i;
                } else
                {
                    j = 0;
                }
                if (marginlayoutparams.topMargin != j)
                {
                    marginlayoutparams.topMargin = i;
                    if (appcompatdelegateimplv7.mStatusGuard == null)
                    {
                        appcompatdelegateimplv7.mStatusGuard = new View(appcompatdelegateimplv7.mContext);
                        appcompatdelegateimplv7.mStatusGuard.setBackgroundColor(appcompatdelegateimplv7.mContext.getResources().getColor(0x7f0b0000));
                        appcompatdelegateimplv7.mSubDecor.addView(appcompatdelegateimplv7.mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
                        j = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = appcompatdelegateimplv7.mStatusGuard.getLayoutParams();
                        if (layoutparams.height != i)
                        {
                            layoutparams.height = i;
                            appcompatdelegateimplv7.mStatusGuard.setLayoutParams(layoutparams);
                        }
                        j = 1;
                    }
                } else
                {
                    j = 0;
                }
                if (appcompatdelegateimplv7.mStatusGuard == null)
                {
                    flag = false;
                }
                k = i;
                if (!appcompatdelegateimplv7.mOverlayActionMode)
                {
                    k = i;
                    if (flag)
                    {
                        k = 0;
                    }
                }
                i = k;
                k = j;
                j = ((flag) ? 1 : 0);
            } else
            if (marginlayoutparams.topMargin != 0)
            {
                marginlayoutparams.topMargin = 0;
                j = 0;
            } else
            {
                k = 0;
                j = 0;
            }
            if (k != 0)
            {
                appcompatdelegateimplv7.mActionModeView.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            j = 0;
        }
        if (appcompatdelegateimplv7.mStatusGuard != null)
        {
            appcompatdelegateimplv7 = appcompatdelegateimplv7.mStatusGuard;
            if (j != 0)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 8;
            }
            appcompatdelegateimplv7.setVisibility(j);
        }
        return i;
    }

*/

    // Unreferenced inner class android/support/v7/app/AppCompatDelegateImplV7$4

/* anonymous class */
    final class _cls4
        implements Runnable
    {

        final AppCompatDelegateImplV7 this$0;

        public final void run()
        {
            mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
        }

            
            {
                this$0 = AppCompatDelegateImplV7.this;
                super();
            }
    }

}
