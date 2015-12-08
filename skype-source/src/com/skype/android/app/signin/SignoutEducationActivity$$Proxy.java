// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.signin:
//            SignoutEducationActivity

public class  extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((SignoutEducationActivity)getTarget()).beforeYouGoDesc = null;
        ((SignoutEducationActivity)getTarget()).manageNotifications = null;
        ((SignoutEducationActivity)getTarget()).cancelButton = null;
        ((SignoutEducationActivity)getTarget()).signOutButton = null;
        ((SignoutEducationActivity)getTarget()).beforeYouGoLabel = null;
    }

    public void injectViews()
    {
        super.();
        ((SignoutEducationActivity)getTarget()).beforeYouGoDesc = (TextView)findViewById(0x7f100525);
        ((SignoutEducationActivity)getTarget()).manageNotifications = (TextView)findViewById(0x7f100526);
        ((SignoutEducationActivity)getTarget()).cancelButton = (Button)findViewById(0x7f100522);
        ((SignoutEducationActivity)getTarget()).signOutButton = (Button)findViewById(0x7f100523);
        ((SignoutEducationActivity)getTarget()).beforeYouGoLabel = (TextView)findViewById(0x7f100524);
    }

    public (SignoutEducationActivity signouteducationactivity)
    {
        super(signouteducationactivity);
    }
}
