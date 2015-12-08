// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments:
//            OptionAlertFragment_, OptionAlertFragment

public class A extends d
{

    public OptionAlertFragment build()
    {
        OptionAlertFragment_ optionalertfragment_ = new OptionAlertFragment_();
        optionalertfragment_.setArguments(args);
        return optionalertfragment_;
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

    public args mNegativeButtonText(String s)
    {
        args.putString("mNegativeButtonText", s);
        return this;
    }

    public args mNeutralButtonText(String s)
    {
        args.putString("mNeutralButtonText", s);
        return this;
    }

    public args mPositiveButtonText(String s)
    {
        args.putString("mPositiveButtonText", s);
        return this;
    }

    public args mTitle(String s)
    {
        args.putString("mTitle", s);
        return this;
    }

    public A()
    {
    }
}
