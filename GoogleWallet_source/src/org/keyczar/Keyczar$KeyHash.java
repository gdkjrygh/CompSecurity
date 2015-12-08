// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            Keyczar

final class <init>
{

    private byte data[];
    final Keyczar this$0;

    public final boolean equals(Object obj)
    {
        return (obj instanceof <init>) && obj.hashCode() == hashCode();
    }

    public final int hashCode()
    {
        return Util.toInt(data);
    }

    private eption(byte abyte0[])
    {
        this$0 = Keyczar.this;
        super();
        if (abyte0.length != 4)
        {
            throw new IllegalArgumentException();
        } else
        {
            data = abyte0;
            return;
        }
    }

    data(byte abyte0[], data data1)
    {
        this(abyte0);
    }
}
