// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.fitbit.serverinteraction:
//            RequestParametersBuilder

private static class a extends a
{

    private byte a[];

    InputStream a()
    {
        return new ByteArrayInputStream(a);
    }

    public int b()
    {
        return a.length;
    }

    public String toString()
    {
        if (a.length > 2048)
        {
            return (new StringBuilder()).append("<< Content lenght: ").append(a.length).append(" >>").toString();
        } else
        {
            return Arrays.toString(a);
        }
    }

    public (byte abyte0[])
    {
        a = abyte0;
    }
}
