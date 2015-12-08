// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.aj;
import android.support.v4.app.ay;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.l;
import com.jcp.e.ae;
import com.jcp.e.al;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.u;
import com.jcp.http.c;
import com.jcp.model.Session;
import com.jcp.util.af;
import com.jcp.util.au;
import com.jcp.util.bk;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            ao, g, e, f, 
//            JcpCheckoutSignIn

public class CartCheckoutActivity extends ao
    implements ae, al
{

    private int i;
    private String j;

    public CartCheckoutActivity()
    {
        i = -1;
    }

    private void a(Bundle bundle)
    {
        if (bundle != null)
        {
            i = bundle.getInt("from", -1);
            if (bundle.containsKey("url"))
            {
                j = bundle.getString("url");
            }
        }
        if (i != 3)
        {
            boolean flag = JCP.s().b();
            boolean flag1 = JCP.s().c();
            if (flag1 && flag)
            {
                bundle = bk.a(this);
                if (bundle != null)
                {
                    JCP.s().a(this, bundle, this, true);
                    return;
                } else
                {
                    g();
                    return;
                }
            }
            if (flag1)
            {
                bundle = new l(this);
                bundle.a(this);
                bundle.d();
                return;
            }
            if (i == 4)
            {
                i();
                return;
            }
            if (i == 1)
            {
                g();
                return;
            } else
            {
                j();
                return;
            }
        } else
        {
            j();
            return;
        }
    }

    private void i()
    {
        JCP.s().a(this, (new ad()).b(true).a(), this);
    }

    private void j()
    {
        if (!isFinishing())
        {
            ay ay1 = f().a();
            u u1 = new u();
            if (TextUtils.isEmpty(j))
            {
                u1.g(l());
            } else
            {
                Bundle bundle = new Bundle();
                bundle.putInt("from", i);
                bundle.putString("url", j);
                u1.g(bundle);
            }
            ay1.b(0x7f0e0096, u1);
            ay1.a(null);
            ay1.b();
        }
    }

    private void k()
    {
        au.a(this, getResources().getString(0x7f0700ef), new g(this));
    }

    private Bundle l()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("from", i);
        String s = "";
        if (i == 1)
        {
            if (JCP.s().c())
            {
                s = com.jcp.b.b.h();
            } else
            {
                s = com.jcp.b.b.j();
            }
        }
        bundle.putString("url", s);
        return bundle;
    }

    public void a(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (com.jcp.http.b.a(i1))
        {
            errormessageentitycontainer = new a();
            errormessageentitycontainer.put("", "");
            JCP.s().b(this, errormessageentitycontainer, this);
            return;
        }
        if (errormessageentitycontainer != null)
        {
            errormessageentitycontainer = errormessageentitycontainer.getErrorMessage().toString();
        } else
        {
            errormessageentitycontainer = getString(0x7f0701be);
        }
        au.a(this, errormessageentitycontainer, new e(this));
    }

    public void a(int i1, String s)
    {
        k();
    }

    public void a(Session session)
    {
        if (session.isGuest() || session.isRegistered())
        {
            j();
            return;
        }
        boolean flag = JCP.s().c();
        c.a();
        JCP.s().a();
        if (flag)
        {
            au.a(this, getResources().getString(0x7f0700ef), new f(this));
            return;
        } else
        {
            g();
            return;
        }
    }

    public void b(int i1, String s)
    {
        if (com.jcp.http.b.a(i1))
        {
            j();
        }
    }

    public void g()
    {
        Intent intent = new Intent(this, com/jcp/activities/JcpCheckoutSignIn);
        Bundle bundle = new Bundle();
        bundle.putInt("from", i);
        intent.putExtras(bundle);
        startActivityForResult(intent, 2000);
    }

    protected String h()
    {
        return "CARTCHECKOUT";
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
label0:
        {
            super.onActivityResult(i1, j1, intent);
            if (i1 == 2000)
            {
                if (intent == null)
                {
                    break label0;
                }
                a(intent.getExtras());
            }
            return;
        }
        finish();
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        setContentView(0x7f03001a);
        a(getIntent().getExtras());
    }
}
