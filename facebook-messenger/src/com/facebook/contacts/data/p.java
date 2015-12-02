// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.os.Bundle;
import com.facebook.contacts.server.FetchChatContextParams;
import com.facebook.contacts.server.d;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.google.common.d.a.i;
import javax.inject.a;

// Referenced classes of package com.facebook.contacts.data:
//            r, q

public class p
{

    private static final Class a = com/facebook/contacts/data/p;
    private final a b;
    private final k c;
    private com.google.common.d.a.s d;
    private r e;

    public p(a a1, k k1)
    {
        b = a1;
        c = k1;
    }

    static com.google.common.d.a.s a(p p1, com.google.common.d.a.s s1)
    {
        p1.d = s1;
        return s1;
    }

    static void a(p p1, OperationResult operationresult)
    {
        p1.a(operationresult);
    }

    static void a(p p1, ServiceException serviceexception)
    {
        p1.a(serviceexception);
    }

    private void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.b(a, "onSyncChatContextSucceeded");
        if (e != null)
        {
            e.a();
        }
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(a, "SYNC_CHAT_CONTEXT error", serviceexception);
        if (e != null)
        {
            e.b();
        }
    }

    public void a()
    {
        while (d != null || !((Boolean)b.b()).booleanValue()) 
        {
            return;
        }
        com.facebook.debug.log.b.b(a, "start SYNC_CHAT_CONTEXT");
        Bundle bundle = new Bundle();
        bundle.putParcelable("fetchChatContextParams", new FetchChatContextParams(s.CHECK_SERVER_FOR_NEW_DATA));
        d = c.a(d.p, bundle).a();
        i.a(d, new q(this));
    }

    public void a(r r1)
    {
        e = r1;
    }

}
