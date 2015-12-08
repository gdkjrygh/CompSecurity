// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznw, zzob, zznq, 
//            zznr, zzny

public interface zzoc
{
    public static final class zza extends zzns
    {

        public String zzaOd[];
        public String zzaOe[];
        public int zzaOf[];

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
                    if (zznw.equals(zzaOd, ((zza) (obj)).zzaOd))
                    {
                        flag = flag1;
                        if (zznw.equals(zzaOe, ((zza) (obj)).zzaOe))
                        {
                            flag = flag1;
                            if (zznw.equals(zzaOf, ((zza) (obj)).zzaOf))
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
            return (((zznw.hashCode(zzaOd) + 527) * 31 + zznw.hashCode(zzaOe)) * 31 + zznw.hashCode(zzaOf)) * 31 + zzzP();
        }

        public zza zzAd()
        {
            zzaOd = zzob.zzaOa;
            zzaOe = zzob.zzaOa;
            zzaOf = zzob.zzaNV;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zza zzB(zznq zznq1)
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
                    int j1 = zzob.zzb(zznq1, 10);
                    String as[];
                    int j;
                    if (zzaOd == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzaOd.length;
                    }
                    as = new String[j1 + j];
                    j1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzaOd, 0, as, 0, j);
                        j1 = j;
                    }
                    for (; j1 < as.length - 1; j1++)
                    {
                        as[j1] = zznq1.readString();
                        zznq1.zzzy();
                    }

                    as[j1] = zznq1.readString();
                    zzaOd = as;
                    break;

                case 18: // '\022'
                    int k1 = zzob.zzb(zznq1, 18);
                    String as1[];
                    int k;
                    if (zzaOe == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzaOe.length;
                    }
                    as1 = new String[k1 + k];
                    k1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzaOe, 0, as1, 0, k);
                        k1 = k;
                    }
                    for (; k1 < as1.length - 1; k1++)
                    {
                        as1[k1] = zznq1.readString();
                        zznq1.zzzy();
                    }

                    as1[k1] = zznq1.readString();
                    zzaOe = as1;
                    break;

                case 24: // '\030'
                    int l1 = zzob.zzb(zznq1, 24);
                    int ai[];
                    int l;
                    if (zzaOf == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzaOf.length;
                    }
                    ai = new int[l1 + l];
                    l1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzaOf, 0, ai, 0, l);
                        l1 = l;
                    }
                    for (; l1 < ai.length - 1; l1++)
                    {
                        ai[l1] = zznq1.zzzB();
                        zznq1.zzzy();
                    }

                    ai[l1] = zznq1.zzzB();
                    zzaOf = ai;
                    break;

                case 26: // '\032'
                    int j2 = zznq1.zzjn(zznq1.zzzF());
                    int i1 = zznq1.getPosition();
                    int i2;
                    for (i2 = 0; zznq1.zzzK() > 0; i2++)
                    {
                        zznq1.zzzB();
                    }

                    zznq1.zzjp(i1);
                    int ai1[];
                    if (zzaOf == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzaOf.length;
                    }
                    ai1 = new int[i2 + i1];
                    i2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzaOf, 0, ai1, 0, i1);
                        i2 = i1;
                    }
                    for (; i2 < ai1.length; i2++)
                    {
                        ai1[i2] = zznq1.zzzB();
                    }

                    zzaOf = ai1;
                    zznq1.zzjo(j2);
                    break;
                }
            } while (true);
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzaOd != null && zzaOd.length > 0)
            {
                for (int i = 0; i < zzaOd.length; i++)
                {
                    String s = zzaOd[i];
                    if (s != null)
                    {
                        zznr1.zzb(1, s);
                    }
                }

            }
            if (zzaOe != null && zzaOe.length > 0)
            {
                for (int j = 0; j < zzaOe.length; j++)
                {
                    String s1 = zzaOe[j];
                    if (s1 != null)
                    {
                        zznr1.zzb(2, s1);
                    }
                }

            }
            if (zzaOf != null && zzaOf.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < zzaOf.length; k++)
                {
                    zznr1.zzx(3, zzaOf[k]);
                }

            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzB(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int k2 = super.zzc();
            int i;
            int k;
            if (zzaOd != null && zzaOd.length > 0)
            {
                i = 0;
                int j = 0;
                int l;
                int k1;
                for (l = 0; i < zzaOd.length; l = k1)
                {
                    String s = zzaOd[i];
                    int i2 = j;
                    k1 = l;
                    if (s != null)
                    {
                        k1 = l + 1;
                        i2 = j + zznr.zzeB(s);
                    }
                    i++;
                    j = i2;
                }

                i = k2 + j + l * 1;
            } else
            {
                i = k2;
            }
            k = i;
            if (zzaOe != null)
            {
                k = i;
                if (zzaOe.length > 0)
                {
                    k = 0;
                    int i1 = 0;
                    int l1;
                    int j2;
                    for (l1 = 0; k < zzaOe.length; l1 = j2)
                    {
                        String s1 = zzaOe[k];
                        k2 = i1;
                        j2 = l1;
                        if (s1 != null)
                        {
                            j2 = l1 + 1;
                            k2 = i1 + zznr.zzeB(s1);
                        }
                        k++;
                        i1 = k2;
                    }

                    k = i + i1 + l1 * 1;
                }
            }
            i = k;
            if (zzaOf != null)
            {
                i = k;
                if (zzaOf.length > 0)
                {
                    int j1 = 0;
                    for (i = ((flag) ? 1 : 0); i < zzaOf.length; i++)
                    {
                        j1 += zznr.zzju(zzaOf[i]);
                    }

                    i = k + j1 + zzaOf.length * 1;
                }
            }
            return i;
        }

        public zza()
        {
            zzAd();
        }
    }

    public static final class zzb extends zzns
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
            if (!(obj instanceof zzb)) goto _L4; else goto _L3
