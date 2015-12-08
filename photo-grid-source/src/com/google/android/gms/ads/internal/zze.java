// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp

public class zze
{

    private zza a;
    private boolean b;
    private boolean c;

    public zze()
    {
        com.google.android.gms.internal.cq cq = cy.i;
        c = ((Boolean)com.google.android.gms.ads.internal.zzp.zzbE().a(cq)).booleanValue();
    }

    public zze(boolean flag)
    {
        c = flag;
    }

    public void recordClick()
    {
        b = true;
    }

    public void zza(zza zza1)
    {
        a = zza1;
    }

    public boolean zzbe()
    {
        return !c || b;
    }

    public void zzp(String s)
    {
        zzb.zzaF("Action was blocked because no click was detected.");
        if (a != null)
        {
            a.zzq(s);
        }
    }

    private class zza
    {

        public abstract void zzq(String s);
    }

}
