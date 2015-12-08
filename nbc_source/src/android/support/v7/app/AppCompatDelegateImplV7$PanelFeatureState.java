// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

private static final class refreshDecorView
{

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
    int x;
    int y;

    MenuView getListMenuView(android.support.v7.internal.view.menu.w w)
    {
        if (menu == null)
        {
            return null;
        }
        if (listMenuPresenter == null)
        {
            listMenuPresenter = new ListMenuPresenter(listPresenterContext, android.support.v7.appcompat.esenterContext);
            listMenuPresenter.setCallback(w);
            menu.addMenuPresenter(listMenuPresenter);
        }
        return listMenuPresenter.getMenuView(decorView);
    }

    public boolean hasPanelItems()
    {
        boolean flag1 = true;
        boolean flag;
        if (shownPanelView == null)
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (createdPanelView == null)
            {
                flag = flag1;
                if (listMenuPresenter.getAdapter().getCount() <= 0)
                {
                    return false;
                }
            }
        }
        return flag;
    }

    void setMenu(MenuBuilder menubuilder)
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

    void setStyle(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        android.content.res.te te = context.getResources().newTheme();
        te.te(context.getTheme());
        te.te(android.support.v7.appcompat.nuPresenter, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        }
        te.te(android.support.v7.appcompat.nuPresenter, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        } else
        {
            te.te(android.support.v7.appcompat.nuPresenter, true);
        }
        context = new ContextThemeWrapper(context, 0);
        context.getTheme().nu(te);
        listPresenterContext = context;
        context = context.obtainStyledAttributes(android.support.v7.appcompat.esenterContext);
        background = context.getResourceId(android.support.v7.appcompat.ound, 0);
        windowAnimations = context.getResourceId(android.support.v7.appcompat.tyle, 0);
        context.recycle();
    }

    (int i)
    {
        featureId = i;
        refreshDecorView = false;
    }
}
