// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            a

public final class PersonEntity extends FastSafeParcelableJsonResponse
{

    private static final HashMap A;
    public static final a CREATOR = new a();
    final Set a;
    final int b;
    String c;
    AgeRangeEntity d;
    String e;
    String f;
    int g;
    CoverEntity h;
    String i;
    String j;
    int k;
    String l;
    ImageEntity m;
    boolean n;
    String o;
    NameEntity p;
    String q;
    int r;
    List s;
    List t;
    int u;
    int v;
    String w;
    String x;
    List y;
    boolean z;

    public PersonEntity()
    {
        b = 1;
        a = new HashSet();
    }

    PersonEntity(Set set, int i1, String s1, AgeRangeEntity agerangeentity, String s2, String s3, int j1, 
            CoverEntity coverentity, String s4, String s5, int k1, String s6, ImageEntity imageentity, boolean flag, 
            String s7, NameEntity nameentity, String s8, int l1, List list, List list1, int i2, 
            int j2, String s9, String s10, List list2, boolean flag1)
    {
        a = set;
        b = i1;
        c = s1;
        d = agerangeentity;
        e = s2;
        f = s3;
        g = j1;
        h = coverentity;
        i = s4;
        j = s5;
        k = k1;
        l = s6;
        m = imageentity;
        n = flag;
        o = s7;
        p = nameentity;
        q = s8;
        r = l1;
        s = list;
        t = list1;
        u = i2;
        v = j2;
        w = s9;
        x = s10;
        y = list2;
        z = flag1;
    }

    public final Map a()
    {
        return A;
    }

    protected final boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return a.contains(Integer.valueOf(field.g()));
    }

    protected final Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.g())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
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
            return Integer.valueOf(g);

        case 7: // '\007'
            return h;

        case 8: // '\b'
            return i;

        case 9: // '\t'
            return j;

        case 12: // '\f'
            return Integer.valueOf(k);

        case 14: // '\016'
            return l;

        case 15: // '\017'
            return m;

        case 16: // '\020'
            return Boolean.valueOf(n);

        case 18: // '\022'
            return o;

        case 19: // '\023'
            return p;

        case 20: // '\024'
            return q;

        case 21: // '\025'
            return Integer.valueOf(r);

        case 22: // '\026'
            return s;

        case 23: // '\027'
            return t;

        case 24: // '\030'
            return Integer.valueOf(u);

        case 25: // '\031'
            return Integer.valueOf(v);

        case 26: // '\032'
            return w;

        case 27: // '\033'
            return x;

        case 28: // '\034'
            return y;

        case 29: // '\035'
            return Boolean.valueOf(z);
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
            if (!(obj instanceof PersonEntity))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (PersonEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for (Iterator iterator = A.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if (!a(field))
                    {
                        continue label1;
                    }
                    if (((PersonEntity) (obj)).a(field))
                    {
                        if (!b(field).equals(((PersonEntity) (obj)).b(field)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((PersonEntity) (obj)).a(field));
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        Iterator iterator = A.values().iterator();
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
        com.google.android.gms.plus.internal.model.people.a.a(this, parcel, i1);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        A = hashmap;
        hashmap.put("aboutMe", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("aboutMe", 2));
        A.put("ageRange", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("ageRange", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity));
        A.put("birthday", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("birthday", 4));
        A.put("braggingRights", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("braggingRights", 5));
        A.put("circledByCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("circledByCount", 6));
        A.put("cover", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("cover", 7, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity));
        A.put("currentLocation", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("currentLocation", 8));
        A.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("displayName", 9));
        A.put("gender", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("gender", 12, (new StringToIntConverter()).a("male", 0).a("female", 1).a("other", 2)));
        A.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("id", 14));
        A.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("image", 15, com/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity));
        A.put("isPlusUser", com.google.android.gms.common.server.response.FastJsonResponse.Field.c("isPlusUser", 16));
        A.put("language", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("language", 18));
        A.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("name", 19, com/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity));
        A.put("nickname", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("nickname", 20));
        A.put("objectType", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("objectType", 21, (new StringToIntConverter()).a("person", 0).a("page", 1)));
        A.put("organizations", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("organizations", 22, com/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity));
        A.put("placesLived", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("placesLived", 23, com/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity));
        A.put("plusOneCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("plusOneCount", 24));
        A.put("relationshipStatus", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("relationshipStatus", 25, (new StringToIntConverter()).a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8)));
        A.put("tagline", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("tagline", 26));
        A.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("url", 27));
        A.put("urls", com.google.android.gms.common.server.response.FastJsonResponse.Field.b("urls", 28, com/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity));
        A.put("verified", com.google.android.gms.common.server.response.FastJsonResponse.Field.c("verified", 29));
    }
}
