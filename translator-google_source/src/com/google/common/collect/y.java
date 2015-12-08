// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            x, ed, w

final class y extends x
    implements Set
{

    final w b;

    y(w w)
    {
        b = w;
        super(w, (byte)0);
    }

    public final boolean equals(Object obj)
    {
        return ed.a(this, obj);
    }

    public final int hashCode()
    {
        return ed.a(this);
    }
}
