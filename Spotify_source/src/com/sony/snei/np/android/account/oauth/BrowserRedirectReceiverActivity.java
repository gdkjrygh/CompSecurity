// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.account.oauth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import dbt;

public class BrowserRedirectReceiverActivity extends Activity
{

    public BrowserRedirectReceiverActivity()
    {
    }

    public void finish()
    {
        getClass().getSimpleName();
        dbt.a();
        Intent intent = new Intent((new StringBuilder()).append(getPackageName()).append(".NPAM_ACTION_BROWSER").toString());
        intent.putExtra("SiZ", true);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(0x14104000);
        intent.putExtra("MPc", getIntent().getDataString());
        try
        {
            startActivity(intent);
        }
        catch (RuntimeException runtimeexception)
        {
            dbt.a(getClass().getSimpleName(), "Caught the exception. %s: %s", new Object[] {
                runtimeexception.getClass().getSimpleName(), runtimeexception.getMessage()
            });
        }
        super.finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
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

    protected void onResume()
    {
        super.onResume();
        getClass().getSimpleName();
        dbt.a();
        finish();
    }
}
