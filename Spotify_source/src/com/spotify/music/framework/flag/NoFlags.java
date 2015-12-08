// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.framework.flag;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import fyu;
import java.io.Serializable;

public class NoFlags
    implements Parcelable, Flags
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new NoFlags(parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new NoFlags[i];
        }

    };
    private final String a;

    public NoFlags(String s)
    {
        a = s;
    }

    public final Serializable a(fyu fyu)
    {
        throw new UnsupportedOperationException((new StringBuilder("You cannot read any flags from this object: ")).append(a).toString());
    }

    public final boolean a(Flags flags, fyu fyu)
    {
        throw new UnsupportedOperationException((new StringBuilder("You cannot read any flags from this object: ")).append(a).toString());
    }

    public final Serializable b(fyu fyu)
    {
        throw new UnsupportedOperationException((new StringBuilder("You cannot read any flags from this object: ")).append(a).toString());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
