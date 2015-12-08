// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.net.Uri;
import com.pinterest.base.Device;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            FollowableModel, Pin, Partner, ModelHelper

public class User extends FollowableModel
{

    public static final String GENDER_FEMALE = "female";
    public static final String GENDER_MALE = "male";
    public static final String GENDER_UNSPECIFIED = "unspecified";
    public static final String PINTEREST_USER_UID = "424605208526455283";
    public static final String TYPE = "user";
    private List _pinList;
    private String about;
    private Boolean adsCustomizeFromConversion;
    private Boolean blocked;
    private Integer boardCount;
    private Date cacheExpirationDate;
    private String canonicalMerchantDomain;
    private Date createdAt;
    private String customGender;
    private String email;
    private Boolean emailVerified;
    private Boolean excludeFromSearch;
    private Boolean explicitFollowing;
    private String facebookUrl;
    private String firstName;
    private Integer followersCount;
    private Integer followingCount;
    private String fullName;
    private String gender;
    private Boolean hasPassword;
    private Boolean hideFromNews;
    private Long id;
    private String imageLargeUrl;
    private String imageMediumUrl;
    private String imageSmallUrl;
    private Boolean implicitFollowing;
    private String impressumUrl;
    private Integer interestFollowingCount;
    private Boolean isEmployee;
    private String lastName;
    private Date lastPinLiked;
    private Integer likeCount;
    private String location;
    private Partner partner;
    private String partnerUid;
    private Boolean personalizeFromOffsiteBrowsing;
    private Integer pinCount;
    private String pinThumbnailUrls;
    private Boolean publishStream;
    private Boolean publishTimeline;
    private Boolean showImpressum;
    private String socialNetworkName;
    private String twitterUrl;
    private String uid;
    private String username;
    private Boolean verifiedIdentity;
    private String website;
    private Boolean websiteVerified;

    public User()
    {
    }

    public User(Long long1)
    {
        id = long1;
    }

    public User(Long long1, String s, Date date, String s1, String s2, String s3, String s4, 
            String s5, String s6, String s7, String s8, String s9, Boolean boolean1, String s10, 
            String s11, String s12, String s13, String s14, Boolean boolean2, Boolean boolean3, Boolean boolean4, 
            Boolean boolean5, Boolean boolean6, Boolean boolean7, Boolean boolean8, Boolean boolean9, Boolean boolean10, Integer integer, 
            Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, Date date1, Date date2, 
            Boolean boolean11, Boolean boolean12, Boolean boolean13, String s15, String s16, Boolean boolean14, String s17, 
            Boolean boolean15, String s18, String s19, String s20)
    {
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        imageSmallUrl = s1;
        imageMediumUrl = s2;
        imageLargeUrl = s3;
        firstName = s4;
        lastName = s5;
        fullName = s6;
        username = s7;
        gender = s8;
        email = s9;
        emailVerified = boolean1;
        about = s10;
        facebookUrl = s11;
        location = s12;
        twitterUrl = s13;
        website = s14;
        websiteVerified = boolean2;
        verifiedIdentity = boolean3;
        explicitFollowing = boolean4;
        implicitFollowing = boolean5;
        blocked = boolean6;
        publishTimeline = boolean7;
        publishStream = boolean8;
        isEmployee = boolean9;
        hasPassword = boolean10;
        followingCount = integer;
        interestFollowingCount = integer1;
        followersCount = integer2;
        likeCount = integer3;
        boardCount = integer4;
        pinCount = integer5;
        createdAt = date1;
        lastPinLiked = date2;
        excludeFromSearch = boolean11;
        hideFromNews = boolean12;
        personalizeFromOffsiteBrowsing = boolean13;
        partnerUid = s15;
        pinThumbnailUrls = s16;
        adsCustomizeFromConversion = boolean14;
        impressumUrl = s17;
        showImpressum = boolean15;
        socialNetworkName = s18;
        customGender = s19;
        canonicalMerchantDomain = s20;
    }

