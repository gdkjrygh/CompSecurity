// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class bxb
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bxc();
    private static bwz ag[] = new bwz[0];
    private static final Uri ah[] = new Uri[0];
    private static final nnt ai[] = new nnt[0];
    public final List A;
    public int B;
    public List C;
    public List D;
    final AtomicInteger E;
    public bvb F;
    public caf G;
    boolean H;
    public boolean I;
    boolean J;
    public long K;
    String L;
    String M;
    public String N;
    public String O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    String T;
    public Parcelable U;
    public boolean V;
    public boolean W;
    public String X;
    public long Y;
    public boolean Z;
    public bxf a;
    Intent aa;
    public boolean ab;
    public boolean ac;
    public Uri ad;
    public boolean ae;
    public boolean af;
    private boolean aj;
    public int b;
    public boolean c;
    public int d;
    String e;
    public boolean f;
    public List g;
    public final List h;
    final Map i;
    public final Map j;
    public final Set k;
    final Map l;
    public nom m;
    public Uri n;
    public byte o[];
    public String p;
    public String q;
    public boolean r;
    public Uri s;
    public cyy t;
    public cyy u;
    public cqc v;
    public cqc w;
    public String x;
    public boolean y;
    public final cqp z;

    bxb()
    {
        a = bxf.a;
        b = bwy.a;
        g = new ArrayList();
        h = new ArrayList();
        i = new HashMap();
        j = new HashMap();
        k = new HashSet();
        l = new HashMap();
        v = cqc.a;
        w = cqc.a;
        z = new cqp();
        A = new ArrayList();
        E = new AtomicInteger();
        a(false);
    }

    bxb(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = bxf.a;
        b = bwy.a;
        g = new ArrayList();
        h = new ArrayList();
        i = new HashMap();
        j = new HashMap();
        k = new HashSet();
        l = new HashMap();
        v = cqc.a;
        w = cqc.a;
        ClassLoader classloader = getClass().getClassLoader();
        a = bxf.values()[parcel.readByte()];
        b = bwy.a()[parcel.readByte()];
        Parcelable aparcelable[] = parcel.readParcelableArray(classloader);
        int i2 = aparcelable.length;
        for (int i1 = 0; i1 < i2; i1++)
        {
            Parcelable parcelable = aparcelable[i1];
            g.add((Uri)parcelable);
        }

        aparcelable = parcel.readParcelableArray(classloader);
        i2 = aparcelable.length;
        for (int j1 = 0; j1 < i2; j1++)
        {
            Parcelable parcelable1 = aparcelable[j1];
            h.add((bwz)parcelable1);
        }

        Object obj;
        int k1;
        boolean flag;
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            s = (Uri)parcel.readParcelable(classloader);
        }
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aj = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ab = flag;
        t = cyy.values()[parcel.readByte()];
        k1 = parcel.readInt();
        if (k1 == -1)
        {
            obj = null;
        } else
        {
            obj = cyy.values()[k1];
        }
        u = ((cyy) (obj));
        v = (cqc)parcel.readParcelable(classloader);
        w = (cqc)parcel.readParcelable(classloader);
        x = parcel.readString();
        if (x == null)
        {
            obj = "";
        } else
        {
            obj = x;
        }
        x = ((String) (obj));
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y = flag;
        z = (cqp)parcel.readParcelable(classloader);
        A = b.a(parcel, crd);
        B = parcel.readInt();
        C = b.a(parcel, cnq);
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            D = b.a(parcel, cnq);
        } else
        {
            D = null;
        }
        E = new AtomicInteger(parcel.readInt());
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        G = caf.values()[parcel.readByte()];
        if (G.e)
        {
            nob nob1;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            H = flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            I = flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            J = flag;
            F = (bvb)parcel.readParcelable(classloader);
            K = parcel.readLong();
            L = parcel.readString();
            M = parcel.readString();
            N = parcel.readString();
            O = parcel.readString();
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            P = flag;
        } else
        {
            a(caf.a);
        }
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Q = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        S = flag;
        T = parcel.readString();
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            U = parcel.readParcelable(classloader);
        } else
        {
            U = null;
        }
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        V = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        W = flag;
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            X = parcel.readString();
        } else
        {
            X = null;
        }
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            m = (nom)parcel.readParcelable(classloader);
        } else
        {
            m = null;
        }
        obj = parcel.readString();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        n = ((Uri) (obj));
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            o = parcel.createByteArray();
        } else
        {
            o = null;
        }
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            p = parcel.readString();
        } else
        {
            p = null;
        }
        if (parcel.readByte() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            q = parcel.readString();
        } else
        {
            q = null;
        }
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        i2 = parcel.readInt();
        k1 = 0;
        while (k1 < i2) 
        {
            obj = (nnt)parcel.readParcelable(classloader);
            nob1 = (nob)parcel.readParcelable(classloader);
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i.put(obj, nob1);
            l.put(nob1.a, obj);
            j.put(obj, Boolean.valueOf(flag));
            k1++;
        }
        k.clear();
        obj = parcel.readParcelableArray(classloader);
        i2 = obj.length;
        for (int l1 = 0; l1 < i2; l1++)
        {
            Parcelable parcelable2 = obj[l1];
            k.add((nnt)parcelable2);
        }

        Y = parcel.readLong();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Z = flag;
        d = parcel.readInt();
        e = parcel.readString();
        aa = (Intent)parcel.readParcelable(classloader);
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ac = flag;
        if (parcel.readByte() != 0)
        {
            ad = (Uri)parcel.readParcelable(classloader);
        }
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ae = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        af = flag;
    }

    final void a(caf caf1)
    {
        G = caf1;
        H = false;
        I = false;
        J = false;
        K = -1L;
        L = null;
        M = null;
        N = null;
        O = null;
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            g.clear();
            h.clear();
            T = null;
            U = null;
            V = false;
            W = true;
            X = null;
            a = bxf.a;
            b = bwy.a;
            i.clear();
            j.clear();
            l.clear();
            k.clear();
            m = null;
            n = null;
            o = null;
            p = null;
            ab = false;
            ac = false;
            ad = null;
            ae = false;
            af = false;
        }
        z.a();
        A.clear();
        B = 0;
        C = Collections.emptyList();
        q = null;
        r = false;
        D = null;
        y = false;
        v = cqc.a;
        w = cqc.a;
        t = cyy.a;
        u = null;
        x = "";
        Q = true;
        R = false;
        S = true;
        P = false;
        a(caf.a);
        Y = 0L;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeByte((byte)a.ordinal());
        parcel.writeByte((byte)(b - 1));
        parcel.writeParcelableArray((Parcelable[])g.toArray(ah), 0);
        parcel.writeParcelableArray((Parcelable[])h.toArray(ag), 0);
        Object obj;
        if (s != null)
        {
            parcel.writeByte((byte)1);
            parcel.writeParcelable(s, 0);
        } else
        {
            parcel.writeByte((byte)0);
        }
        if (aj)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (ab)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeByte((byte)t.ordinal());
        if (u == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(u.ordinal());
        }
        parcel.writeParcelable(v, 0);
        parcel.writeParcelable(w, 0);
        parcel.writeString(x);
        if (y)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeParcelable(z, 0);
        parcel.writeList(A);
        parcel.writeInt(B);
        parcel.writeList(C);
        if (D != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (D != null)
        {
            parcel.writeList(D);
        }
        parcel.writeInt(E.get());
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeByte((byte)G.ordinal());
        if (G.e)
        {
            java.util.Map.Entry entry;
            if (H)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
            if (I)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
            if (J)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
            parcel.writeParcelable(F, 0);
            parcel.writeLong(K);
            parcel.writeString(L);
            parcel.writeString(M);
            parcel.writeString(N);
            parcel.writeString(O);
            if (P)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
        }
        if (Q)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (S)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeString(T);
        if (U != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (U != null)
        {
            parcel.writeParcelable(U, 0);
        }
        if (V)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (W)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (X != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (X != null)
        {
            parcel.writeString(X);
        }
        if (m != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (m != null)
        {
            parcel.writeParcelable(m, 0);
        }
        if (n == null)
        {
            obj = "";
        } else
        {
            obj = n.toString();
        }
        parcel.writeString(((String) (obj)));
        if (o != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (o != null)
        {
            parcel.writeByteArray(o);
        }
        if (p != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (p != null)
        {
            parcel.writeString(p);
        }
        if (q != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (q != null)
        {
            parcel.writeString(q);
        }
        if (r)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeInt(i.size());
        obj = i.entrySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            parcel.writeParcelable((Parcelable)entry.getKey(), 0);
            parcel.writeParcelable((Parcelable)entry.getValue(), 0);
            if (((Boolean)j.get(entry.getKey())).booleanValue())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
        }
        parcel.writeParcelableArray((Parcelable[])k.toArray(ai), 0);
        parcel.writeLong(Y);
        if (Z)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeInt(d);
        parcel.writeString(e);
        parcel.writeParcelable(aa, 0);
        if (ac)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (ad != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (ad != null)
        {
            parcel.writeParcelable(ad, 0);
        }
        if (ae)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (af)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
    }

}
