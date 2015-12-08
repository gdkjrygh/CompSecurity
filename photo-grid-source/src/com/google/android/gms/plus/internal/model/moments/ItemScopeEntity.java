// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            a

public final class ItemScopeEntity extends FastSafeParcelableJsonResponse
{

    public static final a CREATOR = new a();
    private static final HashMap ae;
    String A;
    String B;
    String C;
    ItemScopeEntity D;
    String E;
    String F;
    String G;
    String H;
    ItemScopeEntity I;
    double J;
    ItemScopeEntity K;
    double L;
    String M;
    ItemScopeEntity N;
    List O;
    String P;
    String Q;
    String R;
    String S;
    ItemScopeEntity T;
    String U;
    String V;
    String W;
    ItemScopeEntity X;
    String Y;
    String Z;
    final Set a;
    String aa;
    String ab;
    String ac;
    String ad;
    final int b;
    ItemScopeEntity c;
    List d;
    ItemScopeEntity e;
    String f;
    String g;
    String h;
    List i;
    int j;
    List k;
    ItemScopeEntity l;
    List m;
    String n;
    String o;
    ItemScopeEntity p;
    String q;
    String r;
    String s;
    List t;
    String u;
    String v;
    String w;
    String x;
    String y;
    String z;

    public ItemScopeEntity()
    {
        b = 1;
        a = new HashSet();
    }

    ItemScopeEntity(Set set, int i1, ItemScopeEntity itemscopeentity, List list, ItemScopeEntity itemscopeentity1, String s1, String s2, 
            String s3, List list1, int j1, List list2, ItemScopeEntity itemscopeentity2, List list3, String s4, 
            String s5, ItemScopeEntity itemscopeentity3, String s6, String s7, String s8, List list4, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            String s17, ItemScopeEntity itemscopeentity4, String s18, String s19, String s20, String s21, ItemScopeEntity itemscopeentity5, 
            double d1, ItemScopeEntity itemscopeentity6, double d2, String s22, ItemScopeEntity itemscopeentity7, 
            List list5, String s23, String s24, String s25, String s26, ItemScopeEntity itemscopeentity8, String s27, 
            String s28, String s29, ItemScopeEntity itemscopeentity9, String s30, String s31, String s32, String s33, 
            String s34, String s35)
    {
        a = set;
        b = i1;
        c = itemscopeentity;
        d = list;
        e = itemscopeentity1;
        f = s1;
        g = s2;
        h = s3;
        i = list1;
        j = j1;
        k = list2;
        l = itemscopeentity2;
        m = list3;
        n = s4;
        o = s5;
        p = itemscopeentity3;
        q = s6;
        r = s7;
        s = s8;
        t = list4;
        u = s9;
        v = s10;
        w = s11;
        x = s12;
        y = s13;
        z = s14;
        A = s15;
        B = s16;
        C = s17;
        D = itemscopeentity4;
        E = s18;
        F = s19;
        G = s20;
        H = s21;
        I = itemscopeentity5;
        J = d1;
        K = itemscopeentity6;
        L = d2;
        M = s22;
        N = itemscopeentity7;
        O = list5;
        P = s23;
        Q = s24;
        R = s25;
        S = s26;
        T = itemscopeentity8;
        U = s27;
        V = s28;
        W = s29;
        X = itemscopeentity9;
        Y = s30;
        Z = s31;
        aa = s32;
        ab = s33;
        ac = s34;
        ad = s35;
    }

    public final Map a()
    {
        return ae;
    }

