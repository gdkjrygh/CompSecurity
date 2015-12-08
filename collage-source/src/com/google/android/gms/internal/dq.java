// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bj

public class dq extends dl.a
{

    private final NativeAppInstallAdMapper a;

    public dq(NativeAppInstallAdMapper nativeappinstalladmapper)
    {
        a = nativeappinstalladmapper;
    }

    public String a()
    {
        return a.getHeadline();
    }

    public void a(a a1)
    {
        a.handleClick((View)com.google.android.gms.a.b.a(a1));
    }

    public List b()
    {
        Object obj = a.getImages();
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            com.google.android.gms.ads.formats.NativeAd.Image image;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new zzc(image.getDrawable(), image.getUri())))
            {
                image = (com.google.android.gms.ads.formats.NativeAd.Image)((Iterator) (obj)).next();
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public void b(a a1)
    {
        a.trackView((View)com.google.android.gms.a.b.a(a1));
    }

    public String c()
    {
        return a.getBody();
    }

    public bj d()
    {
        com.google.android.gms.ads.formats.NativeAd.Image image = a.getIcon();
        if (image != null)
        {
            return new zzc(image.getDrawable(), image.getUri());
        } else
        {
            return null;
        }
    }

    public String e()
    {
        return a.getCallToAction();
    }

    public double f()
    {
        return a.getStarRating();
    }

    public String g()
    {
        return a.getStore();
    }

    public String h()
    {
        return a.getPrice();
    }

    public void i()
    {
        a.recordImpression();
    }

    public boolean j()
    {
        return a.getOverrideImpressionRecording();
    }

    public boolean k()
    {
        return a.getOverrideClickHandling();
    }

    public Bundle l()
    {
        return a.getExtras();
    }
}
