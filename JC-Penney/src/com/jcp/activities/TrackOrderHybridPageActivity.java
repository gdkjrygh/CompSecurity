// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aj;
import android.support.v4.app.ay;
import com.jcp.JCP;
import com.jcp.e.ae;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.gw;
import com.jcp.http.b;
import com.jcp.util.af;
import com.jcp.util.au;
import com.jcp.util.bk;

// Referenced classes of package com.jcp.activities:
//            ao, bz

public class TrackOrderHybridPageActivity extends ao
    implements ae
{

    private Bundle i;

    public TrackOrderHybridPageActivity()
    {
    }

    private void g()
    {
        gw gw1 = new gw();
        gw1.g(i);
        f().a().a(0x7f0e0096, gw1, "TrackOrderHybridFragment").a("TrackOrderHybridFragment").b();
    }

    public void a(int j, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (com.jcp.http.b.a(j))
        {
            g();
            return;
        }
        if (errormessageentitycontainer != null)
        {
            errormessageentitycontainer = errormessageentitycontainer.getErrorMessage().toString();
        } else
        {
            errormessageentitycontainer = getString(0x7f0701be);
        }
        au.a(this, errormessageentitycontainer, new bz(this));
    }

    public void b(int j, String s)
    {
    }

    protected String h()
    {
        return "TRACKORDERSHYBRIDACTIVITY";
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        setContentView(0x7f03001a);
        if (getIntent() != null)
        {
            i = getIntent().getExtras();
        }
        boolean flag = JCP.s().b();
        if (JCP.s().c() && flag)
        {
            bundle = bk.a(this);
            if (bundle != null)
            {
                JCP.s().a(this, bundle, this, false);
                return;
            } else
            {
                g();
                return;
            }
        } else
        {
            g();
            return;
        }
    }
}