_L3:
            obj = (zzb)obj;
            flag = flag1;
            if (zzaOg != ((zzb) (obj)).zzaOg) goto _L4; else goto _L5
_L5:
            if (zzaOh != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzb) (obj)).zzaOh != null) goto _L4; else goto _L8
_L8:
            if (version != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zzb) (obj)).version != null) goto _L4; else goto _L9
_L9:
            return zza(((zzns) (obj)));
_L7:
            if (!zzaOh.equals(((zzb) (obj)).zzaOh))
            {
                return false;
            }
              goto _L8
            if (!version.equals(((zzb) (obj)).version))
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

        public zzb zzAe()
        {
            zzaOg = 0;
            zzaOh = "";
            version = "";
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzb zzC(zznq zznq1)
            throws IOException
        {
_L6:
            int i = zznq1.zzzy();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 195
        //                       26: 206;
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

        public zzb()
        {
            zzAe();
        }
    }

    public static final class zzc extends zzns
    {

        public byte zzaOi[];
        public byte zzaOj[][];
        public boolean zzaOk;

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
                if (obj instanceof zzc)
                {
                    obj = (zzc)obj;
                    flag = flag1;
                    if (Arrays.equals(zzaOi, ((zzc) (obj)).zzaOi))
                    {
                        flag = flag1;
                        if (zznw.zza(zzaOj, ((zzc) (obj)).zzaOj))
                        {
                            flag = flag1;
                            if (zzaOk == ((zzc) (obj)).zzaOk)
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
            int i = Arrays.hashCode(zzaOi);
            int j = zznw.zza(zzaOj);
            char c;
            if (zzaOk)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (c + ((i + 527) * 31 + j) * 31) * 31 + zzzP();
        }

        public zzc zzAf()
        {
            zzaOi = zzob.zzaOc;
            zzaOj = zzob.zzaOb;
            zzaOk = false;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzc zzD(zznq zznq1)
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
                    zzaOi = zznq1.readBytes();
                    break;

                case 18: // '\022'
                    int k = zzob.zzb(zznq1, 18);
                    byte abyte0[][];
                    int j;
                    if (zzaOj == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzaOj.length;
                    }
                    abyte0 = new byte[k + j][];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzaOj, 0, abyte0, 0, j);
                        k = j;
                    }
                    for (; k < abyte0.length - 1; k++)
                    {
                        abyte0[k] = zznq1.readBytes();
                        zznq1.zzzy();
                    }

                    abyte0[k] = zznq1.readBytes();
                    zzaOj = abyte0;
                    break;

                case 24: // '\030'
                    zzaOk = zznq1.zzzC();
                    break;
                }
            } while (true);
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!Arrays.equals(zzaOi, zzob.zzaOc))
            {
                zznr1.zza(1, zzaOi);
            }
            if (zzaOj != null && zzaOj.length > 0)
            {
                for (int i = 0; i < zzaOj.length; i++)
                {
                    byte abyte0[] = zzaOj[i];
                    if (abyte0 != null)
                    {
                        zznr1.zza(2, abyte0);
                    }
                }

            }
            if (zzaOk)
            {
                zznr1.zzb(3, zzaOk);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzD(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int j = super.zzc();
            int i = j;
            if (!Arrays.equals(zzaOi, zzob.zzaOc))
            {
                i = j + zznr.zzb(1, zzaOi);
            }
            j = i;
            if (zzaOj != null)
            {
                j = i;
                if (zzaOj.length > 0)
                {
                    int k = 0;
                    int l = 0;
                    for (j = ((flag) ? 1 : 0); j < zzaOj.length;)
                    {
                        byte abyte0[] = zzaOj[j];
                        int j1 = k;
                        int i1 = l;
                        if (abyte0 != null)
                        {
                            i1 = l + 1;
                            j1 = k + zznr.zzy(abyte0);
                        }
                        j++;
                        k = j1;
                        l = i1;
                    }

                    j = i + k + l * 1;
                }
            }
            i = j;
            if (zzaOk)
            {
                i = j + zznr.zzc(3, zzaOk);
            }
            return i;
        }

        public zzc()
        {
            zzAf();
        }
    }

    public static final class zzd extends zzns
    {

        public String tag;
        public long zzaOl;
        public long zzaOm;
        public int zzaOn;
        public int zzaOo;
        public boolean zzaOp;
        public zze zzaOq[];
        public zzb zzaOr;
        public byte zzaOs[];
        public byte zzaOt[];
        public byte zzaOu[];
        public zza zzaOv;
        public String zzaOw;
        public long zzaOx;
        public zzc zzaOy;

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
            if (!(obj instanceof zzd)) goto _L4; else goto _L3
_L3:
            obj = (zzd)obj;
            flag = flag1;
            if (zzaOl != ((zzd) (obj)).zzaOl) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (zzaOm != ((zzd) (obj)).zzaOm) goto _L4; else goto _L6
_L6:
            if (tag != null) goto _L8; else goto _L7
_L7:
            flag = flag1;
            if (((zzd) (obj)).tag != null) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (zzaOn != ((zzd) (obj)).zzaOn) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (zzaOo != ((zzd) (obj)).zzaOo) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (zzaOp != ((zzd) (obj)).zzaOp) goto _L4; else goto _L12
_L12:
            flag = flag1;
            if (!zznw.equals(zzaOq, ((zzd) (obj)).zzaOq)) goto _L4; else goto _L13
_L13:
            if (zzaOr != null) goto _L15; else goto _L14
_L14:
            flag = flag1;
            if (((zzd) (obj)).zzaOr != null) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!Arrays.equals(zzaOs, ((zzd) (obj)).zzaOs)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (!Arrays.equals(zzaOt, ((zzd) (obj)).zzaOt)) goto _L4; else goto _L18
_L18:
            flag = flag1;
            if (!Arrays.equals(zzaOu, ((zzd) (obj)).zzaOu)) goto _L4; else goto _L19
_L19:
            if (zzaOv != null) goto _L21; else goto _L20
_L20:
            flag = flag1;
            if (((zzd) (obj)).zzaOv != null) goto _L4; else goto _L22
_L22:
            if (zzaOw != null) goto _L24; else goto _L23
_L23:
            flag = flag1;
            if (((zzd) (obj)).zzaOw != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (zzaOx != ((zzd) (obj)).zzaOx) goto _L4; else goto _L26
_L26:
            if (zzaOy != null)
            {
                break MISSING_BLOCK_LABEL_320;
            }
            flag = flag1;
            if (((zzd) (obj)).zzaOy != null) goto _L4; else goto _L27
_L27:
            return zza(((zzns) (obj)));
_L8:
            if (!tag.equals(((zzd) (obj)).tag))
            {
                return false;
            }
              goto _L9
_L15:
            if (!zzaOr.equals(((zzd) (obj)).zzaOr))
            {
                return false;
            }
              goto _L16
_L21:
            if (!zzaOv.equals(((zzd) (obj)).zzaOv))
            {
                return false;
            }
              goto _L22
_L24:
            if (!zzaOw.equals(((zzd) (obj)).zzaOw))
            {
                return false;
            }
              goto _L25
            if (!zzaOy.equals(((zzd) (obj)).zzaOy))
            {
                return false;
            }
              goto _L27
        }

        public int hashCode()
        {
            int i1 = 0;
            int j1 = (int)(zzaOl ^ zzaOl >>> 32);
            int k1 = (int)(zzaOm ^ zzaOm >>> 32);
            int i;
            char c;
            int j;
            int k;
            int l;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            if (tag == null)
            {
                i = 0;
            } else
            {
                i = tag.hashCode();
            }
            l1 = zzaOn;
            i2 = zzaOo;
            if (zzaOp)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            j2 = zznw.hashCode(zzaOq);
            if (zzaOr == null)
            {
                j = 0;
            } else
            {
                j = zzaOr.hashCode();
            }
            k2 = Arrays.hashCode(zzaOs);
            l2 = Arrays.hashCode(zzaOt);
            i3 = Arrays.hashCode(zzaOu);
            if (zzaOv == null)
            {
                k = 0;
            } else
            {
                k = zzaOv.hashCode();
            }
            if (zzaOw == null)
            {
                l = 0;
            } else
            {
                l = zzaOw.hashCode();
            }
            j3 = (int)(zzaOx ^ zzaOx >>> 32);
            if (zzaOy != null)
            {
                i1 = zzaOy.hashCode();
            }
            return (((l + (k + ((((j + ((c + (((i + ((j1 + 527) * 31 + k1) * 31) * 31 + l1) * 31 + i2) * 31) * 31 + j2) * 31) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31 + j3) * 31 + i1) * 31 + zzzP();
        }

        public zzd zzAg()
        {
            zzaOl = 0L;
            zzaOm = 0L;
            tag = "";
            zzaOn = 0;
            zzaOo = 0;
            zzaOp = false;
            zzaOq = zze.zzAh();
            zzaOr = null;
            zzaOs = zzob.zzaOc;
            zzaOt = zzob.zzaOc;
            zzaOu = zzob.zzaOc;
            zzaOv = null;
            zzaOw = "";
            zzaOx = 0x2bf20L;
            zzaOy = null;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zzd zzE(zznq zznq1)
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
                    zzaOl = zznq1.zzzA();
                    break;

                case 18: // '\022'
                    tag = zznq1.readString();
                    break;

                case 26: // '\032'
                    int k = zzob.zzb(zznq1, 26);
                    zze azze[];
                    int j;
                    if (zzaOq == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzaOq.length;
                    }
                    azze = new zze[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzaOq, 0, azze, 0, j);
                        k = j;
                    }
                    for (; k < azze.length - 1; k++)
                    {
                        azze[k] = new zze();
                        zznq1.zza(azze[k]);
                        zznq1.zzzy();
                    }

                    azze[k] = new zze();
                    zznq1.zza(azze[k]);
                    zzaOq = azze;
                    break;

                case 50: // '2'
                    zzaOs = zznq1.readBytes();
                    break;

                case 58: // ':'
                    if (zzaOv == null)
                    {
                        zzaOv = new zza();
                    }
                    zznq1.zza(zzaOv);
                    break;

                case 66: // 'B'
                    zzaOt = zznq1.readBytes();
                    break;

                case 74: // 'J'
                    if (zzaOr == null)
                    {
                        zzaOr = new zzb();
                    }
                    zznq1.zza(zzaOr);
                    break;

                case 80: // 'P'
                    zzaOp = zznq1.zzzC();
                    break;

                case 88: // 'X'
                    zzaOn = zznq1.zzzB();
                    break;

                case 96: // '`'
                    zzaOo = zznq1.zzzB();
                    break;

                case 106: // 'j'
                    zzaOu = zznq1.readBytes();
                    break;

                case 114: // 'r'
                    zzaOw = zznq1.readString();
                    break;

                case 120: // 'x'
                    zzaOx = zznq1.zzzE();
                    break;

                case 130: 
                    if (zzaOy == null)
                    {
                        zzaOy = new zzc();
                    }
                    zznq1.zza(zzaOy);
                    break;

                case 136: 
                    zzaOm = zznq1.zzzA();
                    break;
                }
            } while (true);
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzaOl != 0L)
            {
                zznr1.zzb(1, zzaOl);
            }
            if (!tag.equals(""))
            {
                zznr1.zzb(2, tag);
            }
            if (zzaOq != null && zzaOq.length > 0)
            {
                for (int i = 0; i < zzaOq.length; i++)
                {
                    zze zze1 = zzaOq[i];
                    if (zze1 != null)
                    {
                        zznr1.zza(3, zze1);
                    }
                }

            }
            if (!Arrays.equals(zzaOs, zzob.zzaOc))
            {
                zznr1.zza(6, zzaOs);
            }
            if (zzaOv != null)
            {
                zznr1.zza(7, zzaOv);
            }
            if (!Arrays.equals(zzaOt, zzob.zzaOc))
            {
                zznr1.zza(8, zzaOt);
            }
            if (zzaOr != null)
            {
                zznr1.zza(9, zzaOr);
            }
            if (zzaOp)
            {
                zznr1.zzb(10, zzaOp);
            }
            if (zzaOn != 0)
            {
                zznr1.zzx(11, zzaOn);
            }
            if (zzaOo != 0)
            {
                zznr1.zzx(12, zzaOo);
            }
            if (!Arrays.equals(zzaOu, zzob.zzaOc))
            {
                zznr1.zza(13, zzaOu);
            }
            if (!zzaOw.equals(""))
            {
                zznr1.zzb(14, zzaOw);
            }
            if (zzaOx != 0x2bf20L)
            {
                zznr1.zzc(15, zzaOx);
            }
            if (zzaOy != null)
            {
                zznr1.zza(16, zzaOy);
            }
            if (zzaOm != 0L)
            {
                zznr1.zzb(17, zzaOm);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzE(zznq1);
        }

        protected int zzc()
        {
            int i = super.zzc();
            int j = i;
            if (zzaOl != 0L)
            {
                j = i + zznr.zzd(1, zzaOl);
            }
            i = j;
            if (!tag.equals(""))
            {
                i = j + zznr.zzj(2, tag);
            }
            j = i;
            if (zzaOq != null)
            {
                j = i;
                if (zzaOq.length > 0)
                {
                    for (j = 0; j < zzaOq.length;)
                    {
                        zze zze1 = zzaOq[j];
                        int k = i;
                        if (zze1 != null)
                        {
                            k = i + zznr.zzc(3, zze1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            i = j;
            if (!Arrays.equals(zzaOs, zzob.zzaOc))
            {
                i = j + zznr.zzb(6, zzaOs);
            }
            j = i;
            if (zzaOv != null)
            {
                j = i + zznr.zzc(7, zzaOv);
            }
            i = j;
            if (!Arrays.equals(zzaOt, zzob.zzaOc))
            {
                i = j + zznr.zzb(8, zzaOt);
            }
            j = i;
            if (zzaOr != null)
            {
                j = i + zznr.zzc(9, zzaOr);
            }
            i = j;
            if (zzaOp)
            {
                i = j + zznr.zzc(10, zzaOp);
            }
            j = i;
            if (zzaOn != 0)
            {
                j = i + zznr.zzz(11, zzaOn);
            }
            i = j;
            if (zzaOo != 0)
            {
                i = j + zznr.zzz(12, zzaOo);
            }
            j = i;
            if (!Arrays.equals(zzaOu, zzob.zzaOc))
            {
                j = i + zznr.zzb(13, zzaOu);
            }
            i = j;
            if (!zzaOw.equals(""))
            {
                i = j + zznr.zzj(14, zzaOw);
            }
            j = i;
            if (zzaOx != 0x2bf20L)
            {
                j = i + zznr.zze(15, zzaOx);
            }
            i = j;
            if (zzaOy != null)
            {
                i = j + zznr.zzc(16, zzaOy);
            }
            j = i;
            if (zzaOm != 0L)
            {
                j = i + zznr.zzd(17, zzaOm);
            }
            return j;
        }

        public zzd()
        {
            zzAg();
        }
    }

    public static final class zze extends zzns
    {

        private static volatile zze zzaOz[];
        public String value;
        public String zzgk;

        public static zze[] zzAh()
        {
            if (zzaOz == null)
            {
                synchronized (zznw.zzaNS)
                {
                    if (zzaOz == null)
                    {
                        zzaOz = new zze[0];
                    }
                }
            }
            return zzaOz;
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
            if (!(obj instanceof zze)) goto _L4; else goto _L3
_L3:
            obj = (zze)obj;
            if (zzgk != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zze) (obj)).zzgk != null) goto _L4; else goto _L7
_L7:
            if (value != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((zze) (obj)).value != null) goto _L4; else goto _L8
_L8:
            return zza(((zzns) (obj)));
_L6:
            if (!zzgk.equals(((zze) (obj)).zzgk))
            {
                return false;
            }
              goto _L7
            if (!value.equals(((zze) (obj)).value))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (zzgk == null)
            {
                i = 0;
            } else
            {
                i = zzgk.hashCode();
            }
            if (value != null)
            {
                j = value.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + zzzP();
        }

        public zze zzAi()
        {
            zzgk = "";
            value = "";
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public zze zzF(zznq zznq1)
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

                case 18: // '\022'
                    value = zznq1.readString();
                    break;
                }
            } while (true);
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!zzgk.equals(""))
            {
                zznr1.zzb(1, zzgk);
            }
            if (!value.equals(""))
            {
                zznr1.zzb(2, value);
            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzF(zznq1);
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
            if (!value.equals(""))
            {
                j = i + zznr.zzj(2, value);
            }
            return j;
        }

        public zze()
        {
            zzAi();
        }
    }

}
