// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.bx;

// Referenced classes of package com.google.android.gms.ads.formats:
//            a

public abstract class NativeAdView extends FrameLayout
{

    private final FrameLayout a;
    private final bm b;

    public NativeAdView(Context context)
    {
        super(context);
        a = a(context);
        b = a();
    }

    public NativeAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = a(context);
        b = a();
    }

    public NativeAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = a(context);
        b = a();
    }

    private FrameLayout a(Context context)
    {
        context = new FrameLayout(context);
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(context);
        return context;
    }

    private bm a()
    {
        y.a(a, "createDelegate must be called after mOverlayFrame has been created");
        return n.d().a(a.getContext(), this, a);
    }

    protected final void a(String s, View view)
    {
        try
        {
            b.a(s, d.a(view));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Unable to call setAssetView on delegate", s);
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        super.bringChildToFront(a);
    }

    public void bringChildToFront(View view)
    {
        super.bringChildToFront(view);
        if (a != view)
        {
            super.bringChildToFront(a);
        }
    }

    public void removeAllViews()
    {
        super.removeAllViews();
        super.addView(a);
    }

    public void removeView(View view)
    {
        if (a == view)
        {
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    public void setNativeAd(a a1)
    {
        try
        {
            b.a((c)a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Unable to call setNativeAd on delegate", a1);
        }
    }
}
