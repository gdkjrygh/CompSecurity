// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import android.widget.TextView;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            StallNewUserActivity

public class  extends com.skype.android.rActivity..Proxy
{

    public void clearViews()
    {
        super.ews();
        ((StallNewUserActivity)getTarget()).progressMessagePrimary = null;
        ((StallNewUserActivity)getTarget()).progressMessageSecondary = null;
    }

    public void injectViews()
    {
        super.iews();
        ((StallNewUserActivity)getTarget()).progressMessagePrimary = (TextView)findViewById(0x7f1004d1);
        ((StallNewUserActivity)getTarget()).progressMessageSecondary = (TextView)findViewById(0x7f1004d6);
    }

    public (StallNewUserActivity stallnewuseractivity)
    {
        super(stallnewuseractivity);
    }
}
