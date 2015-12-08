// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();

    ShareOpenGraphAction(Parcel parcel)
    {
        super(parcel);
    }

    private ShareOpenGraphAction(Builder builder)
    {
        super(builder);
    }

    ShareOpenGraphAction(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final String getActionType()
    {
        return getString("og:type");
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShareOpenGraphAction createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphAction(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShareOpenGraphAction[] newArray(int i)
        {
            return new ShareOpenGraphAction[i];
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
