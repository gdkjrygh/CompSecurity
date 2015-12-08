// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment_, LoginDialogFragment

public class  extends d
{

    public LoginDialogFragment build()
    {
        LoginDialogFragment_ logindialogfragment_ = new LoginDialogFragment_();
        logindialogfragment_.setArguments(args);
        return logindialogfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mFirstName(String s)
    {
        args.putString("mFirstName", s);
        return this;
    }

    public args mMessage(String s)
    {
        args.putString("mMessage", s);
        return this;
    }

    public args mShowCancel(boolean flag)
    {
        args.putBoolean("mShowCancel", flag);
        return this;
    }

    public args mShowGuest(boolean flag)
    {
        args.putBoolean("mShowGuest", flag);
        return this;
    }

    public ()
    {
    }
}
