// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.fitbit.serverinteraction:
//            RequestParametersBuilder

private static class a extends a
{

    private final String a;

    InputStream a()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return new ByteArrayInputStream(a.getBytes());
        }
    }

    public int b()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getBytes().length;
        }
    }

    public String toString()
    {
        return a;
    }

    public (String s)
    {
        a = s;
    }
}
