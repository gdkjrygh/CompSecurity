// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznq, zznr, zzny, 
//            zznw, zzob, zznx, zznt

public interface com.google.android.gms.internal.zzc
{
    public static final class zza extends zzns
    {

        public int level;
        public int zzgc;
        public int zzgd;

        public boolean equals(Object obj)
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
                        if (zzgc == ((zza) (obj)).zzgc)
                        {
                            flag = flag1;
                            if (zzgd == ((zza) (obj)).zzgd)
                            {
                                return zza(((zzns) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((level + 527) * 31 + zzgc) * 31 + zzgd) * 31 + zzzP();
        }

        public zza zza(zznq zznq1)
            throws IOException
        {
_L6:
            int i = zznq1.zzzy();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       16: 103
        //                       24: 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (zza(zznq1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = zznq1.zzzB();
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
            zzgc = zznq1.zzzB();
            continue; /* Loop/switch isn't completed */
_L5:
            zzgd = zznq1.zzzB();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (level != 1)
            {
                zznr1.zzx(1, level);
            }
            if (zzgc != 0)
            {
                zznr1.zzx(2, zzgc);
            }
            if (zzgd != 0)
            {
                zznr1.zzx(3, zzgd);
            }
            super.zza(zznr1);
        }

        public zza zzb()
        {
            level = 1;
            zzgc = 0;
            zzgd = 0;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zza(zznq1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (level != 1)
            {
                i = j + zznr.zzz(1, level);
            }
            j = i;
            if (zzgc != 0)
            {
                j = i + zznr.zzz(2, zzgc);
            }
            i = j;
            if (zzgd != 0)
            {
                i = j + zznr.zzz(3, zzgd);
            }
            return i;
        }

        public zza()
        {
            zzb();
        }
    }

    public static final class zzb extends zzns
    {

        private static volatile zzb zzge[];
        public int name;
        public int zzgf[];
        public int zzgg;
        public boolean zzgh;
        public boolean zzgi;

        public static zzb[] zzd()
        {
            if (zzge == null)
            {
                synchronized (zznw.zzaNS)
                {
                    if (zzge == null)
                    {
                        zzge = new zzb[0];
                    }
                }
            }
            return zzge;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
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
                    if (zznw.equals(zzgf, ((zzb) (obj)).zzgf))
                    {
                        flag = flag1;
                        if (zzgg == ((zzb) (obj)).zzgg)
                        {
                            flag = flag1;
                            if (name == ((zzb) (obj)).name)
                            {
                                flag = flag1;
                                if (zzgh == ((zzb) (obj)).zzgh)
                                {
                                    flag = flag1;
                                    if (zzgi == ((zzb) (obj)).zzgi)
                                    {
                                        return zza(((zzns) (obj)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            char c1 = '\u04CF';
            int i = zznw.hashCode(zzgf);
            int j = zzgg;
            int k = name;
            char c;
            if (zzgh)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (!zzgi)
            {
                c1 = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzgi)
            {
                zznr1.zzb(1, zzgi);
            }
            zznr1.zzx(2, zzgg);
            if (zzgf != null && zzgf.length > 0)
            {
                for (int i = 0; i < zzgf.length; i++)
                {
                    zznr1.zzx(3, zzgf[i]);
                }

            }
            if (name != 0)
            {
                zznr1.zzx(4, name);
            }
            if (zzgh)
            {
                zznr1.zzb(6, zzgh);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzc(zznq1);
        }

        protected int zzc()
        {
            int j = 0;
            int k = super.zzc();
            int i = k;
            if (zzgi)
            {
                i = k + zznr.zzc(1, zzgi);
            }
            k = zznr.zzz(2, zzgg) + i;
            if (zzgf != null && zzgf.length > 0)
            {
                for (i = 0; i < zzgf.length; i++)
                {
                    j += zznr.zzju(zzgf[i]);
                }

                j = k + j + zzgf.length * 1;
            } else
            {
                j = k;
            }
            i = j;
            if (name != 0)
            {
                i = j + zznr.zzz(4, name);
            }
            j = i;
            if (zzgh)
            {
                j = i + zznr.zzc(6, zzgh);
            }
            return j;
        }

        public zzb zzc(zznq zznq1)
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

                case 8: // '\b'
                    zzgi = zznq1.zzzC();
                    break;

                case 16: // '\020'
                    zzgg = zznq1.zzzB();
                    break;

                case 24: // '\030'
                    int l = zzob.zzb(zznq1, 24);
                    int ai[];
                    int j;
                    if (zzgf == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzgf.length;
                    }
                    ai = new int[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzgf, 0, ai, 0, j);
                        l = j;
                    }
                    for (; l < ai.length - 1; l++)
                    {
                        ai[l] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai[l] = zznq1.zzzB();
                    zzgf = ai;
                    break;

                case 26: // '\032'
                    int j1 = zznq1.zzjn(zznq1.zzzF());
                    int k = zznq1.getPosition();
                    int i1;
                    for (i1 = 0; zznq1.zzzK() > 0; i1++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k);
                    int ai1[];
                    if (zzgf == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzgf.length;
                    }
                    ai1 = new int[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzgf, 0, ai1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < ai1.length; i1++)
                    {
                        ai1[i1] = zznq1.zzzB();
                    }

                    zzgf = ai1;
                    zznq1.zzjo(j1);
                    break;

                case 32: // ' '
                    name = zznq1.zzzB();
                    break;

                case 48: // '0'
                    zzgh = zznq1.zzzC();
                    break;
                }
            } while (true);
        }

        public zzb zze()
        {
            zzgf = zzob.zzaNV;
            zzgg = 0;
            name = 0;
            zzgh = false;
            zzgi = false;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzb()
        {
            zze();
        }
    }

    public static final class zzc extends zzns
    {

        private static volatile zzc zzgj[];
        public String zzgk;
        public long zzgl;
        public long zzgm;
        public boolean zzgn;
        public long zzgo;

        public static zzc[] zzf()
        {
            if (zzgj == null)
            {
                synchronized (zznw.zzaNS)
                {
                    if (zzgj == null)
                    {
                        zzgj = new zzc[0];
                    }
                }
            }
            return zzgj;
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
            if (!(obj instanceof zzc))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (zzc)obj;
            if (zzgk != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zzc) (obj)).zzgk != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (zzgl == ((zzc) (obj)).zzgl)
            {
                flag = flag1;
                if (zzgm == ((zzc) (obj)).zzgm)
                {
                    flag = flag1;
                    if (zzgn == ((zzc) (obj)).zzgn)
                    {
                        flag = flag1;
                        if (zzgo == ((zzc) (obj)).zzgo)
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!zzgk.equals(((zzc) (obj)).zzgk))
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
            char c;
            int j;
            int k;
            if (zzgk == null)
            {
                i = 0;
            } else
            {
                i = zzgk.hashCode();
            }
            j = (int)(zzgl ^ zzgl >>> 32);
            k = (int)(zzgm ^ zzgm >>> 32);
            if (zzgn)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzgo ^ zzgo >>> 32)) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!zzgk.equals(""))
            {
                zznr1.zzb(1, zzgk);
            }
            if (zzgl != 0L)
            {
                zznr1.zzb(2, zzgl);
            }
            if (zzgm != 0x7fffffffL)
            {
                zznr1.zzb(3, zzgm);
            }
            if (zzgn)
            {
                zznr1.zzb(4, zzgn);
            }
            if (zzgo != 0L)
            {
                zznr1.zzb(5, zzgo);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzd(zznq1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!zzgk.equals(""))
            {
                i = j + zznr.zzj(1, zzgk);
            }
            j = i;
            if (zzgl != 0L)
            {
                j = i + zznr.zzd(2, zzgl);
            }
            i = j;
            if (zzgm != 0x7fffffffL)
            {
                i = j + zznr.zzd(3, zzgm);
            }
            j = i;
            if (zzgn)
            {
                j = i + zznr.zzc(4, zzgn);
            }
            i = j;
            if (zzgo != 0L)
            {
                i = j + zznr.zzd(5, zzgo);
            }
            return i;
        }

        public zzc zzd(zznq zznq1)
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
                    zzgk = zznq1.readString();
                    break;

                case 16: // '\020'
                    zzgl = zznq1.zzzA();
                    break;

                case 24: // '\030'
                    zzgm = zznq1.zzzA();
                    break;

                case 32: // ' '
                    zzgn = zznq1.zzzC();
                    break;

                case 40: // '('
                    zzgo = zznq1.zzzA();
                    break;
                }
            } while (true);
        }

        public zzc zzg()
        {
            zzgk = "";
            zzgl = 0L;
            zzgm = 0x7fffffffL;
            zzgn = false;
            zzgo = 0L;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzc()
        {
            zzg();
        }
    }

    public static final class zzd extends zzns
    {

        public zzd.zza zzgp[];
        public zzd.zza zzgq[];
        public zzc zzgr[];

        public boolean equals(Object obj)
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
                    if (zznw.equals(zzgp, ((zzd) (obj)).zzgp))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgq, ((zzd) (obj)).zzgq))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgr, ((zzd) (obj)).zzgr))
                            {
                                return zza(((zzns) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((zznw.hashCode(zzgp) + 527) * 31 + zznw.hashCode(zzgq)) * 31 + zznw.hashCode(zzgr)) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgp != null && zzgp.length > 0)
            {
                for (int i = 0; i < zzgp.length; i++)
                {
                    zzd.zza zza1 = zzgp[i];
                    if (zza1 != null)
                    {
                        zznr1.zza(1, zza1);
                    }
                }

            }
            if (zzgq != null && zzgq.length > 0)
            {
                for (int j = 0; j < zzgq.length; j++)
                {
                    zzd.zza zza2 = zzgq[j];
                    if (zza2 != null)
                    {
                        zznr1.zza(2, zza2);
                    }
                }

            }
            if (zzgr != null && zzgr.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < zzgr.length; k++)
                {
                    zzc zzc1 = zzgr[k];
                    if (zzc1 != null)
                    {
                        zznr1.zza(3, zzc1);
                    }
                }

            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zze(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int i = super.zzc();
            int j = i;
            if (zzgp != null)
            {
                j = i;
                if (zzgp.length > 0)
                {
                    for (j = 0; j < zzgp.length;)
                    {
                        zzd.zza zza1 = zzgp[j];
                        int i1 = i;
                        if (zza1 != null)
                        {
                            i1 = i + zznr.zzc(1, zza1);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzgq != null)
            {
                i = j;
                if (zzgq.length > 0)
                {
                    i = j;
                    for (int k = 0; k < zzgq.length;)
                    {
                        zzd.zza zza2 = zzgq[k];
                        int j1 = i;
                        if (zza2 != null)
                        {
                            j1 = i + zznr.zzc(2, zza2);
                        }
                        k++;
                        i = j1;
                    }

                }
            }
            int k1 = i;
            if (zzgr != null)
            {
                k1 = i;
                if (zzgr.length > 0)
                {
                    int l = ((flag) ? 1 : 0);
                    do
                    {
                        k1 = i;
                        if (l >= zzgr.length)
                        {
                            break;
                        }
                        zzc zzc1 = zzgr[l];
                        k1 = i;
                        if (zzc1 != null)
                        {
                            k1 = i + zznr.zzc(3, zzc1);
                        }
                        l++;
                        i = k1;
                    } while (true);
                }
            }
            return k1;
        }

        public zzd zze(zznq zznq1)
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
                    int i1 = zzob.zzb(zznq1, 10);
                    zzd.zza azza[];
                    int j;
                    if (zzgp == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzgp.length;
                    }
                    azza = new zzd.zza[i1 + j];
                    i1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzgp, 0, azza, 0, j);
                        i1 = j;
                    }
                    for (; i1 < azza.length - 1; i1++)
                    {
                        azza[i1] = new zzd.zza();
                        zznq1.zza(azza[i1]);
                        zznq1.zzzy();
                    }

                    azza[i1] = new zzd.zza();
                    zznq1.zza(azza[i1]);
                    zzgp = azza;
                    break;

                case 18: // '\022'
                    int j1 = zzob.zzb(zznq1, 18);
                    zzd.zza azza1[];
                    int k;
                    if (zzgq == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzgq.length;
                    }
                    azza1 = new zzd.zza[j1 + k];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzgq, 0, azza1, 0, k);
                        j1 = k;
                    }
                    for (; j1 < azza1.length - 1; j1++)
                    {
                        azza1[j1] = new zzd.zza();
                        zznq1.zza(azza1[j1]);
                        zznq1.zzzy();
                    }

                    azza1[j1] = new zzd.zza();
                    zznq1.zza(azza1[j1]);
                    zzgq = azza1;
                    break;

                case 26: // '\032'
                    int k1 = zzob.zzb(zznq1, 26);
                    zzc azzc[];
                    int l;
                    if (zzgr == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzgr.length;
                    }
                    azzc = new zzc[k1 + l];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzgr, 0, azzc, 0, l);
                        k1 = l;
                    }
                    for (; k1 < azzc.length - 1; k1++)
                    {
                        azzc[k1] = new zzc();
                        zznq1.zza(azzc[k1]);
                        zznq1.zzzy();
                    }

