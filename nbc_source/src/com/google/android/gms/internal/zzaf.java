// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrg, zzrl, zzrq

public interface zzaf
{
    public static final class zza extends zzrh
    {

        public int level;
        public int zzhK;
        public int zzhL;

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
                        if (zzhK == ((zza) (obj)).zzhK)
                        {
                            flag = flag1;
                            if (zzhL == ((zza) (obj)).zzhL)
                            {
                                return zza(((zzrh) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((level + 527) * 31 + zzhK) * 31 + zzhL) * 31 + zzBI();
        }

        public zza zzA()
        {
            level = 1;
            zzhK = 0;
            zzhL = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (level != 1)
            {
                i = j + zzrg.zzA(1, level);
            }
            j = i;
            if (zzhK != 0)
            {
                j = i + zzrg.zzA(2, zzhK);
            }
            i = j;
            if (zzhL != 0)
            {
                i = j + zzrg.zzA(3, zzhL);
            }
            return i;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (level != 1)
            {
                zzrg1.zzy(1, level);
            }
            if (zzhK != 0)
            {
                zzrg1.zzy(2, zzhK);
            }
            if (zzhL != 0)
            {
                zzrg1.zzy(3, zzhL);
            }
            super.zza(zzrg1);
        }

        public zza()
        {
            zzA();
        }
    }

    public static final class zzb extends zzrh
    {

        private static volatile zzb zzhM[];
        public int name;
        public int zzhN[];
        public int zzhO;
        public boolean zzhP;
        public boolean zzhQ;

        public static zzb[] zzC()
        {
            if (zzhM == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzhM == null)
                    {
                        zzhM = new zzb[0];
                    }
                }
            }
            return zzhM;
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
                    if (zzrl.equals(zzhN, ((zzb) (obj)).zzhN))
                    {
                        flag = flag1;
                        if (zzhO == ((zzb) (obj)).zzhO)
                        {
                            flag = flag1;
                            if (name == ((zzb) (obj)).name)
                            {
                                flag = flag1;
                                if (zzhP == ((zzb) (obj)).zzhP)
                                {
                                    flag = flag1;
                                    if (zzhQ == ((zzb) (obj)).zzhQ)
                                    {
                                        return zza(((zzrh) (obj)));
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
            int i = zzrl.hashCode(zzhN);
            int j = zzhO;
            int k = name;
            char c;
            if (zzhP)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (!zzhQ)
            {
                c1 = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = 0;
            int k = super.zzB();
            int i = k;
            if (zzhQ)
            {
                i = k + zzrg.zzc(1, zzhQ);
            }
            k = zzrg.zzA(2, zzhO) + i;
            if (zzhN != null && zzhN.length > 0)
            {
                for (i = 0; i < zzhN.length; i++)
                {
                    j += zzrg.zzkJ(zzhN[i]);
                }

                j = k + j + zzhN.length * 1;
            } else
            {
                j = k;
            }
            i = j;
            if (name != 0)
            {
                i = j + zzrg.zzA(4, name);
            }
            j = i;
            if (zzhP)
            {
                j = i + zzrg.zzc(6, zzhP);
            }
            return j;
        }

        public zzb zzD()
        {
            zzhN = zzrq.zzaWh;
            zzhO = 0;
            name = 0;
            zzhP = false;
            zzhQ = false;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zzhQ)
            {
                zzrg1.zzb(1, zzhQ);
            }
            zzrg1.zzy(2, zzhO);
            if (zzhN != null && zzhN.length > 0)
            {
                for (int i = 0; i < zzhN.length; i++)
                {
                    zzrg1.zzy(3, zzhN[i]);
                }

            }
            if (name != 0)
            {
                zzrg1.zzy(4, name);
            }
            if (zzhP)
            {
                zzrg1.zzb(6, zzhP);
            }
            super.zza(zzrg1);
        }

        public zzb()
        {
            zzD();
        }
    }

    public static final class zzc extends zzrh
    {

        private static volatile zzc zzhR[];
        public String zzaC;
        public long zzhS;
        public long zzhT;
        public boolean zzhU;
        public long zzhV;

        public static zzc[] zzE()
        {
            if (zzhR == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzhR == null)
                    {
                        zzhR = new zzc[0];
                    }
                }
            }
            return zzhR;
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
            if (zzaC != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zzc) (obj)).zzaC != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (zzhS == ((zzc) (obj)).zzhS)
            {
                flag = flag1;
                if (zzhT == ((zzc) (obj)).zzhT)
                {
                    flag = flag1;
                    if (zzhU == ((zzc) (obj)).zzhU)
                    {
                        flag = flag1;
                        if (zzhV == ((zzc) (obj)).zzhV)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!zzaC.equals(((zzc) (obj)).zzaC))
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
            if (zzaC == null)
            {
                i = 0;
            } else
            {
                i = zzaC.hashCode();
            }
            j = (int)(zzhS ^ zzhS >>> 32);
            k = (int)(zzhT ^ zzhT >>> 32);
            if (zzhU)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzhV ^ zzhV >>> 32)) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!zzaC.equals(""))
            {
                i = j + zzrg.zzk(1, zzaC);
            }
            j = i;
            if (zzhS != 0L)
            {
                j = i + zzrg.zzd(2, zzhS);
            }
            i = j;
            if (zzhT != 0x7fffffffL)
            {
                i = j + zzrg.zzd(3, zzhT);
            }
            j = i;
            if (zzhU)
            {
                j = i + zzrg.zzc(4, zzhU);
            }
            i = j;
            if (zzhV != 0L)
            {
                i = j + zzrg.zzd(5, zzhV);
            }
            return i;
        }

        public zzc zzF()
        {
            zzaC = "";
            zzhS = 0L;
            zzhT = 0x7fffffffL;
            zzhU = false;
            zzhV = 0L;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!zzaC.equals(""))
            {
                zzrg1.zzb(1, zzaC);
            }
            if (zzhS != 0L)
            {
                zzrg1.zzb(2, zzhS);
            }
            if (zzhT != 0x7fffffffL)
            {
                zzrg1.zzb(3, zzhT);
            }
            if (zzhU)
            {
                zzrg1.zzb(4, zzhU);
            }
            if (zzhV != 0L)
            {
                zzrg1.zzb(5, zzhV);
            }
            super.zza(zzrg1);
        }

