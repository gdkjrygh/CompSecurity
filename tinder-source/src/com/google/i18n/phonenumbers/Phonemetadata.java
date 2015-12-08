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

public final class Phonemetadata
{
    public static class NumberFormat
        implements Externalizable
    {

        private static final long serialVersionUID = 1L;
        String a;
        String b;
        List c;
        String d;
        boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private String k;

        public final int a()
        {
            return c.size();
        }

        public void readExternal(ObjectInput objectinput)
            throws IOException
        {
            String s = objectinput.readUTF();
            f = true;
            a = s;
            s = objectinput.readUTF();
            g = true;
            b = s;
            int i1 = objectinput.readInt();
            for (int l = 0; l < i1; l++)
            {
                c.add(objectinput.readUTF());
            }

            if (objectinput.readBoolean())
            {
                String s1 = objectinput.readUTF();
                h = true;
                d = s1;
            }
            if (objectinput.readBoolean())
            {
                String s2 = objectinput.readUTF();
                j = true;
                k = s2;
            }
            boolean flag = objectinput.readBoolean();
            i = true;
            e = flag;
        }

        public void writeExternal(ObjectOutput objectoutput)
            throws IOException
        {
            objectoutput.writeUTF(a);
            objectoutput.writeUTF(b);
            int i1 = a();
            objectoutput.writeInt(i1);
            for (int l = 0; l < i1; l++)
            {
                objectoutput.writeUTF((String)c.get(l));
            }

            objectoutput.writeBoolean(h);
            if (h)
            {
                objectoutput.writeUTF(d);
            }
            objectoutput.writeBoolean(j);
            if (j)
            {
                objectoutput.writeUTF(k);
            }
            objectoutput.writeBoolean(e);
        }

        public NumberFormat()
        {
            a = "";
            b = "";
            c = new ArrayList();
            d = "";
            e = false;
            k = "";
        }
    }

    public static class PhoneMetadata
        implements Externalizable
    {

        private static final long serialVersionUID = 1L;
        private PhoneNumberDesc A;
        private boolean B;
        private PhoneNumberDesc C;
        private boolean D;
        private PhoneNumberDesc E;
        private boolean F;
        private PhoneNumberDesc G;
        private boolean H;
        private PhoneNumberDesc I;
        private boolean J;
        private PhoneNumberDesc K;
        private boolean L;
        private PhoneNumberDesc M;
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
        private PhoneNumberDesc i;
        private boolean j;
        private PhoneNumberDesc k;
        private boolean l;
        private PhoneNumberDesc m;
        private boolean n;
        private PhoneNumberDesc o;
        private boolean p;
        private PhoneNumberDesc q;
        private boolean r;
        private PhoneNumberDesc s;
        private boolean t;
        private PhoneNumberDesc u;
        private boolean v;
        private PhoneNumberDesc w;
        private boolean x;
        private PhoneNumberDesc y;
        private boolean z;

        public final int a()
        {
            return g.size();
        }

        public final PhoneMetadata a(String s1)
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
                PhoneNumberDesc phonenumberdesc = new PhoneNumberDesc();
                phonenumberdesc.readExternal(objectinput);
                h = true;
                i = phonenumberdesc;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc1 = new PhoneNumberDesc();
                phonenumberdesc1.readExternal(objectinput);
                j = true;
                k = phonenumberdesc1;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc2 = new PhoneNumberDesc();
                phonenumberdesc2.readExternal(objectinput);
                l = true;
                m = phonenumberdesc2;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc3 = new PhoneNumberDesc();
                phonenumberdesc3.readExternal(objectinput);
                n = true;
                o = phonenumberdesc3;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc4 = new PhoneNumberDesc();
                phonenumberdesc4.readExternal(objectinput);
                p = true;
                q = phonenumberdesc4;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc5 = new PhoneNumberDesc();
                phonenumberdesc5.readExternal(objectinput);
                r = true;
                s = phonenumberdesc5;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc6 = new PhoneNumberDesc();
                phonenumberdesc6.readExternal(objectinput);
                t = true;
                u = phonenumberdesc6;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc7 = new PhoneNumberDesc();
                phonenumberdesc7.readExternal(objectinput);
                v = true;
                w = phonenumberdesc7;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc8 = new PhoneNumberDesc();
                phonenumberdesc8.readExternal(objectinput);
                x = true;
                y = phonenumberdesc8;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc9 = new PhoneNumberDesc();
                phonenumberdesc9.readExternal(objectinput);
                z = true;
                A = phonenumberdesc9;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc10 = new PhoneNumberDesc();
                phonenumberdesc10.readExternal(objectinput);
                B = true;
                C = phonenumberdesc10;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc11 = new PhoneNumberDesc();
                phonenumberdesc11.readExternal(objectinput);
                D = true;
                E = phonenumberdesc11;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc12 = new PhoneNumberDesc();
                phonenumberdesc12.readExternal(objectinput);
                F = true;
                G = phonenumberdesc12;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc13 = new PhoneNumberDesc();
                phonenumberdesc13.readExternal(objectinput);
                H = true;
                I = phonenumberdesc13;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc14 = new PhoneNumberDesc();
                phonenumberdesc14.readExternal(objectinput);
                J = true;
                K = phonenumberdesc14;
            }
            if (objectinput.readBoolean())
            {
                PhoneNumberDesc phonenumberdesc15 = new PhoneNumberDesc();
                phonenumberdesc15.readExternal(objectinput);
                L = true;
                M = phonenumberdesc15;
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
                NumberFormat numberformat = new NumberFormat();
                numberformat.readExternal(objectinput);
                f.add(numberformat);
            }

