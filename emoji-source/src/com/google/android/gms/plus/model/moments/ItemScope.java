// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.kn;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
    {

        private String Mp;
        private double Vd;
        private double Ve;
        private int acA;
        private List acB;
        private kn acC;
        private List acD;
        private String acE;
        private String acF;
        private kn acG;
        private String acH;
        private String acI;
        private List acJ;
        private String acK;
        private String acL;
        private String acM;
        private String acN;
        private String acO;
        private String acP;
        private String acQ;
        private String acR;
        private kn acS;
        private String acT;
        private String acU;
        private String acV;
        private kn acW;
        private kn acX;
        private kn acY;
        private List acZ;
        private final Set acs = new HashSet();
        private kn act;
        private List acu;
        private kn acv;
        private String acw;
        private String acx;
        private String acy;
        private List acz;
        private String ada;
        private String adb;
        private String adc;
        private String add;
        private kn ade;
        private String adf;
        private String adg;
        private String adh;
        private kn adi;
        private String adj;
        private String adk;
        private String adl;
        private String adm;
        private String mName;
        private String mk;
        private String qX;
        private String qY;
        private String xG;

        public ItemScope build()
        {
            return new kn(acs, act, acu, acv, acw, acx, acy, acz, acA, acB, acC, acD, acE, acF, acG, acH, acI, mk, acJ, acK, acL, acM, Mp, acN, acO, acP, acQ, acR, acS, acT, acU, xG, acV, acW, Vd, acX, Ve, mName, acY, acZ, ada, adb, adc, add, ade, adf, adg, adh, adi, adj, adk, qX, qY, adl, adm);
        }

        public Builder setAbout(ItemScope itemscope)
        {
            act = (kn)itemscope;
            acs.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            acu = list;
            acs.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            acv = (kn)itemscope;
            acs.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            acw = s;
            acs.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            acx = s;
            acs.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            acy = s;
            acs.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            acz = list;
            acs.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            acA = i;
            acs.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            acB = list;
            acs.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            acC = (kn)itemscope;
            acs.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            acD = list;
            acs.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            acE = s;
            acs.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            acF = s;
            acs.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            acG = (kn)itemscope;
            acs.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            acH = s;
            acs.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            acI = s;
            acs.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            mk = s;
            acs.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            acJ = list;
            acs.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            acK = s;
            acs.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            acL = s;
            acs.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            acM = s;
            acs.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            Mp = s;
            acs.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            acN = s;
            acs.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            acO = s;
            acs.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            acP = s;
            acs.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            acQ = s;
            acs.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            acR = s;
            acs.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            acS = (kn)itemscope;
            acs.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            acT = s;
            acs.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            acU = s;
            acs.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            xG = s;
            acs.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            acV = s;
            acs.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            acW = (kn)itemscope;
            acs.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            Vd = d;
            acs.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            acX = (kn)itemscope;
            acs.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            Ve = d;
            acs.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            acs.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            acY = (kn)itemscope;
            acs.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            acZ = list;
            acs.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            ada = s;
            acs.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            adb = s;
            acs.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            adc = s;
            acs.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            add = s;
            acs.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            ade = (kn)itemscope;
            acs.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            adf = s;
            acs.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            adg = s;
            acs.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            adh = s;
            acs.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            adi = (kn)itemscope;
            acs.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            adj = s;
            acs.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            adk = s;
            acs.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            qX = s;
            acs.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            qY = s;
            acs.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            adl = s;
            acs.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            adm = s;
            acs.add(Integer.valueOf(56));
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
