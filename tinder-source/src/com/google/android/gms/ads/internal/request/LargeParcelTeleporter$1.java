// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.ei;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

final class b
    implements Runnable
{

    final OutputStream a;
    final byte b[];
    final LargeParcelTeleporter c;

    public final void run()
    {
        DataOutputStream dataoutputstream1 = new DataOutputStream(a);
        DataOutputStream dataoutputstream = dataoutputstream1;
        dataoutputstream1.writeInt(b.length);
        dataoutputstream = dataoutputstream1;
        dataoutputstream1.write(b);
        ei.a(dataoutputstream1);
        return;
        IOException ioexception;
        ioexception;
        dataoutputstream1 = null;
_L4:
        dataoutputstream = dataoutputstream1;
        com.google.android.gms.ads.internal.util.client.b.b("Error transporting the ad response", ioexception);
        dataoutputstream = dataoutputstream1;
        d.f().a(ioexception, true);
        if (dataoutputstream1 == null)
        {
            ei.a(a);
            return;
        } else
        {
            ei.a(dataoutputstream1);
            return;
        }
        Exception exception;
        exception;
        dataoutputstream = null;
_L2:
        if (dataoutputstream == null)
        {
            ei.a(a);
        } else
        {
            ei.a(dataoutputstream);
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    I(LargeParcelTeleporter largeparcelteleporter, OutputStream outputstream, byte abyte0[])
    {
        c = largeparcelteleporter;
        a = outputstream;
        b = abyte0;
        super();
    }
}
