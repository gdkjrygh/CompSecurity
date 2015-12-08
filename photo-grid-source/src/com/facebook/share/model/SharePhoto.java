// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class SharePhoto
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final Bitmap bitmap;
    private final Uri imageUrl;
    private final boolean userGenerated;

    SharePhoto(Parcel parcel)
    {
        bitmap = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        imageUrl = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        userGenerated = flag;
    }

    private SharePhoto(Builder builder)
    {
        bitmap = builder.bitmap;
        imageUrl = builder.imageUrl;
        userGenerated = builder.userGenerated;
    }

    SharePhoto(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Bitmap getBitmap()
    {
        return bitmap;
    }

    public final Uri getImageUrl()
    {
        return imageUrl;
    }

    public final boolean getUserGenerated()
    {
        return userGenerated;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        i = 0;
        parcel.writeParcelable(bitmap, 0);
        parcel.writeParcelable(imageUrl, 0);
        if (userGenerated)
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
    }


    private class Builder
        implements ShareModelBuilder
    {

        private Bitmap bitmap;
        private Uri imageUrl;
        private boolean userGenerated;

        public static List readListFrom(Parcel parcel)
        {
            ArrayList arraylist = new ArrayList();
            parcel.readTypedList(arraylist, SharePhoto.CREATOR);
            return arraylist;
        }

        public static void writeListTo(Parcel parcel, List list)
        {
            ArrayList arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext(); arraylist.add((SharePhoto)list.next())) { }
            parcel.writeTypedList(arraylist);
        }

        public final SharePhoto build()
        {
            return new SharePhoto(this, null);
        }

        public final volatile Object build()
        {
            return build();
        }

        final Bitmap getBitmap()
        {
            return bitmap;
        }

        final Uri getImageUrl()
        {
            return imageUrl;
        }

        public final volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((SharePhoto)sharemodel);
        }

        public final Builder readFrom(Parcel parcel)
        {
            return readFrom((SharePhoto)parcel.readParcelable(com/facebook/share/model/SharePhoto.getClassLoader()));
        }

        public final Builder readFrom(SharePhoto sharephoto)
        {
            if (sharephoto == null)
            {
                return this;
            } else
            {
                return setBitmap(sharephoto.getBitmap()).setImageUrl(sharephoto.getImageUrl()).setUserGenerated(sharephoto.getUserGenerated());
            }
        }

        public final Builder setBitmap(Bitmap bitmap1)
        {
            bitmap = bitmap1;
            return this;
        }

        public final Builder setImageUrl(Uri uri)
        {
            imageUrl = uri;
            return this;
        }

        public final Builder setUserGenerated(boolean flag)
        {
            userGenerated = flag;
            return this;
        }




        public Builder()
        {
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final SharePhoto createFromParcel(Parcel parcel)
        {
            return new SharePhoto(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SharePhoto[] newArray(int i)
        {
            return new SharePhoto[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
