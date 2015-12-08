// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

// Referenced classes of package android.support.v7.app:
//            AppCompatDialog, c

public class AlertDialog extends AppCompatDialog
    implements DialogInterface
{
    public static class a
    {

        private final c.a a;
        private int b;

        public final Context a()
        {
            return a.a;
        }

        public a a(int i)
        {
            a.f = a.a.getText(i);
            return this;
        }

        public final a a(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.i = a.a.getText(i);
            a.j = onclicklistener;
            return this;
        }

        public final a a(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            a.p = oncancellistener;
            return this;
        }

        public final a a(android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.m = a.a.getText(0x7f080188);
            a.n = onclicklistener;
            return this;
        }

        public final a a(android.content.DialogInterface.OnKeyListener onkeylistener)
        {
            a.r = onkeylistener;
            return this;
        }

        public final a a(Drawable drawable)
        {
            a.d = drawable;
            return this;
        }

        public final a a(View view)
        {
            a.g = view;
            return this;
        }

        public final a a(ListAdapter listadapter, int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.t = listadapter;
            a.u = onclicklistener;
            a.F = i;
            a.E = true;
            return this;
        }

        public final a a(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.t = listadapter;
            a.u = onclicklistener;
            return this;
        }

        public a a(CharSequence charsequence)
        {
            a.f = charsequence;
            return this;
        }

        public final a a(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.i = charsequence;
            a.j = onclicklistener;
            return this;
        }

        public final a a(boolean flag)
        {
            a.o = flag;
            return this;
        }

        public final a a(CharSequence acharsequence[], int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.s = acharsequence;
            a.u = onclicklistener;
            a.F = i;
            a.E = true;
            return this;
        }

        public final a b()
        {
            a.c = 0;
            return this;
        }

        public final a b(int i)
        {
            a.h = a.a.getText(i);
            return this;
        }

        public final a b(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.k = a.a.getText(i);
            a.l = onclicklistener;
            return this;
        }

        public final a b(View view)
        {
            a.w = view;
            a.v = 0;
            a.B = false;
            return this;
        }

        public final a b(CharSequence charsequence)
        {
            a.h = charsequence;
            return this;
        }

        public final a b(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.k = charsequence;
            a.l = onclicklistener;
            return this;
        }

        public final a c(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.m = charsequence;
            a.n = onclicklistener;
            return this;
        }

        public final AlertDialog c()
        {
            AlertDialog alertdialog = new AlertDialog(a.a, b);
            c.a a1 = a;
            c c1 = AlertDialog.a(alertdialog);
            if (a1.g != null)
            {
                c1.a(a1.g);
            } else
            {
                if (a1.f != null)
                {
                    c1.a(a1.f);
                }
                if (a1.d != null)
                {
                    c1.a(a1.d);
                }
                if (a1.c != 0)
                {
                    c1.b(a1.c);
                }
                if (a1.e != 0)
                {
                    c1.b(c1.c(a1.e));
                }
            }
            if (a1.h != null)
            {
                c1.b(a1.h);
            }
            if (a1.i != null)
            {
                c1.a(-1, a1.i, a1.j, null);
            }
            if (a1.k != null)
            {
                c1.a(-2, a1.k, a1.l, null);
            }
            if (a1.m != null)
            {
                c1.a(-3, a1.m, a1.n, null);
            }
            if (a1.s != null || a1.H != null || a1.t != null)
            {
                ListView listview = (ListView)a1.b.inflate(android.support.v7.app.c.i(c1), null);
                Object obj;
                if (a1.D)
                {
                    if (a1.H == null)
                    {
                        obj = new c.a._cls1(a1, a1.a, android.support.v7.app.c.j(c1), a1.s, listview);
                    } else
                    {
                        obj = new c.a._cls2(a1, a1.a, a1.H, listview, c1);
                    }
                } else
                {
                    int i;
                    if (a1.E)
                    {
                        i = android.support.v7.app.c.k(c1);
                    } else
                    {
                        i = android.support.v7.app.c.l(c1);
                    }
                    if (a1.H == null)
                    {
                        if (a1.t != null)
                        {
                            obj = a1.t;
                        } else
                        {
                            obj = new c.c(a1.a, i, a1.s);
                        }
                    } else
                    {
                        obj = new SimpleCursorAdapter(a1.a, i, a1.H, new String[] {
                            a1.I
                        }, new int[] {
                            0x1020014
                        });
                    }
                }
                android.support.v7.app.c.a(c1, ((ListAdapter) (obj)));
                android.support.v7.app.c.a(c1, a1.F);
                if (a1.u != null)
                {
                    listview.setOnItemClickListener(new c.a._cls3(a1, c1));
                } else
                if (a1.G != null)
                {
                    listview.setOnItemClickListener(new c.a._cls4(a1, listview, c1));
                }
                if (a1.K != null)
                {
                    listview.setOnItemSelectedListener(a1.K);
                }
                if (a1.E)
                {
                    listview.setChoiceMode(1);
                } else
                if (a1.D)
                {
                    listview.setChoiceMode(2);
                }
                android.support.v7.app.c.a(c1, listview);
            }
            if (a1.w != null)
            {
                if (a1.B)
                {
                    c1.a(a1.w, a1.x, a1.y, a1.z, a1.A);
                } else
                {
                    c1.b(a1.w);
                }
            } else
            if (a1.v != 0)
            {
                c1.a(a1.v);
            }
            alertdialog.setCancelable(a.o);
            if (a.o)
            {
                alertdialog.setCanceledOnTouchOutside(true);
            }
            alertdialog.setOnCancelListener(a.p);
            alertdialog.setOnDismissListener(a.q);
            if (a.r != null)
            {
                alertdialog.setOnKeyListener(a.r);
            }
            return alertdialog;
        }

        public a(Context context)
        {
            this(context, AlertDialog.a(context, 0));
        }

        public a(Context context, int i)
        {
            a = new c.a(new ContextThemeWrapper(context, AlertDialog.a(context, i)));
            b = i;
        }
    }


    private c a;

    AlertDialog(Context context, int i)
    {
        super(context, a(context, i));
        a = new c(getContext(), this, getWindow());
    }

    static int a(Context context, int i)
    {
        if (i >= 0x1000000)
        {
            return i;
        } else
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(android.support.v7.appcompat.a.a.alertDialogTheme, typedvalue, true);
            return typedvalue.resourceId;
        }
    }

    static c a(AlertDialog alertdialog)
    {
        return alertdialog.a;
    }

    public final void a(CharSequence charsequence)
    {
        a.b(charsequence);
    }

    public final void a(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a.a(-1, charsequence, onclicklistener, null);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.a();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (a.a(keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (a.b(keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        a.a(charsequence);
    }
}