            l1 = objectinput.readInt();
            for (int k1 = ((flag) ? 1 : 0); k1 < l1; k1++)
            {
                NumberFormat numberformat1 = new NumberFormat();
                numberformat1.readExternal(objectinput);
                g.add(numberformat1);
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
                ((NumberFormat)f.get(i1)).writeExternal(objectoutput);
            }

            k1 = a();
            objectoutput.writeInt(k1);
            for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
            {
                ((NumberFormat)g.get(j1)).writeExternal(objectoutput);
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

        public PhoneMetadata()
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

    public static class PhoneMetadataCollection
        implements Externalizable
    {

        private static final long serialVersionUID = 1L;
        List a;

        public void readExternal(ObjectInput objectinput)
            throws IOException
        {
            int j = objectinput.readInt();
            for (int i = 0; i < j; i++)
            {
                PhoneMetadata phonemetadata = new PhoneMetadata();
                phonemetadata.readExternal(objectinput);
                a.add(phonemetadata);
            }

        }

        public void writeExternal(ObjectOutput objectoutput)
            throws IOException
        {
            int j = a.size();
            objectoutput.writeInt(j);
            for (int i = 0; i < j; i++)
            {
                ((PhoneMetadata)a.get(i)).writeExternal(objectoutput);
            }

        }

        public PhoneMetadataCollection()
        {
            a = new ArrayList();
        }
    }

    public static class PhoneNumberDesc
        implements Externalizable
    {

        private static final long serialVersionUID = 1L;
        private boolean a;
        private String b;
        private boolean c;
        private String d;
        private boolean e;
        private String f;

        public void readExternal(ObjectInput objectinput)
            throws IOException
        {
            if (objectinput.readBoolean())
            {
                String s = objectinput.readUTF();
                a = true;
                b = s;
            }
            if (objectinput.readBoolean())
            {
                String s1 = objectinput.readUTF();
                c = true;
                d = s1;
            }
            if (objectinput.readBoolean())
            {
                objectinput = objectinput.readUTF();
                e = true;
                f = objectinput;
            }
        }

        public void writeExternal(ObjectOutput objectoutput)
            throws IOException
        {
            objectoutput.writeBoolean(a);
            if (a)
            {
                objectoutput.writeUTF(b);
            }
            objectoutput.writeBoolean(c);
            if (c)
            {
                objectoutput.writeUTF(d);
            }
            objectoutput.writeBoolean(e);
            if (e)
            {
                objectoutput.writeUTF(f);
            }
        }

        public PhoneNumberDesc()
        {
            b = "";
            d = "";
            f = "";
        }
    }

}
