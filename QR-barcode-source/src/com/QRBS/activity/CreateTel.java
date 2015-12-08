// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

public class CreateTel extends SherlockActivity
{

    final int PICK_CONTACT_REQUEST = 0;
    Button encode;
    Button pick;
    EditText text;

    public CreateTel()
    {
    }

    private void pickContact()
    {
        Intent intent = new Intent("android.intent.action.PICK", Uri.parse("content://contacts"));
        intent.setType("vnd.android.cursor.dir/phone_v2");
        startActivityForResult(intent, 0);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 0 && j == -1)
        {
            Log.d("", "CHECK POINT");
            Uri uri = intent.getData();
            intent = new EncodeUtils(this);
            String as[] = intent.getTel(uri);
            intent.start(as[0], as[1]);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030025);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800cf);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        text = (EditText)findViewById(0x7f0d008c);
        encode = (Button)findViewById(0x7f0d0079);
        pick = (Button)findViewById(0x7f0d0078);
        encode.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateTel this$0;

            public void onClick(View view)
            {
                view = text.getText().toString();
                if (view == null || view.length() == 0)
                {
                    Utils.showToastNotification(CreateTel.this, getString(0x7f080108));
                    return;
                } else
                {
                    (new EncodeUtils(CreateTel.this)).start((new StringBuilder("tel:")).append(view).toString(), view);
                    return;
                }
            }

            
            {
                this$0 = CreateTel.this;
                super();
            }
        });
        pick.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateTel this$0;

            public void onClick(View view)
            {
                pickContact();
            }

            
            {
                this$0 = CreateTel.this;
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
