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
//            au, ax, aj

public class al
{

    public static final al mb = new al();

    private al()
    {
    }

    public static al aA()
    {
        return mb;
    }

    public aj a(Context context, au au1)
    {
        Object obj = au1.getBirthday();
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
        s = au1.getContentUrl();
        i = au1.getGender();
        obj = au1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = au1.isTestDevice(context);
        j = au1.aF();
        location = au1.getLocation();
        bundle = au1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = au1.getManualImpressionsEnabled();
        s1 = au1.getPublisherProvidedId();
        context = au1.aC();
        if (context != null)
        {
            context = new ax(context);
        } else
        {
            context = null;
        }
        return new aj(4, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, au1.aE());
    }

}
