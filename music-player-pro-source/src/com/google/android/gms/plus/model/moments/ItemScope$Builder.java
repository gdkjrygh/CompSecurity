// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.pd;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class A
{

    private String CE;
    private String UO;
    private double agg;
    private double agh;
    private String aoA;
    private pd aoB;
    private String aoC;
    private String aoD;
    private List aoE;
    private String aoF;
    private String aoG;
    private String aoH;
    private String aoI;
    private String aoJ;
    private String aoK;
    private String aoL;
    private String aoM;
    private pd aoN;
    private String aoO;
    private String aoP;
    private String aoQ;
    private pd aoR;
    private pd aoS;
    private pd aoT;
    private List aoU;
    private String aoV;
    private String aoW;
    private String aoX;
    private String aoY;
    private pd aoZ;
    private final Set aon = new HashSet();
    private pd aoo;
    private List aop;
    private pd aoq;
    private String aor;
    private String aos;
    private String aot;
    private List aou;
    private int aov;
    private List aow;
    private pd aox;
    private List aoy;
    private String aoz;
    private String apa;
    private String apb;
    private String apc;
    private pd apd;
    private String ape;
    private String apf;
    private String apg;
    private String aph;
    private String mName;
    private String ov;
    private String vc;
    private String vf;

    public ItemScope build()
    {
        return new pd(aon, aoo, aop, aoq, aor, aos, aot, aou, aov, aow, aox, aoy, aoz, aoA, aoB, aoC, aoD, ov, aoE, aoF, aoG, aoH, UO, aoI, aoJ, aoK, aoL, aoM, aoN, aoO, aoP, CE, aoQ, aoR, agg, aoS, agh, mName, aoT, aoU, aoV, aoW, aoX, aoY, aoZ, apa, apb, apc, apd, ape, apf, vc, vf, apg, aph);
    }

    public aph setAbout(ItemScope itemscope)
    {
        aoo = (pd)itemscope;
        aon.add(Integer.valueOf(2));
        return this;
    }

    public aon setAdditionalName(List list)
    {
        aop = list;
        aon.add(Integer.valueOf(3));
        return this;
    }

    public aon setAddress(ItemScope itemscope)
    {
        aoq = (pd)itemscope;
        aon.add(Integer.valueOf(4));
        return this;
    }

    public aon setAddressCountry(String s)
    {
        aor = s;
        aon.add(Integer.valueOf(5));
        return this;
    }

    public aon setAddressLocality(String s)
    {
        aos = s;
        aon.add(Integer.valueOf(6));
        return this;
    }

    public aon setAddressRegion(String s)
    {
        aot = s;
        aon.add(Integer.valueOf(7));
        return this;
    }

    public aon setAssociated_media(List list)
    {
        aou = list;
        aon.add(Integer.valueOf(8));
        return this;
    }

    public aon setAttendeeCount(int i)
    {
        aov = i;
        aon.add(Integer.valueOf(9));
        return this;
    }

    public aon setAttendees(List list)
    {
        aow = list;
        aon.add(Integer.valueOf(10));
        return this;
    }

    public aon setAudio(ItemScope itemscope)
    {
        aox = (pd)itemscope;
        aon.add(Integer.valueOf(11));
        return this;
    }

    public aon setAuthor(List list)
    {
        aoy = list;
        aon.add(Integer.valueOf(12));
        return this;
    }

    public aon setBestRating(String s)
    {
        aoz = s;
        aon.add(Integer.valueOf(13));
        return this;
    }

    public aon setBirthDate(String s)
    {
        aoA = s;
        aon.add(Integer.valueOf(14));
        return this;
    }

    public aon setByArtist(ItemScope itemscope)
    {
        aoB = (pd)itemscope;
        aon.add(Integer.valueOf(15));
        return this;
    }

    public aon setCaption(String s)
    {
        aoC = s;
        aon.add(Integer.valueOf(16));
        return this;
    }

    public aon setContentSize(String s)
    {
        aoD = s;
        aon.add(Integer.valueOf(17));
        return this;
    }

    public aon setContentUrl(String s)
    {
        ov = s;
        aon.add(Integer.valueOf(18));
        return this;
    }

    public aon setContributor(List list)
    {
        aoE = list;
        aon.add(Integer.valueOf(19));
        return this;
    }

    public aon setDateCreated(String s)
    {
        aoF = s;
        aon.add(Integer.valueOf(20));
        return this;
    }

    public aon setDateModified(String s)
    {
        aoG = s;
        aon.add(Integer.valueOf(21));
        return this;
    }

    public aon setDatePublished(String s)
    {
        aoH = s;
        aon.add(Integer.valueOf(22));
        return this;
    }

    public aon setDescription(String s)
    {
        UO = s;
        aon.add(Integer.valueOf(23));
        return this;
    }

    public aon setDuration(String s)
    {
        aoI = s;
        aon.add(Integer.valueOf(24));
        return this;
    }

    public aon setEmbedUrl(String s)
    {
        aoJ = s;
        aon.add(Integer.valueOf(25));
        return this;
    }

    public aon setEndDate(String s)
    {
        aoK = s;
        aon.add(Integer.valueOf(26));
        return this;
    }

    public aon setFamilyName(String s)
    {
        aoL = s;
        aon.add(Integer.valueOf(27));
        return this;
    }

    public aon setGender(String s)
    {
        aoM = s;
        aon.add(Integer.valueOf(28));
        return this;
    }

    public aon setGeo(ItemScope itemscope)
    {
        aoN = (pd)itemscope;
        aon.add(Integer.valueOf(29));
        return this;
    }

    public aon setGivenName(String s)
    {
        aoO = s;
        aon.add(Integer.valueOf(30));
        return this;
    }

    public aon setHeight(String s)
    {
        aoP = s;
        aon.add(Integer.valueOf(31));
        return this;
    }

    public aon setId(String s)
    {
        CE = s;
        aon.add(Integer.valueOf(32));
        return this;
    }

    public aon setImage(String s)
    {
        aoQ = s;
        aon.add(Integer.valueOf(33));
        return this;
    }

    public aon setInAlbum(ItemScope itemscope)
    {
        aoR = (pd)itemscope;
        aon.add(Integer.valueOf(34));
        return this;
    }

    public aon setLatitude(double d)
    {
        agg = d;
        aon.add(Integer.valueOf(36));
        return this;
    }

    public aon setLocation(ItemScope itemscope)
    {
        aoS = (pd)itemscope;
        aon.add(Integer.valueOf(37));
        return this;
    }

    public aon setLongitude(double d)
    {
        agh = d;
        aon.add(Integer.valueOf(38));
        return this;
    }

    public aon setName(String s)
    {
        mName = s;
        aon.add(Integer.valueOf(39));
        return this;
    }

    public aon setPartOfTVSeries(ItemScope itemscope)
    {
        aoT = (pd)itemscope;
        aon.add(Integer.valueOf(40));
        return this;
    }

    public aon setPerformers(List list)
    {
        aoU = list;
        aon.add(Integer.valueOf(41));
        return this;
    }

    public aon setPlayerType(String s)
    {
        aoV = s;
        aon.add(Integer.valueOf(42));
        return this;
    }

    public aon setPostOfficeBoxNumber(String s)
    {
        aoW = s;
        aon.add(Integer.valueOf(43));
        return this;
    }

    public aon setPostalCode(String s)
    {
        aoX = s;
        aon.add(Integer.valueOf(44));
        return this;
    }

    public aon setRatingValue(String s)
    {
        aoY = s;
        aon.add(Integer.valueOf(45));
        return this;
    }

    public aon setReviewRating(ItemScope itemscope)
    {
        aoZ = (pd)itemscope;
        aon.add(Integer.valueOf(46));
        return this;
    }

    public aon setStartDate(String s)
    {
        apa = s;
        aon.add(Integer.valueOf(47));
        return this;
    }

    public aon setStreetAddress(String s)
    {
        apb = s;
        aon.add(Integer.valueOf(48));
        return this;
    }

    public aon setText(String s)
    {
        apc = s;
        aon.add(Integer.valueOf(49));
        return this;
    }

    public aon setThumbnail(ItemScope itemscope)
    {
        apd = (pd)itemscope;
        aon.add(Integer.valueOf(50));
        return this;
    }

    public aon setThumbnailUrl(String s)
    {
        ape = s;
        aon.add(Integer.valueOf(51));
        return this;
    }

    public aon setTickerSymbol(String s)
    {
        apf = s;
        aon.add(Integer.valueOf(52));
        return this;
    }

    public aon setType(String s)
    {
        vc = s;
        aon.add(Integer.valueOf(53));
        return this;
    }

    public aon setUrl(String s)
    {
        vf = s;
        aon.add(Integer.valueOf(54));
        return this;
    }

    public aon setWidth(String s)
    {
        apg = s;
        aon.add(Integer.valueOf(55));
        return this;
    }

    public aon setWorstRating(String s)
    {
        aph = s;
        aon.add(Integer.valueOf(56));
        return this;
    }

    public A()
    {
    }
}
