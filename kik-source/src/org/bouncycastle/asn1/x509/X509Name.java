// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERString;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509ObjectIdentifiers, X509NameEntryConverter

public class X509Name extends ASN1Encodable
{

    public static final DERObjectIdentifier A = new DERObjectIdentifier("2.5.4.54");
    public static final DERObjectIdentifier B;
    public static final DERObjectIdentifier C;
    public static final DERObjectIdentifier D;
    public static final DERObjectIdentifier E;
    public static final DERObjectIdentifier F;
    public static final DERObjectIdentifier G;
    public static final DERObjectIdentifier H;
    public static final DERObjectIdentifier I;
    public static boolean J = false;
    public static final Hashtable K;
    public static final Hashtable L;
    public static final Hashtable M;
    public static final Hashtable N;
    public static final Hashtable O;
    public static final Hashtable P;
    private static final Boolean Q = new Boolean(true);
    private static final Boolean R = new Boolean(false);
    public static final DERObjectIdentifier a;
    public static final DERObjectIdentifier b;
    public static final DERObjectIdentifier c;
    public static final DERObjectIdentifier d;
    public static final DERObjectIdentifier e;
    public static final DERObjectIdentifier f;
    public static final DERObjectIdentifier g;
    public static final DERObjectIdentifier h;
    public static final DERObjectIdentifier i;
    public static final DERObjectIdentifier j;
    public static final DERObjectIdentifier k;
    public static final DERObjectIdentifier l;
    public static final DERObjectIdentifier m;
    public static final DERObjectIdentifier n;
    public static final DERObjectIdentifier o;
    public static final DERObjectIdentifier p;
    public static final DERObjectIdentifier q;
    public static final DERObjectIdentifier r;
    public static final DERObjectIdentifier s;
    public static final DERObjectIdentifier t;
    public static final DERObjectIdentifier u;
    public static final DERObjectIdentifier v;
    public static final DERObjectIdentifier w;
    public static final DERObjectIdentifier x;
    public static final DERObjectIdentifier y;
    public static final DERObjectIdentifier z;
    private X509NameEntryConverter S;
    private Vector T;
    private Vector U;
    private Vector V;
    private ASN1Sequence W;
    private boolean X;
    private int Y;

    protected X509Name()
    {
        S = null;
        T = new Vector();
        U = new Vector();
        V = new Vector();
    }

    public X509Name(ASN1Sequence asn1sequence)
    {
        S = null;
        T = new Vector();
        U = new Vector();
        V = new Vector();
        W = asn1sequence;
        for (Enumeration enumeration = asn1sequence.e(); enumeration.hasMoreElements();)
        {
            ASN1Set asn1set = ASN1Set.a(((DEREncodable)enumeration.nextElement()).c());
            int i1 = 0;
            while (i1 < asn1set.f()) 
            {
                asn1sequence = ASN1Sequence.a(asn1set.a(i1));
                if (asn1sequence.f() != 2)
                {
                    throw new IllegalArgumentException("badly sized pair");
                }
                T.addElement(DERObjectIdentifier.a(asn1sequence.a(0)));
                asn1sequence = asn1sequence.a(1);
                if ((asn1sequence instanceof DERString) && !(asn1sequence instanceof DERUniversalString))
                {
                    asn1sequence = ((DERString)asn1sequence).n_();
                    Vector vector;
                    if (asn1sequence.length() > 0 && asn1sequence.charAt(0) == '#')
                    {
                        U.addElement((new StringBuilder("\\")).append(asn1sequence).toString());
                    } else
                    {
                        U.addElement(asn1sequence);
                    }
                } else
                {
                    U.addElement((new StringBuilder("#")).append(a(Hex.a(asn1sequence.c().b()))).toString());
                }
                vector = V;
                if (i1 != 0)
                {
                    asn1sequence = Q;
                } else
                {
                    asn1sequence = R;
                }
                vector.addElement(asn1sequence);
                i1++;
            }
        }

    }

    private static String a(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i1 = 0; i1 != ac.length; i1++)
        {
            ac[i1] = (char)(abyte0[i1] & 0xff);
        }

