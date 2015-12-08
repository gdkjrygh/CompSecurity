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
//            dw, fr

public final class fq extends dw
    implements SafeParcelable, ItemScope
{

    public static final fr CREATOR = new fr();
    private static final HashMap rH;
    private String hN;
    private final int iM;
    private String mName;
    private String mo;
    private double oE;
    private double oF;
    private final Set rI;
    private fq rJ;
    private List rK;
    private fq rL;
    private String rM;
    private String rN;
    private String rO;
    private List rP;
    private int rQ;
    private List rR;
    private fq rS;
    private List rT;
    private String rU;
    private String rV;
    private fq rW;
    private String rX;
    private String rY;
    private String rZ;
    private fq sA;
    private String sB;
    private String sC;
    private String sD;
    private String sE;
    private String sF;
    private List sa;
    private String sb;
    private String sc;
    private String sd;
    private String se;
    private String sf;
    private String sg;
    private String sh;
    private String si;
    private fq sj;
    private String sk;
    private String sl;
    private String sm;
    private String sn;
    private fq so;
    private fq sp;
    private fq sq;
    private List sr;
    private String ss;
    private String st;
    private String su;
    private String sv;
    private fq sw;
    private String sx;
    private String sy;
    private String sz;

    public fq()
    {
        iM = 1;
        rI = new HashSet();
    }

    fq(Set set, int i, fq fq1, List list, fq fq2, String s, String s1, 
            String s2, List list1, int j, List list2, fq fq3, List list3, String s3, 
            String s4, fq fq4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, fq fq5, String s17, String s18, String s19, String s20, fq fq6, 
            double d, fq fq7, double d1, String s21, fq fq8, 
            List list5, String s22, String s23, String s24, String s25, fq fq9, String s26, 
            String s27, String s28, fq fq10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        rI = set;
        iM = i;
        rJ = fq1;
        rK = list;
        rL = fq2;
        rM = s;
        rN = s1;
        rO = s2;
        rP = list1;
        rQ = j;
        rR = list2;
        rS = fq3;
        rT = list3;
        rU = s3;
        rV = s4;
        rW = fq4;
        rX = s5;
        rY = s6;
        rZ = s7;
        sa = list4;
        sb = s8;
        sc = s9;
        sd = s10;
        mo = s11;
        se = s12;
        sf = s13;
        sg = s14;
        sh = s15;
        si = s16;
        sj = fq5;
        sk = s17;
        sl = s18;
        sm = s19;
        sn = s20;
        so = fq6;
        oE = d;
        sp = fq7;
        oF = d1;
        mName = s21;
        sq = fq8;
        sr = list5;
        ss = s22;
        st = s23;
        su = s24;
        sv = s25;
        sw = fq9;
        sx = s26;
        sy = s27;
        sz = s28;
        sA = fq10;
        sB = s29;
        sC = s30;
        sD = s31;
        hN = s32;
        sE = s33;
        sF = s34;
    }

    public fq(Set set, fq fq1, List list, fq fq2, String s, String s1, String s2, 
            List list1, int i, List list2, fq fq3, List list3, String s3, String s4, 
            fq fq4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            fq fq5, String s17, String s18, String s19, String s20, fq fq6, double d, fq fq7, double d1, String s21, fq fq8, List list5, 
            String s22, String s23, String s24, String s25, fq fq9, String s26, String s27, 
            String s28, fq fq10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        rI = set;
        iM = 1;
        rJ = fq1;
        rK = list;
        rL = fq2;
        rM = s;
        rN = s1;
        rO = s2;
        rP = list1;
        rQ = i;
        rR = list2;
        rS = fq3;
        rT = list3;
        rU = s3;
        rV = s4;
        rW = fq4;
        rX = s5;
        rY = s6;
        rZ = s7;
        sa = list4;
        sb = s8;
        sc = s9;
        sd = s10;
        mo = s11;
        se = s12;
        sf = s13;
        sg = s14;
        sh = s15;
        si = s16;
        sj = fq5;
        sk = s17;
        sl = s18;
        sm = s19;
        sn = s20;
        so = fq6;
        oE = d;
        sp = fq7;
        oF = d1;
        mName = s21;
        sq = fq8;
        sr = list5;
        ss = s22;
        st = s23;
        su = s24;
        sv = s25;
        sw = fq9;
        sx = s26;
        sy = s27;
        sz = s28;
        sA = fq10;
        sB = s29;
        sC = s30;
        sD = s31;
        hN = s32;
        sE = s33;
        sF = s34;
    }

    protected Object D(String s)
    {
        return null;
    }

    protected boolean E(String s)
    {
        return false;
    }

    protected boolean a(dw.a a1)
    {
        return rI.contains(Integer.valueOf(a1.bw()));
    }

    protected Object b(dw.a a1)
    {
        switch (a1.bw())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.bw()).toString());

        case 2: // '\002'
            return rJ;

        case 3: // '\003'
            return rK;

        case 4: // '\004'
            return rL;

        case 5: // '\005'
            return rM;

        case 6: // '\006'
            return rN;

        case 7: // '\007'
            return rO;

        case 8: // '\b'
            return rP;

        case 9: // '\t'
            return Integer.valueOf(rQ);

        case 10: // '\n'
            return rR;

        case 11: // '\013'
            return rS;

        case 12: // '\f'
            return rT;

        case 13: // '\r'
            return rU;

        case 14: // '\016'
            return rV;

        case 15: // '\017'
            return rW;

        case 16: // '\020'
            return rX;

        case 17: // '\021'
            return rY;

        case 18: // '\022'
            return rZ;

        case 19: // '\023'
            return sa;

        case 20: // '\024'
            return sb;

        case 21: // '\025'
            return sc;

        case 22: // '\026'
            return sd;

        case 23: // '\027'
            return mo;

        case 24: // '\030'
            return se;

        case 25: // '\031'
            return sf;

        case 26: // '\032'
            return sg;

        case 27: // '\033'
            return sh;

        case 28: // '\034'
            return si;

        case 29: // '\035'
            return sj;

        case 30: // '\036'
            return sk;

        case 31: // '\037'
            return sl;

        case 32: // ' '
            return sm;

        case 33: // '!'
            return sn;

        case 34: // '"'
            return so;

        case 36: // '$'
            return Double.valueOf(oE);

        case 37: // '%'
            return sp;

        case 38: // '&'
            return Double.valueOf(oF);

        case 39: // '\''
            return mName;

        case 40: // '('
            return sq;

        case 41: // ')'
            return sr;

        case 42: // '*'
            return ss;

        case 43: // '+'
            return st;

        case 44: // ','
            return su;

        case 45: // '-'
            return sv;

        case 46: // '.'
            return sw;

        case 47: // '/'
            return sx;

        case 48: // '0'
            return sy;

        case 49: // '1'
            return sz;

        case 50: // '2'
            return sA;

        case 51: // '3'
            return sB;

        case 52: // '4'
            return sC;

        case 53: // '5'
            return sD;

        case 54: // '6'
            return hN;

        case 55: // '7'
            return sE;

        case 56: // '8'
            return sF;
        }
    }

    public HashMap bp()
    {
        return rH;
    }

    public int describeContents()
    {
        fr fr1 = CREATOR;
        return 0;
    }

    Set di()
    {
        return rI;
    }

    fq dj()
    {
        return rJ;
    }

    fq dk()
    {
        return rL;
    }

    List dl()
    {
        return rP;
    }

    List dm()
    {
        return rR;
    }

    fq dn()
    {
        return rS;
    }

    List _mthdo()
    {
        return rT;
    }

    fq dp()
    {
        return rW;
    }

    List dq()
    {
        return sa;
    }

    fq dr()
    {
        return sj;
    }

    fq ds()
    {
        return so;
    }

    fq dt()
    {
        return sp;
    }

    fq du()
    {
        return sq;
    }

    List dv()
    {
        return sr;
    }

    fq dw()
    {
        return sw;
    }

    fq dx()
    {
        return sA;
    }

    public fq dy()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof fq))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (fq)obj;
            dw.a a1;
