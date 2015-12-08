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
//            hz, kp

public final class ko extends hz
    implements SafeParcelable, ItemScope
{

    public static final kp CREATOR = new kp();
    private static final HashMap aco;
    private String Mm;
    private double Va;
    private double Vb;
    private List acA;
    private String acB;
    private String acC;
    private ko acD;
    private String acE;
    private String acF;
    private List acG;
    private String acH;
    private String acI;
    private String acJ;
    private String acK;
    private String acL;
    private String acM;
    private String acN;
    private String acO;
    private ko acP;
    private String acQ;
    private String acR;
    private String acS;
    private ko acT;
    private ko acU;
    private ko acV;
    private List acW;
    private String acX;
    private String acY;
    private String acZ;
    private final Set acp;
    private ko acq;
    private List acr;
    private ko acs;
    private String act;
    private String acu;
    private String acv;
    private List acw;
    private int acx;
    private List acy;
    private ko acz;
    private String ada;
    private ko adb;
    private String adc;
    private String add;
    private String ade;
    private ko adf;
    private String adg;
    private String adh;
    private String adi;
    private String adj;
    private String mName;
    private String mi;
    private String qU;
    private String qV;
    private String xD;
    private final int xJ;

    public ko()
    {
        xJ = 1;
        acp = new HashSet();
    }

    ko(Set set, int i, ko ko1, List list, ko ko2, String s, String s1, 
            String s2, List list1, int j, List list2, ko ko3, List list3, String s3, 
            String s4, ko ko4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, ko ko5, String s17, String s18, String s19, String s20, ko ko6, 
            double d, ko ko7, double d1, String s21, ko ko8, 
            List list5, String s22, String s23, String s24, String s25, ko ko9, String s26, 
            String s27, String s28, ko ko10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        acp = set;
        xJ = i;
        acq = ko1;
        acr = list;
        acs = ko2;
        act = s;
        acu = s1;
        acv = s2;
        acw = list1;
        acx = j;
        acy = list2;
        acz = ko3;
        acA = list3;
        acB = s3;
        acC = s4;
        acD = ko4;
        acE = s5;
        acF = s6;
        mi = s7;
        acG = list4;
        acH = s8;
        acI = s9;
        acJ = s10;
        Mm = s11;
        acK = s12;
        acL = s13;
        acM = s14;
        acN = s15;
        acO = s16;
        acP = ko5;
        acQ = s17;
        acR = s18;
        xD = s19;
        acS = s20;
        acT = ko6;
        Va = d;
        acU = ko7;
        Vb = d1;
        mName = s21;
        acV = ko8;
        acW = list5;
        acX = s22;
        acY = s23;
        acZ = s24;
        ada = s25;
        adb = ko9;
        adc = s26;
        add = s27;
        ade = s28;
        adf = ko10;
        adg = s29;
        adh = s30;
        qU = s31;
        qV = s32;
        adi = s33;
        adj = s34;
    }

    public ko(Set set, ko ko1, List list, ko ko2, String s, String s1, String s2, 
            List list1, int i, List list2, ko ko3, List list3, String s3, String s4, 
            ko ko4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            ko ko5, String s17, String s18, String s19, String s20, ko ko6, double d, ko ko7, double d1, String s21, ko ko8, List list5, 
            String s22, String s23, String s24, String s25, ko ko9, String s26, String s27, 
            String s28, ko ko10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        acp = set;
        xJ = 1;
        acq = ko1;
        acr = list;
        acs = ko2;
        act = s;
        acu = s1;
        acv = s2;
        acw = list1;
        acx = i;
        acy = list2;
        acz = ko3;
        acA = list3;
        acB = s3;
        acC = s4;
        acD = ko4;
        acE = s5;
        acF = s6;
        mi = s7;
        acG = list4;
        acH = s8;
        acI = s9;
        acJ = s10;
        Mm = s11;
        acK = s12;
        acL = s13;
        acM = s14;
        acN = s15;
        acO = s16;
        acP = ko5;
        acQ = s17;
        acR = s18;
        xD = s19;
        acS = s20;
        acT = ko6;
        Va = d;
        acU = ko7;
        Vb = d1;
        mName = s21;
        acV = ko8;
        acW = list5;
        acX = s22;
        acY = s23;
        acZ = s24;
        ada = s25;
        adb = ko9;
        adc = s26;
        add = s27;
        ade = s28;
        adf = ko10;
        adg = s29;
        adh = s30;
        qU = s31;
        qV = s32;
        adi = s33;
        adj = s34;
    }

    protected boolean a(hz.a a1)
    {
        return acp.contains(Integer.valueOf(a1.fI()));
    }

    protected Object aF(String s)
    {
        return null;
    }

    protected boolean aG(String s)
    {
        return false;
    }

    protected Object b(hz.a a1)
    {
        switch (a1.fI())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fI()).toString());

        case 2: // '\002'
            return acq;

        case 3: // '\003'
            return acr;

        case 4: // '\004'
            return acs;

        case 5: // '\005'
            return act;

        case 6: // '\006'
            return acu;

        case 7: // '\007'
            return acv;

        case 8: // '\b'
            return acw;

        case 9: // '\t'
            return Integer.valueOf(acx);

        case 10: // '\n'
            return acy;

        case 11: // '\013'
            return acz;

        case 12: // '\f'
            return acA;

        case 13: // '\r'
            return acB;

        case 14: // '\016'
            return acC;

        case 15: // '\017'
            return acD;

        case 16: // '\020'
            return acE;

        case 17: // '\021'
            return acF;

        case 18: // '\022'
            return mi;

        case 19: // '\023'
            return acG;

        case 20: // '\024'
            return acH;

        case 21: // '\025'
            return acI;

        case 22: // '\026'
            return acJ;

        case 23: // '\027'
            return Mm;

        case 24: // '\030'
            return acK;

        case 25: // '\031'
            return acL;

        case 26: // '\032'
            return acM;

        case 27: // '\033'
            return acN;

        case 28: // '\034'
            return acO;

        case 29: // '\035'
            return acP;

        case 30: // '\036'
            return acQ;

        case 31: // '\037'
            return acR;

        case 32: // ' '
            return xD;

        case 33: // '!'
            return acS;

        case 34: // '"'
            return acT;

        case 36: // '$'
            return Double.valueOf(Va);

        case 37: // '%'
            return acU;

        case 38: // '&'
            return Double.valueOf(Vb);

        case 39: // '\''
            return mName;

        case 40: // '('
            return acV;

        case 41: // ')'
            return acW;

        case 42: // '*'
            return acX;

        case 43: // '+'
            return acY;

        case 44: // ','
            return acZ;

        case 45: // '-'
            return ada;

        case 46: // '.'
            return adb;

        case 47: // '/'
            return adc;

        case 48: // '0'
            return add;

        case 49: // '1'
            return ade;

        case 50: // '2'
            return adf;

        case 51: // '3'
            return adg;

        case 52: // '4'
            return adh;

        case 53: // '5'
            return qU;

        case 54: // '6'
            return qV;

        case 55: // '7'
            return adi;

        case 56: // '8'
            return adj;
        }
    }

    public int describeContents()
    {
        kp kp1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof ko))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ko)obj;
            hz.a a1;
