// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznw, zznr, 
//            zznq, zzob, zzny

public static final class zzsu extends zzns
{

    public String type;
    public zzaNT zzape[];

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
        if (!(obj instanceof zzsu))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzsu)obj;
        if (type != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((type) (obj)).type != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (zznw.equals(zzape, ((zzape) (obj)).zzape))
        {
            return zza(((zzns) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!type.equals(((type) (obj)).type))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int i;
        if (type == null)
        {
            i = 0;
        } else
        {
            i = type.hashCode();
        }
        return ((i + 527) * 31 + zznw.hashCode(zzape)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!type.equals(""))
        {
            zznr1.zzb(1, type);
        }
        if (zzape != null && zzape.length > 0)
        {
            for (int i = 0; i < zzape.length; i++)
            {
                zzzP zzzp = zzape[i];
                if (zzzp != null)
                {
                    zznr1.zza(2, zzzp);
                }
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzs(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!type.equals(""))
        {
            i = j + zznr.zzj(1, type);
        }
        j = i;
        if (zzape != null)
        {
            j = i;
            if (zzape.length > 0)
            {
                for (j = 0; j < zzape.length;)
                {
                    zzs zzs1 = zzape[j];
                    int k = i;
                    if (zzs1 != null)
                    {
                        k = i + zznr.zzc(2, zzs1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public zzape zzs(zznq zznq1)
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
                type = zznq1.readString();
                break;

            case 18: // '\022'
                int k = zzob.zzb(zznq1, 18);
                zzape azzape[];
                int j;
                if (zzape == null)
                {
                    j = 0;
                } else
                {
                    j = zzape.length;
                }
                azzape = new zzape[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzape, 0, azzape, 0, j);
                    k = j;
                }
                for (; k < azzape.length - 1; k++)
                {
                    azzape[k] = new <init>();
                    zznq1.zza(azzape[k]);
                    zznq1.zzzy();
                }

                azzape[k] = new <init>();
                zznq1.zza(azzape[k]);
                zzape = azzape;
                break;
            }
        } while (true);
    }

    public zzape zzsu()
    {
        type = "";
        zzape = zzss();
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzsu();
    }
}
