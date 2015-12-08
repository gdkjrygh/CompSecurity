// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            i, ShareOpenGraphAction, ShareOpenGraphValueContainer

public final class f extends i
{

    public f()
    {
    }

    private f a(ShareOpenGraphAction shareopengraphaction)
    {
        if (shareopengraphaction == null)
        {
            return this;
        } else
        {
            f f1 = (f)super.a(shareopengraphaction);
            f1.a("og:type", shareopengraphaction.a("og:type"));
            return f1;
        }
    }

    public final f a(Parcel parcel)
    {
        return a((ShareOpenGraphAction)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphAction.getClassLoader()));
    }

    public final volatile i a(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
    {
        return a((ShareOpenGraphAction)shareopengraphvaluecontainer);
    }
}
