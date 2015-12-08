// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.widget.TextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvVerifiedFragment

public class t> extends t>
{

    public void clearViews()
    {
        super.rViews();
        ((MnvVerifiedFragment)getTarget()).textVerified = null;
    }

    public void injectViews()
    {
        super.ctViews();
        ((MnvVerifiedFragment)getTarget()).textVerified = (TextView)findViewById(0x7f10045e);
    }

    public (MnvVerifiedFragment mnvverifiedfragment)
    {
        super(mnvverifiedfragment);
    }
}
