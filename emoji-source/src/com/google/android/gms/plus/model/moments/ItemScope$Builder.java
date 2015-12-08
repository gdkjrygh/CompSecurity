// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.kn;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class A
{

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
    private final Set acs = new HashSet();
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

    public ItemScope build()
    {
        return new kn(acs, act, acu, acv, acw, acx, acy, acz, acA, acB, acC, acD, acE, acF, acG, acH, acI, mk, acJ, acK, acL, acM, Mp, acN, acO, acP, acQ, acR, acS, acT, acU, xG, acV, acW, Vd, acX, Ve, mName, acY, acZ, ada, adb, adc, add, ade, adf, adg, adh, adi, adj, adk, qX, qY, adl, adm);
    }

    public adm setAbout(ItemScope itemscope)
    {
        act = (kn)itemscope;
        acs.add(Integer.valueOf(2));
        return this;
    }

    public acs setAdditionalName(List list)
    {
        acu = list;
        acs.add(Integer.valueOf(3));
        return this;
    }

    public acs setAddress(ItemScope itemscope)
    {
        acv = (kn)itemscope;
        acs.add(Integer.valueOf(4));
        return this;
    }

    public acs setAddressCountry(String s)
    {
        acw = s;
        acs.add(Integer.valueOf(5));
        return this;
    }

    public acs setAddressLocality(String s)
    {
        acx = s;
        acs.add(Integer.valueOf(6));
        return this;
    }

    public acs setAddressRegion(String s)
    {
        acy = s;
        acs.add(Integer.valueOf(7));
        return this;
    }

    public acs setAssociated_media(List list)
    {
        acz = list;
        acs.add(Integer.valueOf(8));
        return this;
    }

    public acs setAttendeeCount(int i)
    {
        acA = i;
        acs.add(Integer.valueOf(9));
        return this;
    }

    public acs setAttendees(List list)
    {
        acB = list;
        acs.add(Integer.valueOf(10));
        return this;
    }

    public acs setAudio(ItemScope itemscope)
    {
        acC = (kn)itemscope;
        acs.add(Integer.valueOf(11));
        return this;
    }

    public acs setAuthor(List list)
    {
        acD = list;
        acs.add(Integer.valueOf(12));
        return this;
    }

    public acs setBestRating(String s)
    {
        acE = s;
        acs.add(Integer.valueOf(13));
        return this;
    }

    public acs setBirthDate(String s)
    {
        acF = s;
        acs.add(Integer.valueOf(14));
        return this;
    }

    public acs setByArtist(ItemScope itemscope)
    {
        acG = (kn)itemscope;
        acs.add(Integer.valueOf(15));
        return this;
    }

    public acs setCaption(String s)
    {
        acH = s;
        acs.add(Integer.valueOf(16));
        return this;
    }

    public acs setContentSize(String s)
    {
        acI = s;
        acs.add(Integer.valueOf(17));
        return this;
    }

    public acs setContentUrl(String s)
    {
        mk = s;
        acs.add(Integer.valueOf(18));
        return this;
    }

    public acs setContributor(List list)
    {
        acJ = list;
        acs.add(Integer.valueOf(19));
        return this;
    }

    public acs setDateCreated(String s)
    {
        acK = s;
        acs.add(Integer.valueOf(20));
        return this;
    }

    public acs setDateModified(String s)
    {
        acL = s;
        acs.add(Integer.valueOf(21));
        return this;
    }

    public acs setDatePublished(String s)
    {
        acM = s;
        acs.add(Integer.valueOf(22));
        return this;
    }

    public acs setDescription(String s)
    {
        Mp = s;
        acs.add(Integer.valueOf(23));
        return this;
    }

    public acs setDuration(String s)
    {
        acN = s;
        acs.add(Integer.valueOf(24));
        return this;
    }

    public acs setEmbedUrl(String s)
    {
        acO = s;
        acs.add(Integer.valueOf(25));
        return this;
    }

    public acs setEndDate(String s)
    {
        acP = s;
        acs.add(Integer.valueOf(26));
        return this;
    }

    public acs setFamilyName(String s)
    {
        acQ = s;
        acs.add(Integer.valueOf(27));
        return this;
    }

    public acs setGender(String s)
    {
        acR = s;
        acs.add(Integer.valueOf(28));
        return this;
    }

    public acs setGeo(ItemScope itemscope)
    {
        acS = (kn)itemscope;
        acs.add(Integer.valueOf(29));
        return this;
    }

    public acs setGivenName(String s)
    {
        acT = s;
        acs.add(Integer.valueOf(30));
        return this;
    }

    public acs setHeight(String s)
    {
        acU = s;
        acs.add(Integer.valueOf(31));
        return this;
    }

    public acs setId(String s)
    {
        xG = s;
        acs.add(Integer.valueOf(32));
        return this;
    }

    public acs setImage(String s)
    {
        acV = s;
        acs.add(Integer.valueOf(33));
        return this;
    }

    public acs setInAlbum(ItemScope itemscope)
    {
        acW = (kn)itemscope;
        acs.add(Integer.valueOf(34));
        return this;
    }

    public acs setLatitude(double d)
    {
        Vd = d;
        acs.add(Integer.valueOf(36));
        return this;
    }

    public acs setLocation(ItemScope itemscope)
    {
        acX = (kn)itemscope;
        acs.add(Integer.valueOf(37));
        return this;
    }

    public acs setLongitude(double d)
    {
        Ve = d;
        acs.add(Integer.valueOf(38));
        return this;
    }

    public acs setName(String s)
    {
        mName = s;
        acs.add(Integer.valueOf(39));
        return this;
    }

    public acs setPartOfTVSeries(ItemScope itemscope)
    {
        acY = (kn)itemscope;
        acs.add(Integer.valueOf(40));
        return this;
    }

    public acs setPerformers(List list)
    {
        acZ = list;
        acs.add(Integer.valueOf(41));
        return this;
    }

    public acs setPlayerType(String s)
    {
        ada = s;
        acs.add(Integer.valueOf(42));
        return this;
    }

    public acs setPostOfficeBoxNumber(String s)
    {
        adb = s;
        acs.add(Integer.valueOf(43));
        return this;
    }

    public acs setPostalCode(String s)
    {
        adc = s;
        acs.add(Integer.valueOf(44));
        return this;
    }

    public acs setRatingValue(String s)
    {
        add = s;
        acs.add(Integer.valueOf(45));
        return this;
    }

    public acs setReviewRating(ItemScope itemscope)
    {
        ade = (kn)itemscope;
        acs.add(Integer.valueOf(46));
        return this;
    }

    public acs setStartDate(String s)
    {
        adf = s;
        acs.add(Integer.valueOf(47));
        return this;
    }

    public acs setStreetAddress(String s)
    {
        adg = s;
        acs.add(Integer.valueOf(48));
        return this;
    }

    public acs setText(String s)
    {
        adh = s;
        acs.add(Integer.valueOf(49));
        return this;
    }

    public acs setThumbnail(ItemScope itemscope)
    {
        adi = (kn)itemscope;
        acs.add(Integer.valueOf(50));
        return this;
    }

    public acs setThumbnailUrl(String s)
    {
        adj = s;
        acs.add(Integer.valueOf(51));
        return this;
    }

    public acs setTickerSymbol(String s)
    {
        adk = s;
        acs.add(Integer.valueOf(52));
        return this;
    }

    public acs setType(String s)
    {
        qX = s;
        acs.add(Integer.valueOf(53));
        return this;
    }

    public acs setUrl(String s)
    {
        qY = s;
        acs.add(Integer.valueOf(54));
        return this;
    }

    public acs setWidth(String s)
    {
        adl = s;
        acs.add(Integer.valueOf(55));
        return this;
    }

    public acs setWorstRating(String s)
    {
        adm = s;
        acs.add(Integer.valueOf(56));
        return this;
    }

    public A()
    {
    }
}
