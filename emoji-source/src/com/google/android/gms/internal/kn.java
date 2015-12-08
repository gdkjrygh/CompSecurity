// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hy, ko

public final class kn extends hy
    implements SafeParcelable, ItemScope
{

    public static final ko CREATOR = new ko();
    private static final HashMap acr;
    private String Mp;
    private double Vd;
    private double Ve;
    private int acA;
    private List acB;
    private kn acC;
    private List acD;
    private String acE;
    private String acF;
    private kn acG;
    private String acH;
    private String acI;
    private List acJ;
    private String acK;
    private String acL;
    private String acM;
    private String acN;
    private String acO;
    private String acP;
    private String acQ;
    private String acR;
    private kn acS;
    private String acT;
    private String acU;
    private String acV;
    private kn acW;
    private kn acX;
    private kn acY;
    private List acZ;
    private final Set acs;
    private kn act;
    private List acu;
    private kn acv;
    private String acw;
    private String acx;
    private String acy;
    private List acz;
    private String ada;
    private String adb;
    private String adc;
    private String add;
    private kn ade;
    private String adf;
    private String adg;
    private String adh;
    private kn adi;
    private String adj;
    private String adk;
    private String adl;
    private String adm;
    private String mName;
    private String mk;
    private String qX;
    private String qY;
    private String xG;
    private final int xM;

    public kn()
    {
        xM = 1;
        acs = new HashSet();
    }

    kn(Set set, int i, kn kn1, List list, kn kn2, String s, String s1, 
            String s2, List list1, int j, List list2, kn kn3, List list3, String s3, 
            String s4, kn kn4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, kn kn5, String s17, String s18, String s19, String s20, kn kn6, 
            double d, kn kn7, double d1, String s21, kn kn8, 
            List list5, String s22, String s23, String s24, String s25, kn kn9, String s26, 
            String s27, String s28, kn kn10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        acs = set;
        xM = i;
        act = kn1;
        acu = list;
        acv = kn2;
        acw = s;
        acx = s1;
        acy = s2;
        acz = list1;
        acA = j;
        acB = list2;
        acC = kn3;
        acD = list3;
        acE = s3;
        acF = s4;
        acG = kn4;
        acH = s5;
        acI = s6;
        mk = s7;
        acJ = list4;
        acK = s8;
        acL = s9;
        acM = s10;
        Mp = s11;
        acN = s12;
        acO = s13;
        acP = s14;
        acQ = s15;
        acR = s16;
        acS = kn5;
        acT = s17;
        acU = s18;
        xG = s19;
        acV = s20;
        acW = kn6;
        Vd = d;
        acX = kn7;
        Ve = d1;
        mName = s21;
        acY = kn8;
        acZ = list5;
        ada = s22;
        adb = s23;
        adc = s24;
        add = s25;
        ade = kn9;
        adf = s26;
        adg = s27;
        adh = s28;
        adi = kn10;
        adj = s29;
        adk = s30;
        qX = s31;
        qY = s32;
        adl = s33;
        adm = s34;
    }

    public kn(Set set, kn kn1, List list, kn kn2, String s, String s1, String s2, 
            List list1, int i, List list2, kn kn3, List list3, String s3, String s4, 
            kn kn4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            kn kn5, String s17, String s18, String s19, String s20, kn kn6, double d, kn kn7, double d1, String s21, kn kn8, List list5, 
            String s22, String s23, String s24, String s25, kn kn9, String s26, String s27, 
            String s28, kn kn10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        acs = set;
        xM = 1;
        act = kn1;
        acu = list;
        acv = kn2;
        acw = s;
        acx = s1;
        acy = s2;
        acz = list1;
        acA = i;
        acB = list2;
        acC = kn3;
        acD = list3;
        acE = s3;
        acF = s4;
        acG = kn4;
        acH = s5;
        acI = s6;
        mk = s7;
        acJ = list4;
        acK = s8;
        acL = s9;
        acM = s10;
        Mp = s11;
        acN = s12;
        acO = s13;
        acP = s14;
        acQ = s15;
        acR = s16;
        acS = kn5;
        acT = s17;
        acU = s18;
        xG = s19;
        acV = s20;
        acW = kn6;
        Vd = d;
        acX = kn7;
        Ve = d1;
        mName = s21;
        acY = kn8;
        acZ = list5;
        ada = s22;
        adb = s23;
        adc = s24;
        add = s25;
        ade = kn9;
        adf = s26;
        adg = s27;
        adh = s28;
        adi = kn10;
        adj = s29;
        adk = s30;
        qX = s31;
        qY = s32;
        adl = s33;
        adm = s34;
    }

    protected boolean a(hy.a a1)
    {
        return acs.contains(Integer.valueOf(a1.fN()));
    }

    protected Object aF(String s)
    {
        return null;
    }

    protected boolean aG(String s)
    {
        return false;
    }

    protected Object b(hy.a a1)
    {
        switch (a1.fN())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

        case 2: // '\002'
            return act;

        case 3: // '\003'
            return acu;

        case 4: // '\004'
            return acv;

        case 5: // '\005'
            return acw;

        case 6: // '\006'
            return acx;

        case 7: // '\007'
            return acy;

        case 8: // '\b'
            return acz;

        case 9: // '\t'
            return Integer.valueOf(acA);

        case 10: // '\n'
            return acB;

        case 11: // '\013'
            return acC;

        case 12: // '\f'
            return acD;

        case 13: // '\r'
            return acE;

        case 14: // '\016'
            return acF;

        case 15: // '\017'
            return acG;

        case 16: // '\020'
            return acH;

        case 17: // '\021'
            return acI;

        case 18: // '\022'
            return mk;

        case 19: // '\023'
            return acJ;

        case 20: // '\024'
            return acK;

        case 21: // '\025'
            return acL;

        case 22: // '\026'
            return acM;

        case 23: // '\027'
            return Mp;

        case 24: // '\030'
            return acN;

        case 25: // '\031'
            return acO;

        case 26: // '\032'
            return acP;

        case 27: // '\033'
            return acQ;

        case 28: // '\034'
            return acR;

        case 29: // '\035'
            return acS;

        case 30: // '\036'
            return acT;

        case 31: // '\037'
            return acU;

        case 32: // ' '
            return xG;

        case 33: // '!'
            return acV;

        case 34: // '"'
            return acW;

        case 36: // '$'
            return Double.valueOf(Vd);

        case 37: // '%'
            return acX;

        case 38: // '&'
            return Double.valueOf(Ve);

        case 39: // '\''
            return mName;

        case 40: // '('
            return acY;

        case 41: // ')'
            return acZ;

        case 42: // '*'
            return ada;

        case 43: // '+'
            return adb;

        case 44: // ','
            return adc;

        case 45: // '-'
            return add;

        case 46: // '.'
            return ade;

        case 47: // '/'
            return adf;

        case 48: // '0'
            return adg;

        case 49: // '1'
            return adh;

        case 50: // '2'
            return adi;

        case 51: // '3'
            return adj;

        case 52: // '4'
            return adk;

        case 53: // '5'
            return qX;

        case 54: // '6'
            return qY;

        case 55: // '7'
            return adl;

        case 56: // '8'
            return adm;
        }
    }

    public int describeContents()
    {
        ko ko1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof kn))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kn)obj;
            hy.a a1;
