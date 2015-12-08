// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAdView

public final class NativeAppInstallAdView extends NativeAdView
{

    public NativeAppInstallAdView(Context context)
    {
        super(context);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public final View getBodyView()
    {
        return super.a("2004");
    }

    public final View getCallToActionView()
    {
        return super.a("2002");
    }

    public final View getHeadlineView()
    {
        return super.a("2001");
    }

    public final View getIconView()
    {
        return super.a("2003");
    }

    public final View getImageView()
    {
        return super.a("2007");
    }

    public final View getPriceView()
    {
        return super.a("2006");
    }

    public final View getStarRatingView()
    {
        return super.a("2008");
    }

    public final View getStoreView()
    {
        return super.a("2005");
    }

    public final void setBodyView(View view)
    {
        super.a("2004", view);
    }

    public final void setCallToActionView(View view)
    {
        super.a("2002", view);
    }

    public final void setHeadlineView(View view)
    {
        super.a("2001", view);
    }

    public final void setIconView(View view)
    {
        super.a("2003", view);
    }

    public final void setImageView(View view)
    {
        super.a("2007", view);
    }

    public final void setPriceView(View view)
    {
        super.a("2006", view);
    }

    public final void setStarRatingView(View view)
    {
        super.a("2008", view);
    }

    public final void setStoreView(View view)
    {
        super.a("2005", view);
    }
}
