// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.photopicker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class Photo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final int photoId;
    private final Uri uri;

    Photo(Uri uri1, int i)
    {
        uri = uri1;
        photoId = i;
    }

    public Photo(Parcel parcel)
    {
        uri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        photoId = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Photo)
        {
            if (((Photo) (obj = (Photo)obj)).uri.equals(uri) && ((Photo) (obj)).getId() == photoId)
            {
                return true;
            }
        }
        return false;
    }

    int getId()
    {
        return photoId;
    }

    public Uri getUri()
    {
        return uri;
    }

    public int hashCode()
    {
        return (uri.hashCode() + 527) * 31 + photoId;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(uri, i);
        parcel.writeInt(photoId);
    }


    /* member class not found */
    class _cls1 {}

}
