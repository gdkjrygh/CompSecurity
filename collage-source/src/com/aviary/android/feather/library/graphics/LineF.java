// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.library.graphics:
//            IGeom

public class LineF
    implements IGeom
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public LineF a(Parcel parcel)
        {
            LineF linef = new LineF();
            linef.a(parcel);
            return linef;
        }

        public LineF[] a(int i)
        {
            return new LineF[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final PointF a;
    private final PointF b;

    public LineF()
    {
        this(0.0F, 0.0F, 0.0F, 0.0F);
    }

    public LineF(float f, float f1, float f2, float f3)
    {
        a = new PointF(f, f1);
        b = new PointF(f2, f3);
    }

    public float a()
    {
        return a.x;
    }

    public void a(float f, float f1, float f2, float f3)
    {
        a.set(f, f1);
        b.set(f2, f3);
    }

    public void a(Parcel parcel)
    {
        a.x = parcel.readFloat();
        a.y = parcel.readFloat();
        b.x = parcel.readFloat();
        b.y = parcel.readFloat();
    }

    public PointF[] a(RectF rectf)
    {
        PointF apointf[] = new PointF[2];
        PointF pointf = b(rectf.left, rectf.top, rectf.right, rectf.top);
        int i;
        int j;
        if (pointf != null)
        {
            apointf[0] = pointf;
            j = 1;
        } else
        {
            j = 0;
        }
        pointf = b(rectf.right, rectf.top, rectf.right, rectf.bottom);
        i = j;
        if (pointf != null)
        {
            apointf[j] = pointf;
            i = j + 1;
        }
        if (i < 2)
        {
            PointF pointf1 = b(rectf.left, rectf.bottom, rectf.right, rectf.bottom);
            if (pointf1 != null)
            {
                j = i + 1;
                apointf[i] = pointf1;
                i = j;
            }
        }
        if (i < 2)
        {
            rectf = b(rectf.left, rectf.top, rectf.left, rectf.bottom);
            if (rectf != null)
            {
                j = i + 1;
                apointf[i] = rectf;
                i = j;
            }
        }
        if (i == 2)
        {
            return apointf;
        }
        if (i == 1)
        {
            return (new PointF[] {
                apointf[0]
            });
        } else
        {
            return null;
        }
    }

    public float b()
    {
        return a.y;
    }

    public PointF b(float f, float f1, float f2, float f3)
    {
        double d2 = (f3 - f1) * (b.x - a.x) - (f2 - f) * (b.y - a.y);
        double d1 = (f2 - f) * (a.y - f1) - (f3 - f1) * (a.x - f);
        double d4 = (b.x - a.x) * (a.y - f1) - (b.y - a.y) * (a.x - f);
        if (d2 == 0.0D)
        {
            return null;
        }
        d1 /= d2;
        d2 = d4 / d2;
        if (d1 >= 0.0D && d1 <= 1.0D && d2 >= 0.0D && d2 <= 1.0D)
        {
            PointF pointf = new PointF();
            pointf.x = (float)((double)a.x + (double)(b.x - a.x) * d1);
            double d3 = a.y;
            pointf.y = (float)(d1 * (double)(b.y - a.y) + d3);
            return pointf;
        } else
        {
            return null;
        }
    }

    public float c()
    {
        return b.x;
    }

    public float d()
    {
        return b.y;
    }

    public int describeContents()
    {
        return 0;
    }

    public void e()
    {
        a.set(0.0F, 0.0F);
        b.set(0.0F, 0.0F);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LineF)obj;
            if (a.x != ((LineF) (obj)).a.x || a.y != ((LineF) (obj)).a.y || b.x != ((LineF) (obj)).b.x || b.y != ((LineF) (obj)).b.y)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (((Float.valueOf(a.x).hashCode() + 629) * 37 + Float.valueOf(a.y).hashCode()) * 37 + Float.valueOf(b.x).hashCode()) * 37 + Float.valueOf(b.y).hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("LineF(").append(a.x).append(", ").append(a.x).append(" - ").append(b.x).append(", ").append(b.y).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a());
        parcel.writeFloat(b());
        parcel.writeFloat(c());
        parcel.writeFloat(d());
    }

}
