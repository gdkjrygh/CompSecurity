// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;

final class ezb
{

    final Context a;
    Button b;
    ToggleButton c;
    CollectionState d;
    final ezc e;
    dja f;
    gbg g;
    String h;
    String i;
    final gbv j = new gbv();
    View k;
    gji l;
    private final Drawable m;

    ezb(Context context, Fragment fragment, ezc ezc1)
    {
        a = context;
        e = ezc1;
        m = dff.a(a);
        if (ggi.b(context))
        {
            f = dja.b(context).b().b(b(context), 0).a(a(context)).a(fragment);
        } else
        {
            b = gad.a(context, null);
            b.setOnClickListener(e.a());
            f = dja.a(context).b().b(b(context), 0).b(b).a(a(context)).a(fragment);
        }
        e.a(f.e().a());
        e.a(f.b());
        dmz.a(gjj);
        l = gjj.a(context);
    }

    private gbg a(Context context)
    {
        g = new gbg(context);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener(context) {

            private Context a;
            private ezb b;

            public final void onClick(View view)
            {
                view = gms.a(a, b.h).a(b.i).a;
                a.startActivity(view);
            }

            
            {
                b = ezb.this;
                a = context;
                super();
            }
        };
        g.a(onclicklistener);
        g.b(context.getString(0x7f080069));
        return g;
    }

    private ToggleButton b(Context context)
    {
        c = (ToggleButton)LayoutInflater.from(context).inflate(0x7f0300c8, null);
        c.setVisibility(0);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private ezb a;

            public final void onClick(View view)
            {
                view = a;
                ((ezb) (view)).e.a(((ezb) (view)).d);
            }

            
            {
                a = ezb.this;
                super();
            }
        });
        return c;
    }

    final void a()
    {
        g.b.setImageDrawable(m);
    }

    public final void a(int i1)
    {
        f.a(i1);
    }

    // Unreferenced inner class ezb$3

/* anonymous class */
    final class _cls3
    {

        static final int a[];

        static 
        {
            a = new int[CollectionState.values().length];
            try
            {
                a[CollectionState.c.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[CollectionState.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[CollectionState.a.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
