// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzoc, zznw, zzob, 
//            zznq, zznr, zzny

public static final class zzAg extends zzns
{

    public String tag;
    public long zzaOl;
    public long zzaOm;
    public int zzaOn;
    public int zzaOo;
    public boolean zzaOp;
    public zzaOm zzaOq[];
    public zzaOm zzaOr;
    public byte zzaOs[];
    public byte zzaOt[];
    public byte zzaOu[];
    public zzaOm zzaOv;
    public String zzaOw;
    public long zzaOx;
    public zzaOm zzaOy;

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
        if (!(obj instanceof zzAg)) goto _L4; else goto _L3
_L3:
        obj = (zzAg)obj;
        flag = flag1;
        if (zzaOl != ((zzaOl) (obj)).zzaOl) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (zzaOm != ((zzaOm) (obj)).zzaOm) goto _L4; else goto _L6
_L6:
        if (tag != null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (((tag) (obj)).tag != null) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (zzaOn != ((zzaOn) (obj)).zzaOn) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (zzaOo != ((zzaOo) (obj)).zzaOo) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (zzaOp != ((zzaOp) (obj)).zzaOp) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!zznw.equals(zzaOq, ((zzaOq) (obj)).zzaOq)) goto _L4; else goto _L13
_L13:
        if (zzaOr != null) goto _L15; else goto _L14
_L14:
        flag = flag1;
        if (((zzaOr) (obj)).zzaOr != null) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(zzaOs, ((zzaOs) (obj)).zzaOs)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(zzaOt, ((zzaOt) (obj)).zzaOt)) goto _L4; else goto _L18
_L18:
        flag = flag1;
        if (!Arrays.equals(zzaOu, ((zzaOu) (obj)).zzaOu)) goto _L4; else goto _L19
_L19:
        if (zzaOv != null) goto _L21; else goto _L20
_L20:
        flag = flag1;
        if (((zzaOv) (obj)).zzaOv != null) goto _L4; else goto _L22
_L22:
        if (zzaOw != null) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (((zzaOw) (obj)).zzaOw != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (zzaOx != ((zzaOx) (obj)).zzaOx) goto _L4; else goto _L26
_L26:
        if (zzaOy != null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        flag = flag1;
        if (((zzaOy) (obj)).zzaOy != null) goto _L4; else goto _L27
_L27:
        return zza(((zzns) (obj)));
_L8:
        if (!tag.equals(((tag) (obj)).tag))
        {
            return false;
        }
          goto _L9
_L15:
        if (!zzaOr.equals(((equals) (obj)).zzaOr))
        {
            return false;
        }
          goto _L16
_L21:
        if (!zzaOv.equals(((equals) (obj)).zzaOv))
        {
            return false;
        }
          goto _L22
_L24:
        if (!zzaOw.equals(((zzaOw) (obj)).zzaOw))
        {
            return false;
        }
          goto _L25
        if (!zzaOy.equals(((equals) (obj)).zzaOy))
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

    public zzzP zzAg()
    {
        zzaOl = 0L;
        zzaOm = 0L;
        tag = "";
        zzaOn = 0;
        zzaOo = 0;
        zzaOp = false;
        zzaOq = zzAh();
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

    public zzaNT zzE(zznq zznq1)
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
                zzaNT azzant[];
                int j;
                if (zzaOq == null)
                {
                    j = 0;
                } else
                {
                    j = zzaOq.length;
                }
                azzant = new zzaOq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzaOq, 0, azzant, 0, j);
                    k = j;
                }
                for (; k < azzant.length - 1; k++)
                {
                    azzant[k] = new <init>();
                    zznq1.zza(azzant[k]);
                    zznq1.zzzy();
                }

                azzant[k] = new <init>();
                zznq1.zza(azzant[k]);
                zzaOq = azzant;
                break;

            case 50: // '2'
                zzaOs = zznq1.readBytes();
                break;

            case 58: // ':'
                if (zzaOv == null)
                {
                    zzaOv = new <init>();
                }
                zznq1.zza(zzaOv);
                break;

            case 66: // 'B'
                zzaOt = zznq1.readBytes();
                break;

            case 74: // 'J'
                if (zzaOr == null)
                {
                    zzaOr = new <init>();
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
                    zzaOy = new <init>();
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
                  = zzaOq[i];
                if ( != null)
                {
                    zznr1.zza(3, );
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
                    zzE zze = zzaOq[j];
                    int k = i;
                    if (zze != null)
                    {
                        k = i + zznr.zzc(3, zze);
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

    public ()
    {
        zzAg();
    }
}
