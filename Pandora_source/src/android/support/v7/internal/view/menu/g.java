// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, e, h

public class g
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, l.a
{

    private f a;
    e b;
    private AlertDialog c;
    private l.a d;

    public g(f f1)
    {
        a = f1;
    }

    public void a()
    {
        if (c != null)
        {
            c.dismiss();
        }
    }

    public void a(IBinder ibinder)
    {
        Object obj = a;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((f) (obj)).e());
        b = new e(android.support.v7.appcompat.R.layout.abc_list_menu_item_layout, android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu_Dialog);
        b.a(this);
        a.a(b);
        builder.setAdapter(b.a(), this);
        View view = ((f) (obj)).o();
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(((f) (obj)).n()).setTitle(((f) (obj)).m());
        }
        builder.setOnKeyListener(this);
        c = builder.create();
        c.setOnDismissListener(this);
        obj = c.getWindow().getAttributes();
        obj.type = 1003;
        if (ibinder != null)
        {
            obj.token = ibinder;
        }
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        c.show();
    }

    public void a(f f1, boolean flag)
    {
        if (flag || f1 == a)
        {
            a();
        }
        if (d != null)
        {
            d.a(f1, flag);
        }
    }

    public boolean b(f f1)
    {
        if (d != null)
        {
            return d.b(f1);
        } else
        {
            return false;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a((h)b.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        b.a(a, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
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
}
