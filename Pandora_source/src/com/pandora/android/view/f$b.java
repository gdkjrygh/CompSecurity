// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package com.pandora.android.view:
//            f

public static class a
    implements f
{

    private View a;
    private TextView b;
    private ObjectAnimator c;
    private Handler d;
    private tor e;
    private Stack f;
    private int g;
    private CharSequence h;
    private Runnable i;

    static Stack a(a a1)
    {
        return a1.f;
    }

    static f b(f f1)
    {
        return f1.e;
    }

    static int c(e e1)
    {
        int j = e1.g;
        e1.g = j - 1;
        return j;
    }

    static View d(g g1)
    {
        return g1.a;
    }

    public int a()
    {
        return f.size();
    }

    public void a(String s)
    {
        b.setText(s);
    }

    public void a(boolean flag)
    {
        a(flag, true);
    }

    public void a(boolean flag, CharSequence charsequence, Parcelable parcelable)
    {
        if (parcelable != null)
        {
            f.push(parcelable);
            if (((Bundle)parcelable).getBoolean("isNonAdvertiserStation"))
            {
                g = g + 1;
            }
        }
        h = charsequence;
        b.setText(h);
        d.removeCallbacks(i);
        d.postDelayed(i, a.getResources().getInteger(0x7f0c0007));
        if (flag)
        {
            a.setAlpha(1.0F);
        } else
        {
            if (a.getVisibility() == 0)
            {
                a.setAlpha(0.5F);
            } else
            {
                a.setAlpha(0.0F);
            }
            if (c != null)
            {
                c.cancel();
            }
            c = ObjectAnimator.ofFloat(a, "alpha", new float[] {
                a.getAlpha(), 1.0F
            });
            c.setDuration(a.getResources().getInteger(0x10e0000));
            c.start();
        }
        a.setVisibility(0);
    }

    protected void a(boolean flag, boolean flag1)
    {
        d.removeCallbacks(i);
        if (flag)
        {
            a.setVisibility(8);
            a.setAlpha(0.0F);
        } else
        {
            if (c != null)
            {
                c.cancel();
            }
            c = ObjectAnimator.ofFloat(a, "alpha", new float[] {
                1.0F, 0.0F
            });
            c.setDuration(a.getResources().getInteger(0x10e0000));
            c.addListener(new AnimatorListenerAdapter() {

                final f.b a;

                public void onAnimationEnd(Animator animator)
                {
                    f.b.d(a).setVisibility(8);
                }

            
            {
                a = f.b.this;
                super();
            }
            });
            c.start();
        }
        h = null;
        if (flag1 && !f.isEmpty())
        {
            e.a(f.iterator());
            g = 0;
        }
        f.clear();
    }

    public int b()
    {
        return g;
    }

    public Iterator c()
    {
        return f.iterator();
    }

    public (View view, _cls3.a a1)
    {
        d = new Handler();
        i = new Runnable() {

            final f.b a;

            public void run()
            {
                a.a(false);
            }

            
            {
                a = f.b.this;
                super();
            }
        };
        a = view;
        e = a1;
        f = new Stack();
        b = (TextView)a.findViewById(0x7f1002a7);
        a.findViewById(0x7f1002a8).setOnClickListener(new android.view.View.OnClickListener() {

            final f.b a;

            public void onClick(View view1)
            {
                if (!f.b.a(a).isEmpty())
                {
                    view1 = (Parcelable)f.b.a(a).pop();
                    f.b.b(a).a(view1);
                    if (((Bundle)view1).getBoolean("isNonAdvertiserStation"))
                    {
                        f.b.c(a);
                    }
                    if (f.b.a(a).isEmpty())
                    {
                        a.a(false, false);
                    }
                }
            }

            
            {
                a = f.b.this;
                super();
            }
        });
        a(true);
    }
}
