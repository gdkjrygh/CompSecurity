// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.fq;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class A
{

    private String hN;
    private String mName;
    private String mo;
    private double oE;
    private double oF;
    private final Set rI = new HashSet();
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

    public ItemScope build()
    {
        return new fq(rI, rJ, rK, rL, rM, rN, rO, rP, rQ, rR, rS, rT, rU, rV, rW, rX, rY, rZ, sa, sb, sc, sd, mo, se, sf, sg, sh, si, sj, sk, sl, sm, sn, so, oE, sp, oF, mName, sq, sr, ss, st, su, sv, sw, sx, sy, sz, sA, sB, sC, sD, hN, sE, sF);
    }

    public sF setAbout(ItemScope itemscope)
    {
        rJ = (fq)itemscope;
        rI.add(Integer.valueOf(2));
        return this;
    }

    public rI setAdditionalName(List list)
    {
        rK = list;
        rI.add(Integer.valueOf(3));
        return this;
    }

    public rI setAddress(ItemScope itemscope)
    {
        rL = (fq)itemscope;
        rI.add(Integer.valueOf(4));
        return this;
    }

    public rI setAddressCountry(String s)
    {
        rM = s;
        rI.add(Integer.valueOf(5));
        return this;
    }

    public rI setAddressLocality(String s)
    {
        rN = s;
        rI.add(Integer.valueOf(6));
        return this;
    }

    public rI setAddressRegion(String s)
    {
        rO = s;
        rI.add(Integer.valueOf(7));
        return this;
    }

    public rI setAssociated_media(List list)
    {
        rP = list;
        rI.add(Integer.valueOf(8));
        return this;
    }

    public rI setAttendeeCount(int i)
    {
        rQ = i;
        rI.add(Integer.valueOf(9));
        return this;
    }

    public rI setAttendees(List list)
    {
        rR = list;
        rI.add(Integer.valueOf(10));
        return this;
    }

    public rI setAudio(ItemScope itemscope)
    {
        rS = (fq)itemscope;
        rI.add(Integer.valueOf(11));
        return this;
    }

    public rI setAuthor(List list)
    {
        rT = list;
        rI.add(Integer.valueOf(12));
        return this;
    }

    public rI setBestRating(String s)
    {
        rU = s;
        rI.add(Integer.valueOf(13));
        return this;
    }

    public rI setBirthDate(String s)
    {
        rV = s;
        rI.add(Integer.valueOf(14));
        return this;
    }

    public rI setByArtist(ItemScope itemscope)
    {
        rW = (fq)itemscope;
        rI.add(Integer.valueOf(15));
        return this;
    }

    public rI setCaption(String s)
    {
        rX = s;
        rI.add(Integer.valueOf(16));
        return this;
    }

    public rI setContentSize(String s)
    {
        rY = s;
        rI.add(Integer.valueOf(17));
        return this;
    }

    public rI setContentUrl(String s)
    {
        rZ = s;
        rI.add(Integer.valueOf(18));
        return this;
    }

    public rI setContributor(List list)
    {
        sa = list;
        rI.add(Integer.valueOf(19));
        return this;
    }

    public rI setDateCreated(String s)
    {
        sb = s;
        rI.add(Integer.valueOf(20));
        return this;
    }

    public rI setDateModified(String s)
    {
        sc = s;
        rI.add(Integer.valueOf(21));
        return this;
    }

    public rI setDatePublished(String s)
    {
        sd = s;
        rI.add(Integer.valueOf(22));
        return this;
    }

    public rI setDescription(String s)
    {
        mo = s;
        rI.add(Integer.valueOf(23));
        return this;
    }

    public rI setDuration(String s)
    {
        se = s;
        rI.add(Integer.valueOf(24));
        return this;
    }

    public rI setEmbedUrl(String s)
    {
        sf = s;
        rI.add(Integer.valueOf(25));
        return this;
    }

    public rI setEndDate(String s)
    {
        sg = s;
        rI.add(Integer.valueOf(26));
        return this;
    }

    public rI setFamilyName(String s)
    {
        sh = s;
        rI.add(Integer.valueOf(27));
        return this;
    }

    public rI setGender(String s)
    {
        si = s;
        rI.add(Integer.valueOf(28));
        return this;
    }

    public rI setGeo(ItemScope itemscope)
    {
        sj = (fq)itemscope;
        rI.add(Integer.valueOf(29));
        return this;
    }

    public rI setGivenName(String s)
    {
        sk = s;
        rI.add(Integer.valueOf(30));
        return this;
    }

    public rI setHeight(String s)
    {
        sl = s;
        rI.add(Integer.valueOf(31));
        return this;
    }

    public rI setId(String s)
    {
        sm = s;
        rI.add(Integer.valueOf(32));
        return this;
    }

    public rI setImage(String s)
    {
        sn = s;
        rI.add(Integer.valueOf(33));
        return this;
    }

    public rI setInAlbum(ItemScope itemscope)
    {
        so = (fq)itemscope;
        rI.add(Integer.valueOf(34));
        return this;
    }

    public rI setLatitude(double d)
    {
        oE = d;
        rI.add(Integer.valueOf(36));
        return this;
    }

    public rI setLocation(ItemScope itemscope)
    {
        sp = (fq)itemscope;
        rI.add(Integer.valueOf(37));
        return this;
    }

    public rI setLongitude(double d)
    {
        oF = d;
        rI.add(Integer.valueOf(38));
        return this;
    }

    public rI setName(String s)
    {
        mName = s;
        rI.add(Integer.valueOf(39));
        return this;
    }

    public rI setPartOfTVSeries(ItemScope itemscope)
    {
        sq = (fq)itemscope;
        rI.add(Integer.valueOf(40));
        return this;
    }

    public rI setPerformers(List list)
    {
        sr = list;
        rI.add(Integer.valueOf(41));
        return this;
    }

    public rI setPlayerType(String s)
    {
        ss = s;
        rI.add(Integer.valueOf(42));
        return this;
    }

    public rI setPostOfficeBoxNumber(String s)
    {
        st = s;
        rI.add(Integer.valueOf(43));
        return this;
    }

    public rI setPostalCode(String s)
    {
        su = s;
        rI.add(Integer.valueOf(44));
        return this;
    }

    public rI setRatingValue(String s)
    {
        sv = s;
        rI.add(Integer.valueOf(45));
        return this;
    }

    public rI setReviewRating(ItemScope itemscope)
    {
        sw = (fq)itemscope;
        rI.add(Integer.valueOf(46));
        return this;
    }

    public rI setStartDate(String s)
    {
        sx = s;
        rI.add(Integer.valueOf(47));
        return this;
    }

    public rI setStreetAddress(String s)
    {
        sy = s;
        rI.add(Integer.valueOf(48));
        return this;
    }

    public rI setText(String s)
    {
        sz = s;
        rI.add(Integer.valueOf(49));
        return this;
    }

    public rI setThumbnail(ItemScope itemscope)
    {
        sA = (fq)itemscope;
        rI.add(Integer.valueOf(50));
        return this;
    }

    public rI setThumbnailUrl(String s)
    {
        sB = s;
        rI.add(Integer.valueOf(51));
        return this;
    }

    public rI setTickerSymbol(String s)
    {
        sC = s;
        rI.add(Integer.valueOf(52));
        return this;
    }

    public rI setType(String s)
    {
        sD = s;
        rI.add(Integer.valueOf(53));
        return this;
    }

    public rI setUrl(String s)
    {
        hN = s;
        rI.add(Integer.valueOf(54));
        return this;
    }

    public rI setWidth(String s)
    {
        sE = s;
        rI.add(Integer.valueOf(55));
        return this;
    }

    public rI setWorstRating(String s)
    {
        sF = s;
        rI.add(Integer.valueOf(56));
        return this;
    }

    public A()
    {
    }
}
