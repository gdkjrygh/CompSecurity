// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.h;
import com.microsoft.onlineid.internal.c;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.j;
import com.microsoft.onlineid.internal.sso.client.BackupService;
import com.microsoft.onlineid.internal.ui.WebFlowActivity;
import com.microsoft.onlineid.sts.n;
import java.net.URL;

public class AddAccountActivity extends Activity
{

    public static final String a = (new StringBuilder()).append(com/microsoft/onlineid/ui/AddAccountActivity.getName()).append(".SignInOptions").toString();
    protected Handler b;
    protected int c;
    protected String d;
    private com.microsoft.onlineid.internal.a e;

    public AddAccountActivity()
    {
        c = -1;
    }

    public static Intent a(Context context, h h1, String s, String s1, String s2, Bundle bundle)
    {
        context = (new Intent(context, com/microsoft/onlineid/ui/AddAccountActivity)).setAction("com.microsoft.onlineid.internal.ADD_ACCOUNT").putExtra("fl", s).putExtra("com.microsoft.onlineid.cobranding_id", s1).putExtra("com.microsoft.onlineid.client_package_name", s2).putExtra("com.microsoft.onlineid.client_state", bundle).setData((new com.microsoft.onlineid.internal.i.a()).a(h1).a(s).a(s1).a(s2).a());
        context.putExtra(a, h1.a());
        return context;
    }

    public static Intent a(Context context, String s, String s1, String s2, Bundle bundle)
    {
        return (new Intent(context, com/microsoft/onlineid/ui/AddAccountActivity)).setAction("com.microsoft.onlineid.internal.SIGN_UP_ACCOUNT").putExtra("fl", s).putExtra("com.microsoft.onlineid.cobranding_id", s1).putExtra("com.microsoft.onlineid.client_package_name", s2).putExtra("com.microsoft.onlineid.client_state", bundle).setData((new com.microsoft.onlineid.internal.i.a()).a(s).a(s1).a(s2).a());
    }

    private void a(Exception exception)
    {
        com.microsoft.onlineid.internal.b b1;
        boolean flag;
        if (exception != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        com.microsoft.onlineid.internal.c.d.c("Failed to add account.", exception);
        com.microsoft.onlineid.a.a.a().a(exception);
        b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
        if (b1.j())
        {
            b1.a(exception);
        } else
        {
            e.a(exception).a();
        }
        finish();
    }

    private void a(String s)
    {
        com.microsoft.onlineid.internal.b b1;
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
        if (b1.j())
        {
            b1.a((new c()).a(s));
        } else
        {
            s = (new f(getApplicationContext())).a(s);
            if (s == null)
            {
                a(((Exception) (new com.microsoft.onlineid.b.b("AddAccountActivity could not acquire newly added account."))));
                return;
            }
            e.a(s).a();
        }
        finish();
    }

    private void b(String s)
    {
        a(new com.microsoft.onlineid.b.b(s));
    }

    public void finish()
    {
        if (c != -1)
        {
            finishActivity(c);
            c = -1;
        }
        super.finish();
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        if (i == c)
        {
            c = -1;
        }
        i;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 80
    //                   1 79
    //                   2 238;
           goto _L1 _L2 _L3 _L4
_L1:
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Received activity result for unknown request code: ")).append(i).toString());
        b((new StringBuilder("Received activity result for unknown request code: ")).append(i).toString());
          goto _L3
_L5:
        return;
_L2:
        switch (k)
        {
        default:
            b((new StringBuilder("Sign in activity finished with unexpected result code: ")).append(k).toString());
            return;

        case -1: 
            if (intent == null || intent.getExtras() == null)
            {
                b("Sign in flow finished successfully with no extras set.");
                return;
            }
            intent = (new c(intent.getExtras())).b();
            BackupService.a(getApplicationContext());
            if (!isFinishing())
            {
                finishActivity(1);
                a(intent);
                return;
            }
            break;

        case 1: // '\001'
            a((new c(intent.getExtras())).e());
            return;

        case 0: // '\0'
            intent = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
            if (intent.j())
            {
                intent.n();
            }
            finish();
            return;
        }
_L3:
        if (true) goto _L5; else goto _L4
_L4:
        switch (k)
        {
        default:
            b((new StringBuilder("Account added activity finished with unexpected result code: ")).append(k).toString());
            return;

        case -1: 
        case 0: // '\0'
            a(d);
            break;
        }
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = new n(getApplicationContext());
        boolean flag = "com.microsoft.msa.authenticator".equals(getIntent().getStringExtra("com.microsoft.onlineid.client_package_name"));
        e = new com.microsoft.onlineid.internal.a(this, com.microsoft.onlineid.internal.a.a.a);
        String s = getIntent().getAction();
        String s1;
        if (flag)
        {
            bundle = com.microsoft.onlineid.sts.n.b.h;
        } else
        {
            bundle = com.microsoft.onlineid.sts.n.b.i;
        }
        s1 = (new StringBuilder("android")).append(com.microsoft.onlineid.internal.n.a(getApplicationContext())).toString();
        bundle = Uri.parse(((n) (obj)).a(bundle).toExternalForm()).buildUpon();
        bundle.appendQueryParameter("platform", s1);
        if ("com.microsoft.onlineid.internal.SIGN_UP_ACCOUNT".equals(s))
        {
            bundle.appendQueryParameter("signup", "1");
        }
        obj = getIntent().getStringExtra("fl");
        if (obj != null)
        {
            bundle.appendQueryParameter("fl", ((String) (obj)));
        }
        if ("com.microsoft.onlineid.internal.ADD_ACCOUNT".equals(s))
        {
            obj = getIntent().getBundleExtra(a);
            if (obj != null)
            {
                obj = (new h(((Bundle) (obj)))).b();
                if (obj != null)
                {
                    bundle.appendQueryParameter("username", ((String) (obj)));
                }
            }
        }
        bundle.appendQueryParameter("client_id", com.microsoft.onlineid.internal.d.a(getApplicationContext(), getIntent().getStringExtra("com.microsoft.onlineid.client_package_name")));
        obj = getIntent().getStringExtra("com.microsoft.onlineid.cobranding_id");
        if (obj != null)
        {
            bundle.appendQueryParameter("cobrandid", ((String) (obj)));
        }
        obj = bundle.build();
        if ("com.microsoft.onlineid.internal.SIGN_UP_ACCOUNT".equals(s))
        {
            bundle = "com.microsoft.onlineid.internal.SIGN_UP";
        } else
        {
            bundle = "com.microsoft.onlineid.internal.SIGN_IN";
        }
        bundle = WebFlowActivity.a(getApplicationContext(), ((Uri) (obj)), bundle, flag).a();
        bundle.addFlags(0x10000);
        c = 0;
        if (!j.a(getApplicationContext()))
        {
            com.microsoft.onlineid.a.a.a().a("Performance", "No network connectivity", "At start of web flow");
            a(new com.microsoft.onlineid.b.c());
            return;
        } else
        {
            startActivityForResult(bundle, 0);
            b = new Handler();
            return;
        }
    }

}
