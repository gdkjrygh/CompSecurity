// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fb, jo

public final class im extends fb
    implements SafeParcelable, a
{

    public static final jo a = new jo();
    private static final HashMap b;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private im F;
    private String G;
    private String H;
    private String I;
    private String J;
    private im K;
    private double L;
    private im M;
    private double N;
    private String O;
    private im P;
    private List Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private im V;
    private String W;
    private String X;
    private String Y;
    private im Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private final Set c;
    private final int d;
    private im e;
    private List f;
    private im g;
    private String h;
    private String i;
    private String j;
    private List k;
    private int l;
    private List m;
    private im n;
    private List o;
    private String p;
    private String q;
    private im r;
    private String s;
    private String t;
    private String u;
    private List v;
    private String w;
    private String x;
    private String y;
    private String z;

    public im()
    {
        d = 1;
        c = new HashSet();
    }

    im(Set set, int i1, im im1, List list, im im2, String s1, String s2, 
            String s3, List list1, int j1, List list2, im im3, List list3, String s4, 
            String s5, im im4, String s6, String s7, String s8, List list4, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            String s17, im im5, String s18, String s19, String s20, String s21, im im6, 
            double d1, im im7, double d2, String s22, im im8, 
            List list5, String s23, String s24, String s25, String s26, im im9, String s27, 
            String s28, String s29, im im10, String s30, String s31, String s32, String s33, 
            String s34, String s35)
    {
        c = set;
        d = i1;
        e = im1;
        f = list;
        g = im2;
        h = s1;
        i = s2;
        j = s3;
        k = list1;
        l = j1;
        m = list2;
        n = im3;
        o = list3;
        p = s4;
        q = s5;
        r = im4;
        s = s6;
        t = s7;
        u = s8;
        v = list4;
        w = s9;
        x = s10;
        y = s11;
        z = s12;
        A = s13;
        B = s14;
        C = s15;
        D = s16;
        E = s17;
        F = im5;
        G = s18;
        H = s19;
        I = s20;
        J = s21;
        K = im6;
        L = d1;
        M = im7;
        N = d2;
        O = s22;
        P = im8;
        Q = list5;
        R = s23;
        S = s24;
        T = s25;
        U = s26;
        V = im9;
        W = s27;
        X = s28;
        Y = s29;
        Z = im10;
        aa = s30;
        ab = s31;
        ac = s32;
        ad = s33;
        ae = s34;
        af = s35;
    }

    public final String A()
    {
        return y;
    }

    public final String B()
    {
        return z;
    }

    public final String C()
    {
        return A;
    }

    public final String D()
    {
        return B;
    }

    public final String E()
    {
        return C;
    }

    public final String F()
    {
        return D;
    }

    public final String G()
    {
        return E;
    }

    final im H()
    {
        return F;
    }

    public final String I()
    {
        return G;
    }

    public final String J()
    {
        return H;
    }

    public final String K()
    {
        return I;
    }

    public final String L()
    {
        return J;
    }

    final im M()
    {
        return K;
    }

    public final double N()
    {
        return L;
    }

    final im O()
    {
        return M;
    }

    public final double P()
    {
        return N;
    }

    public final String Q()
    {
        return O;
    }

    final im R()
    {
        return P;
    }

    final List S()
    {
        return Q;
    }

    public final String T()
    {
        return R;
    }

    public final String U()
    {
        return S;
    }

    public final String V()
    {
        return T;
    }

    public final String W()
    {
        return U;
    }

    final im X()
    {
        return V;
    }

    public final String Y()
    {
        return W;
    }

    public final String Z()
    {
        return X;
    }

    public final Object a()
    {
        return this;
    }

    protected final boolean a(fb.a a1)
    {
        return c.contains(Integer.valueOf(a1.g()));
    }

    public final String aa()
    {
        return Y;
    }

    final im ab()
    {
        return Z;
    }

    public final String ac()
    {
        return aa;
    }

    public final String ad()
    {
        return ab;
    }

    public final String ae()
    {
        return ac;
    }

    public final String af()
    {
        return ad;
    }

    public final String ag()
    {
        return ae;
    }

    public final String ah()
    {
        return af;
    }

    protected final Object b(fb.a a1)
    {
        switch (a1.g())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.g()).toString());

        case 2: // '\002'
            return e;

        case 3: // '\003'
            return f;

        case 4: // '\004'
            return g;

        case 5: // '\005'
            return h;

        case 6: // '\006'
            return i;

        case 7: // '\007'
            return j;

        case 8: // '\b'
            return k;

        case 9: // '\t'
            return Integer.valueOf(l);

        case 10: // '\n'
            return m;

        case 11: // '\013'
            return n;

        case 12: // '\f'
            return o;

        case 13: // '\r'
            return p;

        case 14: // '\016'
            return q;

        case 15: // '\017'
            return r;

        case 16: // '\020'
            return s;

        case 17: // '\021'
            return t;

        case 18: // '\022'
            return u;

        case 19: // '\023'
            return v;

        case 20: // '\024'
            return w;

        case 21: // '\025'
            return x;

        case 22: // '\026'
            return y;

        case 23: // '\027'
            return z;

        case 24: // '\030'
            return A;

        case 25: // '\031'
            return B;

        case 26: // '\032'
            return C;

        case 27: // '\033'
            return D;

        case 28: // '\034'
            return E;

        case 29: // '\035'
            return F;

        case 30: // '\036'
            return G;

        case 31: // '\037'
            return H;

        case 32: // ' '
            return I;

        case 33: // '!'
            return J;

        case 34: // '"'
            return K;

        case 36: // '$'
            return Double.valueOf(L);

        case 37: // '%'
            return M;

        case 38: // '&'
            return Double.valueOf(N);

        case 39: // '\''
            return O;

        case 40: // '('
            return P;

        case 41: // ')'
            return Q;

        case 42: // '*'
            return R;

        case 43: // '+'
            return S;

        case 44: // ','
            return T;

        case 45: // '-'
            return U;

        case 46: // '.'
            return V;

        case 47: // '/'
            return W;

        case 48: // '0'
            return X;

        case 49: // '1'
            return Y;

        case 50: // '2'
            return Z;

        case 51: // '3'
            return aa;

        case 52: // '4'
            return ab;

        case 53: // '5'
            return ac;

        case 54: // '6'
            return ad;

        case 55: // '7'
            return ae;

        case 56: // '8'
            return af;
        }
    }

    public final HashMap b()
    {
        return b;
    }

    protected final Object c()
    {
        return null;
    }

    protected final boolean d()
    {
        return false;
    }

    public final int describeContents()
    {
        jo jo1 = a;
        return 0;
    }

    final Set e()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof im))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (im)obj;
            fb.a a1;
