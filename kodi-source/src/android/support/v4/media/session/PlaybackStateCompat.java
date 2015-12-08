// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat
    implements Parcelable
{
    public static final class CustomAction
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public CustomAction createFromParcel(Parcel parcel)
            {
                return new CustomAction(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public CustomAction[] newArray(int i)
            {
                return new CustomAction[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final String mAction;
        private final Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Action:mName='").append(mName).append(", mIcon=").append(mIcon).append(", mExtras=").append(mExtras).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mAction);
            TextUtils.writeToParcel(mName, parcel, i);
            parcel.writeInt(mIcon);
            parcel.writeBundle(mExtras);
        }


        private CustomAction(Parcel parcel)
        {
            mAction = parcel.readString();
            mName = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            mIcon = parcel.readInt();
            mExtras = parcel.readBundle();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PlaybackStateCompat createFromParcel(Parcel parcel)
        {
            return new PlaybackStateCompat(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PlaybackStateCompat[] newArray(int i)
        {
            return new PlaybackStateCompat[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final long mActions;
    private final long mActiveItemId;
    private final long mBufferedPosition;
    private List mCustomActions;
    private final CharSequence mErrorMessage;
    private final Bundle mExtras;
    private final long mPosition;
    private final float mSpeed;
    private final int mState;
    private final long mUpdateTime;

    private PlaybackStateCompat(Parcel parcel)
    {
        mState = parcel.readInt();
        mPosition = parcel.readLong();
        mSpeed = parcel.readFloat();
        mUpdateTime = parcel.readLong();
        mBufferedPosition = parcel.readLong();
        mActions = parcel.readLong();
        mErrorMessage = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        mActiveItemId = parcel.readLong();
        mExtras = parcel.readBundle();
    }


    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
        stringbuilder.append("state=").append(mState);
        stringbuilder.append(", position=").append(mPosition);
        stringbuilder.append(", buffered position=").append(mBufferedPosition);
        stringbuilder.append(", speed=").append(mSpeed);
        stringbuilder.append(", updated=").append(mUpdateTime);
        stringbuilder.append(", actions=").append(mActions);
        stringbuilder.append(", error=").append(mErrorMessage);
        stringbuilder.append(", custom actions=").append(mCustomActions);
        stringbuilder.append(", active item id=").append(mActiveItemId);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mState);
        parcel.writeLong(mPosition);
        parcel.writeFloat(mSpeed);
        parcel.writeLong(mUpdateTime);
        parcel.writeLong(mBufferedPosition);
        parcel.writeLong(mActions);
        TextUtils.writeToParcel(mErrorMessage, parcel, i);
        parcel.writeTypedList(mCustomActions);
        parcel.writeLong(mActiveItemId);
        parcel.writeBundle(mExtras);
    }

}
