// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvLearnMoreFragment

public class  extends com.skype.android...Proxy
{

    public void clearViews()
    {
        super.ews();
        ((MnvLearnMoreFragment)getTarget()).privacyPolicy = null;
        ((MnvLearnMoreFragment)getTarget()).addressBook = null;
        ((MnvLearnMoreFragment)getTarget()).leftArrow = null;
    }

    public void injectViews()
    {
        super.iews();
        ((MnvLearnMoreFragment)getTarget()).privacyPolicy = (TextView)findViewById(0x7f100459);
        ((MnvLearnMoreFragment)getTarget()).addressBook = (TextView)findViewById(0x7f100454);
        ((MnvLearnMoreFragment)getTarget()).leftArrow = (ImageView)findViewById(0x7f100450);
    }

    public (MnvLearnMoreFragment mnvlearnmorefragment)
    {
        super(mnvlearnmorefragment);
    }
}