    protected final boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return a.contains(Integer.valueOf(field.g()));
    }

    protected final Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.g())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.g()).toString());

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return f;

        case 6: // '\006'
            return g;

        case 7: // '\007'
            return h;

        case 8: // '\b'
            return i;

        case 9: // '\t'
            return Integer.valueOf(j);

        case 10: // '\n'
            return k;

        case 11: // '\013'
            return l;

        case 12: // '\f'
            return m;

        case 13: // '\r'
            return n;

        case 14: // '\016'
            return o;

        case 15: // '\017'
            return p;

        case 16: // '\020'
            return q;

        case 17: // '\021'
            return r;

        case 18: // '\022'
            return s;

        case 19: // '\023'
            return t;

        case 20: // '\024'
            return u;

        case 21: // '\025'
            return v;

        case 22: // '\026'
            return w;

        case 23: // '\027'
            return x;

        case 24: // '\030'
            return y;

        case 25: // '\031'
            return z;

        case 26: // '\032'
            return A;

        case 27: // '\033'
            return B;

        case 28: // '\034'
            return C;

        case 29: // '\035'
            return D;

        case 30: // '\036'
            return E;

        case 31: // '\037'
            return F;

        case 32: // ' '
            return G;

        case 33: // '!'
            return H;

        case 34: // '"'
            return I;

        case 36: // '$'
            return Double.valueOf(J);

        case 37: // '%'
            return K;

        case 38: // '&'
            return Double.valueOf(L);

        case 39: // '\''
            return M;

        case 40: // '('
            return N;

        case 41: // ')'
            return O;

        case 42: // '*'
            return P;

        case 43: // '+'
            return Q;

        case 44: // ','
            return R;

        case 45: // '-'
            return S;

        case 46: // '.'
            return T;

        case 47: // '/'
            return U;

        case 48: // '0'
            return V;

        case 49: // '1'
            return W;

        case 50: // '2'
            return X;

        case 51: // '3'
            return Y;

        case 52: // '4'
            return Z;

        case 53: // '5'
            return aa;

        case 54: // '6'
            return ab;

        case 55: // '7'
            return ac;

        case 56: // '8'
            return ad;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof ItemScopeEntity))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ItemScopeEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for (Iterator iterator = ae.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if (!a(field))
                    {
                        continue label1;
                    }
                    if (((ItemScopeEntity) (obj)).a(field))
                    {
                        if (!b(field).equals(((ItemScopeEntity) (obj)).b(field)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ItemScopeEntity) (obj)).a(field));
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        Iterator iterator = ae.values().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (a(field))
            {
                int j1 = field.g();
                i1 = b(field).hashCode() + (i1 + j1);
            }
        } while (true);
        return i1;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.plus.internal.model.moments.a.a(this, parcel, i1);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        ae = hashmap;
        hashmap.put("about", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("about", 2, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("additionalName", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("additionalName"));
        ae.put("address", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("address", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("addressCountry", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("addressCountry", 5));
        ae.put("addressLocality", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("addressLocality", 6));
        ae.put("addressRegion", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("addressRegion", 7));
        ae.put("associated_media", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("associated_media", 8, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("attendeeCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("attendeeCount", 9));
        ae.put("attendees", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("attendees", 10, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("audio", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("audio", 11, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("author", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("author", 12, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("bestRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("bestRating", 13));
        ae.put("birthDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("birthDate", 14));
        ae.put("byArtist", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("byArtist", 15, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("caption", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("caption", 16));
        ae.put("contentSize", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("contentSize", 17));
        ae.put("contentUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("contentUrl", 18));
        ae.put("contributor", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("contributor", 19, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("dateCreated", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("dateCreated", 20));
        ae.put("dateModified", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("dateModified", 21));
        ae.put("datePublished", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("datePublished", 22));
        ae.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("description", 23));
        ae.put("duration", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("duration", 24));
        ae.put("embedUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("embedUrl", 25));
        ae.put("endDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("endDate", 26));
        ae.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("familyName", 27));
        ae.put("gender", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("gender", 28));
        ae.put("geo", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("geo", 29, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("givenName", 30));
        ae.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("height", 31));
        ae.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("id", 32));
        ae.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("image", 33));
        ae.put("inAlbum", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("inAlbum", 34, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("latitude", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("latitude", 36));
        ae.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("location", 37, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("longitude", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("longitude", 38));
        ae.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("name", 39));
        ae.put("partOfTVSeries", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("partOfTVSeries", 40, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("performers", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("performers", 41, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("playerType", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("playerType", 42));
        ae.put("postOfficeBoxNumber", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("postOfficeBoxNumber", 43));
        ae.put("postalCode", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("postalCode", 44));
        ae.put("ratingValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("ratingValue", 45));
        ae.put("reviewRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("reviewRating", 46, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("startDate", 47));
        ae.put("streetAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("streetAddress", 48));
        ae.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("text", 49));
        ae.put("thumbnail", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("thumbnail", 50, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        ae.put("thumbnailUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("thumbnailUrl", 51));
        ae.put("tickerSymbol", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("tickerSymbol", 52));
        ae.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("type", 53));
        ae.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("url", 54));
        ae.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("width", 55));
        ae.put("worstRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("worstRating", 56));
    }
}
