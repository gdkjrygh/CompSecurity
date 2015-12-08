// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments:
//            AlertFragment_, AlertFragment

public class  extends d
{

    public AlertFragment build()
    {
        AlertFragment_ alertfragment_ = new AlertFragment_();
        alertfragment_.setArguments(args);
        return alertfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build cancelable(boolean flag)
    {
        args.putBoolean("cancelable", flag);
        return this;
    }

    public args message(String s)
    {
        args.putString("message", s);
        return this;
    }

    public args title(String s)
    {
        args.putString("title", s);
        return this;
    }

    public ()
    {
    }
}
