// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;

public abstract class dxh extends fou
{

    public dxj d;
    private dxk i;
    private dxj j;
    private dxj k;
    private boolean l;
    private boolean m;
    private ab n;

    public dxh()
    {
        n = new ab() {

            private dxh a;

            public final void a()
            {
                Fragment fragment = a.a_().a("flow_fragment");
                if (fragment != null && fragment.o())
                {
                    dxh.a(a, (dxj)fragment);
                    return;
                } else
                {
                    dxh.a(a, null);
                    return;
                }
            }

            
            {
                a = dxh.this;
                super();
            }
        };
    }

    static dxj a(dxh dxh1, dxj dxj1)
    {
        dxh1.d = dxj1;
        return dxj1;
    }

    public final void a(dxi dxi1)
    {
        if (isFinishing())
        {
            Logger.b("Already finishing.", new Object[0]);
            return;
        } else
        {
            setResult(-1);
            dxi1.a(this, f());
            finish();
            return;
        }
    }

    public final void a(dxj dxj1, boolean flag)
    {
        Assertion.a(true, "Fragment container for the flow activity has not been set");
        if (!m)
        {
            j = dxj1;
            l = flag;
            return;
        }
        d = dxj1;
        ah ah1 = a_().a();
        if (flag)
        {
            ah1.b();
        }
        ah1.b(0x1020002, dxj1, "flow_fragment");
        ah1.c();
    }

    public final void a(dxk dxk)
    {
        ah ah1 = a_().a();
        dxk dxk1 = i;
        Object obj = dxk1;
        if (dxk1 == null)
        {
            obj = a_().a("FlowLogicFragmentTag");
        }
        if (obj != null)
        {
            ah1.a(((Fragment) (obj)));
        }
        ah1.a(dxk, "FlowLogicFragmentTag");
        ah1.c();
        i = dxk;
    }

    public final Intent f()
    {
        Intent intent = getIntent();
        ctz.a(intent);
        return (Intent)intent.getParcelableExtra("intent");
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (d != null)
        {
            d.a(i1, j1, intent);
        }
        super.onActivityResult(i1, j1, intent);
    }

    public void onBackPressed()
    {
        boolean flag = false;
        if (d != null)
        {
            flag = d.G();
        }
        if (!flag)
        {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a_().a(n);
        setResult(0);
    }

    protected void onPause()
    {
        super.onPause();
        m = false;
    }

    protected void onPostResume()
    {
        super.onPostResume();
        if (j != null)
        {
            a(j, l);
            j = null;
        }
        if (k != null)
        {
            dxj dxj1 = k;
            Assertion.a(true, "Fragment container for the flow activity has not been set");
            if (!m)
            {
                k = dxj1;
            } else
            {
                a_().c();
                a(dxj1, true);
            }
            k = null;
        }
    }

    protected void onResume()
    {
        super.onResume();
        m = true;
    }
}
