// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.widget.Button;
import android.widget.TextView;
import com.skype.android.widget.AccessibleEditText;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingNumberActivity

public class  extends com.skype.android.vity..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((CallForwardingNumberActivity)getTarget()).editText = null;
        ((CallForwardingNumberActivity)getTarget()).countryCodeButton = null;
        ((CallForwardingNumberActivity)getTarget()).countryPrefixText = null;
    }

    public void injectViews()
    {
        super.Proxy();
        ((CallForwardingNumberActivity)getTarget()).editText = (AccessibleEditText)findViewById(0x7f10048a);
        ((CallForwardingNumberActivity)getTarget()).countryCodeButton = (Button)findViewById(0x7f100361);
        ((CallForwardingNumberActivity)getTarget()).countryPrefixText = (TextView)findViewById(0x7f100363);
    }

    public (CallForwardingNumberActivity callforwardingnumberactivity)
    {
        super(callforwardingnumberactivity);
    }
}
