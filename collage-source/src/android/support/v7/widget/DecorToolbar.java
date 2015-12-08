// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            ScrollingTabContainerView

public interface DecorToolbar
{

    public abstract void animateToVisibility(int i);

    public abstract boolean canShowOverflowMenu();

    public abstract void collapseActionView();

    public abstract void dismissPopupMenus();

    public abstract Context getContext();

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public abstract int getDropdownItemCount();

    public abstract int getDropdownSelectedPosition();

    public abstract int getHeight();

    public abstract Menu getMenu();

    public abstract int getNavigationMode();

    public abstract CharSequence getSubtitle();

    public abstract CharSequence getTitle();

    public abstract ViewGroup getViewGroup();

    public abstract int getVisibility();

    public abstract boolean hasEmbeddedTabs();

    public abstract boolean hasExpandedActionView();

    public abstract boolean hasIcon();

    public abstract boolean hasLogo();

    public abstract boolean hideOverflowMenu();

    public abstract void initIndeterminateProgress();

    public abstract void initProgress();

    public abstract boolean isOverflowMenuShowPending();

    public abstract boolean isOverflowMenuShowing();

    public abstract boolean isTitleTruncated();

    public abstract void restoreHierarchyState(SparseArray sparsearray);

    public abstract void saveHierarchyState(SparseArray sparsearray);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCollapsible(boolean flag);

    public abstract void setCustomView(View view);

    public abstract void setDefaultNavigationContentDescription(int i);

    public abstract void setDefaultNavigationIcon(Drawable drawable);

    public abstract void setDisplayOptions(int i);

    public abstract void setDropdownParams(SpinnerAdapter spinneradapter, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener);

    public abstract void setDropdownSelectedPosition(int i);

    public abstract void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview);

    public abstract void setHomeButtonEnabled(boolean flag);

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    public abstract void setLogo(int i);

    public abstract void setLogo(Drawable drawable);

    public abstract void setMenu(Menu menu, android.support.v7.view.menu.MenuPresenter.Callback callback);

    public abstract void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1);

    public abstract void setMenuPrepared();

    public abstract void setNavigationContentDescription(int i);

    public abstract void setNavigationContentDescription(CharSequence charsequence);

    public abstract void setNavigationIcon(int i);

    public abstract void setNavigationIcon(Drawable drawable);

    public abstract void setNavigationMode(int i);

    public abstract void setSubtitle(CharSequence charsequence);

    public abstract void setTitle(CharSequence charsequence);

    public abstract void setVisibility(int i);

    public abstract void setWindowCallback(android.view.Window.Callback callback);

    public abstract void setWindowTitle(CharSequence charsequence);

    public abstract ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long l);

    public abstract boolean showOverflowMenu();
}
