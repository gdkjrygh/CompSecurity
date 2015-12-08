// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class ie
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new if();
    final String a;
    final CharSequence b;
    final int c;
    final Bundle d;
    Object e;

    ie(Parcel parcel)
    {
        a = parcel.readString();
        b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        c = parcel.readInt();
        d = parcel.readBundle();
    }

    private ie(String s, CharSequence charsequence, int i, Bundle bundle)
    {
        a = s;
        b = charsequence;
        c = i;
        d = bundle;
    }

    public static ie a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        } else
        {
            ie ie1 = new ie(((android.media.session.PlaybackState.CustomAction)obj).getAction(), ((android.media.session.PlaybackState.CustomAction)obj).getName(), ((android.media.session.PlaybackState.CustomAction)obj).getIcon(), ((android.media.session.PlaybackState.CustomAction)obj).getExtras());
            ie1.e = obj;
            return ie1;
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

}
