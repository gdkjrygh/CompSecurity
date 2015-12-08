// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

public interface DecorToolbar
{

    public abstract void animateToVisibility(int i);

    public abstract boolean canShowOverflowMenu();

    public abstract void collapseActionView();

    public abstract void dismissPopupMenus();

    public abstract Context getContext();

    public abstract int getDisplayOptions();

    public abstract Menu getMenu();

    public abstract int getNavigationMode();

    public abstract CharSequence getTitle();

    public abstract ViewGroup getViewGroup();

    public abstract boolean hasExpandedActionView();

    public abstract boolean hideOverflowMenu();

    public abstract void initIndeterminateProgress();

    public abstract void initProgress();

    public abstract boolean isOverflowMenuShowPending();

    public abstract boolean isOverflowMenuShowing();

    public abstract boolean isSplit();

    public abstract void setCollapsible(boolean flag);

    public abstract void setDisplayOptions(int i);

    public abstract void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview);

    public abstract void setHomeButtonEnabled(boolean flag);

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    public abstract void setLogo(int i);

    public abstract void setMenu(Menu menu, android.support.v7.internal.view.menu.MenuPresenter.Callback callback);

    public abstract void setMenuCallbacks(android.support.v7.internal.view.menu.MenuPresenter.Callback callback, android.support.v7.internal.view.menu.MenuBuilder.Callback callback1);

    public abstract void setMenuPrepared();

    public abstract void setNavigationContentDescription(int i);

    public abstract void setNavigationIcon(Drawable drawable);

    public abstract void setTitle(CharSequence charsequence);

    public abstract void setVisibility(int i);

    public abstract void setWindowCallback(android.view.Window.Callback callback);

    public abstract void setWindowTitle(CharSequence charsequence);

    public abstract boolean showOverflowMenu();
}
