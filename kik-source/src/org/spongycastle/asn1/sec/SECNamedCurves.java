// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.sec:
//            a, l, w, ab, 
//            ac, ad, ae, af, 
//            ag, b, c, d, 
//            e, f, g, h, 
//            i, j, k, m, 
//            n, o, p, q, 
//            r, s, t, u, 
//            v, x, y, z, 
//            aa, SECObjectIdentifiers

public class SECNamedCurves
{

    static X9ECParametersHolder A;
    static X9ECParametersHolder B;
    static X9ECParametersHolder C;
    static X9ECParametersHolder D;
    static X9ECParametersHolder E;
    static X9ECParametersHolder F;
    static X9ECParametersHolder G;
    static final Hashtable H = new Hashtable();
    static final Hashtable I = new Hashtable();
    static final Hashtable J = new Hashtable();
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
    static X9ECParametersHolder x;
    static X9ECParametersHolder y;
    static X9ECParametersHolder z;

    public SECNamedCurves()
    {
    }

    public static X9ECParameters a(String s1)
    {
        s1 = (ASN1ObjectIdentifier)H.get(Strings.c(s1));
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
        asn1objectidentifier = (X9ECParametersHolder)I.get(asn1objectidentifier);
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
        H.put(s1, asn1objectidentifier);
        J.put(asn1objectidentifier, s1);
        I.put(asn1objectidentifier, x9ecparametersholder);
    }

    public static String b(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (String)J.get(asn1objectidentifier);
    }

    public static ASN1ObjectIdentifier b(String s1)
    {
        return (ASN1ObjectIdentifier)H.get(Strings.c(s1));
    }

    static BigInteger c(String s1)
    {
        return new BigInteger(1, Hex.a(s1));
    }

    static 
    {
        a = new a();
        b = new l();
        c = new w();
        d = new ab();
        e = new ac();
        f = new ad();
        g = new ae();
        h = new af();
        i = new ag();
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
        x = new q();
        y = new r();
        z = new s();
        A = new t();
        B = new u();
        C = new v();
        D = new x();
        E = new y();
        F = new z();
        G = new aa();
        a("secp112r1", SECObjectIdentifiers.g, a);
        a("secp112r2", SECObjectIdentifiers.h, b);
        a("secp128r1", SECObjectIdentifiers.u, c);
        a("secp128r2", SECObjectIdentifiers.v, d);
        a("secp160k1", SECObjectIdentifiers.j, e);
        a("secp160r1", SECObjectIdentifiers.i, f);
        a("secp160r2", SECObjectIdentifiers.w, g);
        a("secp192k1", SECObjectIdentifiers.x, h);
        a("secp192r1", SECObjectIdentifiers.G, i);
        a("secp224k1", SECObjectIdentifiers.y, j);
        a("secp224r1", SECObjectIdentifiers.z, k);
        a("secp256k1", SECObjectIdentifiers.k, l);
        a("secp256r1", SECObjectIdentifiers.H, m);
        a("secp384r1", SECObjectIdentifiers.A, n);
        a("secp521r1", SECObjectIdentifiers.B, o);
        a("sect113r1", SECObjectIdentifiers.e, p);
        a("sect113r2", SECObjectIdentifiers.f, q);
        a("sect131r1", SECObjectIdentifiers.o, r);
        a("sect131r2", SECObjectIdentifiers.p, s);
        a("sect163k1", SECObjectIdentifiers.b, t);
        a("sect163r1", SECObjectIdentifiers.c, u);
        a("sect163r2", SECObjectIdentifiers.l, v);
        a("sect193r1", SECObjectIdentifiers.q, w);
        a("sect193r2", SECObjectIdentifiers.r, x);
        a("sect233k1", SECObjectIdentifiers.s, y);
        a("sect233r1", SECObjectIdentifiers.t, z);
        a("sect239k1", SECObjectIdentifiers.d, A);
        a("sect283k1", SECObjectIdentifiers.m, B);
        a("sect283r1", SECObjectIdentifiers.n, C);
        a("sect409k1", SECObjectIdentifiers.C, D);
        a("sect409r1", SECObjectIdentifiers.D, E);
        a("sect571k1", SECObjectIdentifiers.E, F);
        a("sect571r1", SECObjectIdentifiers.F, G);
    }
}
