// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            e, h, f

public final class g
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, l.a
{

    f a;
    AlertDialog b;
    e c;
    private l.a d;

    public g(f f1)
    {
        a = f1;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a((h)c.a().getItem(i), null, 0);
    }

    public final void onCloseMenu(f f1, boolean flag)
    {
        if ((flag || f1 == a) && b != null)
        {
            b.dismiss();
        }
        if (d != null)
        {
            d.onCloseMenu(f1, flag);
        }
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        c.onCloseMenu(a, true);
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 82 || i == 4)
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
        return a.performShortcut(i, keyevent, 0);
    }

    public final boolean onOpenSubMenu(f f1)
    {
        if (d != null)
        {
            return d.onOpenSubMenu(f1);
        } else
        {
            return false;
        }
    }
}
