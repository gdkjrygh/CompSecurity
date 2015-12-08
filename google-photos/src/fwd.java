// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;

public class fwd
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new fwe();
    public final Uri a;

    public fwd(Uri uri)
    {
        p.a("file".equals(uri.getScheme()), "LocalFileUri must be empty or a file: URI");
        a = uri;
    }

    fwd(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
