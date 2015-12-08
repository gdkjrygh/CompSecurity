// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.skype.android.widget.AccessibleEditText;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAddNumberActivity

public class  extends com.skype.android.ivity..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((ContactAddNumberActivity)getTarget()).selectCountryButton = null;
        ((ContactAddNumberActivity)getTarget()).modeSelector = null;
        ((ContactAddNumberActivity)getTarget()).countryPrefix = null;
        ((ContactAddNumberActivity)getTarget()).phone = null;
        ((ContactAddNumberActivity)getTarget()).name = null;
    }

    public void injectViews()
    {
        super.();
        ((ContactAddNumberActivity)getTarget()).selectCountryButton = (Button)findViewById(0x7f100361);
        ((ContactAddNumberActivity)getTarget()).modeSelector = (Spinner)findViewById(0x7f1002ed);
        ((ContactAddNumberActivity)getTarget()).countryPrefix = (TextView)findViewById(0x7f100363);
        ((ContactAddNumberActivity)getTarget()).phone = (AccessibleEditText)findViewById(0x7f10048a);
        ((ContactAddNumberActivity)getTarget()).name = (EditText)findViewById(0x7f1002ec);
    }

    public (ContactAddNumberActivity contactaddnumberactivity)
    {
        super(contactaddnumberactivity);
    }
}
