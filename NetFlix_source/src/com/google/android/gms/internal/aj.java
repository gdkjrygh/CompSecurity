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
//            as, av, ah

public class aj
{

    public static final aj lR = new aj();

    private aj()
    {
    }

    public static aj az()
    {
        return lR;
    }

    public ah a(Context context, as as1)
    {
        Object obj = as1.getBirthday();
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
        s = as1.getContentUrl();
        i = as1.getGender();
        obj = as1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = as1.isTestDevice(context);
        j = as1.aE();
        location = as1.getLocation();
        bundle = as1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = as1.getManualImpressionsEnabled();
        s1 = as1.getPublisherProvidedId();
        context = as1.aB();
        if (context != null)
        {
            context = new av(context);
        } else
        {
            context = null;
        }
        return new ah(3, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s);
    }

}
