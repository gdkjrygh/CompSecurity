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
    public static final class Builder
    {

        CharSequence mDescription;
        Bundle mExtras;
        Bitmap mIcon;
        Uri mIconUri;
        String mMediaId;
        CharSequence mSubtitle;
        CharSequence mTitle;

        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                return new MediaDescriptionCompat(parcel, (byte)0);
            } else
            {
                return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
            }
        }

        public final volatile Object[] newArray(int i)
        {
            return new MediaDescriptionCompat[i];
        }

    };
    private final CharSequence mDescription;
    private Object mDescriptionObj;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    private MediaDescriptionCompat(Parcel parcel)
    {
        mMediaId = parcel.readString();
        mTitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mSubtitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mDescription = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mIcon = (Bitmap)parcel.readParcelable(null);
        mIconUri = (Uri)parcel.readParcelable(null);
        mExtras = parcel.readBundle();
    }

    MediaDescriptionCompat(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle)
    {
        mMediaId = s;
        mTitle = charsequence;
        mSubtitle = charsequence1;
        mDescription = charsequence2;
        mIcon = bitmap;
        mIconUri = uri;
        mExtras = bundle;
    }

    private MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
            byte byte0)
    {
        this(s, charsequence, charsequence1, charsequence2, bitmap, uri, bundle);
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        } else
        {
            Object obj1 = new Builder();
            obj1.mMediaId = ((MediaDescription)obj).getMediaId();
            obj1.mTitle = ((MediaDescription)obj).getTitle();
            obj1.mSubtitle = ((MediaDescription)obj).getSubtitle();
            obj1.mDescription = ((MediaDescription)obj).getDescription();
            obj1.mIcon = ((MediaDescription)obj).getIconBitmap();
            obj1.mIconUri = ((MediaDescription)obj).getIconUri();
            obj1.mExtras = ((MediaDescription)obj).getExtras();
            obj1 = new MediaDescriptionCompat(((Builder) (obj1)).mMediaId, ((Builder) (obj1)).mTitle, ((Builder) (obj1)).mSubtitle, ((Builder) (obj1)).mDescription, ((Builder) (obj1)).mIcon, ((Builder) (obj1)).mIconUri, ((Builder) (obj1)).mExtras, (byte)0);
            obj1.mDescriptionObj = obj;
            return ((MediaDescriptionCompat) (obj1));
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(mTitle).append(", ").append(mSubtitle).append(", ").append(mDescription).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            parcel.writeString(mMediaId);
            TextUtils.writeToParcel(mTitle, parcel, i);
            TextUtils.writeToParcel(mSubtitle, parcel, i);
            TextUtils.writeToParcel(mDescription, parcel, i);
            parcel.writeParcelable(mIcon, i);
            parcel.writeParcelable(mIconUri, i);
            parcel.writeBundle(mExtras);
            return;
        }
        Object obj;
        if (mDescriptionObj != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            obj = mDescriptionObj;
        } else
        {
            obj = new android.media.MediaDescription.Builder();
            Object obj1 = mMediaId;
            ((android.media.MediaDescription.Builder)obj).setMediaId(((String) (obj1)));
            obj1 = mTitle;
            ((android.media.MediaDescription.Builder)obj).setTitle(((CharSequence) (obj1)));
            obj1 = mSubtitle;
            ((android.media.MediaDescription.Builder)obj).setSubtitle(((CharSequence) (obj1)));
            obj1 = mDescription;
            ((android.media.MediaDescription.Builder)obj).setDescription(((CharSequence) (obj1)));
            obj1 = mIcon;
            ((android.media.MediaDescription.Builder)obj).setIconBitmap(((Bitmap) (obj1)));
            obj1 = mIconUri;
            ((android.media.MediaDescription.Builder)obj).setIconUri(((Uri) (obj1)));
            obj1 = mExtras;
            ((android.media.MediaDescription.Builder)obj).setExtras(((Bundle) (obj1)));
            mDescriptionObj = ((android.media.MediaDescription.Builder)obj).build();
            obj = mDescriptionObj;
        }
        ((MediaDescription)obj).writeToParcel(parcel, i);
    }

}
