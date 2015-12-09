// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            xx

final class yg
{

    final byte bytes[];
    final int tag;

    final int c()
    {
        return xx.mn(tag) + 0 + bytes.length;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof yg))
            {
                return false;
            }
            obj = (yg)obj;
            if (tag != ((yg) (obj)).tag || !Arrays.equals(bytes, ((yg) (obj)).bytes))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(bytes);
    }

    final void writeTo(xx xx1)
        throws IOException
    {
        xx1.mm(tag);
        xx1.x(bytes);
    }
}
