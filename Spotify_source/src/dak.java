// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class dak extends Activity
{

    private boolean a;

    public dak()
    {
        a = false;
    }

    private void a()
    {
        dbc dbc1 = dbc.a();
        if (dbc1.c())
        {
            Bundle bundle = new Bundle();
            getClass().getSimpleName();
            dbt.a();
            dbc1.a(bundle);
        } else
        {
            getClass().getSimpleName();
            dbt.a();
        }
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getClass().getSimpleName();
        dbt.a();
        if (bundle != null)
        {
            getClass().getSimpleName();
            dbt.a();
            a = bundle.getBoolean("9Oa", a);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getClass().getSimpleName();
        dbt.a();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        getClass().getSimpleName();
        dbt.a();
        setIntent(intent);
    }

    protected void onPause()
    {
        super.onPause();
        getClass().getSimpleName();
        dbt.a();
    }

    protected void onResume()
    {
        super.onResume();
        getClass().getSimpleName();
        dbt.a();
        Object obj = getIntent();
        if (((Intent) (obj)).getBooleanExtra("EGH", false))
        {
            if (!a)
            {
                a = true;
                if (dbc.a().c())
                {
                    obj = Uri.parse(getIntent().getStringExtra("GnH"));
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(((Uri) (obj)));
                    getClass().getSimpleName();
                    (new StringBuilder("onBrowserRequested: startActivity(")).append(((Uri) (obj)).toString()).append(")");
                    dbt.a();
                    try
                    {
                        startActivity(intent);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        obj = dbc.a();
                    }
                    if (((dbc) (obj)).c())
                    {
                        Bundle bundle = new Bundle();
                        getClass().getSimpleName();
                        dbt.a("onBrowserFailed: sResultReceiver.send(RESULT_CANCELED), reasonCode=0x%08x)", new Object[] {
                            Integer.valueOf(0x800b0001)
                        });
                        dbt.a();
                        bundle.putInt("pD3", 0x800b0001);
                        ((dbc) (obj)).a(bundle);
                    } else
                    {
                        getClass().getSimpleName();
                        dbt.a();
                    }
                    finish();
                    return;
                } else
                {
                    getClass().getSimpleName();
                    dbt.a();
                    a();
                    return;
                }
            } else
            {
                getClass().getSimpleName();
                dbt.a();
                a();
                return;
            }
        }
        if (((Intent) (obj)).getBooleanExtra("SiZ", false))
        {
            dbc dbc1 = dbc.a();
            if (dbc1.c())
            {
                Bundle bundle1 = new Bundle();
                bundle1.putString("MPc", getIntent().getStringExtra("MPc"));
                getClass().getSimpleName();
                (new StringBuilder("onBrowserRedirected: sResultReceiver.send(")).append(bundle1.getString("MPc")).append(")");
                dbt.a();
                dbc1.b(bundle1);
            } else
            {
                getClass().getSimpleName();
                dbt.a();
            }
            finish();
            return;
        } else
        {
            a();
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        getClass().getSimpleName();
        dbt.a();
        if (bundle != null)
        {
            getClass().getSimpleName();
            dbt.a();
            bundle.putBoolean("9Oa", a);
        }
    }

    protected void onStart()
    {
        super.onStart();
        getClass().getSimpleName();
        dbt.a();
    }

    protected void onStop()
    {
        super.onStop();
        getClass().getSimpleName();
        dbt.a();
    }
}
