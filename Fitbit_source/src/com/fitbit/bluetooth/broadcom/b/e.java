// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.b;

import com.fitbit.bluetooth.broadcom.gatt.j;
import com.fitbit.bluetooth.broadcom.gatt.u;
import com.fitbit.bluetooth.broadcom.gatt.w;
import java.util.UUID;

abstract class e extends u
{

    e(UUID uuid, int i, int k)
    {
        super(uuid, i, k);
        uuid = new w(j.l, j.d | j.g);
        uuid.a(j.b);
        a(uuid);
    }
}