        return new String(ac);
    }

    public static X509Name a(Object obj)
    {
        if (obj == null || (obj instanceof X509Name))
        {
            return (X509Name)obj;
        }
        if (obj instanceof X500Name)
        {
            return new X509Name(ASN1Sequence.a(((X500Name)obj).c()));
        }
        if (obj != null)
        {
            return new X509Name(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public static X509Name a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, true));
    }

    private static void a(StringBuffer stringbuffer, Hashtable hashtable, DERObjectIdentifier derobjectidentifier, String s1)
    {
        hashtable = (String)hashtable.get(derobjectidentifier);
        int i1;
        int j1;
        int k1;
        int i2;
        if (hashtable != null)
        {
            stringbuffer.append(hashtable);
        } else
        {
            stringbuffer.append(derobjectidentifier.e());
        }
        stringbuffer.append('=');
        i2 = stringbuffer.length();
        stringbuffer.append(s1);
        k1 = stringbuffer.length();
        j1 = k1;
        i1 = i2;
        if (s1.length() >= 2)
        {
            j1 = k1;
            i1 = i2;
            if (s1.charAt(0) == '\\')
            {
                j1 = k1;
                i1 = i2;
                if (s1.charAt(1) == '#')
                {
                    i1 = i2 + 2;
                    j1 = k1;
                }
            }
        }
        int l1;
        for (; i1 != j1; j1 = l1)
        {
            int j2;
label0:
            {
                if (stringbuffer.charAt(i1) != ',' && stringbuffer.charAt(i1) != '"' && stringbuffer.charAt(i1) != '\\' && stringbuffer.charAt(i1) != '+' && stringbuffer.charAt(i1) != '=' && stringbuffer.charAt(i1) != '<' && stringbuffer.charAt(i1) != '>')
                {
                    l1 = j1;
                    j2 = i1;
                    if (stringbuffer.charAt(i1) != ';')
                    {
                        break label0;
                    }
                }
                stringbuffer.insert(i1, "\\");
                j2 = i1 + 1;
                l1 = j1 + 1;
            }
            i1 = j2 + 1;
        }

    }

    private static String b(String s1)
    {
        s1 = Strings.c(s1.trim());
        if (s1.length() > 0 && s1.charAt(0) == '#')
        {
            ASN1Object asn1object = c(s1);
            if (asn1object instanceof DERString)
            {
                return Strings.c(((DERString)asn1object).n_().trim());
            }
        }
        return s1;
    }

    private static ASN1Object c(String s1)
    {
        try
        {
            s1 = ASN1Object.a(Hex.a(s1.substring(1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalStateException((new StringBuilder("unknown encoding in name: ")).append(s1).toString());
        }
        return s1;
    }

    private static String d(String s1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s1.length() != 0)
        {
            char c1 = s1.charAt(0);
            stringbuffer.append(c1);
            int i1 = 1;
            for (char c2 = c1; i1 < s1.length(); c2 = c1)
            {
                c1 = s1.charAt(i1);
                if (c2 != ' ' || c1 != ' ')
                {
                    stringbuffer.append(c1);
                }
                i1++;
            }

        }
        return stringbuffer.toString();
    }

    public final Vector a(DERObjectIdentifier derobjectidentifier)
    {
        Vector vector = new Vector();
        int i1 = 0;
        while (i1 != U.size()) 
        {
            if (T.elementAt(i1).equals(derobjectidentifier))
            {
                String s1 = (String)U.elementAt(i1);
                if (s1.length() > 2 && s1.charAt(0) == '\\' && s1.charAt(1) == '#')
                {
                    vector.addElement(s1.substring(1));
                } else
                {
                    vector.addElement(s1);
                }
            }
            i1++;
        }
        return vector;
    }

    public final DERObject d()
    {
        if (W == null)
        {
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            DERObjectIdentifier derobjectidentifier = null;
            int i1 = 0;
            while (i1 != T.size()) 
            {
                ASN1EncodableVector asn1encodablevector2 = new ASN1EncodableVector();
                DERObjectIdentifier derobjectidentifier1 = (DERObjectIdentifier)T.elementAt(i1);
                asn1encodablevector2.a(derobjectidentifier1);
                String s1 = (String)U.elementAt(i1);
                asn1encodablevector2.a(S.a(derobjectidentifier1, s1));
                if (derobjectidentifier == null || ((Boolean)V.elementAt(i1)).booleanValue())
                {
                    asn1encodablevector.a(new DERSequence(asn1encodablevector2));
                } else
                {
                    asn1encodablevector1.a(new DERSet(asn1encodablevector));
                    asn1encodablevector = new ASN1EncodableVector();
                    asn1encodablevector.a(new DERSequence(asn1encodablevector2));
                }
                i1++;
                derobjectidentifier = derobjectidentifier1;
            }
            asn1encodablevector1.a(new DERSet(asn1encodablevector));
            W = new DERSequence(asn1encodablevector1);
        }
        return W;
    }

    public boolean equals(Object obj)
    {
        int i1;
        byte byte0;
        int k1;
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof X509Name) && !(obj instanceof ASN1Sequence))
        {
            return false;
        }
        DERObject derobject = ((DEREncodable)obj).c();
        if (c().equals(derobject))
        {
            return true;
        }
        int l1;
        try
        {
            obj = a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        l1 = T.size();
        if (l1 != ((X509Name) (obj)).T.size())
        {
            return false;
        }
        boolean aflag[] = new boolean[l1];
        DERObjectIdentifier derobjectidentifier;
        String s1;
        String s2;
        String s3;
        int j1;
        if (T.elementAt(0).equals(((X509Name) (obj)).T.elementAt(0)))
        {
            byte0 = 1;
            j1 = l1;
            i1 = 0;
        } else
        {
            byte0 = -1;
            j1 = -1;
            i1 = l1 - 1;
        }
        if (i1 != j1)
        {
            derobjectidentifier = (DERObjectIdentifier)T.elementAt(i1);
            s1 = (String)U.elementAt(i1);
            k1 = 0;
            do
            {
                if (k1 >= l1)
                {
                    break MISSING_BLOCK_LABEL_303;
                }
                if (!aflag[k1] && derobjectidentifier.equals((DERObjectIdentifier)((X509Name) (obj)).T.elementAt(k1)))
                {
label0:
                    {
                        s3 = (String)((X509Name) (obj)).U.elementAt(k1);
                        s2 = b(s1);
                        s3 = b(s3);
                        boolean flag;
                        if (!s2.equals(s3) && !d(s2).equals(d(s3)))
                        {
                            flag = false;
                        } else
                        {
                            flag = true;
                        }
                        if (flag)
                        {
                            aflag[k1] = true;
                            k1 = 1;
                            break label0;
                        }
                    }
                }
                k1++;
            } while (true);
        } else
        {
            return true;
        }
        k1 = 0;
        if (k1 == 0)
        {
            return false;
        }
        i1 += byte0;
        break MISSING_BLOCK_LABEL_114;
    }

    public int hashCode()
    {
        if (X)
        {
            return Y;
        }
        X = true;
        for (int i1 = 0; i1 != T.size(); i1++)
        {
            String s1 = d(b((String)U.elementAt(i1)));
            Y = Y ^ T.elementAt(i1).hashCode();
            int j1 = Y;
            Y = s1.hashCode() ^ j1;
        }

        return Y;
    }

    public String toString()
    {
        boolean flag2 = J;
        Hashtable hashtable = K;
        StringBuffer stringbuffer1 = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringbuffer = null;
        int i1 = 0;
        while (i1 < T.size()) 
        {
            if (((Boolean)V.elementAt(i1)).booleanValue())
            {
                stringbuffer.append('+');
                a(stringbuffer, hashtable, (DERObjectIdentifier)T.elementAt(i1), (String)U.elementAt(i1));
            } else
            {
                stringbuffer = new StringBuffer();
                a(stringbuffer, hashtable, (DERObjectIdentifier)T.elementAt(i1), (String)U.elementAt(i1));
                vector.addElement(stringbuffer);
            }
            i1++;
        }
        if (flag2)
        {
            int j1 = vector.size() - 1;
            boolean flag = true;
            while (j1 >= 0) 
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuffer1.append(',');
                }
                stringbuffer1.append(vector.elementAt(j1).toString());
                j1--;
            }
        } else
        {
            int k1 = 0;
            boolean flag1 = true;
            while (k1 < vector.size()) 
            {
                if (flag1)
                {
                    flag1 = false;
                } else
                {
                    stringbuffer1.append(',');
                }
                stringbuffer1.append(vector.elementAt(k1).toString());
                k1++;
            }
        }
        return stringbuffer1.toString();
    }

    static 
    {
        a = new DERObjectIdentifier("2.5.4.6");
        b = new DERObjectIdentifier("2.5.4.10");
        c = new DERObjectIdentifier("2.5.4.11");
        d = new DERObjectIdentifier("2.5.4.12");
        e = new DERObjectIdentifier("2.5.4.3");
        f = new DERObjectIdentifier("2.5.4.5");
        g = new DERObjectIdentifier("2.5.4.9");
        h = f;
        i = new DERObjectIdentifier("2.5.4.7");
        j = new DERObjectIdentifier("2.5.4.8");
        k = new DERObjectIdentifier("2.5.4.4");
        l = new DERObjectIdentifier("2.5.4.42");
        m = new DERObjectIdentifier("2.5.4.43");
        n = new DERObjectIdentifier("2.5.4.44");
        o = new DERObjectIdentifier("2.5.4.45");
        p = new DERObjectIdentifier("2.5.4.15");
        q = new DERObjectIdentifier("2.5.4.17");
        r = new DERObjectIdentifier("2.5.4.46");
        s = new DERObjectIdentifier("2.5.4.65");
        t = new DERObjectIdentifier("1.3.6.1.5.5.7.9.1");
        u = new DERObjectIdentifier("1.3.6.1.5.5.7.9.2");
        v = new DERObjectIdentifier("1.3.6.1.5.5.7.9.3");
        w = new DERObjectIdentifier("1.3.6.1.5.5.7.9.4");
        x = new DERObjectIdentifier("1.3.6.1.5.5.7.9.5");
        y = new DERObjectIdentifier("1.3.36.8.3.14");
        z = new DERObjectIdentifier("2.5.4.16");
        B = X509ObjectIdentifiers.g;
        C = X509ObjectIdentifiers.c_;
        D = PKCSObjectIdentifiers.T;
        E = PKCSObjectIdentifiers.U;
        F = PKCSObjectIdentifiers.aa;
        G = D;
        H = new DERObjectIdentifier("0.9.2342.19200300.100.1.25");
        I = new DERObjectIdentifier("0.9.2342.19200300.100.1.1");
        K = new Hashtable();
        L = new Hashtable();
        M = new Hashtable();
        N = new Hashtable();
        O = K;
        P = N;
        K.put(a, "C");
        K.put(b, "O");
        K.put(d, "T");
        K.put(c, "OU");
        K.put(e, "CN");
        K.put(i, "L");
        K.put(j, "ST");
        K.put(f, "SERIALNUMBER");
        K.put(D, "E");
        K.put(H, "DC");
        K.put(I, "UID");
        K.put(g, "STREET");
        K.put(k, "SURNAME");
        K.put(l, "GIVENNAME");
        K.put(m, "INITIALS");
        K.put(n, "GENERATION");
        K.put(F, "unstructuredAddress");
        K.put(E, "unstructuredName");
        K.put(o, "UniqueIdentifier");
        K.put(r, "DN");
        K.put(s, "Pseudonym");
        K.put(z, "PostalAddress");
        K.put(y, "NameAtBirth");
        K.put(w, "CountryOfCitizenship");
        K.put(x, "CountryOfResidence");
        K.put(v, "Gender");
        K.put(u, "PlaceOfBirth");
        K.put(t, "DateOfBirth");
        K.put(q, "PostalCode");
        K.put(p, "BusinessCategory");
        K.put(B, "TelephoneNumber");
        K.put(C, "Name");
        L.put(a, "C");
        L.put(b, "O");
        L.put(c, "OU");
        L.put(e, "CN");
        L.put(i, "L");
        L.put(j, "ST");
        L.put(g, "STREET");
        L.put(H, "DC");
        L.put(I, "UID");
        M.put(a, "C");
        M.put(b, "O");
        M.put(c, "OU");
        M.put(e, "CN");
        M.put(i, "L");
        M.put(j, "ST");
        M.put(g, "STREET");
        N.put("c", a);
        N.put("o", b);
        N.put("t", d);
        N.put("ou", c);
        N.put("cn", e);
        N.put("l", i);
        N.put("st", j);
        N.put("sn", f);
        N.put("serialnumber", f);
        N.put("street", g);
        N.put("emailaddress", G);
        N.put("dc", H);
        N.put("e", G);
        N.put("uid", I);
        N.put("surname", k);
        N.put("givenname", l);
        N.put("initials", m);
        N.put("generation", n);
        N.put("unstructuredaddress", F);
        N.put("unstructuredname", E);
        N.put("uniqueidentifier", o);
        N.put("dn", r);
        N.put("pseudonym", s);
        N.put("postaladdress", z);
        N.put("nameofbirth", y);
        N.put("countryofcitizenship", w);
        N.put("countryofresidence", x);
        N.put("gender", v);
        N.put("placeofbirth", u);
        N.put("dateofbirth", t);
        N.put("postalcode", q);
        N.put("businesscategory", p);
        N.put("telephonenumber", B);
        N.put("name", C);
    }
}
