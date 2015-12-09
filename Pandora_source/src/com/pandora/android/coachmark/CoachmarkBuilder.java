// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import com.pandora.radio.data.b;
import com.pandora.radio.util.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

public class CoachmarkBuilder
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CoachmarkBuilder a(Parcel parcel)
        {
            return new CoachmarkBuilder(parcel);
        }

        public CoachmarkBuilder[] a(int i1)
        {
            return new CoachmarkBuilder[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private boolean A;
    private long B;
    private HashMap C;
    private b D;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    private Activity l;
    private e.e m;
    private int n[];
    private Pair o;
    private int p;
    private int q;
    private int r;
    private int s;
    private String t;
    private Object u;
    private String v;
    private String w;
    private String x;
    private String y;
    private e.b z;

    public CoachmarkBuilder()
    {
        z = e.b.a;
        a = 0x7f0d0062;
        b = true;
        c = true;
        d = false;
        e = true;
        f = false;
        g = true;
        A = false;
        h = 600;
        i = 300;
        j = 300;
        k = 800;
        B = 0L;
        C = new HashMap();
    }

    public CoachmarkBuilder(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        z = e.b.a;
        a = 0x7f0d0062;
        b = true;
        c = true;
        d = false;
        e = true;
        f = false;
        g = true;
        A = false;
        h = 600;
        i = 300;
        j = 300;
        k = 800;
        B = 0L;
        C = new HashMap();
        m = (e.e)parcel.readSerializable();
        n = parcel.createIntArray();
        CoachmarkLayout.b b1 = (CoachmarkLayout.b)parcel.readSerializable();
        int i1 = parcel.readInt();
        if (b1 != null)
        {
            o = new Pair(b1, Integer.valueOf(i1));
        }
        p = parcel.readInt();
        v = (String)parcel.readSerializable();
        q = parcel.readInt();
        w = (String)parcel.readSerializable();
        r = parcel.readInt();
        x = (String)parcel.readSerializable();
        s = parcel.readInt();
        y = (String)parcel.readSerializable();
        t = (String)parcel.readSerializable();
        z = (e.b)parcel.readSerializable();
        a = parcel.readInt();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        h = parcel.readInt();
        i = parcel.readInt();
        j = parcel.readInt();
        k = parcel.readInt();
        u = parcel.readSerializable();
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g = flag;
        B = parcel.readLong();
        C = (HashMap)parcel.readSerializable();
        D = (b)parcel.readSerializable();
    }

    public CoachmarkBuilder(CoachmarkBuilder coachmarkbuilder)
    {
        z = e.b.a;
        a = 0x7f0d0062;
        b = true;
        c = true;
        d = false;
        e = true;
        f = false;
        g = true;
        A = false;
        h = 600;
        i = 300;
        j = 300;
        k = 800;
        B = 0L;
        C = new HashMap();
        m = coachmarkbuilder.m;
        if (coachmarkbuilder.n != null)
        {
            n = Arrays.copyOf(coachmarkbuilder.n, coachmarkbuilder.n.length);
        }
        if (coachmarkbuilder.o != null)
        {
            o = new Pair(coachmarkbuilder.o.first, coachmarkbuilder.o.second);
        }
        p = coachmarkbuilder.p;
        if (coachmarkbuilder.v != null)
        {
            v = new String(coachmarkbuilder.v);
        }
        q = coachmarkbuilder.q;
        if (coachmarkbuilder.w != null)
        {
            w = new String(coachmarkbuilder.w);
        }
        r = coachmarkbuilder.r;
        if (coachmarkbuilder.x != null)
        {
            x = new String(coachmarkbuilder.x);
        }
        s = coachmarkbuilder.s;
        if (coachmarkbuilder.y != null)
        {
            y = new String(coachmarkbuilder.y);
        }
        if (coachmarkbuilder.t != null)
        {
            t = new String(coachmarkbuilder.t);
        }
        z = coachmarkbuilder.z;
        a = coachmarkbuilder.a;
        b = coachmarkbuilder.b;
        c = coachmarkbuilder.c;
        d = coachmarkbuilder.d;
        e = coachmarkbuilder.e;
        h = coachmarkbuilder.h;
        i = coachmarkbuilder.i;
        j = coachmarkbuilder.j;
        k = coachmarkbuilder.k;
        u = coachmarkbuilder.u;
        g = coachmarkbuilder.g;
        B = coachmarkbuilder.B;
        C = coachmarkbuilder.C;
        D = coachmarkbuilder.D;
    }

    private void s()
    {
        if (B <= 0L)
        {
            B = System.currentTimeMillis();
        }
    }

    public Activity a()
    {
        return l;
    }

    public CoachmarkBuilder a(int i1)
    {
        p = i1;
        return this;
    }

    public CoachmarkBuilder a(CoachmarkLayout.b b1, int i1)
    {
        o = new Pair(b1, Integer.valueOf(i1));
        n = null;
        return this;
    }

    public CoachmarkBuilder a(e.b b1)
    {
        z = b1;
        return this;
    }

    public CoachmarkBuilder a(e.e e1)
    {
        m = e1;
        return this;
    }

    public CoachmarkBuilder a(b b1)
    {
        D = b1;
        return this;
    }

    public CoachmarkBuilder a(Serializable serializable)
    {
        u = serializable;
        return this;
    }

    public CoachmarkBuilder a(String s1)
    {
        v = s1;
        return this;
    }

    public CoachmarkBuilder a(String s1, Serializable serializable)
    {
        C.put(s1, serializable);
        return this;
    }

    public transient CoachmarkBuilder a(View aview[])
    {
        if (aview != null)
        {
            int j1 = aview.length;
            o = null;
            n = new int[j1];
            for (int i1 = 0; i1 < j1; i1++)
            {
                n[i1] = aview[i1].getId();
            }

        }
        o = null;
        return this;
    }

    void a(Activity activity)
    {
        l = activity;
    }

    protected void a(boolean flag)
    {
        A = flag;
    }

    public CoachmarkBuilder b(int i1)
    {
        q = i1;
        return this;
    }

    public CoachmarkBuilder b(String s1)
    {
        w = s1;
        return this;
    }

    public CoachmarkBuilder b(boolean flag)
    {
        e = flag;
        return this;
    }

    protected boolean b()
    {
        return A;
    }

    public CoachmarkBuilder c(int i1)
    {
        r = i1;
        return this;
    }

    public CoachmarkBuilder c(String s1)
    {
        x = s1;
        return this;
    }

    public CoachmarkBuilder c(boolean flag)
    {
        f = flag;
        return this;
    }

    public int[] c()
    {
        return n;
    }

    public Pair d()
    {
        return o;
    }

    public CoachmarkBuilder d(String s1)
    {
        y = s1;
        return this;
    }

    public CoachmarkBuilder d(boolean flag)
    {
        c = flag;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CoachmarkBuilder e(String s1)
    {
        t = s1;
        return this;
    }

    public CoachmarkBuilder e(boolean flag)
    {
        d = flag;
        return this;
    }

    public e.e e()
    {
        return m;
    }

    public CoachmarkBuilder f(boolean flag)
    {
        g = flag;
        return this;
    }

    public b f()
    {
        return D;
    }

    public Serializable f(String s1)
    {
        return (Serializable)C.get(s1);
    }

    public e.b g()
    {
        return z;
    }

    public int h()
    {
        return p;
    }

    public String i()
    {
        return v;
    }

    public boolean j()
    {
        return p <= 0 && !com.pandora.radio.util.i.a(v);
    }

    public String k()
    {
        if (q > 0)
        {
            return l.getString(q);
        } else
        {
            return w;
        }
    }

    public String l()
    {
        if (r > 0)
        {
            return l.getString(r);
        } else
        {
            return x;
        }
    }

    public String m()
    {
        if (s > 0)
        {
            return l.getString(s);
        } else
        {
            return y;
        }
    }

    public String n()
    {
        return t;
    }

    public Object o()
    {
        return u;
    }

    public int p()
    {
        e.e e1 = e();
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.android.coachmark.e.e.values().length];
                try
                {
                    a[e.e.p.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[e.e.r.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[e.e.w.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[e.e.t.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.e.v.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.e.s.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.e.u.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[e1.ordinal()])
        {
        default:
            return 0x7f04002e;

        case 1: // '\001'
            return 0x7f040025;

        case 2: // '\002'
            return 0x7f04002d;

        case 3: // '\003'
            return 0x7f04009f;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return 0x7f04002f;
        }
    }

    protected long q()
    {
        s();
        return 15000L - (System.currentTimeMillis() - B);
    }

    protected boolean r()
    {
        return o != null || n != null && n.length > 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeSerializable(m);
        parcel.writeIntArray(n);
        Object obj;
        if (o == null)
        {
            obj = null;
        } else
        {
            obj = (CoachmarkLayout.b)o.first;
        }
        parcel.writeSerializable(((Serializable) (obj)));
        if (o == null)
        {
            i1 = 0;
        } else
        {
            i1 = ((Integer)o.second).intValue();
        }
        parcel.writeInt(i1);
        parcel.writeInt(p);
        parcel.writeSerializable(v);
        parcel.writeInt(q);
        parcel.writeSerializable(w);
        parcel.writeInt(r);
        parcel.writeSerializable(x);
        parcel.writeInt(s);
        parcel.writeSerializable(y);
        parcel.writeSerializable(t);
        parcel.writeSerializable(z);
        parcel.writeInt(a);
        if (b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (e)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeInt(h);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeSerializable((Serializable)u);
        if (g)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeLong(B);
        parcel.writeSerializable(C);
        parcel.writeSerializable(D);
    }

}
