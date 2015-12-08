// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzwq, zzwr, zzwy, 
//            zzww, zzxb

public interface com.google.android.gms.internal.zzc
{
    public static final class zza extends zzws
    {

        public int level;
        public int zzfn;
        public int zzfo;

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
                if (obj instanceof zza)
                {
                    obj = (zza)obj;
                    flag = flag1;
                    if (level == ((zza) (obj)).level)
                    {
                        flag = flag1;
                        if (zzfn == ((zza) (obj)).zzfn)
                        {
                            flag = flag1;
                            if (zzfo == ((zza) (obj)).zzfo)
                            {
                                return zza(((zzws) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (((level + 527) * 31 + zzfn) * 31 + zzfo) * 31 + zzvL();
        }

        public final zza zza(zzwq zzwq1)
        {
_L6:
            int i = zzwq1.zzvu();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       16: 103
        //                       24: 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (zza(zzwq1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = zzwq1.zzvx();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                level = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            zzfn = zzwq1.zzvx();
            continue; /* Loop/switch isn't completed */
_L5:
            zzfo = zzwq1.zzvx();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void zza(zzwr zzwr1)
        {
            if (level != 1)
            {
                zzwr1.zzy(1, level);
            }
            if (zzfn != 0)
            {
                zzwr1.zzy(2, zzfn);
            }
            if (zzfo != 0)
            {
                zzwr1.zzy(3, zzfo);
            }
            super.zza(zzwr1);
        }

        public final zza zzb()
        {
            level = 1;
            zzfn = 0;
            zzfo = 0;
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zza(zzwq1);
        }

        protected final int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (level != 1)
            {
                i = j + zzwr.zzA(1, level);
            }
            j = i;
            if (zzfn != 0)
            {
                j = i + zzwr.zzA(2, zzfn);
            }
            i = j;
            if (zzfo != 0)
            {
                i = j + zzwr.zzA(3, zzfo);
            }
            return i;
        }

        public zza()
        {
            zzb();
        }
    }

    public static final class zzb extends zzws
    {

        private static volatile zzb zzfp[];
        public int name;
        public int zzfq[];
        public int zzfr;
        public boolean zzfs;
        public boolean zzft;

        public static zzb[] zzd()
        {
            if (zzfp == null)
            {
                synchronized (zzww.zzaHL)
                {
                    if (zzfp == null)
                    {
                        zzfp = new zzb[0];
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
                if (obj instanceof zzb)
                {
                    obj = (zzb)obj;
                    flag = flag1;
                    if (zzww.equals(zzfq, ((zzb) (obj)).zzfq))
                    {
                        flag = flag1;
                        if (zzfr == ((zzb) (obj)).zzfr)
                        {
                            flag = flag1;
                            if (name == ((zzb) (obj)).name)
                            {
                                flag = flag1;
                                if (zzfs == ((zzb) (obj)).zzfs)
                                {
                                    flag = flag1;
                                    if (zzft == ((zzb) (obj)).zzft)
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

        public final zzb zzc(zzwq zzwq1)
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

        public final zzb zze()
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

        public zzb()
        {
            zze();
        }
    }

    public static final class zzc extends zzws
    {

        private static volatile zzc zzfu[];
        public String zzfv;
        public long zzfw;
        public long zzfx;
        public boolean zzfy;
        public long zzfz;

        public static zzc[] zzf()
        {
            if (zzfu == null)
            {
                synchronized (zzww.zzaHL)
                {
                    if (zzfu == null)
                    {
                        zzfu = new zzc[0];
                    }
                }
            }
            return zzfu;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
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
            if (!(obj instanceof zzc))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (zzc)obj;
            if (zzfv != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zzc) (obj)).zzfv != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (zzfw == ((zzc) (obj)).zzfw)
            {
                flag = flag1;
                if (zzfx == ((zzc) (obj)).zzfx)
                {
                    flag = flag1;
                    if (zzfy == ((zzc) (obj)).zzfy)
                    {
                        flag = flag1;
                        if (zzfz == ((zzc) (obj)).zzfz)
                        {
                            return zza(((zzws) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!zzfv.equals(((zzc) (obj)).zzfv))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public final int hashCode()
        {
            int i;
            char c;
            int j;
            int k;
            if (zzfv == null)
            {
                i = 0;
            } else
            {
                i = zzfv.hashCode();
            }
            j = (int)(zzfw ^ zzfw >>> 32);
            k = (int)(zzfx ^ zzfx >>> 32);
            if (zzfy)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzfz ^ zzfz >>> 32)) * 31 + zzvL();
        }

        public final void zza(zzwr zzwr1)
        {
            if (!zzfv.equals(""))
            {
                zzwr1.zzb(1, zzfv);
            }
            if (zzfw != 0L)
            {
                zzwr1.zzb(2, zzfw);
            }
            if (zzfx != 0x7fffffffL)
            {
                zzwr1.zzb(3, zzfx);
            }
            if (zzfy)
            {
                zzwr1.zzb(4, zzfy);
            }
            if (zzfz != 0L)
            {
                zzwr1.zzb(5, zzfz);
            }
            super.zza(zzwr1);
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zzd(zzwq1);
        }

        protected final int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!zzfv.equals(""))
            {
                i = j + zzwr.zzj(1, zzfv);
            }
            j = i;
            if (zzfw != 0L)
            {
                j = i + zzwr.zzd(2, zzfw);
            }
            i = j;
            if (zzfx != 0x7fffffffL)
            {
                i = j + zzwr.zzd(3, zzfx);
            }
            j = i;
            if (zzfy)
            {
                j = i + zzwr.zzc(4, zzfy);
            }
            i = j;
            if (zzfz != 0L)
            {
                i = j + zzwr.zzd(5, zzfz);
            }
            return i;
        }

        public final zzc zzd(zzwq zzwq1)
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
                    zzfv = zzwq1.readString();
                    break;

                case 16: // '\020'
                    zzfw = zzwq1.zzvw();
                    break;

                case 24: // '\030'
                    zzfx = zzwq1.zzvw();
                    break;

                case 32: // ' '
                    zzfy = zzwq1.zzvy();
                    break;

                case 40: // '('
                    zzfz = zzwq1.zzvw();
                    break;
                }
            } while (true);
        }

        public final zzc zzg()
        {
            zzfv = "";
            zzfw = 0L;
            zzfx = 0x7fffffffL;
            zzfy = false;
            zzfz = 0L;
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zzc()
        {
            zzg();
        }
    }

    public static final class zzd extends zzws
    {

        public zzd.zza zzfA[];
        public zzd.zza zzfB[];
        public zzc zzfC[];

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
                if (obj instanceof zzd)
                {
                    obj = (zzd)obj;
                    flag = flag1;
                    if (zzww.equals(zzfA, ((zzd) (obj)).zzfA))
                    {
                        flag = flag1;
                        if (zzww.equals(zzfB, ((zzd) (obj)).zzfB))
                        {
                            flag = flag1;
                            if (zzww.equals(zzfC, ((zzd) (obj)).zzfC))
                            {
                                return zza(((zzws) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (((zzww.hashCode(zzfA) + 527) * 31 + zzww.hashCode(zzfB)) * 31 + zzww.hashCode(zzfC)) * 31 + zzvL();
        }

        public final void zza(zzwr zzwr1)
        {
            boolean flag = false;
            if (zzfA != null && zzfA.length > 0)
            {
                for (int i = 0; i < zzfA.length; i++)
                {
                    zzd.zza zza1 = zzfA[i];
                    if (zza1 != null)
                    {
                        zzwr1.zza(1, zza1);
                    }
                }

            }
            if (zzfB != null && zzfB.length > 0)
            {
                for (int j = 0; j < zzfB.length; j++)
                {
                    zzd.zza zza2 = zzfB[j];
                    if (zza2 != null)
                    {
                        zzwr1.zza(2, zza2);
                    }
                }

            }
            if (zzfC != null && zzfC.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < zzfC.length; k++)
                {
                    zzc zzc1 = zzfC[k];
                    if (zzc1 != null)
                    {
                        zzwr1.zza(3, zzc1);
                    }
                }

            }
            super.zza(zzwr1);
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zze(zzwq1);
        }

        protected final int zzc()
        {
            boolean flag = false;
            int i = super.zzc();
            int j = i;
            if (zzfA != null)
            {
                j = i;
                if (zzfA.length > 0)
                {
                    for (j = 0; j < zzfA.length;)
                    {
                        zzd.zza zza1 = zzfA[j];
                        int i1 = i;
                        if (zza1 != null)
                        {
                            i1 = i + zzwr.zzc(1, zza1);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzfB != null)
            {
                i = j;
                if (zzfB.length > 0)
                {
                    i = j;
                    for (int k = 0; k < zzfB.length;)
                    {
                        zzd.zza zza2 = zzfB[k];
                        int j1 = i;
                        if (zza2 != null)
                        {
                            j1 = i + zzwr.zzc(2, zza2);
                        }
                        k++;
                        i = j1;
                    }

                }
            }
            int k1 = i;
            if (zzfC != null)
            {
                k1 = i;
                if (zzfC.length > 0)
                {
                    int l = ((flag) ? 1 : 0);
                    do
                    {
                        k1 = i;
                        if (l >= zzfC.length)
                        {
                            break;
                        }
                        zzc zzc1 = zzfC[l];
                        k1 = i;
                        if (zzc1 != null)
                        {
                            k1 = i + zzwr.zzc(3, zzc1);
                        }
                        l++;
                        i = k1;
                    } while (true);
                }
            }
            return k1;
        }

        public final zzd zze(zzwq zzwq1)
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
                    int i1 = zzxb.zzc(zzwq1, 10);
                    zzd.zza azza[];
                    int j;
                    if (zzfA == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzfA.length;
                    }
                    azza = new zzd.zza[i1 + j];
                    i1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzfA, 0, azza, 0, j);
                        i1 = j;
                    }
                    for (; i1 < azza.length - 1; i1++)
                    {
                        azza[i1] = new zzd.zza();
                        zzwq1.zza(azza[i1]);
                        zzwq1.zzvu();
                    }

                    azza[i1] = new zzd.zza();
                    zzwq1.zza(azza[i1]);
                    zzfA = azza;
                    break;

                case 18: // '\022'
                    int j1 = zzxb.zzc(zzwq1, 18);
                    zzd.zza azza1[];
                    int k;
                    if (zzfB == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzfB.length;
                    }
                    azza1 = new zzd.zza[j1 + k];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzfB, 0, azza1, 0, k);
                        j1 = k;
                    }
                    for (; j1 < azza1.length - 1; j1++)
                    {
                        azza1[j1] = new zzd.zza();
                        zzwq1.zza(azza1[j1]);
                        zzwq1.zzvu();
                    }

                    azza1[j1] = new zzd.zza();
                    zzwq1.zza(azza1[j1]);
                    zzfB = azza1;
                    break;

                case 26: // '\032'
                    int k1 = zzxb.zzc(zzwq1, 26);
                    zzc azzc[];
                    int l;
                    if (zzfC == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzfC.length;
                    }
                    azzc = new zzc[k1 + l];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzfC, 0, azzc, 0, l);
                        k1 = l;
                    }
                    for (; k1 < azzc.length - 1; k1++)
                    {
                        azzc[k1] = new zzc();
                        zzwq1.zza(azzc[k1]);
                        zzwq1.zzvu();
                    }

                    azzc[k1] = new zzc();
                    zzwq1.zza(azzc[k1]);
                    zzfC = azzc;
                    break;
                }
            } while (true);
        }

        public final zzd zzh()
        {
            zzfA = com.google.android.gms.internal.zzd.zza.zzr();
            zzfB = com.google.android.gms.internal.zzd.zza.zzr();
            zzfC = zzc.zzf();
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zzd()
        {
            zzh();
        }
    }

    public static final class zze extends zzws
    {

        private static volatile zze zzfD[];
        public int key;
        public int value;

        public static zze[] zzi()
        {
            if (zzfD == null)
            {
                synchronized (zzww.zzaHL)
                {
                    if (zzfD == null)
                    {
                        zzfD = new zze[0];
                    }
                }
            }
            return zzfD;
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
                if (obj instanceof zze)
                {
                    obj = (zze)obj;
                    flag = flag1;
                    if (key == ((zze) (obj)).key)
                    {
                        flag = flag1;
                        if (value == ((zze) (obj)).value)
                        {
                            return zza(((zzws) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return ((key + 527) * 31 + value) * 31 + zzvL();
        }

        public final void zza(zzwr zzwr1)
        {
            zzwr1.zzy(1, key);
            zzwr1.zzy(2, value);
            super.zza(zzwr1);
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zzf(zzwq1);
        }

        protected final int zzc()
        {
            return super.zzc() + zzwr.zzA(1, key) + zzwr.zzA(2, value);
        }

        public final zze zzf(zzwq zzwq1)
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
                    key = zzwq1.zzvx();
                    break;

                case 16: // '\020'
                    value = zzwq1.zzvx();
                    break;
                }
            } while (true);
        }

        public final zze zzj()
        {
            key = 0;
            value = 0;
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zze()
        {
            zzj();
        }
    }

    public static final class zzf extends zzws
    {

        public String version;
        public String zzfE[];
        public String zzfF[];
        public zzd.zza zzfG[];
        public zze zzfH[];
        public zzb zzfI[];
        public zzb zzfJ[];
        public zzb zzfK[];
        public zzg zzfL[];
        public String zzfM;
        public String zzfN;
        public String zzfO;
        public zza zzfP;
        public float zzfQ;
        public boolean zzfR;
        public String zzfS[];
        public int zzfT;

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
            if (!(obj instanceof zzf)) goto _L4; else goto _L3
_L3:
            obj = (zzf)obj;
            flag = flag1;
            if (!zzww.equals(zzfE, ((zzf) (obj)).zzfE)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!zzww.equals(zzfF, ((zzf) (obj)).zzfF)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!zzww.equals(zzfG, ((zzf) (obj)).zzfG)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!zzww.equals(zzfH, ((zzf) (obj)).zzfH)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zzww.equals(zzfI, ((zzf) (obj)).zzfI)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zzww.equals(zzfJ, ((zzf) (obj)).zzfJ)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zzww.equals(zzfK, ((zzf) (obj)).zzfK)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!zzww.equals(zzfL, ((zzf) (obj)).zzfL)) goto _L4; else goto _L12
_L12:
            if (zzfM != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((zzf) (obj)).zzfM != null) goto _L4; else goto _L15
_L15:
            if (zzfN != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((zzf) (obj)).zzfN != null) goto _L4; else goto _L18
_L18:
            if (zzfO != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((zzf) (obj)).zzfO != null) goto _L4; else goto _L21
_L21:
            if (version != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((zzf) (obj)).version != null) goto _L4; else goto _L24
_L24:
            if (zzfP != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((zzf) (obj)).zzfP != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(zzfQ) == Float.floatToIntBits(((zzf) (obj)).zzfQ))
            {
                flag = flag1;
                if (zzfR == ((zzf) (obj)).zzfR)
                {
                    flag = flag1;
                    if (zzww.equals(zzfS, ((zzf) (obj)).zzfS))
                    {
                        flag = flag1;
                        if (zzfT == ((zzf) (obj)).zzfT)
                        {
                            return zza(((zzws) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!zzfM.equals(((zzf) (obj)).zzfM))
            {
                return false;
            }
              goto _L15
_L17:
            if (!zzfN.equals(((zzf) (obj)).zzfN))
            {
                return false;
            }
              goto _L18
_L20:
            if (!zzfO.equals(((zzf) (obj)).zzfO))
            {
                return false;
            }
              goto _L21
_L23:
            if (!version.equals(((zzf) (obj)).version))
            {
                return false;
            }
              goto _L24
            if (!zzfP.equals(((zzf) (obj)).zzfP))
            {
                return false;
            }
              goto _L25
        }

        public final int hashCode()
        {
            int i1 = 0;
            int j1 = zzww.hashCode(zzfE);
            int k1 = zzww.hashCode(zzfF);
            int l1 = zzww.hashCode(zzfG);
            int i2 = zzww.hashCode(zzfH);
            int j2 = zzww.hashCode(zzfI);
            int k2 = zzww.hashCode(zzfJ);
            int l2 = zzww.hashCode(zzfK);
            int i3 = zzww.hashCode(zzfL);
            int i;
            int j;
            int k;
            int l;
            char c;
            int j3;
            if (zzfM == null)
            {
                i = 0;
            } else
            {
                i = zzfM.hashCode();
            }
            if (zzfN == null)
            {
                j = 0;
            } else
            {
                j = zzfN.hashCode();
            }
            if (zzfO == null)
            {
                k = 0;
            } else
            {
                k = zzfO.hashCode();
            }
            if (version == null)
            {
                l = 0;
            } else
            {
                l = version.hashCode();
            }
            if (zzfP != null)
            {
                i1 = zzfP.hashCode();
            }
            j3 = Float.floatToIntBits(zzfQ);
            if (zzfR)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zzww.hashCode(zzfS)) * 31 + zzfT) * 31 + zzvL();
        }

        public final void zza(zzwr zzwr1)
        {
            boolean flag = false;
            if (zzfF != null && zzfF.length > 0)
            {
                for (int i = 0; i < zzfF.length; i++)
                {
                    String s = zzfF[i];
                    if (s != null)
                    {
                        zzwr1.zzb(1, s);
                    }
                }

            }
            if (zzfG != null && zzfG.length > 0)
            {
                for (int j = 0; j < zzfG.length; j++)
                {
                    zzd.zza zza1 = zzfG[j];
                    if (zza1 != null)
                    {
                        zzwr1.zza(2, zza1);
                    }
                }

            }
            if (zzfH != null && zzfH.length > 0)
            {
                for (int k = 0; k < zzfH.length; k++)
                {
                    zze zze1 = zzfH[k];
                    if (zze1 != null)
                    {
                        zzwr1.zza(3, zze1);
                    }
                }

            }
            if (zzfI != null && zzfI.length > 0)
            {
                for (int l = 0; l < zzfI.length; l++)
                {
                    zzb zzb1 = zzfI[l];
                    if (zzb1 != null)
                    {
                        zzwr1.zza(4, zzb1);
                    }
                }

            }
            if (zzfJ != null && zzfJ.length > 0)
            {
                for (int i1 = 0; i1 < zzfJ.length; i1++)
                {
                    zzb zzb2 = zzfJ[i1];
                    if (zzb2 != null)
                    {
                        zzwr1.zza(5, zzb2);
                    }
                }

            }
            if (zzfK != null && zzfK.length > 0)
            {
                for (int j1 = 0; j1 < zzfK.length; j1++)
                {
                    zzb zzb3 = zzfK[j1];
                    if (zzb3 != null)
                    {
                        zzwr1.zza(6, zzb3);
                    }
                }

            }
            if (zzfL != null && zzfL.length > 0)
            {
                for (int k1 = 0; k1 < zzfL.length; k1++)
                {
                    zzg zzg1 = zzfL[k1];
                    if (zzg1 != null)
                    {
                        zzwr1.zza(7, zzg1);
                    }
                }

            }
            if (!zzfM.equals(""))
            {
                zzwr1.zzb(9, zzfM);
            }
            if (!zzfN.equals(""))
            {
                zzwr1.zzb(10, zzfN);
            }
            if (!zzfO.equals("0"))
            {
                zzwr1.zzb(12, zzfO);
            }
            if (!version.equals(""))
            {
                zzwr1.zzb(13, version);
            }
            if (zzfP != null)
            {
                zzwr1.zza(14, zzfP);
            }
            if (Float.floatToIntBits(zzfQ) != Float.floatToIntBits(0.0F))
            {
                zzwr1.zzb(15, zzfQ);
            }
            if (zzfS != null && zzfS.length > 0)
            {
                for (int l1 = 0; l1 < zzfS.length; l1++)
                {
                    String s1 = zzfS[l1];
                    if (s1 != null)
                    {
                        zzwr1.zzb(16, s1);
                    }
                }

            }
            if (zzfT != 0)
            {
                zzwr1.zzy(17, zzfT);
            }
            if (zzfR)
            {
                zzwr1.zzb(18, zzfR);
            }
            if (zzfE != null && zzfE.length > 0)
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < zzfE.length; i2++)
                {
                    String s2 = zzfE[i2];
                    if (s2 != null)
                    {
                        zzwr1.zzb(19, s2);
                    }
                }

            }
            super.zza(zzwr1);
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zzg(zzwq1);
        }

        protected final int zzc()
        {
            boolean flag = false;
            int k4 = super.zzc();
            int j;
            int k;
            int k2;
            if (zzfF != null && zzfF.length > 0)
            {
                int i = 0;
                k = 0;
                int l;
                int i3;
                for (l = 0; i < zzfF.length; l = i3)
                {
                    String s = zzfF[i];
                    int l3 = k;
                    i3 = l;
                    if (s != null)
                    {
                        i3 = l + 1;
                        l3 = k + zzwr.zzdM(s);
                    }
                    i++;
                    k = l3;
                }

                k = k4 + k + l * 1;
            } else
            {
                k = k4;
            }
            j = k;
            if (zzfG != null)
            {
                j = k;
                if (zzfG.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzfG.length;)
                    {
                        zzd.zza zza1 = zzfG[k];
                        int i1 = j;
                        if (zza1 != null)
                        {
                            i1 = j + zzwr.zzc(2, zza1);
                        }
                        k++;
                        j = i1;
                    }

                }
            }
            k = j;
            if (zzfH != null)
            {
                k = j;
                if (zzfH.length > 0)
                {
                    for (k = 0; k < zzfH.length;)
                    {
                        zze zze1 = zzfH[k];
                        int j1 = j;
                        if (zze1 != null)
                        {
                            j1 = j + zzwr.zzc(3, zze1);
                        }
                        k++;
                        j = j1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzfI != null)
            {
                j = k;
                if (zzfI.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzfI.length;)
                    {
                        zzb zzb1 = zzfI[k];
                        int k1 = j;
                        if (zzb1 != null)
                        {
                            k1 = j + zzwr.zzc(4, zzb1);
                        }
                        k++;
                        j = k1;
                    }

                }
            }
            k = j;
            if (zzfJ != null)
            {
                k = j;
                if (zzfJ.length > 0)
                {
                    for (k = 0; k < zzfJ.length;)
                    {
                        zzb zzb2 = zzfJ[k];
                        int l1 = j;
                        if (zzb2 != null)
                        {
                            l1 = j + zzwr.zzc(5, zzb2);
                        }
                        k++;
                        j = l1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzfK != null)
            {
                j = k;
                if (zzfK.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzfK.length;)
                    {
                        zzb zzb3 = zzfK[k];
                        int i2 = j;
                        if (zzb3 != null)
                        {
                            i2 = j + zzwr.zzc(6, zzb3);
                        }
                        k++;
                        j = i2;
                    }

                }
            }
            k = j;
            if (zzfL != null)
            {
                k = j;
                if (zzfL.length > 0)
                {
                    for (k = 0; k < zzfL.length;)
                    {
                        zzg zzg1 = zzfL[k];
                        int j2 = j;
                        if (zzg1 != null)
                        {
                            j2 = j + zzwr.zzc(7, zzg1);
                        }
                        k++;
                        j = j2;
                    }

                    k = j;
                }
            }
            j = k;
            if (!zzfM.equals(""))
            {
                j = k + zzwr.zzj(9, zzfM);
            }
            k = j;
            if (!zzfN.equals(""))
            {
                k = j + zzwr.zzj(10, zzfN);
            }
            j = k;
            if (!zzfO.equals("0"))
            {
                j = k + zzwr.zzj(12, zzfO);
            }
            k = j;
            if (!version.equals(""))
            {
                k = j + zzwr.zzj(13, version);
            }
            k2 = k;
            if (zzfP != null)
            {
                k2 = k + zzwr.zzc(14, zzfP);
            }
            j = k2;
            if (Float.floatToIntBits(zzfQ) != Float.floatToIntBits(0.0F))
            {
                j = k2 + zzwr.zzc(15, zzfQ);
            }
            k = j;
            if (zzfS != null)
            {
                k = j;
                if (zzfS.length > 0)
                {
                    k = 0;
                    k2 = 0;
                    int j3;
                    int i4;
                    for (j3 = 0; k < zzfS.length; j3 = i4)
                    {
                        String s1 = zzfS[k];
                        k4 = k2;
                        i4 = j3;
                        if (s1 != null)
                        {
                            i4 = j3 + 1;
                            k4 = k2 + zzwr.zzdM(s1);
                        }
                        k++;
                        k2 = k4;
                    }

                    k = j + k2 + j3 * 2;
                }
            }
            k2 = k;
            if (zzfT != 0)
            {
                k2 = k + zzwr.zzA(17, zzfT);
            }
            j = k2;
            if (zzfR)
            {
                j = k2 + zzwr.zzc(18, zzfR);
            }
            k = j;
            if (zzfE != null)
            {
                k = j;
                if (zzfE.length > 0)
                {
                    int l2 = 0;
                    int k3 = 0;
                    for (k = ((flag) ? 1 : 0); k < zzfE.length;)
                    {
                        String s2 = zzfE[k];
                        k4 = l2;
                        int j4 = k3;
                        if (s2 != null)
                        {
                            j4 = k3 + 1;
                            k4 = l2 + zzwr.zzdM(s2);
                        }
                        k++;
                        l2 = k4;
                        k3 = j4;
                    }

                    k = j + l2 + k3 * 2;
                }
            }
            return k;
        }

        public final zzf zzg(zzwq zzwq1)
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
                    int k2 = zzxb.zzc(zzwq1, 10);
                    String as[];
                    int j;
                    if (zzfF == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzfF.length;
                    }
                    as = new String[k2 + j];
                    k2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzfF, 0, as, 0, j);
                        k2 = j;
                    }
                    for (; k2 < as.length - 1; k2++)
                    {
                        as[k2] = zzwq1.readString();
                        zzwq1.zzvu();
                    }

                    as[k2] = zzwq1.readString();
                    zzfF = as;
                    break;

                case 18: // '\022'
                    int l2 = zzxb.zzc(zzwq1, 18);
                    zzd.zza azza[];
                    int k;
                    if (zzfG == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzfG.length;
                    }
                    azza = new zzd.zza[l2 + k];
                    l2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzfG, 0, azza, 0, k);
                        l2 = k;
                    }
                    for (; l2 < azza.length - 1; l2++)
                    {
                        azza[l2] = new zzd.zza();
                        zzwq1.zza(azza[l2]);
                        zzwq1.zzvu();
                    }

                    azza[l2] = new zzd.zza();
                    zzwq1.zza(azza[l2]);
                    zzfG = azza;
                    break;

                case 26: // '\032'
                    int i3 = zzxb.zzc(zzwq1, 26);
                    zze azze[];
                    int l;
                    if (zzfH == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzfH.length;
                    }
                    azze = new zze[i3 + l];
                    i3 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzfH, 0, azze, 0, l);
                        i3 = l;
                    }
                    for (; i3 < azze.length - 1; i3++)
                    {
                        azze[i3] = new zze();
                        zzwq1.zza(azze[i3]);
                        zzwq1.zzvu();
                    }

                    azze[i3] = new zze();
                    zzwq1.zza(azze[i3]);
                    zzfH = azze;
                    break;

                case 34: // '"'
                    int j3 = zzxb.zzc(zzwq1, 34);
                    zzb azzb[];
                    int i1;
                    if (zzfI == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzfI.length;
                    }
                    azzb = new zzb[j3 + i1];
                    j3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzfI, 0, azzb, 0, i1);
                        j3 = i1;
                    }
                    for (; j3 < azzb.length - 1; j3++)
                    {
                        azzb[j3] = new zzb();
                        zzwq1.zza(azzb[j3]);
                        zzwq1.zzvu();
                    }

                    azzb[j3] = new zzb();
                    zzwq1.zza(azzb[j3]);
                    zzfI = azzb;
                    break;

                case 42: // '*'
                    int k3 = zzxb.zzc(zzwq1, 42);
                    zzb azzb1[];
                    int j1;
                    if (zzfJ == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzfJ.length;
                    }
                    azzb1 = new zzb[k3 + j1];
                    k3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzfJ, 0, azzb1, 0, j1);
                        k3 = j1;
                    }
                    for (; k3 < azzb1.length - 1; k3++)
                    {
                        azzb1[k3] = new zzb();
                        zzwq1.zza(azzb1[k3]);
                        zzwq1.zzvu();
                    }

                    azzb1[k3] = new zzb();
                    zzwq1.zza(azzb1[k3]);
                    zzfJ = azzb1;
                    break;

                case 50: // '2'
                    int l3 = zzxb.zzc(zzwq1, 50);
                    zzb azzb2[];
                    int k1;
                    if (zzfK == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzfK.length;
                    }
                    azzb2 = new zzb[l3 + k1];
                    l3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzfK, 0, azzb2, 0, k1);
                        l3 = k1;
                    }
                    for (; l3 < azzb2.length - 1; l3++)
                    {
                        azzb2[l3] = new zzb();
                        zzwq1.zza(azzb2[l3]);
                        zzwq1.zzvu();
                    }

                    azzb2[l3] = new zzb();
                    zzwq1.zza(azzb2[l3]);
                    zzfK = azzb2;
                    break;

                case 58: // ':'
                    int i4 = zzxb.zzc(zzwq1, 58);
                    zzg azzg[];
                    int l1;
                    if (zzfL == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzfL.length;
                    }
                    azzg = new zzg[i4 + l1];
                    i4 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzfL, 0, azzg, 0, l1);
                        i4 = l1;
                    }
                    for (; i4 < azzg.length - 1; i4++)
                    {
                        azzg[i4] = new zzg();
                        zzwq1.zza(azzg[i4]);
                        zzwq1.zzvu();
                    }

                    azzg[i4] = new zzg();
                    zzwq1.zza(azzg[i4]);
                    zzfL = azzg;
                    break;

                case 74: // 'J'
                    zzfM = zzwq1.readString();
                    break;

                case 82: // 'R'
                    zzfN = zzwq1.readString();
                    break;

                case 98: // 'b'
                    zzfO = zzwq1.readString();
                    break;

                case 106: // 'j'
                    version = zzwq1.readString();
                    break;

                case 114: // 'r'
                    if (zzfP == null)
                    {
                        zzfP = new zza();
                    }
                    zzwq1.zza(zzfP);
                    break;

                case 125: // '}'
                    zzfQ = zzwq1.readFloat();
                    break;

                case 130: 
                    int j4 = zzxb.zzc(zzwq1, 130);
                    String as1[];
                    int i2;
                    if (zzfS == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = zzfS.length;
                    }
                    as1 = new String[j4 + i2];
                    j4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(zzfS, 0, as1, 0, i2);
                        j4 = i2;
                    }
                    for (; j4 < as1.length - 1; j4++)
                    {
                        as1[j4] = zzwq1.readString();
                        zzwq1.zzvu();
                    }

                    as1[j4] = zzwq1.readString();
                    zzfS = as1;
                    break;

                case 136: 
                    zzfT = zzwq1.zzvx();
                    break;

                case 144: 
                    zzfR = zzwq1.zzvy();
                    break;

                case 154: 
                    int k4 = zzxb.zzc(zzwq1, 154);
                    String as2[];
                    int j2;
                    if (zzfE == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = zzfE.length;
                    }
                    as2 = new String[k4 + j2];
                    k4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(zzfE, 0, as2, 0, j2);
                        k4 = j2;
                    }
                    for (; k4 < as2.length - 1; k4++)
                    {
                        as2[k4] = zzwq1.readString();
                        zzwq1.zzvu();
                    }

