// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.nu;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
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

        public Builder setAbout(ItemScope itemscope)
        {
            amd = (nu)itemscope;
            amc.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            ame = list;
            amc.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            amf = (nu)itemscope;
            amc.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            amg = s;
            amc.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            amh = s;
            amc.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            ami = s;
            amc.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            amj = list;
            amc.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            amk = i;
            amc.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            aml = list;
            amc.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            amm = (nu)itemscope;
            amc.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            amn = list;
            amc.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            amo = s;
            amc.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            amp = s;
            amc.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            amq = (nu)itemscope;
            amc.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            amr = s;
            amc.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            ams = s;
            amc.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            ol = s;
            amc.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            amt = list;
            amc.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            amu = s;
            amc.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            amv = s;
            amc.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            amw = s;
            amc.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            Tr = s;
            amc.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            amx = s;
            amc.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            amy = s;
            amc.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            amz = s;
            amc.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            amA = s;
            amc.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            amB = s;
            amc.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            amC = (nu)itemscope;
            amc.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            amD = s;
            amc.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            amE = s;
            amc.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            BL = s;
            amc.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            amF = s;
            amc.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            amG = (nu)itemscope;
            amc.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            aek = d;
            amc.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            amH = (nu)itemscope;
            amc.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            ael = d;
            amc.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            amc.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            amI = (nu)itemscope;
            amc.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            amJ = list;
            amc.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            amK = s;
            amc.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            amL = s;
            amc.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            amM = s;
            amc.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            amN = s;
            amc.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            amO = (nu)itemscope;
            amc.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            amP = s;
            amc.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            amQ = s;
            amc.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            amR = s;
            amc.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            amS = (nu)itemscope;
            amc.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            amT = s;
            amc.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            amU = s;
            amc.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            uO = s;
            amc.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            uR = s;
            amc.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            amV = s;
            amc.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            amW = s;
            amc.add(Integer.valueOf(56));
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
