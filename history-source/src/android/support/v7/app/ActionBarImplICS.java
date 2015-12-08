// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar

class ActionBarImplICS extends android.support.v7.app.ActionBar
{
    static class OnMenuVisibilityListenerWrapper
        implements android.app.ActionBar.OnMenuVisibilityListener
    {

        final ActionBar.OnMenuVisibilityListener mWrappedListener;

        public void onMenuVisibilityChanged(boolean flag)
        {
            mWrappedListener.onMenuVisibilityChanged(flag);
        }

        public OnMenuVisibilityListenerWrapper(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
        {
            mWrappedListener = onmenuvisibilitylistener;
        }
    }

    static class OnNavigationListenerWrapper
        implements android.app.ActionBar.OnNavigationListener
    {

        private final ActionBar.OnNavigationListener mWrappedListener;

        public boolean onNavigationItemSelected(int i, long l)
        {
            return mWrappedListener.onNavigationItemSelected(i, l);
        }

        public OnNavigationListenerWrapper(ActionBar.OnNavigationListener onnavigationlistener)
        {
            mWrappedListener = onnavigationlistener;
        }
    }

    class TabWrapper extends ActionBar.Tab
        implements android.app.ActionBar.TabListener
    {

        private CharSequence mContentDescription;
        private ActionBar.TabListener mTabListener;
        private Object mTag;
        final android.app.ActionBar.Tab mWrappedTab;
        final ActionBarImplICS this$0;

        public CharSequence getContentDescription()
        {
            return mContentDescription;
        }

        public View getCustomView()
        {
            return mWrappedTab.getCustomView();
        }

        public Drawable getIcon()
        {
            return mWrappedTab.getIcon();
        }

        public int getPosition()
        {
            return mWrappedTab.getPosition();
        }

        public Object getTag()
        {
            return mTag;
        }

        public CharSequence getText()
        {
            return mWrappedTab.getText();
        }

        public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            ActionBar.TabListener tablistener = mTabListener;
            if (fragmenttransaction != null)
            {
                tab = getActiveTransaction();
            } else
            {
                tab = null;
            }
            tablistener.onTabReselected(this, tab);
            commitActiveTransaction();
        }

        public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            ActionBar.TabListener tablistener = mTabListener;
            if (fragmenttransaction != null)
            {
                tab = getActiveTransaction();
            } else
            {
                tab = null;
            }
            tablistener.onTabSelected(this, tab);
            commitActiveTransaction();
        }

