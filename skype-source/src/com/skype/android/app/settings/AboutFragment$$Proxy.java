// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.widget.TextView;

// Referenced classes of package com.skype.android.app.settings:
//            AboutFragment

public class _cls9 extends com.skype.android.gment..Proxy
{

    public void clearViews()
    {
        super.clearViews();
        ((AboutFragment)getTarget()).thirdParty = null;
        ((AboutFragment)getTarget()).termsOfUse = null;
        ((AboutFragment)getTarget()).version = null;
        ((AboutFragment)getTarget()).privacyPolicy = null;
    }

    public void injectViews()
    {
        super.injectViews();
        ((AboutFragment)getTarget()).thirdParty = (TextView)findViewById(0x7f1001f9);
        ((AboutFragment)getTarget()).termsOfUse = (TextView)findViewById(0x7f1001f7);
        ((AboutFragment)getTarget()).version = (TextView)findViewById(0x7f1001f2);
        ((AboutFragment)getTarget()).privacyPolicy = (TextView)findViewById(0x7f1001f8);
    }

    public _cls9(AboutFragment aboutfragment)
    {
        super(aboutfragment);
    }
}
