// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzwy, zzww, 
//            zzwr, zzwq, zzxb

public static final class zzq extends zzws
{

    public zzaHM zzgr[];
    public zzaHM zzgs;
    public String zzgt;

    public static zzq zzb(byte abyte0[])
    {
        return (zzq)zzwy.zza(new <init>(), abyte0);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof <init>)) goto _L4; else goto _L3
_L3:
        obj = (<init>)obj;
        flag = flag1;
        if (!zzww.equals(zzgr, ((zzgr) (obj)).zzgr)) goto _L4; else goto _L5
_L5:
        if (zzgs != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzgs) (obj)).zzgs != null) goto _L4; else goto _L8
_L8:
        if (zzgt != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((zzgt) (obj)).zzgt != null) goto _L4; else goto _L9
_L9:
        return zza(((zzws) (obj)));
_L7:
        if (!zzgs.equals(((equals) (obj)).zzgs))
        {
            return false;
        }
          goto _L8
        if (!zzgt.equals(((zzgt) (obj)).zzgt))
        {
            return false;
        }
          goto _L9
    }

    public final int hashCode()
    {
        int j = 0;
        int k = zzww.hashCode(zzgr);
        int i;
        if (zzgs == null)
        {
            i = 0;
        } else
        {
            i = zzgs.hashCode();
        }
        if (zzgt != null)
        {
            j = zzgt.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        if (zzgr != null && zzgr.length > 0)
        {
            for (int i = 0; i < zzgr.length; i++)
            {
                zzvL zzvl = zzgr[i];
                if (zzvl != null)
                {
                    zzwr1.zza(1, zzvl);
                }
            }

        }
        if (zzgs != null)
        {
            zzwr1.zza(2, zzgs);
        }
        if (!zzgt.equals(""))
        {
            zzwr1.zzb(3, zzgt);
        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzk(zzwq1);
    }

    protected final int zzc()
    {
        int i = super.zzc();
        int j = i;
        if (zzgr != null)
        {
            j = i;
            if (zzgr.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= zzgr.length)
                    {
                        break;
                    }
                    zzk zzk1 = zzgr[k];
                    j = i;
                    if (zzk1 != null)
                    {
                        j = i + zzwr.zzc(1, zzk1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zzgs != null)
        {
            i = j + zzwr.zzc(2, zzgs);
        }
        j = i;
        if (!zzgt.equals(""))
        {
            j = i + zzwr.zzj(3, zzgt);
        }
        return j;
    }

    public final zzgt zzk(zzwq zzwq1)
    {
        do
        {
            int i = zzwq1.zzvu();
            switch (i)
            {
            default:
                if (zza(zzwq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = zzxb.zzc(zzwq1, 10);
                zzgt azzgt[];
                int j;
                if (zzgr == null)
                {
                    j = 0;
                } else
                {
                    j = zzgr.length;
                }
                azzgt = new zzgr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzgr, 0, azzgt, 0, j);
                    k = j;
                }
                for (; k < azzgt.length - 1; k++)
                {
                    azzgt[k] = new <init>();
                    zzwq1.zza(azzgt[k]);
                    zzwq1.zzvu();
                }

                azzgt[k] = new <init>();
                zzwq1.zza(azzgt[k]);
                zzgr = azzgt;
                break;

            case 18: // '\022'
                if (zzgs == null)
                {
                    zzgs = new <init>();
                }
                zzwq1.zza(zzgs);
                break;

            case 26: // '\032'
                zzgt = zzwq1.readString();
                break;
            }
        } while (true);
    }

    public final dString zzq()
    {
        zzgr = zzo();
        zzgs = null;
        zzgt = "";
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzq();
    }
}
