// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.InputStream;

// Referenced classes of package com.flurry.sdk:
//            gz

class eam extends DataInputStream
{

    final gz a;

    public void close()
    {
    }

    eam(gz gz1, InputStream inputstream)
    {
        a = gz1;
        super(inputstream);
    }
}
