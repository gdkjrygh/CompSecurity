// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public abstract class ShareOpenGraphValueContainer
    implements ShareModel
{
    public static abstract class a
    {

        Bundle a;

        static Bundle a(a a1)
        {
            return a1.a;
        }

        public a a(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
        {
            if (shareopengraphvaluecontainer != null)
            {
                a.putAll((Bundle)shareopengraphvaluecontainer.a.clone());
            }
            return this;
        }

        public a()
        {
            a = new Bundle();
        }
    }


    public final Bundle a;

    ShareOpenGraphValueContainer(Parcel parcel)
    {
        a = parcel.readBundle(com/facebook/share/model/ShareOpenGraphValueContainer$a.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(a a1)
    {
        a = (Bundle)a.a(a1).clone();
    }

    public final Object a(String s)
    {
        return a.get(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(a);
    }
}
