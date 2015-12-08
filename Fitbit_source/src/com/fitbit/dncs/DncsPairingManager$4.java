// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import com.fitbit.bluetooth.g;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.dncs:
//            DncsPairingManager

class a extends c
{

    final DncsPairingManager a;

    protected void a(Intent intent)
    {
        intent.getAction();
        if (!g.h())
        {
            DncsPairingManager.a(a, false);
        }
    }

    (DncsPairingManager dncspairingmanager)
    {
        a = dncspairingmanager;
        super();
    }
}