                    as2[k4] = zzwq1.readString();
                    zzfE = as2;
                    break;
                }
            } while (true);
        }

        public final zzf zzk()
        {
            zzfE = zzxb.zzaHT;
            zzfF = zzxb.zzaHT;
            zzfG = com.google.android.gms.internal.zzd.zza.zzr();
            zzfH = zze.zzi();
            zzfI = zzb.zzd();
            zzfJ = zzb.zzd();
            zzfK = zzb.zzd();
            zzfL = zzg.zzl();
            zzfM = "";
            zzfN = "";
            zzfO = "0";
            version = "";
            zzfP = null;
            zzfQ = 0.0F;
            zzfR = false;
            zzfS = zzxb.zzaHT;
            zzfT = 0;
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zzf()
        {
            zzk();
        }
    }

    public static final class zzg extends zzws
    {

        private static volatile zzg zzfU[];
        public int zzfV[];
        public int zzfW[];
        public int zzfX[];
        public int zzfY[];
        public int zzfZ[];
        public int zzga[];
        public int zzgb[];
        public int zzgc[];
        public int zzgd[];
        public int zzge[];

        public static zzg[] zzl()
        {
            if (zzfU == null)
            {
                synchronized (zzww.zzaHL)
                {
                    if (zzfU == null)
                    {
                        zzfU = new zzg[0];
                    }
                }
            }
            return zzfU;
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
                if (obj instanceof zzg)
                {
                    obj = (zzg)obj;
                    flag = flag1;
                    if (zzww.equals(zzfV, ((zzg) (obj)).zzfV))
                    {
                        flag = flag1;
                        if (zzww.equals(zzfW, ((zzg) (obj)).zzfW))
                        {
                            flag = flag1;
                            if (zzww.equals(zzfX, ((zzg) (obj)).zzfX))
                            {
                                flag = flag1;
                                if (zzww.equals(zzfY, ((zzg) (obj)).zzfY))
                                {
                                    flag = flag1;
                                    if (zzww.equals(zzfZ, ((zzg) (obj)).zzfZ))
                                    {
                                        flag = flag1;
                                        if (zzww.equals(zzga, ((zzg) (obj)).zzga))
                                        {
                                            flag = flag1;
                                            if (zzww.equals(zzgb, ((zzg) (obj)).zzgb))
                                            {
                                                flag = flag1;
                                                if (zzww.equals(zzgc, ((zzg) (obj)).zzgc))
                                                {
                                                    flag = flag1;
                                                    if (zzww.equals(zzgd, ((zzg) (obj)).zzgd))
                                                    {
                                                        flag = flag1;
                                                        if (zzww.equals(zzge, ((zzg) (obj)).zzge))
                                                        {
                                                            return zza(((zzws) (obj)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
            return ((((((((((zzww.hashCode(zzfV) + 527) * 31 + zzww.hashCode(zzfW)) * 31 + zzww.hashCode(zzfX)) * 31 + zzww.hashCode(zzfY)) * 31 + zzww.hashCode(zzfZ)) * 31 + zzww.hashCode(zzga)) * 31 + zzww.hashCode(zzgb)) * 31 + zzww.hashCode(zzgc)) * 31 + zzww.hashCode(zzgd)) * 31 + zzww.hashCode(zzge)) * 31 + zzvL();
        }

        public final void zza(zzwr zzwr1)
        {
            boolean flag = false;
            if (zzfV != null && zzfV.length > 0)
            {
                for (int i = 0; i < zzfV.length; i++)
                {
                    zzwr1.zzy(1, zzfV[i]);
                }

            }
            if (zzfW != null && zzfW.length > 0)
            {
                for (int j = 0; j < zzfW.length; j++)
                {
                    zzwr1.zzy(2, zzfW[j]);
                }

            }
            if (zzfX != null && zzfX.length > 0)
            {
                for (int k = 0; k < zzfX.length; k++)
                {
                    zzwr1.zzy(3, zzfX[k]);
                }

            }
            if (zzfY != null && zzfY.length > 0)
            {
                for (int l = 0; l < zzfY.length; l++)
                {
                    zzwr1.zzy(4, zzfY[l]);
                }

            }
            if (zzfZ != null && zzfZ.length > 0)
            {
                for (int i1 = 0; i1 < zzfZ.length; i1++)
                {
                    zzwr1.zzy(5, zzfZ[i1]);
                }

            }
            if (zzga != null && zzga.length > 0)
            {
                for (int j1 = 0; j1 < zzga.length; j1++)
                {
                    zzwr1.zzy(6, zzga[j1]);
                }

            }
            if (zzgb != null && zzgb.length > 0)
            {
                for (int k1 = 0; k1 < zzgb.length; k1++)
                {
                    zzwr1.zzy(7, zzgb[k1]);
                }

            }
            if (zzgc != null && zzgc.length > 0)
            {
                for (int l1 = 0; l1 < zzgc.length; l1++)
                {
                    zzwr1.zzy(8, zzgc[l1]);
                }

            }
            if (zzgd != null && zzgd.length > 0)
            {
                for (int i2 = 0; i2 < zzgd.length; i2++)
                {
                    zzwr1.zzy(9, zzgd[i2]);
                }

            }
            if (zzge != null && zzge.length > 0)
            {
                for (int j2 = ((flag) ? 1 : 0); j2 < zzge.length; j2++)
                {
                    zzwr1.zzy(10, zzge[j2]);
                }

            }
            super.zza(zzwr1);
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zzh(zzwq1);
        }

        protected final int zzc()
        {
            boolean flag = false;
            int l = super.zzc();
            int j;
            int k;
            if (zzfV != null && zzfV.length > 0)
            {
                int i = 0;
                k = 0;
                for (; i < zzfV.length; i++)
                {
                    k += zzwr.zziw(zzfV[i]);
                }

                k = l + k + zzfV.length * 1;
            } else
            {
                k = l;
            }
            j = k;
            if (zzfW != null)
            {
                j = k;
                if (zzfW.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzfW.length; j++)
                    {
                        l += zzwr.zziw(zzfW[j]);
                    }

                    j = k + l + zzfW.length * 1;
                }
            }
            k = j;
            if (zzfX != null)
            {
                k = j;
                if (zzfX.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzfX.length; k++)
                    {
                        l += zzwr.zziw(zzfX[k]);
                    }

                    k = j + l + zzfX.length * 1;
                }
            }
            j = k;
            if (zzfY != null)
            {
                j = k;
                if (zzfY.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzfY.length; j++)
                    {
                        l += zzwr.zziw(zzfY[j]);
                    }

                    j = k + l + zzfY.length * 1;
                }
            }
            k = j;
            if (zzfZ != null)
            {
                k = j;
                if (zzfZ.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzfZ.length; k++)
                    {
                        l += zzwr.zziw(zzfZ[k]);
                    }

                    k = j + l + zzfZ.length * 1;
                }
            }
            j = k;
            if (zzga != null)
            {
                j = k;
                if (zzga.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzga.length; j++)
                    {
                        l += zzwr.zziw(zzga[j]);
                    }

                    j = k + l + zzga.length * 1;
                }
            }
            k = j;
            if (zzgb != null)
            {
                k = j;
                if (zzgb.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgb.length; k++)
                    {
                        l += zzwr.zziw(zzgb[k]);
                    }

                    k = j + l + zzgb.length * 1;
                }
            }
            j = k;
            if (zzgc != null)
            {
                j = k;
                if (zzgc.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgc.length; j++)
                    {
                        l += zzwr.zziw(zzgc[j]);
                    }

                    j = k + l + zzgc.length * 1;
                }
            }
            k = j;
            if (zzgd != null)
            {
                k = j;
                if (zzgd.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgd.length; k++)
                    {
                        l += zzwr.zziw(zzgd[k]);
                    }

                    k = j + l + zzgd.length * 1;
                }
            }
            j = k;
            if (zzge != null)
            {
                j = k;
                if (zzge.length > 0)
                {
                    l = 0;
                    for (j = ((flag) ? 1 : 0); j < zzge.length; j++)
                    {
                        l += zzwr.zziw(zzge[j]);
                    }

                    j = k + l + zzge.length * 1;
                }
            }
            return j;
        }

        public final zzg zzh(zzwq zzwq1)
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
                    int j5 = zzxb.zzc(zzwq1, 8);
                    int ai[];
                    int j;
                    if (zzfV == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzfV.length;
                    }
                    ai = new int[j5 + j];
                    j5 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzfV, 0, ai, 0, j);
                        j5 = j;
                    }
                    for (; j5 < ai.length - 1; j5++)
                    {
                        ai[j5] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai[j5] = zzwq1.zzvx();
                    zzfV = ai;
                    break;

                case 10: // '\n'
                    int j10 = zzwq1.zzip(zzwq1.zzvB());
                    int k = zzwq1.getPosition();
                    int k5;
                    for (k5 = 0; zzwq1.zzvG() > 0; k5++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(k);
                    int ai1[];
                    if (zzfV == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzfV.length;
                    }
                    ai1 = new int[k5 + k];
                    k5 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzfV, 0, ai1, 0, k);
                        k5 = k;
                    }
                    for (; k5 < ai1.length; k5++)
                    {
                        ai1[k5] = zzwq1.zzvx();
                    }

                    zzfV = ai1;
                    zzwq1.zziq(j10);
                    break;

                case 16: // '\020'
                    int l5 = zzxb.zzc(zzwq1, 16);
                    int ai2[];
                    int l;
                    if (zzfW == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzfW.length;
                    }
                    ai2 = new int[l5 + l];
                    l5 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzfW, 0, ai2, 0, l);
                        l5 = l;
                    }
                    for (; l5 < ai2.length - 1; l5++)
                    {
                        ai2[l5] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai2[l5] = zzwq1.zzvx();
                    zzfW = ai2;
                    break;

                case 18: // '\022'
                    int k10 = zzwq1.zzip(zzwq1.zzvB());
                    int i1 = zzwq1.getPosition();
                    int i6;
                    for (i6 = 0; zzwq1.zzvG() > 0; i6++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(i1);
                    int ai3[];
                    if (zzfW == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzfW.length;
                    }
                    ai3 = new int[i6 + i1];
                    i6 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzfW, 0, ai3, 0, i1);
                        i6 = i1;
                    }
                    for (; i6 < ai3.length; i6++)
                    {
                        ai3[i6] = zzwq1.zzvx();
                    }

                    zzfW = ai3;
                    zzwq1.zziq(k10);
                    break;

                case 24: // '\030'
                    int j6 = zzxb.zzc(zzwq1, 24);
                    int ai4[];
                    int j1;
                    if (zzfX == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzfX.length;
                    }
                    ai4 = new int[j6 + j1];
                    j6 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzfX, 0, ai4, 0, j1);
                        j6 = j1;
                    }
                    for (; j6 < ai4.length - 1; j6++)
                    {
                        ai4[j6] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai4[j6] = zzwq1.zzvx();
                    zzfX = ai4;
                    break;

                case 26: // '\032'
                    int l10 = zzwq1.zzip(zzwq1.zzvB());
                    int k1 = zzwq1.getPosition();
                    int k6;
                    for (k6 = 0; zzwq1.zzvG() > 0; k6++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(k1);
                    int ai5[];
                    if (zzfX == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzfX.length;
                    }
                    ai5 = new int[k6 + k1];
                    k6 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzfX, 0, ai5, 0, k1);
                        k6 = k1;
                    }
                    for (; k6 < ai5.length; k6++)
                    {
                        ai5[k6] = zzwq1.zzvx();
                    }

                    zzfX = ai5;
                    zzwq1.zziq(l10);
                    break;

                case 32: // ' '
                    int l6 = zzxb.zzc(zzwq1, 32);
                    int ai6[];
                    int l1;
                    if (zzfY == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzfY.length;
                    }
                    ai6 = new int[l6 + l1];
                    l6 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzfY, 0, ai6, 0, l1);
                        l6 = l1;
                    }
                    for (; l6 < ai6.length - 1; l6++)
                    {
                        ai6[l6] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai6[l6] = zzwq1.zzvx();
                    zzfY = ai6;
                    break;

                case 34: // '"'
                    int i11 = zzwq1.zzip(zzwq1.zzvB());
                    int i2 = zzwq1.getPosition();
                    int i7;
                    for (i7 = 0; zzwq1.zzvG() > 0; i7++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(i2);
                    int ai7[];
                    if (zzfY == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = zzfY.length;
                    }
                    ai7 = new int[i7 + i2];
                    i7 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(zzfY, 0, ai7, 0, i2);
                        i7 = i2;
                    }
                    for (; i7 < ai7.length; i7++)
                    {
                        ai7[i7] = zzwq1.zzvx();
                    }

                    zzfY = ai7;
                    zzwq1.zziq(i11);
                    break;

                case 40: // '('
                    int j7 = zzxb.zzc(zzwq1, 40);
                    int ai8[];
                    int j2;
                    if (zzfZ == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = zzfZ.length;
                    }
                    ai8 = new int[j7 + j2];
                    j7 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(zzfZ, 0, ai8, 0, j2);
                        j7 = j2;
                    }
                    for (; j7 < ai8.length - 1; j7++)
                    {
                        ai8[j7] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai8[j7] = zzwq1.zzvx();
                    zzfZ = ai8;
                    break;

                case 42: // '*'
                    int j11 = zzwq1.zzip(zzwq1.zzvB());
                    int k2 = zzwq1.getPosition();
                    int k7;
                    for (k7 = 0; zzwq1.zzvG() > 0; k7++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(k2);
                    int ai9[];
                    if (zzfZ == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = zzfZ.length;
                    }
                    ai9 = new int[k7 + k2];
                    k7 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(zzfZ, 0, ai9, 0, k2);
                        k7 = k2;
                    }
                    for (; k7 < ai9.length; k7++)
                    {
                        ai9[k7] = zzwq1.zzvx();
                    }

                    zzfZ = ai9;
                    zzwq1.zziq(j11);
                    break;

                case 48: // '0'
                    int l7 = zzxb.zzc(zzwq1, 48);
                    int ai10[];
                    int l2;
                    if (zzga == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = zzga.length;
                    }
                    ai10 = new int[l7 + l2];
                    l7 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(zzga, 0, ai10, 0, l2);
                        l7 = l2;
                    }
                    for (; l7 < ai10.length - 1; l7++)
                    {
                        ai10[l7] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai10[l7] = zzwq1.zzvx();
                    zzga = ai10;
                    break;

                case 50: // '2'
                    int k11 = zzwq1.zzip(zzwq1.zzvB());
                    int i3 = zzwq1.getPosition();
                    int i8;
                    for (i8 = 0; zzwq1.zzvG() > 0; i8++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(i3);
                    int ai11[];
                    if (zzga == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = zzga.length;
                    }
                    ai11 = new int[i8 + i3];
                    i8 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(zzga, 0, ai11, 0, i3);
                        i8 = i3;
                    }
                    for (; i8 < ai11.length; i8++)
                    {
                        ai11[i8] = zzwq1.zzvx();
                    }

                    zzga = ai11;
                    zzwq1.zziq(k11);
                    break;

                case 56: // '8'
                    int j8 = zzxb.zzc(zzwq1, 56);
                    int ai12[];
                    int j3;
                    if (zzgb == null)
                    {
                        j3 = 0;
                    } else
                    {
                        j3 = zzgb.length;
                    }
                    ai12 = new int[j8 + j3];
                    j8 = j3;
                    if (j3 != 0)
                    {
                        System.arraycopy(zzgb, 0, ai12, 0, j3);
                        j8 = j3;
                    }
                    for (; j8 < ai12.length - 1; j8++)
                    {
                        ai12[j8] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai12[j8] = zzwq1.zzvx();
                    zzgb = ai12;
                    break;

                case 58: // ':'
                    int l11 = zzwq1.zzip(zzwq1.zzvB());
                    int k3 = zzwq1.getPosition();
                    int k8;
                    for (k8 = 0; zzwq1.zzvG() > 0; k8++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(k3);
                    int ai13[];
                    if (zzgb == null)
                    {
                        k3 = 0;
                    } else
                    {
                        k3 = zzgb.length;
                    }
                    ai13 = new int[k8 + k3];
                    k8 = k3;
                    if (k3 != 0)
                    {
                        System.arraycopy(zzgb, 0, ai13, 0, k3);
                        k8 = k3;
                    }
                    for (; k8 < ai13.length; k8++)
                    {
                        ai13[k8] = zzwq1.zzvx();
                    }

                    zzgb = ai13;
                    zzwq1.zziq(l11);
                    break;

                case 64: // '@'
                    int l8 = zzxb.zzc(zzwq1, 64);
                    int ai14[];
                    int l3;
                    if (zzgc == null)
                    {
                        l3 = 0;
                    } else
                    {
                        l3 = zzgc.length;
                    }
                    ai14 = new int[l8 + l3];
                    l8 = l3;
                    if (l3 != 0)
                    {
                        System.arraycopy(zzgc, 0, ai14, 0, l3);
                        l8 = l3;
                    }
                    for (; l8 < ai14.length - 1; l8++)
                    {
                        ai14[l8] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai14[l8] = zzwq1.zzvx();
                    zzgc = ai14;
                    break;

                case 66: // 'B'
                    int i12 = zzwq1.zzip(zzwq1.zzvB());
                    int i4 = zzwq1.getPosition();
                    int i9;
                    for (i9 = 0; zzwq1.zzvG() > 0; i9++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(i4);
                    int ai15[];
                    if (zzgc == null)
                    {
                        i4 = 0;
                    } else
                    {
                        i4 = zzgc.length;
                    }
                    ai15 = new int[i9 + i4];
                    i9 = i4;
                    if (i4 != 0)
                    {
                        System.arraycopy(zzgc, 0, ai15, 0, i4);
                        i9 = i4;
                    }
                    for (; i9 < ai15.length; i9++)
                    {
                        ai15[i9] = zzwq1.zzvx();
                    }

                    zzgc = ai15;
                    zzwq1.zziq(i12);
                    break;

                case 72: // 'H'
                    int j9 = zzxb.zzc(zzwq1, 72);
                    int ai16[];
                    int j4;
                    if (zzgd == null)
                    {
                        j4 = 0;
                    } else
                    {
                        j4 = zzgd.length;
                    }
                    ai16 = new int[j9 + j4];
                    j9 = j4;
                    if (j4 != 0)
                    {
                        System.arraycopy(zzgd, 0, ai16, 0, j4);
                        j9 = j4;
                    }
                    for (; j9 < ai16.length - 1; j9++)
                    {
                        ai16[j9] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai16[j9] = zzwq1.zzvx();
                    zzgd = ai16;
                    break;

                case 74: // 'J'
                    int j12 = zzwq1.zzip(zzwq1.zzvB());
                    int k4 = zzwq1.getPosition();
                    int k9;
                    for (k9 = 0; zzwq1.zzvG() > 0; k9++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(k4);
                    int ai17[];
                    if (zzgd == null)
                    {
                        k4 = 0;
                    } else
                    {
                        k4 = zzgd.length;
                    }
                    ai17 = new int[k9 + k4];
                    k9 = k4;
                    if (k4 != 0)
                    {
                        System.arraycopy(zzgd, 0, ai17, 0, k4);
                        k9 = k4;
                    }
                    for (; k9 < ai17.length; k9++)
                    {
                        ai17[k9] = zzwq1.zzvx();
                    }

                    zzgd = ai17;
                    zzwq1.zziq(j12);
                    break;

                case 80: // 'P'
                    int l9 = zzxb.zzc(zzwq1, 80);
                    int ai18[];
                    int l4;
                    if (zzge == null)
                    {
                        l4 = 0;
                    } else
                    {
                        l4 = zzge.length;
                    }
                    ai18 = new int[l9 + l4];
                    l9 = l4;
                    if (l4 != 0)
                    {
                        System.arraycopy(zzge, 0, ai18, 0, l4);
                        l9 = l4;
                    }
                    for (; l9 < ai18.length - 1; l9++)
                    {
                        ai18[l9] = zzwq1.zzvx();
                        zzwq1.zzvu();
                    }

                    ai18[l9] = zzwq1.zzvx();
                    zzge = ai18;
                    break;

                case 82: // 'R'
                    int k12 = zzwq1.zzip(zzwq1.zzvB());
                    int i5 = zzwq1.getPosition();
                    int i10;
                    for (i10 = 0; zzwq1.zzvG() > 0; i10++)
                    {
                        zzwq1.zzvx();
                    }

                    zzwq1.zzir(i5);
                    int ai19[];
                    if (zzge == null)
                    {
                        i5 = 0;
                    } else
                    {
                        i5 = zzge.length;
                    }
                    ai19 = new int[i10 + i5];
                    i10 = i5;
                    if (i5 != 0)
                    {
                        System.arraycopy(zzge, 0, ai19, 0, i5);
                        i10 = i5;
                    }
                    for (; i10 < ai19.length; i10++)
                    {
                        ai19[i10] = zzwq1.zzvx();
                    }

                    zzge = ai19;
                    zzwq1.zziq(k12);
                    break;
                }
            } while (true);
        }

        public final zzg zzm()
        {
            zzfV = zzxb.zzaHO;
            zzfW = zzxb.zzaHO;
            zzfX = zzxb.zzaHO;
            zzfY = zzxb.zzaHO;
            zzfZ = zzxb.zzaHO;
            zzga = zzxb.zzaHO;
            zzgb = zzxb.zzaHO;
            zzgc = zzxb.zzaHO;
            zzgd = zzxb.zzaHO;
            zzge = zzxb.zzaHO;
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zzg()
        {
            zzm();
        }
    }

    public static final class zzi extends zzws
    {

        private static volatile zzi zzgo[];
        public String name;
        public zzd.zza zzgp;
        public zzd zzgq;

        public static zzi[] zzo()
        {
            if (zzgo == null)
            {
                synchronized (zzww.zzaHL)
                {
                    if (zzgo == null)
                    {
                        zzgo = new zzi[0];
                    }
                }
            }
            return zzgo;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
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
            if (!(obj instanceof zzi)) goto _L4; else goto _L3
_L3:
            obj = (zzi)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zzi) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (zzgp != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((zzi) (obj)).zzgp != null) goto _L4; else goto _L10
_L10:
            if (zzgq != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((zzi) (obj)).zzgq != null) goto _L4; else goto _L11
_L11:
            return zza(((zzws) (obj)));
_L6:
            if (!name.equals(((zzi) (obj)).name))
            {
                return false;
            }
              goto _L7
_L9:
            if (!zzgp.equals(((zzi) (obj)).zzgp))
            {
                return false;
            }
              goto _L10
            if (!zzgq.equals(((zzi) (obj)).zzgq))
            {
                return false;
            }
              goto _L11
        }

        public final int hashCode()
        {
            int k = 0;
            int i;
            int j;
            if (name == null)
            {
                i = 0;
            } else
            {
                i = name.hashCode();
            }
            if (zzgp == null)
            {
                j = 0;
            } else
            {
                j = zzgp.hashCode();
            }
            if (zzgq != null)
            {
                k = zzgq.hashCode();
            }
            return ((j + (i + 527) * 31) * 31 + k) * 31 + zzvL();
        }

        public final void zza(zzwr zzwr1)
        {
            if (!name.equals(""))
            {
                zzwr1.zzb(1, name);
            }
            if (zzgp != null)
            {
                zzwr1.zza(2, zzgp);
            }
            if (zzgq != null)
            {
                zzwr1.zza(3, zzgq);
            }
            super.zza(zzwr1);
        }

        public final zzwy zzb(zzwq zzwq1)
        {
            return zzj(zzwq1);
        }

        protected final int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!name.equals(""))
            {
                i = j + zzwr.zzj(1, name);
            }
            j = i;
            if (zzgp != null)
            {
                j = i + zzwr.zzc(2, zzgp);
            }
            i = j;
            if (zzgq != null)
            {
                i = j + zzwr.zzc(3, zzgq);
            }
            return i;
        }

        public final zzi zzj(zzwq zzwq1)
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
                    name = zzwq1.readString();
                    break;

                case 18: // '\022'
                    if (zzgp == null)
                    {
                        zzgp = new zzd.zza();
                    }
                    zzwq1.zza(zzgp);
                    break;

                case 26: // '\032'
                    if (zzgq == null)
                    {
                        zzgq = new zzd();
                    }
                    zzwq1.zza(zzgq);
                    break;
                }
            } while (true);
        }

        public final zzi zzp()
        {
            name = "";
            zzgp = null;
            zzgq = null;
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zzi()
        {
            zzp();
        }
    }

    public static final class zzj extends zzws
    {

        public zzi zzgr[];
        public zzf zzgs;
        public String zzgt;

        public static zzj zzb(byte abyte0[])
        {
            return (zzj)zzwy.zza(new zzj(), abyte0);
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
            if (!(obj instanceof zzj)) goto _L4; else goto _L3
_L3:
            obj = (zzj)obj;
            flag = flag1;
            if (!zzww.equals(zzgr, ((zzj) (obj)).zzgr)) goto _L4; else goto _L5
_L5:
            if (zzgs != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzj) (obj)).zzgs != null) goto _L4; else goto _L8
