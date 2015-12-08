// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.fq;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
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

        public Builder setAbout(ItemScope itemscope)
        {
            rJ = (fq)itemscope;
            rI.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            rK = list;
            rI.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            rL = (fq)itemscope;
            rI.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            rM = s;
            rI.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            rN = s;
            rI.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            rO = s;
            rI.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            rP = list;
            rI.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            rQ = i;
            rI.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            rR = list;
            rI.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            rS = (fq)itemscope;
            rI.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            rT = list;
            rI.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            rU = s;
            rI.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            rV = s;
            rI.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            rW = (fq)itemscope;
            rI.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            rX = s;
            rI.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            rY = s;
            rI.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            rZ = s;
            rI.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            sa = list;
            rI.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            sb = s;
            rI.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            sc = s;
            rI.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            sd = s;
            rI.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            mo = s;
            rI.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            se = s;
            rI.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            sf = s;
            rI.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            sg = s;
            rI.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            sh = s;
            rI.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            si = s;
            rI.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            sj = (fq)itemscope;
            rI.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            sk = s;
            rI.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            sl = s;
            rI.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            sm = s;
            rI.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            sn = s;
            rI.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            so = (fq)itemscope;
            rI.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            oE = d;
            rI.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            sp = (fq)itemscope;
            rI.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            oF = d;
            rI.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            rI.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            sq = (fq)itemscope;
            rI.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            sr = list;
            rI.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            ss = s;
            rI.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            st = s;
            rI.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            su = s;
            rI.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            sv = s;
            rI.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            sw = (fq)itemscope;
            rI.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            sx = s;
            rI.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            sy = s;
            rI.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            sz = s;
            rI.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            sA = (fq)itemscope;
            rI.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            sB = s;
            rI.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            sC = s;
            rI.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            sD = s;
            rI.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            hN = s;
            rI.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            sE = s;
            rI.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            sF = s;
            rI.add(Integer.valueOf(56));
            return this;
        }

        public Builder()
        {
        }
    }


    public abstract ItemScope getAbout();

    public abstract List getAdditionalName();

    public abstract ItemScope getAddress();

    public abstract String getAddressCountry();

    public abstract String getAddressLocality();

    public abstract String getAddressRegion();

    public abstract List getAssociated_media();

    public abstract int getAttendeeCount();

    public abstract List getAttendees();

    public abstract ItemScope getAudio();

    public abstract List getAuthor();

    public abstract String getBestRating();

    public abstract String getBirthDate();

    public abstract ItemScope getByArtist();

    public abstract String getCaption();

    public abstract String getContentSize();

    public abstract String getContentUrl();

    public abstract List getContributor();

    public abstract String getDateCreated();

    public abstract String getDateModified();

    public abstract String getDatePublished();

    public abstract String getDescription();

    public abstract String getDuration();

    public abstract String getEmbedUrl();

    public abstract String getEndDate();

    public abstract String getFamilyName();

    public abstract String getGender();

    public abstract ItemScope getGeo();

    public abstract String getGivenName();

    public abstract String getHeight();

    public abstract String getId();

    public abstract String getImage();

    public abstract ItemScope getInAlbum();

    public abstract double getLatitude();

    public abstract ItemScope getLocation();

    public abstract double getLongitude();

    public abstract String getName();

    public abstract ItemScope getPartOfTVSeries();

    public abstract List getPerformers();

    public abstract String getPlayerType();

    public abstract String getPostOfficeBoxNumber();

    public abstract String getPostalCode();

    public abstract String getRatingValue();

    public abstract ItemScope getReviewRating();

    public abstract String getStartDate();

    public abstract String getStreetAddress();

    public abstract String getText();

    public abstract ItemScope getThumbnail();

    public abstract String getThumbnailUrl();

    public abstract String getTickerSymbol();

    public abstract String getType();

    public abstract String getUrl();

    public abstract String getWidth();

    public abstract String getWorstRating();

    public abstract boolean hasAbout();

    public abstract boolean hasAdditionalName();

    public abstract boolean hasAddress();

    public abstract boolean hasAddressCountry();

    public abstract boolean hasAddressLocality();

    public abstract boolean hasAddressRegion();

    public abstract boolean hasAssociated_media();

    public abstract boolean hasAttendeeCount();

    public abstract boolean hasAttendees();

    public abstract boolean hasAudio();

    public abstract boolean hasAuthor();

    public abstract boolean hasBestRating();

    public abstract boolean hasBirthDate();

    public abstract boolean hasByArtist();

    public abstract boolean hasCaption();

    public abstract boolean hasContentSize();

    public abstract boolean hasContentUrl();

    public abstract boolean hasContributor();

    public abstract boolean hasDateCreated();

    public abstract boolean hasDateModified();

    public abstract boolean hasDatePublished();

    public abstract boolean hasDescription();

    public abstract boolean hasDuration();

    public abstract boolean hasEmbedUrl();

    public abstract boolean hasEndDate();

    public abstract boolean hasFamilyName();

    public abstract boolean hasGender();

    public abstract boolean hasGeo();

    public abstract boolean hasGivenName();

    public abstract boolean hasHeight();

    public abstract boolean hasId();

    public abstract boolean hasImage();

    public abstract boolean hasInAlbum();

    public abstract boolean hasLatitude();

    public abstract boolean hasLocation();

    public abstract boolean hasLongitude();

    public abstract boolean hasName();

    public abstract boolean hasPartOfTVSeries();

    public abstract boolean hasPerformers();

    public abstract boolean hasPlayerType();

    public abstract boolean hasPostOfficeBoxNumber();

    public abstract boolean hasPostalCode();

    public abstract boolean hasRatingValue();

    public abstract boolean hasReviewRating();

    public abstract boolean hasStartDate();

    public abstract boolean hasStreetAddress();

    public abstract boolean hasText();

    public abstract boolean hasThumbnail();

    public abstract boolean hasThumbnailUrl();

    public abstract boolean hasTickerSymbol();

    public abstract boolean hasType();

    public abstract boolean hasUrl();

    public abstract boolean hasWidth();

    public abstract boolean hasWorstRating();
}
