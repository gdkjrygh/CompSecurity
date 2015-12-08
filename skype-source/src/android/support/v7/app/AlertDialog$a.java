// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

// Referenced classes of package android.support.v7.app:
//            AlertDialog, c

public static class b
{

    private final a a;
    private int b;

    public final Context a()
    {
        return a.a;
    }

    public a a(int i)
    {
        a.a = a.a.getText(i);
        return this;
    }

    public final ckListener a(int i, android.content.e.OnClickListener onclicklistener)
    {
        a.a = a.a.getText(i);
        a.a = onclicklistener;
        return this;
    }

    public final celListener a(android.content.e.OnCancelListener oncancellistener)
    {
        a.a = oncancellistener;
        return this;
    }

    public final ckListener a(android.content.e.OnClickListener onclicklistener)
    {
        a.a = a.a.getText(0x7f080188);
        a.a = onclicklistener;
        return this;
    }

    public final Listener a(android.content.e.OnKeyListener onkeylistener)
    {
        a.a = onkeylistener;
        return this;
    }

    public final a a(Drawable drawable)
    {
        a.a = drawable;
        return this;
    }

    public final a a(View view)
    {
        a.a = view;
        return this;
    }

    public final ckListener a(ListAdapter listadapter, int i, android.content.e.OnClickListener onclicklistener)
    {
        a.a = listadapter;
        a.a = onclicklistener;
        a.a = i;
        a.a = true;
        return this;
    }

    public final ckListener a(ListAdapter listadapter, android.content.e.OnClickListener onclicklistener)
    {
        a.a = listadapter;
        a.a = onclicklistener;
        return this;
    }

    public a a(CharSequence charsequence)
    {
        a.a = charsequence;
        return this;
    }

    public final ckListener a(CharSequence charsequence, android.content.e.OnClickListener onclicklistener)
    {
        a.a = charsequence;
        a.a = onclicklistener;
        return this;
    }

    public final a a(boolean flag)
    {
        a.a = flag;
        return this;
    }

    public final ckListener a(CharSequence acharsequence[], int i, android.content.e.OnClickListener onclicklistener)
    {
        a.a = acharsequence;
        a.a = onclicklistener;
        a.a = i;
        a.a = true;
        return this;
    }

    public final a b()
    {
        a.a = 0;
        return this;
    }

    public final a b(int i)
    {
        a.a = a.a.getText(i);
        return this;
    }

    public final ckListener b(int i, android.content.e.OnClickListener onclicklistener)
    {
        a.a = a.a.getText(i);
        a.a = onclicklistener;
        return this;
    }

    public final a b(View view)
    {
        a.a = view;
        a.a = 0;
        a.a = false;
        return this;
    }

    public final a b(CharSequence charsequence)
    {
        a.a = charsequence;
        return this;
    }

    public final ckListener b(CharSequence charsequence, android.content.e.OnClickListener onclicklistener)
    {
        a.a = charsequence;
        a.a = onclicklistener;
        return this;
    }

    public final ckListener c(CharSequence charsequence, android.content.e.OnClickListener onclicklistener)
    {
        a.a = charsequence;
        a.a = onclicklistener;
        return this;
    }

    public final AlertDialog c()
    {
        AlertDialog alertdialog = new AlertDialog(a.a, b);
        kListener klistener = a;
        c c1 = AlertDialog.a(alertdialog);
        if (klistener.a != null)
        {
            c1.a(klistener.a);
        } else
        {
            if (klistener.a != null)
            {
                c1.a(klistener.a);
            }
            if (klistener.a != null)
            {
                c1.a(klistener.a);
            }
            if (klistener.a != 0)
            {
                c1.b(klistener.a);
            }
            if (klistener.a != 0)
            {
                c1.b(c1.c(klistener.a));
            }
        }
        if (klistener.a != null)
        {
            c1.b(klistener.a);
        }
        if (klistener.a != null)
        {
            c1.a(-1, klistener.a, klistener.ckListener, null);
        }
        if (klistener.ckListener != null)
        {
            c1.a(-2, klistener.ckListener, klistener.ckListener, null);
        }
        if (klistener.ckListener != null)
        {
            c1.a(-3, klistener.ckListener, klistener.ckListener, null);
        }
        if (klistener.ckListener != null || klistener.ckListener != null || klistener.ckListener != null)
        {
            ListView listview = (ListView)klistener.ckListener.inflate(android.support.v7.app.c.i(c1), null);
            Object obj;
            if (klistener.ckListener)
            {
                if (klistener.ckListener == null)
                {
                    obj = new ckListener(klistener, klistener.ckListener, android.support.v7.app.c.j(c1), klistener.ckListener, listview);
                } else
                {
                    obj = new ckListener(klistener, klistener.ckListener, klistener.ckListener, listview, c1);
                }
            } else
            {
                int i;
                if (klistener.ckListener)
                {
                    i = android.support.v7.app.c.k(c1);
                } else
                {
                    i = android.support.v7.app.c.l(c1);
                }
                if (klistener.ckListener == null)
                {
                    if (klistener.ckListener != null)
                    {
                        obj = klistener.ckListener;
                    } else
                    {
                        obj = new ckListener(klistener.ckListener, i, klistener.ckListener);
                    }
                } else
                {
                    obj = new SimpleCursorAdapter(klistener.nit>, i, klistener.nit>, new String[] {
                        klistener.nit>
                    }, new int[] {
                        0x1020014
                    });
                }
            }
            android.support.v7.app.c.a(c1, ((ListAdapter) (obj)));
            android.support.v7.app.c.a(c1, klistener.nit>);
            if (klistener.nit> != null)
            {
                listview.setOnItemClickListener(new kListener(klistener, c1));
            } else
            if (klistener.kListener != null)
            {
                listview.setOnItemClickListener(new kListener(klistener, listview, c1));
            }
            if (klistener.kListener != null)
            {
                listview.setOnItemSelectedListener(klistener.ctedListener);
            }
            if (klistener.ctedListener)
            {
                listview.setChoiceMode(1);
            } else
            if (klistener.)
            {
                listview.setChoiceMode(2);
            }
            android.support.v7.app.c.a(c1, listview);
        }
        if (klistener. != null)
        {
            if (klistener.)
            {
                c1.a(klistener., klistener., klistener., klistener., klistener.);
            } else
            {
                c1.b(klistener.);
            }
        } else
        if (klistener. != 0)
        {
            c1.a(klistener.);
        }
        alertdialog.setCancelable(a.a);
        if (a.a)
        {
            alertdialog.setCanceledOnTouchOutside(true);
        }
        alertdialog.setOnCancelListener(a.a);
        alertdialog.setOnDismissListener(a.a);
        if (a.a != null)
        {
            alertdialog.setOnKeyListener(a.a);
        }
        return alertdialog;
    }

    public ckListener(Context context)
    {
        this(context, AlertDialog.a(context, 0));
    }

    public <init>(Context context, int i)
    {
        a = new a(new ContextThemeWrapper(context, AlertDialog.a(context, i)));
        b = i;
    }
}
