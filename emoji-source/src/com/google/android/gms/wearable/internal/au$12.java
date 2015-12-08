// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, au, v

class t> extends a
{

    final au amh;
    final com.google.android.gms.common.api..au ami;

    public void a(v v1)
    {
        ami.ami(new nit>(new Status(v1.statusCode), v1.alO));
    }

    (au au1, com.google.android.gms.common.api..au au2)
    {
        amh = au1;
        ami = au2;
        super();
    }
}
