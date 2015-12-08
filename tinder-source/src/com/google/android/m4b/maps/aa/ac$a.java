// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.EnumMap;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ac

static final class a
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private EnumMap a;

    final Object readResolve()
    {
        return new ac(a, (byte)0);
    }

    (EnumMap enummap)
    {
        a = enummap;
    }
}
