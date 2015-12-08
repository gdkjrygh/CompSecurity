// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tinder.d.f;
import com.tinder.enums.UserPhotoSize;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.tinder.model:
//            Person, Message, Badge, User, 
//            ProfilePhoto

public class Match
    implements Parcelable, f, Serializable, Cloneable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Match createFromParcel(Parcel parcel)
        {
            return new Match(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Match[] newArray(int i)
        {
            return new Match[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final long INVALID_DATE = -1L;
    public static final int REPORTED_ABUSIVE_CONTENT_MASK = 2;
    public static final int REPORTED_BAD_OFFLINE_BEHAVIOR = 9;
    public static final int REPORTED_INAPPROPRIATE_PHOTOS = 5;
    public static final int REPORTED_OTHER = 7;
    public static final int REPORTED_SPAM_MASK = 1;
    static final long serialVersionUID = 0x3b7a7955bd864e27L;
    private final String mCreatedDate;
    private String mDraftMsg;
    private String mFormattedCreatedDate;
    private final String mId;
    private boolean mIsSuperlike;
    private final String mLastActivityDate;
    private TreeSet mMessages;
    private final long mParsedActivityDate;
    private Person mPerson;
    private int mReportedMasks;
    private Set mSeenMessages;
    private String mSuperLiker;
    private boolean mTouched;
    private boolean mViewed;

    protected Match(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mSeenMessages = new HashSet();
        mDraftMsg = "";
        mId = parcel.readString();
        mLastActivityDate = parcel.readString();
        mCreatedDate = parcel.readString();
        mParsedActivityDate = parcel.readLong();
        String as[] = parcel.createStringArray();
        mSeenMessages = new HashSet(as.length);
        Collections.addAll(mSeenMessages, as);
        mPerson = (Person)parcel.readParcelable(com/tinder/model/Person.getClassLoader());
        mMessages = (TreeSet)parcel.readSerializable();
        mDraftMsg = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mTouched = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mViewed = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIsSuperlike = flag;
        mSuperLiker = parcel.readString();
        mFormattedCreatedDate = parcel.readString();
        mReportedMasks = parcel.readInt();
    }

    public Match(Person person, String s, TreeSet treeset, String s1, String s2, boolean flag, String s3)
    {
        mSeenMessages = new HashSet();
        mDraftMsg = "";
        mPerson = person;
        mId = s;
        if (treeset != null && !treeset.isEmpty())
        {
            mMessages = treeset;
        }
        mLastActivityDate = s1;
        mCreatedDate = s2;
        mIsSuperlike = flag;
        mSuperLiker = s3;
        if (treeset != null)
        {
            person = treeset.descendingIterator();
            do
            {
                if (!person.hasNext())
                {
                    break;
                }
                s = (Message)person.next();
                if (!mSeenMessages.contains(s.getCreationDate()))
                {
                    mSeenMessages.add(s.getCreationDate());
                }
            } while (true);
        }
        try
        {
            person = DateUtils.a().parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Person person)
        {
            v.a("Failed to parse activity date for match", person);
            person = null;
        }
        if (person == null)
        {
            mParsedActivityDate = -1L;
            return;
        } else
        {
            mParsedActivityDate = person.getTime();
            return;
        }
    }

    public void addMessage(Message message)
    {
        if (!mSeenMessages.contains(message.getCreationDate()))
        {
            mSeenMessages.add(message.getCreationDate());
            if (mMessages == null)
            {
                mMessages = new TreeSet();
            }
            mMessages.add(message);
        }
    }

    public void addPhoto(ProfilePhoto profilephoto)
    {
        if (mPerson != null)
        {
            mPerson.profilePhotos.add(profilephoto);
        }
    }

    public void addPreviousMessages(TreeSet treeset)
    {
        if (treeset.size() > 0)
        {
            treeset = treeset.descendingIterator();
            do
            {
                if (!treeset.hasNext())
                {
                    break;
                }
                Message message = (Message)treeset.next();
                if (!mSeenMessages.contains(message.getCreationDate()))
                {
                    mSeenMessages.add(message.getCreationDate());
                    if (mMessages == null)
                    {
                        mMessages = new TreeSet();
                    }
                    mMessages.add(message);
                }
            } while (true);
        }
    }

    public void addReportedMask(int i)
    {
        mReportedMasks = mReportedMasks | i;
    }

    public Match clone()
    {
        Object obj;
        try
        {
            super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            v.b("Failed to clone Match superclass");
        }
        obj = null;
        if (mMessages != null)
        {
            obj = (TreeSet)mMessages.clone();
        }
        obj = new Match(mPerson, mId, ((TreeSet) (obj)), mLastActivityDate, mCreatedDate, mIsSuperlike, mSuperLiker);
        obj.mTouched = mTouched;
        obj.mViewed = mViewed;
        return ((Match) (obj));
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public int compareTo(Match match)
    {
        if ((mPerson == null || match.mPerson == null || mPerson.userId == null || !mPerson.userId.equals(match.mPerson.userId)) && !mId.equals(match.mId))
        {
            if (mParsedActivityDate > match.mParsedActivityDate)
            {
                return -1;
            }
            if (mParsedActivityDate != match.mParsedActivityDate)
            {
                return 1;
            }
        }
        return 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Match)obj);
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
            obj = (Match)obj;
            if (mId == null ? ((Match) (obj)).mId != null : !mId.equals(((Match) (obj)).mId))
            {
                return false;
            }
        }
        return true;
    }

    public List getBadges()
    {
        if (mPerson == null || mPerson.badges == null)
        {
            return Collections.EMPTY_LIST;
        } else
        {
            return mPerson.badges;
        }
    }

    public String getCreatedDate()
    {
        return mCreatedDate;
    }

    public String getDraftMsg()
    {
        return mDraftMsg;
    }

    public Badge getFirstBadge()
    {
        List list = getBadges();
        if (!list.isEmpty())
        {
            return (Badge)list.get(0);
        } else
        {
            return null;
        }
    }

    public String getFormattedCreatedDate()
    {
        return mFormattedCreatedDate;
    }

    public String getId()
    {
        return mId;
    }

    public String getLastActivityDate()
    {
        return mLastActivityDate;
    }

    public String getLatestTimestamp()
    {
        String s = mCreatedDate;
        if (s == null || mLastActivityDate.compareTo(s) > 0)
        {
            s = mLastActivityDate;
        }
        String s1 = s;
        if (mMessages != null)
        {
            s1 = s;
            if (!mMessages.isEmpty())
            {
                String s2 = ((Message)mMessages.last()).getCreationDate();
                s1 = s;
                if (s2 != null)
                {
                    s1 = s;
                    if (s2.compareTo(s) > 0)
                    {
                        s1 = s2;
                    }
                }
            }
        }
        return s1;
    }

    public TreeSet getMessages()
    {
        if (mMessages == null)
        {
            return new TreeSet();
        } else
        {
            return mMessages;
        }
    }

    public String getName()
    {
        String s;
        if (mPerson == null)
        {
            s = "";
        } else
        {
            String s1 = mPerson.name;
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        }
        return s;
    }

    public long getParsedActivityDate()
    {
        return mParsedActivityDate;
    }

    public Person getPerson()
    {
        return mPerson;
    }

    public int getReportedMasks()
    {
        return mReportedMasks;
    }

    public String getSuperLiker()
    {
        return mSuperLiker;
    }

    public String getThumbnailUrl()
    {
        if (mPerson != null && mPerson.profilePhotos.size() > 0)
        {
            return mPerson.getAvatarUrl(0, UserPhotoSize.XSMALL);
        } else
        {
            return "";
        }
    }

    public boolean hasBadge()
    {
        return getFirstBadge() != null;
    }

    public boolean hasMessageFromMe()
    {
        if (mMessages == null)
        {
            return false;
        }
        for (Iterator iterator = mMessages.iterator(); iterator.hasNext();)
        {
            if (((Message)iterator.next()).isFromMe())
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasMessages()
    {
        return mMessages != null && !mMessages.isEmpty();
    }

    public boolean hasNewMessage()
    {
        if (mMessages != null && !mMessages.isEmpty() && !mTouched)
        {
            return !((Message)mMessages.last()).isFromMe();
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        if (mId != null)
        {
            return mId.hashCode();
        } else
        {
            return 0;
        }
    }

    public boolean isLastMsgFromMe()
    {
        return mMessages != null && mMessages.size() > 0 && ((Message)mMessages.last()).isFromMe();
    }

    public boolean isSuperlike()
    {
        return mIsSuperlike;
    }

    public boolean isTheSuperLiker(User user)
    {
        if (user == null)
        {
            return false;
        } else
        {
            return isTheSuperLiker(user.getId());
        }
    }

    public boolean isTheSuperLiker(String s)
    {
        return s.equalsIgnoreCase(mSuperLiker);
    }

    public boolean isTouched()
    {
        return mTouched;
    }

    public boolean isVerified()
    {
        if (mPerson == null)
        {
            return false;
        } else
        {
            return mPerson.isVerified;
        }
    }

    public void setDraftMsg(String s)
    {
        mDraftMsg = s;
    }

    public void setFormattedCreatedDate(String s)
    {
        mFormattedCreatedDate = s;
    }

    public void setMessages(TreeSet treeset)
    {
        mMessages = treeset;
    }

    public void setPerson(Person person)
    {
        mPerson = person;
    }

    public void setReportedMasks(int i)
    {
        mReportedMasks = i;
    }

    public void setTouched(boolean flag)
    {
        mTouched = flag;
    }

    public void setViewed(boolean flag)
    {
        mViewed = flag;
    }

    public boolean superLikerIsThem()
    {
        if (mPerson != null)
        {
            return isTheSuperLiker(mPerson.userId);
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        if (mPerson != null)
        {
            return (new StringBuilder("Name: ")).append(mPerson.name).append(", id: ").append(mId).toString();
        } else
        {
            return (new StringBuilder("id: ")).append(mId).toString();
        }
    }

    public boolean wasViewed()
    {
        return mViewed;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(mId);
        parcel.writeString(mLastActivityDate);
        parcel.writeString(mCreatedDate);
        parcel.writeLong(mParsedActivityDate);
        parcel.writeStringArray((String[])mSeenMessages.toArray(new String[mSeenMessages.size()]));
        parcel.writeParcelable(mPerson, i);
        parcel.writeSerializable(mMessages);
        parcel.writeString(mDraftMsg);
        byte byte0;
        if (mTouched)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mViewed)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (mIsSuperlike)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeString(mSuperLiker);
        parcel.writeString(mFormattedCreatedDate);
        parcel.writeInt(mReportedMasks);
    }

}
