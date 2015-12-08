// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class ema extends LinearLayout
{

    public int a;
    public final gji b;
    private final elr c;

    public ema(Context context, int i)
    {
        int j = 0;
        super(context);
        c = new elr(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.J, ViewUri.s, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i));
        setOrientation(0);
        setBackgroundResource(0x7f020277);
        int k = getResources().getDimensionPixelSize(0x7f0c009c);
        setPadding(k, k, k, k);
        a = i;
        for (; j < i; j++)
        {
            addView(elt.a(getContext()), j);
        }

        dmz.a(gjj);
        b = gjj.a(context);
    }

    static elr a(ema ema1)
    {
        return ema1.c;
    }

    // Unreferenced inner class ema$1

/* anonymous class */
    public final class _cls1
        implements android.view.View.OnClickListener
    {

        private int a;
        private String b;
        private String c;
        private ema d;

        public final void onClick(View view)
        {
            ema.a(d).a(d.getContext(), a, "root", b, c);
        }

            public 
            {
                d = ema.this;
                a = i;
                b = s;
                c = s1;
                super();
            }
    }

}
