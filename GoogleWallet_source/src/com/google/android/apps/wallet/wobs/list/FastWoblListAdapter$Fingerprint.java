// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.wobs.list:
//            FastWoblListAdapter

static final class bytes
{

    final byte bytes[];

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (bytes)obj;
            return Arrays.equals(bytes, ((bytes) (obj)).bytes);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(bytes);
    }

    (byte abyte0[])
    {
        bytes = abyte0;
    }
}
