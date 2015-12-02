// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;

import com.google.common.base.Optional;

// Referenced classes of package com.facebook.mqtt:
//            b, a

class l
{

    public final boolean a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    final b e;

    public l(b b1)
    {
        this(b1, true, Optional.absent(), Optional.absent(), Optional.absent());
    }

    public l(b b1, a a1)
    {
        this(b1, false, Optional.of(a1), Optional.absent(), Optional.absent());
    }

    public l(b b1, a a1, byte byte0)
    {
        this(b1, false, Optional.of(a1), Optional.absent(), Optional.of(Byte.valueOf(byte0)));
    }

    public l(b b1, a a1, Exception exception)
    {
        this(b1, false, Optional.of(a1), Optional.fromNullable(exception), Optional.absent());
    }

    private l(b b1, boolean flag, Optional optional, Optional optional1, Optional optional2)
    {
        e = b1;
        super();
        a = flag;
        b = optional;
        c = optional1;
        d = optional2;
    }
}
