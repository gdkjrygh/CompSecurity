// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg, 
//            zzrq

public static final class zzJ extends zzrh
{

    public String version;
    public String zzia[];
    public String zzib[];
    public zzia zzic[];
    public zzia zzid[];
    public zzia zzie[];
    public zzia zzif[];
    public zzia zzig[];
    public zzia zzih[];
    public String zzii;
    public String zzij;
    public String zzik;
    public zzia zzil;
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
        if (!(obj instanceof zzJ)) goto _L4; else goto _L3
_L3:
        obj = (zzJ)obj;
        flag = flag1;
        if (!zzrl.equals(zzia, ((zzia) (obj)).zzia)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!zzrl.equals(zzib, ((zzib) (obj)).zzib)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!zzrl.equals(zzic, ((zzic) (obj)).zzic)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!zzrl.equals(zzid, ((zzid) (obj)).zzid)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zzrl.equals(zzie, ((zzie) (obj)).zzie)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zzrl.equals(zzif, ((zzif) (obj)).zzif)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zzrl.equals(zzig, ((zzig) (obj)).zzig)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!zzrl.equals(zzih, ((zzih) (obj)).zzih)) goto _L4; else goto _L12
_L12:
        if (zzii != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((zzii) (obj)).zzii != null) goto _L4; else goto _L15
_L15:
        if (zzij != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((zzij) (obj)).zzij != null) goto _L4; else goto _L18
_L18:
        if (zzik != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((zzik) (obj)).zzik != null) goto _L4; else goto _L21
_L21:
        if (version != null) goto _L23; else goto _L22
_L22:
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L24
_L24:
        if (zzil != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = flag1;
        if (((zzil) (obj)).zzil != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (Float.floatToIntBits(zzim) == Float.floatToIntBits(((zzim) (obj)).zzim))
        {
            flag = flag1;
            if (zzin == ((zzin) (obj)).zzin)
            {
                flag = flag1;
                if (zzrl.equals(zzio, ((zzio) (obj)).zzio))
                {
                    flag = flag1;
                    if (zzip == ((zzip) (obj)).zzip)
                    {
                        return zza(((zzrh) (obj)));
                    }
                }
            }
        }
          goto _L4
_L14:
        if (!zzii.equals(((zzii) (obj)).zzii))
        {
            return false;
        }
          goto _L15
_L17:
        if (!zzij.equals(((zzij) (obj)).zzij))
        {
            return false;
        }
          goto _L18
_L20:
        if (!zzik.equals(((zzik) (obj)).zzik))
        {
            return false;
        }
          goto _L21
_L23:
        if (!version.equals(((version) (obj)).version))
        {
            return false;
        }
          goto _L24
        if (!zzil.equals(((equals) (obj)).zzil))
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
                    zzBI zzbi = zzic[k];
                    int i1 = j;
                    if (zzbi != null)
                    {
                        i1 = j + zzrg.zzc(2, zzbi);
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
                    zzBI zzbi1 = zzid[k];
                    int j1 = j;
                    if (zzbi1 != null)
                    {
                        j1 = j + zzrg.zzc(3, zzbi1);
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
                    zzBI zzbi2 = zzie[k];
                    int k1 = j;
                    if (zzbi2 != null)
                    {
                        k1 = j + zzrg.zzc(4, zzbi2);
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
                    zzBI zzbi3 = zzif[k];
                    int l1 = j;
                    if (zzbi3 != null)
                    {
                        l1 = j + zzrg.zzc(5, zzbi3);
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
                    zzBI zzbi4 = zzig[k];
                    int i2 = j;
                    if (zzbi4 != null)
                    {
                        i2 = j + zzrg.zzc(6, zzbi4);
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
                    zzBI zzbi5 = zzih[k];
                    int j2 = j;
                    if (zzbi5 != null)
                    {
                        j2 = j + zzrg.zzc(7, zzbi5);
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

    public  zzJ()
    {
        zzia = zzrq.zzaWm;
        zzib = zzrq.zzaWm;
        zzic = zzQ();
        zzid = zzH();
        zzie = zzC();
        zzif = zzC();
        zzig = zzC();
        zzih = zzK();
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
                zzaWf zzawf = zzic[j];
                if (zzawf != null)
                {
                    zzrg1.zza(2, zzawf);
                }
            }

        }
        if (zzid != null && zzid.length > 0)
        {
            for (int k = 0; k < zzid.length; k++)
            {
                zzaWf zzawf1 = zzid[k];
                if (zzawf1 != null)
                {
                    zzrg1.zza(3, zzawf1);
                }
            }

        }
        if (zzie != null && zzie.length > 0)
        {
            for (int l = 0; l < zzie.length; l++)
            {
                zzaWf zzawf2 = zzie[l];
                if (zzawf2 != null)
                {
                    zzrg1.zza(4, zzawf2);
                }
            }

        }
        if (zzif != null && zzif.length > 0)
        {
            for (int i1 = 0; i1 < zzif.length; i1++)
            {
                zzaWf zzawf3 = zzif[i1];
                if (zzawf3 != null)
                {
                    zzrg1.zza(5, zzawf3);
                }
            }

        }
        if (zzig != null && zzig.length > 0)
        {
            for (int j1 = 0; j1 < zzig.length; j1++)
            {
                zzaWf zzawf4 = zzig[j1];
                if (zzawf4 != null)
                {
                    zzrg1.zza(6, zzawf4);
                }
            }

        }
        if (zzih != null && zzih.length > 0)
        {
            for (int k1 = 0; k1 < zzih.length; k1++)
            {
                zzaWf zzawf5 = zzih[k1];
                if (zzawf5 != null)
                {
                    zzrg1.zza(7, zzawf5);
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

    public ()
    {
        zzJ();
    }
}
