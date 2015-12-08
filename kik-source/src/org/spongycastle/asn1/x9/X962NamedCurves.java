// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.util.Hashtable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1.x9:
//            a, l, q, r, 
//            s, t, u, v, 
//            w, b, c, d, 
//            e, f, g, h, 
//            i, j, k, m, 
//            n, o, p, X9ObjectIdentifiers, 
//            X9ECParametersHolder, X9ECParameters

public class X962NamedCurves
{

    static X9ECParametersHolder a;
    static X9ECParametersHolder b;
    static X9ECParametersHolder c;
    static X9ECParametersHolder d;
    static X9ECParametersHolder e;
    static X9ECParametersHolder f;
    static X9ECParametersHolder g;
    static X9ECParametersHolder h;
    static X9ECParametersHolder i;
    static X9ECParametersHolder j;
    static X9ECParametersHolder k;
    static X9ECParametersHolder l;
    static X9ECParametersHolder m;
    static X9ECParametersHolder n;
    static X9ECParametersHolder o;
    static X9ECParametersHolder p;
    static X9ECParametersHolder q;
    static X9ECParametersHolder r;
    static X9ECParametersHolder s;
    static X9ECParametersHolder t;
    static X9ECParametersHolder u;
    static X9ECParametersHolder v;
    static X9ECParametersHolder w;
    static final Hashtable x = new Hashtable();
    static final Hashtable y = new Hashtable();
    static final Hashtable z = new Hashtable();

    public X962NamedCurves()
    {
    }

    public static X9ECParameters a(String s1)
    {
        s1 = (ASN1ObjectIdentifier)x.get(Strings.c(s1));
        if (s1 != null)
        {
            return a(((ASN1ObjectIdentifier) (s1)));
        } else
        {
            return null;
        }
    }

    public static X9ECParameters a(ASN1ObjectIdentifier asn1objectidentifier)
    {
        asn1objectidentifier = (X9ECParametersHolder)y.get(asn1objectidentifier);
        if (asn1objectidentifier != null)
        {
            return asn1objectidentifier.b();
        } else
        {
            return null;
        }
    }

    private static void a(String s1, ASN1ObjectIdentifier asn1objectidentifier, X9ECParametersHolder x9ecparametersholder)
    {
        x.put(s1, asn1objectidentifier);
        z.put(asn1objectidentifier, s1);
        y.put(asn1objectidentifier, x9ecparametersholder);
    }

    public static String b(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (String)z.get(asn1objectidentifier);
    }

    public static ASN1ObjectIdentifier b(String s1)
    {
        return (ASN1ObjectIdentifier)x.get(Strings.c(s1));
    }

    static 
    {
        a = new a();
        b = new l();
        c = new q();
        d = new r();
        e = new s();
        f = new t();
        g = new u();
        h = new v();
        i = new w();
        j = new b();
        k = new c();
        l = new d();
        m = new e();
        n = new f();
        o = new g();
        p = new h();
        q = new i();
        r = new j();
        s = new k();
        t = new m();
        u = new n();
        v = new o();
        w = new p();
        a("prime192v1", X9ObjectIdentifiers.N, a);
        a("prime192v2", X9ObjectIdentifiers.O, b);
        a("prime192v3", X9ObjectIdentifiers.P, c);
        a("prime239v1", X9ObjectIdentifiers.Q, d);
        a("prime239v2", X9ObjectIdentifiers.R, e);
        a("prime239v3", X9ObjectIdentifiers.S, f);
        a("prime256v1", X9ObjectIdentifiers.T, g);
        a("c2pnb163v1", X9ObjectIdentifiers.s, h);
        a("c2pnb163v2", X9ObjectIdentifiers.t, i);
        a("c2pnb163v3", X9ObjectIdentifiers.u, j);
        a("c2pnb176w1", X9ObjectIdentifiers.v, k);
        a("c2tnb191v1", X9ObjectIdentifiers.w, l);
        a("c2tnb191v2", X9ObjectIdentifiers.x, m);
        a("c2tnb191v3", X9ObjectIdentifiers.y, n);
        a("c2pnb208w1", X9ObjectIdentifiers.B, o);
        a("c2tnb239v1", X9ObjectIdentifiers.C, p);
        a("c2tnb239v2", X9ObjectIdentifiers.D, q);
        a("c2tnb239v3", X9ObjectIdentifiers.E, r);
        a("c2pnb272w1", X9ObjectIdentifiers.H, s);
        a("c2pnb304w1", X9ObjectIdentifiers.I, t);
        a("c2tnb359v1", X9ObjectIdentifiers.J, u);
        a("c2pnb368w1", X9ObjectIdentifiers.K, v);
        a("c2tnb431r1", X9ObjectIdentifiers.L, w);
    }
}
