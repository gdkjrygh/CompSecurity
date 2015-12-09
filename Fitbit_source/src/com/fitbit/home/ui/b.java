// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.exceptions.ApplicationBackedOffException;
import com.fitbit.data.bl.exceptions.BlockerRestrictionException;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerResponseException;
import com.fitbit.data.bl.exceptions.TrackerSigningKeyExpiredException;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.ui.s;
import com.fitbit.util.ProgressDialogFragment;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.RetryDialogFragmentWithSendlog;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.q;
import org.json.JSONException;

// Referenced classes of package com.fitbit.home.ui:
//            f, j

public class b
    implements f, com.fitbit.util.SimpleConfirmDialogFragment.a
{
    public static interface a
    {

        public abstract void a(b b1);
    }


    private static final String a = "com.fitbit.home.ui.NetworkOperationCallback.TAG_PROGRESS";
    private static final String b = "com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY";
    private String c;
    private final q d;
    private final a e;
    private final FragmentActivity f;
    private final android.content.DialogInterface.OnCancelListener g;
    private com.fitbit.util.q.a h;
    private com.fitbit.util.q.a i;
    private com.fitbit.util.q.a j;
    private Bundle k;

    public b(FragmentActivity fragmentactivity, a a1)
    {
        this(fragmentactivity, a1, null);
    }

    public b(FragmentActivity fragmentactivity, a a1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        f = fragmentactivity;
        e = a1;
        g = oncancellistener;
        b();
        d = new q(i());
        fragmentactivity = d.b("com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY");
        if (fragmentactivity != null && (fragmentactivity instanceof SimpleConfirmDialogFragment))
        {
            ((SimpleConfirmDialogFragment)fragmentactivity).b(this);
        }
    }

    static android.content.DialogInterface.OnCancelListener a(b b1)
    {
        return b1.g;
    }

    static String a(b b1, String s1)
    {
        b1.c = s1;
        return s1;
    }

    static String b(b b1)
    {
        return b1.c;
    }

    private FragmentManager i()
    {
        return f.getSupportFragmentManager();
    }

    private void j()
    {
        d.a("com.fitbit.home.ui.NetworkOperationCallback.TAG_PROGRESS", h, k);
    }

    protected String a()
    {
        return f.getResources().getString(0x7f08018e);
    }

    public void a(Bundle bundle)
    {
        k = bundle;
    }

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        if (e != null)
        {
            e.a(this);
        }
    }

    public void a(com.fitbit.util.q.a a1)
    {
        h = a1;
    }

    public void a(Exception exception)
    {
        g();
        if (exception instanceof ServerResponseException)
        {
            s.a(f, f.getString(((ServerResponseException)exception).a()), 1).i();
        } else
        {
            if (!(exception instanceof ServerCommunicationException) && !(exception instanceof JSONException))
            {
                continue;
            }
            if ((exception instanceof NetworkTimeoutException) || (exception instanceof TrackerSigningKeyExpiredException))
            {
                e();
                return;
            }
            if ((exception instanceof ApplicationBackedOffException) || (exception instanceof BlockerRestrictionException))
            {
                exception = ServerGateway.a().b().a();
                if (exception != null && exception == com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.e)
                {
                    s.a(f, exception.a(f, ServerGateway.a().b()), 1).i();
                    return;
                }
                if (d.b("com.fitbit.AppUpdateManager.DIALOG_TAG") == null)
                {
                    d.a("com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY", j);
                    return;
                }
            } else
            if (exception instanceof ServerCommunicationException)
            {
                c = f.getString(((ServerCommunicationException)com/fitbit/data/bl/exceptions/ServerCommunicationException.cast(exception)).a());
                d.a("com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY", j);
                return;
            } else
            {
                e();
                return;
            }
        }
        do
        {
            return;
        } while (exception == null);
        s.a(f, 0x7f08018f, 0).i();
    }

    protected void b()
    {
        h = new com.fitbit.util.q.a() {

            final b a;

            public DialogFragment a()
            {
                return ProgressDialogFragment.b(0, 0x7f08046a, b.a(a));
            }

            
            {
                a = b.this;
                super();
            }
        };
        i = com.fitbit.home.ui.j.a(this);
        j = new com.fitbit.util.q.a() {

            final b a;

            public DialogFragment a()
            {
                b b1 = a;
                String s1;
                if (b.b(a) == null)
                {
                    s1 = a.a();
                } else
                {
                    s1 = b.b(a);
                }
                b.a(b1, s1);
                if (com.fitbit.config.b.a == BuildType.a)
                {
                    return RetryDialogFragment.a(a, 0x7f08048f, b.b(a));
                } else
                {
                    return RetryDialogFragmentWithSendlog.b(a, 0x7f08048f, b.b(a));
                }
            }

            
            {
                a = b.this;
                super();
            }
        };
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void b(com.fitbit.util.q.a a1)
    {
        i = a1;
    }

    public void c()
    {
        j();
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    protected void c(com.fitbit.util.q.a a1)
    {
        d.a("com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY", a1, k);
    }

    public void d()
    {
        g();
    }

    protected void e()
    {
        d.a("com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY", i, k);
    }

    protected void f()
    {
        d.a("com.fitbit.home.ui.NetworkOperationBinder.TAG_RETRY", j, k);
    }

    protected void g()
    {
        d.a("com.fitbit.home.ui.NetworkOperationCallback.TAG_PROGRESS");
    }

    public void h()
    {
        g();
    }
}
