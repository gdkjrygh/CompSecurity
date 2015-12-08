// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzhy;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

class b
    implements Runnable
{

    final OutputStream a;
    final byte b[];
    final LargeParcelTeleporter c;

    public void run()
    {
        DataOutputStream dataoutputstream = new DataOutputStream(a);
        dataoutputstream.writeInt(b.length);
        dataoutputstream.write(b);
        zzhy.zzb(dataoutputstream);
        return;
        Object obj;
        obj;
        zzb.zzb("Error transporting the ad response", ((Throwable) (obj)));
        zzh.zzaT().zzc(((Throwable) (obj)), true);
        zzhy.zzb(dataoutputstream);
        return;
        obj;
        zzhy.zzb(dataoutputstream);
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
