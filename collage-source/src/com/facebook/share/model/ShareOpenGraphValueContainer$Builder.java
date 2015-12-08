// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, ShareOpenGraphValueContainer, ShareOpenGraphObject, SharePhoto, 
//            ShareModel

public static abstract class bundle
    implements ShareModelBuilder
{

    private Bundle bundle;

    public bundle putBoolean(String s, boolean flag)
    {
        bundle.putBoolean(s, flag);
        return this;
    }

    public bundle putBooleanArray(String s, boolean aflag[])
    {
        bundle.putBooleanArray(s, aflag);
        return this;
    }

    public bundle putDouble(String s, double d)
    {
        bundle.putDouble(s, d);
        return this;
    }

    public bundle putDoubleArray(String s, double ad[])
    {
        bundle.putDoubleArray(s, ad);
        return this;
    }

    public bundle putInt(String s, int i)
    {
        bundle.putInt(s, i);
        return this;
    }

    public bundle putIntArray(String s, int ai[])
    {
        bundle.putIntArray(s, ai);
        return this;
    }

    public bundle putLong(String s, long l)
    {
        bundle.putLong(s, l);
        return this;
    }

    public bundle putLongArray(String s, long al[])
    {
        bundle.putLongArray(s, al);
        return this;
    }

    public bundle putObject(String s, ShareOpenGraphObject shareopengraphobject)
    {
        bundle.putParcelable(s, shareopengraphobject);
        return this;
    }

    public bundle putObjectArrayList(String s, ArrayList arraylist)
    {
        bundle.putParcelableArrayList(s, arraylist);
        return this;
    }

    public bundle putPhoto(String s, SharePhoto sharephoto)
    {
        bundle.putParcelable(s, sharephoto);
        return this;
    }

    public bundle putPhotoArrayList(String s, ArrayList arraylist)
    {
        bundle.putParcelableArrayList(s, arraylist);
        return this;
    }

    public bundle putString(String s, String s1)
    {
        bundle.putString(s, s1);
        return this;
    }

    public bundle putStringArrayList(String s, ArrayList arraylist)
    {
        bundle.putStringArrayList(s, arraylist);
        return this;
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareOpenGraphValueContainer)sharemodel);
    }

    public readFrom readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
    {
        if (shareopengraphvaluecontainer != null)
        {
            bundle.putAll(shareopengraphvaluecontainer.getBundle());
        }
        return this;
    }


    public ()
    {
        bundle = new Bundle();
    }
}
