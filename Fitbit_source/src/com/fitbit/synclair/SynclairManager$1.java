// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import android.content.Intent;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.synclair:
//            SynclairManager

class a
    implements Runnable
{

    final SynclairManager a;

    public void run()
    {
        z.a(new Intent(a.l()));
    }

    (SynclairManager synclairmanager)
    {
        a = synclairmanager;
        super();
    }
}
