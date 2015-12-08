// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.resource.TextDrawable;
import com.mopub.network.Networking;
import com.mopub.volley.toolbox.ImageLoader;

// Referenced classes of package com.mopub.mobileads:
//            ap, ao

final class an extends RelativeLayout
{

    private TextView a;
    private ImageView b;
    private final ImageLoader c;
    private final int d;
    private final int e;
    private final int f;

    private an(ap ap1)
    {
        super(ap.a(ap1));
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -2, ap.b(ap1));
        layoutparams.gravity = ap.c(ap1);
        setLayoutParams(layoutparams);
        d = Dips.dipsToIntPixels(5F, getContext());
        e = Dips.dipsToIntPixels(5F, getContext());
        f = Dips.dipsToIntPixels(37F, getContext());
        c = Networking.getImageLoader(getContext());
        setVisibility(ap.d(ap1));
        if (ap.e(ap1) && ap.f(ap1) != null)
        {
            b = new ImageView(getContext());
            b.setId((int)Utils.generateUniqueId());
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(f, f);
            layoutparams1.addRule(15);
            layoutparams1.addRule(ap.g(ap1));
            b.setPadding(e, e, e, e);
            b.setBackgroundColor(0xff000000);
            b.getBackground().setAlpha(0);
            b.setImageDrawable(ap.f(ap1));
            addView(b, layoutparams1);
        }
        if (ap.h(ap1))
        {
            a = new TextView(getContext());
            a.setSingleLine();
            a.setEllipsize(android.text.TextUtils.TruncateAt.END);
            a.setText(ap.i(ap1));
            android.widget.RelativeLayout.LayoutParams layoutparams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams2.addRule(15);
            if (b != null)
            {
                layoutparams2.addRule(0, b.getId());
            } else
            {
                layoutparams2.addRule(ap.j(ap1));
            }
            a.setPadding(d, d, d, d);
            addView(a, layoutparams2);
        }
        if (ap.k(ap1) != null)
        {
            setOnTouchListener(ap.k(ap1));
        }
    }

    an(ap ap1, byte byte0)
    {
        this(ap1);
    }

    static ImageView a(an an1)
    {
        return an1.b;
    }

    final void a(String s)
    {
        if (a != null)
        {
            a.setText(s);
        }
    }

    final void b(String s)
    {
        try
        {
            ((TextDrawable)b.getDrawable()).updateText(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MoPubLog.d("Unable to update ToolbarWidget text.");
        }
    }

    final void c(String s)
    {
        c.get(s, new ao(this, s));
    }
}
