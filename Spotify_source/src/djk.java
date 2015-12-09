// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

final class djk extends dja
{

    dir a;
    dgm b;
    private djt c;

    djk(djj djj1, Context context, Fragment fragment, dgm dgm1)
    {
        boolean flag;
        int i1;
        i1 = 0;
        flag = false;
        super();
        b = (dgm)ctz.a(dgm1);
        a = dju.a(djj1, fragment, b.a());
        djj1.c;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 78
    //                   1 246;
           goto _L1 _L2 _L3
_L1:
        throw new UnsupportedOperationException("not supported");
_L2:
        fragment = new LinearLayout(context);
        fragment.setOrientation(1);
        fragment.setGravity(17);
        if (djj1.d != null)
        {
            int j;
            if (djj1.e == 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            dgm1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            i1 = dft.a(8F, context.getResources());
            if (j != 0)
            {
                dgm1.bottomMargin = i1;
            } else
            {
                dgm1.topMargin = i1;
            }
            context = djj1.d;
            if (j != 0)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            fragment.addView(context, j, dgm1);
        }
        b.a(fragment);
        c = new djq() {

            private djk a;

            public final void a(CharSequence charsequence)
            {
                a.b.a(charsequence);
                a.a.a(String.valueOf(charsequence));
            }

            
            {
                a = djk.this;
                super();
            }
        };
_L5:
        if (djj1.f != null)
        {
            b.a(new djl(djj1.f));
        }
        return;
_L3:
        fragment = new LinearLayout(context);
        fragment.setOrientation(1);
        fragment.setGravity(17);
        dgm1 = dgp.a(context, fragment, 0);
        dgm1.setId(0x1020014);
        dgo.b(context, dgm1, 0x7f0101dc);
        fragment.addView(dgm1, new android.widget.LinearLayout.LayoutParams(-2, -2));
        if (djj1.d != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams;
            int k;
            int l;
            if (djj1.e == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            l = dft.a(8F, context.getResources());
            if (k != 0)
            {
                layoutparams.bottomMargin = l;
            } else
            {
                layoutparams.topMargin = l;
            }
            context = djj1.d;
            if (k != 0)
            {
                k = i1;
            } else
            {
                k = 1;
            }
            fragment.addView(context, k, layoutparams);
        }
        c = new djr(dgm1) {

            private TextView a;
            private djk b;

            public final TextView a()
            {
                return a;
            }

            public final void a(CharSequence charsequence)
            {
                b.b.a(charsequence);
                b.a.a(String.valueOf(charsequence));
            }

            public final void b(CharSequence charsequence)
            {
                a.setText(charsequence);
            }

            
            {
                b = djk.this;
                a = textview;
                super();
            }
        };
        b.a(fragment);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final djt a()
    {
        return c;
    }

    public final void a(int j)
    {
        a.a(j);
    }

    public final void a(Menu menu, Activity activity)
    {
    }

    public final void a(View view)
    {
        b.b(view);
    }

    public final void a(boolean flag)
    {
        a.b(flag);
    }

    public final View b()
    {
        return a.g();
    }

    public final void b(int j)
    {
    }

    public final void b(View view)
    {
    }

    public final void b(boolean flag)
    {
        a.c(flag);
    }

    public final ImageView c()
    {
        return b.b();
    }

    public final void c(View view)
    {
        a.a(view);
    }

    public final ImageView d()
    {
        return a.b().a();
    }

    public final StickyListView e()
    {
        return a.a();
    }

    public final ListView f()
    {
        return a.c();
    }

    public final void h()
    {
        a.e();
    }

    public final void i()
    {
        a.f();
    }
}
