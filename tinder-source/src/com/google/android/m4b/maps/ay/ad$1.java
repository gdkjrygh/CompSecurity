// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.dc.b;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ad, ab

final class init> extends init>
{

    private a a;
    private ad b;

    private Void a(b b1)
    {
        boolean flag = b1.a();
        b.c();
_L2:
        a.a(flag);
        return null;
        b1;
        if (ab.a(com.google.android.m4b.maps.ay.ad.b(), 6))
        {
            Log.e(com.google.android.m4b.maps.ay.ad.b(), "An error occurred when checking if the Maps API should be blocked.");
        }
        flag = true;
        b.c();
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        b.c();
        throw b1;
    }

    public final volatile Object a(IInterface iinterface)
    {
        return a((b)iinterface);
    }

    (ad ad1,  )
    {
        b = ad1;
        a = ;
        super(ad1);
    }
}
