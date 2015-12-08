// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.ic;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class A
{

    private String HD;
    private double NX;
    private double NY;
    private String Rd;
    private final Set UJ = new HashSet();
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

    public ItemScope build()
    {
        return new ic(UJ, UK, UL, UM, UN, UO, UP, UQ, UR, US, UT, UU, UV, UW, UX, UY, UZ, lY, Va, Vb, Vc, Vd, HD, Ve, Vf, Vg, Vh, Vi, Vj, Vk, Vl, wp, Vm, Vn, NX, Vo, NY, mName, Vp, Vq, Vr, Vs, Vt, Vu, Vv, Vw, Vx, Vy, Vz, VA, VB, Rd, ro, VC, VD);
    }

    public VD setAbout(ItemScope itemscope)
    {
        UK = (ic)itemscope;
        UJ.add(Integer.valueOf(2));
        return this;
    }

    public UJ setAdditionalName(List list)
    {
        UL = list;
        UJ.add(Integer.valueOf(3));
        return this;
    }

    public UJ setAddress(ItemScope itemscope)
    {
        UM = (ic)itemscope;
        UJ.add(Integer.valueOf(4));
        return this;
    }

    public UJ setAddressCountry(String s)
    {
        UN = s;
        UJ.add(Integer.valueOf(5));
        return this;
    }

    public UJ setAddressLocality(String s)
    {
        UO = s;
        UJ.add(Integer.valueOf(6));
        return this;
    }

    public UJ setAddressRegion(String s)
    {
        UP = s;
        UJ.add(Integer.valueOf(7));
        return this;
    }

    public UJ setAssociated_media(List list)
    {
        UQ = list;
        UJ.add(Integer.valueOf(8));
        return this;
    }

    public UJ setAttendeeCount(int i)
    {
        UR = i;
        UJ.add(Integer.valueOf(9));
        return this;
    }

    public UJ setAttendees(List list)
    {
        US = list;
        UJ.add(Integer.valueOf(10));
        return this;
    }

    public UJ setAudio(ItemScope itemscope)
    {
        UT = (ic)itemscope;
        UJ.add(Integer.valueOf(11));
        return this;
    }

    public UJ setAuthor(List list)
    {
        UU = list;
        UJ.add(Integer.valueOf(12));
        return this;
    }

    public UJ setBestRating(String s)
    {
        UV = s;
        UJ.add(Integer.valueOf(13));
        return this;
    }

    public UJ setBirthDate(String s)
    {
        UW = s;
        UJ.add(Integer.valueOf(14));
        return this;
    }

    public UJ setByArtist(ItemScope itemscope)
    {
        UX = (ic)itemscope;
        UJ.add(Integer.valueOf(15));
        return this;
    }

    public UJ setCaption(String s)
    {
        UY = s;
        UJ.add(Integer.valueOf(16));
        return this;
    }

    public UJ setContentSize(String s)
    {
        UZ = s;
        UJ.add(Integer.valueOf(17));
        return this;
    }

    public UJ setContentUrl(String s)
    {
        lY = s;
        UJ.add(Integer.valueOf(18));
        return this;
    }

    public UJ setContributor(List list)
    {
        Va = list;
        UJ.add(Integer.valueOf(19));
        return this;
    }

    public UJ setDateCreated(String s)
    {
        Vb = s;
        UJ.add(Integer.valueOf(20));
        return this;
    }

    public UJ setDateModified(String s)
    {
        Vc = s;
        UJ.add(Integer.valueOf(21));
        return this;
    }

    public UJ setDatePublished(String s)
    {
        Vd = s;
        UJ.add(Integer.valueOf(22));
        return this;
    }

    public UJ setDescription(String s)
    {
        HD = s;
        UJ.add(Integer.valueOf(23));
        return this;
    }

    public UJ setDuration(String s)
    {
        Ve = s;
        UJ.add(Integer.valueOf(24));
        return this;
    }

    public UJ setEmbedUrl(String s)
    {
        Vf = s;
        UJ.add(Integer.valueOf(25));
        return this;
    }

    public UJ setEndDate(String s)
    {
        Vg = s;
        UJ.add(Integer.valueOf(26));
        return this;
    }

    public UJ setFamilyName(String s)
    {
        Vh = s;
        UJ.add(Integer.valueOf(27));
        return this;
    }

    public UJ setGender(String s)
    {
        Vi = s;
        UJ.add(Integer.valueOf(28));
        return this;
    }

    public UJ setGeo(ItemScope itemscope)
    {
        Vj = (ic)itemscope;
        UJ.add(Integer.valueOf(29));
        return this;
    }

    public UJ setGivenName(String s)
    {
        Vk = s;
        UJ.add(Integer.valueOf(30));
        return this;
    }

    public UJ setHeight(String s)
    {
        Vl = s;
        UJ.add(Integer.valueOf(31));
        return this;
    }

    public UJ setId(String s)
    {
        wp = s;
        UJ.add(Integer.valueOf(32));
        return this;
    }

    public UJ setImage(String s)
    {
        Vm = s;
        UJ.add(Integer.valueOf(33));
        return this;
    }

    public UJ setInAlbum(ItemScope itemscope)
    {
        Vn = (ic)itemscope;
        UJ.add(Integer.valueOf(34));
        return this;
    }

    public UJ setLatitude(double d)
    {
        NX = d;
        UJ.add(Integer.valueOf(36));
        return this;
    }

    public UJ setLocation(ItemScope itemscope)
    {
        Vo = (ic)itemscope;
        UJ.add(Integer.valueOf(37));
        return this;
    }

    public UJ setLongitude(double d)
    {
        NY = d;
        UJ.add(Integer.valueOf(38));
        return this;
    }

    public UJ setName(String s)
    {
        mName = s;
        UJ.add(Integer.valueOf(39));
        return this;
    }

    public UJ setPartOfTVSeries(ItemScope itemscope)
    {
        Vp = (ic)itemscope;
        UJ.add(Integer.valueOf(40));
        return this;
    }

    public UJ setPerformers(List list)
    {
        Vq = list;
        UJ.add(Integer.valueOf(41));
        return this;
    }

    public UJ setPlayerType(String s)
    {
        Vr = s;
        UJ.add(Integer.valueOf(42));
        return this;
    }

    public UJ setPostOfficeBoxNumber(String s)
    {
        Vs = s;
        UJ.add(Integer.valueOf(43));
        return this;
    }

    public UJ setPostalCode(String s)
    {
        Vt = s;
        UJ.add(Integer.valueOf(44));
        return this;
    }

    public UJ setRatingValue(String s)
    {
        Vu = s;
        UJ.add(Integer.valueOf(45));
        return this;
    }

    public UJ setReviewRating(ItemScope itemscope)
    {
        Vv = (ic)itemscope;
        UJ.add(Integer.valueOf(46));
        return this;
    }

    public UJ setStartDate(String s)
    {
        Vw = s;
        UJ.add(Integer.valueOf(47));
        return this;
    }

    public UJ setStreetAddress(String s)
    {
        Vx = s;
        UJ.add(Integer.valueOf(48));
        return this;
    }

    public UJ setText(String s)
    {
        Vy = s;
        UJ.add(Integer.valueOf(49));
        return this;
    }

    public UJ setThumbnail(ItemScope itemscope)
    {
        Vz = (ic)itemscope;
        UJ.add(Integer.valueOf(50));
        return this;
    }

    public UJ setThumbnailUrl(String s)
    {
        VA = s;
        UJ.add(Integer.valueOf(51));
        return this;
    }

    public UJ setTickerSymbol(String s)
    {
        VB = s;
        UJ.add(Integer.valueOf(52));
        return this;
    }

    public UJ setType(String s)
    {
        Rd = s;
        UJ.add(Integer.valueOf(53));
        return this;
    }

    public UJ setUrl(String s)
    {
        ro = s;
        UJ.add(Integer.valueOf(54));
        return this;
    }

    public UJ setWidth(String s)
    {
        VC = s;
        UJ.add(Integer.valueOf(55));
        return this;
    }

    public UJ setWorstRating(String s)
    {
        VD = s;
        UJ.add(Integer.valueOf(56));
        return this;
    }

    public A()
    {
    }
}
