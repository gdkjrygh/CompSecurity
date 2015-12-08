// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import com.fitbit.bluetooth.e;
import com.fitbit.synclair.SynclairManager;
import com.fitbit.synclair.ui.a.f;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairActivity

class a extends e
{

    final SynclairActivity a;

    protected void l()
    {
        SynclairManager synclairmanager = a.D().g();
        if (synclairmanager.D() && !synclairmanager.Q())
        {
            a.J();
            a.I();
        }
    }

    (SynclairActivity synclairactivity)
    {
        a = synclairactivity;
        super();
    }
}
