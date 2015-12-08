// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import java.io.Serializable;

// Referenced classes of package com.tinder.model:
//            User

public class Message
    implements Parcelable, Serializable, Cloneable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Message createFromParcel(Parcel parcel)
        {
            return new Message(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Message[] newArray(int i)
        {
            return new Message[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final long serialVersionUID = 0x750ec499e0a70fe9L;
    private final String mCreationDate;
    private String mFromUserId;
    private boolean mHasError;
    private boolean mIsFailed;
    private boolean mIsPending;
    private boolean mIsViewed;
    private final String mMatchId;
    private final String mText;
    private final long mTime;

    protected Message(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mMatchId = parcel.readString();
        mText = parcel.readString();
        mFromUserId = parcel.readString();
        mCreationDate = parcel.readString();
        mTime = parcel.readLong();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasError = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsViewed = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsPending = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIsFailed = flag;
    }

    public Message(String s, String s1, String s2, String s3, boolean flag, long l)
    {
        mCreationDate = s1;
        mTime = l;
        mMatchId = s;
        mFromUserId = s2;
        mText = s3;
        mIsViewed = flag;
    }

    public Message clone()
    {
        Message message = new Message(mMatchId, mCreationDate, mFromUserId, mText, mIsViewed, mTime);
        message.mIsPending = mIsPending;
        message.mIsFailed = mIsFailed;
        return message;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public int compareTo(Message message)
    {
        if (mTime < message.mTime)
        {
            return -1;
        }
        return mTime != message.mTime ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Message)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Message)obj;
            if (mHasError != ((Message) (obj)).mHasError)
            {
                return false;
            }
            if (mIsViewed != ((Message) (obj)).mIsViewed)
            {
                return false;
            }
            if (mIsPending != ((Message) (obj)).mIsPending)
            {
                return false;
            }
            if (mMatchId == null ? ((Message) (obj)).mMatchId != null : !mMatchId.equals(((Message) (obj)).mMatchId))
            {
                return false;
            }
            if (getCreationDate() == null ? ((Message) (obj)).getCreationDate() != null : !getCreationDate().equals(((Message) (obj)).getCreationDate()))
            {
                return false;
            }
            if (mText == null ? ((Message) (obj)).mText != null : !mText.equals(((Message) (obj)).mText))
            {
                return false;
            }
            if (mFromUserId == null ? ((Message) (obj)).mFromUserId != null : !mFromUserId.equals(((Message) (obj)).mFromUserId))
            {
                return false;
            }
        }
        return true;
    }

    public String getCreationDate()
    {
        return mCreationDate;
    }

    public String getFromUserId()
    {
        return mFromUserId;
    }

    public String getId()
    {
        return (new StringBuilder()).append(mMatchId).append(mFromUserId).toString();
    }

    public String getMatchId()
    {
        return mMatchId;
    }

    public String getText()
    {
        return mText;
    }

    public long getTime()
    {
        return mTime;
    }

    public boolean hasError()
    {
        return mHasError;
    }

    public int hashCode()
    {
        int k1 = 1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (mMatchId != null)
        {
            i = mMatchId.hashCode();
        } else
        {
            i = 0;
        }
        if (mText != null)
        {
            j = mText.hashCode();
        } else
        {
            j = 0;
        }
        if (getCreationDate() != null)
        {
            k = getCreationDate().hashCode();
        } else
        {
            k = 0;
        }
        if (mFromUserId != null)
        {
            l = mFromUserId.hashCode();
        } else
        {
            l = 0;
        }
        if (mHasError)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (mIsViewed)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (!mIsPending)
        {
            k1 = 0;
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    public boolean isFailed()
    {
        return mIsFailed;
    }

    public boolean isFromMe()
    {
        User user = ManagerApp.h().i().b();
        return user != null && mFromUserId != null && mFromUserId.equals(user.getId());
    }

    public boolean isPending()
    {
        return mIsPending;
    }

    public boolean isViewed()
    {
        return mIsViewed;
    }

    public void setHasError(boolean flag)
    {
        mHasError = flag;
    }

    public void setIsFailed(boolean flag)
    {
        mIsFailed = flag;
    }

    public void setIsPending(boolean flag)
    {
        mIsPending = flag;
    }

    public void setViewed(boolean flag)
    {
        mIsViewed = flag;
    }

    public String toString()
    {
        return (new StringBuilder("Message{mTime=")).append(mTime).append(", mText='").append(mText).append('\'').append(", mIsPending=").append(mIsPending).append(", mIsFailed=").append(mIsFailed).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(mMatchId);
        parcel.writeString(mText);
        parcel.writeString(mFromUserId);
        parcel.writeString(mCreationDate);
        parcel.writeLong(mTime);
        byte byte0;
        if (mHasError)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mIsViewed)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mIsPending)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mIsFailed)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}
