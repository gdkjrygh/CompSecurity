// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.TextHeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

final class djo extends dja
{

    TextHeaderView a;
    private dir b;
    private djt c;

    djo(djj djj1, Context context, Fragment fragment)
    {
        a = new TextHeaderView(context);
        b = dju.a(djj1, fragment, a);
        switch (djj1.c)
        {
        default:
            throw new UnsupportedOperationException("not supported");

        case 0: // '\0'
            a(djj1, context);
            c = new djq() {

                private djo a;

                public final void a(CharSequence charsequence)
                {
                    a.a.a(charsequence);
                }

            
            {
                a = djo.this;
                super();
            }
            };
            return;

        case 1: // '\001'
            a(djj1, context);
            break;
        }
        c = new djr() {

            private djo a;

            public final TextView a()
            {
                return a.a.a;
            }

            public final void a(CharSequence charsequence)
            {
                a.a.a(charsequence);
            }

            public final void b(CharSequence charsequence)
            {
                a.a.b(charsequence);
            }

            
            {
                a = djo.this;
                super();
            }
        };
    }

    private void a(djj djj1, Context context)
    {
        boolean flag = false;
        if (djj1.d != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams;
            int j;
            int k;
            if (djj1.e == 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            k = dft.a(8F, context.getResources());
            if (j != 0)
            {
                layoutparams.bottomMargin = k;
            } else
            {
                layoutparams.topMargin = k;
            }
            context = a;
            djj1 = djj1.d;
            if (j != 0)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            context.addView(djj1, j, layoutparams);
        }
    }

    public final djt a()
    {
        return c;
    }

    public final void a(int j)
    {
        b.a(j);
    }

    public final void a(Menu menu, Activity activity)
    {
    }

    public final void a(View view)
    {
    }

    public final void a(boolean flag)
    {
        b.b(flag);
    }

    public final View b()
    {
        return b.g();
    }

    public final void b(int j)
    {
    }

    public final void b(View view)
    {
    }

    public final void b(boolean flag)
    {
        b.c(flag);
    }

    public final ImageView c()
    {
        return null;
    }

    public final void c(View view)
    {
    }

    public final ImageView d()
    {
        return b.b().a();
    }

    public final StickyListView e()
    {
        return b.a();
    }

    public final ListView f()
    {
        return b.c();
    }

    public final void h()
    {
        b.e();
    }

    public final void i()
    {
        b.f();
    }
}
