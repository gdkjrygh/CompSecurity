// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.ea;
import com.google.android.gms.internal.ff;

// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAd

public abstract class NativeAdView extends FrameLayout
{

    private final FrameLayout a;
    private final ea b;

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

    public NativeAdView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
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

    private ea a()
    {
        bl.a(a, "createDelegate must be called after mOverlayFrame has been created");
        return zzl.zzcJ().a(a.getContext(), this, a);
    }

    protected final View a(String s)
    {
        s = b.zzW(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        s = (View)d.a(s);
        return s;
        s;
        zzb.zzb("Unable to call getAssetView on delegate", s);
        return null;
    }

    protected final void a(String s, View view)
    {
        try
        {
            b.zza(s, d.a(view));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Unable to call setAssetView on delegate", s);
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

    public void setNativeAd(NativeAd nativead)
    {
        try
        {
            b.zzb((a)nativead.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NativeAd nativead)
        {
            zzb.zzb("Unable to call setNativeAd on delegate", nativead);
        }
    }
}
