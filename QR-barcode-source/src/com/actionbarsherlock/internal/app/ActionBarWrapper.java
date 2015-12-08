// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.SpinnerAdapter;
import com.actionbarsherlock.app.ActionBar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ActionBarWrapper extends ActionBar
    implements android.app.ActionBar.OnNavigationListener, android.app.ActionBar.OnMenuVisibilityListener
{
    public class TabWrapper extends com.actionbarsherlock.app.ActionBar.Tab
        implements android.app.ActionBar.TabListener
    {

        private com.actionbarsherlock.app.ActionBar.TabListener mListener;
        final android.app.ActionBar.Tab mNativeTab;
        private Object mTag;
        final ActionBarWrapper this$0;

        public CharSequence getContentDescription()
        {
            return mNativeTab.getContentDescription();
        }

        public View getCustomView()
        {
            return mNativeTab.getCustomView();
        }

        public Drawable getIcon()
        {
            return mNativeTab.getIcon();
        }

        public int getPosition()
        {
            return mNativeTab.getPosition();
        }

        public Object getTag()
        {
            return mTag;
        }

        public CharSequence getText()
        {
            return mNativeTab.getText();
        }

        public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            if (mListener != null)
            {
                tab = null;
                if (mActivity instanceof FragmentActivity)
                {
                    tab = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                }
                mListener.onTabReselected(this, tab);
                if (tab != null && !tab.isEmpty())
                {
                    tab.commit();
                }
            }
        }

        public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            if (mListener != null)
            {
                if (mFragmentTransaction == null && (mActivity instanceof FragmentActivity))
                {
                    mFragmentTransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                }
                mListener.onTabSelected(this, mFragmentTransaction);
                if (mFragmentTransaction != null)
                {
                    if (!mFragmentTransaction.isEmpty())
                    {
                        mFragmentTransaction.commit();
                    }
                    mFragmentTransaction = null;
                }
            }
        }

        public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            if (mListener != null)
            {
                tab = null;
                if (mActivity instanceof FragmentActivity)
                {
                    tab = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                    mFragmentTransaction = tab;
                }
                mListener.onTabUnselected(this, tab);
            }
        }

        public void select()
        {
            mNativeTab.select();
        }

        public com.actionbarsherlock.app.ActionBar.Tab setContentDescription(int i)
        {
            mNativeTab.setContentDescription(i);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setContentDescription(CharSequence charsequence)
        {
            mNativeTab.setContentDescription(charsequence);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setCustomView(int i)
        {
            mNativeTab.setCustomView(i);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setCustomView(View view)
        {
            mNativeTab.setCustomView(view);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(int i)
        {
            mNativeTab.setIcon(i);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(Drawable drawable)
        {
            mNativeTab.setIcon(drawable);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setTabListener(com.actionbarsherlock.app.ActionBar.TabListener tablistener)
        {
            android.app.ActionBar.Tab tab = mNativeTab;
            TabWrapper tabwrapper;
            if (tablistener != null)
            {
                tabwrapper = this;
            } else
            {
                tabwrapper = null;
            }
            tab.setTabListener(tabwrapper);
            mListener = tablistener;
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setTag(Object obj)
        {
            mTag = obj;
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setText(int i)
        {
            mNativeTab.setText(i);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setText(CharSequence charsequence)
        {
            mNativeTab.setText(charsequence);
            return this;
        }

        public TabWrapper(android.app.ActionBar.Tab tab)
        {
            this$0 = ActionBarWrapper.this;
            super();
            mNativeTab = tab;
            mNativeTab.setTag(this);
        }
    }


    private final android.app.ActionBar mActionBar;
    private final Activity mActivity;
    private FragmentTransaction mFragmentTransaction;
    private Set mMenuVisibilityListeners;
    private com.actionbarsherlock.app.ActionBar.OnNavigationListener mNavigationListener;

    public ActionBarWrapper(Activity activity)
    {
        boolean flag = true;
        super();
        mMenuVisibilityListeners = new HashSet(1);
        mActivity = activity;
        mActionBar = activity.getActionBar();
        if (mActionBar != null)
        {
            mActionBar.addOnMenuVisibilityListener(this);
            int i = mActionBar.getDisplayOptions();
            activity = mActionBar;
            if ((i & 4) == 0)
            {
                flag = false;
            }
            activity.setHomeButtonEnabled(flag);
        }
    }

    public void addOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        mActionBar.addTab(((TabWrapper)tab).mNativeTab);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, int i)
    {
        mActionBar.addTab(((TabWrapper)tab).mNativeTab, i);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, int i, boolean flag)
    {
        mActionBar.addTab(((TabWrapper)tab).mNativeTab, i, flag);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, boolean flag)
    {
        mActionBar.addTab(((TabWrapper)tab).mNativeTab, flag);
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

    public com.actionbarsherlock.app.ActionBar.Tab getSelectedTab()
    {
        android.app.ActionBar.Tab tab = mActionBar.getSelectedTab();
        if (tab != null)
        {
            return (com.actionbarsherlock.app.ActionBar.Tab)tab.getTag();
        } else
        {
            return null;
        }
    }

    public CharSequence getSubtitle()
    {
        return mActionBar.getSubtitle();
    }

    public com.actionbarsherlock.app.ActionBar.Tab getTabAt(int i)
    {
        android.app.ActionBar.Tab tab = mActionBar.getTabAt(i);
        if (tab != null)
        {
            return (com.actionbarsherlock.app.ActionBar.Tab)tab.getTag();
        } else
        {
            return null;
        }
    }

    public int getTabCount()
    {
        return mActionBar.getTabCount();
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

    public com.actionbarsherlock.app.ActionBar.Tab newTab()
    {
        return new TabWrapper(mActionBar.newTab());
    }

    public void onMenuVisibilityChanged(boolean flag)
    {
        Iterator iterator = mMenuVisibilityListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener)iterator.next()).onMenuVisibilityChanged(flag);
        } while (true);
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        return mNavigationListener.onNavigationItemSelected(i, l);
    }

    public void removeAllTabs()
    {
        mActionBar.removeAllTabs();
    }

    public void removeOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void removeTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        mActionBar.removeTab(((TabWrapper)tab).mNativeTab);
    }

    public void removeTabAt(int i)
    {
        mActionBar.removeTabAt(i);
    }

    public void selectTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        mActionBar.selectTab(((TabWrapper)tab).mNativeTab);
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

    public void setCustomView(View view, com.actionbarsherlock.app.ActionBar.LayoutParams layoutparams)
    {
        android.app.ActionBar.LayoutParams layoutparams1 = new android.app.ActionBar.LayoutParams(layoutparams);
        layoutparams1.gravity = layoutparams.gravity;
        layoutparams1.bottomMargin = layoutparams.bottomMargin;
        layoutparams1.topMargin = layoutparams.topMargin;
        layoutparams1.leftMargin = layoutparams.leftMargin;
        layoutparams1.rightMargin = layoutparams.rightMargin;
        mActionBar.setCustomView(view, layoutparams1);
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        mActionBar.setDisplayHomeAsUpEnabled(flag);
    }

    public void setDisplayOptions(int i)
    {
        mActionBar.setDisplayOptions(i);
        android.app.ActionBar actionbar = mActionBar;
        boolean flag;
        if ((i & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        actionbar.setHomeButtonEnabled(flag);
    }

    public void setDisplayOptions(int i, int j)
    {
        mActionBar.setDisplayOptions(i, j);
        if ((j & 4) != 0)
        {
            android.app.ActionBar actionbar = mActionBar;
            boolean flag;
            if ((i & 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            actionbar.setHomeButtonEnabled(flag);
        }
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

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, com.actionbarsherlock.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
        mNavigationListener = onnavigationlistener;
        android.app.ActionBar actionbar = mActionBar;
        if (onnavigationlistener != null)
        {
            onnavigationlistener = this;
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
