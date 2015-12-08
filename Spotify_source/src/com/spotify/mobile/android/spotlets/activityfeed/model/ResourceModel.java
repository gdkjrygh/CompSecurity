// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class ResourceModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ResourceModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ResourceModel[i];
        }

    };
    private String mImage;
    private String mName;
    private ResourceModel mParent;
    private String mType;
    private String mUri;

    private ResourceModel(Parcel parcel)
    {
        mName = parcel.readString();
        mImage = parcel.readString();
        mUri = parcel.readString();
        mType = parcel.readString();
        mParent = (ResourceModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/activityfeed/model/ResourceModel.getClassLoader());
    }


    public ResourceModel(String s, String s1, String s2, String s3, ResourceModel resourcemodel)
    {
        mName = s;
        mImage = s1;
        mUri = s2;
        mType = s3;
        mParent = resourcemodel;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ResourceModel))
            {
                return false;
            }
            obj = (ResourceModel)obj;
            if (mImage == null ? ((ResourceModel) (obj)).mImage != null : !mImage.equals(((ResourceModel) (obj)).mImage))
            {
                return false;
            }
            if (mName == null ? ((ResourceModel) (obj)).mName != null : !mName.equals(((ResourceModel) (obj)).mName))
            {
                return false;
            }
            if (mParent == null ? ((ResourceModel) (obj)).mParent != null : !mParent.equals(((ResourceModel) (obj)).mParent))
            {
                return false;
            }
            if (mType == null ? ((ResourceModel) (obj)).mType != null : !mType.equals(((ResourceModel) (obj)).mType))
            {
                return false;
            }
            if (mUri == null ? ((ResourceModel) (obj)).mUri != null : !mUri.equals(((ResourceModel) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getImage()
    {
        return mImage;
    }

    public String getName()
    {
        return mName;
    }

    public ResourceModel getParent()
    {
        return mParent;
    }

    public String getSubName()
    {
        Object obj = getParent();
        if (mType == null) goto _L2; else goto _L1
_L1:
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[Types.values().length];
                try
                {
                    a[Types.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls2.a[Types.valueOf(mType).ordinal()];
        JVM INSTR tableswitch 1 1: default 80
    //                   1 56;
           goto _L3 _L4
_L3:
        if (obj != null)
        {
            try
            {
                return getParent().getName();
            }
            catch (IllegalArgumentException illegalargumentexception) { }
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_83;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = ((ResourceModel) (obj)).getParent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = ((ResourceModel) (obj)).getName();
        return ((String) (obj));
_L2:
        return "";
        return null;
    }

    public String getType()
    {
        return mType;
    }

    public String getUri()
    {
        return mUri;
    }

    public boolean hasMatchingContextUri(String s)
    {
        return s.equals(mUri);
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (mName != null)
        {
            i = mName.hashCode();
        } else
        {
            i = 0;
        }
        if (mImage != null)
        {
            j = mImage.hashCode();
        } else
        {
            j = 0;
        }
        if (mUri != null)
        {
            k = mUri.hashCode();
        } else
        {
            k = 0;
        }
        if (mType != null)
        {
            l = mType.hashCode();
        } else
        {
            l = 0;
        }
        if (mParent != null)
        {
            i1 = mParent.hashCode();
        }
        return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mName);
        parcel.writeString(mImage);
        parcel.writeString(mUri);
        parcel.writeString(mType);
        parcel.writeParcelable(mParent, 0);
    }


    private class Types extends Enum
    {

        public static final Types a;
        public static final Types b;
        public static final Types c;
        public static final Types d;
        private static final Types e[];

        public static Types valueOf(String s)
        {
            return (Types)Enum.valueOf(com/spotify/mobile/android/spotlets/activityfeed/model/ResourceModel$Types, s);
        }

        public static Types[] values()
        {
            return (Types[])e.clone();
        }

        static 
        {
            a = new Types("ALBUM", 0);
            b = new Types("ARTIST", 1);
            c = new Types("PLAYLIST", 2);
            d = new Types("TRACK", 3);
            e = (new Types[] {
                a, b, c, d
            });
        }

        private Types(String s, int i)
        {
            super(s, i);
        }
    }

}
