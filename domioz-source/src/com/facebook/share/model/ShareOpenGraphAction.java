// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer, e, f

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer
{

    public static final android.os.Parcelable.Creator CREATOR = new e();

    ShareOpenGraphAction(Parcel parcel)
    {
        super(parcel);
    }

    private ShareOpenGraphAction(f f)
    {
        super(f);
    }

    ShareOpenGraphAction(f f, byte byte0)
    {
        this(f);
    }

}
