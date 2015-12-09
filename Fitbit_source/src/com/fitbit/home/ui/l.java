// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.fitbit.util.ProgressDialogFragment;

// Referenced classes of package com.fitbit.home.ui:
//            f, b

public class l
    implements f
{
    public static interface a
    {

        public abstract void a(l l1);
    }


    private View a;
    private View b;
    private View c;
    private boolean d;
    private f e;
    private a f;
    private android.content.DialogInterface.OnCancelListener g;

    public l(FragmentActivity fragmentactivity, int i, a a1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        d = true;
        a = fragmentactivity.findViewById(i);
        b = a.findViewById(0x7f1103d5);
        c = a.findViewById(0x7f11009b);
        g = oncancellistener;
        f = a1;
        fragmentactivity = new b(fragmentactivity, null) {

            final l a;

            public void a(Exception exception)
            {
                a.a(exception);
            }

            
            {
                a = l.this;
                super(fragmentactivity, a1);
            }
        };
        if (g != null)
        {
            fragmentactivity.a(new com.fitbit.util.q.a() {

                final l a;

                public DialogFragment a()
                {
                    return ProgressDialogFragment.b(0, 0x7f08046a, l.a(a));
                }

            
            {
                a = l.this;
                super();
            }
            });
        }
        e = fragmentactivity;
        fragmentactivity = b;
        if (a1 != null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        fragmentactivity.setVisibility(i);
        c.setVisibility(8);
        a.setVisibility(8);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final l a;

            public void onClick(View view)
            {
                l.b(a).a(a);
            }

            
            {
                a = l.this;
                super();
            }
        });
    }

    static android.content.DialogInterface.OnCancelListener a(l l1)
    {
        return l1.g;
    }

    static a b(l l1)
    {
        return l1.f;
    }

    public void a(Exception exception)
    {
        if (d)
        {
            e.d();
        }
        if (f != null)
        {
            b.setVisibility(0);
        } else
        {
            b.setVisibility(8);
        }
        c.setVisibility(8);
        a.setVisibility(0);
        d = false;
    }

    public void c()
    {
        if (d)
        {
            e.c();
            return;
        } else
        {
            b.setVisibility(8);
            c.setVisibility(0);
            return;
        }
    }

    public void d()
    {
        if (d)
        {
            e.d();
            return;
        } else
        {
            a.setVisibility(8);
            return;
        }
    }

    public void h()
    {
        if (d)
        {
            e.h();
            return;
        } else
        {
            a.setVisibility(8);
            return;
        }
    }
}
