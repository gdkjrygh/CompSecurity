// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzoc, zznq, zznr, 
//            zzny

public static final class zzAe extends zzns
{

    public String version;
    public int zzaOg;
    public String zzaOh;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzAe)) goto _L4; else goto _L3
_L3:
        obj = (zzAe)obj;
        flag = flag1;
        if (zzaOg != ((zzaOg) (obj)).zzaOg) goto _L4; else goto _L5
_L5:
        if (zzaOh != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzaOh) (obj)).zzaOh != null) goto _L4; else goto _L8
_L8:
        if (version != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L9
_L9:
        return zza(((zzns) (obj)));
_L7:
        if (!zzaOh.equals(((zzaOh) (obj)).zzaOh))
        {
            return false;
        }
          goto _L8
        if (!version.equals(((version) (obj)).version))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = zzaOg;
        int i;
        if (zzaOh == null)
        {
            i = 0;
        } else
        {
            i = zzaOh.hashCode();
        }
        if (version != null)
        {
            j = version.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzzP();
    }

    public zzzP zzAe()
    {
        zzaOg = 0;
        zzaOh = "";
        version = "";
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zzaNT zzC(zznq zznq1)
        throws IOException
    {
_L6:
        int i = zznq1.zzzy();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 195
    //                   26: 206;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zznq1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zznq1.zzzB();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
            zzaOg = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zzaOh = zznq1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        version = zznq1.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (zzaOg != 0)
        {
            zznr1.zzx(1, zzaOg);
        }
        if (!zzaOh.equals(""))
        {
            zznr1.zzb(2, zzaOh);
        }
        if (!version.equals(""))
        {
            zznr1.zzb(3, version);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzC(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (zzaOg != 0)
        {
            i = j + zznr.zzz(1, zzaOg);
        }
        j = i;
        if (!zzaOh.equals(""))
        {
            j = i + zznr.zzj(2, zzaOh);
        }
        i = j;
        if (!version.equals(""))
        {
            i = j + zznr.zzj(3, version);
        }
        return i;
    }

    public ()
    {
        zzAe();
    }
}
