// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;

public final class eoo
{

    public static View a(Context context)
    {
        EmptyView emptyview = new EmptyView(context);
        emptyview.setId(0x7f110348);
        a(emptyview);
        emptyview.a(context.getString(0x7f0803cd));
        emptyview.b(context.getString(0x7f0803cc));
        if (!ggi.b(context))
        {
            emptyview.a(a(context, SpotifyIcon.E));
        }
        context = new ScrollView(context);
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        context.addView(emptyview);
        context.setFillViewport(true);
        return context;
    }

    public static View a(Context context, int i, int j, int k, dfz dfz1, android.view.View.OnClickListener onclicklistener)
    {
        EmptyView emptyview = new EmptyView(context);
        emptyview.setId(0x7f110348);
        a(emptyview);
        emptyview.a(context.getString(i));
        emptyview.b(context.getString(j));
        if (ggi.b(context) || dfz1 == null)
        {
            i = dft.b(16F, context.getResources());
            emptyview.setPadding(emptyview.getPaddingLeft(), i, emptyview.getPaddingRight(), i);
        } else
        {
            emptyview.a(dfz1);
        }
        if (onclicklistener != null)
        {
            dfz1 = dgp.b(context, emptyview);
            dfz1.setId(0x7f110022);
            dfz1.setText(k);
            dfz1.setEllipsize(android.text.TextUtils.TruncateAt.END);
            emptyview.a(dfz1);
            dfz1.setOnClickListener(onclicklistener);
        }
        dfz1 = new ScrollView(context);
        dfz1.setBackgroundColor(dgo.b(context, 0x1010054));
        dfz1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -1));
        dfz1.addView(emptyview);
        dfz1.setFillViewport(true);
        return dfz1;
    }

    private static View a(Context context, int i, int j, dfz dfz1, boolean flag)
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener(context, flag) {

            private Context a;
            private boolean b;

            public final void onClick(View view)
            {
                Context context1 = a;
                Context context2 = a;
                if (b)
                {
                    view = "spotify:hub:music";
                } else
                {
                    view = "spotify:app:browse";
                }
                context1.startActivity(gms.a(context2, view).a);
            }

            
            {
                a = context;
                b = flag;
                super();
            }
        };
        int k;
        if (flag)
        {
            k = 0x7f0803c6;
        } else
        {
            k = 0x7f0803c5;
        }
        return a(context, i, j, k, dfz1, onclicklistener);
    }

    public static View a(Context context, android.view.View.OnClickListener onclicklistener)
    {
        EmptyView emptyview = new EmptyView(context);
        emptyview.setId(0x7f110348);
        a(emptyview);
        emptyview.a(context.getString(0x7f0803da));
        emptyview.b(context.getString(0x7f0803d8));
        Button button;
        if (ggi.b(context))
        {
            int i = dft.b(16F, context.getResources());
            emptyview.setPadding(emptyview.getPaddingLeft(), i, emptyview.getPaddingRight(), i);
        } else
        {
            emptyview.a(a(context, SpotifyIcon.s));
        }
        button = dgp.e(context, emptyview);
        button.setId(0x7f110022);
        button.setText(0x7f0803d9);
        button.setSingleLine(true);
        button.setEllipsize(android.text.TextUtils.TruncateAt.END);
        emptyview.a(button);
        button.setOnClickListener(onclicklistener);
        context = new ScrollView(context);
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        context.addView(emptyview);
        context.setFillViewport(true);
        return context;
    }

    public static View a(Context context, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0803d4;
        } else
        {
            i = 0x7f0803c4;
        }
        return a(context, 0x7f0803d7, i, a(context, SpotifyIcon.ac), flag);
    }

    public static EmptyView a(Context context, int i)
    {
        EmptyView emptyview = new EmptyView(context);
        a(emptyview);
        emptyview.b().setVisibility(8);
        emptyview.b(context.getString(i));
        return emptyview;
    }

    public static EmptyView a(Context context, String s)
    {
        EmptyView emptyview = new EmptyView(context);
        a(emptyview);
        emptyview.a(context.getString(0x7f0803de, new Object[] {
            s
        }));
        emptyview.b(context.getString(0x7f0803dd));
        emptyview.a(a(context, SpotifyIcon.s));
        return emptyview;
    }

    public static dfz a(Context context, SpotifyIcon spotifyicon)
    {
        spotifyicon = new dfz(context, spotifyicon, context.getResources().getDimensionPixelSize(0x7f0c00d8));
        spotifyicon.a(dgo.b(context, 0x7f0101ca));
        return spotifyicon;
    }

    private static void a(EmptyView emptyview)
    {
        emptyview.b().setSingleLine(false);
        emptyview.b().setEllipsize(null);
        emptyview.c().setSingleLine(false);
        emptyview.c().setEllipsize(null);
    }

    public static View b(Context context, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0803be;
        } else
        {
            i = 0x7f0803c4;
        }
        return a(context, 0x7f0803d5, i, a(context, SpotifyIcon.b), flag);
    }

    public static View c(Context context, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0803c3;
        } else
        {
            i = 0x7f0803c4;
        }
        return a(context, 0x7f0803d6, i, a(context, SpotifyIcon.d), flag);
    }

    public static View d(Context context, boolean flag)
    {
        if (flag)
        {
            return a(context, 0x7f0803d2);
        } else
        {
            android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener(context) {

                private Context a;

                public final void onClick(View view)
                {
                    a.startActivity(gms.a(a, "spotify:hub:shows").a);
                }

            
            {
                a = context;
                super();
            }
            };
            return a(context, 0x7f0803d3, 0x7f0803d0, 0x7f0803d1, a(context, SpotifyIcon.aX), onclicklistener);
        }
    }

    // Unreferenced inner class eoo$3

/* anonymous class */
    public final class _cls3
        implements android.view.View.OnClickListener
    {

        private Context a;

        public final void onClick(View view)
        {
            a.startActivity(gms.a(a, "spotify:hub:shows").a);
        }

            public 
            {
                a = context;
                super();
            }
    }


    // Unreferenced inner class eoo$4

/* anonymous class */
    public final class _cls4
        implements android.view.View.OnClickListener
    {

        private Context a;

        public final void onClick(View view)
        {
            a.startActivity(gms.a(a, "spotify:hub:shows").a);
        }

            public 
            {
                a = context;
                super();
            }
    }

}
