// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import di;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo, zzbs, zzax

public class zzaz
{

    public static final zzaz zzoZ = new zzaz();

    protected zzaz()
    {
    }

    public static zzaz zzbA()
    {
        return zzoZ;
    }

    public zzax zza(Context context, zzbo zzbo1)
    {
        Object obj = zzbo1.getBirthday();
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
        s = zzbo1.getContentUrl();
        i = zzbo1.getGender();
        obj = zzbo1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = zzbo1.isTestDevice(context);
        j = zzbo1.zzbL();
        location = zzbo1.getLocation();
        bundle = zzbo1.getNetworkExtrasBundle(di);
        flag1 = zzbo1.getManualImpressionsEnabled();
        s1 = zzbo1.getPublisherProvidedId();
        context = zzbo1.zzbI();
        if (context != null)
        {
            context = new zzbs(context);
        } else
        {
            context = null;
        }
        return new zzax(5, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, zzbo1.zzbK(), zzbo1.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzbo1.zzbM())), zzbo1.zzbH());
    }

}
