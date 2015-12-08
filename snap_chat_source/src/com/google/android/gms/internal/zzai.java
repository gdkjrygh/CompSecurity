// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzaj, zzah, zzhq, zzhw, 
//            zzhy

public class zzai
{

    public zzai()
    {
    }

    protected zzah zza(Context context, zzhy zzhy, zzhq zzhq1)
    {
        context = new zzaj(context, zzhy);
        context.zza(new zzah.zza(zzhq1, context) {

            final zzhq zznM;
            final zzai zznO;
            final zzah zznP;

            public void zzbk()
            {
                zznM.zzb(zznP);
            }

            
            {
                zznO = zzai.this;
                zznM = zzhq1;
                zznP = zzah1;
                super();
            }
        });
        return context;
    }

    public Future zza(Context context, zzhy zzhy, String s)
    {
        zzhq zzhq1 = new zzhq();
        zzhw.zzzG.post(new Runnable(context, zzhy, zzhq1, s) {

            final Context zznK;
            final zzhy zznL;
            final zzhq zznM;
            final String zznN;
            final zzai zznO;

            public void run()
            {
                zznO.zza(zznK, zznL, zznM).zzg(zznN);
            }

            
            {
                zznO = zzai.this;
                zznK = context;
                zznL = zzhy;
                zznM = zzhq1;
                zznN = s;
                super();
            }
        });
        return zzhq1;
    }
}
