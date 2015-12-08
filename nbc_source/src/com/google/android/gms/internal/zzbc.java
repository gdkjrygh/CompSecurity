// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzbb, zzhs, zzhl

public class zzbc
{

    public zzbc()
    {
    }

    protected zzbb zza(Context context, VersionInfoParcel versioninfoparcel, zzhs zzhs1)
    {
        context = new zzbd(context, versioninfoparcel);
        context.zza(new zzbb.zza(zzhs1, context) {

            final zzhs zzqX;
            final zzbc zzqZ;
            final zzbb zzra;

            public void zzcf()
            {
                zzqX.zzf(zzra);
            }

            
            {
                zzqZ = zzbc.this;
                zzqX = zzhs1;
                zzra = zzbb1;
                super();
            }
        });
        return context;
    }

    public Future zza(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzhs zzhs1 = new zzhs();
        zzhl.zzGk.post(new Runnable(context, versioninfoparcel, zzhs1, s) {

            final Context zzqV;
            final VersionInfoParcel zzqW;
            final zzhs zzqX;
            final String zzqY;
            final zzbc zzqZ;

            public void run()
            {
                zzqZ.zza(zzqV, zzqW, zzqX).zzs(zzqY);
            }

            
            {
                zzqZ = zzbc.this;
                zzqV = context;
                zzqW = versioninfoparcel;
                zzqX = zzhs1;
                zzqY = s;
                super();
            }
        });
        return zzhs1;
    }
}
