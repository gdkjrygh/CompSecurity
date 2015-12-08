// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzxb, zzwy

public static final class zze extends zzws
{

    private static volatile zzaHM zzfp[];
    public int name;
    public int zzfq[];
    public int zzfr;
    public boolean zzfs;
    public boolean zzft;

    public static zze[] zzd()
    {
        if (zzfp == null)
        {
            synchronized (zzww.zzaHL)
            {
                if (zzfp == null)
                {
                    zzfp = new zzfp[0];
                }
            }
        }
        return zzfp;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzfp)
            {
                obj = (zzfp)obj;
                flag = flag1;
                if (zzww.equals(zzfq, ((zzfq) (obj)).zzfq))
                {
                    flag = flag1;
                    if (zzfr == ((zzfr) (obj)).zzfr)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (zzfs == ((zzfs) (obj)).zzfs)
                            {
                                flag = flag1;
                                if (zzft == ((zzft) (obj)).zzft)
                                {
                                    return zza(((zzws) (obj)));
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int i = zzww.hashCode(zzfq);
        int j = zzfr;
        int k = name;
        char c;
        if (zzfs)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!zzft)
        {
            c1 = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        if (zzft)
        {
            zzwr1.zzb(1, zzft);
        }
        zzwr1.zzy(2, zzfr);
        if (zzfq != null && zzfq.length > 0)
        {
            for (int i = 0; i < zzfq.length; i++)
            {
                zzwr1.zzy(3, zzfq[i]);
            }

        }
        if (name != 0)
        {
            zzwr1.zzy(4, name);
        }
        if (zzfs)
        {
            zzwr1.zzb(6, zzfs);
        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzc(zzwq1);
    }

    protected final int zzc()
    {
        int j = 0;
        int k = super.zzc();
        int i = k;
        if (zzft)
        {
            i = k + zzwr.zzc(1, zzft);
        }
        k = zzwr.zzA(2, zzfr) + i;
        if (zzfq != null && zzfq.length > 0)
        {
            for (i = 0; i < zzfq.length; i++)
            {
                j += zzwr.zziw(zzfq[i]);
            }

            j = k + j + zzfq.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + zzwr.zzA(4, name);
        }
        j = i;
        if (zzfs)
        {
            j = i + zzwr.zzc(6, zzfs);
        }
        return j;
    }

    public final zzfs zzc(zzwq zzwq1)
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

            case 8: // '\b'
                zzft = zzwq1.zzvy();
                break;

            case 16: // '\020'
                zzfr = zzwq1.zzvx();
                break;

            case 24: // '\030'
                int l = zzxb.zzc(zzwq1, 24);
                int ai[];
                int j;
                if (zzfq == null)
                {
                    j = 0;
                } else
                {
                    j = zzfq.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(zzfq, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai[l] = zzwq1.zzvx();
                zzfq = ai;
                break;

            case 26: // '\032'
                int j1 = zzwq1.zzip(zzwq1.zzvB());
                int k = zzwq1.getPosition();
                int i1;
                for (i1 = 0; zzwq1.zzvG() > 0; i1++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(k);
                int ai1[];
                if (zzfq == null)
                {
                    k = 0;
                } else
                {
                    k = zzfq.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzfq, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = zzwq1.zzvx();
                }

                zzfq = ai1;
                zzwq1.zziq(j1);
                break;

            case 32: // ' '
                name = zzwq1.zzvx();
                break;

            case 48: // '0'
                zzfs = zzwq1.zzvy();
                break;
            }
        } while (true);
    }

    public final y zze()
    {
        zzfq = zzxb.zzaHO;
        zzfr = 0;
        name = 0;
        zzfs = false;
        zzft = false;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zze();
    }
}
