// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.o;
import com.facebook.orca.server.SendBroadcastResult;
import java.util.List;

// Referenced classes of package com.facebook.orca.broadcast:
//            BroadcastActivity

class a extends h
{

    final BroadcastActivity a;

    a(BroadcastActivity broadcastactivity)
    {
        a = broadcastactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        Object obj = (SendBroadcastResult)operationresult.i();
        if (obj == null || ((SendBroadcastResult) (obj)).a() == null)
        {
            BroadcastActivity.a(a, "broadcast_success_null_result", "unknown", -1);
            BroadcastActivity.a(a);
            return;
        }
        operationresult = ((SendBroadcastResult) (obj)).c();
        int i = ((SendBroadcastResult) (obj)).d();
        obj = BroadcastActivity.a(a, ((SendBroadcastResult) (obj)));
        if (((List) (obj)).isEmpty())
        {
            BroadcastActivity.a(a, "broadcast_success", operationresult, i);
            BroadcastActivity.a(a);
            return;
        } else
        {
            BroadcastActivity.a(a, "broadcast_success_partial", operationresult, i);
            BroadcastActivity.a(a, ((List) (obj)));
            com.facebook.ui.d.a.a(a).a(o.app_error_dialog_title).b(o.broadcast_failed_for_some_recipients).a();
            return;
        }
    }

    public void a(ServiceException serviceexception)
    {
        Object obj;
        b.e(BroadcastActivity.j(), "Error broadcasting: %s", serviceexception);
        obj = serviceexception.b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        obj = ((OperationResult) (obj)).i();
        if (!(obj instanceof SendBroadcastResult)) goto _L2; else goto _L1
_L1:
        obj = (SendBroadcastResult)obj;
_L3:
        int i;
        if (obj != null)
        {
            String s = ((SendBroadcastResult) (obj)).c();
            i = ((SendBroadcastResult) (obj)).d();
            obj = s;
        } else
        {
            i = -1;
            obj = "unknown";
        }
        BroadcastActivity.a(a, "broadcast_failure", ((String) (obj)), i);
        com.facebook.orca.broadcast.BroadcastActivity.b(a).a("Broadcast", "ServiceException while sending a broadcast", serviceexception);
        com.facebook.ui.d.a.a(a).a(o.app_error_dialog_title).b(o.send_failed_error).a(serviceexception).a();
        return;
_L2:
        b.e(BroadcastActivity.j(), "wrong type: %s:%s", new Object[] {
            obj.getClass().getCanonicalName(), obj.toString()
        });
        obj = null;
          goto _L3
    }
}
