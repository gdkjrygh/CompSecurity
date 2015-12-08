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
//            jj, nv

public final class nu extends jj
    implements ItemScope
{

    public static final nv CREATOR = new nv();
    private static final HashMap amb;
    String BL;
    final int BR;
    String Tr;
    double aek;
    double ael;
    String amA;
    String amB;
    nu amC;
    String amD;
    String amE;
    String amF;
    nu amG;
    nu amH;
    nu amI;
    List amJ;
    String amK;
    String amL;
    String amM;
    String amN;
    nu amO;
    String amP;
    String amQ;
    String amR;
    nu amS;
    String amT;
    String amU;
    String amV;
    String amW;
    final Set amc;
    nu amd;
    List ame;
    nu amf;
    String amg;
    String amh;
    String ami;
    List amj;
    int amk;
    List aml;
    nu amm;
    List amn;
    String amo;
    String amp;
    nu amq;
    String amr;
    String ams;
    List amt;
    String amu;
    String amv;
    String amw;
    String amx;
    String amy;
    String amz;
    String mName;
    String ol;
    String uO;
    String uR;

    public nu()
    {
        BR = 1;
        amc = new HashSet();
    }

    nu(Set set, int i, nu nu1, List list, nu nu2, String s, String s1, 
            String s2, List list1, int j, List list2, nu nu3, List list3, String s3, 
            String s4, nu nu4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, nu nu5, String s17, String s18, String s19, String s20, nu nu6, 
            double d, nu nu7, double d1, String s21, nu nu8, 
            List list5, String s22, String s23, String s24, String s25, nu nu9, String s26, 
            String s27, String s28, nu nu10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        amc = set;
        BR = i;
        amd = nu1;
        ame = list;
        amf = nu2;
        amg = s;
        amh = s1;
        ami = s2;
        amj = list1;
        amk = j;
        aml = list2;
        amm = nu3;
        amn = list3;
        amo = s3;
        amp = s4;
        amq = nu4;
        amr = s5;
        ams = s6;
        ol = s7;
        amt = list4;
        amu = s8;
        amv = s9;
        amw = s10;
        Tr = s11;
        amx = s12;
        amy = s13;
        amz = s14;
        amA = s15;
        amB = s16;
        amC = nu5;
        amD = s17;
        amE = s18;
        BL = s19;
        amF = s20;
        amG = nu6;
        aek = d;
        amH = nu7;
        ael = d1;
        mName = s21;
        amI = nu8;
        amJ = list5;
        amK = s22;
        amL = s23;
        amM = s24;
        amN = s25;
        amO = nu9;
        amP = s26;
        amQ = s27;
        amR = s28;
        amS = nu10;
        amT = s29;
        amU = s30;
        uO = s31;
        uR = s32;
        amV = s33;
        amW = s34;
    }

    public nu(Set set, nu nu1, List list, nu nu2, String s, String s1, String s2, 
            List list1, int i, List list2, nu nu3, List list3, String s3, String s4, 
            nu nu4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            nu nu5, String s17, String s18, String s19, String s20, nu nu6, double d, nu nu7, double d1, String s21, nu nu8, List list5, 
            String s22, String s23, String s24, String s25, nu nu9, String s26, String s27, 
            String s28, nu nu10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        amc = set;
        BR = 1;
        amd = nu1;
        ame = list;
        amf = nu2;
        amg = s;
        amh = s1;
        ami = s2;
        amj = list1;
        amk = i;
        aml = list2;
        amm = nu3;
        amn = list3;
        amo = s3;
        amp = s4;
        amq = nu4;
        amr = s5;
        ams = s6;
        ol = s7;
        amt = list4;
        amu = s8;
        amv = s9;
        amw = s10;
        Tr = s11;
        amx = s12;
        amy = s13;
        amz = s14;
        amA = s15;
        amB = s16;
        amC = nu5;
        amD = s17;
        amE = s18;
        BL = s19;
        amF = s20;
        amG = nu6;
        aek = d;
        amH = nu7;
        ael = d1;
        mName = s21;
        amI = nu8;
        amJ = list5;
        amK = s22;
        amL = s23;
        amM = s24;
        amN = s25;
        amO = nu9;
        amP = s26;
        amQ = s27;
        amR = s28;
        amS = nu10;
        amT = s29;
        amU = s30;
        uO = s31;
        uR = s32;
        amV = s33;
        amW = s34;
    }

    protected boolean a(ji.a a1)
    {
        return amc.contains(Integer.valueOf(a1.hm()));
    }

    protected Object b(ji.a a1)
    {
        switch (a1.hm())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

        case 2: // '\002'
            return amd;

        case 3: // '\003'
            return ame;

        case 4: // '\004'
            return amf;

        case 5: // '\005'
            return amg;

        case 6: // '\006'
            return amh;

        case 7: // '\007'
            return ami;

        case 8: // '\b'
            return amj;

        case 9: // '\t'
            return Integer.valueOf(amk);

        case 10: // '\n'
            return aml;

        case 11: // '\013'
            return amm;

        case 12: // '\f'
            return amn;

        case 13: // '\r'
            return amo;

        case 14: // '\016'
            return amp;

        case 15: // '\017'
            return amq;

        case 16: // '\020'
            return amr;

        case 17: // '\021'
            return ams;

        case 18: // '\022'
            return ol;

        case 19: // '\023'
            return amt;

        case 20: // '\024'
            return amu;

        case 21: // '\025'
            return amv;

        case 22: // '\026'
            return amw;

        case 23: // '\027'
            return Tr;

        case 24: // '\030'
            return amx;

        case 25: // '\031'
            return amy;

        case 26: // '\032'
            return amz;

        case 27: // '\033'
            return amA;

        case 28: // '\034'
            return amB;

        case 29: // '\035'
            return amC;

        case 30: // '\036'
            return amD;

        case 31: // '\037'
            return amE;

        case 32: // ' '
            return BL;

        case 33: // '!'
            return amF;

        case 34: // '"'
            return amG;

        case 36: // '$'
            return Double.valueOf(aek);

        case 37: // '%'
            return amH;

        case 38: // '&'
            return Double.valueOf(ael);

        case 39: // '\''
            return mName;

        case 40: // '('
            return amI;

        case 41: // ')'
            return amJ;

        case 42: // '*'
            return amK;

        case 43: // '+'
            return amL;

        case 44: // ','
            return amM;

        case 45: // '-'
            return amN;

        case 46: // '.'
            return amO;

        case 47: // '/'
            return amP;

        case 48: // '0'
            return amQ;

        case 49: // '1'
            return amR;

        case 50: // '2'
            return amS;

        case 51: // '3'
            return amT;

        case 52: // '4'
            return amU;

        case 53: // '5'
            return uO;

        case 54: // '6'
            return uR;

        case 55: // '7'
            return amV;

        case 56: // '8'
            return amW;
        }
    }

    public int describeContents()
    {
        nv nv1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof nu))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (nu)obj;
            ji.a a1;
