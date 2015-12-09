// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments:
//            AlertDialogFragment_, AlertDialogFragment

public class A extends d
{

    public AlertDialogFragment build()
    {
        AlertDialogFragment_ alertdialogfragment_ = new AlertDialogFragment_();
        alertdialogfragment_.setArguments(args);
        return alertdialogfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mCancelable(boolean flag)
    {
        args.putBoolean("mCancelable", flag);
        return this;
    }

    public args mMessage(String s)
    {
        args.putString("mMessage", s);
        return this;
    }

    public args mMessageScrollable(boolean flag)
    {
        args.putBoolean("mMessageScrollable", flag);
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
