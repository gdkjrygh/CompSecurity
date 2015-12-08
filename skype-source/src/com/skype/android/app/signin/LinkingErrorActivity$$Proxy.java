// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingErrorActivity

public class  extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.ews();
        ((LinkingErrorActivity)getTarget()).errorMessage = null;
        ((LinkingErrorActivity)getTarget()).secondBtn = null;
        ((LinkingErrorActivity)getTarget()).actionContainer = null;
        ((LinkingErrorActivity)getTarget()).errorHint = null;
        ((LinkingErrorActivity)getTarget()).firstBtn = null;
        ((LinkingErrorActivity)getTarget()).secondBtnContainer = null;
        ((LinkingErrorActivity)getTarget()).actionLink = null;
        ((LinkingErrorActivity)getTarget()).messageContainer = null;
        ((LinkingErrorActivity)getTarget()).hintContainer = null;
        ((LinkingErrorActivity)getTarget()).firstBtnContainer = null;
    }

    public void injectViews()
    {
        super.iews();
        ((LinkingErrorActivity)getTarget()).errorMessage = (TextView)findViewById(0x7f1003d0);
        ((LinkingErrorActivity)getTarget()).secondBtn = (Button)findViewById(0x7f1003d7);
        ((LinkingErrorActivity)getTarget()).actionContainer = (ViewGroup)findViewById(0x7f1003d8);
        ((LinkingErrorActivity)getTarget()).errorHint = (TextView)findViewById(0x7f1003d2);
        ((LinkingErrorActivity)getTarget()).firstBtn = (Button)findViewById(0x7f1003d5);
        ((LinkingErrorActivity)getTarget()).secondBtnContainer = (ViewGroup)findViewById(0x7f1003d6);
        ((LinkingErrorActivity)getTarget()).actionLink = (Button)findViewById(0x7f1003d9);
        ((LinkingErrorActivity)getTarget()).messageContainer = (ViewGroup)findViewById(0x7f1003cf);
        ((LinkingErrorActivity)getTarget()).hintContainer = (ViewGroup)findViewById(0x7f1003d1);
        ((LinkingErrorActivity)getTarget()).firstBtnContainer = (ViewGroup)findViewById(0x7f1003d3);
    }

    public (LinkingErrorActivity linkingerroractivity)
    {
        super(linkingerroractivity);
    }
}
