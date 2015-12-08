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

public final class MediaDescriptionCompat
    implements Parcelable
{
    public static final class a
    {

        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public final a a(Bitmap bitmap)
        {
            e = bitmap;
            return this;
        }

        public final a a(Uri uri)
        {
            f = uri;
            return this;
        }

        public final a a(Bundle bundle)
        {
            g = bundle;
            return this;
        }

        public final a a(CharSequence charsequence)
        {
            b = charsequence;
            return this;
        }

        public final a a(String s)
        {
            a = s;
            return this;
        }

        public final MediaDescriptionCompat a()
        {
            return new MediaDescriptionCompat(a, b, c, d, e, f, g, h, (byte)0);
        }

        public final a b(Uri uri)
        {
            h = uri;
            return this;
        }

        public final a b(CharSequence charsequence)
        {
            c = charsequence;
            return this;
        }

        public final a c(CharSequence charsequence)
        {
            d = charsequence;
            return this;
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                return new MediaDescriptionCompat(parcel, (byte)0);
            } else
            {
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            }
        }

        public final volatile Object[] newArray(int j)
        {
            return new MediaDescriptionCompat[j];
        }

    };
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private Object i;

    private MediaDescriptionCompat(Parcel parcel)
    {
        a = parcel.readString();
        b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        e = (Bitmap)parcel.readParcelable(null);
        f = (Uri)parcel.readParcelable(null);
        g = parcel.readBundle();
        h = (Uri)parcel.readParcelable(null);
    }

    MediaDescriptionCompat(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
            Uri uri1)
    {
        a = s;
        b = charsequence;
        c = charsequence1;
        d = charsequence2;
        e = bitmap;
        f = uri;
        g = bundle;
        h = uri1;
    }

    MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
            Uri uri1, byte byte0)
    {
        this(s, charsequence, charsequence1, charsequence2, bitmap, uri, bundle, uri1);
    }

    public static MediaDescriptionCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        Object obj1 = new a();
        ((a) (obj1)).a(((MediaDescription)obj).getMediaId());
        ((a) (obj1)).a(((MediaDescription)obj).getTitle());
        ((a) (obj1)).b(((MediaDescription)obj).getSubtitle());
        ((a) (obj1)).c(((MediaDescription)obj).getDescription());
        ((a) (obj1)).a(((MediaDescription)obj).getIconBitmap());
        ((a) (obj1)).a(((MediaDescription)obj).getIconUri());
        ((a) (obj1)).a(((MediaDescription)obj).getExtras());
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            ((a) (obj1)).b(((MediaDescription)obj).getMediaUri());
        }
        obj1 = ((a) (obj1)).a();
        obj1.i = obj;
        return ((MediaDescriptionCompat) (obj1));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b).append(", ").append(c).append(", ").append(d).toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            parcel.writeString(a);
            TextUtils.writeToParcel(b, parcel, j);
            TextUtils.writeToParcel(c, parcel, j);
            TextUtils.writeToParcel(d, parcel, j);
            parcel.writeParcelable(e, j);
            parcel.writeParcelable(f, j);
            parcel.writeBundle(g);
            return;
        }
        Object obj;
        if (i != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            obj = i;
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
            if (android.os.Build.VERSION.SDK_INT >= 23)
            {
                Uri uri = h;
                ((android.media.MediaDescription.Builder)obj).setMediaUri(uri);
            }
            i = ((android.media.MediaDescription.Builder)obj).build();
            obj = i;
        }
        ((MediaDescription)obj).writeToParcel(parcel, j);
    }

}
