// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import av;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zzqy

public final class zzrh extends zzqy
{

    private String zzasq;
    private int zzasr;
    private int zzass;
    private String zzast;
    private String zzasu;
    private boolean zzasv;
    private boolean zzasw;
    private boolean zzasx;

    public zzrh()
    {
        this(false);
    }

    public zzrh(boolean flag)
    {
        this(flag, zzrd());
    }

    public zzrh(boolean flag, int i)
    {
        zzx.zzaL(i);
        zzasr = i;
        zzasw = flag;
    }

    static int zzrd()
    {
        UUID uuid = UUID.randomUUID();
        int i = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (i == 0)
        {
            int j = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
            i = j;
            if (j == 0)
            {
                return 0x7fffffff;
            }
        }
        return i;
    }

    private void zzrj()
    {
        if (zzasx)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public final boolean isMutable()
    {
        return !zzasx;
    }

    public final void setScreenName(String s)
    {
        zzrj();
        zzasq = s;
    }

    public final String toString()
    {
        av av1 = new av();
        av1.put("screenName", zzasq);
        av1.put("interstitial", Boolean.valueOf(zzasv));
        av1.put("automatic", Boolean.valueOf(zzasw));
        av1.put("screenId", Integer.valueOf(zzasr));
        av1.put("referrerScreenId", Integer.valueOf(zzass));
        av1.put("referrerScreenName", zzast);
        av1.put("referrerUri", zzasu);
        return zzG(av1);
    }

    public final int zzaF()
    {
        return zzasr;
    }

    public final void zzaa(boolean flag)
    {
        zzrj();
        zzasv = flag;
    }

    public final void zzcv(String s)
    {
        zzrj();
        zzast = s;
    }

    public final void zzgr(int i)
    {
        zzrj();
        zzass = i;
    }

    public final String zzre()
    {
        return zzasq;
    }

    public final int zzrf()
    {
        return zzass;
    }

    public final String zzrg()
    {
        return zzast;
    }

    public final void zzrh()
    {
        zzasx = true;
    }

    public final boolean zzri()
    {
        return zzasv;
    }
}
