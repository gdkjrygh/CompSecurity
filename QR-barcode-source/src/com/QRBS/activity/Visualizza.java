// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

public class Visualizza extends SherlockActivity
{

    Bundle b;
    TextView t;

    public Visualizza()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030042);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d8);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        t = (TextView)findViewById(0x7f0d00e9);
        b = getIntent().getBundleExtra("bundle");
        if (b != null)
        {
            bundle = b.getString("label");
            t.setText(bundle);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getSupportMenuInflater().inflate(0x7f0f0009, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return true;

        case 2131558590: 
            menuitem = b.getString("label");
            String s = b.getString("TEXT");
            (new EncodeUtils(this)).start(s, menuitem);
            return true;

        case 2131558645: 
            Utils.copyToClipboard(getApplicationContext(), t.getText().toString());
            return true;

        case 16908332: 
            finish();
            return true;
        }
    }
}
