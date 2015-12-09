// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            t

public final class r
{

    public static transient int a(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static t a(Object obj)
    {
        return new t(obj, null);
    }
}
