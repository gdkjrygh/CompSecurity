// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tinder.enums.UserPhotoSize;
import com.tinder.utils.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.model:
//            Photo, ProcessedPhoto

public class ProfilePhoto extends Photo
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final ProfilePhoto createFromParcel(Parcel parcel)
        {
            return new ProfilePhoto(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ProfilePhoto[] newArray(int i)
        {
            return new ProfilePhoto[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String facebookId;
    public int height;
    public String imageUrl;
    public boolean isMain;
    public int originX;
    public int originY;
    public List processedPhotos;
    public int width;
    public float xDistancePercent;
    public float xOffsetPercent;
    public float yDistancePercent;
    public float yOffsetPercent;

    protected ProfilePhoto(Parcel parcel)
    {
        processedPhotos = new ArrayList(4);
        imageUrl = parcel.readString();
        facebookId = parcel.readString();
        width = parcel.readInt();
        height = parcel.readInt();
        xDistancePercent = parcel.readFloat();
        yDistancePercent = parcel.readFloat();
        xOffsetPercent = parcel.readFloat();
        yOffsetPercent = parcel.readFloat();
        processedPhotos = parcel.createTypedArrayList(ProcessedPhoto.CREATOR);
        originX = parcel.readInt();
        originY = parcel.readInt();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isMain = flag;
    }

    public ProfilePhoto(String s)
    {
        processedPhotos = new ArrayList(4);
        photoId = s;
    }

    public ProfilePhoto(String s, String s1)
    {
        processedPhotos = new ArrayList(4);
        facebookId = s;
        imageUrl = s1;
    }

    public ProfilePhoto(String s, String s1, int i, int j, float f, float f1, float f2, 
            float f3, int k, int l, List list)
    {
        processedPhotos = new ArrayList(4);
        imageUrl = s;
        photoId = s1;
        width = i;
        height = j;
        xDistancePercent = f;
        yDistancePercent = f1;
        xOffsetPercent = f2;
        yOffsetPercent = f3;
        originX = k;
        originY = l;
        processedPhotos = list;
    }

    public ProfilePhoto(String s, String s1, List list)
    {
        processedPhotos = new ArrayList(4);
        imageUrl = s;
        photoId = s1;
        processedPhotos = list;
    }

    public ProfilePhoto(String s, ArrayList arraylist)
    {
        processedPhotos = new ArrayList(4);
        photoId = s;
        processedPhotos = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPhotoId()
    {
        return photoId;
    }

    public ProcessedPhoto getProcessedPhoto(UserPhotoSize userphotosize)
    {
label0:
        {
            if (processedPhotos == null)
            {
                break label0;
            }
            Iterator iterator = processedPhotos.iterator();
            ProcessedPhoto processedphoto;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                processedphoto = (ProcessedPhoto)iterator.next();
            } while (processedphoto.photoSize != userphotosize);
            return processedphoto;
        }
        v.b((new StringBuilder("Failed to find match for photo size: ")).append(userphotosize).toString());
        return null;
    }

    public String toString()
    {
        return (new StringBuilder("ProfilePhoto{facebookId='")).append(facebookId).append('\'').append(", imageUrl='").append(imageUrl).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(imageUrl);
        parcel.writeString(facebookId);
        parcel.writeInt(width);
        parcel.writeInt(height);
        parcel.writeFloat(xDistancePercent);
        parcel.writeFloat(yDistancePercent);
        parcel.writeFloat(xOffsetPercent);
        parcel.writeFloat(yOffsetPercent);
        parcel.writeTypedList(processedPhotos);
        parcel.writeInt(originX);
        parcel.writeInt(originY);
        if (isMain)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
