// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ks, pe

public final class pd extends ks
    implements ItemScope
{

    public static final pe CREATOR = new pe();
    private static final HashMap aom;
    String CE;
    final int CK;
    String UO;
    double agg;
    double agh;
    String aoA;
    pd aoB;
    String aoC;
    String aoD;
    List aoE;
    String aoF;
    String aoG;
    String aoH;
    String aoI;
    String aoJ;
    String aoK;
    String aoL;
    String aoM;
    pd aoN;
    String aoO;
    String aoP;
    String aoQ;
    pd aoR;
    pd aoS;
    pd aoT;
    List aoU;
    String aoV;
    String aoW;
    String aoX;
    String aoY;
    pd aoZ;
    final Set aon;
    pd aoo;
    List aop;
    pd aoq;
    String aor;
    String aos;
    String aot;
    List aou;
    int aov;
    List aow;
    pd aox;
    List aoy;
    String aoz;
    String apa;
    String apb;
    String apc;
    pd apd;
    String ape;
    String apf;
    String apg;
    String aph;
    String mName;
    String ov;
    String vc;
    String vf;

    public pd()
    {
        CK = 1;
        aon = new HashSet();
    }

    pd(Set set, int i, pd pd1, List list, pd pd2, String s, String s1, 
            String s2, List list1, int j, List list2, pd pd3, List list3, String s3, 
            String s4, pd pd4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, pd pd5, String s17, String s18, String s19, String s20, pd pd6, 
            double d, pd pd7, double d1, String s21, pd pd8, 
            List list5, String s22, String s23, String s24, String s25, pd pd9, String s26, 
            String s27, String s28, pd pd10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        aon = set;
        CK = i;
        aoo = pd1;
        aop = list;
        aoq = pd2;
        aor = s;
        aos = s1;
        aot = s2;
        aou = list1;
        aov = j;
        aow = list2;
        aox = pd3;
        aoy = list3;
        aoz = s3;
        aoA = s4;
        aoB = pd4;
        aoC = s5;
        aoD = s6;
        ov = s7;
        aoE = list4;
        aoF = s8;
        aoG = s9;
        aoH = s10;
        UO = s11;
        aoI = s12;
        aoJ = s13;
        aoK = s14;
        aoL = s15;
        aoM = s16;
        aoN = pd5;
        aoO = s17;
        aoP = s18;
        CE = s19;
        aoQ = s20;
        aoR = pd6;
        agg = d;
        aoS = pd7;
        agh = d1;
        mName = s21;
        aoT = pd8;
        aoU = list5;
        aoV = s22;
        aoW = s23;
        aoX = s24;
        aoY = s25;
        aoZ = pd9;
        apa = s26;
        apb = s27;
        apc = s28;
        apd = pd10;
        ape = s29;
        apf = s30;
        vc = s31;
        vf = s32;
        apg = s33;
        aph = s34;
    }

    public pd(Set set, pd pd1, List list, pd pd2, String s, String s1, String s2, 
            List list1, int i, List list2, pd pd3, List list3, String s3, String s4, 
            pd pd4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            pd pd5, String s17, String s18, String s19, String s20, pd pd6, double d, pd pd7, double d1, String s21, pd pd8, List list5, 
            String s22, String s23, String s24, String s25, pd pd9, String s26, String s27, 
            String s28, pd pd10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        aon = set;
        CK = 1;
        aoo = pd1;
        aop = list;
        aoq = pd2;
        aor = s;
        aos = s1;
        aot = s2;
        aou = list1;
        aov = i;
        aow = list2;
        aox = pd3;
        aoy = list3;
        aoz = s3;
        aoA = s4;
        aoB = pd4;
        aoC = s5;
        aoD = s6;
        ov = s7;
        aoE = list4;
        aoF = s8;
        aoG = s9;
        aoH = s10;
        UO = s11;
        aoI = s12;
        aoJ = s13;
        aoK = s14;
        aoL = s15;
        aoM = s16;
        aoN = pd5;
        aoO = s17;
        aoP = s18;
        CE = s19;
        aoQ = s20;
        aoR = pd6;
        agg = d;
        aoS = pd7;
        agh = d1;
        mName = s21;
        aoT = pd8;
        aoU = list5;
        aoV = s22;
        aoW = s23;
        aoX = s24;
        aoY = s25;
        aoZ = pd9;
        apa = s26;
        apb = s27;
        apc = s28;
        apd = pd10;
        ape = s29;
        apf = s30;
        vc = s31;
        vf = s32;
        apg = s33;
        aph = s34;
    }

    protected boolean a(kr.a a1)
    {
        return aon.contains(Integer.valueOf(a1.hR()));
    }

    protected Object b(kr.a a1)
    {
        switch (a1.hR())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hR()).toString());

        case 2: // '\002'
            return aoo;

        case 3: // '\003'
            return aop;

        case 4: // '\004'
            return aoq;

        case 5: // '\005'
            return aor;

        case 6: // '\006'
            return aos;

        case 7: // '\007'
            return aot;

        case 8: // '\b'
            return aou;

        case 9: // '\t'
            return Integer.valueOf(aov);

        case 10: // '\n'
            return aow;

        case 11: // '\013'
            return aox;

        case 12: // '\f'
            return aoy;

        case 13: // '\r'
            return aoz;

        case 14: // '\016'
            return aoA;

        case 15: // '\017'
            return aoB;

        case 16: // '\020'
            return aoC;

        case 17: // '\021'
            return aoD;

        case 18: // '\022'
            return ov;

        case 19: // '\023'
            return aoE;

        case 20: // '\024'
            return aoF;

        case 21: // '\025'
            return aoG;

        case 22: // '\026'
            return aoH;

        case 23: // '\027'
            return UO;

        case 24: // '\030'
            return aoI;

        case 25: // '\031'
            return aoJ;

        case 26: // '\032'
            return aoK;

        case 27: // '\033'
            return aoL;

        case 28: // '\034'
            return aoM;

        case 29: // '\035'
            return aoN;

        case 30: // '\036'
            return aoO;

        case 31: // '\037'
            return aoP;

        case 32: // ' '
            return CE;

        case 33: // '!'
            return aoQ;

        case 34: // '"'
            return aoR;

        case 36: // '$'
            return Double.valueOf(agg);

        case 37: // '%'
            return aoS;

        case 38: // '&'
            return Double.valueOf(agh);

        case 39: // '\''
            return mName;

        case 40: // '('
            return aoT;

        case 41: // ')'
            return aoU;

        case 42: // '*'
            return aoV;

        case 43: // '+'
            return aoW;

        case 44: // ','
            return aoX;

        case 45: // '-'
            return aoY;

        case 46: // '.'
            return aoZ;

        case 47: // '/'
            return apa;

        case 48: // '0'
            return apb;

        case 49: // '1'
            return apc;

        case 50: // '2'
            return apd;

        case 51: // '3'
            return ape;

        case 52: // '4'
            return apf;

        case 53: // '5'
            return vc;

        case 54: // '6'
            return vf;

        case 55: // '7'
            return apg;

        case 56: // '8'
            return aph;
        }
    }

    public int describeContents()
    {
        pe pe1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof pd))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (pd)obj;
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
                    if (((pd) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((pd) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((pd) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return oI();
    }

    public ItemScope getAbout()
    {
        return aoo;
    }

    public List getAdditionalName()
    {
        return aop;
    }

    public ItemScope getAddress()
    {
        return aoq;
    }

    public String getAddressCountry()
    {
        return aor;
    }

    public String getAddressLocality()
    {
        return aos;
    }

    public String getAddressRegion()
    {
        return aot;
    }

    public List getAssociated_media()
    {
        return (ArrayList)aou;
    }

    public int getAttendeeCount()
    {
        return aov;
    }

    public List getAttendees()
    {
        return (ArrayList)aow;
    }

    public ItemScope getAudio()
    {
        return aox;
    }

    public List getAuthor()
    {
        return (ArrayList)aoy;
    }

    public String getBestRating()
    {
        return aoz;
    }

    public String getBirthDate()
    {
        return aoA;
    }

    public ItemScope getByArtist()
    {
        return aoB;
    }

    public String getCaption()
    {
        return aoC;
    }

    public String getContentSize()
    {
        return aoD;
    }

    public String getContentUrl()
    {
        return ov;
    }

    public List getContributor()
    {
        return (ArrayList)aoE;
    }

    public String getDateCreated()
    {
        return aoF;
    }

    public String getDateModified()
    {
        return aoG;
    }

    public String getDatePublished()
    {
        return aoH;
    }

    public String getDescription()
    {
        return UO;
    }

    public String getDuration()
    {
        return aoI;
    }

    public String getEmbedUrl()
    {
        return aoJ;
    }

    public String getEndDate()
    {
        return aoK;
    }

    public String getFamilyName()
    {
        return aoL;
    }

    public String getGender()
    {
        return aoM;
    }

    public ItemScope getGeo()
    {
        return aoN;
    }

    public String getGivenName()
    {
        return aoO;
    }

    public String getHeight()
    {
        return aoP;
    }

    public String getId()
    {
        return CE;
    }

    public String getImage()
    {
        return aoQ;
    }

    public ItemScope getInAlbum()
    {
        return aoR;
    }

    public double getLatitude()
    {
        return agg;
    }

    public ItemScope getLocation()
    {
        return aoS;
    }

    public double getLongitude()
    {
        return agh;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return aoT;
    }

    public List getPerformers()
    {
        return (ArrayList)aoU;
    }

    public String getPlayerType()
    {
        return aoV;
    }

    public String getPostOfficeBoxNumber()
    {
        return aoW;
    }

    public String getPostalCode()
    {
        return aoX;
    }

    public String getRatingValue()
    {
        return aoY;
    }

    public ItemScope getReviewRating()
    {
        return aoZ;
    }

    public String getStartDate()
    {
        return apa;
    }

    public String getStreetAddress()
    {
        return apb;
    }

    public String getText()
    {
        return apc;
    }

    public ItemScope getThumbnail()
    {
        return apd;
    }

    public String getThumbnailUrl()
    {
        return ape;
    }

    public String getTickerSymbol()
    {
        return apf;
    }

    public String getType()
    {
        return vc;
    }

    public String getUrl()
    {
        return vf;
    }

    public String getWidth()
    {
        return apg;
    }

    public String getWorstRating()
    {
        return aph;
    }

    public HashMap hK()
    {
        return aom;
    }

    public boolean hasAbout()
    {
        return aon.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return aon.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return aon.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return aon.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return aon.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return aon.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return aon.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return aon.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return aon.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return aon.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return aon.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return aon.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return aon.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return aon.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return aon.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return aon.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return aon.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return aon.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return aon.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return aon.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return aon.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return aon.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return aon.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return aon.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return aon.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return aon.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return aon.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return aon.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return aon.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return aon.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return aon.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return aon.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return aon.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return aon.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return aon.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return aon.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return aon.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return aon.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return aon.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return aon.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return aon.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return aon.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return aon.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return aon.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return aon.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return aon.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return aon.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return aon.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return aon.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return aon.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return aon.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return aon.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return aon.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return aon.contains(Integer.valueOf(56));
    }

    public int hashCode()
    {
        Iterator iterator = aom.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kr.a a1 = (kr.a)iterator.next();
            if (a(a1))
            {
                int j = a1.hR();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public pd oI()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pe pe1 = CREATOR;
        pe.a(this, parcel, i);
    }

    static 
    {
        aom = new HashMap();
        aom.put("about", kr.a.a("about", 2, com/google/android/gms/internal/pd));
        aom.put("additionalName", kr.a.m("additionalName", 3));
        aom.put("address", kr.a.a("address", 4, com/google/android/gms/internal/pd));
        aom.put("addressCountry", kr.a.l("addressCountry", 5));
        aom.put("addressLocality", kr.a.l("addressLocality", 6));
        aom.put("addressRegion", kr.a.l("addressRegion", 7));
        aom.put("associated_media", kr.a.b("associated_media", 8, com/google/android/gms/internal/pd));
        aom.put("attendeeCount", kr.a.i("attendeeCount", 9));
        aom.put("attendees", kr.a.b("attendees", 10, com/google/android/gms/internal/pd));
        aom.put("audio", kr.a.a("audio", 11, com/google/android/gms/internal/pd));
        aom.put("author", kr.a.b("author", 12, com/google/android/gms/internal/pd));
        aom.put("bestRating", kr.a.l("bestRating", 13));
        aom.put("birthDate", kr.a.l("birthDate", 14));
        aom.put("byArtist", kr.a.a("byArtist", 15, com/google/android/gms/internal/pd));
        aom.put("caption", kr.a.l("caption", 16));
        aom.put("contentSize", kr.a.l("contentSize", 17));
        aom.put("contentUrl", kr.a.l("contentUrl", 18));
        aom.put("contributor", kr.a.b("contributor", 19, com/google/android/gms/internal/pd));
        aom.put("dateCreated", kr.a.l("dateCreated", 20));
        aom.put("dateModified", kr.a.l("dateModified", 21));
        aom.put("datePublished", kr.a.l("datePublished", 22));
        aom.put("description", kr.a.l("description", 23));
        aom.put("duration", kr.a.l("duration", 24));
        aom.put("embedUrl", kr.a.l("embedUrl", 25));
        aom.put("endDate", kr.a.l("endDate", 26));
        aom.put("familyName", kr.a.l("familyName", 27));
        aom.put("gender", kr.a.l("gender", 28));
        aom.put("geo", kr.a.a("geo", 29, com/google/android/gms/internal/pd));
        aom.put("givenName", kr.a.l("givenName", 30));
        aom.put("height", kr.a.l("height", 31));
        aom.put("id", kr.a.l("id", 32));
        aom.put("image", kr.a.l("image", 33));
        aom.put("inAlbum", kr.a.a("inAlbum", 34, com/google/android/gms/internal/pd));
        aom.put("latitude", kr.a.j("latitude", 36));
        aom.put("location", kr.a.a("location", 37, com/google/android/gms/internal/pd));
        aom.put("longitude", kr.a.j("longitude", 38));
        aom.put("name", kr.a.l("name", 39));
        aom.put("partOfTVSeries", kr.a.a("partOfTVSeries", 40, com/google/android/gms/internal/pd));
        aom.put("performers", kr.a.b("performers", 41, com/google/android/gms/internal/pd));
        aom.put("playerType", kr.a.l("playerType", 42));
        aom.put("postOfficeBoxNumber", kr.a.l("postOfficeBoxNumber", 43));
        aom.put("postalCode", kr.a.l("postalCode", 44));
        aom.put("ratingValue", kr.a.l("ratingValue", 45));
        aom.put("reviewRating", kr.a.a("reviewRating", 46, com/google/android/gms/internal/pd));
        aom.put("startDate", kr.a.l("startDate", 47));
        aom.put("streetAddress", kr.a.l("streetAddress", 48));
        aom.put("text", kr.a.l("text", 49));
        aom.put("thumbnail", kr.a.a("thumbnail", 50, com/google/android/gms/internal/pd));
        aom.put("thumbnailUrl", kr.a.l("thumbnailUrl", 51));
        aom.put("tickerSymbol", kr.a.l("tickerSymbol", 52));
        aom.put("type", kr.a.l("type", 53));
        aom.put("url", kr.a.l("url", 54));
        aom.put("width", kr.a.l("width", 55));
        aom.put("worstRating", kr.a.l("worstRating", 56));
    }
}
