// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class Presence
    implements Parcelable
{
    public static final class Show extends Enum
    {

        private static final Show $VALUES[];
        public static final Show AVAILABLE;
        public static final Show AWAY;
        public static final Show DND;
        public static final Show EXTENDED_AWAY;
        public static final Show NONE;

        public static Show valueOf(String s)
        {
            return (Show)Enum.valueOf(com/google/android/gtalkservice/Presence$Show, s);
        }

        public static Show[] values()
        {
            return (Show[])$VALUES.clone();
        }

        static 
        {
            NONE = new Show("NONE", 0);
            AWAY = new Show("AWAY", 1);
            EXTENDED_AWAY = new Show("EXTENDED_AWAY", 2);
            DND = new Show("DND", 3);
            AVAILABLE = new Show("AVAILABLE", 4);
            $VALUES = (new Show[] {
                NONE, AWAY, EXTENDED_AWAY, DND, AVAILABLE
            });
        }

        private Show(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new Presence(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Presence[i];
        }

    };
    public static final Presence OFFLINE = new Presence();
    private boolean mAllowInvisibility;
    private boolean mAvailable;
    private int mCapabilities;
    private List mDefaultStatusList;
    private List mDndStatusList;
    private boolean mInvisible;
    private Show mShow;
    private String mStatus;
    private int mStatusListContentsMax;
    private int mStatusListMax;
    private int mStatusMax;

    public Presence()
    {
        this(Show.NONE);
    }

    public Presence(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mStatusMax = parcel.readInt();
        mStatusListMax = parcel.readInt();
        mStatusListContentsMax = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAllowInvisibility = flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAvailable = flag;
        mShow = (Show)Enum.valueOf(com/google/android/gtalkservice/Presence$Show, parcel.readString());
        mStatus = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mInvisible = flag;
        mDefaultStatusList = new ArrayList();
        parcel.readStringList(mDefaultStatusList);
        mDndStatusList = new ArrayList();
        parcel.readStringList(mDndStatusList);
        mCapabilities = parcel.readInt();
    }

    private Presence(Show show)
    {
        mAvailable = false;
        mShow = show;
        mStatus = null;
        mInvisible = false;
        mDefaultStatusList = new ArrayList();
        mDndStatusList = new ArrayList();
        mCapabilities = 8;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        if (!mAvailable)
        {
            return "UNAVAILABLE";
        }
        if (mInvisible)
        {
            return "INVISIBLE";
        }
        StringBuilder stringbuilder = new StringBuilder(40);
        if (mShow == Show.NONE)
        {
            stringbuilder.append("AVAILABLE(x)");
        } else
        {
            stringbuilder.append(mShow.toString());
        }
        if ((mCapabilities & 8) != 0)
        {
            stringbuilder.append(" pmuc-v1");
        }
        if ((mCapabilities & 1) != 0)
        {
            stringbuilder.append(" voice-v1");
        }
        if ((mCapabilities & 2) != 0)
        {
            stringbuilder.append(" video-v1");
        }
        if ((mCapabilities & 4) != 0)
        {
            stringbuilder.append(" camera-v1");
        }
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(mStatusMax);
        parcel.writeInt(mStatusListMax);
        parcel.writeInt(mStatusListContentsMax);
        if (mAllowInvisibility)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mAvailable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(mShow.toString());
        parcel.writeString(mStatus);
        if (mInvisible)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeStringList(mDefaultStatusList);
        parcel.writeStringList(mDndStatusList);
        parcel.writeInt(mCapabilities);
    }

}
