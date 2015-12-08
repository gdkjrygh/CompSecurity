// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ks, pj, ko

public final class pi extends ks
    implements Person
{

    public static final pj CREATOR = new pj();
    private static final HashMap aom;
    String CE;
    final int CK;
    String FR;
    String OS;
    final Set aon;
    int apA;
    String apB;
    List apC;
    boolean apD;
    String apl;
    a apm;
    String apn;
    String apo;
    int app;
    b apq;
    String apr;
    c aps;
    boolean apt;
    d apu;
    String apv;
    int apw;
    List apx;
    List apy;
    int apz;
    int ow;
    String vf;

    public pi()
    {
        CK = 1;
        aon = new HashSet();
    }

    public pi(String s, String s1, c c, int j, String s2)
    {
        CK = 1;
        aon = new HashSet();
        OS = s;
        aon.add(Integer.valueOf(9));
        CE = s1;
        aon.add(Integer.valueOf(14));
        aps = c;
        aon.add(Integer.valueOf(15));
        apw = j;
        aon.add(Integer.valueOf(21));
        vf = s2;
        aon.add(Integer.valueOf(27));
    }

    pi(Set set, int j, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c, boolean flag, 
            String s6, d d, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        aon = set;
        CK = j;
        apl = s;
        apm = a1;
        apn = s1;
        apo = s2;
        app = k;
        apq = b1;
        apr = s3;
        OS = s4;
        ow = l;
        CE = s5;
        aps = c;
        apt = flag;
        FR = s6;
        apu = d;
        apv = s7;
        apw = i1;
        apx = list;
        apy = list1;
        apz = j1;
        apA = k1;
        apB = s8;
        vf = s9;
        apC = list2;
        apD = flag1;
    }

    public static pi i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.dz(parcel);
        parcel.recycle();
        return abyte0;
    }

    protected final boolean a(kr.a a1)
    {
        return aon.contains(Integer.valueOf(a1.hR()));
    }

    protected final Object b(kr.a a1)
    {
        switch (a1.hR())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.hR()).toString());

        case 2: // '\002'
            return apl;

        case 3: // '\003'
            return apm;

        case 4: // '\004'
            return apn;

        case 5: // '\005'
            return apo;

        case 6: // '\006'
            return Integer.valueOf(app);

        case 7: // '\007'
            return apq;

        case 8: // '\b'
            return apr;

        case 9: // '\t'
            return OS;

        case 12: // '\f'
            return Integer.valueOf(ow);

        case 14: // '\016'
            return CE;

        case 15: // '\017'
            return aps;

        case 16: // '\020'
            return Boolean.valueOf(apt);

        case 18: // '\022'
            return FR;

        case 19: // '\023'
            return apu;

        case 20: // '\024'
            return apv;

        case 21: // '\025'
            return Integer.valueOf(apw);

        case 22: // '\026'
            return apx;

        case 23: // '\027'
            return apy;

        case 24: // '\030'
            return Integer.valueOf(apz);

        case 25: // '\031'
            return Integer.valueOf(apA);

        case 26: // '\032'
            return apB;

        case 27: // '\033'
            return vf;

        case 28: // '\034'
            return apC;

        case 29: // '\035'
            return Boolean.valueOf(apD);
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
            if (!(obj instanceof pi))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (pi)obj;
            kr.a a1;
