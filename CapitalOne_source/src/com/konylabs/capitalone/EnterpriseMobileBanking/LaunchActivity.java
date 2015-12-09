// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.konylabs.capitalone.EnterpriseMobileBanking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Utils.Log;

public class LaunchActivity extends Activity
{

    private static final String TAG = "LaunchActivity";
    private static LaunchActivity launch = null;

    public LaunchActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0e0000, menu);
        return true;
    }

    protected void onStart()
    {
        super.onStart();
        launch = this;
        final Intent action = new Intent(this, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
        Log.d("LA", (new StringBuilder()).append("Data is: ").append(getIntent().getDataString()).toString());
        action.setData(getIntent().getData());
        if (getIntent().getData() != null)
        {
            action.setFlags(0x24000000);
        }
        findViewById(0x7f080013).postDelayed(new Runnable() {

            final LaunchActivity this$0;
            final Intent val$action;

            public void run()
            {
                if (!LaunchActivity.launch.isFinishing())
                {
                    startActivity(action);
                    finish();
                }
            }

            
            {
                this$0 = LaunchActivity.this;
                action = intent;
                super();
            }
        }, 1000L);
    }


}
