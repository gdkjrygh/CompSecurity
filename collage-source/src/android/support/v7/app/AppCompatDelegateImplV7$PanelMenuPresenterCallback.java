// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

private final class <init>
    implements android.support.v7.view.menu.
{

    final AppCompatDelegateImplV7 this$0;

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
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
            menubuilder = AppCompatDelegateImplV7.access$800(appcompatdelegateimplv7, menubuilder);
            if (menubuilder != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                AppCompatDelegateImplV7.access$900(AppCompatDelegateImplV7.this, ((this._cls0) (menubuilder))., menubuilder, menubuilder1);
                AppCompatDelegateImplV7.access$1000(AppCompatDelegateImplV7.this, menubuilder, true);
            }
            return;
        }
        AppCompatDelegateImplV7.access$1000(AppCompatDelegateImplV7.this, menubuilder, flag);
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (menubuilder == null && mHasActionBar)
        {
            android.view.rCallback rcallback = getWindowCallback();
            if (rcallback != null && !isDestroyed())
            {
                rcallback.(108, menubuilder);
            }
        }
        return true;
    }

    private ()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
