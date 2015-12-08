// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.f;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplBase

class this._cls0 extends WindowCallbackWrapper
{

    final AppCompatDelegateImplBase this$0;

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return AppCompatDelegateImplBase.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyShortcutEvent(keyevent) || onKeyShortcut(keyevent.getKeyCode(), keyevent);
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0 && !(menu instanceof f))
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return super.onMenuOpened(i, menu) || AppCompatDelegateImplBase.this.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        super.onPanelClosed(i, menu);
        AppCompatDelegateImplBase.this.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        f f1;
        boolean flag;
        if (menu instanceof f)
        {
            f1 = (f)menu;
        } else
        {
            f1 = null;
        }
        if (i == 0 && f1 == null)
        {
            flag = false;
        } else
        {
            if (f1 != null)
            {
                f1.k = true;
            }
            boolean flag1 = super.onPreparePanel(i, view, menu);
            flag = flag1;
            if (f1 != null)
            {
                f1.k = false;
                return flag1;
            }
        }
        return flag;
    }

    (android.view.lbackBase lbackbase)
    {
        this$0 = AppCompatDelegateImplBase.this;
        super(lbackbase);
    }
}
