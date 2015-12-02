// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.a:
//            eb, ii

public abstract class ea
{

    ii a;

    ea()
    {
    }

    ii a()
    {
        return (ii)Objects.firstNonNull(a, eb.INSTANCE);
    }
}
