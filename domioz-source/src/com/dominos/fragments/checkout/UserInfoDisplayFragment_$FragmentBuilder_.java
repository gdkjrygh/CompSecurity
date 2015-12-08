// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments.checkout:
//            UserInfoDisplayFragment_, UserInfoDisplayFragment

public class  extends d
{

    public UserInfoDisplayFragment build()
    {
        UserInfoDisplayFragment_ userinfodisplayfragment_ = new UserInfoDisplayFragment_();
        userinfodisplayfragment_.setArguments(args);
        return userinfodisplayfragment_;
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
