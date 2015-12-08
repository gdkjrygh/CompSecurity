// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media.session:
//            f

public final class <init>
    implements Parcelable
{

    public static final android.os.teCompat.CustomAction.d CREATOR = new f();
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

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        TextUtils.writeToParcel(b, parcel, i);
        parcel.writeInt(c);
        parcel.writeBundle(d);
    }


    private (Parcel parcel)
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
}
