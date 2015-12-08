// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.support.v7.a.i;
import android.support.v7.app.k;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            y, i, g, m

public final class l
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, y
{

    g a;
    private android.support.v7.internal.view.menu.i b;
    private k c;
    private y d;

    public l(android.support.v7.internal.view.menu.i j)
    {
        b = j;
    }

    public final void a()
    {
        Object obj = b;
        android.support.v7.app.l l1 = new android.support.v7.app.l(((android.support.v7.internal.view.menu.i) (obj)).e());
        a = new g(l1.a(), i.j);
        a.a(this);
        b.a(a);
        l1.a(a.a(), this);
        View view = ((android.support.v7.internal.view.menu.i) (obj)).c;
        if (view != null)
        {
            l1.a(view);
        } else
        {
            l1.a(((android.support.v7.internal.view.menu.i) (obj)).b).a(((android.support.v7.internal.view.menu.i) (obj)).a);
        }
        l1.a(this);
        c = l1.b();
        c.setOnDismissListener(this);
        obj = c.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        c.show();
    }

    public final void a(android.support.v7.internal.view.menu.i j, boolean flag)
    {
        if ((flag || j == b) && c != null)
        {
            c.dismiss();
        }
        if (d != null)
        {
            d.a(j, flag);
        }
    }

    public final boolean a(android.support.v7.internal.view.menu.i j)
    {
        if (d != null)
        {
            return d.a(j);
        } else
        {
            return false;
        }
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        b.b((m)a.a().getItem(j));
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.a(b, true);
    }

    public final boolean onKey(DialogInterface dialoginterface, int j, KeyEvent keyevent)
    {
        if (j == 82 || j == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                dialoginterface = c.getWindow();
                if (dialoginterface != null)
                {
                    dialoginterface = dialoginterface.getDecorView();
                    if (dialoginterface != null)
                    {
                        dialoginterface = dialoginterface.getKeyDispatcherState();
                        if (dialoginterface != null)
                        {
                            dialoginterface.startTracking(keyevent, this);
                            return true;
                        }
                    }
                }
            } else
            if (keyevent.getAction() == 1 && !keyevent.isCanceled())
            {
                Object obj = c.getWindow();
                if (obj != null)
                {
                    obj = ((Window) (obj)).getDecorView();
                    if (obj != null)
                    {
                        obj = ((View) (obj)).getKeyDispatcherState();
                        if (obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
                        {
                            b.a(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return b.performShortcut(j, keyevent, 0);
    }
}
