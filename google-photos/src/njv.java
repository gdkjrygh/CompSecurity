// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;

public class njv extends nbg
{

    private int a;
    public njv d;
    njr e;
    int f;
    int g;
    public int h;
    int i;
    RectF j;
    k k;

    public njv()
    {
    }

    public String a()
    {
        int i1;
        switch (f)
        {
        default:
            return "";

        case 0: // '\0'
            int l = h;
            int j1 = i;
            return (new StringBuilder(23)).append(l).append("x").append(j1).toString();

        case 2: // '\002'
            return "thumbnail";

        case 3: // '\003'
            return "large";

        case 1: // '\001'
            return "full";

        case 4: // '\004'
            return "original";

        case 5: // '\005'
            i1 = h;
            break;
        }
        int k1 = i;
        return (new StringBuilder(29)).append("auto(").append(i1).append("x").append(k1).append(")").toString();
    }

    public final void a(int l, njr njr1, int i1, int j1, int k1, int l1, RectF rectf, 
            k k2)
    {
        int i2 = njr1.e;
        super.b = l;
        super.c = i2;
        e = njr1;
        f = i1;
        g = l1;
        h = j1;
        i = k1;
        j = rectf;
        k = k2;
        a = 0;
    }

    public final int b()
    {
        int l = Math.max(h, i);
        if (l == 0 || l > njt.p())
        {
            return 6;
        }
        return l <= njt.q() ? 8 : 7;
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof njv))
        {
            return false;
        }
        obj = (njv)obj;
        if (b != ((njv) (obj)).b || g != ((njv) (obj)).g || !e.equals(((njv) (obj)).e))
        {
            break; /* Loop/switch isn't completed */
        }
        if (f == ((njv) (obj)).f) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L7:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k k1 = k;
        k k2 = ((njv) (obj)).k;
        boolean flag1;
        if (k1 == null && k2 == null)
        {
            flag1 = true;
        } else
        if (k1 == null && k2 != null || k1 != null && k2 == null)
        {
            flag1 = false;
        } else
        {
            flag1 = k1.z();
        }
        if (flag1 && (j == null || j.equals(((njv) (obj)).j))) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        switch (f)
        {
        default:
            flag = true;
            break;

        case 5: // '\005'
            if (b() == ((njv) (obj)).b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break;

        case 0: // '\0'
            if (h == ((njv) (obj)).h && i == ((njv) (obj)).i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int hashCode()
    {
        if (a == 0)
        {
            a = c.a(e, f + c.a(j, b + 527) * 31);
        }
        return a;
    }

    public String toString()
    {
        String s4 = a();
        f;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 759;
           goto _L1 _L2
_L1:
        String s1 = "";
_L9:
        String s;
        String s2;
        String s3;
        boolean flag;
        if (j != null)
        {
            float f1 = j.left;
            float f2 = j.top;
            float f3 = j.right;
            float f4 = j.bottom;
            s3 = (new StringBuilder(74)).append(", crop(").append(f1).append(", ").append(f2).append(", ").append(f3).append(", ").append(f4).append(")").toString();
        } else
        {
            s3 = "";
        }
        s = "";
        if ((b & 1) != 0)
        {
            s = String.valueOf("").concat(" no-disk-cache");
        }
        s2 = s;
        if ((b & 2) != 0)
        {
            s2 = String.valueOf(s).concat(" download-only");
        }
        s = s2;
        if ((b & 4) != 0)
        {
            s2 = String.valueOf(s2).concat(" accept-animation");
            s = s2;
            if ((b & 0x20) != 0)
            {
                s = String.valueOf(s2).concat("-disable-webp");
            }
        }
        s2 = s;
        if ((b & 8) != 0)
        {
            s2 = String.valueOf(s).concat(" disable-decoding");
        }
        s = s2;
        if ((b & 0x10) != 0)
        {
            s = String.valueOf(s2).concat(" disable-recycling");
        }
        s2 = s;
        if ((b & 0x20) != 0)
        {
            s2 = String.valueOf(s).concat(" disable-webp");
        }
        s = s2;
        if ((b & 0x40) != 0)
        {
            s = String.valueOf(s2).concat(" accept-bitmap-container");
        }
        s2 = s;
        if ((b & 0x80) != 0)
        {
            s2 = String.valueOf(s).concat(" disable-loading");
        }
        s = s2;
        if ((b & 0x100) != 0)
        {
            s = String.valueOf(s2).concat(" disable-smart-crop");
        }
        s2 = s;
        if ((b & 0x200) != 0)
        {
            s2 = String.valueOf(s).concat(" disable-upscale");
        }
        s = s2;
        if ((b & 0x400) != 0)
        {
            s = String.valueOf(s2).concat(" long-term-cache");
        }
        s2 = s;
        if ((b & 0x800) != 0)
        {
            s2 = String.valueOf(s).concat(" keep-partial-download");
        }
        s = s2;
        if ((b & 0x1000) != 0)
        {
            s = String.valueOf(s2).concat(" disable-automatic-high-res-download");
        }
        s2 = s;
        if ((b & 0x2000) != 0)
        {
            s2 = String.valueOf(s).concat(" allow-large-file-download");
        }
        s = s2;
        if ((b & 0x4000) != 0)
        {
            s = String.valueOf(s2).concat(" for-media-sync");
        }
        s2 = s;
        if ((b & 0x8000) != 0)
        {
            s2 = String.valueOf(s).concat(" prefer-high-res-download");
        }
        s = s2;
        if ((b & 0x10000) != 0)
        {
            s = String.valueOf(s2).concat(" convert-webp-to-jpeg");
        }
        s2 = s;
        if ((b & 0x20000) != 0)
        {
            s2 = String.valueOf(s).concat(" include-exif");
        }
        if (k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = String.valueOf(e);
        return (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(s4).length() + String.valueOf(s1).length() + String.valueOf(s3).length() + String.valueOf(s2).length())).append("{").append(s).append(" (").append(s4).append(s1).append(s3).append(") hasEdits: ").append(flag).append(" ").append(s2).append("}").toString();
_L2:
        if (g == -1) goto _L1; else goto _L3
_L3:
        g;
        JVM INSTR tableswitch 0 3: default 800
    //                   0 852
    //                   1 845
    //                   2 838
    //                   3 831;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        s = "";
_L10:
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s1 = "-".concat(s);
        } else
        {
            s1 = new String("-");
        }
          goto _L9
_L8:
        s = "H";
          goto _L10
_L7:
        s = "S";
          goto _L10
_L6:
        s = "L";
          goto _L10
_L5:
        s = "VL";
          goto _L10
    }
}
