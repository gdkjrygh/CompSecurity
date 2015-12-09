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
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

final class djm extends dja
{

    dir a;
    dgm b;
    TextView c;
    private boolean d;
    private djt e;

    djm(djj djj1, Context context, Fragment fragment)
    {
        int l = 0;
        super();
        b = new HeaderView(context);
        dgm dgm1 = b;
        int j = djj1.c;
        if (j == 0)
        {
            LinearLayout linearlayout = new LinearLayout(context);
            linearlayout.setOrientation(1);
            linearlayout.setGravity(17);
            if (djj1.d != null)
            {
                android.widget.LinearLayout.LayoutParams layoutparams;
                if (djj1.e == 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                l = dft.a(8F, context.getResources());
                if (j != 0)
                {
                    layoutparams.bottomMargin = l;
                } else
                {
                    layoutparams.topMargin = l;
                }
                linearlayout.addView(djj1.d, 0, layoutparams);
            }
            e = new djq() {

                private djm a;

                public final void a(CharSequence charsequence)
                {
                    a.c.setText(charsequence);
                    a.b.a(charsequence);
                    a.a.a(String.valueOf(charsequence));
                }

            
            {
                a = djm.this;
                super();
            }
            };
            context = linearlayout;
        } else
        if (j == 1)
        {
            LinearLayout linearlayout1 = new LinearLayout(context);
            linearlayout1.setOrientation(1);
            linearlayout1.setGravity(17);
            TextView textview = dgp.a(context, linearlayout1, 0);
            textview.setId(0x1020014);
            textview.setGravity(1);
            dgo.b(context, textview, 0x7f0101dc);
            linearlayout1.addView(textview, new android.widget.LinearLayout.LayoutParams(-2, -2));
            if (djj1.d != null)
            {
                android.widget.LinearLayout.LayoutParams layoutparams1;
                int k;
                int i1;
                if (djj1.e == 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                i1 = dft.a(8F, context.getResources());
                if (k != 0)
                {
                    layoutparams1.bottomMargin = i1;
                } else
                {
                    layoutparams1.topMargin = i1;
                }
                context = djj1.d;
                if (k != 0)
                {
                    k = l;
                } else
                {
                    k = 1;
                }
                linearlayout1.addView(context, k, layoutparams1);
            }
            e = new djr(textview) {

                private TextView a;
                private djm b;

                public final TextView a()
                {
                    return a;
                }

                public final void a(CharSequence charsequence)
                {
                    b.c.setText(charsequence);
                    b.b.a(charsequence);
                    b.a.a(String.valueOf(charsequence));
                }

                public final void b(CharSequence charsequence)
                {
                    a.setText(charsequence);
                }

            
            {
                b = djm.this;
                a = textview;
                super();
            }
            };
            context = linearlayout1;
        } else
        {
            throw new UnsupportedOperationException("not supported");
        }
        dgm1.a(context);
        c = ((HeaderView)b).a;
        context = (View)b;
        if (djj1.f != null)
        {
            b(djj1.f);
            d = true;
        }
        a = dju.a(djj1, fragment, context);
    }

    public final djt a()
    {
        return e;
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
        if (d)
        {
            return;
        } else
        {
            view = new djn(view);
            b.a(view);
            d = true;
            return;
        }
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
