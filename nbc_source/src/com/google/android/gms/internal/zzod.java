// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzod extends zznq
{

    private String zzaEJ;
    private int zzaEK;
    private int zzaEL;
    private String zzaEM;
    private String zzaEN;
    private boolean zzaEO;
    private boolean zzaEP;
    private boolean zzaEQ;

    public zzod()
    {
        this(false);
    }

    public zzod(boolean flag)
    {
        this(flag, zzwA());
    }

    public zzod(boolean flag, int i)
    {
        zzu.zzbw(i);
        zzaEK = i;
        zzaEP = flag;
    }

    static int zzwA()
    {
        UUID uuid = UUID.randomUUID();
        int i = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (i == 0)
        {
            int j = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
            i = j;
            if (j == 0)
            {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                return 0x7fffffff;
            }
        }
        return i;
    }

    private void zzwH()
    {
        if (zzaEQ)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public boolean isMutable()
    {
        return !zzaEQ;
    }

    public void setScreenName(String s)
    {
        zzwH();
        zzaEJ = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", zzaEJ);
        hashmap.put("interstitial", Boolean.valueOf(zzaEO));
        hashmap.put("automatic", Boolean.valueOf(zzaEP));
        hashmap.put("screenId", Integer.valueOf(zzaEK));
        hashmap.put("referrerScreenId", Integer.valueOf(zzaEL));
        hashmap.put("referrerScreenName", zzaEM);
        hashmap.put("referrerUri", zzaEN);
        return zzy(hashmap);
    }

    public void zza(zznq zznq1)
    {
        zzc((zzod)zznq1);
    }

    public void zzah(boolean flag)
    {
        zzwH();
        zzaEP = flag;
    }

    public void zzai(boolean flag)
    {
        zzwH();
        zzaEO = flag;
    }

    public int zzbn()
    {
        return zzaEK;
    }

    public void zzc(zzod zzod1)
    {
        if (!TextUtils.isEmpty(zzaEJ))
        {
            zzod1.setScreenName(zzaEJ);
        }
        if (zzaEK != 0)
        {
            zzod1.zzhK(zzaEK);
        }
        if (zzaEL != 0)
        {
            zzod1.zzhL(zzaEL);
        }
        if (!TextUtils.isEmpty(zzaEM))
        {
            zzod1.zzdJ(zzaEM);
        }
        if (!TextUtils.isEmpty(zzaEN))
        {
            zzod1.zzdK(zzaEN);
        }
        if (zzaEO)
        {
            zzod1.zzai(zzaEO);
        }
        if (zzaEP)
        {
            zzod1.zzah(zzaEP);
        }
    }

    public void zzdJ(String s)
    {
        zzwH();
        zzaEM = s;
    }

    public void zzdK(String s)
    {
        zzwH();
        if (TextUtils.isEmpty(s))
        {
            zzaEN = null;
            return;
        } else
        {
            zzaEN = s;
            return;
        }
    }

    public void zzhK(int i)
    {
        zzwH();
        zzaEK = i;
    }

    public void zzhL(int i)
    {
        zzwH();
        zzaEL = i;
    }

    public String zzwB()
    {
        return zzaEJ;
    }

    public int zzwC()
    {
        return zzaEL;
    }

    public String zzwD()
    {
        return zzaEM;
    }

    public String zzwE()
    {
        return zzaEN;
    }

    public void zzwF()
    {
        zzaEQ = true;
    }

    public boolean zzwG()
    {
        return zzaEO;
    }
}
