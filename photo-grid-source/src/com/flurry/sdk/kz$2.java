// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.InputStream;

// Referenced classes of package com.flurry.sdk:
//            kz

class eam extends DataInputStream
{

    final kz a;

    public void close()
    {
    }

    eam(kz kz, InputStream inputstream)
    {
        a = kz;
        super(inputstream);
    }
}
