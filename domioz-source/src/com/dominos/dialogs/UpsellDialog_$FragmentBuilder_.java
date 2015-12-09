// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.dialogs:
//            UpsellDialog_, UpsellDialog

public class  extends d
{

    public UpsellDialog build()
    {
        UpsellDialog_ upselldialog_ = new UpsellDialog_();
        upselldialog_.setArguments(args);
        return upselldialog_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mUpsellCode(String s)
    {
        args.putString("mUpsellCode", s);
        return this;
    }

    public ()
    {
    }
}
