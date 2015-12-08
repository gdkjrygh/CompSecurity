// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShareOpenGraphAction createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphAction(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ShareOpenGraphAction[] newArray(int i)
        {
            return new ShareOpenGraphAction[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };

    ShareOpenGraphAction(Parcel parcel)
    {
        super(parcel);
    }

    private ShareOpenGraphAction(Builder builder)
    {
        super(builder);
    }


    public String getActionType()
    {
        return getString("og:type");
    }

}
