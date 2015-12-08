// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompatApi21, PlaybackStateCompatApi22

public final class PlaybackStateCompat
    implements Parcelable
{

    public static final long ACTION_FAST_FORWARD = 64L;
    public static final long ACTION_PAUSE = 2L;
    public static final long ACTION_PLAY = 4L;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
    public static final long ACTION_PLAY_PAUSE = 512L;
    public static final long ACTION_REWIND = 8L;
    public static final long ACTION_SEEK_TO = 256L;
    public static final long ACTION_SET_RATING = 128L;
    public static final long ACTION_SKIP_TO_NEXT = 32L;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
    public static final long ACTION_STOP = 1L;
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    private final long mActions;
    private final long mActiveItemId;
    private final long mBufferedPosition;
    private List mCustomActions;
    private final CharSequence mErrorMessage;
    private final Bundle mExtras;
    private final long mPosition;
    private final float mSpeed;
    private final int mState;
    private Object mStateObj;
    private final long mUpdateTime;

    private PlaybackStateCompat(int i, long l, long l1, float f, long l2, CharSequence charsequence, long l3, List list, long l4, 
            Bundle bundle)
    {
        mState = i;
        mPosition = l;
        mBufferedPosition = l1;
        mSpeed = f;
        mActions = l2;
        mErrorMessage = charsequence;
        mUpdateTime = l3;
        mCustomActions = new ArrayList(list);
        mActiveItemId = l4;
        mExtras = bundle;
    }

    PlaybackStateCompat(int i, long l, long l1, float f, long l2, CharSequence charsequence, long l3, List list, long l4, 
            Bundle bundle, _cls1 _pcls1)
    {
        this(i, l, l1, f, l2, charsequence, l3, list, l4, bundle);
    }

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

    PlaybackStateCompat(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        Object obj2 = PlaybackStateCompatApi21.getCustomActions(obj);
        Object obj1 = null;
        if (obj2 != null)
        {
            ArrayList arraylist = new ArrayList(((List) (obj2)).size());
            obj2 = ((List) (obj2)).iterator();
            do
            {
                obj1 = arraylist;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                arraylist.add(CustomAction.fromCustomAction(((Iterator) (obj2)).next()));
            } while (true);
        }
        Bundle bundle;
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            bundle = PlaybackStateCompatApi22.getExtras(obj);
        } else
        {
            bundle = null;
        }
        obj1 = new PlaybackStateCompat(PlaybackStateCompatApi21.getState(obj), PlaybackStateCompatApi21.getPosition(obj), PlaybackStateCompatApi21.getBufferedPosition(obj), PlaybackStateCompatApi21.getPlaybackSpeed(obj), PlaybackStateCompatApi21.getActions(obj), PlaybackStateCompatApi21.getErrorMessage(obj), PlaybackStateCompatApi21.getLastPositionUpdateTime(obj), ((List) (obj1)), PlaybackStateCompatApi21.getActiveQueueItemId(obj), bundle);
        obj1.mStateObj = obj;
        return ((PlaybackStateCompat) (obj1));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long getActions()
    {
        return mActions;
    }

    public final long getActiveQueueItemId()
    {
        return mActiveItemId;
    }

    public final long getBufferedPosition()
    {
        return mBufferedPosition;
    }

    public final List getCustomActions()
    {
        return mCustomActions;
    }

    public final CharSequence getErrorMessage()
    {
        return mErrorMessage;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final long getLastPositionUpdateTime()
    {
        return mUpdateTime;
    }

    public final float getPlaybackSpeed()
    {
        return mSpeed;
    }

    public final Object getPlaybackState()
    {
        if (mStateObj != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return mStateObj;
        }
        ArrayList arraylist = null;
        if (mCustomActions != null)
        {
            ArrayList arraylist1 = new ArrayList(mCustomActions.size());
            Iterator iterator = mCustomActions.iterator();
            do
            {
                arraylist = arraylist1;
                if (!iterator.hasNext())
                {
                    break;
                }
                arraylist1.add(((CustomAction)iterator.next()).getCustomAction());
            } while (true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            mStateObj = PlaybackStateCompatApi22.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, arraylist, mActiveItemId, mExtras);
        } else
        {
            mStateObj = PlaybackStateCompatApi21.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, arraylist, mActiveItemId);
        }
        return mStateObj;
    }

    public final long getPosition()
    {
        return mPosition;
    }

    public final int getState()
    {
        return mState;
    }

    public final String toString()
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

    public final void writeToParcel(Parcel parcel, int i)
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












    private class CustomAction
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private final String mAction;
        private Object mCustomActionObj;
        private final Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        public static CustomAction fromCustomAction(Object obj)
        {
            if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
            {
                return null;
            } else
            {
                CustomAction customaction = new CustomAction(PlaybackStateCompatApi21.CustomAction.getAction(obj), PlaybackStateCompatApi21.CustomAction.getName(obj), PlaybackStateCompatApi21.CustomAction.getIcon(obj), PlaybackStateCompatApi21.CustomAction.getExtras(obj));
                customaction.mCustomActionObj = obj;
                return customaction;
            }
        }

        public final int describeContents()
        {
            return 0;
        }

        public final String getAction()
        {
            return mAction;
        }

        public final Object getCustomAction()
        {
            if (mCustomActionObj != null || android.os.Build.VERSION.SDK_INT < 21)
            {
                return mCustomActionObj;
            } else
            {
                mCustomActionObj = PlaybackStateCompatApi21.CustomAction.newInstance(mAction, mName, mIcon, mExtras);
                return mCustomActionObj;
            }
        }

        public final Bundle getExtras()
        {
            return mExtras;
        }

        public final int getIcon()
        {
            return mIcon;
        }

        public final CharSequence getName()
        {
            return mName;
        }

        public final String toString()
        {
            return (new StringBuilder("Action:mName='")).append(mName).append(", mIcon=").append(mIcon).append(", mExtras=").append(mExtras).toString();
        }

        public final void writeToParcel(Parcel parcel, int i)
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

        CustomAction(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        private CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
        {
            mAction = s;
            mName = charsequence;
            mIcon = i;
            mExtras = bundle;
        }

        CustomAction(String s, CharSequence charsequence, int i, Bundle bundle, _cls1 _pcls1)
        {
            this(s, charsequence, i, bundle);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final CustomAction createFromParcel(Parcel parcel)
            {
                return new CustomAction(parcel, null);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final CustomAction[] newArray(int i)
            {
                return new CustomAction[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PlaybackStateCompat createFromParcel(Parcel parcel)
        {
            return new PlaybackStateCompat(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlaybackStateCompat[] newArray(int i)
        {
            return new PlaybackStateCompat[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
