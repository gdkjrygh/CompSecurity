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
//            ga, id

public final class ic extends ga
    implements SafeParcelable, ItemScope
{

    public static final id CREATOR = new id();
    private static final HashMap UI;
    private String HD;
    private double NX;
    private double NY;
    private String Rd;
    private final Set UJ;
    private ic UK;
    private List UL;
    private ic UM;
    private String UN;
    private String UO;
    private String UP;
    private List UQ;
    private int UR;
    private List US;
    private ic UT;
    private List UU;
    private String UV;
    private String UW;
    private ic UX;
    private String UY;
    private String UZ;
    private String VA;
    private String VB;
    private String VC;
    private String VD;
    private List Va;
    private String Vb;
    private String Vc;
    private String Vd;
    private String Ve;
    private String Vf;
    private String Vg;
    private String Vh;
    private String Vi;
    private ic Vj;
    private String Vk;
    private String Vl;
    private String Vm;
    private ic Vn;
    private ic Vo;
    private ic Vp;
    private List Vq;
    private String Vr;
    private String Vs;
    private String Vt;
    private String Vu;
    private ic Vv;
    private String Vw;
    private String Vx;
    private String Vy;
    private ic Vz;
    private String lY;
    private String mName;
    private String ro;
    private String wp;
    private final int xH;

    public ic()
    {
        xH = 1;
        UJ = new HashSet();
    }

    ic(Set set, int i, ic ic1, List list, ic ic2, String s, String s1, 
            String s2, List list1, int j, List list2, ic ic3, List list3, String s3, 
            String s4, ic ic4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, ic ic5, String s17, String s18, String s19, String s20, ic ic6, 
            double d, ic ic7, double d1, String s21, ic ic8, 
            List list5, String s22, String s23, String s24, String s25, ic ic9, String s26, 
            String s27, String s28, ic ic10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        UJ = set;
        xH = i;
        UK = ic1;
        UL = list;
        UM = ic2;
        UN = s;
        UO = s1;
        UP = s2;
        UQ = list1;
        UR = j;
        US = list2;
        UT = ic3;
        UU = list3;
        UV = s3;
        UW = s4;
        UX = ic4;
        UY = s5;
        UZ = s6;
        lY = s7;
        Va = list4;
        Vb = s8;
        Vc = s9;
        Vd = s10;
        HD = s11;
        Ve = s12;
        Vf = s13;
        Vg = s14;
        Vh = s15;
        Vi = s16;
        Vj = ic5;
        Vk = s17;
        Vl = s18;
        wp = s19;
        Vm = s20;
        Vn = ic6;
        NX = d;
        Vo = ic7;
        NY = d1;
        mName = s21;
        Vp = ic8;
        Vq = list5;
        Vr = s22;
        Vs = s23;
        Vt = s24;
        Vu = s25;
        Vv = ic9;
        Vw = s26;
        Vx = s27;
        Vy = s28;
        Vz = ic10;
        VA = s29;
        VB = s30;
        Rd = s31;
        ro = s32;
        VC = s33;
        VD = s34;
    }

    public ic(Set set, ic ic1, List list, ic ic2, String s, String s1, String s2, 
            List list1, int i, List list2, ic ic3, List list3, String s3, String s4, 
            ic ic4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            ic ic5, String s17, String s18, String s19, String s20, ic ic6, double d, ic ic7, double d1, String s21, ic ic8, List list5, 
            String s22, String s23, String s24, String s25, ic ic9, String s26, String s27, 
            String s28, ic ic10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        UJ = set;
        xH = 1;
        UK = ic1;
        UL = list;
        UM = ic2;
        UN = s;
        UO = s1;
        UP = s2;
        UQ = list1;
        UR = i;
        US = list2;
        UT = ic3;
        UU = list3;
        UV = s3;
        UW = s4;
        UX = ic4;
        UY = s5;
        UZ = s6;
        lY = s7;
        Va = list4;
        Vb = s8;
        Vc = s9;
        Vd = s10;
        HD = s11;
        Ve = s12;
        Vf = s13;
        Vg = s14;
        Vh = s15;
        Vi = s16;
        Vj = ic5;
        Vk = s17;
        Vl = s18;
        wp = s19;
        Vm = s20;
        Vn = ic6;
        NX = d;
        Vo = ic7;
        NY = d1;
        mName = s21;
        Vp = ic8;
        Vq = list5;
        Vr = s22;
        Vs = s23;
        Vt = s24;
        Vu = s25;
        Vv = ic9;
        Vw = s26;
        Vx = s27;
        Vy = s28;
        Vz = ic10;
        VA = s29;
        VB = s30;
        Rd = s31;
        ro = s32;
        VC = s33;
        VD = s34;
    }

    protected boolean a(ga.a a1)
    {
        return UJ.contains(Integer.valueOf(a1.ff()));
    }

    protected Object aq(String s)
    {
        return null;
    }

    protected boolean ar(String s)
    {
        return false;
    }

    protected Object b(ga.a a1)
    {
        switch (a1.ff())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.ff()).toString());

        case 2: // '\002'
            return UK;

        case 3: // '\003'
            return UL;

        case 4: // '\004'
            return UM;

        case 5: // '\005'
            return UN;

        case 6: // '\006'
            return UO;

        case 7: // '\007'
            return UP;

        case 8: // '\b'
            return UQ;

        case 9: // '\t'
            return Integer.valueOf(UR);

        case 10: // '\n'
            return US;

        case 11: // '\013'
            return UT;

        case 12: // '\f'
            return UU;

        case 13: // '\r'
            return UV;

        case 14: // '\016'
            return UW;

        case 15: // '\017'
            return UX;

        case 16: // '\020'
            return UY;

        case 17: // '\021'
            return UZ;

        case 18: // '\022'
            return lY;

        case 19: // '\023'
            return Va;

        case 20: // '\024'
            return Vb;

        case 21: // '\025'
            return Vc;

        case 22: // '\026'
            return Vd;

        case 23: // '\027'
            return HD;

        case 24: // '\030'
            return Ve;

        case 25: // '\031'
            return Vf;

        case 26: // '\032'
            return Vg;

        case 27: // '\033'
            return Vh;

        case 28: // '\034'
            return Vi;

        case 29: // '\035'
            return Vj;

        case 30: // '\036'
            return Vk;

        case 31: // '\037'
            return Vl;

        case 32: // ' '
            return wp;

        case 33: // '!'
            return Vm;

        case 34: // '"'
            return Vn;

        case 36: // '$'
            return Double.valueOf(NX);

        case 37: // '%'
            return Vo;

        case 38: // '&'
            return Double.valueOf(NY);

        case 39: // '\''
            return mName;

        case 40: // '('
            return Vp;

        case 41: // ')'
            return Vq;

        case 42: // '*'
            return Vr;

        case 43: // '+'
            return Vs;

        case 44: // ','
            return Vt;

        case 45: // '-'
            return Vu;

        case 46: // '.'
            return Vv;

        case 47: // '/'
            return Vw;

        case 48: // '0'
            return Vx;

        case 49: // '1'
            return Vy;

        case 50: // '2'
            return Vz;

        case 51: // '3'
            return VA;

        case 52: // '4'
            return VB;

        case 53: // '5'
            return Rd;

        case 54: // '6'
            return ro;

        case 55: // '7'
            return VC;

        case 56: // '8'
            return VD;
        }
    }

    public int describeContents()
    {
        id id1 = CREATOR;
        return 0;
    }

    public HashMap eY()
    {
        return UI;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof ic))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ic)obj;
            ga.a a1;
