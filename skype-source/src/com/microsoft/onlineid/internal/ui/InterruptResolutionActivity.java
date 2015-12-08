// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.ApiRequestResultReceiver;
import com.microsoft.onlineid.internal.c;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.sso.a;
import com.microsoft.onlineid.sts.b;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            WebFlowActivity

public class InterruptResolutionActivity extends Activity
{
    private static abstract class DelegatedResultReceiver extends ApiRequestResultReceiver
    {

        protected InterruptResolutionActivity a;

        protected final void a()
        {
            if (a != null)
            {
                a.a();
            }
        }

        protected final void a(PendingIntent pendingintent)
        {
            if (a != null)
            {
                a.a(pendingintent);
            }
        }

        public final void a(InterruptResolutionActivity interruptresolutionactivity)
        {
            a = interruptresolutionactivity;
        }

        protected final void a(Exception exception)
        {
            if (a != null)
            {
                a.a(exception);
            }
        }

        public DelegatedResultReceiver()
        {
            super(new Handler());
        }
    }

    private static class TicketResultReceiver extends DelegatedResultReceiver
    {

        protected final void a(c c1)
        {
            if (a != null)
            {
                a.a(c1.d());
            }
        }

        private TicketResultReceiver()
        {
        }

        TicketResultReceiver(byte byte0)
        {
            this();
        }
    }

    private static class WebFlowResultReciever extends DelegatedResultReceiver
    {

        protected final void a(c c1)
        {
            if (a != null)
            {
                a.a(c1.c());
            }
        }

        private WebFlowResultReciever()
        {
        }

        WebFlowResultReciever(byte byte0)
        {
            this();
        }
    }


    private f a;
    private String b;
    private String c;
    private d d;
    private String e;
    private String f;
    private Bundle g;
    private WebFlowResultReciever h;
    private TicketResultReceiver i;
    private com.microsoft.onlineid.internal.a j;

    public InterruptResolutionActivity()
    {
    }

    public static Intent a(Context context, Uri uri, b b1, d d1, String s, String s1, Bundle bundle)
    {
        context = (new Intent()).setClass(context, com/microsoft/onlineid/internal/ui/InterruptResolutionActivity).setData(uri).putExtra("com.microsoft.onlineid.user_puid", b1.b()).putExtra("com.microsoft.onlineid.user_cid", b1.d()).putExtra("com.microsoft.onlineid.cobranding_id", s).putExtra("com.microsoft.onlineid.client_package_name", s1).putExtra("com.microsoft.onlineid.client_state", bundle);
        if (d1 != null && s1 != null)
        {
            context.putExtras(com.microsoft.onlineid.internal.sso.a.a(d1));
        } else
        if (d1 != null && s1 == null)
        {
            throw new IllegalArgumentException("A ticket scope requires a client package name to make a request.");
        }
        return context;
    }

    protected final void a()
    {
        com.microsoft.onlineid.internal.b b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
        if (b1.j())
        {
            b1.n();
        }
        finishActivity(1);
        finish();
    }

    protected final void a(PendingIntent pendingintent)
    {
        try
        {
            startIntentSenderForResult(pendingintent.getIntentSender(), 0, null, 0, 0, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            a(((Exception) (pendingintent)));
        }
    }

    protected final void a(i k)
    {
        b b1 = a.a(b);
        if (b1 == null)
        {
            a(((Exception) (new com.microsoft.onlineid.internal.b.a())));
            return;
        } else
        {
            j.a(k).a(b1).a();
            finishActivity(1);
            finish();
            return;
        }
    }

    protected final void a(Exception exception)
    {
        com.microsoft.onlineid.internal.b b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
        if (b1.m())
        {
            if (exception instanceof com.microsoft.onlineid.internal.b.a)
            {
                j.a(c, false).a();
            } else
            {
                j.a(exception).a();
            }
        } else
        {
            b1.a(exception);
        }
        finishActivity(1);
        finish();
    }

    protected final void a(String s)
    {
        com.microsoft.onlineid.internal.b b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
        if (b1.m())
        {
            if (d == null)
            {
                i.a(new IllegalArgumentException("Scope must not be null for SSO ticket request."));
            }
            startService((new com.microsoft.onlineid.internal.f.a(getApplicationContext())).a(b, d, f, e, g).c(s).a(i).a());
            startActivityForResult((new Intent()).setClassName(getApplicationContext(), "com.microsoft.onlineid.authenticator.AccountAddPendingActivity").addFlags(0x10000), 1);
            return;
        } else
        {
            b1.a((new c()).a(b).b(s));
            finish();
            return;
        }
    }

    protected void onActivityResult(int k, int l, Intent intent)
    {
        if (k == 1 && l == 0)
        {
            a();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = new f(getApplicationContext());
        j = new com.microsoft.onlineid.internal.a(this, com.microsoft.onlineid.internal.a.a.b);
        Object obj;
        boolean flag;
        if (bundle != null)
        {
            h = (WebFlowResultReciever)bundle.getParcelable("web_flow_receiver");
            i = (TicketResultReceiver)bundle.getParcelable("ticket_receiver");
        } else
        {
            h = new WebFlowResultReciever((byte)0);
            i = new TicketResultReceiver((byte)0);
        }
        h.a(this);
        i.a(this);
        obj = getIntent().getExtras();
        bundle = ((Bundle) (obj)).getString("com.microsoft.onlineid.ticket_scope_target", null);
        obj = ((Bundle) (obj)).getString("com.microsoft.onlineid.ticket_scope_policy", null);
        if (bundle != null && obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                d = com.microsoft.onlineid.internal.sso.a.d(getIntent().getExtras());
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                a(bundle);
            }
        }
        b = getIntent().getExtras().getString("com.microsoft.onlineid.user_puid");
        c = getIntent().getExtras().getString("com.microsoft.onlineid.user_cid");
        f = getIntent().getExtras().getString("com.microsoft.onlineid.client_package_name");
        e = getIntent().getStringExtra("com.microsoft.onlineid.cobranding_id");
        g = getIntent().getBundleExtra("com.microsoft.onlineid.client_state");
        startActivity(com.microsoft.onlineid.internal.ui.WebFlowActivity.a(getApplicationContext(), getIntent().getData(), "com.microsoft.onlineid.internal.RESOLVE_INTERRUPT", true).a(b).a(h).a().addFlags(0x10000));
    }

    protected void onDestroy()
    {
        h.a(null);
        i.a(null);
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("web_flow_receiver", h);
        bundle.putParcelable("ticket_receiver", i);
        super.onSaveInstanceState(bundle);
    }
}
