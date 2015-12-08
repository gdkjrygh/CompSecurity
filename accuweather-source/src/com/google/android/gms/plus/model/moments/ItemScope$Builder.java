// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.ko;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class A
{

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
    private final Set acp = new HashSet();
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

    public ItemScope build()
    {
        return new ko(acp, acq, acr, acs, act, acu, acv, acw, acx, acy, acz, acA, acB, acC, acD, acE, acF, mi, acG, acH, acI, acJ, Mm, acK, acL, acM, acN, acO, acP, acQ, acR, xD, acS, acT, Va, acU, Vb, mName, acV, acW, acX, acY, acZ, ada, adb, adc, add, ade, adf, adg, adh, qU, qV, adi, adj);
    }

    public adj setAbout(ItemScope itemscope)
    {
        acq = (ko)itemscope;
        acp.add(Integer.valueOf(2));
        return this;
    }

    public acp setAdditionalName(List list)
    {
        acr = list;
        acp.add(Integer.valueOf(3));
        return this;
    }

    public acp setAddress(ItemScope itemscope)
    {
        acs = (ko)itemscope;
        acp.add(Integer.valueOf(4));
        return this;
    }

    public acp setAddressCountry(String s)
    {
        act = s;
        acp.add(Integer.valueOf(5));
        return this;
    }

    public acp setAddressLocality(String s)
    {
        acu = s;
        acp.add(Integer.valueOf(6));
        return this;
    }

    public acp setAddressRegion(String s)
    {
        acv = s;
        acp.add(Integer.valueOf(7));
        return this;
    }

    public acp setAssociated_media(List list)
    {
        acw = list;
        acp.add(Integer.valueOf(8));
        return this;
    }

    public acp setAttendeeCount(int i)
    {
        acx = i;
        acp.add(Integer.valueOf(9));
        return this;
    }

    public acp setAttendees(List list)
    {
        acy = list;
        acp.add(Integer.valueOf(10));
        return this;
    }

    public acp setAudio(ItemScope itemscope)
    {
        acz = (ko)itemscope;
        acp.add(Integer.valueOf(11));
        return this;
    }

    public acp setAuthor(List list)
    {
        acA = list;
        acp.add(Integer.valueOf(12));
        return this;
    }

    public acp setBestRating(String s)
    {
        acB = s;
        acp.add(Integer.valueOf(13));
        return this;
    }

    public acp setBirthDate(String s)
    {
        acC = s;
        acp.add(Integer.valueOf(14));
        return this;
    }

    public acp setByArtist(ItemScope itemscope)
    {
        acD = (ko)itemscope;
        acp.add(Integer.valueOf(15));
        return this;
    }

    public acp setCaption(String s)
    {
        acE = s;
        acp.add(Integer.valueOf(16));
        return this;
    }

    public acp setContentSize(String s)
    {
        acF = s;
        acp.add(Integer.valueOf(17));
        return this;
    }

    public acp setContentUrl(String s)
    {
        mi = s;
        acp.add(Integer.valueOf(18));
        return this;
    }

    public acp setContributor(List list)
    {
        acG = list;
        acp.add(Integer.valueOf(19));
        return this;
    }

    public acp setDateCreated(String s)
    {
        acH = s;
        acp.add(Integer.valueOf(20));
        return this;
    }

    public acp setDateModified(String s)
    {
        acI = s;
        acp.add(Integer.valueOf(21));
        return this;
    }

    public acp setDatePublished(String s)
    {
        acJ = s;
        acp.add(Integer.valueOf(22));
        return this;
    }

    public acp setDescription(String s)
    {
        Mm = s;
        acp.add(Integer.valueOf(23));
        return this;
    }

    public acp setDuration(String s)
    {
        acK = s;
        acp.add(Integer.valueOf(24));
        return this;
    }

    public acp setEmbedUrl(String s)
    {
        acL = s;
        acp.add(Integer.valueOf(25));
        return this;
    }

    public acp setEndDate(String s)
    {
        acM = s;
        acp.add(Integer.valueOf(26));
        return this;
    }

    public acp setFamilyName(String s)
    {
        acN = s;
        acp.add(Integer.valueOf(27));
        return this;
    }

    public acp setGender(String s)
    {
        acO = s;
        acp.add(Integer.valueOf(28));
        return this;
    }

    public acp setGeo(ItemScope itemscope)
    {
        acP = (ko)itemscope;
        acp.add(Integer.valueOf(29));
        return this;
    }

    public acp setGivenName(String s)
    {
        acQ = s;
        acp.add(Integer.valueOf(30));
        return this;
    }

    public acp setHeight(String s)
    {
        acR = s;
        acp.add(Integer.valueOf(31));
        return this;
    }

    public acp setId(String s)
    {
        xD = s;
        acp.add(Integer.valueOf(32));
        return this;
    }

    public acp setImage(String s)
    {
        acS = s;
        acp.add(Integer.valueOf(33));
        return this;
    }

    public acp setInAlbum(ItemScope itemscope)
    {
        acT = (ko)itemscope;
        acp.add(Integer.valueOf(34));
        return this;
    }

    public acp setLatitude(double d)
    {
        Va = d;
        acp.add(Integer.valueOf(36));
        return this;
    }

    public acp setLocation(ItemScope itemscope)
    {
        acU = (ko)itemscope;
        acp.add(Integer.valueOf(37));
        return this;
    }

    public acp setLongitude(double d)
    {
        Vb = d;
        acp.add(Integer.valueOf(38));
        return this;
    }

    public acp setName(String s)
    {
        mName = s;
        acp.add(Integer.valueOf(39));
        return this;
    }

    public acp setPartOfTVSeries(ItemScope itemscope)
    {
        acV = (ko)itemscope;
        acp.add(Integer.valueOf(40));
        return this;
    }

    public acp setPerformers(List list)
    {
        acW = list;
        acp.add(Integer.valueOf(41));
        return this;
    }

    public acp setPlayerType(String s)
    {
        acX = s;
        acp.add(Integer.valueOf(42));
        return this;
    }

    public acp setPostOfficeBoxNumber(String s)
    {
        acY = s;
        acp.add(Integer.valueOf(43));
        return this;
    }

    public acp setPostalCode(String s)
    {
        acZ = s;
        acp.add(Integer.valueOf(44));
        return this;
    }

    public acp setRatingValue(String s)
    {
        ada = s;
        acp.add(Integer.valueOf(45));
        return this;
    }

    public acp setReviewRating(ItemScope itemscope)
    {
        adb = (ko)itemscope;
        acp.add(Integer.valueOf(46));
        return this;
    }

    public acp setStartDate(String s)
    {
        adc = s;
        acp.add(Integer.valueOf(47));
        return this;
    }

    public acp setStreetAddress(String s)
    {
        add = s;
        acp.add(Integer.valueOf(48));
        return this;
    }

    public acp setText(String s)
    {
        ade = s;
        acp.add(Integer.valueOf(49));
        return this;
    }

    public acp setThumbnail(ItemScope itemscope)
    {
        adf = (ko)itemscope;
        acp.add(Integer.valueOf(50));
        return this;
    }

    public acp setThumbnailUrl(String s)
    {
        adg = s;
        acp.add(Integer.valueOf(51));
        return this;
    }

    public acp setTickerSymbol(String s)
    {
        adh = s;
        acp.add(Integer.valueOf(52));
        return this;
    }

    public acp setType(String s)
    {
        qU = s;
        acp.add(Integer.valueOf(53));
        return this;
    }

    public acp setUrl(String s)
    {
        qV = s;
        acp.add(Integer.valueOf(54));
        return this;
    }

    public acp setWidth(String s)
    {
        adi = s;
        acp.add(Integer.valueOf(55));
        return this;
    }

    public acp setWorstRating(String s)
    {
        adj = s;
        acp.add(Integer.valueOf(56));
        return this;
    }

    public A()
    {
    }
}
