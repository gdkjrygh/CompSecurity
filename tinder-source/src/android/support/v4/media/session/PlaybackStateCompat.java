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

            public final Object createFromParcel(Parcel parcel)
            {
                return new CustomAction(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int k)
            {
                return new CustomAction[k];
            }

        };
        private final String a;
        private final CharSequence b;
        private final int c;
        private final Bundle d;

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return (new StringBuilder("Action:mName='")).append(b).append(", mIcon=").append(c).append(", mExtras=").append(d).toString();
        }

        public final void writeToParcel(Parcel parcel, int k)
        {
            parcel.writeString(a);
            TextUtils.writeToParcel(b, parcel, k);
            parcel.writeInt(c);
            parcel.writeBundle(d);
        }


        private CustomAction(Parcel parcel)
        {
            a = parcel.readString();
            b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            c = parcel.readInt();
            d = parcel.readBundle();
        }

        CustomAction(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PlaybackStateCompat(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int k)
        {
            return new PlaybackStateCompat[k];
        }

    };
    private final int a;
    private final long b;
    private final long c;
    private final float d;
    private final long e;
    private final CharSequence f;
    private final long g;
    private List h;
    private final long i;
    private final Bundle j;

    private PlaybackStateCompat(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readLong();
        d = parcel.readFloat();
        g = parcel.readLong();
        c = parcel.readLong();
        e = parcel.readLong();
        f = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.createTypedArrayList(CustomAction.CREATOR);
        i = parcel.readLong();
        j = parcel.readBundle();
    }

    PlaybackStateCompat(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
        stringbuilder.append("state=").append(a);
        stringbuilder.append(", position=").append(b);
        stringbuilder.append(", buffered position=").append(c);
        stringbuilder.append(", speed=").append(d);
        stringbuilder.append(", updated=").append(g);
        stringbuilder.append(", actions=").append(e);
        stringbuilder.append(", error=").append(f);
        stringbuilder.append(", custom actions=").append(h);
        stringbuilder.append(", active item id=").append(i);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeInt(a);
        parcel.writeLong(b);
        parcel.writeFloat(d);
        parcel.writeLong(g);
        parcel.writeLong(c);
        parcel.writeLong(e);
        TextUtils.writeToParcel(f, parcel, k);
        parcel.writeTypedList(h);
        parcel.writeLong(i);
        parcel.writeBundle(j);
    }

}
