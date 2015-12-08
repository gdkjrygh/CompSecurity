// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.b.b;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.BlockingApiRequestResultReceiver;
import com.microsoft.onlineid.internal.b.a;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.internal.sso.client.f;
import com.microsoft.onlineid.sts.a.c;
import com.microsoft.onlineid.sts.a.e;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service.operation:
//            j

public final class h extends j
{

    public h(Context context, Bundle bundle, com.microsoft.onlineid.sts.a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        super(context, bundle, a1, a2);
    }

    public final Bundle a()
        throws a, c, com.microsoft.onlineid.b.c, e, b
    {
label0:
        {
            Object obj = b().getString("com.microsoft.onlineid.user_cid");
            o.a(((String) (obj)), "com.microsoft.onlineid.user_cid");
            Object obj1 = j().a(((String) (obj)));
            if (obj1 == null)
            {
                throw new a();
            }
            com.microsoft.onlineid.d d = com.microsoft.onlineid.internal.sso.a.d(b());
            String s = b().getString("com.microsoft.onlineid.cobranding_id");
            obj = new GetTicketOperation._cls1();
            obj1 = (new com.microsoft.onlineid.internal.f.a(i())).a(((com.microsoft.onlineid.sts.b) (obj1)).b(), d, c(), s, f()).(true).(((android.os.ResultReceiver) (obj)));
            i().startService(((com.microsoft.onlineid.internal.b) (obj1)).());
            try
            {
                obj = ((BlockingApiRequestResultReceiver) (obj)).b();
                if (((f) (obj)).a())
                {
                    return com.microsoft.onlineid.internal.sso.a.a((i)((f) (obj)).c());
                }
                if (!((f) (obj)).b())
                {
                    break label0;
                }
                obj = com.microsoft.onlineid.internal.sso.a.a(((f) (obj)).d());
            }
            catch (com.microsoft.onlineid.internal.b.c c1)
            {
                com.microsoft.onlineid.internal.e.a(false);
                return com.microsoft.onlineid.internal.sso.a.a(c1);
            }
            catch (Exception exception)
            {
                return com.microsoft.onlineid.internal.sso.a.a(exception);
            }
            return ((Bundle) (obj));
        }
        com.microsoft.onlineid.internal.e.a(false);
        throw new b("GetTicketOperation did not receive an expected result from MsaService.");
    }

    // Unreferenced inner class com/microsoft/onlineid/internal/sso/service/operation/GetTicketOperation$1

/* anonymous class */
    class GetTicketOperation._cls1 extends BlockingApiRequestResultReceiver
    {

        final h a;

        protected final void a(com.microsoft.onlineid.internal.c c1)
        {
            a(c1.d());
        }

            
            {
                a = h.this;
                super();
            }
    }

}
