// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import bka;
import bkv;
import cix;
import cnt;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

final class b
    implements Runnable
{

    private OutputStream a;
    private byte b[];

    public final void run()
    {
        DataOutputStream dataoutputstream1 = new DataOutputStream(a);
        DataOutputStream dataoutputstream = dataoutputstream1;
        dataoutputstream1.writeInt(b.length);
        dataoutputstream = dataoutputstream1;
        dataoutputstream1.write(b);
        cnt.a(dataoutputstream1);
        return;
        IOException ioexception;
        ioexception;
        dataoutputstream1 = null;
_L4:
        dataoutputstream = dataoutputstream1;
        bka.b("Error transporting the ad response", ioexception);
        dataoutputstream = dataoutputstream1;
        bkv.h().a(ioexception, true);
        if (dataoutputstream1 == null)
        {
            cnt.a(a);
            return;
        } else
        {
            cnt.a(dataoutputstream1);
            return;
        }
        Exception exception;
        exception;
        dataoutputstream = null;
_L2:
        if (dataoutputstream == null)
        {
            cnt.a(a);
        } else
        {
            cnt.a(dataoutputstream);
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    I(OutputStream outputstream, byte abyte0[])
    {
        a = outputstream;
        b = abyte0;
        super();
    }
}
