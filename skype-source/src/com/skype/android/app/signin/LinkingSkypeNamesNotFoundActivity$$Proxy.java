// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.TextView;
import com.skype.android.widget.YesNoButtons;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingSkypeNamesNotFoundActivity

public class  extends 
{

    public void clearViews()
    {
        super.();
        ((LinkingSkypeNamesNotFoundActivity)getTarget()).yesNoButtons = null;
        ((LinkingSkypeNamesNotFoundActivity)getTarget()).circleText = null;
    }

    public void injectViews()
    {
        super.s();
        ((LinkingSkypeNamesNotFoundActivity)getTarget()).yesNoButtons = (YesNoButtons)findViewById(0x7f1003f0);
        ((LinkingSkypeNamesNotFoundActivity)getTarget()).circleText = (TextView)findViewById(0x7f1003f3);
    }

    public (LinkingSkypeNamesNotFoundActivity linkingskypenamesnotfoundactivity)
    {
        super(linkingskypenamesnotfoundactivity);
    }
}
