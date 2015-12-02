// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.json.jsonmirror.JMStaticKeysDictDestination;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.user:
//            k

public class PicCropInfo
    implements Parcelable, JMStaticKeysDictDestination
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final String a;
    private final int b;
    private final int c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;

    private PicCropInfo()
    {
        a = null;
        b = 0;
        c = 0;
        d = 0.0F;
        f = 0.0F;
        e = 0.0F;
        g = 0.0F;
    }

    private PicCropInfo(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readFloat();
        e = parcel.readFloat();
        f = parcel.readFloat();
        g = parcel.readFloat();
    }

    PicCropInfo(Parcel parcel, k k1)
    {
        this(parcel);
    }

    public PicCropInfo(String s, int l, int i1, float f1, float f2, float f3, float f4)
    {
        a = s;
        b = l;
        c = i1;
        d = f1;
        e = f2;
        f = f3;
        g = f4;
    }

    public static PicCropInfo a(String s)
    {
        return a(s, 100);
    }

    public static PicCropInfo a(String s, int l)
    {
        return new PicCropInfo(s, l, l, 0.0F, 0.0F, 1.0F, 1.0F);
    }

    public String a()
    {
        return a;
    }

    public Uri b()
    {
        return Uri.parse(a);
    }

    public int c()
    {
        return b;
    }

    public int d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PicCropInfo)obj;
            if (!a().equals(((PicCropInfo) (obj)).a()))
            {
                return false;
            }
            if (c() != ((PicCropInfo) (obj)).c())
            {
                return false;
            }
            if (d() != ((PicCropInfo) (obj)).d())
            {
                return false;
            }
            if (e() != ((PicCropInfo) (obj)).e())
            {
                return false;
            }
            if (f() != ((PicCropInfo) (obj)).f())
            {
                return false;
            }
            if (g() != ((PicCropInfo) (obj)).g())
            {
                return false;
            }
            if (h() != ((PicCropInfo) (obj)).h())
            {
                return false;
            }
        }
        return true;
    }

    public float f()
    {
        return e;
    }

    public float g()
    {
        return f;
    }

    public float h()
    {
        return g;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a(), Integer.valueOf(c()), Integer.valueOf(d()), Float.valueOf(e()), Float.valueOf(f()), Float.valueOf(g()), Float.valueOf(h())
        });
    }

    public boolean i()
    {
        return d >= 0.0F && f <= 1.0F && d < f && f != 0.0F && e >= 0.0F && g <= 1.0F && e < g && g != 0.0F;
    }

    public RectF j()
    {
        return new RectF(d, e, f, g);
    }

    public String toString()
    {
        return (new StringBuilder()).append("PicCropInfo <").append(a()).append("> (").append(c()).append("x").append(d()).append(") (").append(e()).append(", ").append(f()).append(", ").append(g()).append(", ").append(h()).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeFloat(d);
        parcel.writeFloat(e);
        parcel.writeFloat(f);
        parcel.writeFloat(g);
    }

}
