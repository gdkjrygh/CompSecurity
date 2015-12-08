// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAdView

public final class NativeContentAdView extends NativeAdView
{

    public NativeContentAdView(Context context)
    {
        super(context);
    }

    public NativeContentAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NativeContentAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public NativeContentAdView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public final View getAdvertiserView()
    {
        return super.zzm("1004");
    }

    public final View getBodyView()
    {
        return super.zzm("1002");
    }

    public final View getCallToActionView()
    {
        return super.zzm("1003");
    }

    public final View getHeadlineView()
    {
        return super.zzm("1001");
    }

    public final View getImageView()
    {
        return super.zzm("1005");
    }

    public final View getLogoView()
    {
        return super.zzm("1006");
    }

    public final void setAdvertiserView(View view)
    {
        super.zza("1004", view);
    }

    public final void setBodyView(View view)
    {
        super.zza("1002", view);
    }

    public final void setCallToActionView(View view)
    {
        super.zza("1003", view);
    }

    public final void setHeadlineView(View view)
    {
        super.zza("1001", view);
    }

    public final void setImageView(View view)
    {
        super.zza("1005", view);
    }

    public final void setLogoView(View view)
    {
        super.zza("1006", view);
    }
}
