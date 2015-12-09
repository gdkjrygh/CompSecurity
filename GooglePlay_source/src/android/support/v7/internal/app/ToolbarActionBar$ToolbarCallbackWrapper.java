// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class this._cls0 extends WindowCallbackWrapper
{

    final ToolbarActionBar this$0;

    public final View onCreatePanelView(int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 26;
           goto _L1 _L2
_L1:
        Menu menu;
        return super.onCreatePanelView(i);
_L2:
        if (onPreparePanel(i, null, menu = mDecorToolbar.getMenu()) && onMenuOpened(i, menu))
        {
            ToolbarActionBar toolbaractionbar = ToolbarActionBar.this;
            if (toolbaractionbar.mListMenuPresenter == null && (menu instanceof MenuBuilder))
            {
                MenuBuilder menubuilder = (MenuBuilder)menu;
                Object obj = toolbaractionbar.mDecorToolbar.getContext();
                TypedValue typedvalue = new TypedValue();
                android.content.res.backWrapper backwrapper = ((Context) (obj)).getResources().newTheme();
                backwrapper.ar(((Context) (obj)).getTheme());
                backwrapper.ar(0x7f01013a, typedvalue, true);
                if (typedvalue.resourceId != 0)
                {
                    backwrapper.ar(typedvalue.resourceId, true);
                } else
                {
                    backwrapper.ar(0x7f1101a1, true);
                }
                obj = new ContextThemeWrapper(((Context) (obj)), 0);
                ((Context) (obj)).getTheme().ar(backwrapper);
                toolbaractionbar.mListMenuPresenter = new ListMenuPresenter(((Context) (obj)), 0x7f04000e);
                toolbaractionbar.mListMenuPresenter.mCallback = new ack(toolbaractionbar, (byte)0);
                menubuilder.addMenuPresenter(toolbaractionbar.mListMenuPresenter);
            }
            if (menu == null || toolbaractionbar.mListMenuPresenter == null)
            {
                return null;
            }
            if (toolbaractionbar.mListMenuPresenter.getAdapter().getCount() > 0)
            {
                return (View)toolbaractionbar.mListMenuPresenter.getMenuView(toolbaractionbar.mDecorToolbar.getViewGroup());
            } else
            {
                return null;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean onPreparePanel(int i, View view, Menu menu)
    {
        boolean flag = super.onPreparePanel(i, view, menu);
        if (flag && !mToolbarMenuPrepared)
        {
            mDecorToolbar.setMenuPrepared();
            mToolbarMenuPrepared = true;
        }
        return flag;
    }

    public ack(android.view.barCallbackWrapper barcallbackwrapper)
    {
        this$0 = ToolbarActionBar.this;
        super(barcallbackwrapper);
    }
}
