// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class d
    implements Parcelable
{

    public static final android.os.teCompat.CustomAction.d CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PlaybackStateCompat.CustomAction(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PlaybackStateCompat.CustomAction[i];
        }

    };
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;
    public Object e;

    public static d a(Object obj)
    {
        if (obj == null || android.os.teCompat.CustomAction < 21)
        {
            return null;
        } else
        {
            d d1 = new <init>(((android.media.session.stomAction)obj).ion(), ((android.media.session.ion)obj).e(), ((android.media.session.e)obj).n(), ((android.media.session.n)obj).ras());
            d1.e = obj;
            return d1;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("Action:mName='")).append(b).append(", mIcon=").append(c).append(", mExtras=").append(d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
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

    d(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private <init>(String s, CharSequence charsequence, int i, Bundle bundle)
    {
        a = s;
        b = charsequence;
        c = i;
        d = bundle;
    }
}