                    azzc[k1] = new zzc();
                    zznq1.zza(azzc[k1]);
                    zzgr = azzc;
                    break;
                }
            } while (true);
        }

        public zzd zzh()
        {
            zzgp = com.google.android.gms.internal.zzd.zza.zzr();
            zzgq = com.google.android.gms.internal.zzd.zza.zzr();
            zzgr = zzc.zzf();
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzd()
        {
            zzh();
        }
    }

    public static final class zze extends zzns
    {

        private static volatile zze zzgs[];
        public int key;
        public int value;

        public static zze[] zzi()
        {
            if (zzgs == null)
            {
                synchronized (zznw.zzaNS)
                {
                    if (zzgs == null)
                    {
                        zzgs = new zze[0];
                    }
                }
            }
            return zzgs;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
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
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return ((key + 527) * 31 + value) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            zznr1.zzx(1, key);
            zznr1.zzx(2, value);
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzf(zznq1);
        }

        protected int zzc()
        {
            return super.zzc() + zznr.zzz(1, key) + zznr.zzz(2, value);
        }

        public zze zzf(zznq zznq1)
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

                case 8: // '\b'
                    key = zznq1.zzzB();
                    break;

                case 16: // '\020'
                    value = zznq1.zzzB();
                    break;
                }
            } while (true);
        }

        public zze zzj()
        {
            key = 0;
            value = 0;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zze()
        {
            zzj();
        }
    }

    public static final class zzf extends zzns
    {

        public String version;
        public zzg zzgA[];
        public String zzgB;
        public String zzgC;
        public String zzgD;
        public zza zzgE;
        public float zzgF;
        public boolean zzgG;
        public String zzgH[];
        public int zzgI;
        public String zzgt[];
        public String zzgu[];
        public zzd.zza zzgv[];
        public zze zzgw[];
        public zzb zzgx[];
        public zzb zzgy[];
        public zzb zzgz[];

        public static zzf zza(byte abyte0[])
            throws zznx
        {
            return (zzf)zzny.zza(new zzf(), abyte0);
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
            if (!(obj instanceof zzf)) goto _L4; else goto _L3
_L3:
            obj = (zzf)obj;
            flag = flag1;
            if (!zznw.equals(zzgt, ((zzf) (obj)).zzgt)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!zznw.equals(zzgu, ((zzf) (obj)).zzgu)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!zznw.equals(zzgv, ((zzf) (obj)).zzgv)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!zznw.equals(zzgw, ((zzf) (obj)).zzgw)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zznw.equals(zzgx, ((zzf) (obj)).zzgx)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zznw.equals(zzgy, ((zzf) (obj)).zzgy)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zznw.equals(zzgz, ((zzf) (obj)).zzgz)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!zznw.equals(zzgA, ((zzf) (obj)).zzgA)) goto _L4; else goto _L12
_L12:
            if (zzgB != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((zzf) (obj)).zzgB != null) goto _L4; else goto _L15
_L15:
            if (zzgC != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((zzf) (obj)).zzgC != null) goto _L4; else goto _L18
_L18:
            if (zzgD != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((zzf) (obj)).zzgD != null) goto _L4; else goto _L21
_L21:
            if (version != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((zzf) (obj)).version != null) goto _L4; else goto _L24
_L24:
            if (zzgE != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((zzf) (obj)).zzgE != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(zzgF) == Float.floatToIntBits(((zzf) (obj)).zzgF))
            {
                flag = flag1;
                if (zzgG == ((zzf) (obj)).zzgG)
                {
                    flag = flag1;
                    if (zznw.equals(zzgH, ((zzf) (obj)).zzgH))
                    {
                        flag = flag1;
                        if (zzgI == ((zzf) (obj)).zzgI)
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!zzgB.equals(((zzf) (obj)).zzgB))
            {
                return false;
            }
              goto _L15
_L17:
            if (!zzgC.equals(((zzf) (obj)).zzgC))
            {
                return false;
            }
              goto _L18
_L20:
            if (!zzgD.equals(((zzf) (obj)).zzgD))
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
            if (!zzgE.equals(((zzf) (obj)).zzgE))
            {
                return false;
            }
              goto _L25
        }

        public int hashCode()
        {
            int i1 = 0;
            int j1 = zznw.hashCode(zzgt);
            int k1 = zznw.hashCode(zzgu);
            int l1 = zznw.hashCode(zzgv);
            int i2 = zznw.hashCode(zzgw);
            int j2 = zznw.hashCode(zzgx);
            int k2 = zznw.hashCode(zzgy);
            int l2 = zznw.hashCode(zzgz);
            int i3 = zznw.hashCode(zzgA);
            int i;
            int j;
            int k;
            int l;
            char c;
            int j3;
            if (zzgB == null)
            {
                i = 0;
            } else
            {
                i = zzgB.hashCode();
            }
            if (zzgC == null)
            {
                j = 0;
            } else
            {
                j = zzgC.hashCode();
            }
            if (zzgD == null)
            {
                k = 0;
            } else
            {
                k = zzgD.hashCode();
            }
            if (version == null)
            {
                l = 0;
            } else
            {
                l = version.hashCode();
            }
            if (zzgE != null)
            {
                i1 = zzgE.hashCode();
            }
            j3 = Float.floatToIntBits(zzgF);
            if (zzgG)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zznw.hashCode(zzgH)) * 31 + zzgI) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgu != null && zzgu.length > 0)
            {
                for (int i = 0; i < zzgu.length; i++)
                {
                    String s = zzgu[i];
                    if (s != null)
                    {
                        zznr1.zzb(1, s);
                    }
                }

            }
            if (zzgv != null && zzgv.length > 0)
            {
                for (int j = 0; j < zzgv.length; j++)
                {
                    zzd.zza zza1 = zzgv[j];
                    if (zza1 != null)
                    {
                        zznr1.zza(2, zza1);
                    }
                }

            }
            if (zzgw != null && zzgw.length > 0)
            {
                for (int k = 0; k < zzgw.length; k++)
                {
                    zze zze1 = zzgw[k];
                    if (zze1 != null)
                    {
                        zznr1.zza(3, zze1);
                    }
                }

            }
            if (zzgx != null && zzgx.length > 0)
            {
                for (int l = 0; l < zzgx.length; l++)
                {
                    zzb zzb1 = zzgx[l];
                    if (zzb1 != null)
                    {
                        zznr1.zza(4, zzb1);
                    }
                }

            }
            if (zzgy != null && zzgy.length > 0)
            {
                for (int i1 = 0; i1 < zzgy.length; i1++)
                {
                    zzb zzb2 = zzgy[i1];
                    if (zzb2 != null)
                    {
                        zznr1.zza(5, zzb2);
                    }
                }

            }
            if (zzgz != null && zzgz.length > 0)
            {
                for (int j1 = 0; j1 < zzgz.length; j1++)
                {
                    zzb zzb3 = zzgz[j1];
                    if (zzb3 != null)
                    {
                        zznr1.zza(6, zzb3);
                    }
                }

            }
            if (zzgA != null && zzgA.length > 0)
            {
                for (int k1 = 0; k1 < zzgA.length; k1++)
                {
                    zzg zzg1 = zzgA[k1];
                    if (zzg1 != null)
                    {
                        zznr1.zza(7, zzg1);
                    }
                }

            }
            if (!zzgB.equals(""))
            {
                zznr1.zzb(9, zzgB);
            }
            if (!zzgC.equals(""))
            {
                zznr1.zzb(10, zzgC);
            }
            if (!zzgD.equals("0"))
            {
                zznr1.zzb(12, zzgD);
            }
            if (!version.equals(""))
            {
                zznr1.zzb(13, version);
            }
            if (zzgE != null)
            {
                zznr1.zza(14, zzgE);
            }
            if (Float.floatToIntBits(zzgF) != Float.floatToIntBits(0.0F))
            {
                zznr1.zzb(15, zzgF);
            }
            if (zzgH != null && zzgH.length > 0)
            {
                for (int l1 = 0; l1 < zzgH.length; l1++)
                {
                    String s1 = zzgH[l1];
                    if (s1 != null)
                    {
                        zznr1.zzb(16, s1);
                    }
                }

            }
            if (zzgI != 0)
            {
                zznr1.zzx(17, zzgI);
            }
            if (zzgG)
            {
                zznr1.zzb(18, zzgG);
            }
            if (zzgt != null && zzgt.length > 0)
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < zzgt.length; i2++)
                {
                    String s2 = zzgt[i2];
                    if (s2 != null)
                    {
                        zznr1.zzb(19, s2);
                    }
                }

            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzg(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int k4 = super.zzc();
            int j;
            int k;
            int k2;
            if (zzgu != null && zzgu.length > 0)
            {
                int i = 0;
                k = 0;
                int l;
                int i3;
                for (l = 0; i < zzgu.length; l = i3)
                {
                    String s = zzgu[i];
                    int l3 = k;
                    i3 = l;
                    if (s != null)
                    {
                        i3 = l + 1;
                        l3 = k + zznr.zzeB(s);
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
            if (zzgv != null)
            {
                j = k;
                if (zzgv.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzgv.length;)
                    {
                        zzd.zza zza1 = zzgv[k];
                        int i1 = j;
                        if (zza1 != null)
                        {
                            i1 = j + zznr.zzc(2, zza1);
                        }
                        k++;
                        j = i1;
                    }

                }
            }
            k = j;
            if (zzgw != null)
            {
                k = j;
                if (zzgw.length > 0)
                {
                    for (k = 0; k < zzgw.length;)
                    {
                        zze zze1 = zzgw[k];
                        int j1 = j;
                        if (zze1 != null)
                        {
                            j1 = j + zznr.zzc(3, zze1);
                        }
                        k++;
                        j = j1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzgx != null)
            {
                j = k;
                if (zzgx.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzgx.length;)
                    {
                        zzb zzb1 = zzgx[k];
                        int k1 = j;
                        if (zzb1 != null)
                        {
                            k1 = j + zznr.zzc(4, zzb1);
                        }
                        k++;
                        j = k1;
                    }

                }
            }
            k = j;
            if (zzgy != null)
            {
                k = j;
                if (zzgy.length > 0)
                {
                    for (k = 0; k < zzgy.length;)
                    {
                        zzb zzb2 = zzgy[k];
                        int l1 = j;
                        if (zzb2 != null)
                        {
                            l1 = j + zznr.zzc(5, zzb2);
                        }
                        k++;
                        j = l1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzgz != null)
            {
                j = k;
                if (zzgz.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzgz.length;)
                    {
                        zzb zzb3 = zzgz[k];
                        int i2 = j;
                        if (zzb3 != null)
                        {
                            i2 = j + zznr.zzc(6, zzb3);
                        }
                        k++;
                        j = i2;
                    }

                }
            }
            k = j;
            if (zzgA != null)
            {
                k = j;
                if (zzgA.length > 0)
                {
                    for (k = 0; k < zzgA.length;)
                    {
                        zzg zzg1 = zzgA[k];
                        int j2 = j;
                        if (zzg1 != null)
                        {
                            j2 = j + zznr.zzc(7, zzg1);
                        }
                        k++;
                        j = j2;
                    }

                    k = j;
                }
            }
            j = k;
            if (!zzgB.equals(""))
            {
                j = k + zznr.zzj(9, zzgB);
            }
            k = j;
            if (!zzgC.equals(""))
            {
                k = j + zznr.zzj(10, zzgC);
            }
            j = k;
            if (!zzgD.equals("0"))
            {
                j = k + zznr.zzj(12, zzgD);
            }
            k = j;
            if (!version.equals(""))
            {
                k = j + zznr.zzj(13, version);
            }
            k2 = k;
            if (zzgE != null)
            {
                k2 = k + zznr.zzc(14, zzgE);
            }
            j = k2;
            if (Float.floatToIntBits(zzgF) != Float.floatToIntBits(0.0F))
            {
                j = k2 + zznr.zzc(15, zzgF);
            }
            k = j;
            if (zzgH != null)
            {
                k = j;
                if (zzgH.length > 0)
                {
                    k = 0;
                    k2 = 0;
                    int j3;
                    int i4;
                    for (j3 = 0; k < zzgH.length; j3 = i4)
                    {
                        String s1 = zzgH[k];
                        k4 = k2;
                        i4 = j3;
                        if (s1 != null)
                        {
                            i4 = j3 + 1;
                            k4 = k2 + zznr.zzeB(s1);
                        }
                        k++;
                        k2 = k4;
                    }

                    k = j + k2 + j3 * 2;
                }
            }
            k2 = k;
            if (zzgI != 0)
            {
                k2 = k + zznr.zzz(17, zzgI);
            }
            j = k2;
            if (zzgG)
            {
                j = k2 + zznr.zzc(18, zzgG);
            }
            k = j;
            if (zzgt != null)
            {
                k = j;
                if (zzgt.length > 0)
                {
                    int l2 = 0;
                    int k3 = 0;
                    for (k = ((flag) ? 1 : 0); k < zzgt.length;)
                    {
                        String s2 = zzgt[k];
                        k4 = l2;
                        int j4 = k3;
                        if (s2 != null)
                        {
                            j4 = k3 + 1;
                            k4 = l2 + zznr.zzeB(s2);
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

        public zzf zzg(zznq zznq1)
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
                    int k2 = zzob.zzb(zznq1, 10);
                    String as[];
                    int j;
                    if (zzgu == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzgu.length;
                    }
                    as = new String[k2 + j];
                    k2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzgu, 0, as, 0, j);
                        k2 = j;
                    }
                    for (; k2 < as.length - 1; k2++)
                    {
                        as[k2] = zznq1.readString();
                        zznq1.zzzy();
                    }

                    as[k2] = zznq1.readString();
                    zzgu = as;
                    break;

                case 18: // '\022'
                    int l2 = zzob.zzb(zznq1, 18);
                    zzd.zza azza[];
                    int k;
                    if (zzgv == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzgv.length;
                    }
                    azza = new zzd.zza[l2 + k];
                    l2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzgv, 0, azza, 0, k);
                        l2 = k;
                    }
                    for (; l2 < azza.length - 1; l2++)
                    {
                        azza[l2] = new zzd.zza();
                        zznq1.zza(azza[l2]);
                        zznq1.zzzy();
                    }

                    azza[l2] = new zzd.zza();
                    zznq1.zza(azza[l2]);
                    zzgv = azza;
                    break;

                case 26: // '\032'
                    int i3 = zzob.zzb(zznq1, 26);
                    zze azze[];
                    int l;
                    if (zzgw == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzgw.length;
                    }
                    azze = new zze[i3 + l];
                    i3 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzgw, 0, azze, 0, l);
                        i3 = l;
                    }
                    for (; i3 < azze.length - 1; i3++)
                    {
                        azze[i3] = new zze();
                        zznq1.zza(azze[i3]);
                        zznq1.zzzy();
                    }

                    azze[i3] = new zze();
                    zznq1.zza(azze[i3]);
                    zzgw = azze;
                    break;

                case 34: // '"'
                    int j3 = zzob.zzb(zznq1, 34);
                    zzb azzb[];
                    int i1;
                    if (zzgx == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzgx.length;
                    }
                    azzb = new zzb[j3 + i1];
                    j3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzgx, 0, azzb, 0, i1);
                        j3 = i1;
                    }
                    for (; j3 < azzb.length - 1; j3++)
                    {
                        azzb[j3] = new zzb();
                        zznq1.zza(azzb[j3]);
                        zznq1.zzzy();
                    }

                    azzb[j3] = new zzb();
                    zznq1.zza(azzb[j3]);
                    zzgx = azzb;
                    break;

                case 42: // '*'
                    int k3 = zzob.zzb(zznq1, 42);
                    zzb azzb1[];
                    int j1;
                    if (zzgy == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzgy.length;
                    }
                    azzb1 = new zzb[k3 + j1];
                    k3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzgy, 0, azzb1, 0, j1);
                        k3 = j1;
                    }
                    for (; k3 < azzb1.length - 1; k3++)
                    {
                        azzb1[k3] = new zzb();
                        zznq1.zza(azzb1[k3]);
                        zznq1.zzzy();
                    }

                    azzb1[k3] = new zzb();
                    zznq1.zza(azzb1[k3]);
                    zzgy = azzb1;
                    break;

                case 50: // '2'
                    int l3 = zzob.zzb(zznq1, 50);
                    zzb azzb2[];
                    int k1;
                    if (zzgz == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzgz.length;
                    }
                    azzb2 = new zzb[l3 + k1];
                    l3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzgz, 0, azzb2, 0, k1);
                        l3 = k1;
                    }
                    for (; l3 < azzb2.length - 1; l3++)
                    {
                        azzb2[l3] = new zzb();
                        zznq1.zza(azzb2[l3]);
                        zznq1.zzzy();
                    }

                    azzb2[l3] = new zzb();
                    zznq1.zza(azzb2[l3]);
                    zzgz = azzb2;
                    break;

                case 58: // ':'
                    int i4 = zzob.zzb(zznq1, 58);
                    zzg azzg[];
                    int l1;
                    if (zzgA == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzgA.length;
                    }
                    azzg = new zzg[i4 + l1];
                    i4 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzgA, 0, azzg, 0, l1);
                        i4 = l1;
                    }
                    for (; i4 < azzg.length - 1; i4++)
                    {
                        azzg[i4] = new zzg();
                        zznq1.zza(azzg[i4]);
                        zznq1.zzzy();
                    }

                    azzg[i4] = new zzg();
                    zznq1.zza(azzg[i4]);
                    zzgA = azzg;
                    break;

                case 74: // 'J'
                    zzgB = zznq1.readString();
                    break;

                case 82: // 'R'
                    zzgC = zznq1.readString();
                    break;

                case 98: // 'b'
                    zzgD = zznq1.readString();
                    break;

                case 106: // 'j'
                    version = zznq1.readString();
                    break;

                case 114: // 'r'
                    if (zzgE == null)
                    {
                        zzgE = new zza();
                    }
                    zznq1.zza(zzgE);
                    break;

                case 125: // '}'
                    zzgF = zznq1.readFloat();
                    break;

                case 130: 
                    int j4 = zzob.zzb(zznq1, 130);
                    String as1[];
                    int i2;
                    if (zzgH == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = zzgH.length;
                    }
                    as1 = new String[j4 + i2];
                    j4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(zzgH, 0, as1, 0, i2);
                        j4 = i2;
                    }
                    for (; j4 < as1.length - 1; j4++)
                    {
                        as1[j4] = zznq1.readString();
                        zznq1.zzzy();
                    }

                    as1[j4] = zznq1.readString();
                    zzgH = as1;
                    break;

                case 136: 
                    zzgI = zznq1.zzzB();
                    break;

                case 144: 
                    zzgG = zznq1.zzzC();
                    break;

                case 154: 
                    int k4 = zzob.zzb(zznq1, 154);
                    String as2[];
                    int j2;
                    if (zzgt == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = zzgt.length;
                    }
                    as2 = new String[k4 + j2];
                    k4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(zzgt, 0, as2, 0, j2);
                        k4 = j2;
                    }
                    for (; k4 < as2.length - 1; k4++)
                    {
                        as2[k4] = zznq1.readString();
                        zznq1.zzzy();
                    }

                    as2[k4] = zznq1.readString();
                    zzgt = as2;
                    break;
                }
            } while (true);
        }

        public zzf zzk()
        {
            zzgt = zzob.zzaOa;
            zzgu = zzob.zzaOa;
            zzgv = com.google.android.gms.internal.zzd.zza.zzr();
            zzgw = zze.zzi();
            zzgx = zzb.zzd();
            zzgy = zzb.zzd();
            zzgz = zzb.zzd();
            zzgA = zzg.zzl();
            zzgB = "";
            zzgC = "";
            zzgD = "0";
            version = "";
            zzgE = null;
            zzgF = 0.0F;
            zzgG = false;
            zzgH = zzob.zzaOa;
            zzgI = 0;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzf()
        {
            zzk();
        }
    }

    public static final class zzg extends zzns
    {

        private static volatile zzg zzgJ[];
        public int zzgK[];
        public int zzgL[];
        public int zzgM[];
        public int zzgN[];
        public int zzgO[];
        public int zzgP[];
        public int zzgQ[];
        public int zzgR[];
        public int zzgS[];
        public int zzgT[];

        public static zzg[] zzl()
        {
            if (zzgJ == null)
            {
                synchronized (zznw.zzaNS)
                {
                    if (zzgJ == null)
                    {
                        zzgJ = new zzg[0];
                    }
                }
            }
            return zzgJ;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
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
                    if (zznw.equals(zzgK, ((zzg) (obj)).zzgK))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgL, ((zzg) (obj)).zzgL))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgM, ((zzg) (obj)).zzgM))
                            {
                                flag = flag1;
                                if (zznw.equals(zzgN, ((zzg) (obj)).zzgN))
                                {
                                    flag = flag1;
                                    if (zznw.equals(zzgO, ((zzg) (obj)).zzgO))
                                    {
                                        flag = flag1;
                                        if (zznw.equals(zzgP, ((zzg) (obj)).zzgP))
                                        {
                                            flag = flag1;
                                            if (zznw.equals(zzgQ, ((zzg) (obj)).zzgQ))
                                            {
                                                flag = flag1;
                                                if (zznw.equals(zzgR, ((zzg) (obj)).zzgR))
                                                {
                                                    flag = flag1;
                                                    if (zznw.equals(zzgS, ((zzg) (obj)).zzgS))
                                                    {
                                                        flag = flag1;
                                                        if (zznw.equals(zzgT, ((zzg) (obj)).zzgT))
                                                        {
                                                            return zza(((zzns) (obj)));
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

        public int hashCode()
        {
            return ((((((((((zznw.hashCode(zzgK) + 527) * 31 + zznw.hashCode(zzgL)) * 31 + zznw.hashCode(zzgM)) * 31 + zznw.hashCode(zzgN)) * 31 + zznw.hashCode(zzgO)) * 31 + zznw.hashCode(zzgP)) * 31 + zznw.hashCode(zzgQ)) * 31 + zznw.hashCode(zzgR)) * 31 + zznw.hashCode(zzgS)) * 31 + zznw.hashCode(zzgT)) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgK != null && zzgK.length > 0)
            {
                for (int i = 0; i < zzgK.length; i++)
                {
                    zznr1.zzx(1, zzgK[i]);
                }

            }
            if (zzgL != null && zzgL.length > 0)
            {
                for (int j = 0; j < zzgL.length; j++)
                {
                    zznr1.zzx(2, zzgL[j]);
                }

            }
            if (zzgM != null && zzgM.length > 0)
            {
                for (int k = 0; k < zzgM.length; k++)
                {
                    zznr1.zzx(3, zzgM[k]);
                }

            }
            if (zzgN != null && zzgN.length > 0)
            {
                for (int l = 0; l < zzgN.length; l++)
                {
                    zznr1.zzx(4, zzgN[l]);
                }

            }
            if (zzgO != null && zzgO.length > 0)
            {
                for (int i1 = 0; i1 < zzgO.length; i1++)
                {
                    zznr1.zzx(5, zzgO[i1]);
                }

            }
            if (zzgP != null && zzgP.length > 0)
            {
                for (int j1 = 0; j1 < zzgP.length; j1++)
                {
                    zznr1.zzx(6, zzgP[j1]);
                }

            }
            if (zzgQ != null && zzgQ.length > 0)
            {
                for (int k1 = 0; k1 < zzgQ.length; k1++)
                {
                    zznr1.zzx(7, zzgQ[k1]);
                }

            }
            if (zzgR != null && zzgR.length > 0)
            {
                for (int l1 = 0; l1 < zzgR.length; l1++)
                {
                    zznr1.zzx(8, zzgR[l1]);
                }

            }
            if (zzgS != null && zzgS.length > 0)
            {
                for (int i2 = 0; i2 < zzgS.length; i2++)
                {
                    zznr1.zzx(9, zzgS[i2]);
                }

            }
            if (zzgT != null && zzgT.length > 0)
            {
                for (int j2 = ((flag) ? 1 : 0); j2 < zzgT.length; j2++)
                {
                    zznr1.zzx(10, zzgT[j2]);
                }

            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzh(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int l = super.zzc();
            int j;
            int k;
            if (zzgK != null && zzgK.length > 0)
            {
                int i = 0;
                k = 0;
                for (; i < zzgK.length; i++)
                {
                    k += zznr.zzju(zzgK[i]);
                }

                k = l + k + zzgK.length * 1;
            } else
            {
                k = l;
            }
            j = k;
            if (zzgL != null)
            {
                j = k;
                if (zzgL.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgL.length; j++)
                    {
                        l += zznr.zzju(zzgL[j]);
                    }

                    j = k + l + zzgL.length * 1;
                }
            }
            k = j;
            if (zzgM != null)
            {
                k = j;
                if (zzgM.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgM.length; k++)
                    {
                        l += zznr.zzju(zzgM[k]);
                    }

                    k = j + l + zzgM.length * 1;
                }
            }
            j = k;
            if (zzgN != null)
            {
                j = k;
                if (zzgN.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgN.length; j++)
                    {
                        l += zznr.zzju(zzgN[j]);
                    }

                    j = k + l + zzgN.length * 1;
                }
            }
            k = j;
            if (zzgO != null)
            {
                k = j;
                if (zzgO.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgO.length; k++)
                    {
                        l += zznr.zzju(zzgO[k]);
                    }

                    k = j + l + zzgO.length * 1;
                }
            }
            j = k;
            if (zzgP != null)
            {
                j = k;
                if (zzgP.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgP.length; j++)
                    {
                        l += zznr.zzju(zzgP[j]);
                    }

                    j = k + l + zzgP.length * 1;
                }
            }
            k = j;
            if (zzgQ != null)
            {
                k = j;
                if (zzgQ.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgQ.length; k++)
                    {
                        l += zznr.zzju(zzgQ[k]);
                    }

                    k = j + l + zzgQ.length * 1;
                }
            }
            j = k;
            if (zzgR != null)
            {
                j = k;
                if (zzgR.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgR.length; j++)
                    {
                        l += zznr.zzju(zzgR[j]);
                    }

                    j = k + l + zzgR.length * 1;
                }
            }
            k = j;
            if (zzgS != null)
            {
                k = j;
                if (zzgS.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgS.length; k++)
                    {
                        l += zznr.zzju(zzgS[k]);
                    }

                    k = j + l + zzgS.length * 1;
                }
            }
            j = k;
            if (zzgT != null)
            {
                j = k;
                if (zzgT.length > 0)
                {
                    l = 0;
                    for (j = ((flag) ? 1 : 0); j < zzgT.length; j++)
                    {
                        l += zznr.zzju(zzgT[j]);
                    }

                    j = k + l + zzgT.length * 1;
                }
            }
            return j;
        }

        public zzg zzh(zznq zznq1)
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

                case 8: // '\b'
                    int j5 = zzob.zzb(zznq1, 8);
                    int ai[];
                    int j;
                    if (zzgK == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzgK.length;
                    }
                    ai = new int[j5 + j];
                    j5 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzgK, 0, ai, 0, j);
                        j5 = j;
                    }
                    for (; j5 < ai.length - 1; j5++)
                    {
                        ai[j5] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai[j5] = zznq1.zzzB();
                    zzgK = ai;
                    break;

                case 10: // '\n'
                    int j10 = zznq1.zzjn(zznq1.zzzF());
                    int k = zznq1.getPosition();
                    int k5;
                    for (k5 = 0; zznq1.zzzK() > 0; k5++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k);
                    int ai1[];
                    if (zzgK == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzgK.length;
                    }
                    ai1 = new int[k5 + k];
                    k5 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzgK, 0, ai1, 0, k);
                        k5 = k;
                    }
                    for (; k5 < ai1.length; k5++)
                    {
                        ai1[k5] = zznq1.zzzB();
                    }

                    zzgK = ai1;
                    zznq1.zzjo(j10);
                    break;

                case 16: // '\020'
                    int l5 = zzob.zzb(zznq1, 16);
                    int ai2[];
                    int l;
                    if (zzgL == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzgL.length;
                    }
                    ai2 = new int[l5 + l];
                    l5 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzgL, 0, ai2, 0, l);
                        l5 = l;
                    }
                    for (; l5 < ai2.length - 1; l5++)
                    {
                        ai2[l5] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai2[l5] = zznq1.zzzB();
                    zzgL = ai2;
                    break;

                case 18: // '\022'
                    int k10 = zznq1.zzjn(zznq1.zzzF());
                    int i1 = zznq1.getPosition();
                    int i6;
                    for (i6 = 0; zznq1.zzzK() > 0; i6++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i1);
                    int ai3[];
                    if (zzgL == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzgL.length;
                    }
                    ai3 = new int[i6 + i1];
                    i6 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzgL, 0, ai3, 0, i1);
                        i6 = i1;
                    }
                    for (; i6 < ai3.length; i6++)
                    {
                        ai3[i6] = zznq1.zzzB();
                    }

                    zzgL = ai3;
                    zznq1.zzjo(k10);
                    break;

                case 24: // '\030'
                    int j6 = zzob.zzb(zznq1, 24);
                    int ai4[];
                    int j1;
                    if (zzgM == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzgM.length;
                    }
                    ai4 = new int[j6 + j1];
                    j6 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzgM, 0, ai4, 0, j1);
                        j6 = j1;
                    }
                    for (; j6 < ai4.length - 1; j6++)
                    {
                        ai4[j6] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai4[j6] = zznq1.zzzB();
                    zzgM = ai4;
                    break;

                case 26: // '\032'
                    int l10 = zznq1.zzjn(zznq1.zzzF());
                    int k1 = zznq1.getPosition();
                    int k6;
                    for (k6 = 0; zznq1.zzzK() > 0; k6++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k1);
                    int ai5[];
                    if (zzgM == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzgM.length;
                    }
                    ai5 = new int[k6 + k1];
                    k6 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzgM, 0, ai5, 0, k1);
                        k6 = k1;
                    }
                    for (; k6 < ai5.length; k6++)
                    {
                        ai5[k6] = zznq1.zzzB();
                    }

                    zzgM = ai5;
                    zznq1.zzjo(l10);
                    break;

                case 32: // ' '
                    int l6 = zzob.zzb(zznq1, 32);
                    int ai6[];
                    int l1;
                    if (zzgN == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzgN.length;
                    }
                    ai6 = new int[l6 + l1];
                    l6 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzgN, 0, ai6, 0, l1);
                        l6 = l1;
                    }
                    for (; l6 < ai6.length - 1; l6++)
                    {
                        ai6[l6] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai6[l6] = zznq1.zzzB();
                    zzgN = ai6;
                    break;

                case 34: // '"'
                    int i11 = zznq1.zzjn(zznq1.zzzF());
                    int i2 = zznq1.getPosition();
                    int i7;
                    for (i7 = 0; zznq1.zzzK() > 0; i7++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i2);
                    int ai7[];
                    if (zzgN == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = zzgN.length;
                    }
                    ai7 = new int[i7 + i2];
                    i7 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(zzgN, 0, ai7, 0, i2);
                        i7 = i2;
                    }
                    for (; i7 < ai7.length; i7++)
                    {
                        ai7[i7] = zznq1.zzzB();
                    }

                    zzgN = ai7;
                    zznq1.zzjo(i11);
                    break;

                case 40: // '('
                    int j7 = zzob.zzb(zznq1, 40);
                    int ai8[];
                    int j2;
                    if (zzgO == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = zzgO.length;
                    }
                    ai8 = new int[j7 + j2];
                    j7 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(zzgO, 0, ai8, 0, j2);
                        j7 = j2;
                    }
                    for (; j7 < ai8.length - 1; j7++)
                    {
                        ai8[j7] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai8[j7] = zznq1.zzzB();
                    zzgO = ai8;
                    break;

                case 42: // '*'
                    int j11 = zznq1.zzjn(zznq1.zzzF());
                    int k2 = zznq1.getPosition();
                    int k7;
                    for (k7 = 0; zznq1.zzzK() > 0; k7++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k2);
                    int ai9[];
                    if (zzgO == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = zzgO.length;
                    }
                    ai9 = new int[k7 + k2];
                    k7 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(zzgO, 0, ai9, 0, k2);
                        k7 = k2;
                    }
                    for (; k7 < ai9.length; k7++)
                    {
                        ai9[k7] = zznq1.zzzB();
                    }

                    zzgO = ai9;
                    zznq1.zzjo(j11);
                    break;

                case 48: // '0'
                    int l7 = zzob.zzb(zznq1, 48);
                    int ai10[];
                    int l2;
                    if (zzgP == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = zzgP.length;
                    }
                    ai10 = new int[l7 + l2];
                    l7 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(zzgP, 0, ai10, 0, l2);
                        l7 = l2;
                    }
                    for (; l7 < ai10.length - 1; l7++)
                    {
                        ai10[l7] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai10[l7] = zznq1.zzzB();
                    zzgP = ai10;
                    break;

                case 50: // '2'
                    int k11 = zznq1.zzjn(zznq1.zzzF());
                    int i3 = zznq1.getPosition();
                    int i8;
                    for (i8 = 0; zznq1.zzzK() > 0; i8++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i3);
                    int ai11[];
                    if (zzgP == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = zzgP.length;
                    }
                    ai11 = new int[i8 + i3];
                    i8 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(zzgP, 0, ai11, 0, i3);
                        i8 = i3;
                    }
                    for (; i8 < ai11.length; i8++)
                    {
                        ai11[i8] = zznq1.zzzB();
                    }

                    zzgP = ai11;
                    zznq1.zzjo(k11);
                    break;

                case 56: // '8'
                    int j8 = zzob.zzb(zznq1, 56);
                    int ai12[];
                    int j3;
                    if (zzgQ == null)
                    {
                        j3 = 0;
                    } else
                    {
                        j3 = zzgQ.length;
                    }
                    ai12 = new int[j8 + j3];
                    j8 = j3;
                    if (j3 != 0)
                    {
                        System.arraycopy(zzgQ, 0, ai12, 0, j3);
                        j8 = j3;
                    }
                    for (; j8 < ai12.length - 1; j8++)
                    {
                        ai12[j8] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai12[j8] = zznq1.zzzB();
                    zzgQ = ai12;
                    break;

                case 58: // ':'
                    int l11 = zznq1.zzjn(zznq1.zzzF());
                    int k3 = zznq1.getPosition();
                    int k8;
                    for (k8 = 0; zznq1.zzzK() > 0; k8++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k3);
                    int ai13[];
                    if (zzgQ == null)
                    {
                        k3 = 0;
                    } else
                    {
                        k3 = zzgQ.length;
                    }
                    ai13 = new int[k8 + k3];
                    k8 = k3;
                    if (k3 != 0)
                    {
                        System.arraycopy(zzgQ, 0, ai13, 0, k3);
                        k8 = k3;
                    }
                    for (; k8 < ai13.length; k8++)
                    {
                        ai13[k8] = zznq1.zzzB();
                    }

                    zzgQ = ai13;
                    zznq1.zzjo(l11);
                    break;

                case 64: // '@'
                    int l8 = zzob.zzb(zznq1, 64);
                    int ai14[];
                    int l3;
                    if (zzgR == null)
                    {
                        l3 = 0;
                    } else
                    {
                        l3 = zzgR.length;
                    }
                    ai14 = new int[l8 + l3];
                    l8 = l3;
                    if (l3 != 0)
                    {
                        System.arraycopy(zzgR, 0, ai14, 0, l3);
                        l8 = l3;
                    }
                    for (; l8 < ai14.length - 1; l8++)
                    {
                        ai14[l8] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai14[l8] = zznq1.zzzB();
                    zzgR = ai14;
                    break;

                case 66: // 'B'
                    int i12 = zznq1.zzjn(zznq1.zzzF());
                    int i4 = zznq1.getPosition();
                    int i9;
                    for (i9 = 0; zznq1.zzzK() > 0; i9++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i4);
                    int ai15[];
                    if (zzgR == null)
                    {
                        i4 = 0;
                    } else
                    {
                        i4 = zzgR.length;
                    }
                    ai15 = new int[i9 + i4];
                    i9 = i4;
                    if (i4 != 0)
                    {
                        System.arraycopy(zzgR, 0, ai15, 0, i4);
                        i9 = i4;
                    }
                    for (; i9 < ai15.length; i9++)
                    {
                        ai15[i9] = zznq1.zzzB();
                    }

                    zzgR = ai15;
                    zznq1.zzjo(i12);
                    break;

                case 72: // 'H'
                    int j9 = zzob.zzb(zznq1, 72);
                    int ai16[];
                    int j4;
                    if (zzgS == null)
                    {
                        j4 = 0;
                    } else
                    {
                        j4 = zzgS.length;
                    }
                    ai16 = new int[j9 + j4];
                    j9 = j4;
                    if (j4 != 0)
                    {
                        System.arraycopy(zzgS, 0, ai16, 0, j4);
                        j9 = j4;
                    }
                    for (; j9 < ai16.length - 1; j9++)
                    {
                        ai16[j9] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai16[j9] = zznq1.zzzB();
                    zzgS = ai16;
                    break;

                case 74: // 'J'
                    int j12 = zznq1.zzjn(zznq1.zzzF());
                    int k4 = zznq1.getPosition();
                    int k9;
                    for (k9 = 0; zznq1.zzzK() > 0; k9++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k4);
                    int ai17[];
                    if (zzgS == null)
                    {
                        k4 = 0;
                    } else
                    {
                        k4 = zzgS.length;
                    }
                    ai17 = new int[k9 + k4];
                    k9 = k4;
                    if (k4 != 0)
                    {
                        System.arraycopy(zzgS, 0, ai17, 0, k4);
                        k9 = k4;
                    }
                    for (; k9 < ai17.length; k9++)
                    {
                        ai17[k9] = zznq1.zzzB();
                    }

                    zzgS = ai17;
                    zznq1.zzjo(j12);
                    break;

                case 80: // 'P'
                    int l9 = zzob.zzb(zznq1, 80);
                    int ai18[];
                    int l4;
                    if (zzgT == null)
                    {
                        l4 = 0;
                    } else
                    {
                        l4 = zzgT.length;
                    }
                    ai18 = new int[l9 + l4];
                    l9 = l4;
                    if (l4 != 0)
                    {
                        System.arraycopy(zzgT, 0, ai18, 0, l4);
                        l9 = l4;
                    }
                    for (; l9 < ai18.length - 1; l9++)
                    {
                        ai18[l9] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai18[l9] = zznq1.zzzB();
                    zzgT = ai18;
                    break;

                case 82: // 'R'
                    int k12 = zznq1.zzjn(zznq1.zzzF());
                    int i5 = zznq1.getPosition();
                    int i10;
                    for (i10 = 0; zznq1.zzzK() > 0; i10++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i5);
                    int ai19[];
                    if (zzgT == null)
                    {
                        i5 = 0;
                    } else
                    {
                        i5 = zzgT.length;
                    }
                    ai19 = new int[i10 + i5];
                    i10 = i5;
                    if (i5 != 0)
                    {
                        System.arraycopy(zzgT, 0, ai19, 0, i5);
                        i10 = i5;
                    }
                    for (; i10 < ai19.length; i10++)
                    {
                        ai19[i10] = zznq1.zzzB();
                    }

                    zzgT = ai19;
                    zznq1.zzjo(k12);
                    break;
                }
            } while (true);
        }

        public zzg zzm()
        {
            zzgK = zzob.zzaNV;
            zzgL = zzob.zzaNV;
            zzgM = zzob.zzaNV;
            zzgN = zzob.zzaNV;
            zzgO = zzob.zzaNV;
            zzgP = zzob.zzaNV;
            zzgQ = zzob.zzaNV;
            zzgR = zzob.zzaNV;
            zzgS = zzob.zzaNV;
            zzgT = zzob.zzaNV;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzg()
        {
            zzm();
        }
    }

    public static final class zzh extends zzns
    {

        public static final zznt zzgU = zznt.zza(11, com/google/android/gms/internal/zzc$zzh, 810);
        private static final zzh zzgV[] = new zzh[0];
        public int zzgW[];
        public int zzgX[];
        public int zzgY[];
        public int zzgZ;
        public int zzha[];
        public int zzhb;
        public int zzhc;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof zzh)
                {
                    obj = (zzh)obj;
                    flag = flag1;
                    if (zznw.equals(zzgW, ((zzh) (obj)).zzgW))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgX, ((zzh) (obj)).zzgX))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgY, ((zzh) (obj)).zzgY))
                            {
                                flag = flag1;
                                if (zzgZ == ((zzh) (obj)).zzgZ)
                                {
                                    flag = flag1;
                                    if (zznw.equals(zzha, ((zzh) (obj)).zzha))
                                    {
                                        flag = flag1;
                                        if (zzhb == ((zzh) (obj)).zzhb)
                                        {
                                            flag = flag1;
                                            if (zzhc == ((zzh) (obj)).zzhc)
                                            {
                                                return zza(((zzns) (obj)));
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

        public int hashCode()
        {
            return (((((((zznw.hashCode(zzgW) + 527) * 31 + zznw.hashCode(zzgX)) * 31 + zznw.hashCode(zzgY)) * 31 + zzgZ) * 31 + zznw.hashCode(zzha)) * 31 + zzhb) * 31 + zzhc) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgW != null && zzgW.length > 0)
            {
                for (int i = 0; i < zzgW.length; i++)
                {
                    zznr1.zzx(1, zzgW[i]);
                }

            }
            if (zzgX != null && zzgX.length > 0)
            {
                for (int j = 0; j < zzgX.length; j++)
                {
                    zznr1.zzx(2, zzgX[j]);
                }

            }
            if (zzgY != null && zzgY.length > 0)
            {
                for (int k = 0; k < zzgY.length; k++)
                {
                    zznr1.zzx(3, zzgY[k]);
                }

            }
            if (zzgZ != 0)
            {
                zznr1.zzx(4, zzgZ);
            }
            if (zzha != null && zzha.length > 0)
            {
                for (int l = ((flag) ? 1 : 0); l < zzha.length; l++)
                {
                    zznr1.zzx(5, zzha[l]);
                }

            }
            if (zzhb != 0)
            {
                zznr1.zzx(6, zzhb);
            }
            if (zzhc != 0)
            {
                zznr1.zzx(7, zzhc);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzi(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int l = super.zzc();
            int j;
            int k;
            if (zzgW != null && zzgW.length > 0)
            {
                int i = 0;
                k = 0;
                for (; i < zzgW.length; i++)
                {
                    k += zznr.zzju(zzgW[i]);
                }

                k = l + k + zzgW.length * 1;
            } else
            {
                k = l;
            }
            j = k;
            if (zzgX != null)
            {
                j = k;
                if (zzgX.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgX.length; j++)
                    {
                        l += zznr.zzju(zzgX[j]);
                    }

                    j = k + l + zzgX.length * 1;
                }
            }
            k = j;
            if (zzgY != null)
            {
                k = j;
                if (zzgY.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgY.length; k++)
                    {
                        l += zznr.zzju(zzgY[k]);
                    }

                    k = j + l + zzgY.length * 1;
                }
            }
            j = k;
            if (zzgZ != 0)
            {
                j = k + zznr.zzz(4, zzgZ);
            }
            k = j;
            if (zzha != null)
            {
                k = j;
                if (zzha.length > 0)
                {
                    l = 0;
                    for (k = ((flag) ? 1 : 0); k < zzha.length; k++)
                    {
                        l += zznr.zzju(zzha[k]);
                    }

                    k = j + l + zzha.length * 1;
                }
            }
            j = k;
            if (zzhb != 0)
            {
                j = k + zznr.zzz(6, zzhb);
            }
            k = j;
            if (zzhc != 0)
            {
                k = j + zznr.zzz(7, zzhc);
            }
            return k;
        }

        public zzh zzi(zznq zznq1)
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

                case 8: // '\b'
                    int j2 = zzob.zzb(zznq1, 8);
                    int ai[];
                    int j;
                    if (zzgW == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzgW.length;
                    }
                    ai = new int[j2 + j];
                    j2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzgW, 0, ai, 0, j);
                        j2 = j;
                    }
                    for (; j2 < ai.length - 1; j2++)
                    {
                        ai[j2] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai[j2] = zznq1.zzzB();
                    zzgW = ai;
                    break;

                case 10: // '\n'
                    int j4 = zznq1.zzjn(zznq1.zzzF());
                    int k = zznq1.getPosition();
                    int k2;
                    for (k2 = 0; zznq1.zzzK() > 0; k2++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k);
                    int ai1[];
                    if (zzgW == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzgW.length;
                    }
                    ai1 = new int[k2 + k];
                    k2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzgW, 0, ai1, 0, k);
                        k2 = k;
                    }
                    for (; k2 < ai1.length; k2++)
                    {
                        ai1[k2] = zznq1.zzzB();
                    }

                    zzgW = ai1;
                    zznq1.zzjo(j4);
                    break;

                case 16: // '\020'
                    int l2 = zzob.zzb(zznq1, 16);
                    int ai2[];
                    int l;
                    if (zzgX == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzgX.length;
                    }
                    ai2 = new int[l2 + l];
                    l2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzgX, 0, ai2, 0, l);
                        l2 = l;
                    }
                    for (; l2 < ai2.length - 1; l2++)
                    {
                        ai2[l2] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai2[l2] = zznq1.zzzB();
                    zzgX = ai2;
                    break;

                case 18: // '\022'
                    int k4 = zznq1.zzjn(zznq1.zzzF());
                    int i1 = zznq1.getPosition();
                    int i3;
                    for (i3 = 0; zznq1.zzzK() > 0; i3++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i1);
                    int ai3[];
                    if (zzgX == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzgX.length;
                    }
                    ai3 = new int[i3 + i1];
                    i3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzgX, 0, ai3, 0, i1);
                        i3 = i1;
                    }
                    for (; i3 < ai3.length; i3++)
                    {
                        ai3[i3] = zznq1.zzzB();
                    }

                    zzgX = ai3;
                    zznq1.zzjo(k4);
                    break;

                case 24: // '\030'
                    int j3 = zzob.zzb(zznq1, 24);
                    int ai4[];
                    int j1;
                    if (zzgY == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzgY.length;
                    }
                    ai4 = new int[j3 + j1];
                    j3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzgY, 0, ai4, 0, j1);
                        j3 = j1;
                    }
                    for (; j3 < ai4.length - 1; j3++)
                    {
                        ai4[j3] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai4[j3] = zznq1.zzzB();
                    zzgY = ai4;
                    break;

                case 26: // '\032'
                    int l4 = zznq1.zzjn(zznq1.zzzF());
                    int k1 = zznq1.getPosition();
                    int k3;
                    for (k3 = 0; zznq1.zzzK() > 0; k3++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(k1);
                    int ai5[];
                    if (zzgY == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzgY.length;
                    }
                    ai5 = new int[k3 + k1];
                    k3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzgY, 0, ai5, 0, k1);
                        k3 = k1;
                    }
                    for (; k3 < ai5.length; k3++)
                    {
                        ai5[k3] = zznq1.zzzB();
                    }

                    zzgY = ai5;
                    zznq1.zzjo(l4);
                    break;

                case 32: // ' '
                    zzgZ = zznq1.zzzB();
                    break;

                case 40: // '('
                    int l3 = zzob.zzb(zznq1, 40);
                    int ai6[];
                    int l1;
                    if (zzha == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzha.length;
                    }
                    ai6 = new int[l3 + l1];
                    l3 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzha, 0, ai6, 0, l1);
                        l3 = l1;
                    }
                    for (; l3 < ai6.length - 1; l3++)
                    {
                        ai6[l3] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai6[l3] = zznq1.zzzB();
                    zzha = ai6;
                    break;

                case 42: // '*'
                    int i5 = zznq1.zzjn(zznq1.zzzF());
                    int i2 = zznq1.getPosition();
                    int i4;
                    for (i4 = 0; zznq1.zzzK() > 0; i4++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i2);
                    int ai7[];
                    if (zzha == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = zzha.length;
                    }
                    ai7 = new int[i4 + i2];
                    i4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(zzha, 0, ai7, 0, i2);
                        i4 = i2;
                    }
                    for (; i4 < ai7.length; i4++)
                    {
                        ai7[i4] = zznq1.zzzB();
                    }

                    zzha = ai7;
                    zznq1.zzjo(i5);
                    break;

                case 48: // '0'
                    zzhb = zznq1.zzzB();
                    break;

                case 56: // '8'
                    zzhc = zznq1.zzzB();
                    break;
                }
            } while (true);
        }

        public zzh zzn()
        {
            zzgW = zzob.zzaNV;
            zzgX = zzob.zzaNV;
            zzgY = zzob.zzaNV;
            zzgZ = 0;
            zzha = zzob.zzaNV;
            zzhb = 0;
            zzhc = 0;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }


        public zzh()
        {
            zzn();
        }
    }

    public static final class zzi extends zzns
    {

        private static volatile zzi zzhd[];
        public String name;
        public zzd.zza zzhe;
        public zzd zzhf;

        public static zzi[] zzo()
        {
            if (zzhd == null)
            {
                synchronized (zznw.zzaNS)
                {
                    if (zzhd == null)
                    {
                        zzhd = new zzi[0];
                    }
                }
            }
            return zzhd;
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
            if (!(obj instanceof zzi)) goto _L4; else goto _L3
_L3:
            obj = (zzi)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zzi) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (zzhe != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((zzi) (obj)).zzhe != null) goto _L4; else goto _L10
_L10:
            if (zzhf != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((zzi) (obj)).zzhf != null) goto _L4; else goto _L11
_L11:
            return zza(((zzns) (obj)));
_L6:
            if (!name.equals(((zzi) (obj)).name))
            {
                return false;
            }
              goto _L7
_L9:
            if (!zzhe.equals(((zzi) (obj)).zzhe))
            {
                return false;
            }
              goto _L10
            if (!zzhf.equals(((zzi) (obj)).zzhf))
            {
                return false;
            }
              goto _L11
        }

        public int hashCode()
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
            if (zzhe == null)
            {
                j = 0;
            } else
            {
                j = zzhe.hashCode();
            }
            if (zzhf != null)
            {
                k = zzhf.hashCode();
            }
            return ((j + (i + 527) * 31) * 31 + k) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!name.equals(""))
            {
                zznr1.zzb(1, name);
            }
            if (zzhe != null)
            {
                zznr1.zza(2, zzhe);
            }
            if (zzhf != null)
            {
                zznr1.zza(3, zzhf);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzj(zznq1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!name.equals(""))
            {
                i = j + zznr.zzj(1, name);
            }
            j = i;
            if (zzhe != null)
            {
                j = i + zznr.zzc(2, zzhe);
            }
            i = j;
            if (zzhf != null)
            {
                i = j + zznr.zzc(3, zzhf);
            }
            return i;
        }

        public zzi zzj(zznq zznq1)
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
                    name = zznq1.readString();
                    break;

                case 18: // '\022'
                    if (zzhe == null)
                    {
                        zzhe = new zzd.zza();
                    }
                    zznq1.zza(zzhe);
                    break;

                case 26: // '\032'
                    if (zzhf == null)
                    {
                        zzhf = new zzd();
                    }
                    zznq1.zza(zzhf);
                    break;
                }
            } while (true);
        }

        public zzi zzp()
        {
            name = "";
            zzhe = null;
            zzhf = null;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzi()
        {
            zzp();
        }
    }

    public static final class zzj extends zzns
    {

        public zzi zzhg[];
        public zzf zzhh;
        public String zzhi;

        public static zzj zzb(byte abyte0[])
            throws zznx
        {
            return (zzj)zzny.zza(new zzj(), abyte0);
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
            if (!(obj instanceof zzj)) goto _L4; else goto _L3
_L3:
            obj = (zzj)obj;
            flag = flag1;
            if (!zznw.equals(zzhg, ((zzj) (obj)).zzhg)) goto _L4; else goto _L5
_L5:
            if (zzhh != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzj) (obj)).zzhh != null) goto _L4; else goto _L8
