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

    public final void setAdvertiserView(View view)
    {
        super.a("1004", view);
    }

    public final void setBodyView(View view)
    {
        super.a("1002", view);
    }

    public final void setCallToActionView(View view)
    {
        super.a("1003", view);
    }

    public final void setHeadlineView(View view)
    {
        super.a("1001", view);
    }

    public final void setImageView(View view)
    {
        super.a("1005", view);
    }

    public final void setLogoView(View view)
    {
        super.a("1006", view);
    }
}