label1:
            do
            {
                for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ji.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((nu) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((nu) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((nu) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return nr();
    }

    public ItemScope getAbout()
    {
        return amd;
    }

    public List getAdditionalName()
    {
        return ame;
    }

    public ItemScope getAddress()
    {
        return amf;
    }

    public String getAddressCountry()
    {
        return amg;
    }

    public String getAddressLocality()
    {
        return amh;
    }

    public String getAddressRegion()
    {
        return ami;
    }

    public List getAssociated_media()
    {
        return (ArrayList)amj;
    }

    public int getAttendeeCount()
    {
        return amk;
    }

    public List getAttendees()
    {
        return (ArrayList)aml;
    }

    public ItemScope getAudio()
    {
        return amm;
    }

    public List getAuthor()
    {
        return (ArrayList)amn;
    }

    public String getBestRating()
    {
        return amo;
    }

    public String getBirthDate()
    {
        return amp;
    }

    public ItemScope getByArtist()
    {
        return amq;
    }

    public String getCaption()
    {
        return amr;
    }

    public String getContentSize()
    {
        return ams;
    }

    public String getContentUrl()
    {
        return ol;
    }

    public List getContributor()
    {
        return (ArrayList)amt;
    }

    public String getDateCreated()
    {
        return amu;
    }

    public String getDateModified()
    {
        return amv;
    }

    public String getDatePublished()
    {
        return amw;
    }

    public String getDescription()
    {
        return Tr;
    }

    public String getDuration()
    {
        return amx;
    }

    public String getEmbedUrl()
    {
        return amy;
    }

    public String getEndDate()
    {
        return amz;
    }

    public String getFamilyName()
    {
        return amA;
    }

    public String getGender()
    {
        return amB;
    }

    public ItemScope getGeo()
    {
        return amC;
    }

    public String getGivenName()
    {
        return amD;
    }

    public String getHeight()
    {
        return amE;
    }

    public String getId()
    {
        return BL;
    }

    public String getImage()
    {
        return amF;
    }

    public ItemScope getInAlbum()
    {
        return amG;
    }

    public double getLatitude()
    {
        return aek;
    }

    public ItemScope getLocation()
    {
        return amH;
    }

    public double getLongitude()
    {
        return ael;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return amI;
    }

    public List getPerformers()
    {
        return (ArrayList)amJ;
    }

    public String getPlayerType()
    {
        return amK;
    }

    public String getPostOfficeBoxNumber()
    {
        return amL;
    }

    public String getPostalCode()
    {
        return amM;
    }

    public String getRatingValue()
    {
        return amN;
    }

    public ItemScope getReviewRating()
    {
        return amO;
    }

    public String getStartDate()
    {
        return amP;
    }

    public String getStreetAddress()
    {
        return amQ;
    }

    public String getText()
    {
        return amR;
    }

    public ItemScope getThumbnail()
    {
        return amS;
    }

    public String getThumbnailUrl()
    {
        return amT;
    }

    public String getTickerSymbol()
    {
        return amU;
    }

    public String getType()
    {
        return uO;
    }

    public String getUrl()
    {
        return uR;
    }

    public String getWidth()
    {
        return amV;
    }

    public String getWorstRating()
    {
        return amW;
    }

    public boolean hasAbout()
    {
        return amc.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return amc.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return amc.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return amc.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return amc.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return amc.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return amc.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return amc.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return amc.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return amc.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return amc.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return amc.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return amc.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return amc.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return amc.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return amc.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return amc.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return amc.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return amc.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return amc.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return amc.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return amc.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return amc.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return amc.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return amc.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return amc.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return amc.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return amc.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return amc.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return amc.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return amc.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return amc.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return amc.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return amc.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return amc.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return amc.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return amc.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return amc.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return amc.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return amc.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return amc.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return amc.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return amc.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return amc.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return amc.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return amc.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return amc.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return amc.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return amc.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return amc.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return amc.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return amc.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return amc.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return amc.contains(Integer.valueOf(56));
    }

    public int hashCode()
    {
        Iterator iterator = amb.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ji.a a1 = (ji.a)iterator.next();
            if (a(a1))
            {
                int j = a1.hm();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public HashMap hf()
    {
        return amb;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public nu nr()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nv nv1 = CREATOR;
        nv.a(this, parcel, i);
    }

    static 
    {
        amb = new HashMap();
        amb.put("about", ji.a.a("about", 2, com/google/android/gms/internal/nu));
        amb.put("additionalName", ji.a.m("additionalName", 3));
        amb.put("address", ji.a.a("address", 4, com/google/android/gms/internal/nu));
        amb.put("addressCountry", ji.a.l("addressCountry", 5));
        amb.put("addressLocality", ji.a.l("addressLocality", 6));
        amb.put("addressRegion", ji.a.l("addressRegion", 7));
        amb.put("associated_media", ji.a.b("associated_media", 8, com/google/android/gms/internal/nu));
        amb.put("attendeeCount", ji.a.i("attendeeCount", 9));
        amb.put("attendees", ji.a.b("attendees", 10, com/google/android/gms/internal/nu));
        amb.put("audio", ji.a.a("audio", 11, com/google/android/gms/internal/nu));
        amb.put("author", ji.a.b("author", 12, com/google/android/gms/internal/nu));
        amb.put("bestRating", ji.a.l("bestRating", 13));
        amb.put("birthDate", ji.a.l("birthDate", 14));
        amb.put("byArtist", ji.a.a("byArtist", 15, com/google/android/gms/internal/nu));
        amb.put("caption", ji.a.l("caption", 16));
        amb.put("contentSize", ji.a.l("contentSize", 17));
        amb.put("contentUrl", ji.a.l("contentUrl", 18));
        amb.put("contributor", ji.a.b("contributor", 19, com/google/android/gms/internal/nu));
        amb.put("dateCreated", ji.a.l("dateCreated", 20));
        amb.put("dateModified", ji.a.l("dateModified", 21));
        amb.put("datePublished", ji.a.l("datePublished", 22));
        amb.put("description", ji.a.l("description", 23));
        amb.put("duration", ji.a.l("duration", 24));
        amb.put("embedUrl", ji.a.l("embedUrl", 25));
        amb.put("endDate", ji.a.l("endDate", 26));
        amb.put("familyName", ji.a.l("familyName", 27));
        amb.put("gender", ji.a.l("gender", 28));
        amb.put("geo", ji.a.a("geo", 29, com/google/android/gms/internal/nu));
        amb.put("givenName", ji.a.l("givenName", 30));
        amb.put("height", ji.a.l("height", 31));
        amb.put("id", ji.a.l("id", 32));
        amb.put("image", ji.a.l("image", 33));
        amb.put("inAlbum", ji.a.a("inAlbum", 34, com/google/android/gms/internal/nu));
        amb.put("latitude", ji.a.j("latitude", 36));
        amb.put("location", ji.a.a("location", 37, com/google/android/gms/internal/nu));
        amb.put("longitude", ji.a.j("longitude", 38));
        amb.put("name", ji.a.l("name", 39));
        amb.put("partOfTVSeries", ji.a.a("partOfTVSeries", 40, com/google/android/gms/internal/nu));
        amb.put("performers", ji.a.b("performers", 41, com/google/android/gms/internal/nu));
        amb.put("playerType", ji.a.l("playerType", 42));
        amb.put("postOfficeBoxNumber", ji.a.l("postOfficeBoxNumber", 43));
        amb.put("postalCode", ji.a.l("postalCode", 44));
        amb.put("ratingValue", ji.a.l("ratingValue", 45));
        amb.put("reviewRating", ji.a.a("reviewRating", 46, com/google/android/gms/internal/nu));
        amb.put("startDate", ji.a.l("startDate", 47));
        amb.put("streetAddress", ji.a.l("streetAddress", 48));
        amb.put("text", ji.a.l("text", 49));
        amb.put("thumbnail", ji.a.a("thumbnail", 50, com/google/android/gms/internal/nu));
        amb.put("thumbnailUrl", ji.a.l("thumbnailUrl", 51));
        amb.put("tickerSymbol", ji.a.l("tickerSymbol", 52));
        amb.put("type", ji.a.l("type", 53));
        amb.put("url", ji.a.l("url", 54));
        amb.put("width", ji.a.l("width", 55));
        amb.put("worstRating", ji.a.l("worstRating", 56));
    }
}
