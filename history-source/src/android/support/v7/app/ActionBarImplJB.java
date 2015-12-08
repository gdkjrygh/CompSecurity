// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.app:
//            ActionBarImplICS

public class ActionBarImplJB extends ActionBarImplICS
{

    public ActionBarImplJB(Activity activity, ActionBar.Callback callback)
    {
        super(activity, callback, false);
    }

    public volatile void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        super.addOnMenuVisibilityListener(onmenuvisibilitylistener);
    }

    public volatile void addTab(ActionBar.Tab tab)
    {
        super.addTab(tab);
    }

    public volatile void addTab(ActionBar.Tab tab, int i)
    {
        super.addTab(tab, i);
    }

    public volatile void addTab(ActionBar.Tab tab, int i, boolean flag)
    {
        super.addTab(tab, i, flag);
    }

    public volatile void addTab(ActionBar.Tab tab, boolean flag)
    {
        super.addTab(tab, flag);
    }

    public volatile View getCustomView()
    {
        return super.getCustomView();
    }

    public volatile int getDisplayOptions()
    {
        return super.getDisplayOptions();
    }

    public volatile int getHeight()
    {
        return super.getHeight();
    }

    public volatile int getNavigationItemCount()
    {
        return super.getNavigationItemCount();
    }

    public volatile int getNavigationMode()
    {
        return super.getNavigationMode();
    }

    public volatile int getSelectedNavigationIndex()
    {
        return super.getSelectedNavigationIndex();
    }

    public volatile ActionBar.Tab getSelectedTab()
    {
        return super.getSelectedTab();
    }

    public volatile CharSequence getSubtitle()
    {
        return super.getSubtitle();
    }

    public volatile ActionBar.Tab getTabAt(int i)
    {
        return super.getTabAt(i);
    }

    public volatile int getTabCount()
    {
        return super.getTabCount();
    }

    public volatile Context getThemedContext()
    {
        return super.getThemedContext();
    }

    public volatile CharSequence getTitle()
    {
        return super.getTitle();
    }

    public volatile void hide()
    {
        super.hide();
    }

    public volatile boolean isShowing()
    {
        return super.isShowing();
    }

    public volatile ActionBar.Tab newTab()
    {
        return super.newTab();
    }

    public volatile void removeAllTabs()
    {
        super.removeAllTabs();
    }

    public volatile void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        super.removeOnMenuVisibilityListener(onmenuvisibilitylistener);
    }

    public volatile void removeTab(ActionBar.Tab tab)
    {
        super.removeTab(tab);
    }

    public volatile void removeTabAt(int i)
    {
        super.removeTabAt(i);
    }

    public volatile void selectTab(ActionBar.Tab tab)
    {
        super.selectTab(tab);
    }

    public volatile void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
    }

    public volatile void setCustomView(int i)
    {
        super.setCustomView(i);
    }

    public volatile void setCustomView(View view)
    {
        super.setCustomView(view);
    }

    public volatile void setCustomView(View view, ActionBar.LayoutParams layoutparams)
    {
        super.setCustomView(view, layoutparams);
    }

    public volatile void setDisplayHomeAsUpEnabled(boolean flag)
    {
        super.setDisplayHomeAsUpEnabled(flag);
    }

    public volatile void setDisplayOptions(int i)
    {
        super.setDisplayOptions(i);
    }

    public volatile void setDisplayOptions(int i, int j)
    {
        super.setDisplayOptions(i, j);
    }

    public volatile void setDisplayShowCustomEnabled(boolean flag)
    {
        super.setDisplayShowCustomEnabled(flag);
    }

    public volatile void setDisplayShowHomeEnabled(boolean flag)
    {
        super.setDisplayShowHomeEnabled(flag);
    }

    public volatile void setDisplayShowTitleEnabled(boolean flag)
    {
        super.setDisplayShowTitleEnabled(flag);
    }

    public volatile void setDisplayUseLogoEnabled(boolean flag)
    {
        super.setDisplayUseLogoEnabled(flag);
    }

    public volatile void setHomeAsUpIndicator(int i)
    {
        super.setHomeAsUpIndicator(i);
    }

    public volatile void setHomeAsUpIndicator(Drawable drawable)
    {
        super.setHomeAsUpIndicator(drawable);
    }

    public volatile void setHomeButtonEnabled(boolean flag)
    {
        super.setHomeButtonEnabled(flag);
    }

    public volatile void setIcon(int i)
    {
        super.setIcon(i);
    }

    public volatile void setIcon(Drawable drawable)
    {
        super.setIcon(drawable);
    }

    public volatile void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
    {
        super.setListNavigationCallbacks(spinneradapter, onnavigationlistener);
    }

    public volatile void setLogo(int i)
    {
        super.setLogo(i);
    }

    public volatile void setLogo(Drawable drawable)
    {
        super.setLogo(drawable);
    }

    public volatile void setNavigationMode(int i)
    {
        super.setNavigationMode(i);
    }

    public volatile void setSelectedNavigationItem(int i)
    {
        super.setSelectedNavigationItem(i);
    }

    public volatile void setSplitBackgroundDrawable(Drawable drawable)
    {
        super.setSplitBackgroundDrawable(drawable);
    }

    public volatile void setStackedBackgroundDrawable(Drawable drawable)
    {
        super.setStackedBackgroundDrawable(drawable);
    }

    public volatile void setSubtitle(int i)
    {
        super.setSubtitle(i);
    }

    public volatile void setSubtitle(CharSequence charsequence)
    {
        super.setSubtitle(charsequence);
    }

    public volatile void setTitle(int i)
    {
        super.setTitle(i);
    }

    public volatile void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
    }

    public volatile void show()
    {
        super.show();
    }
}
