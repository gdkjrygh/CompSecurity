// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, i

public abstract class ShareOpenGraphValueContainer
    implements ShareModel
{

    private final Bundle a;

    ShareOpenGraphValueContainer(Parcel parcel)
    {
        a = parcel.readBundle(com/facebook/share/model/i.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(i j)
    {
        a = (Bundle)i.a(j).clone();
    }

    public final Bundle a()
    {
        return (Bundle)a.clone();
    }

    public final String a(String s)
    {
        return a.getString(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeBundle(a);
    }
}
