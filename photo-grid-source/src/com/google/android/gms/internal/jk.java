// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jc, dw

public final class jk extends jc
{

    private final NativeAppInstallAdMapper a;

    public jk(NativeAppInstallAdMapper nativeappinstalladmapper)
    {
        a = nativeappinstalladmapper;
    }

    public final String a()
    {
        return a.getHeadline();
    }

    public final void a(a a1)
    {
        a.handleClick((View)com.google.android.gms.b.d.a(a1));
    }

    public final List b()
    {
        Object obj = a.getImages();
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            com.google.android.gms.ads.formats.NativeAd.Image image;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new zzc(image.getDrawable(), image.getUri(), image.getScale())))
            {
                image = (com.google.android.gms.ads.formats.NativeAd.Image)((Iterator) (obj)).next();
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public final void b(a a1)
    {
        a.trackView((View)com.google.android.gms.b.d.a(a1));
    }

    public final String c()
    {
        return a.getBody();
    }

    public final dw d()
    {
        com.google.android.gms.ads.formats.NativeAd.Image image = a.getIcon();
        if (image != null)
        {
            return new zzc(image.getDrawable(), image.getUri(), image.getScale());
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        return a.getCallToAction();
    }

    public final double f()
    {
        return a.getStarRating();
    }

    public final String g()
    {
        return a.getStore();
    }

    public final String h()
    {
        return a.getPrice();
    }

    public final void i()
    {
        a.recordImpression();
    }

    public final boolean j()
    {
        return a.getOverrideImpressionRecording();
    }

    public final boolean k()
    {
        return a.getOverrideClickHandling();
    }

    public final Bundle l()
    {
        return a.getExtras();
    }
}
