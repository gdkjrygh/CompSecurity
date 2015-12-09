// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.ja;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

class zzEs
    implements Runnable
{

    final OutputStream zzEr;
    final byte zzEs[];
    final LargeParcelTeleporter zzEt;

    public void run()
    {
        DataOutputStream dataoutputstream = new DataOutputStream(zzEr);
        dataoutputstream.writeInt(zzEs.length);
        dataoutputstream.write(zzEs);
        ja.a(dataoutputstream);
        return;
        Object obj;
        obj;
        zzb.zzb("Error transporting the ad response", ((Throwable) (obj)));
        zzp.zzbA().a(((Throwable) (obj)), true);
        ja.a(dataoutputstream);
        return;
        obj;
        ja.a(dataoutputstream);
        throw obj;
    }

    I(LargeParcelTeleporter largeparcelteleporter, OutputStream outputstream, byte abyte0[])
    {
        zzEt = largeparcelteleporter;
        zzEr = outputstream;
        zzEs = abyte0;
        super();
    }
}
