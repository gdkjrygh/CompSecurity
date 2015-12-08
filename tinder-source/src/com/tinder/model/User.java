// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tinder.d.f;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.managers.ad;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.model:
//            Career, ProfilePhoto, Interest, ConnectionsGroup, 
//            InstagramDataSet, Badge, ProcessedPhoto

public class User
    implements Parcelable, f, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final User createFromParcel(Parcel parcel)
        {
            return new User(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final User[] newArray(int i)
        {
            return new User[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String PROXIMITY_IN = "in";
    private static final String PROXIMITY_NEAR = "near";
    private List mBadges;
    private String mBio;
    private Date mBirthDate;
    private Career mCareer;
    private List mCommonFriends;
    private List mCommonInterests;
    private List mCommonLikes;
    private ConnectionsGroup mConnections;
    private int mDistanceMiles;
    private String mFacebookId;
    private Gender mGender;
    private String mId;
    private InstagramDataSet mInstagramDataSet;
    private ArrayList mInterestedIn;
    private boolean mIsBrand;
    private boolean mIsRecAndPassporting;
    private boolean mIsSuperlike;
    private boolean mIsVerified;
    private String mLastActivityDate;
    private String mName;
    private String mNearByLocationName;
    private String mNearByLocationProximity;
    private int mNumConnections;
    private String mPingLocationName;
    private Date mPingTime;
    private ArrayList mProfilePhotos;
    private int mTravelDistanceMiles;
    private String mTravelLocationName;
    private List mUncommonInterests;
    private String mUsername;

    public User()
    {
        mLastActivityDate = "";
        mCommonInterests = new ArrayList(0);
        mUncommonInterests = new ArrayList(0);
        mCareer = new Career();
    }

    protected User(Parcel parcel)
    {
        Object obj1 = null;
        boolean flag1 = true;
        super();
        mLastActivityDate = "";
        mBio = parcel.readString();
        mId = parcel.readString();
        long l = parcel.readLong();
        Object obj;
        int i;
        if (l == -1L)
        {
            obj = null;
        } else
        {
            obj = new Date(l);
        }
        mPingTime = ((Date) (obj));
        mDistanceMiles = parcel.readInt();
        mTravelDistanceMiles = parcel.readInt();
        i = parcel.readInt();
        if (i == -1)
        {
            obj = null;
        } else
        {
            obj = Gender.values()[i];
        }
        mGender = ((Gender) (obj));
        mCommonFriends = parcel.createStringArrayList();
        mCommonLikes = parcel.createStringArrayList();
        mName = parcel.readString();
        mFacebookId = parcel.readString();
        mLastActivityDate = parcel.readString();
        l = parcel.readLong();
        if (l == -1L)
        {
            obj = obj1;
        } else
        {
            obj = new Date(l);
        }
        mBirthDate = ((Date) (obj));
        mInterestedIn = new ArrayList();
        obj = new ArrayList();
        parcel.readList(((List) (obj)), java/util/List.getClassLoader());
        Integer integer;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); mInterestedIn.add(Gender.values()[integer.intValue()]))
        {
            integer = (Integer)((Iterator) (obj)).next();
        }

        mProfilePhotos = parcel.createTypedArrayList(ProfilePhoto.CREATOR);
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsRecAndPassporting = flag;
        mTravelLocationName = parcel.readString();
        mPingLocationName = parcel.readString();
        mNearByLocationName = parcel.readString();
        mNearByLocationProximity = parcel.readString();
        mCommonInterests = parcel.createTypedArrayList(Interest.CREATOR);
        mUncommonInterests = parcel.createTypedArrayList(Interest.CREATOR);
        mConnections = (ConnectionsGroup)parcel.readSerializable();
        mInstagramDataSet = (InstagramDataSet)parcel.readSerializable();
        mNumConnections = parcel.readInt();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsVerified = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsSuperlike = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIsBrand = flag;
        mBadges = parcel.createTypedArrayList(Badge.CREATOR);
        mUsername = parcel.readString();
        mCareer = (Career)parcel.readParcelable(com/tinder/model/Career.getClassLoader());
    }

    public User(String s, String s1, Date date, String s2, Date date1, Gender gender, List list, 
            List list1, int i, ArrayList arraylist, String s3, String s4, String s5, boolean flag, 
            boolean flag1, boolean flag2, List list2, String s6, Career career)
    {
        this();
        mBio = s1;
        mBirthDate = date;
        mId = s2;
        mPingTime = date1;
        mGender = gender;
        mName = s;
        mCommonFriends = list;
        mCommonLikes = list1;
        mDistanceMiles = i;
        mLastActivityDate = s3;
        mProfilePhotos = arraylist;
        mNearByLocationName = s4;
        mNearByLocationProximity = s5;
        mIsVerified = flag;
        mBadges = list2;
        mIsSuperlike = flag1;
        mIsBrand = flag2;
        mUsername = s6;
        mCareer = career;
    }

    public User(String s, Date date, String s1, String s2, Date date1, int i, String s3, 
            Gender gender, ArrayList arraylist, ArrayList arraylist1, String s4, boolean flag, boolean flag1, boolean flag2, 
            List list, String s5, Career career)
    {
        this();
        mBio = s;
        mBirthDate = date;
        mId = s1;
        mName = s2;
        mPingTime = date1;
        mDistanceMiles = i;
        mFacebookId = s3;
        mGender = gender;
        mInterestedIn = arraylist;
        mProfilePhotos = arraylist1;
        mLastActivityDate = s4;
        mIsVerified = flag;
        mBadges = list;
        mIsSuperlike = flag1;
        mIsBrand = flag2;
        mUsername = s5;
        mCareer = career;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof User)
        {
            return ((User)obj).getId().equals(mId);
        } else
        {
            return false;
        }
    }

    public String getAge()
    {
        if (mBirthDate != null)
        {
            return Integer.toString(DateUtils.a(mBirthDate));
        } else
        {
            return null;
        }
    }

    public ArrayList getAvatarUrlsForSize(UserPhotoSize userphotosize)
    {
        ArrayList arraylist = new ArrayList(mProfilePhotos.size());
        for (Iterator iterator = mProfilePhotos.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((ProfilePhoto)iterator.next()).processedPhotos.iterator();
            while (iterator1.hasNext()) 
            {
                ProcessedPhoto processedphoto = (ProcessedPhoto)iterator1.next();
                if (processedphoto.photoSize == userphotosize)
                {
                    arraylist.add(processedphoto.imageUrl);
                }
            }
        }

        return arraylist;
    }

    public List getBadges()
    {
        return mBadges;
    }

    public String getBio()
    {
        if (mBio == null)
        {
            return "";
        } else
        {
            return mBio;
        }
    }

    public Date getBirthDate()
    {
        return mBirthDate;
    }

    public Career getCareer()
    {
        if (mCareer == null)
        {
            return new Career();
        } else
        {
            return mCareer;
        }
    }

    public int getCommonFriendCount()
    {
        if (mCommonFriends == null)
        {
            return 0;
        } else
        {
            return mCommonFriends.size();
        }
    }

    public List getCommonFriendIds()
    {
        return mCommonFriends;
    }

    public List getCommonInterests()
    {
        return mCommonInterests;
    }

    public int getCommonLikeCount()
    {
        if (mCommonLikes == null)
        {
            return 0;
        } else
        {
            return mCommonLikes.size();
        }
    }

    public List getCommonLikes()
    {
        return mCommonLikes;
    }

    public ConnectionsGroup getConnections()
    {
        return mConnections;
    }

    public ProcessedPhoto getDisplayPhoto()
    {
        if (hasPhotos())
        {
            List list = ((ProfilePhoto)mProfilePhotos.get(0)).processedPhotos;
            if (list != null && list.size() > 0)
            {
                return (ProcessedPhoto)list.get(0);
            }
        } else
        {
            v.a("No photos");
        }
        return null;
    }

    public int getDistance(ad ad1)
    {
        if (ad1.j)
        {
            return mDistanceMiles;
        } else
        {
            return (int)((float)mDistanceMiles * 1.60934F);
        }
    }

    public int getDistanceMiles()
    {
        return mDistanceMiles;
    }

    public String getFacebookId()
    {
        return mFacebookId;
    }

    public Badge getFirstBadge()
    {
        if (mBadges != null && !mBadges.isEmpty())
        {
            return (Badge)mBadges.get(0);
        } else
        {
            return null;
        }
    }

    public Gender getGender()
    {
        return mGender;
    }

    public String getId()
    {
        return mId;
    }

    public InstagramDataSet getInstagramDataSet()
    {
        return mInstagramDataSet;
    }

    public List getInstagramPhotos()
    {
        if (mInstagramDataSet != null)
        {
            return mInstagramDataSet.photos;
        } else
        {
            return Collections.emptyList();
        }
    }

    public String getLastActivityDate()
    {
        return mLastActivityDate;
    }

    public ProfilePhoto getMainPhoto()
    {
        if (hasPhotos())
        {
            return (ProfilePhoto)mProfilePhotos.get(0);
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return mName;
    }

    public String getNearByLocation(Resources resources)
    {
        String s = "";
        if (!TextUtils.equals(mNearByLocationProximity, "in")) goto _L2; else goto _L1
_L1:
        s = resources.getString(0x7f060131);
_L4:
        return (new StringBuilder()).append(s).append(" ").append(mNearByLocationName).toString();
_L2:
        if (TextUtils.equals(mNearByLocationProximity, "near"))
        {
            s = resources.getString(0x7f060132);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getNearByLocationName()
    {
        return mNearByLocationName;
    }

    public String getNearByLocationProximity()
    {
        return mNearByLocationProximity;
    }

    public int getNumCommonInterests()
    {
        if (mCommonInterests == null)
        {
            return 0;
        } else
        {
            return mCommonInterests.size();
        }
    }

    public int getNumConnections()
    {
        int j = mNumConnections;
        int i;
        if (mConnections == null)
        {
            i = 0;
        } else
        {
            i = mConnections.size();
        }
        return Math.max(j, i);
    }

    public ArrayList getOtherPhotoIds(String s)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < mProfilePhotos.size(); i++)
        {
            if (!((ProfilePhoto)mProfilePhotos.get(i)).getPhotoId().equals(s))
            {
                arraylist.add(((ProfilePhoto)mProfilePhotos.get(i)).getPhotoId());
            }
        }

        return arraylist;
    }

    public int getPhotoCount()
    {
        return mProfilePhotos.size();
    }

    public ArrayList getPhotos()
    {
        return mProfilePhotos;
    }

    public String getPingLocationName()
    {
        return mPingLocationName;
    }

    public Date getPingTime()
    {
        return mPingTime;
    }

    public String getThumbnailUrl()
    {
        if (getMainPhoto() == null)
        {
            return "";
        } else
        {
            return getMainPhoto().getProcessedPhoto(UserPhotoSize.SMALL).imageUrl;
        }
    }

    public int getTravelDistanceMiles()
    {
        return mTravelDistanceMiles;
    }

    public String getTravelLocationName()
    {
        return mTravelLocationName;
    }

    public List getUncommonInterests()
    {
        return mUncommonInterests;
    }

    public String getUsername()
    {
        if (mUsername == null)
        {
            return "";
        } else
        {
            return mUsername;
        }
    }

    public boolean hasBadge()
    {
        return getFirstBadge() != null;
    }

    public boolean hasLargeImage(String s)
    {
        for (Iterator iterator = getAvatarUrlsForSize(UserPhotoSize.LARGE).iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasPhotos()
    {
        return mProfilePhotos != null && mProfilePhotos.size() > 0;
    }

    public boolean hasSamePhotos(List list)
    {
        boolean flag;
        if (mProfilePhotos.size() != list.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return false;
        }
        for (int i = 0; i < mProfilePhotos.size(); i++)
        {
            if (!TextUtils.equals(((ProfilePhoto)mProfilePhotos.get(i)).imageUrl, ((ProfilePhoto)list.get(i)).imageUrl))
            {
                (new StringBuilder("compared different imageUrls:")).append(((ProfilePhoto)mProfilePhotos.get(i)).imageUrl).append(" with ").append(((ProfilePhoto)list.get(i)).imageUrl);
                return false;
            }
        }

        return true;
    }

    public boolean isBrand()
    {
        return mIsBrand;
    }

    public boolean isInterestedInFemales()
    {
        if (mInterestedIn == null)
        {
            return false;
        }
        for (Iterator iterator = mInterestedIn.iterator(); iterator.hasNext();)
        {
            if (((Gender)iterator.next()).equals(Gender.FEMALE))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isInterestedInMales()
    {
        if (mInterestedIn == null)
        {
            return false;
        }
        for (Iterator iterator = mInterestedIn.iterator(); iterator.hasNext();)
        {
            if (((Gender)iterator.next()).equals(Gender.MALE))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isRecAndPassporting()
    {
        return mIsRecAndPassporting;
    }

    public boolean isSuperLike()
    {
        return mIsSuperlike;
    }

    public boolean isVerified()
    {
        return mIsVerified;
    }

    public void setCommonInterests(List list)
    {
        mCommonInterests = list;
    }

    public void setConnections(ConnectionsGroup connectionsgroup)
    {
        mConnections = connectionsgroup;
    }

    public void setInstagramDataSet(InstagramDataSet instagramdataset)
    {
        mInstagramDataSet = instagramdataset;
    }

    public void setInterestedIn(ArrayList arraylist)
    {
        mInterestedIn = arraylist;
    }

    public void setNearByLocationName(String s)
    {
        mNearByLocationName = s;
    }

    public void setNearByLocationProximity(String s)
    {
        mNearByLocationProximity = s;
    }

    public void setNumConnections(int i)
    {
        mNumConnections = i;
    }

    public void setPhotos(ArrayList arraylist)
    {
        mProfilePhotos = arraylist;
    }

    public void setPingLocationName(String s)
    {
        mPingLocationName = s;
    }

    public void setRecAndPassporting(boolean flag)
    {
        mIsRecAndPassporting = flag;
    }

    public void setTravelDistanceMiles(int i)
    {
        mTravelDistanceMiles = i;
    }

    public void setTravelLocationName(String s)
    {
        mTravelLocationName = s;
    }

    public void setUncommonInterests(List list)
    {
        mUncommonInterests = list;
    }

    public void setUsername(String s)
    {
        mUsername = s;
    }

    public String toString()
    {
        return (new StringBuilder("ID: ")).append(mId).append(" Name: ").append(mName).append(" Num Photos: ").append(mProfilePhotos.size()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        long l1 = -1L;
        boolean flag = true;
        parcel.writeString(mBio);
        parcel.writeString(mId);
        long l;
        if (mPingTime != null)
        {
            l = mPingTime.getTime();
        } else
        {
            l = -1L;
        }
        parcel.writeLong(l);
        parcel.writeInt(mDistanceMiles);
        parcel.writeInt(mTravelDistanceMiles);
        if (mGender == null)
        {
            i = -1;
        } else
        {
            i = mGender.ordinal();
        }
        parcel.writeInt(i);
        parcel.writeStringList(mCommonFriends);
        parcel.writeStringList(mCommonLikes);
        parcel.writeString(mName);
        parcel.writeString(mFacebookId);
        parcel.writeString(mLastActivityDate);
        l = l1;
        if (mBirthDate != null)
        {
            l = mBirthDate.getTime();
        }
        parcel.writeLong(l);
        byte byte0;
        if (mInterestedIn != null)
        {
            ArrayList arraylist = new ArrayList(mInterestedIn.size());
            for (Iterator iterator = mInterestedIn.iterator(); iterator.hasNext(); arraylist.add(Integer.valueOf(((Gender)iterator.next()).ordinal()))) { }
            parcel.writeList(arraylist);
        } else
        {
            parcel.writeList(new ArrayList(0));
        }
        parcel.writeTypedList(mProfilePhotos);
        if (mIsRecAndPassporting)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeString(mTravelLocationName);
        parcel.writeString(mPingLocationName);
        parcel.writeString(mNearByLocationName);
        parcel.writeString(mNearByLocationProximity);
        parcel.writeTypedList(mCommonInterests);
        parcel.writeTypedList(mUncommonInterests);
        parcel.writeSerializable(mConnections);
        parcel.writeSerializable(mInstagramDataSet);
        parcel.writeInt(mNumConnections);
        if (mIsVerified)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mIsSuperlike)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mIsBrand)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeTypedList(mBadges);
        parcel.writeString(mUsername);
        parcel.writeParcelable(mCareer, 0);
    }

}
