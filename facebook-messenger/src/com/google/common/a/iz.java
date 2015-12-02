// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Set;

// Referenced classes of package com.google.common.a:
//            iy, kl

abstract class iz extends iy
    implements Set
{

    iz()
    {
    }

    public boolean equals(Object obj)
    {
        return kl.a(this, obj);
    }

    public int hashCode()
    {
        return kl.a(this);
    }
}
