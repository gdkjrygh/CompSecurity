// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.i18n.phonenumbers:
//            Phonemetadata

public static class ah
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private c A;
    private boolean B;
    private c C;
    private boolean D;
    private c E;
    private boolean F;
    private c G;
    private boolean H;
    private c I;
    private boolean J;
    private c K;
    private boolean L;
    private c M;
    private boolean N;
    private String O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private String S;
    private String T;
    private boolean U;
    private String V;
    private boolean W;
    private String X;
    private boolean Y;
    private boolean Z;
    int a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private String ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    String b;
    boolean c;
    boolean d;
    String e;
    List f;
    List g;
    private boolean h;
    private c i;
    private boolean j;
    private c k;
    private boolean l;
    private c m;
    private boolean n;
    private c o;
    private boolean p;
    private c q;
    private boolean r;
    private c s;
    private boolean t;
    private c u;
    private boolean v;
    private c w;
    private boolean x;
    private c y;
    private boolean z;

    public final int a()
    {
        return g.size();
    }

    public final g a(String s1)
    {
        Q = true;
        b = s1;
        return this;
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException
    {
        boolean flag = false;
        if (objectinput.readBoolean())
        {
            c c1 = new c();
            c1.readExternal(objectinput);
            h = true;
            i = c1;
        }
        if (objectinput.readBoolean())
        {
            c c2 = new c();
            c2.readExternal(objectinput);
            j = true;
            k = c2;
        }
        if (objectinput.readBoolean())
        {
            c c3 = new c();
            c3.readExternal(objectinput);
            l = true;
            m = c3;
        }
        if (objectinput.readBoolean())
        {
            c c4 = new c();
            c4.readExternal(objectinput);
            n = true;
            o = c4;
        }
        if (objectinput.readBoolean())
        {
            c c5 = new c();
            c5.readExternal(objectinput);
            p = true;
            q = c5;
        }
        if (objectinput.readBoolean())
        {
            c c6 = new c();
            c6.readExternal(objectinput);
            r = true;
            s = c6;
        }
        if (objectinput.readBoolean())
        {
            c c7 = new c();
            c7.readExternal(objectinput);
            t = true;
            u = c7;
        }
        if (objectinput.readBoolean())
        {
            c c8 = new c();
            c8.readExternal(objectinput);
            v = true;
            w = c8;
        }
        if (objectinput.readBoolean())
        {
            c c9 = new c();
            c9.readExternal(objectinput);
            x = true;
            y = c9;
        }
        if (objectinput.readBoolean())
        {
            c c10 = new c();
            c10.readExternal(objectinput);
            z = true;
            A = c10;
        }
        if (objectinput.readBoolean())
        {
            c c11 = new c();
            c11.readExternal(objectinput);
            B = true;
            C = c11;
        }
        if (objectinput.readBoolean())
        {
            c c12 = new c();
            c12.readExternal(objectinput);
            D = true;
            E = c12;
        }
        if (objectinput.readBoolean())
        {
            c c13 = new c();
            c13.readExternal(objectinput);
            F = true;
            G = c13;
        }
        if (objectinput.readBoolean())
        {
            c c14 = new c();
            c14.readExternal(objectinput);
            H = true;
            I = c14;
        }
        if (objectinput.readBoolean())
        {
            c c15 = new c();
            c15.readExternal(objectinput);
            J = true;
            K = c15;
        }
        if (objectinput.readBoolean())
        {
            c c16 = new c();
            c16.readExternal(objectinput);
            L = true;
            M = c16;
        }
        String s1 = objectinput.readUTF();
        N = true;
        O = s1;
        int i1 = objectinput.readInt();
        P = true;
        a = i1;
        a(objectinput.readUTF());
        if (objectinput.readBoolean())
        {
            String s2 = objectinput.readUTF();
            R = true;
            S = s2;
        }
        if (objectinput.readBoolean())
        {
            String s3 = objectinput.readUTF();
            c = true;
            T = s3;
        }
        if (objectinput.readBoolean())
        {
            String s4 = objectinput.readUTF();
            U = true;
            V = s4;
        }
        if (objectinput.readBoolean())
        {
            String s5 = objectinput.readUTF();
            d = true;
            e = s5;
        }
        if (objectinput.readBoolean())
        {
            String s6 = objectinput.readUTF();
            W = true;
            X = s6;
        }
        boolean flag1 = objectinput.readBoolean();
        Y = true;
        Z = flag1;
        int l1 = objectinput.readInt();
        for (int j1 = 0; j1 < l1; j1++)
        {
            c c17 = new init>();
            c17.eadExternal(objectinput);
            f.add(c17);
        }

        l1 = objectinput.readInt();
        for (int k1 = ((flag) ? 1 : 0); k1 < l1; k1++)
        {
            c c18 = new init>();
            c18.eadExternal(objectinput);
            g.add(c18);
        }

        flag1 = objectinput.readBoolean();
        aa = true;
        ab = flag1;
        if (objectinput.readBoolean())
        {
            String s7 = objectinput.readUTF();
            ac = true;
            ad = s7;
        }
        flag1 = objectinput.readBoolean();
        ae = true;
        af = flag1;
        flag1 = objectinput.readBoolean();
        ag = true;
        ah = flag1;
    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        boolean flag = false;
        objectoutput.writeBoolean(h);
        if (h)
        {
            i.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(j);
        if (j)
        {
            k.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(l);
        if (l)
        {
            m.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(n);
        if (n)
        {
            o.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(p);
        if (p)
        {
            q.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(r);
        if (r)
        {
            s.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(t);
        if (t)
        {
            u.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(v);
        if (v)
        {
            w.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(x);
        if (x)
        {
            y.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(z);
        if (z)
        {
            A.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(B);
        if (B)
        {
            C.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(D);
        if (D)
        {
            E.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(F);
        if (F)
        {
            G.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(H);
        if (H)
        {
            I.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(J);
        if (J)
        {
            K.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(L);
        if (L)
        {
            M.writeExternal(objectoutput);
        }
        objectoutput.writeUTF(O);
        objectoutput.writeInt(a);
        objectoutput.writeUTF(b);
        objectoutput.writeBoolean(R);
        if (R)
        {
            objectoutput.writeUTF(S);
        }
        objectoutput.writeBoolean(c);
        if (c)
        {
            objectoutput.writeUTF(T);
        }
        objectoutput.writeBoolean(U);
        if (U)
        {
            objectoutput.writeUTF(V);
        }
        objectoutput.writeBoolean(d);
        if (d)
        {
            objectoutput.writeUTF(e);
        }
        objectoutput.writeBoolean(W);
        if (W)
        {
            objectoutput.writeUTF(X);
        }
        objectoutput.writeBoolean(Z);
        int k1 = f.size();
        objectoutput.writeInt(k1);
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((f)f.get(i1)).riteExternal(objectoutput);
        }

        k1 = a();
        objectoutput.writeInt(k1);
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            ((a)g.get(j1)).riteExternal(objectoutput);
        }

        objectoutput.writeBoolean(ab);
        objectoutput.writeBoolean(ac);
        if (ac)
        {
            objectoutput.writeUTF(ad);
        }
        objectoutput.writeBoolean(af);
        objectoutput.writeBoolean(ah);
    }

    public c()
    {
        i = null;
        k = null;
        m = null;
        o = null;
        q = null;
        s = null;
        u = null;
        w = null;
        y = null;
        A = null;
        C = null;
        E = null;
        G = null;
        I = null;
        K = null;
        M = null;
        O = "";
        a = 0;
        b = "";
        S = "";
        T = "";
        V = "";
        e = "";
        X = "";
        Z = false;
        f = new ArrayList();
        g = new ArrayList();
        ab = false;
        ad = "";
        af = false;
        ah = false;
    }
}
