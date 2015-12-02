// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.o;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.orca.app.g;
import com.facebook.orca.f.z;
import com.facebook.orca.protocol.a;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.aq;
import com.facebook.orca.sms.bj;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.m;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.o:
//            a

public class b
    implements e
{

    private static final Class a = com/facebook/orca/o/b;
    private final z b;
    private final com.facebook.orca.f.ad c;
    private final g d;
    private final com.facebook.orca.g.t e;
    private final bj f;
    private final a g;
    private final javax.inject.a h;

    public b(z z1, com.facebook.orca.f.ad ad1, g g1, com.facebook.orca.g.t t1, bj bj1, a a1, javax.inject.a a2)
    {
        b = z1;
        c = ad1;
        d = g1;
        e = t1;
        f = bj1;
        g = a1;
        h = a2;
    }

    private void a(t t1, Message message)
    {
        if (t1 == t.PHOTO_UPLOAD_FAILED)
        {
            t1 = SendError.f;
            t1 = (new com.facebook.messages.model.threads.e()).a(message).a(t1).a(901).B();
            e.a(t1);
        }
    }

    private boolean a(t t1)
    {
        return t1 == t.PHOTO_UPLOAD_NOT_COMPLETE || t1 == t.PHOTO_UPLOAD_FAILED;
    }

    public OperationResult a(ad ad1)
    {
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("SendServiceHandler");
        OperationType operationtype;
        operationtype = ad1.a();
        if (!aq.w.equals(operationtype))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        ad1 = b(ad1);
        e1.a(10L);
        return ad1;
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        ad1;
        e1.a(10L);
        throw ad1;
    }

    protected OperationResult b(ad ad1)
    {
        String s;
        Message message;
        e.a();
        Bundle bundle = ad1.b();
        s = bundle.getString("threadId");
        Object obj = b.a(s);
        message = e.a(s);
        if (message == null)
        {
            return OperationResult.b();
        }
        if (obj != null)
        {
            obj = ((UserKey) (obj)).c();
        } else
        {
            obj = null;
        }
        bundle.putString("userKeyInCanonicalThread", ((String) (obj)));
        bundle.putParcelable("outgoingMessage", message);
        if (!m.g(s))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        ad1 = f.a(ad1);
_L1:
        if (!a(ad1.d()))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        a(ad1.d(), message);
        d.a(s);
        return ad1;
        ad1 = g.a(ad1);
          goto _L1
        NewMessageResult newmessageresult;
        ad1 = e.a(s, ad1);
        newmessageresult = (NewMessageResult)ad1.i();
        if (newmessageresult == null) goto _L3; else goto _L2
_L2:
        if (!m.g(newmessageresult.a()))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        c.a(FolderName.d, newmessageresult.b(), newmessageresult.c());
_L4:
        if (h.b() == FolderName.e)
        {
            c.a((FolderName)h.b(), newmessageresult.b(), newmessageresult.c());
        }
_L3:
        d.a(s);
        return ad1;
        c.a(FolderName.b, newmessageresult.b(), newmessageresult.c());
          goto _L4
        ad1;
        Object obj1 = SendError.g;
        obj1 = (new com.facebook.messages.model.threads.e()).a(message).a(((SendError) (obj1))).a(901).B();
        e.a(((Message) (obj1)));
        throw new com.facebook.orca.o.a(ad1, ((Message) (obj1)));
        ad1;
        d.a(s);
        throw ad1;
    }

}