label1:
            do
            {
                for (Iterator iterator = aco.values().iterator(); iterator.hasNext();)
                {
                    a1 = (hz.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((ko) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((ko) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ko) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public HashMap fB()
    {
        return aco;
    }

    public Object freeze()
    {
        return kv();
    }

    public ItemScope getAbout()
    {
        return acq;
    }

    public List getAdditionalName()
    {
        return acr;
    }

    public ItemScope getAddress()
    {
        return acs;
    }

    public String getAddressCountry()
    {
        return act;
    }

    public String getAddressLocality()
    {
        return acu;
    }

    public String getAddressRegion()
    {
        return acv;
    }

    public List getAssociated_media()
    {
        return (ArrayList)acw;
    }

    public int getAttendeeCount()
    {
        return acx;
    }

    public List getAttendees()
    {
        return (ArrayList)acy;
    }

    public ItemScope getAudio()
    {
        return acz;
    }

    public List getAuthor()
    {
        return (ArrayList)acA;
    }

    public String getBestRating()
    {
        return acB;
    }

    public String getBirthDate()
    {
        return acC;
    }

    public ItemScope getByArtist()
    {
        return acD;
    }

    public String getCaption()
    {
        return acE;
    }

    public String getContentSize()
    {
        return acF;
    }

    public String getContentUrl()
    {
        return mi;
    }

    public List getContributor()
    {
        return (ArrayList)acG;
    }

    public String getDateCreated()
    {
        return acH;
    }

    public String getDateModified()
    {
        return acI;
    }

    public String getDatePublished()
    {
        return acJ;
    }

    public String getDescription()
    {
        return Mm;
    }

    public String getDuration()
    {
        return acK;
    }

    public String getEmbedUrl()
    {
        return acL;
    }

    public String getEndDate()
    {
        return acM;
    }

    public String getFamilyName()
    {
        return acN;
    }

    public String getGender()
    {
        return acO;
    }

    public ItemScope getGeo()
    {
        return acP;
    }

    public String getGivenName()
    {
        return acQ;
    }

    public String getHeight()
    {
        return acR;
    }

    public String getId()
    {
        return xD;
    }

    public String getImage()
    {
        return acS;
    }

    public ItemScope getInAlbum()
    {
        return acT;
    }

    public double getLatitude()
    {
        return Va;
    }

    public ItemScope getLocation()
    {
        return acU;
    }

    public double getLongitude()
    {
        return Vb;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return acV;
    }

    public List getPerformers()
    {
        return (ArrayList)acW;
    }

    public String getPlayerType()
    {
        return acX;
    }

    public String getPostOfficeBoxNumber()
    {
        return acY;
    }

    public String getPostalCode()
    {
        return acZ;
    }

    public String getRatingValue()
    {
        return ada;
    }

    public ItemScope getReviewRating()
    {
        return adb;
    }

    public String getStartDate()
    {
        return adc;
    }

    public String getStreetAddress()
    {
        return add;
    }

    public String getText()
    {
        return ade;
    }

    public ItemScope getThumbnail()
    {
        return adf;
    }

    public String getThumbnailUrl()
    {
        return adg;
    }

    public String getTickerSymbol()
    {
        return adh;
    }

    public String getType()
    {
        return qU;
    }

    public String getUrl()
    {
        return qV;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public String getWidth()
    {
        return adi;
    }

    public String getWorstRating()
    {
        return adj;
    }

    public boolean hasAbout()
    {
        return acp.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return acp.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return acp.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return acp.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return acp.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return acp.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return acp.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return acp.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return acp.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return acp.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return acp.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return acp.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return acp.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return acp.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return acp.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return acp.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return acp.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return acp.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return acp.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return acp.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return acp.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return acp.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return acp.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return acp.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return acp.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return acp.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return acp.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return acp.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return acp.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return acp.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return acp.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return acp.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return acp.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return acp.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return acp.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return acp.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return acp.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return acp.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return acp.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return acp.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return acp.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return acp.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return acp.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return acp.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return acp.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return acp.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return acp.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return acp.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return acp.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return acp.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return acp.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return acp.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return acp.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return acp.contains(Integer.valueOf(56));
    }

    public int hashCode()
    {
        Iterator iterator = aco.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hz.a a1 = (hz.a)iterator.next();
            if (a(a1))
            {
                int j = a1.fI();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    Set kf()
    {
        return acp;
    }

    ko kg()
    {
        return acq;
    }

    ko kh()
    {
        return acs;
    }

    List ki()
    {
        return acw;
    }

    List kj()
    {
        return acy;
    }

    ko kk()
    {
        return acz;
    }

    List kl()
    {
        return acA;
    }

    ko km()
    {
        return acD;
    }

    List kn()
    {
        return acG;
    }

    ko ko()
    {
        return acP;
    }

    ko kp()
    {
        return acT;
    }

    ko kq()
    {
        return acU;
    }

    ko kr()
    {
        return acV;
    }

    List ks()
    {
        return acW;
    }

    ko kt()
    {
        return adb;
    }

    ko ku()
    {
        return adf;
    }

    public ko kv()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kp kp1 = CREATOR;
        com.google.android.gms.internal.kp.a(this, parcel, i);
    }

    static 
    {
        aco = new HashMap();
        aco.put("about", hz.a.a("about", 2, com/google/android/gms/internal/ko));
        aco.put("additionalName", hz.a.k("additionalName", 3));
        aco.put("address", hz.a.a("address", 4, com/google/android/gms/internal/ko));
        aco.put("addressCountry", hz.a.j("addressCountry", 5));
        aco.put("addressLocality", hz.a.j("addressLocality", 6));
        aco.put("addressRegion", hz.a.j("addressRegion", 7));
        aco.put("associated_media", hz.a.b("associated_media", 8, com/google/android/gms/internal/ko));
        aco.put("attendeeCount", hz.a.g("attendeeCount", 9));
        aco.put("attendees", hz.a.b("attendees", 10, com/google/android/gms/internal/ko));
        aco.put("audio", hz.a.a("audio", 11, com/google/android/gms/internal/ko));
        aco.put("author", hz.a.b("author", 12, com/google/android/gms/internal/ko));
        aco.put("bestRating", hz.a.j("bestRating", 13));
        aco.put("birthDate", hz.a.j("birthDate", 14));
        aco.put("byArtist", hz.a.a("byArtist", 15, com/google/android/gms/internal/ko));
        aco.put("caption", hz.a.j("caption", 16));
        aco.put("contentSize", hz.a.j("contentSize", 17));
        aco.put("contentUrl", hz.a.j("contentUrl", 18));
        aco.put("contributor", hz.a.b("contributor", 19, com/google/android/gms/internal/ko));
        aco.put("dateCreated", hz.a.j("dateCreated", 20));
        aco.put("dateModified", hz.a.j("dateModified", 21));
        aco.put("datePublished", hz.a.j("datePublished", 22));
        aco.put("description", hz.a.j("description", 23));
        aco.put("duration", hz.a.j("duration", 24));
        aco.put("embedUrl", hz.a.j("embedUrl", 25));
        aco.put("endDate", hz.a.j("endDate", 26));
        aco.put("familyName", hz.a.j("familyName", 27));
        aco.put("gender", hz.a.j("gender", 28));
        aco.put("geo", hz.a.a("geo", 29, com/google/android/gms/internal/ko));
        aco.put("givenName", hz.a.j("givenName", 30));
        aco.put("height", hz.a.j("height", 31));
        aco.put("id", hz.a.j("id", 32));
        aco.put("image", hz.a.j("image", 33));
        aco.put("inAlbum", hz.a.a("inAlbum", 34, com/google/android/gms/internal/ko));
        aco.put("latitude", hz.a.h("latitude", 36));
        aco.put("location", hz.a.a("location", 37, com/google/android/gms/internal/ko));
        aco.put("longitude", hz.a.h("longitude", 38));
        aco.put("name", hz.a.j("name", 39));
        aco.put("partOfTVSeries", hz.a.a("partOfTVSeries", 40, com/google/android/gms/internal/ko));
        aco.put("performers", hz.a.b("performers", 41, com/google/android/gms/internal/ko));
        aco.put("playerType", hz.a.j("playerType", 42));
        aco.put("postOfficeBoxNumber", hz.a.j("postOfficeBoxNumber", 43));
        aco.put("postalCode", hz.a.j("postalCode", 44));
        aco.put("ratingValue", hz.a.j("ratingValue", 45));
        aco.put("reviewRating", hz.a.a("reviewRating", 46, com/google/android/gms/internal/ko));
        aco.put("startDate", hz.a.j("startDate", 47));
        aco.put("streetAddress", hz.a.j("streetAddress", 48));
        aco.put("text", hz.a.j("text", 49));
        aco.put("thumbnail", hz.a.a("thumbnail", 50, com/google/android/gms/internal/ko));
        aco.put("thumbnailUrl", hz.a.j("thumbnailUrl", 51));
        aco.put("tickerSymbol", hz.a.j("tickerSymbol", 52));
        aco.put("type", hz.a.j("type", 53));
        aco.put("url", hz.a.j("url", 54));
        aco.put("width", hz.a.j("width", 55));
        aco.put("worstRating", hz.a.j("worstRating", 56));
    }
}