    public static User make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return null;
        } else
        {
            return make(pinterestjsonobject, true);
        }
    }

    public static User make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        return make(pinterestjsonobject, flag, true);
    }

    public static User make(final PinterestJsonObject mergedUser, boolean flag, boolean flag1)
    {
        Object obj = null;
        Object obj1 = null;
        if (mergedUser == null)
        {
            obj = obj1;
        } else
        {
            Object obj2 = mergedUser.c("data");
            Object obj3 = mergedUser.a("name", null);
            if (obj2 != null)
            {
                mergedUser = ((PinterestJsonObject) (obj2));
            }
            obj2 = mergedUser.c("pinterest_user");
            if (obj2 != null)
            {
                mergedUser = ((PinterestJsonObject) (obj2));
            }
            obj2 = (User)mergedUser.a(com/pinterest/api/model/User);
            PinterestJsonObject pinterestjsonobject = mergedUser.c("partner");
            ((User) (obj2)).setSocialNetworkName(((String) (obj3)));
            obj3 = mergedUser.d("pins");
            if (obj3 != null)
            {
                ((User) (obj2)).setPinList(Pin.makeAll(((PinterestJsonArray) (obj3))));
            }
            if (pinterestjsonobject != null)
            {
                obj = Partner.make(pinterestjsonobject, flag);
                ((User) (obj2)).setPartnerUid(((Partner) (obj)).getUid());
            }
            ((User) (obj2)).cachePartner(((Partner) (obj)));
            mergedUser = mergedUser.c("verified_identity");
            if (mergedUser != null)
            {
                ((User) (obj2)).setVerifiedIdentity(mergedUser.a("verified", Boolean.valueOf(false)));
            }
            if (flag1)
            {
                mergedUser = merge(((User) (obj2)));
            } else
            {
                mergedUser = ((PinterestJsonObject) (obj2));
            }
            obj = mergedUser;
            if (flag)
            {
                (new _cls1()).execute();
                return mergedUser;
            }
        }
        return ((User) (obj));
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            User user = make(pinterestjsonarray.d(i), false, false);
            arraylist1.add(user);
            arraylist2.add(user.getUid());
            if (user.getPartner() != null)
            {
                arraylist.add(user.getPartner());
            }
        }

        pinterestjsonarray = mergeAll(arraylist1, ModelHelper.getUsers(arraylist2));
        ModelHelper.setPartners(arraylist);
        ModelHelper.setUsers(pinterestjsonarray);
        return arraylist1;
    }

    public static User merge(User user)
    {
        if (user == null)
        {
            return null;
        } else
        {
            return merge(user, ModelHelper.getUser(user.getUid()));
        }
    }

    public static User merge(User user, User user1)
    {
        User user2;
        if (user == null)
        {
            user2 = null;
        } else
        {
            user2 = user;
            if (user1 != null)
            {
                if (user.cacheExpirationDate != null)
                {
                    user1.cacheExpirationDate = user.cacheExpirationDate;
                }
                if (user.username != null)
                {
                    user1.username = user.username;
                }
                if (user.email != null)
                {
                    user1.email = user.email;
                }
                if (user.emailVerified != null)
                {
                    user1.emailVerified = user.emailVerified;
                }
                if (user.firstName != null)
                {
                    user1.firstName = user.firstName;
                }
                if (user.lastName != null)
                {
                    user1.lastName = user.lastName;
                }
                if (user.fullName != null)
                {
                    user1.fullName = user.fullName;
                }
                if (user.gender != null)
                {
                    user1.gender = user.gender;
                }
                if (user.customGender != null)
                {
                    user1.customGender = user.customGender;
                }
                if (user.location != null)
                {
                    user1.location = user.location;
                }
                if (user.about != null)
                {
                    user1.about = user.about;
                }
                if (user.website != null)
                {
                    user1.website = user.website;
                }
                if (user.facebookUrl != null)
                {
                    user1.facebookUrl = user.facebookUrl;
                }
                if (user.twitterUrl != null)
                {
                    user1.twitterUrl = user.twitterUrl;
                }
                if (user.imageSmallUrl != null)
                {
                    user1.imageSmallUrl = user.imageSmallUrl;
                }
                if (user.imageMediumUrl != null)
                {
                    user1.imageMediumUrl = user.imageMediumUrl;
                }
                if (user.imageLargeUrl != null)
                {
                    user1.imageLargeUrl = user.imageLargeUrl;
                }
                if (user.explicitFollowing != null)
                {
                    user1.explicitFollowing = user.explicitFollowing;
                }
                if (user.implicitFollowing != null)
                {
                    user1.implicitFollowing = user.implicitFollowing;
                }
                if (user.blocked != null)
                {
                    user1.blocked = user.blocked;
                }
                if (user.websiteVerified != null)
                {
                    user1.websiteVerified = user.websiteVerified;
                }
                if (user.verifiedIdentity != null)
                {
                    user1.verifiedIdentity = user.verifiedIdentity;
                }
                if (user.followersCount != null)
                {
                    user1.followersCount = user.followersCount;
                }
                if (user.followingCount != null)
                {
                    user1.followingCount = user.followingCount;
                }
                user1.interestFollowingCount = user.interestFollowingCount;
                if (user.boardCount != null)
                {
                    user1.boardCount = user.boardCount;
                }
                if (user.pinCount != null)
                {
                    user1.pinCount = user.pinCount;
                }
                if (user.likeCount != null)
                {
                    user1.likeCount = user.likeCount;
                }
                if (user.createdAt != null)
                {
                    user1.createdAt = user.createdAt;
                }
                if (user.lastPinLiked != null)
                {
                    user1.lastPinLiked = user.lastPinLiked;
                }
                if (user.isEmployee != null)
                {
                    user1.isEmployee = user.isEmployee;
                }
                if (user.hasPassword != null)
                {
                    user1.hasPassword = user.hasPassword;
                }
                if (user.pinThumbnailUrls != null)
                {
                    user1.pinThumbnailUrls = user.pinThumbnailUrls;
                }
                if (user.impressumUrl != null)
                {
                    user1.impressumUrl = user.impressumUrl;
                }
                if (user.showImpressum != null)
                {
                    user1.showImpressum = user.showImpressum;
                }
                if (user.partnerUid != null)
                {
                    user1.partnerUid = user.partnerUid;
                    if (user.partner != null)
                    {
                        user1.partner = user.partner;
                    }
                }
                if (user._pinList != null)
                {
                    user1._pinList = user._pinList;
                }
                if (user.publishTimeline != null)
                {
                    user1.publishTimeline = user.publishTimeline;
                }
                if (user.publishStream != null)
                {
                    user1.publishStream = user.publishStream;
                }
                if (user.excludeFromSearch != null)
                {
                    user1.excludeFromSearch = user.excludeFromSearch;
                }
                if (user.hideFromNews != null)
                {
                    user1.hideFromNews = user.hideFromNews;
                }
                if (user.personalizeFromOffsiteBrowsing != null)
                {
                    user1.personalizeFromOffsiteBrowsing = user.personalizeFromOffsiteBrowsing;
                }
                if (user.adsCustomizeFromConversion != null)
                {
                    user1.adsCustomizeFromConversion = user.adsCustomizeFromConversion;
                }
                if (user.socialNetworkName != null)
                {
                    user1.socialNetworkName = user.socialNetworkName;
                }
                if (user.canonicalMerchantDomain != null)
                {
                    user1.canonicalMerchantDomain = user.canonicalMerchantDomain;
                }
                return user1;
            }
        }
        return user2;
    }

    public static List mergeAll(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            User user = (User)iterator.next();
            int i = list1.indexOf(user);
            if (i != -1)
            {
                list = (User)list1.get(i);
            } else
            {
                list = null;
            }
            arraylist.add(merge(user, list));
        }
        return arraylist;
    }

    public void cachePartner(Partner partner1)
    {
        partner = partner1;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof User) || !((User)obj).getUid().equals(getUid())) 
        {
            return false;
        }
        return true;
    }

    public String getAbout()
    {
        return about;
    }

    public Boolean getAdsCustomizeFromConversion()
    {
        return adsCustomizeFromConversion;
    }

    public Boolean getBlocked()
    {
        return blocked;
    }

    public Integer getBoardCount()
    {
        return boardCount;
    }

    public int getBoardCountDisplay()
    {
        if (boardCount == null || boardCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return boardCount.intValue();
        }
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getCanonicalMerchantDomain()
    {
        return canonicalMerchantDomain;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getCustomGender()
    {
        return customGender;
    }

    public String getDisplayGender()
    {
        return Preferences.user().getString("PREF_MY_USER_CUSTOM_GENDER", null);
    }

    public String getEmail()
    {
        return email;
    }

    public Boolean getEmailVerified()
    {
        return emailVerified;
    }

    public Boolean getExcludeFromSearch()
    {
        return excludeFromSearch;
    }

    public Boolean getExplicitFollowing()
    {
        return explicitFollowing;
    }

    public String getFacebookUrl()
    {
        return facebookUrl;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public Integer getFollowersCount()
    {
        return followersCount;
    }

    public int getFollowersCountDisplay()
    {
        if (followersCount == null || followersCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return followersCount.intValue();
        }
    }

    public Boolean getFollowing()
    {
        if (explicitFollowing != null && explicitFollowing.booleanValue())
        {
            return Boolean.valueOf(true);
        }
        if (implicitFollowing != null)
        {
            return implicitFollowing;
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public Integer getFollowingCount()
    {
        return followingCount;
    }

    public int getFollowingCountDisplay()
    {
        if (followingCount == null || followingCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return followingCount.intValue();
        }
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getGender()
    {
        return gender;
    }

    public Boolean getHasPassword()
    {
        return hasPassword;
    }

    public Boolean getHideFromNews()
    {
        return hideFromNews;
    }

    public Long getId()
    {
        return id;
    }

    public String getImageLargeUrl()
    {
        return imageLargeUrl;
    }

    public String getImageLargeUrlByDpi()
    {
        if (Device.hasBigScreen() && imageLargeUrl != null)
        {
            return imageLargeUrl;
        } else
        {
            return imageMediumUrl;
        }
    }

    public String getImageMediumUrl()
    {
        return imageMediumUrl;
    }

    public String getImageSmallUrl()
    {
        return imageSmallUrl;
    }

    public Boolean getImplicitFollowing()
    {
        return implicitFollowing;
    }

    public String getImpressumUrl()
    {
        return impressumUrl;
    }

    public Integer getInterestFollowingCount()
    {
        return interestFollowingCount;
    }

    public Boolean getIsEmployee()
    {
        return isEmployee;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Date getLastPinLiked()
    {
        return lastPinLiked;
    }

    public Integer getLikeCount()
    {
        return likeCount;
    }

    public int getLikeCountDisplay()
    {
        if (likeCount == null || likeCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return likeCount.intValue();
        }
    }

    public String getLocation()
    {
        return location;
    }

    public Partner getPartner()
    {
        if (partnerUid != null && partner == null)
        {
            partner = ModelHelper.getPartner(partnerUid);
        }
        return partner;
    }

    public String getPartnerUid()
    {
        return partnerUid;
    }

    public Boolean getPersonalizeFromOffsiteBrowsing()
    {
        return personalizeFromOffsiteBrowsing;
    }

    public Integer getPinCount()
    {
        return pinCount;
    }

    public int getPinCountDisplay()
    {
        if (pinCount == null || pinCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return pinCount.intValue();
        }
    }

    public List getPinList()
    {
        return _pinList;
    }

    public String getPinThumbnailUrls()
    {
        return pinThumbnailUrls;
    }

    public String getPinterestLink()
    {
        return String.format("https://pinterest.com/%s/?source_app=android", new Object[] {
            getUsername()
        });
    }

    public Boolean getPublishStream()
    {
        return publishStream;
    }

    public Boolean getPublishTimeline()
    {
        return publishTimeline;
    }

    public Boolean getShowImpressum()
    {
        return showImpressum;
    }

    public String getSocialNetworkName()
    {
        return socialNetworkName;
    }

    public String getTwitterUrl()
    {
        return twitterUrl;
    }

    public String getUid()
    {
        return uid;
    }

    public String getUsername()
    {
        return username;
    }

    public Boolean getVerifiedIdentity()
    {
        return verifiedIdentity;
    }

    public String getWebsite()
    {
        return website;
    }

    public String getWebsiteHost()
    {
        String s1 = getWebsite();
        String s;
        if (s1 == null)
        {
            s = null;
        } else
        {
            Uri uri = Uri.parse(s1);
            s = s1;
            if (uri != null)
            {
                s = s1;
                if (uri != null)
                {
                    s = s1;
                    if (uri.getHost() != null)
                    {
                        return uri.getHost();
                    }
                }
            }
        }
        return s;
    }

    public Boolean getWebsiteVerified()
    {
        return websiteVerified;
    }

    public void setAbout(String s)
    {
        about = s;
    }

    public void setAdsCustomizeFromConversion(Boolean boolean1)
    {
        adsCustomizeFromConversion = boolean1;
    }

    public void setBlocked(Boolean boolean1)
    {
        blocked = boolean1;
    }

    public void setBoardCount(Integer integer)
    {
        boardCount = integer;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCanonicalMerchantDomain(String s)
    {
        canonicalMerchantDomain = s;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setCustomGender(String s)
    {
        customGender = s;
    }

    public void setDisplayGender(String s)
    {
        Preferences.user().set("PREF_MY_USER_CUSTOM_GENDER", s);
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setEmailVerified(Boolean boolean1)
    {
        emailVerified = boolean1;
    }

    public void setExcludeFromSearch(Boolean boolean1)
    {
        excludeFromSearch = boolean1;
    }

    public void setExplicitFollowing(Boolean boolean1)
    {
        explicitFollowing = boolean1;
    }

    public void setFacebookUrl(String s)
    {
        facebookUrl = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setFollowersCount(Integer integer)
    {
        followersCount = integer;
    }

    public void setFollowing(boolean flag)
    {
        setImplicitFollowing(Boolean.valueOf(flag));
        setExplicitFollowing(Boolean.valueOf(flag));
    }

    public void setFollowingCount(Integer integer)
    {
        followingCount = integer;
    }

    public void setFullName(String s)
    {
        fullName = s;
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setHasPassword(Boolean boolean1)
    {
        hasPassword = boolean1;
    }

    public void setHideFromNews(Boolean boolean1)
    {
        hideFromNews = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageLargeUrl(String s)
    {
        imageLargeUrl = s;
    }

    public void setImageMediumUrl(String s)
    {
        imageMediumUrl = s;
    }

    public void setImageSmallUrl(String s)
    {
        imageSmallUrl = s;
    }

    public void setImplicitFollowing(Boolean boolean1)
    {
        implicitFollowing = boolean1;
    }

    public void setImpressumUrl(String s)
    {
        impressumUrl = s;
    }

    public void setInterestFollowingCount(Integer integer)
    {
        interestFollowingCount = integer;
    }

    public void setIsEmployee(Boolean boolean1)
    {
        isEmployee = boolean1;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setLastPinLiked(Date date)
    {
        lastPinLiked = date;
    }

    public void setLikeCount(Integer integer)
    {
        likeCount = integer;
    }

    public void setLocation(String s)
    {
        location = s;
    }

    public void setPartnerUid(String s)
    {
        partnerUid = s;
    }

    public void setPersonalizeFromOffsiteBrowsing(Boolean boolean1)
    {
        personalizeFromOffsiteBrowsing = boolean1;
    }

    public void setPinCount(Integer integer)
    {
        pinCount = integer;
    }

    public void setPinList(List list)
    {
        _pinList = list;
    }

    public void setPinThumbnailUrls(String s)
    {
        pinThumbnailUrls = s;
    }

    public void setPublishStream(Boolean boolean1)
    {
        publishStream = boolean1;
    }

    public void setPublishTimeline(Boolean boolean1)
    {
        publishTimeline = boolean1;
    }

    public void setShowImpressum(Boolean boolean1)
    {
        showImpressum = boolean1;
    }

    public void setSocialNetworkName(String s)
    {
        socialNetworkName = s;
    }

    public void setTwitterUrl(String s)
    {
        twitterUrl = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public void setVerifiedIdentity(Boolean boolean1)
    {
        verifiedIdentity = boolean1;
    }

    public void setWebsite(String s)
    {
        website = s;
    }

    public void setWebsiteVerified(Boolean boolean1)
    {
        websiteVerified = boolean1;
    }

    private class _cls1 extends BackgroundTask
    {

        final User val$mergedUser;

        public final void run()
        {
            ModelHelper.setUser(mergedUser);
        }

        _cls1()
        {
            mergedUser = user;
            super();
        }
    }

}
