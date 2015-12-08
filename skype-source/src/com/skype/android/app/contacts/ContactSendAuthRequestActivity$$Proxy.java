// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.widget.Button;
import com.skype.android.widget.AccessibleEditText;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSendAuthRequestActivity

public class  extends com.skype.android.ivity..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((ContactSendAuthRequestActivity)getTarget()).editText = null;
        ((ContactSendAuthRequestActivity)getTarget()).cancelButton = null;
        ((ContactSendAuthRequestActivity)getTarget()).sendButton = null;
    }

    public void injectViews()
    {
        super.Proxy();
        ((ContactSendAuthRequestActivity)getTarget()).editText = (AccessibleEditText)findViewById(0x7f100322);
        ((ContactSendAuthRequestActivity)getTarget()).cancelButton = (Button)findViewById(0x7f100325);
        ((ContactSendAuthRequestActivity)getTarget()).sendButton = (Button)findViewById(0x7f100324);
    }

    public (ContactSendAuthRequestActivity contactsendauthrequestactivity)
    {
        super(contactsendauthrequestactivity);
    }
}
