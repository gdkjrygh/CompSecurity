// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class gvv
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gvw();
    final Uri a;
    final gum b;

    gvv(Uri uri, gum gum1)
    {
        a = uri;
        b = gum1;
    }

    gvv(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        b = (gum)parcel.readParcelable(gum.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
    }

}
