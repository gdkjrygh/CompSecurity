// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.LogoutTaskState;
import com.fitbit.data.bl.ae;
import com.fitbit.data.bl.dg;
import com.fitbit.util.LogoutDialogFragment;
import com.fitbit.util.ProgressDialogFragment;
import com.fitbit.util.PushNotificationsController;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.google.android.gcm.b;

// Referenced classes of package com.fitbit.home.ui:
//            b, HomeActivity

class e
{

    private FragmentActivity a;
    private com.fitbit.home.ui.b b;
    private final BroadcastReceiver c = new BroadcastReceiver() {

        final e a;

        public void onReceive(Context context, Intent intent)
        {
            e.a(a);
        }

            
            {
                a = e.this;
                super();
            }
    };
    private boolean d;

    public e(FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
        b = new com.fitbit.home.ui.b(fragmentactivity, null) {

            final e a;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                a.a(true);
            }

            public void a(Exception exception)
            {
                g();
                e();
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                LogoutTaskState.c();
                e.a(a, false);
                dg.d().c(true);
            }

            
            {
                a = e.this;
                super(fragmentactivity, a1);
            }
        };
        b.a(new com.fitbit.util.q.a() {

            final e a;

            public DialogFragment a()
            {
                int i;
                if (com.fitbit.home.ui.e.b(a))
                {
                    i = 0x7f0803ad;
                } else
                {
                    i = 0x7f0803ae;
                }
                return ProgressDialogFragment.b(0, i, null);
            }

            
            {
                a = e.this;
                super();
            }
        });
        b.b(new com.fitbit.util.q.a() {

            final e a;

            public DialogFragment a()
            {
                return LogoutDialogFragment.a(e.c(a));
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    static void a(e e1)
    {
        e1.d();
    }

    static boolean a(e e1, boolean flag)
    {
        e1.d = flag;
        return flag;
    }

    static boolean b(e e1)
    {
        return e1.d;
    }

    static com.fitbit.home.ui.b c(e e1)
    {
        return e1.b;
    }

    private void c()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.data.bl.LOGOUT_TASK_STATE_CHANGED");
        LocalBroadcastManager.getInstance(a).registerReceiver(c, intentfilter);
    }

    private void d()
    {
        com.fitbit.data.bl.LogoutTaskState.State state = LogoutTaskState.a();
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.bl.LogoutTaskState.State.values().length];
                try
                {
                    a[com.fitbit.data.bl.LogoutTaskState.State.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.bl.LogoutTaskState.State.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.bl.LogoutTaskState.State.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.bl.LogoutTaskState.State.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5.a[state.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b.c();
            PushNotificationsController.b(a);
            return;

        case 2: // '\002'
            b.a(LogoutTaskState.b());
            return;

        case 3: // '\003'
            b.d();
            break;
        }
        HomeActivity.e(a);
        com.google.android.gcm.b.c(FitBitApplication.a());
    }

    private void e()
    {
        LocalBroadcastManager.getInstance(a).unregisterReceiver(c);
    }

    public void a()
    {
        c();
        d();
    }

    protected void a(boolean flag)
    {
        if (LogoutTaskState.a() == com.fitbit.data.bl.LogoutTaskState.State.a)
        {
            b.h();
        }
        d = flag;
        a.startService(ae.a(a, flag));
    }

    public void b()
    {
        e();
        b.d();
    }
}