label1:
            do
            {
                for (Iterator iterator = UI.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ga.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((ic) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((ic) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ic) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return jq();
    }

    public ItemScope getAbout()
    {
        return UK;
    }

    public List getAdditionalName()
    {
        return UL;
    }

    public ItemScope getAddress()
    {
        return UM;
    }

    public String getAddressCountry()
    {
        return UN;
    }

    public String getAddressLocality()
    {
        return UO;
    }

    public String getAddressRegion()
    {
        return UP;
    }

    public List getAssociated_media()
    {
        return (ArrayList)UQ;
    }

    public int getAttendeeCount()
    {
        return UR;
    }

    public List getAttendees()
    {
        return (ArrayList)US;
    }

    public ItemScope getAudio()
    {
        return UT;
    }

    public List getAuthor()
    {
        return (ArrayList)UU;
    }

    public String getBestRating()
    {
        return UV;
    }

    public String getBirthDate()
    {
        return UW;
    }

    public ItemScope getByArtist()
    {
        return UX;
    }

    public String getCaption()
    {
        return UY;
    }

    public String getContentSize()
    {
        return UZ;
    }

    public String getContentUrl()
    {
        return lY;
    }

    public List getContributor()
    {
        return (ArrayList)Va;
    }

    public String getDateCreated()
    {
        return Vb;
    }

    public String getDateModified()
    {
        return Vc;
    }

    public String getDatePublished()
    {
        return Vd;
    }

    public String getDescription()
    {
        return HD;
    }

    public String getDuration()
    {
        return Ve;
    }

    public String getEmbedUrl()
    {
        return Vf;
    }

    public String getEndDate()
    {
        return Vg;
    }

    public String getFamilyName()
    {
        return Vh;
    }

    public String getGender()
    {
        return Vi;
    }

    public ItemScope getGeo()
    {
        return Vj;
    }

    public String getGivenName()
    {
        return Vk;
    }

    public String getHeight()
    {
        return Vl;
    }

    public String getId()
    {
        return wp;
    }

    public String getImage()
    {
        return Vm;
    }

    public ItemScope getInAlbum()
    {
        return Vn;
    }

    public double getLatitude()
    {
        return NX;
    }

    public ItemScope getLocation()
    {
        return Vo;
    }

    public double getLongitude()
    {
        return NY;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return Vp;
    }

    public List getPerformers()
    {
        return (ArrayList)Vq;
    }

    public String getPlayerType()
    {
        return Vr;
    }

    public String getPostOfficeBoxNumber()
    {
        return Vs;
    }

    public String getPostalCode()
    {
        return Vt;
    }

    public String getRatingValue()
    {
        return Vu;
    }

    public ItemScope getReviewRating()
    {
        return Vv;
    }

    public String getStartDate()
    {
        return Vw;
    }

    public String getStreetAddress()
    {
        return Vx;
    }

    public String getText()
    {
        return Vy;
    }

    public ItemScope getThumbnail()
    {
        return Vz;
    }

    public String getThumbnailUrl()
    {
        return VA;
    }

    public String getTickerSymbol()
    {
        return VB;
    }

    public String getType()
    {
        return Rd;
    }

    public String getUrl()
    {
        return ro;
    }

    int getVersionCode()
    {
        return xH;
    }

    public String getWidth()
    {
        return VC;
    }

    public String getWorstRating()
    {
        return VD;
    }

    public boolean hasAbout()
    {
        return UJ.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return UJ.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return UJ.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return UJ.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return UJ.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return UJ.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return UJ.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return UJ.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return UJ.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return UJ.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return UJ.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return UJ.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return UJ.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return UJ.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return UJ.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return UJ.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return UJ.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return UJ.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return UJ.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return UJ.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return UJ.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return UJ.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return UJ.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return UJ.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return UJ.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return UJ.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return UJ.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return UJ.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return UJ.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return UJ.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return UJ.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return UJ.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return UJ.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return UJ.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return UJ.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return UJ.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return UJ.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return UJ.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return UJ.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return UJ.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return UJ.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return UJ.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return UJ.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return UJ.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return UJ.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return UJ.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return UJ.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return UJ.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return UJ.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return UJ.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return UJ.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return UJ.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return UJ.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return UJ.contains(Integer.valueOf(56));
    }

    public int hashCode()
    {
        Iterator iterator = UI.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ga.a a1 = (ga.a)iterator.next();
            if (a(a1))
            {
                int j = a1.ff();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    Set ja()
    {
        return UJ;
    }

    ic jb()
    {
        return UK;
    }

    ic jc()
    {
        return UM;
    }

    List jd()
    {
        return UQ;
    }

    List je()
    {
        return US;
    }

    ic jf()
    {
        return UT;
    }

    List jg()
    {
        return UU;
    }

    ic jh()
    {
        return UX;
    }

    List ji()
    {
        return Va;
    }

    ic jj()
    {
        return Vj;
    }

    ic jk()
    {
        return Vn;
    }

    ic jl()
    {
        return Vo;
    }

    ic jm()
    {
        return Vp;
    }

    List jn()
    {
        return Vq;
    }

    ic jo()
    {
        return Vv;
    }

    ic jp()
    {
        return Vz;
    }

    public ic jq()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        id id1 = CREATOR;
        id.a(this, parcel, i);
    }

    static 
    {
        UI = new HashMap();
        UI.put("about", ga.a.a("about", 2, com/google/android/gms/internal/ic));
        UI.put("additionalName", ga.a.k("additionalName", 3));
        UI.put("address", ga.a.a("address", 4, com/google/android/gms/internal/ic));
        UI.put("addressCountry", ga.a.j("addressCountry", 5));
        UI.put("addressLocality", ga.a.j("addressLocality", 6));
        UI.put("addressRegion", ga.a.j("addressRegion", 7));
        UI.put("associated_media", ga.a.b("associated_media", 8, com/google/android/gms/internal/ic));
        UI.put("attendeeCount", ga.a.g("attendeeCount", 9));
        UI.put("attendees", ga.a.b("attendees", 10, com/google/android/gms/internal/ic));
        UI.put("audio", ga.a.a("audio", 11, com/google/android/gms/internal/ic));
        UI.put("author", ga.a.b("author", 12, com/google/android/gms/internal/ic));
        UI.put("bestRating", ga.a.j("bestRating", 13));
        UI.put("birthDate", ga.a.j("birthDate", 14));
        UI.put("byArtist", ga.a.a("byArtist", 15, com/google/android/gms/internal/ic));
        UI.put("caption", ga.a.j("caption", 16));
        UI.put("contentSize", ga.a.j("contentSize", 17));
        UI.put("contentUrl", ga.a.j("contentUrl", 18));
        UI.put("contributor", ga.a.b("contributor", 19, com/google/android/gms/internal/ic));
        UI.put("dateCreated", ga.a.j("dateCreated", 20));
        UI.put("dateModified", ga.a.j("dateModified", 21));
        UI.put("datePublished", ga.a.j("datePublished", 22));
        UI.put("description", ga.a.j("description", 23));
        UI.put("duration", ga.a.j("duration", 24));
        UI.put("embedUrl", ga.a.j("embedUrl", 25));
        UI.put("endDate", ga.a.j("endDate", 26));
        UI.put("familyName", ga.a.j("familyName", 27));
        UI.put("gender", ga.a.j("gender", 28));
        UI.put("geo", ga.a.a("geo", 29, com/google/android/gms/internal/ic));
        UI.put("givenName", ga.a.j("givenName", 30));
        UI.put("height", ga.a.j("height", 31));
        UI.put("id", ga.a.j("id", 32));
        UI.put("image", ga.a.j("image", 33));
        UI.put("inAlbum", ga.a.a("inAlbum", 34, com/google/android/gms/internal/ic));
        UI.put("latitude", ga.a.h("latitude", 36));
        UI.put("location", ga.a.a("location", 37, com/google/android/gms/internal/ic));
        UI.put("longitude", ga.a.h("longitude", 38));
        UI.put("name", ga.a.j("name", 39));
        UI.put("partOfTVSeries", ga.a.a("partOfTVSeries", 40, com/google/android/gms/internal/ic));
        UI.put("performers", ga.a.b("performers", 41, com/google/android/gms/internal/ic));
        UI.put("playerType", ga.a.j("playerType", 42));
        UI.put("postOfficeBoxNumber", ga.a.j("postOfficeBoxNumber", 43));
        UI.put("postalCode", ga.a.j("postalCode", 44));
        UI.put("ratingValue", ga.a.j("ratingValue", 45));
        UI.put("reviewRating", ga.a.a("reviewRating", 46, com/google/android/gms/internal/ic));
        UI.put("startDate", ga.a.j("startDate", 47));
        UI.put("streetAddress", ga.a.j("streetAddress", 48));
        UI.put("text", ga.a.j("text", 49));
        UI.put("thumbnail", ga.a.a("thumbnail", 50, com/google/android/gms/internal/ic));
        UI.put("thumbnailUrl", ga.a.j("thumbnailUrl", 51));
        UI.put("tickerSymbol", ga.a.j("tickerSymbol", 52));
        UI.put("type", ga.a.j("type", 53));
        UI.put("url", ga.a.j("url", 54));
        UI.put("width", ga.a.j("width", 55));
        UI.put("worstRating", ga.a.j("worstRating", 56));
    }
}
