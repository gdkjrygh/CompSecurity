// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500.style;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

// Referenced classes of package org.bouncycastle.asn1.x500.style:
//            IETFUtils

public class RFC4519Style
    implements X500NameStyle
{

    public static final ASN1ObjectIdentifier A;
    public static final ASN1ObjectIdentifier B;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier D;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier F;
    public static final ASN1ObjectIdentifier G;
    public static final ASN1ObjectIdentifier H;
    public static final ASN1ObjectIdentifier I;
    public static final ASN1ObjectIdentifier J;
    public static final ASN1ObjectIdentifier K;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier M;
    public static final ASN1ObjectIdentifier N;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier P;
    public static final ASN1ObjectIdentifier Q;
    public static final ASN1ObjectIdentifier R;
    private static final Hashtable S;
    private static final Hashtable T;
    public static final X500NameStyle a = new RFC4519Style();
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    public static final ASN1ObjectIdentifier j;
    public static final ASN1ObjectIdentifier k;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier m;
    public static final ASN1ObjectIdentifier n;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier p;
    public static final ASN1ObjectIdentifier q;
    public static final ASN1ObjectIdentifier r;
    public static final ASN1ObjectIdentifier s;
    public static final ASN1ObjectIdentifier t;
    public static final ASN1ObjectIdentifier u;
    public static final ASN1ObjectIdentifier v;
    public static final ASN1ObjectIdentifier w;
    public static final ASN1ObjectIdentifier x;
    public static final ASN1ObjectIdentifier y;
    public static final ASN1ObjectIdentifier z;

    protected RFC4519Style()
    {
    }

    private static int a(ASN1Encodable asn1encodable)
    {
        return IETFUtils.a(IETFUtils.a(asn1encodable)).hashCode();
    }

    private static boolean a(AttributeTypeAndValue attributetypeandvalue, AttributeTypeAndValue attributetypeandvalue1)
    {
        if (attributetypeandvalue != attributetypeandvalue1)
        {
            if (attributetypeandvalue == null)
            {
                return false;
            }
            if (attributetypeandvalue1 == null)
            {
                return false;
            }
            if (!attributetypeandvalue.e().equals(attributetypeandvalue1.e()))
            {
                return false;
            }
            if (!IETFUtils.a(IETFUtils.a(attributetypeandvalue.f())).equals(IETFUtils.a(IETFUtils.a(attributetypeandvalue1.f()))))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean a(RDN rdn, RDN rdn1)
    {
        if (!rdn.e()) goto _L2; else goto _L1
_L1:
        if (!rdn1.e()) goto _L4; else goto _L3
_L3:
        rdn = rdn.g();
        rdn1 = rdn1.g();
        if (rdn.length == rdn1.length) goto _L5; else goto _L4
_L4:
        return false;
_L5:
        int i1 = 0;
        do
        {
            if (i1 == rdn.length)
            {
                break;
            }
            if (!a(rdn[i1], rdn1[i1]))
            {
                continue; /* Loop/switch isn't completed */
            }
            i1++;
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (!rdn1.e())
        {
            return a(rdn.f(), rdn1.f());
        }
        if (true) goto _L4; else goto _L6
_L6:
        return true;
    }

    public final int a(X500Name x500name)
    {
        x500name = x500name.e();
        int j1 = 0;
        int i1 = 0;
        while (j1 != x500name.length) 
        {
            if (x500name[j1].e())
            {
                AttributeTypeAndValue aattributetypeandvalue[] = x500name[j1].g();
                for (int k1 = 0; k1 != aattributetypeandvalue.length; k1++)
                {
                    i1 = i1 ^ aattributetypeandvalue[k1].e().hashCode() ^ a(aattributetypeandvalue[k1].f());
                }

            } else
            {
                i1 = i1 ^ x500name[j1].f().e().hashCode() ^ a(x500name[j1].f().f());
            }
            j1++;
        }
        return i1;
    }

    public final boolean a(X500Name x500name, X500Name x500name1)
    {
        x500name = x500name.e();
        x500name1 = x500name1.e();
        if (x500name.length == x500name1.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        RDN rdn;
        boolean flag;
        int i1;
        int j1;
        if (x500name[0].f() != null && x500name1[0].f() != null)
        {
            if (!x500name[0].f().e().equals(x500name1[0].f().e()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        for (j1 = 0; j1 == x500name.length;)
        {
            break MISSING_BLOCK_LABEL_204;
        }

        rdn = x500name[j1];
        if (!flag) goto _L4; else goto _L3
_L3:
        i1 = x500name1.length - 1;
_L7:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        if (x500name1[i1] == null || !a(rdn, x500name1[i1])) goto _L6; else goto _L5
_L5:
        x500name1[i1] = null;
        i1 = 1;
_L8:
        if (i1 != 0)
        {
            j1++;
            break MISSING_BLOCK_LABEL_64;
        }
          goto _L1
_L6:
        i1--;
          goto _L7
_L4:
        i1 = 0;
_L9:
label0:
        {
            if (i1 == x500name1.length)
            {
                break MISSING_BLOCK_LABEL_198;
            }
            if (x500name1[i1] == null || !a(rdn, x500name1[i1]))
            {
                break label0;
            }
            x500name1[i1] = null;
            i1 = 1;
        }
          goto _L8
        i1++;
          goto _L9
        i1 = 0;
          goto _L8
        return true;
        break MISSING_BLOCK_LABEL_64;
    }

    public final String b(X500Name x500name)
    {
        StringBuffer stringbuffer = new StringBuffer();
        x500name = x500name.e();
        int i1 = x500name.length - 1;
        boolean flag = true;
label0:
        for (; i1 >= 0; i1--)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuffer.append(',');
            }
            if (x500name[i1].e())
            {
                AttributeTypeAndValue aattributetypeandvalue[] = x500name[i1].g();
                int j1 = 0;
                boolean flag1 = true;
                do
                {
                    if (j1 == aattributetypeandvalue.length)
                    {
                        continue label0;
                    }
                    if (flag1)
                    {
                        flag1 = false;
                    } else
                    {
                        stringbuffer.append('+');
                    }
                    IETFUtils.a(stringbuffer, aattributetypeandvalue[j1], S);
                    j1++;
                } while (true);
            }
            IETFUtils.a(stringbuffer, x500name[i1].f(), S);
        }

        return stringbuffer.toString();
    }

    static 
    {
        b = new ASN1ObjectIdentifier("2.5.4.15");
        c = new ASN1ObjectIdentifier("2.5.4.6");
        d = new ASN1ObjectIdentifier("2.5.4.3");
        e = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        f = new ASN1ObjectIdentifier("2.5.4.13");
        g = new ASN1ObjectIdentifier("2.5.4.27");
        h = new ASN1ObjectIdentifier("2.5.4.49");
        i = new ASN1ObjectIdentifier("2.5.4.46");
        j = new ASN1ObjectIdentifier("2.5.4.47");
        k = new ASN1ObjectIdentifier("2.5.4.23");
        l = new ASN1ObjectIdentifier("2.5.4.44");
        m = new ASN1ObjectIdentifier("2.5.4.42");
        n = new ASN1ObjectIdentifier("2.5.4.51");
        o = new ASN1ObjectIdentifier("2.5.4.43");
        p = new ASN1ObjectIdentifier("2.5.4.25");
        q = new ASN1ObjectIdentifier("2.5.4.7");
        r = new ASN1ObjectIdentifier("2.5.4.31");
        s = new ASN1ObjectIdentifier("2.5.4.41");
        t = new ASN1ObjectIdentifier("2.5.4.10");
        u = new ASN1ObjectIdentifier("2.5.4.11");
        v = new ASN1ObjectIdentifier("2.5.4.32");
        w = new ASN1ObjectIdentifier("2.5.4.19");
        x = new ASN1ObjectIdentifier("2.5.4.16");
        y = new ASN1ObjectIdentifier("2.5.4.17");
        z = new ASN1ObjectIdentifier("2.5.4.18");
        A = new ASN1ObjectIdentifier("2.5.4.28");
        B = new ASN1ObjectIdentifier("2.5.4.26");
        C = new ASN1ObjectIdentifier("2.5.4.33");
        D = new ASN1ObjectIdentifier("2.5.4.14");
        E = new ASN1ObjectIdentifier("2.5.4.34");
        F = new ASN1ObjectIdentifier("2.5.4.5");
        G = new ASN1ObjectIdentifier("2.5.4.4");
        H = new ASN1ObjectIdentifier("2.5.4.8");
        I = new ASN1ObjectIdentifier("2.5.4.9");
        J = new ASN1ObjectIdentifier("2.5.4.20");
        K = new ASN1ObjectIdentifier("2.5.4.22");
        L = new ASN1ObjectIdentifier("2.5.4.21");
        M = new ASN1ObjectIdentifier("2.5.4.12");
        N = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        O = new ASN1ObjectIdentifier("2.5.4.50");
        P = new ASN1ObjectIdentifier("2.5.4.35");
        Q = new ASN1ObjectIdentifier("2.5.4.24");
        R = new ASN1ObjectIdentifier("2.5.4.45");
        S = new Hashtable();
        T = new Hashtable();
        S.put(b, "businessCategory");
        S.put(c, "c");
        S.put(d, "cn");
        S.put(e, "dc");
        S.put(f, "description");
        S.put(g, "destinationIndicator");
        S.put(h, "distinguishedName");
        S.put(i, "dnQualifier");
        S.put(j, "enhancedSearchGuide");
        S.put(k, "facsimileTelephoneNumber");
        S.put(l, "generationQualifier");
        S.put(m, "givenName");
        S.put(n, "houseIdentifier");
        S.put(o, "initials");
        S.put(p, "internationalISDNNumber");
        S.put(q, "l");
        S.put(r, "member");
        S.put(s, "name");
        S.put(t, "o");
        S.put(u, "ou");
        S.put(v, "owner");
        S.put(w, "physicalDeliveryOfficeName");
        S.put(x, "postalAddress");
        S.put(y, "postalCode");
        S.put(z, "postOfficeBox");
        S.put(A, "preferredDeliveryMethod");
        S.put(B, "registeredAddress");
        S.put(C, "roleOccupant");
        S.put(D, "searchGuide");
        S.put(E, "seeAlso");
        S.put(F, "serialNumber");
        S.put(G, "sn");
        S.put(H, "st");
        S.put(I, "street");
        S.put(J, "telephoneNumber");
        S.put(K, "teletexTerminalIdentifier");
        S.put(L, "telexNumber");
        S.put(M, "title");
        S.put(N, "uid");
        S.put(O, "uniqueMember");
        S.put(P, "userPassword");
        S.put(Q, "x121Address");
        S.put(R, "x500UniqueIdentifier");
        T.put("businesscategory", b);
        T.put("c", c);
        T.put("cn", d);
        T.put("dc", e);
        T.put("description", f);
        T.put("destinationindicator", g);
        T.put("distinguishedname", h);
        T.put("dnqualifier", i);
        T.put("enhancedsearchguide", j);
        T.put("facsimiletelephonenumber", k);
        T.put("generationqualifier", l);
        T.put("givenname", m);
        T.put("houseidentifier", n);
        T.put("initials", o);
        T.put("internationalisdnnumber", p);
        T.put("l", q);
        T.put("member", r);
        T.put("name", s);
        T.put("o", t);
        T.put("ou", u);
        T.put("owner", v);
        T.put("physicaldeliveryofficename", w);
        T.put("postaladdress", x);
        T.put("postalcode", y);
        T.put("postofficebox", z);
        T.put("preferreddeliverymethod", A);
        T.put("registeredaddress", B);
        T.put("roleoccupant", C);
        T.put("searchguide", D);
        T.put("seealso", E);
        T.put("serialnumber", F);
        T.put("sn", G);
        T.put("st", H);
        T.put("street", I);
        T.put("telephonenumber", J);
        T.put("teletexterminalidentifier", K);
        T.put("telexnumber", L);
        T.put("title", M);
        T.put("uid", N);
        T.put("uniquemember", O);
        T.put("userpassword", P);
        T.put("x121address", Q);
        T.put("x500uniqueidentifier", R);
    }
}
