// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.ic;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
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

        public Builder setAbout(ItemScope itemscope)
        {
            UK = (ic)itemscope;
            UJ.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            UL = list;
            UJ.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            UM = (ic)itemscope;
            UJ.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            UN = s;
            UJ.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            UO = s;
            UJ.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            UP = s;
            UJ.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            UQ = list;
            UJ.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            UR = i;
            UJ.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            US = list;
            UJ.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            UT = (ic)itemscope;
            UJ.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            UU = list;
            UJ.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            UV = s;
            UJ.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            UW = s;
            UJ.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            UX = (ic)itemscope;
            UJ.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            UY = s;
            UJ.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            UZ = s;
            UJ.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            lY = s;
            UJ.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            Va = list;
            UJ.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            Vb = s;
            UJ.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            Vc = s;
            UJ.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            Vd = s;
            UJ.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            HD = s;
            UJ.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            Ve = s;
            UJ.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            Vf = s;
            UJ.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            Vg = s;
            UJ.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            Vh = s;
            UJ.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            Vi = s;
            UJ.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            Vj = (ic)itemscope;
            UJ.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            Vk = s;
            UJ.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            Vl = s;
            UJ.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            wp = s;
            UJ.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            Vm = s;
            UJ.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            Vn = (ic)itemscope;
            UJ.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            NX = d;
            UJ.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            Vo = (ic)itemscope;
            UJ.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            NY = d;
            UJ.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            UJ.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            Vp = (ic)itemscope;
            UJ.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            Vq = list;
            UJ.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            Vr = s;
            UJ.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            Vs = s;
            UJ.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            Vt = s;
            UJ.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            Vu = s;
            UJ.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            Vv = (ic)itemscope;
            UJ.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            Vw = s;
            UJ.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            Vx = s;
            UJ.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            Vy = s;
            UJ.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            Vz = (ic)itemscope;
            UJ.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            VA = s;
            UJ.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            VB = s;
            UJ.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            Rd = s;
            UJ.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            ro = s;
            UJ.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            VC = s;
            UJ.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            VD = s;
            UJ.add(Integer.valueOf(56));
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
