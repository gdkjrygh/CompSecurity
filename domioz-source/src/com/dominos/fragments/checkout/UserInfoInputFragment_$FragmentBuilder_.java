// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments.checkout:
//            UserInfoInputFragment_, UserInfoInputFragment

public class  extends d
{

    public UserInfoInputFragment build()
    {
        UserInfoInputFragment_ userinfoinputfragment_ = new UserInfoInputFragment_();
        userinfoinputfragment_.setArguments(args);
        return userinfoinputfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mData(Bundle bundle)
    {
        args.putBundle("mData", bundle);
        return this;
    }

    public ()
    {
    }
}
