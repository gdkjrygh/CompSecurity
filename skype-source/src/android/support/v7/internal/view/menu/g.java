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
//            f, e, h

public final class g
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, l.a
{

    e a;
    private f b;
    private AlertDialog c;
    private l.a d;

    public g(f f1)
    {
        b = f1;
    }

    public final void a()
    {
        Object obj = b;
        android.support.v7.app.AlertDialog.a a1 = new android.support.v7.app.AlertDialog.a(((f) (obj)).e());
        a = new e(a1.a(), android.support.v7.appcompat.a.h.abc_list_menu_item_layout);
        a.a(this);
        b.a(a);
        a1.a(a.c(), this);
        View view = ((f) (obj)).c;
        if (view != null)
        {
            a1.a(view);
        } else
        {
            a1.a(((f) (obj)).b).a(((f) (obj)).a);
        }
        a1.a(this);
        c = a1.c();
        c.setOnDismissListener(this);
        obj = c.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        c.show();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        b.b((h)a.c().getItem(i));
    }

    public final void onCloseMenu(f f1, boolean flag)
    {
        if ((flag || f1 == b) && c != null)
        {
            c.dismiss();
        }
        if (d != null)
        {
            d.onCloseMenu(f1, flag);
        }
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.a(b, true);
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 82 || i == 4)
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
        return b.performShortcut(i, keyevent, 0);
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