        public zzc()
        {
            zzF();
        }
    }

    public static final class zzd extends zzrh
    {

        public zzag.zza zzhW[];
        public zzag.zza zzhX[];
        public zzc zzhY[];

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
                    if (zzrl.equals(zzhW, ((zzd) (obj)).zzhW))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzhX, ((zzd) (obj)).zzhX))
                        {
                            flag = flag1;
                            if (zzrl.equals(zzhY, ((zzd) (obj)).zzhY))
                            {
                                return zza(((zzrh) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((zzrl.hashCode(zzhW) + 527) * 31 + zzrl.hashCode(zzhX)) * 31 + zzrl.hashCode(zzhY)) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int i = super.zzB();
            int j = i;
            if (zzhW != null)
            {
                j = i;
                if (zzhW.length > 0)
                {
                    for (j = 0; j < zzhW.length;)
                    {
                        zzag.zza zza1 = zzhW[j];
                        int i1 = i;
                        if (zza1 != null)
                        {
                            i1 = i + zzrg.zzc(1, zza1);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzhX != null)
            {
                i = j;
                if (zzhX.length > 0)
                {
                    i = j;
                    for (int k = 0; k < zzhX.length;)
                    {
                        zzag.zza zza2 = zzhX[k];
                        int j1 = i;
                        if (zza2 != null)
                        {
                            j1 = i + zzrg.zzc(2, zza2);
                        }
                        k++;
                        i = j1;
                    }

                }
            }
            int k1 = i;
            if (zzhY != null)
            {
                k1 = i;
                if (zzhY.length > 0)
                {
                    int l = ((flag) ? 1 : 0);
                    do
                    {
                        k1 = i;
                        if (l >= zzhY.length)
                        {
                            break;
                        }
                        zzc zzc1 = zzhY[l];
                        k1 = i;
                        if (zzc1 != null)
                        {
                            k1 = i + zzrg.zzc(3, zzc1);
                        }
                        l++;
                        i = k1;
                    } while (true);
                }
            }
            return k1;
        }

        public zzd zzG()
        {
            zzhW = zzag.zza.zzQ();
            zzhX = zzag.zza.zzQ();
            zzhY = zzc.zzE();
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            if (zzhW != null && zzhW.length > 0)
            {
                for (int i = 0; i < zzhW.length; i++)
                {
                    zzag.zza zza1 = zzhW[i];
                    if (zza1 != null)
                    {
                        zzrg1.zza(1, zza1);
                    }
                }

            }
            if (zzhX != null && zzhX.length > 0)
            {
                for (int j = 0; j < zzhX.length; j++)
                {
                    zzag.zza zza2 = zzhX[j];
                    if (zza2 != null)
                    {
                        zzrg1.zza(2, zza2);
                    }
                }

            }
            if (zzhY != null && zzhY.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < zzhY.length; k++)
                {
                    zzc zzc1 = zzhY[k];
                    if (zzc1 != null)
                    {
                        zzrg1.zza(3, zzc1);
                    }
                }

            }
            super.zza(zzrg1);
        }

        public zzd()
        {
            zzG();
        }
    }

    public static final class zze extends zzrh
    {

        private static volatile zze zzhZ[];
        public int key;
        public int value;

        public static zze[] zzH()
        {
            if (zzhZ == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzhZ == null)
                    {
                        zzhZ = new zze[0];
                    }
                }
            }
            return zzhZ;
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
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return ((key + 527) * 31 + value) * 31 + zzBI();
        }

        protected int zzB()
        {
            return super.zzB() + zzrg.zzA(1, key) + zzrg.zzA(2, value);
        }

        public zze zzI()
        {
            key = 0;
            value = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            zzrg1.zzy(1, key);
            zzrg1.zzy(2, value);
            super.zza(zzrg1);
        }

        public zze()
        {
            zzI();
        }
    }

    public static final class zzf extends zzrh
    {

        public String version;
        public String zzia[];
        public String zzib[];
        public zzag.zza zzic[];
        public zze zzid[];
        public zzb zzie[];
        public zzb zzif[];
        public zzb zzig[];
        public zzg zzih[];
        public String zzii;
        public String zzij;
        public String zzik;
        public zza zzil;
        public float zzim;
        public boolean zzin;
        public String zzio[];
        public int zzip;

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
            if (!zzrl.equals(zzia, ((zzf) (obj)).zzia)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!zzrl.equals(zzib, ((zzf) (obj)).zzib)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!zzrl.equals(zzic, ((zzf) (obj)).zzic)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!zzrl.equals(zzid, ((zzf) (obj)).zzid)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zzrl.equals(zzie, ((zzf) (obj)).zzie)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zzrl.equals(zzif, ((zzf) (obj)).zzif)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zzrl.equals(zzig, ((zzf) (obj)).zzig)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!zzrl.equals(zzih, ((zzf) (obj)).zzih)) goto _L4; else goto _L12
_L12:
            if (zzii != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((zzf) (obj)).zzii != null) goto _L4; else goto _L15
_L15:
            if (zzij != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((zzf) (obj)).zzij != null) goto _L4; else goto _L18
_L18:
            if (zzik != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((zzf) (obj)).zzik != null) goto _L4; else goto _L21
_L21:
            if (version != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((zzf) (obj)).version != null) goto _L4; else goto _L24
_L24:
            if (zzil != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((zzf) (obj)).zzil != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(zzim) == Float.floatToIntBits(((zzf) (obj)).zzim))
            {
                flag = flag1;
                if (zzin == ((zzf) (obj)).zzin)
                {
                    flag = flag1;
                    if (zzrl.equals(zzio, ((zzf) (obj)).zzio))
                    {
                        flag = flag1;
                        if (zzip == ((zzf) (obj)).zzip)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!zzii.equals(((zzf) (obj)).zzii))
            {
                return false;
            }
              goto _L15
_L17:
            if (!zzij.equals(((zzf) (obj)).zzij))
            {
                return false;
            }
              goto _L18
_L20:
            if (!zzik.equals(((zzf) (obj)).zzik))
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
            if (!zzil.equals(((zzf) (obj)).zzil))
            {
                return false;
            }
              goto _L25
        }

        public int hashCode()
        {
            int i1 = 0;
            int j1 = zzrl.hashCode(zzia);
            int k1 = zzrl.hashCode(zzib);
            int l1 = zzrl.hashCode(zzic);
            int i2 = zzrl.hashCode(zzid);
            int j2 = zzrl.hashCode(zzie);
            int k2 = zzrl.hashCode(zzif);
            int l2 = zzrl.hashCode(zzig);
            int i3 = zzrl.hashCode(zzih);
            int i;
            int j;
            int k;
            int l;
            char c;
            int j3;
            if (zzii == null)
            {
                i = 0;
            } else
            {
                i = zzii.hashCode();
            }
            if (zzij == null)
            {
                j = 0;
            } else
            {
                j = zzij.hashCode();
            }
            if (zzik == null)
            {
                k = 0;
            } else
            {
                k = zzik.hashCode();
            }
            if (version == null)
            {
                l = 0;
            } else
            {
                l = version.hashCode();
            }
            if (zzil != null)
            {
                i1 = zzil.hashCode();
            }
            j3 = Float.floatToIntBits(zzim);
            if (zzin)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zzrl.hashCode(zzio)) * 31 + zzip) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int k4 = super.zzB();
            int j;
            int k;
            int k2;
            if (zzib != null && zzib.length > 0)
            {
                int i = 0;
                k = 0;
                int l;
                int i3;
                for (l = 0; i < zzib.length; l = i3)
                {
                    String s = zzib[i];
                    int l3 = k;
                    i3 = l;
                    if (s != null)
                    {
                        i3 = l + 1;
                        l3 = k + zzrg.zzfj(s);
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
            if (zzic != null)
            {
                j = k;
                if (zzic.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzic.length;)
                    {
                        zzag.zza zza1 = zzic[k];
                        int i1 = j;
                        if (zza1 != null)
                        {
                            i1 = j + zzrg.zzc(2, zza1);
                        }
                        k++;
                        j = i1;
                    }

                }
            }
            k = j;
            if (zzid != null)
            {
                k = j;
                if (zzid.length > 0)
                {
                    for (k = 0; k < zzid.length;)
                    {
                        zze zze1 = zzid[k];
                        int j1 = j;
                        if (zze1 != null)
                        {
                            j1 = j + zzrg.zzc(3, zze1);
                        }
                        k++;
                        j = j1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzie != null)
            {
                j = k;
                if (zzie.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzie.length;)
                    {
                        zzb zzb1 = zzie[k];
                        int k1 = j;
                        if (zzb1 != null)
                        {
                            k1 = j + zzrg.zzc(4, zzb1);
                        }
                        k++;
                        j = k1;
                    }

                }
            }
            k = j;
            if (zzif != null)
            {
                k = j;
                if (zzif.length > 0)
                {
                    for (k = 0; k < zzif.length;)
                    {
                        zzb zzb2 = zzif[k];
                        int l1 = j;
                        if (zzb2 != null)
                        {
                            l1 = j + zzrg.zzc(5, zzb2);
                        }
                        k++;
                        j = l1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzig != null)
            {
                j = k;
                if (zzig.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzig.length;)
                    {
                        zzb zzb3 = zzig[k];
                        int i2 = j;
                        if (zzb3 != null)
                        {
                            i2 = j + zzrg.zzc(6, zzb3);
                        }
                        k++;
                        j = i2;
                    }

                }
            }
            k = j;
            if (zzih != null)
            {
                k = j;
                if (zzih.length > 0)
                {
                    for (k = 0; k < zzih.length;)
                    {
                        zzg zzg1 = zzih[k];
                        int j2 = j;
                        if (zzg1 != null)
                        {
                            j2 = j + zzrg.zzc(7, zzg1);
                        }
                        k++;
                        j = j2;
                    }

                    k = j;
                }
            }
            j = k;
            if (!zzii.equals(""))
            {
                j = k + zzrg.zzk(9, zzii);
            }
            k = j;
            if (!zzij.equals(""))
            {
                k = j + zzrg.zzk(10, zzij);
            }
            j = k;
            if (!zzik.equals("0"))
            {
                j = k + zzrg.zzk(12, zzik);
            }
            k = j;
            if (!version.equals(""))
            {
                k = j + zzrg.zzk(13, version);
            }
            k2 = k;
            if (zzil != null)
            {
                k2 = k + zzrg.zzc(14, zzil);
            }
            j = k2;
            if (Float.floatToIntBits(zzim) != Float.floatToIntBits(0.0F))
            {
                j = k2 + zzrg.zzc(15, zzim);
            }
            k = j;
            if (zzio != null)
            {
                k = j;
                if (zzio.length > 0)
                {
                    k = 0;
                    k2 = 0;
                    int j3;
                    int i4;
                    for (j3 = 0; k < zzio.length; j3 = i4)
                    {
                        String s1 = zzio[k];
                        k4 = k2;
                        i4 = j3;
                        if (s1 != null)
                        {
                            i4 = j3 + 1;
                            k4 = k2 + zzrg.zzfj(s1);
                        }
                        k++;
                        k2 = k4;
                    }

                    k = j + k2 + j3 * 2;
                }
            }
            k2 = k;
            if (zzip != 0)
            {
                k2 = k + zzrg.zzA(17, zzip);
            }
            j = k2;
            if (zzin)
            {
                j = k2 + zzrg.zzc(18, zzin);
            }
            k = j;
            if (zzia != null)
            {
                k = j;
                if (zzia.length > 0)
                {
                    int l2 = 0;
                    int k3 = 0;
                    for (k = ((flag) ? 1 : 0); k < zzia.length;)
                    {
                        String s2 = zzia[k];
                        k4 = l2;
                        int j4 = k3;
                        if (s2 != null)
                        {
                            j4 = k3 + 1;
                            k4 = l2 + zzrg.zzfj(s2);
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

        public zzf zzJ()
        {
            zzia = zzrq.zzaWm;
            zzib = zzrq.zzaWm;
            zzic = zzag.zza.zzQ();
            zzid = zze.zzH();
            zzie = zzb.zzC();
            zzif = zzb.zzC();
            zzig = zzb.zzC();
            zzih = zzg.zzK();
            zzii = "";
            zzij = "";
            zzik = "0";
            version = "";
            zzil = null;
            zzim = 0.0F;
            zzin = false;
            zzio = zzrq.zzaWm;
            zzip = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            if (zzib != null && zzib.length > 0)
            {
                for (int i = 0; i < zzib.length; i++)
                {
                    String s = zzib[i];
                    if (s != null)
                    {
                        zzrg1.zzb(1, s);
                    }
                }

            }
            if (zzic != null && zzic.length > 0)
            {
                for (int j = 0; j < zzic.length; j++)
                {
                    zzag.zza zza1 = zzic[j];
                    if (zza1 != null)
                    {
                        zzrg1.zza(2, zza1);
                    }
                }

            }
            if (zzid != null && zzid.length > 0)
            {
                for (int k = 0; k < zzid.length; k++)
                {
                    zze zze1 = zzid[k];
                    if (zze1 != null)
                    {
                        zzrg1.zza(3, zze1);
                    }
                }

            }
            if (zzie != null && zzie.length > 0)
            {
                for (int l = 0; l < zzie.length; l++)
                {
                    zzb zzb1 = zzie[l];
                    if (zzb1 != null)
                    {
                        zzrg1.zza(4, zzb1);
                    }
                }

            }
            if (zzif != null && zzif.length > 0)
            {
                for (int i1 = 0; i1 < zzif.length; i1++)
                {
                    zzb zzb2 = zzif[i1];
                    if (zzb2 != null)
                    {
                        zzrg1.zza(5, zzb2);
                    }
                }

            }
            if (zzig != null && zzig.length > 0)
            {
                for (int j1 = 0; j1 < zzig.length; j1++)
                {
                    zzb zzb3 = zzig[j1];
                    if (zzb3 != null)
                    {
                        zzrg1.zza(6, zzb3);
                    }
                }

            }
            if (zzih != null && zzih.length > 0)
            {
                for (int k1 = 0; k1 < zzih.length; k1++)
                {
                    zzg zzg1 = zzih[k1];
                    if (zzg1 != null)
                    {
                        zzrg1.zza(7, zzg1);
                    }
                }

            }
            if (!zzii.equals(""))
            {
                zzrg1.zzb(9, zzii);
            }
            if (!zzij.equals(""))
            {
                zzrg1.zzb(10, zzij);
            }
            if (!zzik.equals("0"))
            {
                zzrg1.zzb(12, zzik);
            }
            if (!version.equals(""))
            {
                zzrg1.zzb(13, version);
            }
            if (zzil != null)
            {
                zzrg1.zza(14, zzil);
            }
            if (Float.floatToIntBits(zzim) != Float.floatToIntBits(0.0F))
            {
                zzrg1.zzb(15, zzim);
            }
            if (zzio != null && zzio.length > 0)
            {
                for (int l1 = 0; l1 < zzio.length; l1++)
                {
                    String s1 = zzio[l1];
                    if (s1 != null)
                    {
                        zzrg1.zzb(16, s1);
                    }
                }

            }
            if (zzip != 0)
            {
                zzrg1.zzy(17, zzip);
            }
            if (zzin)
            {
                zzrg1.zzb(18, zzin);
            }
            if (zzia != null && zzia.length > 0)
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < zzia.length; i2++)
                {
                    String s2 = zzia[i2];
                    if (s2 != null)
                    {
                        zzrg1.zzb(19, s2);
                    }
                }

            }
            super.zza(zzrg1);
        }

        public zzf()
        {
            zzJ();
        }
    }

    public static final class zzg extends zzrh
    {

        private static volatile zzg zziq[];
        public int zziA[];
        public int zzir[];
        public int zzis[];
        public int zzit[];
        public int zziu[];
        public int zziv[];
        public int zziw[];
        public int zzix[];
        public int zziy[];
        public int zziz[];

        public static zzg[] zzK()
        {
            if (zziq == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zziq == null)
                    {
                        zziq = new zzg[0];
                    }
                }
            }
            return zziq;
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
                    if (zzrl.equals(zzir, ((zzg) (obj)).zzir))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzis, ((zzg) (obj)).zzis))
                        {
                            flag = flag1;
                            if (zzrl.equals(zzit, ((zzg) (obj)).zzit))
                            {
                                flag = flag1;
                                if (zzrl.equals(zziu, ((zzg) (obj)).zziu))
                                {
                                    flag = flag1;
                                    if (zzrl.equals(zziv, ((zzg) (obj)).zziv))
                                    {
                                        flag = flag1;
                                        if (zzrl.equals(zziw, ((zzg) (obj)).zziw))
                                        {
                                            flag = flag1;
                                            if (zzrl.equals(zzix, ((zzg) (obj)).zzix))
                                            {
                                                flag = flag1;
                                                if (zzrl.equals(zziy, ((zzg) (obj)).zziy))
                                                {
                                                    flag = flag1;
                                                    if (zzrl.equals(zziz, ((zzg) (obj)).zziz))
                                                    {
                                                        flag = flag1;
                                                        if (zzrl.equals(zziA, ((zzg) (obj)).zziA))
                                                        {
                                                            return zza(((zzrh) (obj)));
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
            return ((((((((((zzrl.hashCode(zzir) + 527) * 31 + zzrl.hashCode(zzis)) * 31 + zzrl.hashCode(zzit)) * 31 + zzrl.hashCode(zziu)) * 31 + zzrl.hashCode(zziv)) * 31 + zzrl.hashCode(zziw)) * 31 + zzrl.hashCode(zzix)) * 31 + zzrl.hashCode(zziy)) * 31 + zzrl.hashCode(zziz)) * 31 + zzrl.hashCode(zziA)) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int l = super.zzB();
            int j;
            int k;
            if (zzir != null && zzir.length > 0)
            {
                int i = 0;
                k = 0;
                for (; i < zzir.length; i++)
                {
                    k += zzrg.zzkJ(zzir[i]);
                }

                k = l + k + zzir.length * 1;
            } else
            {
                k = l;
            }
            j = k;
            if (zzis != null)
            {
                j = k;
                if (zzis.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzis.length; j++)
                    {
                        l += zzrg.zzkJ(zzis[j]);
                    }

                    j = k + l + zzis.length * 1;
                }
            }
            k = j;
            if (zzit != null)
            {
                k = j;
                if (zzit.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzit.length; k++)
                    {
                        l += zzrg.zzkJ(zzit[k]);
                    }

                    k = j + l + zzit.length * 1;
                }
            }
            j = k;
            if (zziu != null)
            {
                j = k;
                if (zziu.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zziu.length; j++)
                    {
                        l += zzrg.zzkJ(zziu[j]);
                    }

                    j = k + l + zziu.length * 1;
                }
            }
            k = j;
            if (zziv != null)
            {
                k = j;
                if (zziv.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zziv.length; k++)
                    {
                        l += zzrg.zzkJ(zziv[k]);
                    }

                    k = j + l + zziv.length * 1;
                }
            }
            j = k;
            if (zziw != null)
            {
                j = k;
                if (zziw.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zziw.length; j++)
                    {
                        l += zzrg.zzkJ(zziw[j]);
                    }

                    j = k + l + zziw.length * 1;
                }
            }
            k = j;
            if (zzix != null)
            {
                k = j;
                if (zzix.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzix.length; k++)
                    {
                        l += zzrg.zzkJ(zzix[k]);
                    }

                    k = j + l + zzix.length * 1;
                }
            }
            j = k;
            if (zziy != null)
            {
                j = k;
                if (zziy.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zziy.length; j++)
                    {
                        l += zzrg.zzkJ(zziy[j]);
                    }

                    j = k + l + zziy.length * 1;
                }
            }
            k = j;
            if (zziz != null)
            {
                k = j;
                if (zziz.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zziz.length; k++)
                    {
                        l += zzrg.zzkJ(zziz[k]);
                    }

                    k = j + l + zziz.length * 1;
                }
            }
            j = k;
            if (zziA != null)
            {
                j = k;
                if (zziA.length > 0)
                {
                    l = 0;
                    for (j = ((flag) ? 1 : 0); j < zziA.length; j++)
                    {
                        l += zzrg.zzkJ(zziA[j]);
                    }

                    j = k + l + zziA.length * 1;
                }
            }
            return j;
        }

        public zzg zzL()
        {
            zzir = zzrq.zzaWh;
            zzis = zzrq.zzaWh;
            zzit = zzrq.zzaWh;
            zziu = zzrq.zzaWh;
            zziv = zzrq.zzaWh;
            zziw = zzrq.zzaWh;
            zzix = zzrq.zzaWh;
            zziy = zzrq.zzaWh;
            zziz = zzrq.zzaWh;
            zziA = zzrq.zzaWh;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            if (zzir != null && zzir.length > 0)
            {
                for (int i = 0; i < zzir.length; i++)
                {
                    zzrg1.zzy(1, zzir[i]);
                }

            }
            if (zzis != null && zzis.length > 0)
            {
                for (int j = 0; j < zzis.length; j++)
                {
                    zzrg1.zzy(2, zzis[j]);
                }

            }
            if (zzit != null && zzit.length > 0)
            {
                for (int k = 0; k < zzit.length; k++)
                {
                    zzrg1.zzy(3, zzit[k]);
                }

            }
            if (zziu != null && zziu.length > 0)
            {
                for (int l = 0; l < zziu.length; l++)
                {
                    zzrg1.zzy(4, zziu[l]);
                }

            }
            if (zziv != null && zziv.length > 0)
            {
                for (int i1 = 0; i1 < zziv.length; i1++)
                {
                    zzrg1.zzy(5, zziv[i1]);
                }

            }
            if (zziw != null && zziw.length > 0)
            {
                for (int j1 = 0; j1 < zziw.length; j1++)
                {
                    zzrg1.zzy(6, zziw[j1]);
                }

            }
            if (zzix != null && zzix.length > 0)
            {
                for (int k1 = 0; k1 < zzix.length; k1++)
                {
                    zzrg1.zzy(7, zzix[k1]);
                }

            }
            if (zziy != null && zziy.length > 0)
            {
                for (int l1 = 0; l1 < zziy.length; l1++)
                {
                    zzrg1.zzy(8, zziy[l1]);
                }

            }
            if (zziz != null && zziz.length > 0)
            {
                for (int i2 = 0; i2 < zziz.length; i2++)
                {
                    zzrg1.zzy(9, zziz[i2]);
                }

            }
            if (zziA != null && zziA.length > 0)
            {
                for (int j2 = ((flag) ? 1 : 0); j2 < zziA.length; j2++)
                {
                    zzrg1.zzy(10, zziA[j2]);
                }

            }
            super.zza(zzrg1);
        }

        public zzg()
        {
            zzL();
        }
    }

    public static final class zzi extends zzrh
    {

        private static volatile zzi zziK[];
        public String name;
        public zzag.zza zziL;
        public zzd zziM;

        public static zzi[] zzN()
        {
            if (zziK == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zziK == null)
                    {
                        zziK = new zzi[0];
                    }
                }
            }
            return zziK;
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
            if (zziL != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((zzi) (obj)).zziL != null) goto _L4; else goto _L10
_L10:
            if (zziM != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((zzi) (obj)).zziM != null) goto _L4; else goto _L11
_L11:
            return zza(((zzrh) (obj)));
_L6:
            if (!name.equals(((zzi) (obj)).name))
            {
                return false;
            }
              goto _L7
_L9:
            if (!zziL.equals(((zzi) (obj)).zziL))
            {
                return false;
            }
              goto _L10
            if (!zziM.equals(((zzi) (obj)).zziM))
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
            if (zziL == null)
            {
                j = 0;
            } else
            {
                j = zziL.hashCode();
            }
            if (zziM != null)
            {
                k = zziM.hashCode();
            }
            return ((j + (i + 527) * 31) * 31 + k) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!name.equals(""))
            {
                i = j + zzrg.zzk(1, name);
            }
            j = i;
            if (zziL != null)
            {
                j = i + zzrg.zzc(2, zziL);
            }
            i = j;
            if (zziM != null)
            {
                i = j + zzrg.zzc(3, zziM);
            }
            return i;
        }

        public zzi zzO()
        {
            name = "";
            zziL = null;
            zziM = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!name.equals(""))
            {
                zzrg1.zzb(1, name);
            }
            if (zziL != null)
            {
                zzrg1.zza(2, zziL);
            }
            if (zziM != null)
            {
                zzrg1.zza(3, zziM);
            }
            super.zza(zzrg1);
        }

        public zzi()
        {
            zzO();
        }
    }

    public static final class zzj extends zzrh
    {

        public zzi zziN[];
        public zzf zziO;
        public String zziP;

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
            if (!zzrl.equals(zziN, ((zzj) (obj)).zziN)) goto _L4; else goto _L5
_L5:
            if (zziO != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzj) (obj)).zziO != null) goto _L4; else goto _L8