_L8:
            if (zzhi != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((zzj) (obj)).zzhi != null) goto _L4; else goto _L9
_L9:
            return zza(((zzns) (obj)));
_L7:
            if (!zzhh.equals(((zzj) (obj)).zzhh))
            {
                return false;
            }
              goto _L8
            if (!zzhi.equals(((zzj) (obj)).zzhi))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = zznw.hashCode(zzhg);
            int i;
            if (zzhh == null)
            {
                i = 0;
            } else
            {
                i = zzhh.hashCode();
            }
            if (zzhi != null)
            {
                j = zzhi.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzhg != null && zzhg.length > 0)
            {
                for (int i = 0; i < zzhg.length; i++)
                {
                    zzi zzi1 = zzhg[i];
                    if (zzi1 != null)
                    {
                        zznr1.zza(1, zzi1);
                    }
                }

            }
            if (zzhh != null)
            {
                zznr1.zza(2, zzhh);
            }
            if (!zzhi.equals(""))
            {
                zznr1.zzb(3, zzhi);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzk(zznq1);
        }

        protected int zzc()
        {
            int i = super.zzc();
            int j = i;
            if (zzhg != null)
            {
                j = i;
                if (zzhg.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= zzhg.length)
                        {
                            break;
                        }
                        zzi zzi1 = zzhg[k];
                        j = i;
                        if (zzi1 != null)
                        {
                            j = i + zznr.zzc(1, zzi1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zzhh != null)
            {
                i = j + zznr.zzc(2, zzhh);
            }
            j = i;
            if (!zzhi.equals(""))
            {
                j = i + zznr.zzj(3, zzhi);
            }
            return j;
        }

        public zzj zzk(zznq zznq1)
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
                    int k = zzob.zzb(zznq1, 10);
                    zzi azzi[];
                    int j;
                    if (zzhg == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzhg.length;
                    }
                    azzi = new zzi[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzhg, 0, azzi, 0, j);
                        k = j;
                    }
                    for (; k < azzi.length - 1; k++)
                    {
                        azzi[k] = new zzi();
                        zznq1.zza(azzi[k]);
                        zznq1.zzzy();
                    }

                    azzi[k] = new zzi();
                    zznq1.zza(azzi[k]);
                    zzhg = azzi;
                    break;

                case 18: // '\022'
                    if (zzhh == null)
                    {
                        zzhh = new zzf();
                    }
                    zznq1.zza(zzhh);
                    break;

                case 26: // '\032'
                    zzhi = zznq1.readString();
                    break;
                }
            } while (true);
        }

        public zzj zzq()
        {
            zzhg = zzi.zzo();
            zzhh = null;
            zzhi = "";
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzj()
        {
            zzq();
        }
    }

}