label1:
            do
            {
                for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                {
                    a1 = (hy.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((kn) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kn) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kn) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public HashMap fG()
    {
        return acr;
    }

    public Object freeze()
    {
        return kA();
    }

    public ItemScope getAbout()
    {
        return act;
    }

    public List getAdditionalName()
    {
        return acu;
    }

    public ItemScope getAddress()
    {
        return acv;
    }

    public String getAddressCountry()
    {
        return acw;
    }

    public String getAddressLocality()
    {
        return acx;
    }

    public String getAddressRegion()
    {
        return acy;
    }

    public List getAssociated_media()
    {
        return (ArrayList)acz;
    }

    public int getAttendeeCount()
    {
        return acA;
    }

    public List getAttendees()
    {
        return (ArrayList)acB;
    }

    public ItemScope getAudio()
    {
        return acC;
    }

    public List getAuthor()
    {
        return (ArrayList)acD;
    }

    public String getBestRating()
    {
        return acE;
    }

    public String getBirthDate()
    {
        return acF;
    }

    public ItemScope getByArtist()
    {
        return acG;
    }

    public String getCaption()
    {
        return acH;
    }

    public String getContentSize()
    {
        return acI;
    }

    public String getContentUrl()
    {
        return mk;
    }

    public List getContributor()
    {
        return (ArrayList)acJ;
    }

    public String getDateCreated()
    {
        return acK;
    }

    public String getDateModified()
    {
        return acL;
    }

    public String getDatePublished()
    {
        return acM;
    }

    public String getDescription()
    {
        return Mp;
    }

    public String getDuration()
    {
        return acN;
    }

    public String getEmbedUrl()
    {
        return acO;
    }

    public String getEndDate()
    {
        return acP;
    }

    public String getFamilyName()
    {
        return acQ;
    }

    public String getGender()
    {
        return acR;
    }

    public ItemScope getGeo()
    {
        return acS;
    }

    public String getGivenName()
    {
        return acT;
    }

    public String getHeight()
    {
        return acU;
    }

    public String getId()
    {
        return xG;
    }

    public String getImage()
    {
        return acV;
    }

    public ItemScope getInAlbum()
    {
        return acW;
    }

    public double getLatitude()
    {
        return Vd;
    }

    public ItemScope getLocation()
    {
        return acX;
    }

    public double getLongitude()
    {
        return Ve;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return acY;
    }

    public List getPerformers()
    {
        return (ArrayList)acZ;
    }

    public String getPlayerType()
    {
        return ada;
    }

    public String getPostOfficeBoxNumber()
    {
        return adb;
    }

    public String getPostalCode()
    {
        return adc;
    }

    public String getRatingValue()
    {
        return add;
    }

    public ItemScope getReviewRating()
    {
        return ade;
    }

    public String getStartDate()
    {
        return adf;
    }

    public String getStreetAddress()
    {
        return adg;
    }

    public String getText()
    {
        return adh;
    }

    public ItemScope getThumbnail()
    {
        return adi;
    }

    public String getThumbnailUrl()
    {
        return adj;
    }

    public String getTickerSymbol()
    {
        return adk;
    }

    public String getType()
    {
        return qX;
    }

    public String getUrl()
    {
        return qY;
    }

    int getVersionCode()
    {
        return xM;
    }

    public String getWidth()
    {
        return adl;
    }

    public String getWorstRating()
    {
        return adm;
    }

    public boolean hasAbout()
    {
        return acs.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return acs.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return acs.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return acs.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return acs.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return acs.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return acs.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return acs.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return acs.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return acs.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return acs.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return acs.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return acs.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return acs.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return acs.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return acs.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return acs.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return acs.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return acs.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return acs.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return acs.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return acs.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return acs.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return acs.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return acs.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return acs.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return acs.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return acs.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return acs.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return acs.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return acs.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return acs.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return acs.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return acs.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return acs.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return acs.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return acs.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return acs.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return acs.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return acs.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return acs.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return acs.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return acs.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return acs.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return acs.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return acs.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return acs.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return acs.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return acs.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return acs.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return acs.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return acs.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return acs.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return acs.contains(Integer.valueOf(56));
    }

    public int hashCode()
    {
        Iterator iterator = acr.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hy.a a1 = (hy.a)iterator.next();
            if (a(a1))
            {
                int j = a1.fN();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public kn kA()
    {
        return this;
    }

    Set kk()
    {
        return acs;
    }

    kn kl()
    {
        return act;
    }

    kn km()
    {
        return acv;
    }

    List kn()
    {
        return acz;
    }

    List ko()
    {
        return acB;
    }

    kn kp()
    {
        return acC;
    }

    List kq()
    {
        return acD;
    }

    kn kr()
    {
        return acG;
    }

    List ks()
    {
        return acJ;
    }

    kn kt()
    {
        return acS;
    }

    kn ku()
    {
        return acW;
    }

    kn kv()
    {
        return acX;
    }

    kn kw()
    {
        return acY;
    }

    List kx()
    {
        return acZ;
    }

    kn ky()
    {
        return ade;
    }

    kn kz()
    {
        return adi;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ko ko1 = CREATOR;
        com.google.android.gms.internal.ko.a(this, parcel, i);
    }

    static 
    {
        acr = new HashMap();
        acr.put("about", hy.a.a("about", 2, com/google/android/gms/internal/kn));
        acr.put("additionalName", hy.a.k("additionalName", 3));
        acr.put("address", hy.a.a("address", 4, com/google/android/gms/internal/kn));
        acr.put("addressCountry", hy.a.j("addressCountry", 5));
        acr.put("addressLocality", hy.a.j("addressLocality", 6));
        acr.put("addressRegion", hy.a.j("addressRegion", 7));
        acr.put("associated_media", hy.a.b("associated_media", 8, com/google/android/gms/internal/kn));
        acr.put("attendeeCount", hy.a.g("attendeeCount", 9));
        acr.put("attendees", hy.a.b("attendees", 10, com/google/android/gms/internal/kn));
        acr.put("audio", hy.a.a("audio", 11, com/google/android/gms/internal/kn));
        acr.put("author", hy.a.b("author", 12, com/google/android/gms/internal/kn));
        acr.put("bestRating", hy.a.j("bestRating", 13));
        acr.put("birthDate", hy.a.j("birthDate", 14));
        acr.put("byArtist", hy.a.a("byArtist", 15, com/google/android/gms/internal/kn));
        acr.put("caption", hy.a.j("caption", 16));
        acr.put("contentSize", hy.a.j("contentSize", 17));
        acr.put("contentUrl", hy.a.j("contentUrl", 18));
        acr.put("contributor", hy.a.b("contributor", 19, com/google/android/gms/internal/kn));
        acr.put("dateCreated", hy.a.j("dateCreated", 20));
        acr.put("dateModified", hy.a.j("dateModified", 21));
        acr.put("datePublished", hy.a.j("datePublished", 22));
        acr.put("description", hy.a.j("description", 23));
        acr.put("duration", hy.a.j("duration", 24));
        acr.put("embedUrl", hy.a.j("embedUrl", 25));
        acr.put("endDate", hy.a.j("endDate", 26));
        acr.put("familyName", hy.a.j("familyName", 27));
        acr.put("gender", hy.a.j("gender", 28));
        acr.put("geo", hy.a.a("geo", 29, com/google/android/gms/internal/kn));
        acr.put("givenName", hy.a.j("givenName", 30));
        acr.put("height", hy.a.j("height", 31));
        acr.put("id", hy.a.j("id", 32));
        acr.put("image", hy.a.j("image", 33));
        acr.put("inAlbum", hy.a.a("inAlbum", 34, com/google/android/gms/internal/kn));
        acr.put("latitude", hy.a.h("latitude", 36));
        acr.put("location", hy.a.a("location", 37, com/google/android/gms/internal/kn));
        acr.put("longitude", hy.a.h("longitude", 38));
        acr.put("name", hy.a.j("name", 39));
        acr.put("partOfTVSeries", hy.a.a("partOfTVSeries", 40, com/google/android/gms/internal/kn));
        acr.put("performers", hy.a.b("performers", 41, com/google/android/gms/internal/kn));
        acr.put("playerType", hy.a.j("playerType", 42));
        acr.put("postOfficeBoxNumber", hy.a.j("postOfficeBoxNumber", 43));
        acr.put("postalCode", hy.a.j("postalCode", 44));
        acr.put("ratingValue", hy.a.j("ratingValue", 45));
        acr.put("reviewRating", hy.a.a("reviewRating", 46, com/google/android/gms/internal/kn));
        acr.put("startDate", hy.a.j("startDate", 47));
        acr.put("streetAddress", hy.a.j("streetAddress", 48));
        acr.put("text", hy.a.j("text", 49));
        acr.put("thumbnail", hy.a.a("thumbnail", 50, com/google/android/gms/internal/kn));
        acr.put("thumbnailUrl", hy.a.j("thumbnailUrl", 51));
        acr.put("tickerSymbol", hy.a.j("tickerSymbol", 52));
        acr.put("type", hy.a.j("type", 53));
        acr.put("url", hy.a.j("url", 54));
        acr.put("width", hy.a.j("width", 55));
        acr.put("worstRating", hy.a.j("worstRating", 56));
    }
}
