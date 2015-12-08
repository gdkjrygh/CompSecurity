// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.teletrust;

import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1.teletrust:
//            a, g, h, i, 
//            j, k, l, m, 
//            n, b, c, d, 
//            e, f, TeleTrusTObjectIdentifiers

public class TeleTrusTNamedCurves
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
    static final Hashtable o = new Hashtable();
    static final Hashtable p = new Hashtable();
    static final Hashtable q = new Hashtable();

    public TeleTrusTNamedCurves()
    {
    }

    public static X9ECParameters a(String s)
    {
        s = (DERObjectIdentifier)o.get(Strings.c(s));
        if (s != null)
        {
            return a(((DERObjectIdentifier) (s)));
        } else
        {
            return null;
        }
    }

    public static X9ECParameters a(DERObjectIdentifier derobjectidentifier)
    {
        derobjectidentifier = (X9ECParametersHolder)p.get(derobjectidentifier);
        if (derobjectidentifier != null)
        {
            return derobjectidentifier.b();
        } else
        {
            return null;
        }
    }

    private static void a(String s, DERObjectIdentifier derobjectidentifier, X9ECParametersHolder x9ecparametersholder)
    {
        o.put(s, derobjectidentifier);
        q.put(derobjectidentifier, s);
        p.put(derobjectidentifier, x9ecparametersholder);
    }

    public static String b(DERObjectIdentifier derobjectidentifier)
    {
        return (String)q.get(derobjectidentifier);
    }

    public static DERObjectIdentifier b(String s)
    {
        return (DERObjectIdentifier)o.get(Strings.c(s));
    }

    static 
    {
        a = new a();
        b = new g();
        c = new h();
        d = new i();
        e = new j();
        f = new k();
        g = new l();
        h = new m();
        i = new n();
        j = new b();
        k = new c();
        l = new d();
        m = new e();
        n = new f();
        a("brainpoolp160r1", TeleTrusTObjectIdentifiers.o, a);
        a("brainpoolp160t1", TeleTrusTObjectIdentifiers.p, b);
        a("brainpoolp192r1", TeleTrusTObjectIdentifiers.q, c);
        a("brainpoolp192t1", TeleTrusTObjectIdentifiers.r, d);
        a("brainpoolp224r1", TeleTrusTObjectIdentifiers.s, e);
        a("brainpoolp224t1", TeleTrusTObjectIdentifiers.t, f);
        a("brainpoolp256r1", TeleTrusTObjectIdentifiers.u, g);
        a("brainpoolp256t1", TeleTrusTObjectIdentifiers.v, h);
        a("brainpoolp320r1", TeleTrusTObjectIdentifiers.w, i);
        a("brainpoolp320t1", TeleTrusTObjectIdentifiers.x, j);
        a("brainpoolp384r1", TeleTrusTObjectIdentifiers.y, k);
        a("brainpoolp384t1", TeleTrusTObjectIdentifiers.z, l);
        a("brainpoolp512r1", TeleTrusTObjectIdentifiers.A, m);
        a("brainpoolp512t1", TeleTrusTObjectIdentifiers.B, n);
    }
}
