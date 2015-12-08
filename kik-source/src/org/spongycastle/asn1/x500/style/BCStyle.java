// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x500.style;

import java.util.Hashtable;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x500.AttributeTypeAndValue;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.X500NameStyle;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;

// Referenced classes of package org.spongycastle.asn1.x500.style:
//            IETFUtils

public class BCStyle
    implements X500NameStyle
{

    public static final ASN1ObjectIdentifier A;
    public static final ASN1ObjectIdentifier B = new ASN1ObjectIdentifier("2.5.4.54");
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier D;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier F;
    public static final ASN1ObjectIdentifier G;
    public static final ASN1ObjectIdentifier H;
    public static final ASN1ObjectIdentifier I;
    public static final ASN1ObjectIdentifier J;
    private static final Hashtable K;
    private static final Hashtable L;
    public static final X500NameStyle a = new BCStyle();
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

    protected BCStyle()
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
            if (!attributetypeandvalue.c().equals(attributetypeandvalue1.c()))
            {
                return false;
            }
            if (!IETFUtils.a(IETFUtils.a(attributetypeandvalue.d())).equals(IETFUtils.a(IETFUtils.a(attributetypeandvalue1.d()))))
            {
                return false;
            }
        }
        return true;
    }

    protected static boolean a(RDN rdn, RDN rdn1)
    {
        if (!rdn.c()) goto _L2; else goto _L1
_L1:
        if (!rdn1.c()) goto _L4; else goto _L3
_L3:
        rdn = rdn.e();
        rdn1 = rdn1.e();
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
        if (!rdn1.c())
        {
            return a(rdn.d(), rdn1.d());
        }
        if (true) goto _L4; else goto _L6
_L6:
        return true;
    }

    public final int a(X500Name x500name)
    {
        x500name = x500name.c();
        int j1 = 0;
        int i1 = 0;
        while (j1 != x500name.length) 
        {
            if (x500name[j1].c())
            {
                AttributeTypeAndValue aattributetypeandvalue[] = x500name[j1].e();
                for (int k1 = 0; k1 != aattributetypeandvalue.length; k1++)
                {
                    i1 = i1 ^ aattributetypeandvalue[k1].c().hashCode() ^ a(aattributetypeandvalue[k1].d());
                }

            } else
            {
                i1 = i1 ^ x500name[j1].d().c().hashCode() ^ a(x500name[j1].d().d());
            }
            j1++;
        }
        return i1;
    }

    public boolean a(X500Name x500name, X500Name x500name1)
    {
        x500name = x500name.c();
        x500name1 = x500name1.c();
        if (x500name.length == x500name1.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        RDN rdn;
        boolean flag;
        int i1;
        int j1;
        if (x500name[0].d() != null && x500name1[0].d() != null)
        {
            if (!x500name[0].d().c().equals(x500name1[0].d().c()))
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
        x500name = x500name.c();
        int i1 = 0;
        boolean flag = true;
label0:
        for (; i1 < x500name.length; i1++)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuffer.append(',');
            }
            if (x500name[i1].c())
            {
                AttributeTypeAndValue aattributetypeandvalue[] = x500name[i1].e();
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
                    IETFUtils.a(stringbuffer, aattributetypeandvalue[j1], K);
                    j1++;
                } while (true);
            }
            IETFUtils.a(stringbuffer, x500name[i1].d(), K);
        }

        return stringbuffer.toString();
    }

    static 
    {
        b = new ASN1ObjectIdentifier("2.5.4.6");
        c = new ASN1ObjectIdentifier("2.5.4.10");
        d = new ASN1ObjectIdentifier("2.5.4.11");
        e = new ASN1ObjectIdentifier("2.5.4.12");
        f = new ASN1ObjectIdentifier("2.5.4.3");
        g = new ASN1ObjectIdentifier("2.5.4.5");
        h = new ASN1ObjectIdentifier("2.5.4.9");
        i = g;
        j = new ASN1ObjectIdentifier("2.5.4.7");
        k = new ASN1ObjectIdentifier("2.5.4.8");
        l = new ASN1ObjectIdentifier("2.5.4.4");
        m = new ASN1ObjectIdentifier("2.5.4.42");
        n = new ASN1ObjectIdentifier("2.5.4.43");
        o = new ASN1ObjectIdentifier("2.5.4.44");
        p = new ASN1ObjectIdentifier("2.5.4.45");
        q = new ASN1ObjectIdentifier("2.5.4.15");
        r = new ASN1ObjectIdentifier("2.5.4.17");
        s = new ASN1ObjectIdentifier("2.5.4.46");
        t = new ASN1ObjectIdentifier("2.5.4.65");
        u = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        v = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        w = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        x = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        y = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        z = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        A = new ASN1ObjectIdentifier("2.5.4.16");
        C = X509ObjectIdentifiers.g;
        D = X509ObjectIdentifiers.y_;
        E = PKCSObjectIdentifiers.T;
        F = PKCSObjectIdentifiers.U;
        G = PKCSObjectIdentifiers.aa;
        H = E;
        I = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        J = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        K = new Hashtable();
        L = new Hashtable();
        K.put(b, "C");
        K.put(c, "O");
        K.put(e, "T");
        K.put(d, "OU");
        K.put(f, "CN");
        K.put(j, "L");
        K.put(k, "ST");
        K.put(g, "SERIALNUMBER");
        K.put(E, "E");
        K.put(I, "DC");
        K.put(J, "UID");
        K.put(h, "STREET");
        K.put(l, "SURNAME");
        K.put(m, "GIVENNAME");
        K.put(n, "INITIALS");
        K.put(o, "GENERATION");
        K.put(G, "unstructuredAddress");
        K.put(F, "unstructuredName");
        K.put(p, "UniqueIdentifier");
        K.put(s, "DN");
        K.put(t, "Pseudonym");
        K.put(A, "PostalAddress");
        K.put(z, "NameAtBirth");
        K.put(x, "CountryOfCitizenship");
        K.put(y, "CountryOfResidence");
        K.put(w, "Gender");
        K.put(v, "PlaceOfBirth");
        K.put(u, "DateOfBirth");
        K.put(r, "PostalCode");
        K.put(q, "BusinessCategory");
        K.put(C, "TelephoneNumber");
        K.put(D, "Name");
        L.put("c", b);
        L.put("o", c);
        L.put("t", e);
        L.put("ou", d);
        L.put("cn", f);
        L.put("l", j);
        L.put("st", k);
        L.put("sn", g);
        L.put("serialnumber", g);
        L.put("street", h);
        L.put("emailaddress", H);
        L.put("dc", I);
        L.put("e", H);
        L.put("uid", J);
        L.put("surname", l);
        L.put("givenname", m);
        L.put("initials", n);
        L.put("generation", o);
        L.put("unstructuredaddress", G);
        L.put("unstructuredname", F);
        L.put("uniqueidentifier", p);
        L.put("dn", s);
        L.put("pseudonym", t);
        L.put("postaladdress", A);
        L.put("nameofbirth", z);
        L.put("countryofcitizenship", x);
        L.put("countryofresidence", y);
        L.put("gender", w);
        L.put("placeofbirth", v);
        L.put("dateofbirth", u);
        L.put("postalcode", r);
        L.put("businesscategory", q);
        L.put("telephonenumber", C);
        L.put("name", D);
    }
}
