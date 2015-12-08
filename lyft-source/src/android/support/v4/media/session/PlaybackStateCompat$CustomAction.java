// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class <init>
    implements Parcelable
{

    public static final android.os.teCompat.CustomAction.d CREATOR = new android.os.Parcelable.Creator() {

        public PlaybackStateCompat.CustomAction a(Parcel parcel)
        {
            return new PlaybackStateCompat.CustomAction(parcel, null);
        }

        public PlaybackStateCompat.CustomAction[] a(int i)
        {
            return new PlaybackStateCompat.CustomAction[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final String a;
    private final CharSequence b;
    private final int c;
    private final Bundle d;

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Action:mName='").append(b).append(", mIcon=").append(c).append(", mExtras=").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        TextUtils.writeToParcel(b, parcel, i);
        parcel.writeInt(c);
        parcel.writeBundle(d);
    }


    private _cls1(Parcel parcel)
    {
        a = parcel.readString();
        b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.el(parcel);
        c = parcel.readInt();
        d = parcel.readBundle();
    }

    d(Parcel parcel, d d1)
    {
        this(parcel);
    }
}
