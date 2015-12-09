// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.kg;

// Referenced classes of package com.google.android.gms.location:
//            l, d, g, p

public final class k
{

    public static final c a;
    public static d b = new je();
    public static g c = new jh();
    public static p d = new kg();
    private static final j e;
    private static final i f;

    static j a()
    {
        return e;
    }

    public static jy a(l l1)
    {
        boolean flag1 = true;
        boolean flag;
        if (l1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, "GoogleApiClient parameter is required.");
        l1 = (jy)l1.a(e);
        if (l1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ap.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return l1;
    }

    static 
    {
        e = new j();
        f = new com.google.android.gms.location.l();
        a = new c(f, e, new Scope[0]);
    }
}
