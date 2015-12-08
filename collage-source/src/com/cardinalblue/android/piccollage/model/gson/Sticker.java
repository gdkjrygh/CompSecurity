// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.f;
import com.google.b.h;
import java.lang.reflect.Type;
import java.util.List;

public class Sticker
    implements Parcelable, h
{

    private static final int BUNDLE_ID_OFFSET = 2;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Sticker createFromParcel(Parcel parcel)
        {
            return new Sticker(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Sticker[] newArray(int i)
        {
            return new Sticker[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final int NONE = 1;
    public static final int RECENT = 2;
    private static final String RECENT_STICKER_BUNDLE_ID = "recently-used";
    private static final int STICKER_NAME_OFFSET = 1;
    private String mBundleId;
    private String mImgSubpath;
    private String mName;
    private int mTag;
    private String mThumbnailSubpath;

    private Sticker()
    {
        mImgSubpath = null;
        mThumbnailSubpath = null;
        mTag = 1;
    }

    public Sticker(Parcel parcel)
    {
        mImgSubpath = null;
        mThumbnailSubpath = null;
        mTag = 1;
        mImgSubpath = parcel.readString();
        mThumbnailSubpath = parcel.readString();
        mTag = parcel.readInt();
        init();
    }

    private Sticker(String s, String s1)
    {
        mImgSubpath = null;
        mThumbnailSubpath = null;
        mTag = 1;
        mImgSubpath = s;
        mThumbnailSubpath = s1;
        init();
    }

    private void init()
    {
        List list = Uri.parse(mImgSubpath).getPathSegments();
        if (list.size() < 2)
        {
            f.a(new IllegalArgumentException((new StringBuilder()).append("Sticker source url is invalid, url: ").append(mImgSubpath).toString()));
        }
        mBundleId = (String)list.get(list.size() - 2);
        mName = (String)list.get(list.size() - 1);
    }

    public static Sticker newInstance(String s)
    {
        String s1;
        String s2;
        if (s.startsWith("/"))
        {
            s1 = (new StringBuilder()).append("file://").append(s).toString();
        } else
        {
            s1 = s;
        }
        s2 = s;
        if (s.startsWith("/"))
        {
            s2 = (new StringBuilder()).append("file://").append(s).toString();
        }
        return newInstance(s1, s2);
    }

    public static Sticker newInstance(String s, String s1)
    {
        return new Sticker(s, s1);
    }

    public Sticker clone()
    {
        return newInstance(mImgSubpath, mThumbnailSubpath);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Sticker createInstance(Type type)
    {
        return new Sticker();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Sticker))
        {
            return false;
        } else
        {
            obj = (Sticker)obj;
            return mImgSubpath.equals(((Sticker) (obj)).mImgSubpath);
        }
    }

    public String getBundleId()
    {
        if (2 == mTag)
        {
            return "recently-used";
        } else
        {
            return mBundleId;
        }
    }

    public String getImgSubpath()
    {
        return mImgSubpath;
    }

    public String getName()
    {
        return mName;
    }

    public int getTag()
    {
        return mTag;
    }

    public String getThumbnailSubpath()
    {
        return mThumbnailSubpath;
    }

    public void setTag(int i)
    {
        mTag = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mImgSubpath);
        parcel.writeString(mThumbnailSubpath);
        parcel.writeInt(mTag);
    }

}
