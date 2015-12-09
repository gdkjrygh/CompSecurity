// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import com.jcp.JCP;
import com.jcp.c.o;
import com.jcp.e.n;
import com.jcp.f.a;
import com.jcp.pojo.Accordion;
import com.jcp.util.t;

// Referenced classes of package com.jcp.activities:
//            ao, by, MainActivity

public class SplashActivity extends ao
    implements n, t
{

    public SplashActivity()
    {
    }

    static void a(SplashActivity splashactivity)
    {
        splashactivity.i();
    }

    private void a(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(s);
        builder.setPositiveButton(0x7f070049, new by(this));
        builder.create().show();
    }

    private void i()
    {
        startActivity(new Intent(this, com/jcp/activities/MainActivity));
        finish();
    }

    public void a(int j, Bundle bundle)
    {
        i();
    }

    public void a(String s, int j)
    {
        if (!isFinishing())
        {
            a(com.jcp.f.a.a(this, s));
        }
        i();
    }

    public void a(Accordion aaccordion[], int j)
    {
        if (j == 14 && aaccordion != null)
        {
            JCP.e().a(aaccordion);
            com.jcp.b.a.a(this);
        }
        i();
    }

    public void g()
    {
        o o1 = new o(this);
        o1.a(this);
        o1.a();
    }

    protected String h()
    {
        return "SPLASH";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030030);
        g();
    }
}
