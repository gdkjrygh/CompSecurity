// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.dialogs:
//            GeneralAlertDialog_, GeneralAlertDialog

public class  extends d
{

    public GeneralAlertDialog build()
    {
        GeneralAlertDialog_ generalalertdialog_ = new GeneralAlertDialog_();
        generalalertdialog_.setArguments(args);
        return generalalertdialog_;
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

    public ()
    {
    }
}
