// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            gw

class  extends DataOutputStream
{

    final gw a;

    public void close()
    {
    }

    (gw gw1, OutputStream outputstream)
    {
        a = gw1;
        super(outputstream);
    }
}
