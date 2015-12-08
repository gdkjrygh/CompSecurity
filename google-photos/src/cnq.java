// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class cnq
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cnr();
    public static final nny a;
    public final int b;
    public final int c;
    public final cnt d;
    public final nny e;
    public final cod f;
    public final boolean g;
    public final boolean h;
    public final byte i[];
    public final int j;
    public final boolean k;

    cnq(int l, int i1, cnt cnt1, nny nny1, cod cod1, boolean flag, boolean flag1, 
            byte abyte0[], int j1, boolean flag2)
    {
        boolean flag3;
        if (l == -1 || l >= 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        b.a(flag3, "invalid clip identifier");
        b = l;
        if (i1 == -1 || i1 >= 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        b.a(flag3, "invalid clip parent identifer");
        c = i1;
        d = (cnt)b.a(cnt1, "type", null);
        if (cnt1 != cnt.f)
        {
            b.a(nny1, "mediaIdentifier", null);
        }
        e = nny1;
        if (cnt1 != cnt.d || nny1.equals(a))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        b.a(flag3, "if the clip's type is EMPTY_VIDEO, its media ID has to be EMPTY_VIDEO_MEDIA_IDENTIFIER");
        f = (cod)b.a(cod1, "interval", null);
        b.b(cod1.b, "interval.startPointUs");
        b.b(cod1.c, "interval.endPointUs");
        g = flag;
        h = flag1;
        i = abyte0;
        j = j1;
        k = flag2;
    }

    public cnq(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        b = parcel.readInt();
        c = parcel.readInt();
        d = cnt.values()[parcel.readInt()];
        e = (nny)nny.CREATOR.createFromParcel(parcel);
        f = (cod)cod.CREATOR.createFromParcel(parcel);
        byte byte0 = parcel.readByte();
        boolean flag;
        if ((byte0 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if ((byte0 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if ((byte0 & 4) != 0)
        {
            i = parcel.createByteArray();
        } else
        {
            i = null;
        }
        j = parcel.readInt();
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k = flag;
    }

    public cnq(cnt cnt1, nny nny1, cod cod1)
    {
        this(-1, -1, cnt1, nny1, cod1, true, false, null, 0, false);
    }

    static byte[] a(cnq cnq1)
    {
        return cnq1.i;
    }

    public final cns a()
    {
        return new cns(this);
    }

    public final pyg b()
    {
        if (i == null)
        {
            return null;
        }
        pyg pyg1;
        try
        {
            pyg1 = (pyg)qlw.a(new pyg(), i);
        }
        catch (qlv qlv1)
        {
            throw c.a("Protobuf copying failed", qlv1);
        }
        return pyg1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof cnq))
        {
            return false;
        }
        obj = (cnq)obj;
        if (b != ((cnq) (obj)).b || c != ((cnq) (obj)).c || !Arrays.equals(i, ((cnq) (obj)).i))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (d == ((cnq) (obj)).d && f.equals(((cnq) (obj)).f) && g == ((cnq) (obj)).g && h == ((cnq) (obj)).h && (e == null || e.equals(((cnq) (obj)).e)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
    }

    public final int hashCode()
    {
        cnt cnt1;
        cod cod1;
        byte abyte0[];
        int l;
        int k1;
        int l1;
        boolean flag;
        boolean flag1;
        k1 = b;
        l1 = c;
        cnt1 = d;
        cod1 = f;
        flag = g;
        flag1 = h;
        abyte0 = i;
        l = b.h(e, 17);
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        int j1 = 0 + l * 31;
_L4:
        return (b.h(cnt1, b.h(cod1, b.a(flag, b.a(flag1, j1)))) * 31 + l1) * 31 + k1;
_L2:
        int i2 = abyte0.length;
        int i1 = 0;
        do
        {
            j1 = l;
            if (i1 >= i2)
            {
                continue;
            }
            j1 = abyte0[i1];
            i1++;
            l = j1 + l * 31;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Clip [identifier=")).append(b).append(", parentIdentifier=").append(c).append(", type=").append(d).append(", interval=").append(f).append(", shouldBeatMatch=").append(g).append(", canBeSplitIntoScenes=").append(h).append(", themingParams present=");
        boolean flag;
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return stringbuilder.append(flag).append(", mediaId=").append(e).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        boolean flag = true;
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d.ordinal());
        if (e != null)
        {
            e.writeToParcel(parcel, 0);
        }
        f.writeToParcel(parcel, 0);
        byte byte0;
        byte byte1;
        if (g)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (h)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (i != null)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        parcel.writeByte((byte)(byte1 | (byte0 | l)));
        if (i != null)
        {
            parcel.writeByteArray(i);
        }
        parcel.writeInt(j);
        if (k)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = 0;
        }
        parcel.writeByte((byte)l);
    }

    static 
    {
        a = nny.a(Uri.parse("empty:"), noa.b);
    }
}
