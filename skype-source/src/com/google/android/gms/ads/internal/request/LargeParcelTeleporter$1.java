// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.iq;
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
        DataOutputStream dataoutputstream = new DataOutputStream(a);
        dataoutputstream.writeInt(b.length);
        dataoutputstream.write(b);
        iq.a(dataoutputstream);
        return;
        Object obj;
        obj;
        com.google.android.gms.ads.internal.util.client.b.a("Error transporting the ad response", ((Throwable) (obj)));
        p.h().a(((Throwable) (obj)), true);
        iq.a(dataoutputstream);
        return;
        obj;
        iq.a(dataoutputstream);
        throw obj;
    }

    I(LargeParcelTeleporter largeparcelteleporter, OutputStream outputstream, byte abyte0[])
    {
        c = largeparcelteleporter;
        a = outputstream;
        b = abyte0;
        super();
    }
}
