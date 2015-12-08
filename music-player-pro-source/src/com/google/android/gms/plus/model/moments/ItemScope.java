// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.pd;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
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

        public Builder setAbout(ItemScope itemscope)
        {
            aoo = (pd)itemscope;
            aon.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            aop = list;
            aon.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            aoq = (pd)itemscope;
            aon.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            aor = s;
            aon.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            aos = s;
            aon.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            aot = s;
            aon.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            aou = list;
            aon.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            aov = i;
            aon.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            aow = list;
            aon.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            aox = (pd)itemscope;
            aon.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            aoy = list;
            aon.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            aoz = s;
            aon.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            aoA = s;
            aon.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            aoB = (pd)itemscope;
            aon.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            aoC = s;
            aon.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            aoD = s;
            aon.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            ov = s;
            aon.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            aoE = list;
            aon.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            aoF = s;
            aon.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            aoG = s;
            aon.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            aoH = s;
            aon.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            UO = s;
            aon.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            aoI = s;
            aon.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            aoJ = s;
            aon.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            aoK = s;
            aon.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            aoL = s;
            aon.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            aoM = s;
            aon.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            aoN = (pd)itemscope;
            aon.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            aoO = s;
            aon.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            aoP = s;
            aon.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            CE = s;
            aon.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            aoQ = s;
            aon.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            aoR = (pd)itemscope;
            aon.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            agg = d;
            aon.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            aoS = (pd)itemscope;
            aon.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            agh = d;
            aon.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            aon.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            aoT = (pd)itemscope;
            aon.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            aoU = list;
            aon.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            aoV = s;
            aon.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            aoW = s;
            aon.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            aoX = s;
            aon.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            aoY = s;
            aon.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            aoZ = (pd)itemscope;
            aon.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            apa = s;
            aon.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            apb = s;
            aon.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            apc = s;
            aon.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            apd = (pd)itemscope;
            aon.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            ape = s;
            aon.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            apf = s;
            aon.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            vc = s;
            aon.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            vf = s;
            aon.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            apg = s;
            aon.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            aph = s;
            aon.add(Integer.valueOf(56));
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
