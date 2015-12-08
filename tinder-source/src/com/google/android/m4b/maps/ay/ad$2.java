// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.dc.b;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ad, ab

final class init> extends init>
{

    private ad a;

    private Map a(b b1)
    {
        b1 = b1.b();
        a.c();
        return b1;
        b1;
        if (ab.a(com.google.android.m4b.maps.ay.ad.b(), 6))
        {
            Log.e(com.google.android.m4b.maps.ay.ad.b(), "An error occurred when fetching the Maps API URL rewriter.");
        }
        a.c();
        return null;
        b1;
        a.c();
        throw b1;
    }

    public final volatile Object a(IInterface iinterface)
    {
        return a((b)iinterface);
    }

    (ad ad1)
    {
        a = ad1;
        super(ad1);
    }
}
