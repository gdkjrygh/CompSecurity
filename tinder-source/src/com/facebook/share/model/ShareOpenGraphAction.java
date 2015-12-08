// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer
{
    public static final class a extends ShareOpenGraphValueContainer.a
    {

        private a a(ShareOpenGraphAction shareopengraphaction)
        {
            if (shareopengraphaction == null)
            {
                return this;
            } else
            {
                a a1 = (a)super.a(shareopengraphaction);
                shareopengraphaction = ((ShareOpenGraphValueContainer) (shareopengraphaction)).a.getString("og:type");
                ((ShareOpenGraphValueContainer.a) (a1)).a.putString("og:type", shareopengraphaction);
                return a1;
            }
        }

        public final a a(Parcel parcel)
        {
            return a((ShareOpenGraphAction)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphAction.getClassLoader()));
        }

        public final volatile ShareOpenGraphValueContainer.a a(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
        {
            return a((ShareOpenGraphAction)shareopengraphvaluecontainer);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphAction(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShareOpenGraphAction[i];
        }

    };

    ShareOpenGraphAction(Parcel parcel)
    {
        super(parcel);
    }

    private ShareOpenGraphAction(a a1)
    {
        super(a1);
    }

    ShareOpenGraphAction(a a1, byte byte0)
    {
        this(a1);
    }

}
