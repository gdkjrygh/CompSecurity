// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvErrorFragment

public class init> extends init>
{

    public void clearViews()
    {
        super.learViews();
        ((MnvErrorFragment)getTarget()).actionButton = null;
        ((MnvErrorFragment)getTarget()).errorDescription = null;
        ((MnvErrorFragment)getTarget()).skipButton = null;
    }

    public void injectViews()
    {
        super.njectViews();
        ((MnvErrorFragment)getTarget()).actionButton = (Button)findViewById(0x7f10044e);
        ((MnvErrorFragment)getTarget()).errorDescription = (TextView)findViewById(0x7f10044d);
        ((MnvErrorFragment)getTarget()).skipButton = (Button)findViewById(0x7f100449);
    }

    public (MnvErrorFragment mnverrorfragment)
    {
        super(mnverrorfragment);
    }
}
