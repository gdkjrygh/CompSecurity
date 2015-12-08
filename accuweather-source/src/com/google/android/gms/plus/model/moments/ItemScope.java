// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.ko;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
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

        public Builder setAbout(ItemScope itemscope)
        {
            acq = (ko)itemscope;
            acp.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            acr = list;
            acp.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            acs = (ko)itemscope;
            acp.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            act = s;
            acp.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            acu = s;
            acp.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            acv = s;
            acp.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            acw = list;
            acp.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            acx = i;
            acp.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            acy = list;
            acp.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            acz = (ko)itemscope;
            acp.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            acA = list;
            acp.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            acB = s;
            acp.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            acC = s;
            acp.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            acD = (ko)itemscope;
            acp.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            acE = s;
            acp.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            acF = s;
            acp.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            mi = s;
            acp.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            acG = list;
            acp.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            acH = s;
            acp.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            acI = s;
            acp.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            acJ = s;
            acp.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            Mm = s;
            acp.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            acK = s;
            acp.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            acL = s;
            acp.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            acM = s;
            acp.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            acN = s;
            acp.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            acO = s;
            acp.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            acP = (ko)itemscope;
            acp.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            acQ = s;
            acp.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            acR = s;
            acp.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            xD = s;
            acp.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            acS = s;
            acp.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            acT = (ko)itemscope;
            acp.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            Va = d;
            acp.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            acU = (ko)itemscope;
            acp.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            Vb = d;
            acp.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            acp.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            acV = (ko)itemscope;
            acp.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            acW = list;
            acp.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            acX = s;
            acp.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            acY = s;
            acp.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            acZ = s;
            acp.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            ada = s;
            acp.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            adb = (ko)itemscope;
            acp.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            adc = s;
            acp.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            add = s;
            acp.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            ade = s;
            acp.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            adf = (ko)itemscope;
            acp.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            adg = s;
            acp.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            adh = s;
            acp.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            qU = s;
            acp.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            qV = s;
            acp.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            adi = s;
            acp.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            adj = s;
            acp.add(Integer.valueOf(56));
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
