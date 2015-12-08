// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();

    ShareOpenGraphObject(Parcel parcel)
    {
        super(parcel);
    }

    private ShareOpenGraphObject(Builder builder)
    {
        super(builder);
    }

    ShareOpenGraphObject(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShareOpenGraphObject createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphObject(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShareOpenGraphObject[] newArray(int i)
        {
            return new ShareOpenGraphObject[i];
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
