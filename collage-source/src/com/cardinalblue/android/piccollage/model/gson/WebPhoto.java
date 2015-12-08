// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cardinalblue.android.b.f;
import java.util.UUID;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            PicUser, IGsonable, NativeAdFactory

public class WebPhoto
    implements Parcelable
{
    public static final class Category extends Enum
    {

        private static final Category $VALUES[];
        public static final Category AD_ADMOB;
        public static final Category AD_FACEBOOK;
        public static final Category PICCOLLAGE;

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/WebPhoto$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])$VALUES.clone();
        }

        static 
        {
            PICCOLLAGE = new Category("PICCOLLAGE", 0);
            AD_FACEBOOK = new Category("AD_FACEBOOK", 1);
            AD_ADMOB = new Category("AD_ADMOB", 2);
            $VALUES = (new Category[] {
                PICCOLLAGE, AD_FACEBOOK, AD_ADMOB
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }

    public static class CollageSize
        implements IGsonable
    {

        private int height;
        private int width;

        public int getHeight()
        {
            return height;
        }

        public int getWidth()
        {
            return width;
        }

        public boolean isSquare()
        {
            while (width == -1 || height == -1 || width != height) 
            {
                return false;
            }
            return true;
        }

        public CollageSize(int i, int j)
        {
            width = -1;
            height = -1;
            width = i;
            height = j;
        }
    }

    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public WebPhoto createFromParcel(Parcel parcel)
        {
            Category category = (Category)f.a(com/cardinalblue/android/piccollage/model/gson/WebPhoto$Category).a(parcel);
            static class _cls1
            {

                static final int $SwitchMap$com$cardinalblue$android$piccollage$model$gson$WebPhoto$Category[];

                static 
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$WebPhoto$Category = new int[Category.values().length];
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$model$gson$WebPhoto$Category[Category.AD_FACEBOOK.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$model$gson$WebPhoto$Category[Category.AD_ADMOB.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$model$gson$WebPhoto$Category[Category.PICCOLLAGE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.cardinalblue.android.piccollage.model.gson.WebPhoto.Category[category.ordinal()])
            {
            default:
                return new WebPhoto(parcel);

            case 1: // '\001'
                return NativeAdFactory.create(NativeAdFactory.AdType.FB);

            case 2: // '\002'
                return NativeAdFactory.create(NativeAdFactory.AdType.ADMOB);
            }
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public WebPhoto[] newArray(int i)
        {
            return new WebPhoto[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    public static final String EXTRA_WEB_PHOTO = "extra_webphoto";
    private static final String PATH_TO_INTERACTIVE = "/interactive";
    private String mCaption;
    protected Category mCategory;
    private long mCreatedAt;
    private String mEchoOriginal;
    private String mEchoProgenitor;
    private int mEchoesNum;
    private String mId;
    private boolean mIsInteractive;
    private boolean mIsLiked;
    private transient boolean mIsSelected;
    private String mLargeImageUrl;
    private int mLikeNum;
    private String mMediumImageUrl;
    private String mOriginalImageUrl;
    private String mPageUrl;
    private String mShareUrl;
    private CollageSize mSize;
    protected String mThumbnailImageUrl;
    private String mUpdateUrl;
    protected String mUrl;
    private PicUser mUser;

    public WebPhoto()
    {
        mUser = new PicUser();
        mCategory = Category.PICCOLLAGE;
        mId = UUID.randomUUID().toString();
        mUrl = "";
        mThumbnailImageUrl = "";
        mOriginalImageUrl = "";
        mLargeImageUrl = "";
        mMediumImageUrl = "";
        setPageUrl("");
        mCaption = "";
        mLikeNum = 0;
        mIsLiked = false;
        mCreatedAt = 0L;
        mEchoesNum = 0;
        mEchoOriginal = "";
        mEchoProgenitor = "";
        mIsInteractive = false;
        mCategory = Category.PICCOLLAGE;
    }

    public WebPhoto(Parcel parcel)
    {
        mUser = new PicUser();
        mCategory = Category.PICCOLLAGE;
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel)
    {
        boolean flag1 = true;
        mId = parcel.readString();
        mUrl = parcel.readString();
        mThumbnailImageUrl = parcel.readString();
        mOriginalImageUrl = parcel.readString();
        mLargeImageUrl = parcel.readString();
        mMediumImageUrl = parcel.readString();
        setPageUrl(parcel.readString());
        mCaption = parcel.readString();
        mLikeNum = parcel.readInt();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsLiked = flag;
        mCreatedAt = parcel.readLong();
        mUser = (PicUser)parcel.readParcelable(PicUser.CREATOR.getClass().getClassLoader());
        mEchoesNum = parcel.readInt();
        mEchoOriginal = parcel.readString();
        mEchoProgenitor = parcel.readString();
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIsInteractive = flag;
        mCategory = (Category)f.a(com/cardinalblue/android/piccollage/model/gson/WebPhoto$Category).a(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof WebPhoto))
        {
            return false;
        } else
        {
            return mId.equals(((WebPhoto)obj).mId);
        }
    }

    public String getCaption()
    {
        return mCaption;
    }

    public long getCreatedTime()
    {
        return mCreatedAt;
    }

    public String getEchoOriginal()
    {
        return mEchoOriginal;
    }

    public String getEchoProgenitor()
    {
        return mEchoProgenitor;
    }

    public int getEchoesNum()
    {
        return mEchoesNum;
    }

    public String getId()
    {
        return mId;
    }

    public String getInteractiveUrl()
    {
        if (TextUtils.isEmpty(mUrl))
        {
            throw new IllegalStateException((new StringBuilder()).append("Url is null. collage id: ").append(mId).toString());
        } else
        {
            return (new StringBuilder()).append(mUrl).append("/interactive").toString();
        }
    }

    public String getLargeImageUrl()
    {
        return mLargeImageUrl;
    }

    public int getLikeNum()
    {
        return mLikeNum;
    }

    public String getMediumImageUrl()
    {
        return mMediumImageUrl;
    }

    public String getOriginalImageUrl()
    {
        return mOriginalImageUrl;
    }

    public String getPageUrl()
    {
        return mPageUrl;
    }

    public String getShareUrl()
    {
        return mShareUrl;
    }

    public String getThumbnailImageUrl()
    {
        return mThumbnailImageUrl;
    }

    public String getUpdateUrl()
    {
        return mUpdateUrl;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public PicUser getUser()
    {
        return mUser;
    }

    public boolean isAd()
    {
        return !mCategory.equals(Category.PICCOLLAGE);
    }

    public boolean isInteractive()
    {
        return mIsInteractive;
    }

    public boolean isLiked()
    {
        return mIsLiked;
    }

    public boolean isSelected()
    {
        return mIsSelected;
    }

    public boolean isSquare()
    {
        if (mSize == null)
        {
            return false;
        } else
        {
            return mSize.isSquare();
        }
    }

    public void setCategory(Category category)
    {
        mCategory = category;
    }

    public void setEchoesNum(int i)
    {
        mEchoesNum = i;
    }

    public void setId(String s)
    {
        mId = s;
    }

    public void setIsLiked(boolean flag)
    {
        mIsLiked = flag;
    }

    public void setLikeNum(int i)
    {
        mLikeNum = i;
    }

    public void setPageUrl(String s)
    {
        mPageUrl = s;
    }

    public void setSelected(boolean flag)
    {
        mIsSelected = flag;
    }

    public void toggleIsLiked()
    {
        boolean flag;
        if (!mIsLiked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsLiked = flag;
        if (mIsLiked)
        {
            mLikeNum = mLikeNum + 1;
            return;
        } else
        {
            mLikeNum = mLikeNum - 1;
            return;
        }
    }

    public void updateUser(PicUser picuser)
    {
        if (picuser == null && !picuser.isValid())
        {
            return;
        } else
        {
            mUser = picuser;
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        f.a(mCategory).b(parcel);
        parcel.writeString(mId);
        parcel.writeString(mUrl);
        parcel.writeString(mThumbnailImageUrl);
        parcel.writeString(mOriginalImageUrl);
        parcel.writeString(mLargeImageUrl);
        parcel.writeString(mMediumImageUrl);
        parcel.writeString(getPageUrl());
        parcel.writeString(mCaption);
        parcel.writeInt(mLikeNum);
        int j;
        if (mIsLiked)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeLong(mCreatedAt);
        parcel.writeParcelable(mUser, i);
        parcel.writeInt(mEchoesNum);
        parcel.writeString(mEchoOriginal);
        parcel.writeString(mEchoProgenitor);
        if (mIsInteractive)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        f.a(mCategory).b(parcel);
    }

}
