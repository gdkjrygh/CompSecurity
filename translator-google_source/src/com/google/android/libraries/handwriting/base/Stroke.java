// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            i

public class Stroke
    implements Parcelable, Iterable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    public final ArrayList a;
    private final boolean b;

    public Stroke()
    {
        this(true);
    }

    public Stroke(Parcel parcel)
    {
        a = new ArrayList();
        b = parcel.createBooleanArray()[0];
        parcel.readTypedList(a, Point.CREATOR);
    }

    public Stroke(Stroke stroke)
    {
        this(stroke.b);
        a.addAll(stroke.a);
    }

    private Stroke(boolean flag)
    {
        a = new ArrayList();
        b = flag;
    }

    public static int a(Stroke stroke, Stroke stroke1)
    {
        if (stroke == null || stroke1 == null)
        {
            return -1;
        }
        for (int j = 1; j < stroke.a.size(); j++)
        {
            double d;
            double d1;
            double d2;
            float f;
            float f1;
            float f2;
            float f3;
            float f4;
            float f5;
            Point point;
            Point point1;
            Point point2;
            Point point3;
            boolean flag;
            for (int k = 1; k < stroke1.a.size(); k++)
            {
                point = stroke.a(j - 1);
                point1 = stroke.a(j);
                point2 = stroke1.a(k - 1);
                point3 = stroke1.a(k);
                if (point.a == point1.a && point.b == point1.b || point2.a == point3.a && point2.b == point3.b)
                {
                    flag = false;
                } else
                {
                    d = (point1.a - point.a) * (point3.b - point2.b) - (point1.b - point.b) * (point3.a - point2.a);
                    f = point.b;
                    f1 = point2.b;
                    f2 = point3.a;
                    f3 = point2.a;
                    f4 = point.a;
                    f5 = point2.a;
                    d2 = (f - f1) * (f2 - f3) - (point3.b - point2.b) * (f4 - f5);
                    f = point.b;
                    f1 = point2.b;
                    f2 = point1.a;
                    f3 = point.a;
                    f4 = point.a;
                    f5 = point2.a;
                    d1 = (f - f1) * (f2 - f3) - (point1.b - point.b) * (f4 - f5);
                    if (d == 0.0D)
                    {
                        if (d2 == 0.0D)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    {
                        d2 /= d;
                        d = d1 / d;
                        if (d2 >= 0.0D && d2 <= 1.0D && d >= 0.0D && d <= 1.0D)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
                if (flag)
                {
                    return j - 1;
                }
            }

        }

        return -1;
    }

    public final Point a()
    {
        return (Point)a.get(0);
    }

    public final Point a(int j)
    {
        return (Point)a.get(j);
    }

    public final void a(float f, float f1, long l, float f2)
    {
        a.add(new Point(f, f1, l, f2));
    }

    public final Point b()
    {
        return (Point)a.get(a.size() - 1);
    }

    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return a.iterator();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeBooleanArray(new boolean[] {
            b
        });
        parcel.writeTypedList(a);
    }


    private class Point
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new j();
        public final float a;
        public final float b;
        public final long c;
        public final float d;

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return String.format("(%s, %s)", new Object[] {
                Float.valueOf(a), Float.valueOf(b)
            });
        }

        public final void writeToParcel(Parcel parcel, int k)
        {
            parcel.writeFloat(a);
            parcel.writeFloat(b);
            parcel.writeLong(c);
            parcel.writeFloat(d);
        }


        public Point(float f, float f1, long l, float f2)
        {
            a = f;
            b = f1;
            c = l;
            d = f2;
        }

        public Point(Parcel parcel)
        {
            a = parcel.readFloat();
            b = parcel.readFloat();
            c = parcel.readLong();
            d = parcel.readFloat();
        }
    }

}
