// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareVideo

public final class n
{

    private Uri a;

    public n()
    {
    }

    static Uri a(n n1)
    {
        return n1.a;
    }

    public final n a(Parcel parcel)
    {
        parcel = (ShareVideo)parcel.readParcelable(com/facebook/share/model/ShareVideo.getClassLoader());
        if (parcel == null)
        {
            return this;
        } else
        {
            a = parcel.a();
            return this;
        }
    }
}