_L8:
            if (zziP != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((zzj) (obj)).zziP != null) goto _L4; else goto _L9
_L9:
            return zza(((zzrh) (obj)));
_L7:
            if (!zziO.equals(((zzj) (obj)).zziO))
            {
                return false;
            }
              goto _L8
            if (!zziP.equals(((zzj) (obj)).zziP))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = zzrl.hashCode(zziN);
            int i;
            if (zziO == null)
            {
                i = 0;
            } else
            {
                i = zziO.hashCode();
            }
            if (zziP != null)
            {
                j = zziP.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int i = super.zzB();
            int j = i;
            if (zziN != null)
            {
                j = i;
                if (zziN.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= zziN.length)
                        {
                            break;
                        }
                        zzi zzi1 = zziN[k];
                        j = i;
                        if (zzi1 != null)
                        {
                            j = i + zzrg.zzc(1, zzi1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zziO != null)
            {
                i = j + zzrg.zzc(2, zziO);
            }
            j = i;
            if (!zziP.equals(""))
            {
                j = i + zzrg.zzk(3, zziP);
            }
            return j;
        }

        public zzj zzP()
        {
            zziN = zzi.zzN();
            zziO = null;
            zziP = "";
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zziN != null && zziN.length > 0)
            {
                for (int i = 0; i < zziN.length; i++)
                {
                    zzi zzi1 = zziN[i];
                    if (zzi1 != null)
                    {
                        zzrg1.zza(1, zzi1);
                    }
                }

            }
            if (zziO != null)
            {
                zzrg1.zza(2, zziO);
            }
            if (!zziP.equals(""))
            {
                zzrg1.zzb(3, zziP);
            }
            super.zza(zzrg1);
        }

        public zzj()
        {
            zzP();
        }
    }

}
