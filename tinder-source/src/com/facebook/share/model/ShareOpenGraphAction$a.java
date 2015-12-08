// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphAction, ShareOpenGraphValueContainer

public static final class ainer.a extends ainer.a
{

    private ainer.a a(ShareOpenGraphAction shareopengraphaction)
    {
        if (shareopengraphaction == null)
        {
            return this;
        } else
        {
            ainer ainer = (ainer)super.a(shareopengraphaction);
            shareopengraphaction = ((ShareOpenGraphValueContainer) (shareopengraphaction)).a.getString("og:type");
            ((ainer.a) (ainer)).a.putString("og:type", shareopengraphaction);
            return ainer;
        }
    }

    public final ainer.a.a a(Parcel parcel)
    {
        return a((ShareOpenGraphAction)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphAction.getClassLoader()));
    }

    public final volatile ainer.a a(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
    {
        return a((ShareOpenGraphAction)shareopengraphvaluecontainer);
    }

    public ainer.a()
    {
    }
}
