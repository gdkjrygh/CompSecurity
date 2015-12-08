// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.ListView;

// Referenced classes of package com.skype.android.app.signin:
//            SelectSkypeNameActivity

public class A extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.();
        ((SelectSkypeNameActivity)getTarget()).nameList = null;
    }

    public void injectViews()
    {
        super.s();
        ((SelectSkypeNameActivity)getTarget()).nameList = (ListView)findViewById(0x7f100509);
    }

    public A(SelectSkypeNameActivity selectskypenameactivity)
    {
        super(selectskypenameactivity);
    }
}
