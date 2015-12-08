// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

public class MediaDescriptionCompatApi21
{

    public MediaDescriptionCompatApi21()
    {
    }

    public static Object fromParcel(Parcel parcel)
    {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    public static CharSequence getDescription(Object obj)
    {
        return ((MediaDescription)obj).getDescription();
    }

    public static Bundle getExtras(Object obj)
    {
        return ((MediaDescription)obj).getExtras();
    }

    public static Bitmap getIconBitmap(Object obj)
    {
        return ((MediaDescription)obj).getIconBitmap();
    }

    public static Uri getIconUri(Object obj)
    {
        return ((MediaDescription)obj).getIconUri();
    }

    public static String getMediaId(Object obj)
    {
        return ((MediaDescription)obj).getMediaId();
    }

    public static CharSequence getSubtitle(Object obj)
    {
        return ((MediaDescription)obj).getSubtitle();
    }

    public static CharSequence getTitle(Object obj)
    {
        return ((MediaDescription)obj).getTitle();
    }

    public static void writeToParcel(Object obj, Parcel parcel, int i)
    {
        ((MediaDescription)obj).writeToParcel(parcel, i);
    }
}
