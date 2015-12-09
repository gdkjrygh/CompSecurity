// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.ArrayList;

// Referenced classes of package com.android.slyce.a:
//            bj, az

class bh
    implements bj
{

    final az a;

    bh(az az1)
    {
        a = az1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
        az.a(a).add(new String(abyte0));
    }
}
