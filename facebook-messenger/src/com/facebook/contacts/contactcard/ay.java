// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.common.time.a;
import com.facebook.contacts.server.FetchVoipInfoResult;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ax

class ay extends ac
{

    final ax a;

    ay(ax ax1)
    {
        a = ax1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.contacts.contactcard.ax.a(a, (FetchVoipInfoResult)operationresult.i());
        com.facebook.contacts.contactcard.ax.a(a, null);
        com.facebook.contacts.contactcard.ax.a(a, true);
        com.facebook.contacts.contactcard.ax.a(a, com.facebook.contacts.contactcard.ax.a(a).a());
        com.facebook.contacts.contactcard.ax.b(a);
    }

    protected void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(ax.g(), "Fetching voip_info failed", serviceexception);
        com.facebook.contacts.contactcard.ax.a(a, null);
        com.facebook.contacts.contactcard.ax.a(a, null);
        com.facebook.contacts.contactcard.ax.a(a, true);
        com.facebook.contacts.contactcard.ax.b(a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
