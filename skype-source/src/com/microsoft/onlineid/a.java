// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.microsoft.onlineid.internal.a.f;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.g;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.internal.sso.b;
import com.microsoft.onlineid.internal.sso.client.c;

// Referenced classes of package com.microsoft.onlineid:
//            f, b, e, j, 
//            c, h, d, i

public final class a
{

    private final Context a;
    private final com.microsoft.onlineid.f b;
    private com.microsoft.onlineid.b c;
    private com.microsoft.onlineid.e d;
    private com.microsoft.onlineid.c e;
    private final c f;

    public a(Context context)
    {
        this(context, new com.microsoft.onlineid.f());
    }

    public a(Context context, com.microsoft.onlineid.f f1)
    {
        Context context1 = context;
        if (context.getApplicationContext() != null)
        {
            context1 = context.getApplicationContext();
        }
        a = context1;
        b = f1;
        f = new c(a);
        com.microsoft.onlineid.a.a.a(a);
        com.microsoft.onlineid.internal.c.d.a(a);
    }

    static com.microsoft.onlineid.f a(a a1)
    {
        return a1.b;
    }

    private static void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalStateException((new StringBuilder("You must specify an ")).append(s).append(" before invoking this method.").toString());
        } else
        {
            return;
        }
    }

    static c b(a a1)
    {
        return a1.f;
    }

    static com.microsoft.onlineid.b c(a a1)
    {
        return a1.c;
    }

    static com.microsoft.onlineid.e d(a a1)
    {
        return a1.d;
    }

    public final a a(com.microsoft.onlineid.b b1)
    {
        c = b1;
        return this;
    }

    public final a a(com.microsoft.onlineid.c c1)
    {
        e = c1;
        return this;
    }

    public final a a(com.microsoft.onlineid.e e1)
    {
        d = e1;
        return this;
    }

    public final void a(Bundle bundle)
    {
        a(c, com/microsoft/onlineid/b.getSimpleName());
        (new Thread(new com.microsoft.onlineid.internal.sso.client.g(c, bundle, bundle) {

            final Bundle a;
            final a b;

            public final void a()
                throws com.microsoft.onlineid.b.a
            {
                android.app.PendingIntent pendingintent = com.microsoft.onlineid.a.b(b).a(a.a(b), a);
                com.microsoft.onlineid.a.c(b).onUINeeded(pendingintent, a);
            }

            
            {
                b = a.this;
                a = bundle1;
                super(f1, bundle);
            }
        })).start();
    }

    public final void a(h h, Bundle bundle)
    {
        a(c, com/microsoft/onlineid/b.getSimpleName());
        (new Thread(new com.microsoft.onlineid.internal.sso.client.g(c, bundle, h, bundle) {

            final h a;
            final Bundle b;
            final a c;

            public final void a()
                throws com.microsoft.onlineid.b.a
            {
                android.app.PendingIntent pendingintent = com.microsoft.onlineid.a.b(c).a(a, a.a(c), b);
                com.microsoft.onlineid.a.c(c).onUINeeded(pendingintent, b);
            }

            
            {
                c = a.this;
                a = h;
                b = bundle1;
                super(f1, bundle);
            }
        })).start();
    }

    public final void a(j j1, Bundle bundle)
    {
        a(c, com/microsoft/onlineid/b.getSimpleName());
        (new Thread(new com.microsoft.onlineid.internal.sso.client.g(c, bundle, j1, bundle) {

            final j a;
            final Bundle b;
            final a c;

            public final void a()
                throws com.microsoft.onlineid.b.a
            {
                try
                {
                    android.app.PendingIntent pendingintent = com.microsoft.onlineid.a.b(c).b(a.a(), b);
                    com.microsoft.onlineid.a.c(c).onUINeeded(pendingintent, b);
                    return;
                }
                catch (com.microsoft.onlineid.internal.b.a a1)
                {
                    com.microsoft.onlineid.a.c(c).onAccountSignedOut(a.a(), false, b);
                }
            }

            
            {
                c = a.this;
                a = j1;
                b = bundle1;
                super(f1, bundle);
            }
        })).start();
    }

    final void a(j j1, com.microsoft.onlineid.d d1, Bundle bundle)
    {
        a(c, com/microsoft/onlineid/b.getSimpleName());
        a(d, com/microsoft/onlineid/e.getSimpleName());
        (new Thread(new com.microsoft.onlineid.internal.sso.client.g(d, bundle, j1, d1, bundle) {

            final j a;
            final com.microsoft.onlineid.d b;
            final Bundle c;
            final a d;

            public final void a()
                throws com.microsoft.onlineid.b.a
            {
                com.microsoft.onlineid.internal.sso.client.f f1;
                f1 = com.microsoft.onlineid.a.b(d).a(a.a(), b, a.a(d), c);
                if (f1.a())
                {
                    com.microsoft.onlineid.a.d(d).onTicketAcquired((i)f1.c(), a, c);
                    return;
                }
                try
                {
                    com.microsoft.onlineid.a.d(d).onUINeeded(f1.d(), c);
                    return;
                }
                catch (com.microsoft.onlineid.internal.b.a a1)
                {
                    com.microsoft.onlineid.a.c(d).onAccountSignedOut(a.a(), false, c);
                }
                return;
            }

            
            {
                d = a.this;
                a = j1;
                b = d1;
                c = bundle1;
                super(f1, bundle);
            }
        })).start();
    }

    public final void a(String s, Bundle bundle)
    {
        a(c, com/microsoft/onlineid/b.getSimpleName());
        (new Thread(new com.microsoft.onlineid.internal.sso.client.g(c, bundle, s, bundle) {

            final String a;
            final Bundle b;
            final a c;

            public final void a()
                throws com.microsoft.onlineid.b.a
            {
                try
                {
                    o.a(a, "cid");
                    com.microsoft.onlineid.sts.b b1 = com.microsoft.onlineid.a.b(c).a(a, b);
                    com.microsoft.onlineid.a.c(c).onAccountAcquired(new j(c, b1), b);
                    return;
                }
                catch (com.microsoft.onlineid.internal.b.a a1)
                {
                    com.microsoft.onlineid.a.c(c).onAccountSignedOut(a, false, b);
                }
            }

            
            {
                c = a.this;
                a = s;
                b = bundle1;
                super(f1, bundle);
            }
        })).start();
    }

    public final boolean a(int i, Intent intent)
    {
        Bundle bundle;
        Object obj;
        Object obj1;
        Object obj3 = null;
        Object obj4 = null;
        obj = null;
        Object obj5 = null;
        obj1 = obj4;
        String s = obj3;
        bundle = obj5;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        try
        {
            intent = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Caught BadParcelableException when checking extras, ignoring: ")).append(intent).toString());
            return false;
        }
        obj = intent;
        obj1 = obj4;
        s = obj3;
        bundle = obj5;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        bundle = intent.getBundle("com.microsoft.onlineid.client_state");
        s = intent.getString("com.microsoft.onlineid.result_type");
        obj1 = com.microsoft.onlineid.internal.a.a(s);
        obj = intent;
        com.microsoft.onlineid.internal.a.f.a();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Unknown result type (")).append(s).append(") encountered, ignoring.").toString());
        return false;
        Object obj2;
        if (obj1 == com.microsoft.onlineid.internal.a.b)
        {
            obj2 = d;
        } else
        {
            obj2 = c;
        }
        if (obj1 == com.microsoft.onlineid.internal.a.b)
        {
            intent = d;
        } else
        {
            intent = c;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        ((g) (obj2)).onUserCancel(bundle);
_L4:
        return true;
_L2:
        if (i != -1) goto _L4; else goto _L3
_L3:
        if (!com.microsoft.onlineid.internal.sso.a.g(((Bundle) (obj))))
        {
            break MISSING_BLOCK_LABEL_306;
        }
        obj1 = com.microsoft.onlineid.internal.sso.a.h(((Bundle) (obj)));
        if (!(obj1 instanceof com.microsoft.onlineid.internal.b.a))
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj1 = ((Bundle) (obj)).getString("com.microsoft.onlineid.user_cid");
        boolean flag;
        if (obj1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            com.microsoft.onlineid.internal.e.a(flag);
            flag = ((Bundle) (obj)).getBoolean("com.microsoft.onlineid.signed_out_this_app_only");
            c.onAccountSignedOut(((String) (obj1)), flag, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            intent.onFailure(new com.microsoft.onlineid.b.b(((Throwable) (obj))), bundle);
        }
          goto _L4
        intent.onFailure(((com.microsoft.onlineid.b.a) (obj1)), bundle);
          goto _L4
label0:
        {
            if (!((Bundle) (obj)).containsKey("com.microsoft.onlineid.ui_resolution_intent"))
            {
                break label0;
            }
            ((g) (obj2)).onUINeeded(com.microsoft.onlineid.internal.sso.a.f(((Bundle) (obj))), bundle);
        }
          goto _L4
        if (obj1 != com.microsoft.onlineid.internal.a.b)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        if (((Bundle) (obj)).getString("com.microsoft.onlineid.ticket_scope_target") != null && ((Bundle) (obj)).getString("com.microsoft.onlineid.ticket_scope_policy") != null && ((Bundle) (obj)).getLong("com.microsoft.onlineid.ticket_expiration_time") != 0L && ((Bundle) (obj)).getString("com.microsoft.onlineid.ticket_value") != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        obj1 = com.microsoft.onlineid.internal.sso.a.c(((Bundle) (obj)));
        obj = com.microsoft.onlineid.internal.sso.a.e(((Bundle) (obj)));
        d.onTicketAcquired(((i) (obj)), new j(this, ((com.microsoft.onlineid.sts.b) (obj1))), bundle);
          goto _L4
        if (obj1 != com.microsoft.onlineid.internal.a.a)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        if (((Bundle) (obj)).getString("com.microsoft.onlineid.user_puid") != null && ((Bundle) (obj)).getString("com.microsoft.onlineid.user_cid") != null && ((Bundle) (obj)).getString("com.microsoft.onlineid.user_username") != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        obj = com.microsoft.onlineid.internal.sso.a.c(((Bundle) (obj)));
        c.onAccountAcquired(new j(this, ((com.microsoft.onlineid.sts.b) (obj))), bundle);
          goto _L4
        intent.onFailure(new com.microsoft.onlineid.b.b("Unexpected onActivityResult found."), bundle);
          goto _L4
    }
}
