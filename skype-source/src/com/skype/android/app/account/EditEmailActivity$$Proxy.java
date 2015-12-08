// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.account:
//            EditEmailActivity

public class  extends com.skype.android.vity..Proxy
{

    public void clearViews()
    {
        super.rViews();
        ((EditEmailActivity)getTarget()).addNewButton = null;
        ((EditEmailActivity)getTarget()).emailEditTextsContainer = null;
    }

    public void injectViews()
    {
        super.ctViews();
        ((EditEmailActivity)getTarget()).addNewButton = (TextView)findViewById(0x7f100366);
        ((EditEmailActivity)getTarget()).emailEditTextsContainer = (ViewGroup)findViewById(0x7f100365);
    }

    public (EditEmailActivity editemailactivity)
    {
        super(editemailactivity);
    }
}
