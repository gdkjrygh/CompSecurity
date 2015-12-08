// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

public final class bfo
{

    private static bfo a = new bfo();

    protected bfo()
    {
    }

    public static bfo a()
    {
        return a;
    }

    public static AdRequestParcel a(Context context, bgw bgw1)
    {
        Object obj = bgw1.b;
        Object obj1;
        android.location.Location location;
        Bundle bundle;
        String s;
        Context context1;
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
        obj = bgw1.c;
        i = bgw1.d;
        obj = bgw1.e;
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        obj1 = bgw1.n;
        bfq.a();
        flag = ((Set) (obj1)).contains(bjz.a(context));
        j = bgw1.m;
        location = bgw1.f;
        bundle = bgw1.h.getBundle(ayk.getName());
        flag1 = bgw1.g;
        s = bgw1.j;
        obj1 = bgw1.l;
        obj1 = null;
        context1 = context.getApplicationContext();
        context = ((Context) (obj1));
        if (context1 != null)
        {
            context = context1.getPackageName();
            bkv.e();
            context = cjj.a(Thread.currentThread().getStackTrace(), context);
        }
        return new AdRequestParcel(6, l, bundle, i, ((java.util.List) (obj)), flag, j, false, s, null, location, null, bgw1.h, bgw1.o, Collections.unmodifiableList(new ArrayList(bgw1.p)), bgw1.k, context);
    }

}