label1:
            do
            {
                for (Iterator iterator = aom.values().iterator(); iterator.hasNext();)
                {
                    a1 = (kr.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((pi) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((pi) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((pi) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public final Object freeze()
    {
        return oL();
    }

    public final String getAboutMe()
    {
        return apl;
    }

    public final com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return apm;
    }

    public final String getBirthday()
    {
        return apn;
    }

    public final String getBraggingRights()
    {
        return apo;
    }

    public final int getCircledByCount()
    {
        return app;
    }

    public final com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return apq;
    }

    public final String getCurrentLocation()
    {
        return apr;
    }

    public final String getDisplayName()
    {
        return OS;
    }

    public final int getGender()
    {
        return ow;
    }

    public final String getId()
    {
        return CE;
    }

    public final com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return aps;
    }

    public final String getLanguage()
    {
        return FR;
    }

    public final com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return apu;
    }

    public final String getNickname()
    {
        return apv;
    }

    public final int getObjectType()
    {
        return apw;
    }

    public final List getOrganizations()
    {
        return (ArrayList)apx;
    }

    public final List getPlacesLived()
    {
        return (ArrayList)apy;
    }

    public final int getPlusOneCount()
    {
        return apz;
    }

    public final int getRelationshipStatus()
    {
        return apA;
    }

    public final String getTagline()
    {
        return apB;
    }

    public final String getUrl()
    {
        return vf;
    }

    public final List getUrls()
    {
        return (ArrayList)apC;
    }

    public final HashMap hK()
    {
        return aom;
    }

    public final boolean hasAboutMe()
    {
        return aon.contains(Integer.valueOf(2));
    }

    public final boolean hasAgeRange()
    {
        return aon.contains(Integer.valueOf(3));
    }

    public final boolean hasBirthday()
    {
        return aon.contains(Integer.valueOf(4));
    }

    public final boolean hasBraggingRights()
    {
        return aon.contains(Integer.valueOf(5));
    }

    public final boolean hasCircledByCount()
    {
        return aon.contains(Integer.valueOf(6));
    }

    public final boolean hasCover()
    {
        return aon.contains(Integer.valueOf(7));
    }

    public final boolean hasCurrentLocation()
    {
        return aon.contains(Integer.valueOf(8));
    }

    public final boolean hasDisplayName()
    {
        return aon.contains(Integer.valueOf(9));
    }

    public final boolean hasGender()
    {
        return aon.contains(Integer.valueOf(12));
    }

    public final boolean hasId()
    {
        return aon.contains(Integer.valueOf(14));
    }

    public final boolean hasImage()
    {
        return aon.contains(Integer.valueOf(15));
    }

    public final boolean hasIsPlusUser()
    {
        return aon.contains(Integer.valueOf(16));
    }

    public final boolean hasLanguage()
    {
        return aon.contains(Integer.valueOf(18));
    }

    public final boolean hasName()
    {
        return aon.contains(Integer.valueOf(19));
    }

    public final boolean hasNickname()
    {
        return aon.contains(Integer.valueOf(20));
    }

    public final boolean hasObjectType()
    {
        return aon.contains(Integer.valueOf(21));
    }

    public final boolean hasOrganizations()
    {
        return aon.contains(Integer.valueOf(22));
    }

    public final boolean hasPlacesLived()
    {
        return aon.contains(Integer.valueOf(23));
    }

    public final boolean hasPlusOneCount()
    {
        return aon.contains(Integer.valueOf(24));
    }

    public final boolean hasRelationshipStatus()
    {
        return aon.contains(Integer.valueOf(25));
    }

    public final boolean hasTagline()
    {
        return aon.contains(Integer.valueOf(26));
    }

    public final boolean hasUrl()
    {
        return aon.contains(Integer.valueOf(27));
    }

    public final boolean hasUrls()
    {
        return aon.contains(Integer.valueOf(28));
    }

    public final boolean hasVerified()
    {
        return aon.contains(Integer.valueOf(29));
    }

    public final int hashCode()
    {
        Iterator iterator = aom.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kr.a a1 = (kr.a)iterator.next();
            if (a(a1))
            {
                int k = a1.hR();
                j = b(a1).hashCode() + (j + k);
            }
        } while (true);
        return j;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isPlusUser()
    {
        return apt;
    }

    public final boolean isVerified()
    {
        return apD;
    }

    public final pi oL()
    {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        pj.a(this, parcel, j);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        aom = hashmap;
        hashmap.put("aboutMe", kr.a.l("aboutMe", 2));
        aom.put("ageRange", kr.a.a("ageRange", 3, com/google/android/gms/internal/pi$a));
        aom.put("birthday", kr.a.l("birthday", 4));
        aom.put("braggingRights", kr.a.l("braggingRights", 5));
        aom.put("circledByCount", kr.a.i("circledByCount", 6));
        aom.put("cover", kr.a.a("cover", 7, com/google/android/gms/internal/pi$b));
        aom.put("currentLocation", kr.a.l("currentLocation", 8));
        aom.put("displayName", kr.a.l("displayName", 9));
        aom.put("gender", kr.a.a("gender", 12, (new ko()).h("male", 0).h("female", 1).h("other", 2), false));
        aom.put("id", kr.a.l("id", 14));
        aom.put("image", kr.a.a("image", 15, com/google/android/gms/internal/pi$c));
        aom.put("isPlusUser", kr.a.k("isPlusUser", 16));
        aom.put("language", kr.a.l("language", 18));
        aom.put("name", kr.a.a("name", 19, com/google/android/gms/internal/pi$d));
        aom.put("nickname", kr.a.l("nickname", 20));
        aom.put("objectType", kr.a.a("objectType", 21, (new ko()).h("person", 0).h("page", 1), false));
        aom.put("organizations", kr.a.b("organizations", 22, com/google/android/gms/internal/pi$f));
        aom.put("placesLived", kr.a.b("placesLived", 23, com/google/android/gms/internal/pi$g));
        aom.put("plusOneCount", kr.a.i("plusOneCount", 24));
        aom.put("relationshipStatus", kr.a.a("relationshipStatus", 25, (new ko()).h("single", 0).h("in_a_relationship", 1).h("engaged", 2).h("married", 3).h("its_complicated", 4).h("open_relationship", 5).h("widowed", 6).h("in_domestic_partnership", 7).h("in_civil_union", 8), false));
        aom.put("tagline", kr.a.l("tagline", 26));
        aom.put("url", kr.a.l("url", 27));
        aom.put("urls", kr.a.b("urls", 28, com/google/android/gms/internal/pi$h));
        aom.put("verified", kr.a.k("verified", 29));
    }
}
