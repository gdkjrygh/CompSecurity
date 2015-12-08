// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.b;

import com.fitbit.bluetooth.b.b;
import com.fitbit.bluetooth.broadcom.gatt.s;
import com.fitbit.bluetooth.broadcom.gatt.y;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.b:
//            g, b, d

public final class f extends y
{

    static final UUID a;

    public f()
    {
        super(a, s.b);
        a(new g());
        a(new com.fitbit.bluetooth.broadcom.b.b());
        a(new d());
    }

    static 
    {
        a = b.e;
    }
}
