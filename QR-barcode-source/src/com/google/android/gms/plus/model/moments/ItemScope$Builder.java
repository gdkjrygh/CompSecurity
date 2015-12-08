// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.nu;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class A
{

    private String BL;
    private String Tr;
    private double aek;
    private double ael;
    private String amA;
    private String amB;
    private nu amC;
    private String amD;
    private String amE;
    private String amF;
    private nu amG;
    private nu amH;
    private nu amI;
    private List amJ;
    private String amK;
    private String amL;
    private String amM;
    private String amN;
    private nu amO;
    private String amP;
    private String amQ;
    private String amR;
    private nu amS;
    private String amT;
    private String amU;
    private String amV;
    private String amW;
    private final Set amc = new HashSet();
    private nu amd;
    private List ame;
    private nu amf;
    private String amg;
    private String amh;
    private String ami;
    private List amj;
    private int amk;
    private List aml;
    private nu amm;
    private List amn;
    private String amo;
    private String amp;
    private nu amq;
    private String amr;
    private String ams;
    private List amt;
    private String amu;
    private String amv;
    private String amw;
    private String amx;
    private String amy;
    private String amz;
    private String mName;
    private String ol;
    private String uO;
    private String uR;

    public ItemScope build()
    {
        return new nu(amc, amd, ame, amf, amg, amh, ami, amj, amk, aml, amm, amn, amo, amp, amq, amr, ams, ol, amt, amu, amv, amw, Tr, amx, amy, amz, amA, amB, amC, amD, amE, BL, amF, amG, aek, amH, ael, mName, amI, amJ, amK, amL, amM, amN, amO, amP, amQ, amR, amS, amT, amU, uO, uR, amV, amW);
    }

    public amW setAbout(ItemScope itemscope)
    {
        amd = (nu)itemscope;
        amc.add(Integer.valueOf(2));
        return this;
    }

    public amc setAdditionalName(List list)
    {
        ame = list;
        amc.add(Integer.valueOf(3));
        return this;
    }

    public amc setAddress(ItemScope itemscope)
    {
        amf = (nu)itemscope;
        amc.add(Integer.valueOf(4));
        return this;
    }

    public amc setAddressCountry(String s)
    {
        amg = s;
        amc.add(Integer.valueOf(5));
        return this;
    }

    public amc setAddressLocality(String s)
    {
        amh = s;
        amc.add(Integer.valueOf(6));
        return this;
    }

    public amc setAddressRegion(String s)
    {
        ami = s;
        amc.add(Integer.valueOf(7));
        return this;
    }

    public amc setAssociated_media(List list)
    {
        amj = list;
        amc.add(Integer.valueOf(8));
        return this;
    }

    public amc setAttendeeCount(int i)
    {
        amk = i;
        amc.add(Integer.valueOf(9));
        return this;
    }

    public amc setAttendees(List list)
    {
        aml = list;
        amc.add(Integer.valueOf(10));
        return this;
    }

    public amc setAudio(ItemScope itemscope)
    {
        amm = (nu)itemscope;
        amc.add(Integer.valueOf(11));
        return this;
    }

    public amc setAuthor(List list)
    {
        amn = list;
        amc.add(Integer.valueOf(12));
        return this;
    }

    public amc setBestRating(String s)
    {
        amo = s;
        amc.add(Integer.valueOf(13));
        return this;
    }

    public amc setBirthDate(String s)
    {
        amp = s;
        amc.add(Integer.valueOf(14));
        return this;
    }

    public amc setByArtist(ItemScope itemscope)
    {
        amq = (nu)itemscope;
        amc.add(Integer.valueOf(15));
        return this;
    }

    public amc setCaption(String s)
    {
        amr = s;
        amc.add(Integer.valueOf(16));
        return this;
    }

    public amc setContentSize(String s)
    {
        ams = s;
        amc.add(Integer.valueOf(17));
        return this;
    }

    public amc setContentUrl(String s)
    {
        ol = s;
        amc.add(Integer.valueOf(18));
        return this;
    }

    public amc setContributor(List list)
    {
        amt = list;
        amc.add(Integer.valueOf(19));
        return this;
    }

    public amc setDateCreated(String s)
    {
        amu = s;
        amc.add(Integer.valueOf(20));
        return this;
    }

    public amc setDateModified(String s)
    {
        amv = s;
        amc.add(Integer.valueOf(21));
        return this;
    }

    public amc setDatePublished(String s)
    {
        amw = s;
        amc.add(Integer.valueOf(22));
        return this;
    }

    public amc setDescription(String s)
    {
        Tr = s;
        amc.add(Integer.valueOf(23));
        return this;
    }

    public amc setDuration(String s)
    {
        amx = s;
        amc.add(Integer.valueOf(24));
        return this;
    }

    public amc setEmbedUrl(String s)
    {
        amy = s;
        amc.add(Integer.valueOf(25));
        return this;
    }

    public amc setEndDate(String s)
    {
        amz = s;
        amc.add(Integer.valueOf(26));
        return this;
    }

    public amc setFamilyName(String s)
    {
        amA = s;
        amc.add(Integer.valueOf(27));
        return this;
    }

    public amc setGender(String s)
    {
        amB = s;
        amc.add(Integer.valueOf(28));
        return this;
    }

    public amc setGeo(ItemScope itemscope)
    {
        amC = (nu)itemscope;
        amc.add(Integer.valueOf(29));
        return this;
    }

    public amc setGivenName(String s)
    {
        amD = s;
        amc.add(Integer.valueOf(30));
        return this;
    }

    public amc setHeight(String s)
    {
        amE = s;
        amc.add(Integer.valueOf(31));
        return this;
    }

    public amc setId(String s)
    {
        BL = s;
        amc.add(Integer.valueOf(32));
        return this;
    }

    public amc setImage(String s)
    {
        amF = s;
        amc.add(Integer.valueOf(33));
        return this;
    }

    public amc setInAlbum(ItemScope itemscope)
    {
        amG = (nu)itemscope;
        amc.add(Integer.valueOf(34));
        return this;
    }

    public amc setLatitude(double d)
    {
        aek = d;
        amc.add(Integer.valueOf(36));
        return this;
    }

    public amc setLocation(ItemScope itemscope)
    {
        amH = (nu)itemscope;
        amc.add(Integer.valueOf(37));
        return this;
    }

    public amc setLongitude(double d)
    {
        ael = d;
        amc.add(Integer.valueOf(38));
        return this;
    }

    public amc setName(String s)
    {
        mName = s;
        amc.add(Integer.valueOf(39));
        return this;
    }

    public amc setPartOfTVSeries(ItemScope itemscope)
    {
        amI = (nu)itemscope;
        amc.add(Integer.valueOf(40));
        return this;
    }

    public amc setPerformers(List list)
    {
        amJ = list;
        amc.add(Integer.valueOf(41));
        return this;
    }

    public amc setPlayerType(String s)
    {
        amK = s;
        amc.add(Integer.valueOf(42));
        return this;
    }

    public amc setPostOfficeBoxNumber(String s)
    {
        amL = s;
        amc.add(Integer.valueOf(43));
        return this;
    }

    public amc setPostalCode(String s)
    {
        amM = s;
        amc.add(Integer.valueOf(44));
        return this;
    }

    public amc setRatingValue(String s)
    {
        amN = s;
        amc.add(Integer.valueOf(45));
        return this;
    }

    public amc setReviewRating(ItemScope itemscope)
    {
        amO = (nu)itemscope;
        amc.add(Integer.valueOf(46));
        return this;
    }

    public amc setStartDate(String s)
    {
        amP = s;
        amc.add(Integer.valueOf(47));
        return this;
    }

    public amc setStreetAddress(String s)
    {
        amQ = s;
        amc.add(Integer.valueOf(48));
        return this;
    }

    public amc setText(String s)
    {
        amR = s;
        amc.add(Integer.valueOf(49));
        return this;
    }

    public amc setThumbnail(ItemScope itemscope)
    {
        amS = (nu)itemscope;
        amc.add(Integer.valueOf(50));
        return this;
    }

    public amc setThumbnailUrl(String s)
    {
        amT = s;
        amc.add(Integer.valueOf(51));
        return this;
    }

    public amc setTickerSymbol(String s)
    {
        amU = s;
        amc.add(Integer.valueOf(52));
        return this;
    }

    public amc setType(String s)
    {
        uO = s;
        amc.add(Integer.valueOf(53));
        return this;
    }

    public amc setUrl(String s)
    {
        uR = s;
        amc.add(Integer.valueOf(54));
        return this;
    }

    public amc setWidth(String s)
    {
        amV = s;
        amc.add(Integer.valueOf(55));
        return this;
    }

    public amc setWorstRating(String s)
    {
        amW = s;
        amc.add(Integer.valueOf(56));
        return this;
    }

    public A()
    {
    }
}
