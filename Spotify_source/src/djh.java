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
import com.spotify.android.glue.organisms.header.GlueMediumHeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

final class djh extends dja
{

    dir a;
    private GlueMediumHeaderView b;
    private djt c;
    private Button d;

    djh(djj djj1, Context context, Fragment fragment)
    {
        b = new GlueMediumHeaderView(context);
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
        context = dej.a(b);
        b.a(context);
        c = new djq(context) {

            private del a;
            private djh b;

            public final void a(CharSequence charsequence)
            {
                a.a(charsequence);
                b.a.a(String.valueOf(charsequence));
            }

            
            {
                b = djh.this;
                a = del1;
                super();
            }
        };
_L7:
        a = dju.a(djj1, fragment, b);
        d = djj1.d;
        b.a(d);
        return;
_L3:
        context = dej.b(b);
        b.a(context);
        c = new djr(context) {

            private dep a;
            private djh b;

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
                b = djh.this;
                a = dep1;
                super();
            }
        };
        continue; /* Loop/switch isn't completed */
_L4:
        context = dej.c(b);
        b.a(context);
        c = new djs(context) {

            private deq a;
            private djh b;

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
                b = djh.this;
                a = deq1;
                super();
            }
        };
        continue; /* Loop/switch isn't completed */
_L5:
        context = dej.d(b);
        b.a(context);
        c = new djp() {

        };
        if (true) goto _L7; else goto _L6
_L6:
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
        if (d != null)
        {
            dgo.a(d, 0x7f010109);
            menu = menu.add(0, 0x7f110052, 1, d.getText());
            ji.a(menu, 2);
            activity = new FrameLayout(activity);
            if (d.getParent() != null)
            {
                ((ViewGroup)d.getParent()).removeAllViews();
            }
            activity.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            activity.addView(d);
            ji.a(menu, d);
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
        b.a(j);
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
        throw new UnsupportedOperationException("Image not supported.");
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
