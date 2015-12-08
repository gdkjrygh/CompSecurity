// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//            a, b

public final class MediaDescriptionCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private Object h;

    private MediaDescriptionCompat(Parcel parcel)
    {
        a = parcel.readString();
        b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        e = (Bitmap)parcel.readParcelable(null);
        f = (Uri)parcel.readParcelable(null);
        g = parcel.readBundle();
    }

    MediaDescriptionCompat(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle)
    {
        a = s;
        b = charsequence;
        c = charsequence1;
        d = charsequence2;
        e = bitmap;
        f = uri;
        g = bundle;
    }

    MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
            byte byte0)
    {
        this(s, charsequence, charsequence1, charsequence2, bitmap, uri, bundle);
    }

    public static MediaDescriptionCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        } else
        {
            Object obj1 = new b();
            ((b) (obj1)).a(((MediaDescription)obj).getMediaId());
            ((b) (obj1)).a(((MediaDescription)obj).getTitle());
            ((b) (obj1)).b(((MediaDescription)obj).getSubtitle());
            ((b) (obj1)).c(((MediaDescription)obj).getDescription());
            ((b) (obj1)).a(((MediaDescription)obj).getIconBitmap());
            ((b) (obj1)).a(((MediaDescription)obj).getIconUri());
            ((b) (obj1)).a(((MediaDescription)obj).getExtras());
            obj1 = ((b) (obj1)).a();
            obj1.h = obj;
            return ((MediaDescriptionCompat) (obj1));
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b).append(", ").append(c).append(", ").append(d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            parcel.writeString(a);
            TextUtils.writeToParcel(b, parcel, i);
            TextUtils.writeToParcel(c, parcel, i);
            TextUtils.writeToParcel(d, parcel, i);
            parcel.writeParcelable(e, i);
            parcel.writeParcelable(f, i);
            parcel.writeBundle(g);
            return;
        }
        Object obj;
        if (h != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            obj = h;
        } else
        {
            obj = new android.media.MediaDescription.Builder();
            Object obj1 = a;
            ((android.media.MediaDescription.Builder)obj).setMediaId(((String) (obj1)));
            obj1 = b;
            ((android.media.MediaDescription.Builder)obj).setTitle(((CharSequence) (obj1)));
            obj1 = c;
            ((android.media.MediaDescription.Builder)obj).setSubtitle(((CharSequence) (obj1)));
            obj1 = d;
            ((android.media.MediaDescription.Builder)obj).setDescription(((CharSequence) (obj1)));
            obj1 = e;
            ((android.media.MediaDescription.Builder)obj).setIconBitmap(((Bitmap) (obj1)));
            obj1 = f;
            ((android.media.MediaDescription.Builder)obj).setIconUri(((Uri) (obj1)));
            obj1 = g;
            ((android.media.MediaDescription.Builder)obj).setExtras(((Bundle) (obj1)));
            h = ((android.media.MediaDescription.Builder)obj).build();
            obj = h;
        }
        ((MediaDescription)obj).writeToParcel(parcel, i);
    }

}
