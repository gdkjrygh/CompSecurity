// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.k;

public class b
{

    private k a;
    private k b;
    private View c;
    private View d;
    private com.nineoldandroids.a.a.a e;
    private com.nineoldandroids.a.a.a f;
    private android.view.View.OnTouchListener g;

    public b(Context context)
    {
        g = new android.view.View.OnTouchListener() {

            final b a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                a = b.this;
                super();
            }
        };
    }

    static k a(b b1)
    {
        return b1.b;
    }

    private void a(View view, boolean flag)
    {
        if (view != null)
        {
            android.view.View.OnTouchListener ontouchlistener;
            if (flag)
            {
                ontouchlistener = null;
            } else
            {
                ontouchlistener = g;
            }
            view.setOnTouchListener(ontouchlistener);
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                int j = view.getChildCount();
                if (j > 0)
                {
                    for (int i = 0; i < j; i++)
                    {
                        a(view.getChildAt(i), flag);
                    }

                }
            }
        }
    }

    public void a()
    {
        if (a != null && a.d())
        {
            a.c();
            a = null;
            if (e != null)
            {
                e.b(null);
            }
            if (c != null)
            {
                c = null;
            }
        }
        if (b != null && b.d())
        {
            b.c();
            b = null;
            if (f != null)
            {
                f.b(null);
            }
            if (d != null)
            {
                d = null;
            }
        }
    }

    public void a(View view, com.nineoldandroids.a.a.a a1, long l, View view1, com.nineoldandroids.a.a.a a2, long l1)
    {
        a();
        if (view1 != null)
        {
            b = k.a(view1, "alpha", new float[] {
                0.0F, 1.0F
            });
            b.c(l);
        } else
        {
            b = null;
        }
        if (view != null)
        {
            a = k.a(view, "alpha", new float[] {
                1.0F, 0.0F
            });
            a.c(l1);
        } else
        {
            a = null;
        }
        c = view;
        d = view1;
        e = a1;
        f = a2;
        a(view, false);
        a(view1, true);
        if (a != null)
        {
            a.a(new com.nineoldandroids.a.a.a(view, a1) {

                final View a;
                final com.nineoldandroids.a.a.a b;
                final b c;

                public void a(a a3)
                {
                    a.setVisibility(0);
                    if (b != null)
                    {
                        b.a(a3);
                    }
                }

                public void b(a a3)
                {
                    a.setVisibility(8);
                    if (b != null)
                    {
                        b.b(a3);
                    }
                    if (com.qihoo.security.ui.main.b.a(c) != null)
                    {
                        com.qihoo.security.ui.main.b.a(c).a();
                    }
                }

                public void c(a a3)
                {
                    if (b != null)
                    {
                        b.c(a3);
                    }
                }

                public void d(a a3)
                {
                    if (b != null)
                    {
                        b.d(a3);
                    }
                }

            
            {
                c = b.this;
                a = view;
                b = a1;
                super();
            }
            });
        }
        if (b != null)
        {
            b.a(new com.nineoldandroids.a.a.a(view1, a2) {

                final View a;
                final com.nineoldandroids.a.a.a b;
                final b c;

                public void a(a a3)
                {
                    a.setVisibility(0);
                    if (b != null)
                    {
                        b.a(a3);
                    }
                }

                public void b(a a3)
                {
                    if (b != null)
                    {
                        b.b(a3);
                    }
                }

                public void c(a a3)
                {
                    if (b != null)
                    {
                        b.c(a3);
                    }
                }

                public void d(a a3)
                {
                    if (b != null)
                    {
                        b.d(a3);
                    }
                }

            
            {
                c = b.this;
                a = view;
                b = a1;
                super();
            }
            });
        }
        if (a != null)
        {
            a.a();
        } else
        if (b != null)
        {
            b.a();
            return;
        }
    }

    public void a(View view, com.nineoldandroids.a.a.a a1, View view1, com.nineoldandroids.a.a.a a2)
    {
        a(view, a1, 350L, view1, a2, 350L);
    }
}
