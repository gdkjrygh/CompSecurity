// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            j

final class o extends j
{

    final char p[];

    o(char ac[])
    {
        p = ac;
        super();
    }

    public final boolean a(char c)
    {
        return Arrays.binarySearch(p, c) >= 0;
    }
}
