// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.URL;

public class InstagramPhoto
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final URL fullURL;
    private final URL thumbURL;

    public InstagramPhoto(Parcel parcel)
    {
        thumbURL = (URL)parcel.readValue(java/net/URL.getClassLoader());
        fullURL = (URL)parcel.readValue(java/net/URL.getClassLoader());
    }

    public InstagramPhoto(URL url, URL url1)
    {
        thumbURL = url;
        fullURL = url1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof InstagramPhoto)
        {
            if (((InstagramPhoto) (obj = (InstagramPhoto)obj)).thumbURL.equals(thumbURL) && ((InstagramPhoto) (obj)).fullURL.equals(fullURL))
            {
                return true;
            }
        }
        return false;
    }

    public URL getFullURL()
    {
        return fullURL;
    }

    public URL getThumbnailURL()
    {
        return thumbURL;
    }

    public int hashCode()
    {
        return (thumbURL.hashCode() + 527) * 31 + fullURL.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(thumbURL);
        parcel.writeValue(fullURL);
    }


    /* member class not found */
    class _cls1 {}

}
