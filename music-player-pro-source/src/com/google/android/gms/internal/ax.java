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
//            bg, bj, av

public class ax
{

    public static final ax oo = new ax();

    private ax()
    {
    }

    public static ax bg()
    {
        return oo;
    }

    public av a(Context context, bg bg1)
    {
        Object obj = bg1.getBirthday();
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
        s = bg1.getContentUrl();
        i = bg1.getGender();
        obj = bg1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = bg1.isTestDevice(context);
        j = bg1.bl();
        location = bg1.getLocation();
        bundle = bg1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = bg1.getManualImpressionsEnabled();
        s1 = bg1.getPublisherProvidedId();
        context = bg1.bi();
        if (context != null)
        {
            context = new bj(context);
        } else
        {
            context = null;
        }
        return new av(4, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, bg1.bk());
    }

}
