// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.mixpanel.e;
import com.fitbit.mixpanel.g;
import com.fitbit.synclair.c;
import com.fitbit.synclair.ui.a.f;
import com.fitbit.synclair.ui.controller.SynclairType;
import com.fitbit.synclair.ui.states.SynclairScreenState;
import com.fitbit.synclair.ui.states.d.b;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairActivity

public class SynclairFragment extends Fragment
{

    private final BroadcastReceiver a = new BroadcastReceiver() {

        final SynclairFragment a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                com.fitbit.synclair.ui.SynclairFragment.a(a);
            }
        }

            
            {
                a = SynclairFragment.this;
                super();
            }
    };
    private b b;
    private boolean c;

    public SynclairFragment()
    {
    }

    static void a(SynclairFragment synclairfragment)
    {
        synclairfragment.g();
    }

    private void g()
    {
        SynclairActivity synclairactivity = a();
        if (synclairactivity != null)
        {
            a(synclairactivity);
            return;
        } else
        {
            com.fitbit.e.a.a("SynclairActivity", "activity is null when fireCheckPairing", new Object[0]);
            return;
        }
    }

    public SynclairActivity a()
    {
        return (SynclairActivity)getActivity();
    }

    protected void a(SynclairActivity synclairactivity)
    {
        if (synclairactivity.D().a(synclairactivity))
        {
            b(synclairactivity);
        }
    }

    protected void a(SynclairScreenState synclairscreenstate, Object obj, boolean flag)
    {
        SynclairActivity synclairactivity = (SynclairActivity)getActivity();
        if (flag)
        {
            if (SynclairType.a.name().equalsIgnoreCase(synclairactivity.e))
            {
                com.fitbit.mixpanel.f.a(new e(com.fitbit.synclair.c.j().k().a()));
            }
            if (SynclairType.b.name().equalsIgnoreCase(synclairactivity.e))
            {
                com.fitbit.mixpanel.f.a(new g(a().L()));
            }
            synclairactivity.E();
            return;
        }
        if (synclairscreenstate != null)
        {
            synclairactivity.D().f().a(synclairscreenstate);
            return;
        }
        synclairscreenstate = b.a(synclairactivity, obj);
        if (synclairscreenstate == null)
        {
            synclairactivity.D().f().D();
            return;
        } else
        {
            synclairactivity.D().f().a(synclairscreenstate);
            return;
        }
    }

    public void a(b b1, boolean flag)
    {
        b = b1;
        c = flag;
    }

    protected void b(SynclairActivity synclairactivity)
    {
        if (!synclairactivity.D().b(synclairactivity))
        {
            c(synclairactivity);
        }
    }

    protected boolean b()
    {
        return c;
    }

    protected b c()
    {
        return b;
    }

    protected void c(SynclairActivity synclairactivity)
    {
        synclairactivity.D().e(synclairactivity);
    }

    protected com.fitbit.synclair.ui.states.c.b d()
    {
        return b.b();
    }

    public boolean e()
    {
        return true;
    }

    public boolean f()
    {
        return false;
    }

    public void onPause()
    {
        super.onPause();
        z.a(a);
    }

    public void onResume()
    {
        super.onResume();
        String s = d().c();
        z.a(a, new IntentFilter(s));
        g();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key", true);
    }
}
