// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.fordsync;

import p.ct.a;

// Referenced classes of package com.pandora.android.fordsync:
//            AppLinkBluetoothService

class a extends Thread
{

    final boolean a;
    final AppLinkBluetoothService b;

    public void run()
    {
        if (a)
        {
            p.ct.a.a().e();
            return;
        } else
        {
            p.ct.a.a().b();
            b.a = false;
            return;
        }
    }

    (AppLinkBluetoothService applinkbluetoothservice, String s, boolean flag)
    {
        b = applinkbluetoothservice;
        a = flag;
        super(s);
    }
}
