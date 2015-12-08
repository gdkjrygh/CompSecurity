// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.SkyLib;
import com.skype.android.util.ContactUtil;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.dialer:
//            DialpadActivity

final class val.number
    implements Callable
{

    final DialpadActivity this$0;
    final String val$number;

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final String call()
        throws Exception
    {
        ContactImpl contactimpl = new ContactImpl();
        if (lib.findContactByPstnNumber(val$number, contactimpl).m_return && contactimpl.isMemberOfHardwiredGroup(com.skype.ALL_BUDDIES))
        {
            return contactUtil.l(contactimpl);
        } else
        {
            return "";
        }
    }

    ()
    {
        this$0 = final_dialpadactivity;
        val$number = String.this;
        super();
    }
}
