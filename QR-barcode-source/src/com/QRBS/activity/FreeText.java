// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

public class FreeText extends SherlockActivity
{

    Button encode;
    EditText text;

    public FreeText()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002b);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d2);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        text = (EditText)findViewById(0x7f0d0098);
        encode = (Button)findViewById(0x7f0d0079);
        encode.setOnClickListener(new android.view.View.OnClickListener() {

            final FreeText this$0;

            public void onClick(View view)
            {
                view = text.getText().toString();
                if (view == null || view.length() == 0)
                {
                    Utils.showToastNotification(FreeText.this, getString(0x7f08010c));
                    return;
                } else
                {
                    (new EncodeUtils(FreeText.this)).start(view, view);
                    return;
                }
            }

            
            {
                this$0 = FreeText.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }
}
