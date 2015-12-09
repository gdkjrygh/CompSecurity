// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznw, zznr, 
//            zznq, zzny

public static final class zzsr extends zzns
{

    private static volatile zzaNT zzaoZ[];
    public int viewId;
    public String zzapa;
    public String zzapb;

    public static zzsr[] zzsq()
    {
        if (zzaoZ == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzaoZ == null)
                {
                    zzaoZ = new zzaoZ[0];
                }
            }
        }
        return zzaoZ;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

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
        if (!(obj instanceof zzaoZ)) goto _L4; else goto _L3
_L3:
        obj = (zzaoZ)obj;
        if (zzapa != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((zzapa) (obj)).zzapa != null) goto _L4; else goto _L7
_L7:
        if (zzapb != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((zzapb) (obj)).zzapb != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (viewId == ((viewId) (obj)).viewId)
        {
            return zza(((zzns) (obj)));
        }
          goto _L4
_L6:
        if (!zzapa.equals(((zzapa) (obj)).zzapa))
        {
            return false;
        }
          goto _L7
        if (!zzapb.equals(((zzapb) (obj)).zzapb))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (zzapa == null)
        {
            i = 0;
        } else
        {
            i = zzapa.hashCode();
        }
        if (zzapb != null)
        {
            j = zzapb.hashCode();
        }
        return (((i + 527) * 31 + j) * 31 + viewId) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!zzapa.equals(""))
        {
            zznr1.zzb(1, zzapa);
        }
        if (!zzapb.equals(""))
        {
            zznr1.zzb(2, zzapb);
        }
        if (viewId != 0)
        {
            zznr1.zzx(3, viewId);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzq(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!zzapa.equals(""))
        {
            i = j + zznr.zzj(1, zzapa);
        }
        j = i;
        if (!zzapb.equals(""))
        {
            j = i + zznr.zzj(2, zzapb);
        }
        i = j;
        if (viewId != 0)
        {
            i = j + zznr.zzz(3, viewId);
        }
        return i;
    }

    public viewId zzq(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch (i)
            {
            default:
                if (zza(zznq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                zzapa = zznq1.readString();
                break;

            case 18: // '\022'
                zzapb = zznq1.readString();
                break;

            case 24: // '\030'
                viewId = zznq1.zzzB();
                break;
            }
        } while (true);
    }

    public viewId zzsr()
    {
        zzapa = "";
        zzapb = "";
        viewId = 0;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzsr();
    }
}
