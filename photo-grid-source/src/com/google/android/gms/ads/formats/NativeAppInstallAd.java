// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAd

public abstract class NativeAppInstallAd extends NativeAd
{

    public NativeAppInstallAd()
    {
    }

    public abstract CharSequence getBody();

    public abstract CharSequence getCallToAction();

    public abstract Bundle getExtras();

    public abstract CharSequence getHeadline();

    public abstract NativeAd.Image getIcon();

    public abstract List getImages();

    public abstract CharSequence getPrice();

    public abstract Double getStarRating();

    public abstract CharSequence getStore();
}
