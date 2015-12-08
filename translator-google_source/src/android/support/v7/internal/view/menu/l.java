// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.support.v7.app.m;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            w, g, m, i

public final class l
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, w
{

    i a;
    m b;
    g c;
    private w d;

    public l(i j)
    {
        a = j;
    }

    public final void a(i j, boolean flag)
    {
        if ((flag || j == a) && b != null)
        {
            b.dismiss();
        }
        if (d != null)
        {
            d.a(j, flag);
        }
    }

    public final boolean a_(i j)
    {
        if (d != null)
        {
            return d.a_(j);
        } else
        {
            return false;
        }
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        a.a((android.support.v7.internal.view.menu.m)c.b().getItem(j), null, 0);
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        c.a(a, true);
    }

    public final boolean onKey(DialogInterface dialoginterface, int j, KeyEvent keyevent)
    {
        if (j == 82 || j == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                dialoginterface = b.getWindow();
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
                Object obj = b.getWindow();
                if (obj != null)
                {
                    obj = ((Window) (obj)).getDecorView();
                    if (obj != null)
                    {
                        obj = ((View) (obj)).getKeyDispatcherState();
                        if (obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
                        {
                            a.a(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return a.performShortcut(j, keyevent, 0);
    }
}
