// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kx

public class ku
    implements kx
{

    protected final kx a;

    public ku(kx kx1)
    {
        a = kx1;
    }

    public void a(OutputStream outputstream, Object obj)
    {
        if (a != null && outputstream != null && obj != null)
        {
            a.a(outputstream, obj);
        }
    }

    public Object b(InputStream inputstream)
    {
        if (a != null && inputstream != null)
        {
            return a.b(inputstream);
        } else
        {
            return null;
        }
    }
}
