// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class fml
    implements eev, eft, eks, elt, elx, ely, gaf, gax, gej, gfn, gtg, hdv, jdv, jgi
{

    public static final android.os.Parcelable.Creator CREATOR = new fmm();
    private static final List d = Collections.unmodifiableList(Arrays.asList(new Class[] {
        eev, gfn, elt, ely, hdv, eft, gej, gtg, jdv, gaf, 
        gax, jgi
    }));
    private final boolean e;
    private final int f;
    private final boolean g;
    private final pye h;
    private final String i;
    private final gap j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final euu n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final long s;
    private final boolean t;
    private final int u;
    private final int v;
    private final gaw w;
    private final boolean x;
    private final float y;
    private final float z;

    fml(Parcel parcel)
    {
        e = a(parcel);
        f = parcel.readInt();
        g = a(parcel);
        h = b.a(parcel);
        i = parcel.readString();
        j = (gap)parcel.readParcelable(gap.getClassLoader());
        k = a(parcel);
        l = a(parcel);
        m = parcel.readString();
        n = (euu)parcel.readSerializable();
        o = a(parcel);
        p = a(parcel);
        q = a(parcel);
        r = a(parcel);
        s = parcel.readLong();
        t = a(parcel);
        v = parcel.readInt();
        u = parcel.readInt();
        w = gaw.valueOf(parcel.readString());
        x = a(parcel);
        y = parcel.readFloat();
        z = parcel.readFloat();
    }

    public fml(fmn fmn1)
    {
        e = fmn1.b;
        f = fmn1.a;
        g = fmn1.c;
        h = fmn1.d;
        i = fmn1.e;
        j = fmn1.f;
        k = fmn1.g;
        l = fmn1.h;
        m = fmn1.i;
        n = fmn1.j;
        o = fmn1.k;
        p = fmn1.l;
        q = fmn1.m;
        r = fmn1.n;
        s = fmn1.o;
        t = fmn1.p;
        v = fmn1.q;
        u = fmn1.r;
        w = gaw.a(fmn1.s);
        x = fmn1.t;
        y = fmn1.u;
        z = fmn1.v;
    }

    private static void a(boolean flag, Parcel parcel)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
    }

    private static boolean a(Parcel parcel)
    {
        return parcel.readByte() != 0;
    }

    private boolean c(Class class1)
    {
label0:
        {
            boolean flag1 = false;
            if (d.contains(class1))
            {
                boolean flag;
                if (jdv.equals(class1) && !r)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    if (jgi.equals(class1) && !x)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        if (gaf.equals(class1) && !t)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                    }
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public final ekf a(Class class1)
    {
        if (c(class1))
        {
            throw new ekh(class1);
        } else
        {
            return this;
        }
    }

    public final boolean a()
    {
        return e;
    }

    public final int b()
    {
        return f;
    }

    public final ekf b(Class class1)
    {
        if (c(class1))
        {
            return null;
        } else
        {
            return a(class1);
        }
    }

    public final euu c()
    {
        return n;
    }

    public final String d()
    {
        return m;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final gap e()
    {
        return j;
    }

    public final boolean f()
    {
        return k;
    }

    public final boolean g()
    {
        return g;
    }

    public final pye h()
    {
        return h;
    }

    public final String i()
    {
        return i;
    }

    public final boolean j()
    {
        return q;
    }

    public final int k()
    {
        p.b(t);
        return v;
    }

    public final int l()
    {
        p.b(t);
        return u;
    }

    public final boolean m()
    {
        return l;
    }

    public final boolean n()
    {
        return o;
    }

    public final boolean o()
    {
        return p;
    }

    public final long p()
    {
        p.b(r);
        return s;
    }

    public final Set q()
    {
        return w.e;
    }

    public final float r()
    {
        return y;
    }

    public final float s()
    {
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        a(e, parcel);
        parcel.writeInt(f);
        a(g, parcel);
        b.a(h, parcel);
        parcel.writeString(i);
        parcel.writeParcelable(j, i1);
        a(k, parcel);
        a(l, parcel);
        parcel.writeString(m);
        parcel.writeSerializable(n);
        a(o, parcel);
        a(p, parcel);
        a(q, parcel);
        a(r, parcel);
        parcel.writeLong(s);
        a(t, parcel);
        parcel.writeInt(v);
        parcel.writeInt(u);
        parcel.writeString(w.name());
        a(x, parcel);
        parcel.writeFloat(y);
        parcel.writeFloat(z);
    }

}
