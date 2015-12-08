// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            ip

class  extends DataOutputStream
{

    final ip a;

    public void close()
    {
    }

    (ip ip, OutputStream outputstream)
    {
        a = ip;
        super(outputstream);
    }
}
