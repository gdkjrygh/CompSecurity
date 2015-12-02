// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.view.View;
import com.nineoldandroids.a.o;
import com.nineoldandroids.b.b;
import com.qihoo.security.opti.trashclear.ui.i;

public class com.qihoo.security.ui.antivirus.list.a
{
    public static interface a
    {

        public abstract void a(i i);
    }


    private final long a = 150L;
    private final a b;

    public com.qihoo.security.ui.antivirus.list.a(a a1)
    {
        b = a1;
    }

    static a a(com.qihoo.security.ui.antivirus.list.a a1)
    {
        return a1.b;
    }

    static void a(com.qihoo.security.ui.antivirus.list.a a1, View view, i i)
    {
        a1.b(view, i);
    }

    private void b(View view, i i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int j = view.getHeight();
        o o1 = o.b(new int[] {
            j, 0
        }).d(150L);
        o1.a(new com.nineoldandroids.a.b(view, j, i) {

            final View a;
            final int b;
            final i c;
            final com.qihoo.security.ui.antivirus.list.a d;

            public void b(com.nineoldandroids.a.a a1)
            {
                com.nineoldandroids.b.a.a(a, 1.0F);
                com.nineoldandroids.b.a.d(a, 0.0F);
                a1 = a.getLayoutParams();
                a1.height = b;
                a.setLayoutParams(a1);
                if (com.qihoo.security.ui.antivirus.list.a.a(d) != null)
                {
                    com.qihoo.security.ui.antivirus.list.a.a(d).a(c);
                }
            }

            
            {
                d = com.qihoo.security.ui.antivirus.list.a.this;
                a = view;
                b = i;
                c = j;
                super();
            }
        });
        o1.a(new com.nineoldandroids.a.o.b(layoutparams, view) {

            final android.view.ViewGroup.LayoutParams a;
            final View b;
            final com.qihoo.security.ui.antivirus.list.a c;

            public void a(o o2)
            {
                a.height = ((Integer)o2.o()).intValue();
                b.setLayoutParams(a);
            }

            
            {
                c = com.qihoo.security.ui.antivirus.list.a.this;
                a = layoutparams;
                b = view;
                super();
            }
        });
        o1.a();
    }

    public void a(View view, i i)
    {
        com.nineoldandroids.b.b.a(view).a(-view.getWidth()).c(0.0F).a(150L).a(new com.nineoldandroids.a.b(view, i) {

            final View a;
            final i b;
            final com.qihoo.security.ui.antivirus.list.a c;

            public void b(com.nineoldandroids.a.a a1)
            {
                com.qihoo.security.ui.antivirus.list.a.a(c, a, b);
            }

            
            {
                c = com.qihoo.security.ui.antivirus.list.a.this;
                a = view;
                b = i;
                super();
            }
        });
    }

    public void a(i i)
    {
        o o1 = o.b(new int[] {
            1, 0
        }).d(150L);
        o1.a(new com.nineoldandroids.a.b(i) {

            final i a;
            final com.qihoo.security.ui.antivirus.list.a b;

            public void b(com.nineoldandroids.a.a a1)
            {
                if (com.qihoo.security.ui.antivirus.list.a.a(b) != null)
                {
                    com.qihoo.security.ui.antivirus.list.a.a(b).a(a);
                }
            }

            
            {
                b = com.qihoo.security.ui.antivirus.list.a.this;
                a = i;
                super();
            }
        });
        o1.a();
    }
}
