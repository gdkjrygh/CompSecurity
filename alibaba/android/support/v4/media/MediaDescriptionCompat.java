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
import bq;

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

        public a a(Bitmap bitmap)
        {
            e = bitmap;
            return this;
        }

        public a a(Uri uri)
        {
            f = uri;
            return this;
        }

        public a a(Bundle bundle)
        {
            g = bundle;
            return this;
        }

        public a a(CharSequence charsequence)
        {
            b = charsequence;
            return this;
        }

        public a a(String s)
        {
            a = s;
            return this;
        }

        public MediaDescriptionCompat a()
        {
            return new MediaDescriptionCompat(a, b, c, d, e, f, g);
        }

        public a b(CharSequence charsequence)
        {
            c = charsequence;
            return this;
        }

        public a c(CharSequence charsequence)
        {
            d = charsequence;
            return this;
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public MediaDescriptionCompat a(Parcel parcel)
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                return new MediaDescriptionCompat(parcel);
            } else
            {
                return MediaDescriptionCompat.a(bq.a(parcel));
            }
        }

        public MediaDescriptionCompat[] a(int i)
        {
            return new MediaDescriptionCompat[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
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


    public static MediaDescriptionCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        } else
        {
            Object obj1 = new a();
            ((a) (obj1)).a(bq.a(obj));
            ((a) (obj1)).a(bq.b(obj));
            ((a) (obj1)).b(bq.c(obj));
            ((a) (obj1)).c(bq.d(obj));
            ((a) (obj1)).a(bq.e(obj));
            ((a) (obj1)).a(bq.f(obj));
            ((a) (obj1)).a(bq.g(obj));
            obj1 = ((a) (obj1)).a();
            obj1.h = obj;
            return ((MediaDescriptionCompat) (obj1));
        }
    }

    public Object a()
    {
        if (h != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return h;
        } else
        {
            Object obj = bq.a.a();
            bq.a.a(obj, a);
            bq.a.a(obj, b);
            bq.a.b(obj, c);
            bq.a.c(obj, d);
            bq.a.a(obj, e);
            bq.a.a(obj, f);
            bq.a.a(obj, g);
            h = bq.a.a(obj);
            return h;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(", ").append(c).append(", ").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
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
        } else
        {
            bq.a(a(), parcel, i);
            return;
        }
    }

}
