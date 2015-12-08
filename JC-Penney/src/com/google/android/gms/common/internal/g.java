// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            b

final class g extends b
{

    final char p[];

    g(char ac[])
    {
        p = ac;
        super();
    }

    public boolean b(char c)
    {
        return Arrays.binarySearch(p, c) >= 0;
    }
}