label1:
            do
            {
                for (Iterator iterator = rH.values().iterator(); iterator.hasNext();)
                {
                    a1 = (dw.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((fq) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((fq) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((fq) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return dy();
    }

    public ItemScope getAbout()
    {
        return rJ;
    }

    public List getAdditionalName()
    {
        return rK;
    }

    public ItemScope getAddress()
    {
        return rL;
    }

    public String getAddressCountry()
    {
        return rM;
    }

    public String getAddressLocality()
    {
        return rN;
    }

    public String getAddressRegion()
    {
        return rO;
    }

    public List getAssociated_media()
    {
        return (ArrayList)rP;
    }

    public int getAttendeeCount()
    {
        return rQ;
    }

    public List getAttendees()
    {
        return (ArrayList)rR;
    }

    public ItemScope getAudio()
    {
        return rS;
    }

    public List getAuthor()
    {
        return (ArrayList)rT;
    }

    public String getBestRating()
    {
        return rU;
    }

    public String getBirthDate()
    {
        return rV;
    }

    public ItemScope getByArtist()
    {
        return rW;
    }

    public String getCaption()
    {
        return rX;
    }

    public String getContentSize()
    {
        return rY;
    }

    public String getContentUrl()
    {
        return rZ;
    }

    public List getContributor()
    {
        return (ArrayList)sa;
    }

    public String getDateCreated()
    {
        return sb;
    }

    public String getDateModified()
    {
        return sc;
    }

    public String getDatePublished()
    {
        return sd;
    }

    public String getDescription()
    {
        return mo;
    }

    public String getDuration()
    {
        return se;
    }

    public String getEmbedUrl()
    {
        return sf;
    }

    public String getEndDate()
    {
        return sg;
    }

    public String getFamilyName()
    {
        return sh;
    }

    public String getGender()
    {
        return si;
    }

    public ItemScope getGeo()
    {
        return sj;
    }

    public String getGivenName()
    {
        return sk;
    }

    public String getHeight()
    {
        return sl;
    }

    public String getId()
    {
        return sm;
    }

    public String getImage()
    {
        return sn;
    }

    public ItemScope getInAlbum()
    {
        return so;
    }

    public double getLatitude()
    {
        return oE;
    }

    public ItemScope getLocation()
    {
        return sp;
    }

    public double getLongitude()
    {
        return oF;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return sq;
    }

    public List getPerformers()
    {
        return (ArrayList)sr;
    }

    public String getPlayerType()
    {
        return ss;
    }

    public String getPostOfficeBoxNumber()
    {
        return st;
    }

    public String getPostalCode()
    {
        return su;
    }

    public String getRatingValue()
    {
        return sv;
    }

    public ItemScope getReviewRating()
    {
        return sw;
    }

    public String getStartDate()
    {
        return sx;
    }

    public String getStreetAddress()
    {
        return sy;
    }

    public String getText()
    {
        return sz;
    }

    public ItemScope getThumbnail()
    {
        return sA;
    }

    public String getThumbnailUrl()
    {
        return sB;
    }

    public String getTickerSymbol()
    {
        return sC;
    }

    public String getType()
    {
        return sD;
    }

    public String getUrl()
    {
        return hN;
    }

    int getVersionCode()
    {
        return iM;
    }

    public String getWidth()
    {
        return sE;
    }

    public String getWorstRating()
    {
        return sF;
    }

    public boolean hasAbout()
    {
        return rI.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return rI.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return rI.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return rI.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return rI.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return rI.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return rI.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return rI.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return rI.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return rI.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return rI.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return rI.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return rI.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return rI.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return rI.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return rI.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return rI.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return rI.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return rI.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return rI.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return rI.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return rI.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return rI.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return rI.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return rI.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return rI.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return rI.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return rI.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return rI.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return rI.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return rI.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return rI.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return rI.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return rI.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return rI.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return rI.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return rI.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return rI.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return rI.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return rI.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return rI.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return rI.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return rI.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return rI.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return rI.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return rI.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return rI.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return rI.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return rI.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return rI.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return rI.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return rI.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return rI.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return rI.contains(Integer.valueOf(56));
    }

    public int hashCode()
    {
        Iterator iterator = rH.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dw.a a1 = (dw.a)iterator.next();
            if (a(a1))
            {
                int j = a1.bw();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fr fr1 = CREATOR;
        fr.a(this, parcel, i);
    }

    static 
    {
        rH = new HashMap();
        rH.put("about", com.google.android.gms.internal.dw.a.a("about", 2, com/google/android/gms/internal/fq));
        rH.put("additionalName", com.google.android.gms.internal.dw.a.h("additionalName", 3));
        rH.put("address", com.google.android.gms.internal.dw.a.a("address", 4, com/google/android/gms/internal/fq));
        rH.put("addressCountry", com.google.android.gms.internal.dw.a.g("addressCountry", 5));
        rH.put("addressLocality", com.google.android.gms.internal.dw.a.g("addressLocality", 6));
        rH.put("addressRegion", com.google.android.gms.internal.dw.a.g("addressRegion", 7));
        rH.put("associated_media", com.google.android.gms.internal.dw.a.b("associated_media", 8, com/google/android/gms/internal/fq));
        rH.put("attendeeCount", com.google.android.gms.internal.dw.a.d("attendeeCount", 9));
        rH.put("attendees", com.google.android.gms.internal.dw.a.b("attendees", 10, com/google/android/gms/internal/fq));
        rH.put("audio", com.google.android.gms.internal.dw.a.a("audio", 11, com/google/android/gms/internal/fq));
        rH.put("author", com.google.android.gms.internal.dw.a.b("author", 12, com/google/android/gms/internal/fq));
        rH.put("bestRating", com.google.android.gms.internal.dw.a.g("bestRating", 13));
        rH.put("birthDate", com.google.android.gms.internal.dw.a.g("birthDate", 14));
        rH.put("byArtist", com.google.android.gms.internal.dw.a.a("byArtist", 15, com/google/android/gms/internal/fq));
        rH.put("caption", com.google.android.gms.internal.dw.a.g("caption", 16));
        rH.put("contentSize", com.google.android.gms.internal.dw.a.g("contentSize", 17));
        rH.put("contentUrl", com.google.android.gms.internal.dw.a.g("contentUrl", 18));
        rH.put("contributor", com.google.android.gms.internal.dw.a.b("contributor", 19, com/google/android/gms/internal/fq));
        rH.put("dateCreated", com.google.android.gms.internal.dw.a.g("dateCreated", 20));
        rH.put("dateModified", com.google.android.gms.internal.dw.a.g("dateModified", 21));
        rH.put("datePublished", com.google.android.gms.internal.dw.a.g("datePublished", 22));
        rH.put("description", com.google.android.gms.internal.dw.a.g("description", 23));
        rH.put("duration", com.google.android.gms.internal.dw.a.g("duration", 24));
        rH.put("embedUrl", com.google.android.gms.internal.dw.a.g("embedUrl", 25));
        rH.put("endDate", com.google.android.gms.internal.dw.a.g("endDate", 26));
        rH.put("familyName", com.google.android.gms.internal.dw.a.g("familyName", 27));
        rH.put("gender", com.google.android.gms.internal.dw.a.g("gender", 28));
        rH.put("geo", com.google.android.gms.internal.dw.a.a("geo", 29, com/google/android/gms/internal/fq));
        rH.put("givenName", com.google.android.gms.internal.dw.a.g("givenName", 30));
        rH.put("height", com.google.android.gms.internal.dw.a.g("height", 31));
        rH.put("id", com.google.android.gms.internal.dw.a.g("id", 32));
        rH.put("image", com.google.android.gms.internal.dw.a.g("image", 33));
        rH.put("inAlbum", com.google.android.gms.internal.dw.a.a("inAlbum", 34, com/google/android/gms/internal/fq));
        rH.put("latitude", com.google.android.gms.internal.dw.a.e("latitude", 36));
        rH.put("location", com.google.android.gms.internal.dw.a.a("location", 37, com/google/android/gms/internal/fq));
        rH.put("longitude", com.google.android.gms.internal.dw.a.e("longitude", 38));
        rH.put("name", com.google.android.gms.internal.dw.a.g("name", 39));
        rH.put("partOfTVSeries", com.google.android.gms.internal.dw.a.a("partOfTVSeries", 40, com/google/android/gms/internal/fq));
        rH.put("performers", com.google.android.gms.internal.dw.a.b("performers", 41, com/google/android/gms/internal/fq));
        rH.put("playerType", com.google.android.gms.internal.dw.a.g("playerType", 42));
        rH.put("postOfficeBoxNumber", com.google.android.gms.internal.dw.a.g("postOfficeBoxNumber", 43));
        rH.put("postalCode", com.google.android.gms.internal.dw.a.g("postalCode", 44));
        rH.put("ratingValue", com.google.android.gms.internal.dw.a.g("ratingValue", 45));
        rH.put("reviewRating", com.google.android.gms.internal.dw.a.a("reviewRating", 46, com/google/android/gms/internal/fq));
        rH.put("startDate", com.google.android.gms.internal.dw.a.g("startDate", 47));
        rH.put("streetAddress", com.google.android.gms.internal.dw.a.g("streetAddress", 48));
        rH.put("text", com.google.android.gms.internal.dw.a.g("text", 49));
        rH.put("thumbnail", com.google.android.gms.internal.dw.a.a("thumbnail", 50, com/google/android/gms/internal/fq));
        rH.put("thumbnailUrl", com.google.android.gms.internal.dw.a.g("thumbnailUrl", 51));
        rH.put("tickerSymbol", com.google.android.gms.internal.dw.a.g("tickerSymbol", 52));
        rH.put("type", com.google.android.gms.internal.dw.a.g("type", 53));
        rH.put("url", com.google.android.gms.internal.dw.a.g("url", 54));
        rH.put("width", com.google.android.gms.internal.dw.a.g("width", 55));
        rH.put("worstRating", com.google.android.gms.internal.dw.a.g("worstRating", 56));
    }
}
