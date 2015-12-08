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

    public static Object a(Parcel parcel)
    {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    public static String a(Object obj)
    {
        return ((MediaDescription)obj).getMediaId();
    }

    public static void a(Object obj, Parcel parcel, int i)
    {
        ((MediaDescription)obj).writeToParcel(parcel, i);
    }

    public static CharSequence b(Object obj)
    {
        return ((MediaDescription)obj).getTitle();
    }

    public static CharSequence c(Object obj)
    {
        return ((MediaDescription)obj).getSubtitle();
    }

    public static CharSequence d(Object obj)
    {
        return ((MediaDescription)obj).getDescription();
    }

    public static Bitmap e(Object obj)
    {
        return ((MediaDescription)obj).getIconBitmap();
    }

    public static Uri f(Object obj)
    {
        return ((MediaDescription)obj).getIconUri();
    }

    public static Bundle g(Object obj)
    {
        return ((MediaDescription)obj).getExtras();
    }
}
