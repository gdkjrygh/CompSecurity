// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.b;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ax

public static final class b
    implements b
{

    private final String a;
    private final Set b;

    public final String a()
    {
        return a;
    }

    public final Set b()
    {
        return b;
    }

    public (b b1)
    {
        this(b1.a(), b1.b());
    }

    private <init>(String s, Set set)
    {
        a = s;
        b = set;
    }
}
