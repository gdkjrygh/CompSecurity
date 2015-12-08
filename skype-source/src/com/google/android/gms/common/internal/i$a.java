// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            i, y

public static final class a
{

    public final Set a;
    public final boolean b = true;

    public (Set set)
    {
        y.a(set);
        a = Collections.unmodifiableSet(set);
    }
}