_L8:
            if (zzgt != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((zzj) (obj)).zzgt != null) goto _L4; else goto _L9
_L9:
            return zza(((zzws) (obj)));
_L7:
            if (!zzgs.equals(((zzj) (obj)).zzgs))
            {
                return false;
            }
              goto _L8
            if (!zzgt.equals(((zzj) (obj)).zzgt))
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
                    zzi zzi1 = zzgr[i];
                    if (zzi1 != null)
                    {
                        zzwr1.zza(1, zzi1);
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
                        zzi zzi1 = zzgr[k];
                        j = i;
                        if (zzi1 != null)
                        {
                            j = i + zzwr.zzc(1, zzi1);
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

        public final zzj zzk(zzwq zzwq1)
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
                    zzi azzi[];
                    int j;
                    if (zzgr == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzgr.length;
                    }
                    azzi = new zzi[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzgr, 0, azzi, 0, j);
                        k = j;
                    }
                    for (; k < azzi.length - 1; k++)
                    {
                        azzi[k] = new zzi();
                        zzwq1.zza(azzi[k]);
                        zzwq1.zzvu();
                    }

                    azzi[k] = new zzi();
                    zzwq1.zza(azzi[k]);
                    zzgr = azzi;
                    break;

                case 18: // '\022'
                    if (zzgs == null)
                    {
                        zzgs = new zzf();
                    }
                    zzwq1.zza(zzgs);
                    break;

                case 26: // '\032'
                    zzgt = zzwq1.readString();
                    break;
                }
            } while (true);
        }

        public final zzj zzq()
        {
            zzgr = zzi.zzo();
            zzgs = null;
            zzgt = "";
            zzaHB = null;
            zzaHM = -1;
            return this;
        }

        public zzj()
        {
            zzq();
        }
    }

}
