// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.glue.organisms.header.GlueLargeHeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

final class dji extends dja
{

    dir a;
    private final Button b;
    private GlueLargeHeaderView c;
    private djt d;

    dji(djj djj1, Context context, Fragment fragment)
    {
        c = new GlueLargeHeaderView(context);
        djj1.c;
        JVM INSTR tableswitch 0 3: default 52
    //                   0 62
    //                   1 124
    //                   2 156
    //                   3 188;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new UnsupportedOperationException("not supported");
_L2:
        context = dej.a(c);
        c.a(context);
        d = new djq(context) {

            private del a;
            private dji b;

            public final void a(CharSequence charsequence)
            {
                a.a(charsequence);
                b.a.a(String.valueOf(charsequence));
            }

            
            {
                b = dji.this;
                a = del1;
                super();
            }
        };
_L7:
        a = dju.a(djj1, fragment, c);
        b = djj1.d;
        c.a(b);
        return;
_L3:
        context = dej.b(c);
        c.a(context);
        d = new djr(context) {

            private dep a;
            private dji b;

            public final TextView a()
            {
                return a.b();
            }

            public final void a(CharSequence charsequence)
            {
                a.a(charsequence);
                b.a.a(String.valueOf(charsequence));
            }

            public final void b(CharSequence charsequence)
            {
                a.b(charsequence);
            }

            
            {
                b = dji.this;
                a = dep1;
                super();
            }
        };
        continue; /* Loop/switch isn't completed */
_L4:
        context = dej.c(c);
        c.a(context);
        d = new djs(context) {

            private deq a;
            private dji b;

            public final TextView a()
            {
                return a.b();
            }

            public final void a(CharSequence charsequence)
            {
                a.a(charsequence);
                b.a.a(String.valueOf(charsequence));
            }

            public final void b(CharSequence charsequence)
            {
                a.b(charsequence);
            }

            
            {
                b = dji.this;
                a = deq1;
                super();
            }
        };
        continue; /* Loop/switch isn't completed */
_L5:
        context = dej.d(c);
        c.a(context);
        d = new djp() {

        };
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final djt a()
    {
        return d;
    }

    public final void a(int j)
    {
        a.a(j);
    }

    public final void a(Menu menu, Activity activity)
    {
        if (b != null)
        {
            b.setAlpha(0.0F);
            dgo.a(b, 0x7f010109);
            menu = menu.add(0, 0x7f110052, 1, b.getText());
            ji.a(menu, 2);
            activity = new FrameLayout(activity);
            if (b.getParent() != null)
            {
                ((ViewGroup)b.getParent()).removeAllViews();
            }
            activity.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            activity.addView(b);
            ji.a(menu, activity);
        }
    }

    public final void a(View view)
    {
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
        c.a(j);
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
        return c.c;
    }

    public final void c(View view)
    {
        a.a(view);
    }

    public final ImageView d()
    {
        return c.c;
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
