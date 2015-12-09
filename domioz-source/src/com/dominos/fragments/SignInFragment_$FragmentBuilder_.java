// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments:
//            SignInFragment_, SignInFragment

public class  extends d
{

    public SignInFragment build()
    {
        SignInFragment_ signinfragment_ = new SignInFragment_();
        signinfragment_.setArguments(args);
        return signinfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mMessage(String s)
    {
        args.putString("mMessage", s);
        return this;
    }

    public ()
    {
    }
}
