// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.ads.mediation.a.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.gm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            aa, SearchAdRequestParcel, AdRequestParcel

public final class j
{

    public static final j a = new j();

    protected j()
    {
    }

    public static AdRequestParcel a(Context context, aa aa1)
    {
        Object obj = aa1.a();
        Object obj1;
        Object obj2;
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
        Context context1;
        int i;
        int k;
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
        s = aa1.b();
        i = aa1.c();
        obj = aa1.d();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = aa1.a(context);
        k = aa1.l();
        location = aa1.e();
        bundle = aa1.a(com/google/ads/mediation/a/a);
        flag1 = aa1.f();
        s1 = aa1.g();
        obj1 = aa1.i();
        if (obj1 != null)
        {
            obj1 = new SearchAdRequestParcel(((com.google.android.gms.ads.search.a) (obj1)));
        } else
        {
            obj1 = null;
        }
        obj2 = null;
        context1 = context.getApplicationContext();
        context = obj2;
        if (context1 != null)
        {
            context = context1.getPackageName();
            p.e();
            context = gm.a(Thread.currentThread().getStackTrace(), context);
        }
        return new AdRequestParcel(6, l, bundle, i, ((java.util.List) (obj)), flag, k, flag1, s1, ((SearchAdRequestParcel) (obj1)), location, s, aa1.k(), aa1.m(), Collections.unmodifiableList(new ArrayList(aa1.n())), aa1.h(), context);
    }

    public static j a()
    {
        return a;
    }

}
