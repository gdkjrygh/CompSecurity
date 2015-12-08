// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            at, aw, ai

public class ak
{

    public static final ak md = new ak();

    private ak()
    {
    }

    public static ak aF()
    {
        return md;
    }

    public ai a(Context context, at at1)
    {
        Object obj = at1.getBirthday();
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
        int i;
        int j;
        long l;
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            l = ((Date) (obj)).getTime();
        } else
        {
            l = -1L;
        }
        s = at1.getContentUrl();
        i = at1.getGender();
        obj = at1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = at1.isTestDevice(context);
        j = at1.aK();
        location = at1.getLocation();
        bundle = at1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = at1.getManualImpressionsEnabled();
        s1 = at1.getPublisherProvidedId();
        context = at1.aH();
        if (context != null)
        {
            context = new aw(context);
        } else
        {
            context = null;
        }
        return new ai(4, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, at1.aJ());
    }

}
