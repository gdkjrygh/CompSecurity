// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompatApi21, MediaDescriptionCompatApi23

public final class MediaDescriptionCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public MediaDescriptionCompat a(Parcel parcel)
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                return new MediaDescriptionCompat(parcel);
            } else
            {
                return MediaDescriptionCompat.a(MediaDescriptionCompatApi21.a(parcel));
            }
        }

        public MediaDescriptionCompat[] a(int j)
        {
            return new MediaDescriptionCompat[j];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int j)
        {
            return a(j);
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


    public static MediaDescriptionCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        Object obj1 = new Builder();
        ((Builder) (obj1)).a(MediaDescriptionCompatApi21.a(obj));
        ((Builder) (obj1)).a(MediaDescriptionCompatApi21.b(obj));
        ((Builder) (obj1)).b(MediaDescriptionCompatApi21.c(obj));
        ((Builder) (obj1)).c(MediaDescriptionCompatApi21.d(obj));
        ((Builder) (obj1)).a(MediaDescriptionCompatApi21.e(obj));
        ((Builder) (obj1)).a(MediaDescriptionCompatApi21.f(obj));
        ((Builder) (obj1)).a(MediaDescriptionCompatApi21.g(obj));
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            ((Builder) (obj1)).b(MediaDescriptionCompatApi23.h(obj));
        }
        obj1 = ((Builder) (obj1)).a();
        obj1.i = obj;
        return ((MediaDescriptionCompat) (obj1));
    }

    public Object a()
    {
        if (i != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return i;
        }
        Object obj = MediaDescriptionCompatApi21.Builder.a();
        MediaDescriptionCompatApi21.Builder.a(obj, a);
        MediaDescriptionCompatApi21.Builder.a(obj, b);
        MediaDescriptionCompatApi21.Builder.b(obj, c);
        MediaDescriptionCompatApi21.Builder.c(obj, d);
        MediaDescriptionCompatApi21.Builder.a(obj, e);
        MediaDescriptionCompatApi21.Builder.a(obj, f);
        MediaDescriptionCompatApi21.Builder.a(obj, g);
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            MediaDescriptionCompatApi23.Builder.b(obj, h);
        }
        i = MediaDescriptionCompatApi21.Builder.a(obj);
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(", ").append(c).append(", ").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
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
        } else
        {
            MediaDescriptionCompatApi21.a(a(), parcel, j);
            return;
        }
    }


    private class Builder
    {

        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public Builder a(Bitmap bitmap)
        {
            e = bitmap;
            return this;
        }

        public Builder a(Uri uri)
        {
            f = uri;
            return this;
        }

        public Builder a(Bundle bundle)
        {
            g = bundle;
            return this;
        }

        public Builder a(CharSequence charsequence)
        {
            b = charsequence;
            return this;
        }

        public Builder a(String s)
        {
            a = s;
            return this;
        }

        public MediaDescriptionCompat a()
        {
            return new MediaDescriptionCompat(a, b, c, d, e, f, g, h);
        }

        public Builder b(Uri uri)
        {
            h = uri;
            return this;
        }

        public Builder b(CharSequence charsequence)
        {
            c = charsequence;
            return this;
        }

        public Builder c(CharSequence charsequence)
        {
            d = charsequence;
            return this;
        }

        public Builder()
        {
        }
    }

}
