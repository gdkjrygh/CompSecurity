// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzlg;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

class zzDd
    implements Runnable
{

    final OutputStream zzDc;
    final byte zzDd[];
    final LargeParcelTeleporter zzDe;

    public void run()
    {
        DataOutputStream dataoutputstream = new DataOutputStream(zzDc);
        dataoutputstream.writeInt(zzDd.length);
        dataoutputstream.write(zzDd);
        zzlg.zzb(dataoutputstream);
        return;
        Object obj;
        obj;
        zzb.zzb("Error transporting the ad response", ((Throwable) (obj)));
        zzo.zzby().zzc(((Throwable) (obj)), true);
        zzlg.zzb(dataoutputstream);
        return;
        obj;
        zzlg.zzb(dataoutputstream);
        throw obj;
    }

    I(LargeParcelTeleporter largeparcelteleporter, OutputStream outputstream, byte abyte0[])
    {
        zzDe = largeparcelteleporter;
        zzDc = outputstream;
        zzDd = abyte0;
        super();
    }
}