label1:
            do
            {
                for (Iterator iterator = b.values().iterator(); iterator.hasNext();)
                {
                    a1 = (fb.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((im) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((im) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((im) (obj)).a(a1));
            return false;
        }
        return true;
    }

    final int f()
    {
        return d;
    }

    final im g()
    {
        return e;
    }

    public final List h()
    {
        return f;
    }

    public final int hashCode()
    {
        Iterator iterator = b.values().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fb.a a1 = (fb.a)iterator.next();
            if (a(a1))
            {
                int j1 = a1.g();
                i1 = b(a1).hashCode() + (i1 + j1);
            }
        } while (true);
        return i1;
    }

    final im i()
    {
        return g;
    }

    public final String j()
    {
        return h;
    }

    public final String k()
    {
        return i;
    }

    public final String l()
    {
        return j;
    }

    final List m()
    {
        return k;
    }

    public final int n()
    {
        return l;
    }

    final List o()
    {
        return m;
    }

    final im p()
    {
        return n;
    }

    final List q()
    {
        return o;
    }

    public final String r()
    {
        return p;
    }

    public final String s()
    {
        return q;
    }

    final im t()
    {
        return r;
    }

    public final String u()
    {
        return s;
    }

    public final String v()
    {
        return t;
    }

    public final String w()
    {
        return u;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        jo jo1 = a;
        com.google.android.gms.internal.jo.a(this, parcel, i1);
    }

    final List x()
    {
        return v;
    }

    public final String y()
    {
        return w;
    }

    public final String z()
    {
        return x;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("about", com.google.android.gms.internal.fb.a.a("about", 2, com/google/android/gms/internal/im));
        b.put("additionalName", com.google.android.gms.internal.fb.a.a("additionalName"));
        b.put("address", com.google.android.gms.internal.fb.a.a("address", 4, com/google/android/gms/internal/im));
        b.put("addressCountry", fb.a.d("addressCountry", 5));
        b.put("addressLocality", fb.a.d("addressLocality", 6));
        b.put("addressRegion", fb.a.d("addressRegion", 7));
        b.put("associated_media", fb.a.b("associated_media", 8, com/google/android/gms/internal/im));
        b.put("attendeeCount", com.google.android.gms.internal.fb.a.a("attendeeCount", 9));
        b.put("attendees", fb.a.b("attendees", 10, com/google/android/gms/internal/im));
        b.put("audio", com.google.android.gms.internal.fb.a.a("audio", 11, com/google/android/gms/internal/im));
        b.put("author", fb.a.b("author", 12, com/google/android/gms/internal/im));
        b.put("bestRating", fb.a.d("bestRating", 13));
        b.put("birthDate", fb.a.d("birthDate", 14));
        b.put("byArtist", com.google.android.gms.internal.fb.a.a("byArtist", 15, com/google/android/gms/internal/im));
        b.put("caption", fb.a.d("caption", 16));
        b.put("contentSize", fb.a.d("contentSize", 17));
        b.put("contentUrl", fb.a.d("contentUrl", 18));
        b.put("contributor", fb.a.b("contributor", 19, com/google/android/gms/internal/im));
        b.put("dateCreated", fb.a.d("dateCreated", 20));
        b.put("dateModified", fb.a.d("dateModified", 21));
        b.put("datePublished", fb.a.d("datePublished", 22));
        b.put("description", fb.a.d("description", 23));
        b.put("duration", fb.a.d("duration", 24));
        b.put("embedUrl", fb.a.d("embedUrl", 25));
        b.put("endDate", fb.a.d("endDate", 26));
        b.put("familyName", fb.a.d("familyName", 27));
        b.put("gender", fb.a.d("gender", 28));
        b.put("geo", com.google.android.gms.internal.fb.a.a("geo", 29, com/google/android/gms/internal/im));
        b.put("givenName", fb.a.d("givenName", 30));
        b.put("height", fb.a.d("height", 31));
        b.put("id", fb.a.d("id", 32));
        b.put("image", fb.a.d("image", 33));
        b.put("inAlbum", com.google.android.gms.internal.fb.a.a("inAlbum", 34, com/google/android/gms/internal/im));
        b.put("latitude", fb.a.b("latitude", 36));
        b.put("location", com.google.android.gms.internal.fb.a.a("location", 37, com/google/android/gms/internal/im));
        b.put("longitude", fb.a.b("longitude", 38));
        b.put("name", fb.a.d("name", 39));
        b.put("partOfTVSeries", com.google.android.gms.internal.fb.a.a("partOfTVSeries", 40, com/google/android/gms/internal/im));
        b.put("performers", fb.a.b("performers", 41, com/google/android/gms/internal/im));
        b.put("playerType", fb.a.d("playerType", 42));
        b.put("postOfficeBoxNumber", fb.a.d("postOfficeBoxNumber", 43));
        b.put("postalCode", fb.a.d("postalCode", 44));
        b.put("ratingValue", fb.a.d("ratingValue", 45));
        b.put("reviewRating", com.google.android.gms.internal.fb.a.a("reviewRating", 46, com/google/android/gms/internal/im));
        b.put("startDate", fb.a.d("startDate", 47));
        b.put("streetAddress", fb.a.d("streetAddress", 48));
        b.put("text", fb.a.d("text", 49));
        b.put("thumbnail", com.google.android.gms.internal.fb.a.a("thumbnail", 50, com/google/android/gms/internal/im));
        b.put("thumbnailUrl", fb.a.d("thumbnailUrl", 51));
        b.put("tickerSymbol", fb.a.d("tickerSymbol", 52));
        b.put("type", fb.a.d("type", 53));
        b.put("url", fb.a.d("url", 54));
        b.put("width", fb.a.d("width", 55));
        b.put("worstRating", fb.a.d("worstRating", 56));
    }
}