        public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            ActionBar.TabListener tablistener = mTabListener;
            if (fragmenttransaction != null)
            {
                tab = getActiveTransaction();
            } else
            {
                tab = null;
            }
            tablistener.onTabUnselected(this, tab);
        }

        public void select()
        {
            mWrappedTab.select();
        }

        public ActionBar.Tab setContentDescription(int i)
        {
            mContentDescription = mActivity.getText(i);
            return this;
        }

        public ActionBar.Tab setContentDescription(CharSequence charsequence)
        {
            mContentDescription = charsequence;
            return this;
        }

        public ActionBar.Tab setCustomView(int i)
        {
            mWrappedTab.setCustomView(i);
            return this;
        }

        public ActionBar.Tab setCustomView(View view)
        {
            mWrappedTab.setCustomView(view);
            return this;
        }

        public ActionBar.Tab setIcon(int i)
        {
            mWrappedTab.setIcon(i);
            return this;
        }

        public ActionBar.Tab setIcon(Drawable drawable)
        {
            mWrappedTab.setIcon(drawable);
            return this;
        }

        public ActionBar.Tab setTabListener(ActionBar.TabListener tablistener)
        {
            mTabListener = tablistener;
            android.app.ActionBar.Tab tab = mWrappedTab;
            if (tablistener != null)
            {
                tablistener = this;
            } else
            {
                tablistener = null;
            }
            tab.setTabListener(tablistener);
            return this;
        }

        public ActionBar.Tab setTag(Object obj)
        {
            mTag = obj;
            return this;
        }

        public ActionBar.Tab setText(int i)
        {
            mWrappedTab.setText(i);
            return this;
        }

        public ActionBar.Tab setText(CharSequence charsequence)
        {
            mWrappedTab.setText(charsequence);
            return this;
        }

        public TabWrapper(android.app.ActionBar.Tab tab)
        {
            this$0 = ActionBarImplICS.this;
            super();
            mWrappedTab = tab;
        }
    }


    final ActionBar mActionBar;
    FragmentTransaction mActiveTransaction;
    final Activity mActivity;
    private ArrayList mAddedMenuVisWrappers;
    final ActionBar.Callback mCallback;
    private ImageView mHomeActionView;

    public ActionBarImplICS(Activity activity, ActionBar.Callback callback)
    {
        this(activity, callback, true);
    }

    ActionBarImplICS(Activity activity, ActionBar.Callback callback, boolean flag)
    {
        mAddedMenuVisWrappers = new ArrayList();
        mActivity = activity;
        mCallback = callback;
        mActionBar = activity.getActionBar();
        if (flag && (getDisplayOptions() & 4) != 0)
        {
            setHomeButtonEnabled(true);
        }
    }

    private OnMenuVisibilityListenerWrapper findAndRemoveMenuVisWrapper(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        int i = 0;
_L2:
        OnMenuVisibilityListenerWrapper onmenuvisibilitylistenerwrapper;
        int j;
        if (i >= mAddedMenuVisWrappers.size())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        onmenuvisibilitylistenerwrapper = (OnMenuVisibilityListenerWrapper)((WeakReference)mAddedMenuVisWrappers.get(i)).get();
        if (onmenuvisibilitylistenerwrapper != null)
        {
            break; /* Loop/switch isn't completed */
        }
        mAddedMenuVisWrappers.remove(i);
        j = i - 1;
_L4:
        i = j + 1;
        if (true) goto _L2; else goto _L1
_L1:
        j = i;
        if (onmenuvisibilitylistenerwrapper.mWrappedListener != onmenuvisibilitylistener) goto _L4; else goto _L3
_L3:
        mAddedMenuVisWrappers.remove(i);
        return onmenuvisibilitylistenerwrapper;
        return null;
    }

    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        if (onmenuvisibilitylistener != null)
        {
            onmenuvisibilitylistener = new OnMenuVisibilityListenerWrapper(onmenuvisibilitylistener);
            mAddedMenuVisWrappers.add(new WeakReference(onmenuvisibilitylistener));
            mActionBar.addOnMenuVisibilityListener(onmenuvisibilitylistener);
        }
    }

    public void addTab(ActionBar.Tab tab)
    {
        mActionBar.addTab(((TabWrapper)tab).mWrappedTab);
    }

    public void addTab(ActionBar.Tab tab, int i)
    {
        mActionBar.addTab(((TabWrapper)tab).mWrappedTab, i);
    }

    public void addTab(ActionBar.Tab tab, int i, boolean flag)
    {
        mActionBar.addTab(((TabWrapper)tab).mWrappedTab, i, flag);
    }

    public void addTab(ActionBar.Tab tab, boolean flag)
    {
        mActionBar.addTab(((TabWrapper)tab).mWrappedTab, flag);
    }

    void commitActiveTransaction()
    {
        if (mActiveTransaction != null && !mActiveTransaction.isEmpty())
        {
            mActiveTransaction.commit();
        }
        mActiveTransaction = null;
    }

    FragmentTransaction getActiveTransaction()
    {
        if (mActiveTransaction == null)
        {
            mActiveTransaction = mCallback.getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        }
        return mActiveTransaction;
    }

    public View getCustomView()
    {
        return mActionBar.getCustomView();
    }

    public int getDisplayOptions()
    {
        return mActionBar.getDisplayOptions();
    }

    public int getHeight()
    {
        return mActionBar.getHeight();
    }

    ImageView getHomeActionView()
    {
        View view;
        if (mHomeActionView != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        view = mActivity.findViewById(0x102002c);
        if (view != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return null;
_L2:
        if (((ViewGroup) (obj = (ViewGroup)view.getParent())).getChildCount() != 2) goto _L1; else goto _L3
_L3:
        View view1 = ((ViewGroup) (obj)).getChildAt(0);
        obj = ((ViewGroup) (obj)).getChildAt(1);
        if (view1.getId() == 0x102002c)
        {
            view1 = ((View) (obj));
        }
        if (view1 instanceof ImageView)
        {
            mHomeActionView = (ImageView)view1;
        }
        return mHomeActionView;
    }

    public int getNavigationItemCount()
    {
        return mActionBar.getNavigationItemCount();
    }

    public int getNavigationMode()
    {
        return mActionBar.getNavigationMode();
    }

    public int getSelectedNavigationIndex()
    {
        return mActionBar.getSelectedNavigationIndex();
    }

    public ActionBar.Tab getSelectedTab()
    {
        return (ActionBar.Tab)mActionBar.getSelectedTab().getTag();
    }

    public CharSequence getSubtitle()
    {
        return mActionBar.getSubtitle();
    }

    public ActionBar.Tab getTabAt(int i)
    {
        return (ActionBar.Tab)mActionBar.getTabAt(i).getTag();
    }

    public int getTabCount()
    {
        return mActionBar.getTabCount();
    }

    Drawable getThemeDefaultUpIndicator()
    {
        TypedArray typedarray = mActivity.obtainStyledAttributes(new int[] {
            0x101030b
        });
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        return drawable;
    }

    public Context getThemedContext()
    {
        return mActionBar.getThemedContext();
    }

    public CharSequence getTitle()
    {
        return mActionBar.getTitle();
    }

    public void hide()
    {
        mActionBar.hide();
    }

    public boolean isShowing()
    {
        return mActionBar.isShowing();
    }

    public ActionBar.Tab newTab()
    {
        android.app.ActionBar.Tab tab = mActionBar.newTab();
        TabWrapper tabwrapper = new TabWrapper(tab);
        tab.setTag(tabwrapper);
        return tabwrapper;
    }

    public void removeAllTabs()
    {
        mActionBar.removeAllTabs();
    }

    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        onmenuvisibilitylistener = findAndRemoveMenuVisWrapper(onmenuvisibilitylistener);
        mActionBar.removeOnMenuVisibilityListener(onmenuvisibilitylistener);
    }

    public void removeTab(ActionBar.Tab tab)
    {
        mActionBar.removeTab(((TabWrapper)tab).mWrappedTab);
    }

    public void removeTabAt(int i)
    {
        mActionBar.removeTabAt(i);
    }

    public void selectTab(ActionBar.Tab tab)
    {
        mActionBar.selectTab(((TabWrapper)tab).mWrappedTab);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mActionBar.setBackgroundDrawable(drawable);
    }

    public void setCustomView(int i)
    {
        mActionBar.setCustomView(i);
    }

    public void setCustomView(View view)
    {
        mActionBar.setCustomView(view);
    }

    public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
    {
        android.app.ActionBar.LayoutParams layoutparams1 = new android.app.ActionBar.LayoutParams(layoutparams);
        layoutparams1.gravity = layoutparams.gravity;
        mActionBar.setCustomView(view, layoutparams1);
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        mActionBar.setDisplayHomeAsUpEnabled(flag);
    }

    public void setDisplayOptions(int i)
    {
        mActionBar.setDisplayOptions(i);
    }

    public void setDisplayOptions(int i, int j)
    {
        mActionBar.setDisplayOptions(i, j);
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
        mActionBar.setDisplayShowCustomEnabled(flag);
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
        mActionBar.setDisplayShowHomeEnabled(flag);
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
        mActionBar.setDisplayShowTitleEnabled(flag);
    }

    public void setDisplayUseLogoEnabled(boolean flag)
    {
        mActionBar.setDisplayUseLogoEnabled(flag);
    }

    public void setHomeAsUpIndicator(int i)
    {
        ImageView imageview;
label0:
        {
            imageview = getHomeActionView();
            if (imageview != null)
            {
                if (i == 0)
                {
                    break label0;
                }
                imageview.setImageResource(i);
            }
            return;
        }
        imageview.setImageDrawable(getThemeDefaultUpIndicator());
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        ImageView imageview = getHomeActionView();
        if (imageview != null)
        {
            Drawable drawable1 = drawable;
            if (drawable == null)
            {
                drawable1 = getThemeDefaultUpIndicator();
            }
            imageview.setImageDrawable(drawable1);
        }
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        mActionBar.setHomeButtonEnabled(flag);
    }

    public void setIcon(int i)
    {
        mActionBar.setIcon(i);
    }

    public void setIcon(Drawable drawable)
    {
        mActionBar.setIcon(drawable);
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
    {
        ActionBar actionbar = mActionBar;
        if (onnavigationlistener != null)
        {
            onnavigationlistener = new OnNavigationListenerWrapper(onnavigationlistener);
        } else
        {
            onnavigationlistener = null;
        }
        actionbar.setListNavigationCallbacks(spinneradapter, onnavigationlistener);
    }

    public void setLogo(int i)
    {
        mActionBar.setLogo(i);
    }

    public void setLogo(Drawable drawable)
    {
        mActionBar.setLogo(drawable);
    }

    public void setNavigationMode(int i)
    {
        mActionBar.setNavigationMode(i);
    }

    public void setSelectedNavigationItem(int i)
    {
        mActionBar.setSelectedNavigationItem(i);
    }

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
        mActionBar.setSplitBackgroundDrawable(drawable);
    }

    public void setStackedBackgroundDrawable(Drawable drawable)
    {
        mActionBar.setStackedBackgroundDrawable(drawable);
    }

    public void setSubtitle(int i)
    {
        mActionBar.setSubtitle(i);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mActionBar.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        mActionBar.setTitle(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionBar.setTitle(charsequence);
    }

    public void show()
    {
        mActionBar.show();
    }
}
