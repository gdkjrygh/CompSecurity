// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.o;
import com.facebook.ui.d.a;

// Referenced classes of package com.facebook.orca.threadview.upsell:
//            a

class g extends ac
{

    final com.facebook.orca.threadview.upsell.a a;

    g(com.facebook.orca.threadview.upsell.a a1)
    {
        a = a1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.orca.threadview.upsell.a.b(a, null);
    }

    protected void a(ServiceException serviceexception)
    {
        com.facebook.orca.threadview.upsell.a.b(a, null);
        com.facebook.ui.d.a.a(com.facebook.orca.threadview.upsell.a.a(a)).a(o.app_error_dialog_title).b(o.audio_message_error_name).a();
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
