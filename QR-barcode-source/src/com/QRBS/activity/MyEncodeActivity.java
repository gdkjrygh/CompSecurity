// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import yuku.ambilwarna.AmbilWarnaDialog;

public class MyEncodeActivity extends SherlockActivity
{

    Bitmap bmp;
    Button color;
    ImageView image;
    Button share;
    TextView text;

    public MyEncodeActivity()
    {
    }

    public void changeBmp(Bitmap bitmap)
    {
        bmp = bitmap;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002a);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d5);
        bundle.setHomeButtonEnabled(true);
        bundle = (AdView)findViewById(0x7f0d0061);
        com.google.android.gms.ads.AdRequest adrequest = (new com.google.android.gms.ads.AdRequest.Builder()).build();
        if (bundle != null)
        {
            bundle.loadAd(adrequest);
        }
        share = (Button)findViewById(0x7f0d0092);
        color = (Button)findViewById(0x7f0d0097);
        image = (ImageView)findViewById(0x7f0d0096);
        text = (TextView)findViewById(0x7f0d0059);
        bundle = getIntent();
        if (bundle != null)
        {
            bmp = (Bitmap)bundle.getParcelableExtra("image");
            if (bmp != null)
            {
                image.setImageBitmap(bmp);
            }
            text.setText(bundle.getStringExtra("text"));
        }
        share.setOnClickListener(new android.view.View.OnClickListener() {

            final MyEncodeActivity this$0;

            public void onClick(View view)
            {
                view = EncodeUtils.getImageUri(getApplicationContext(), bmp);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                if (view != null)
                {
                    intent.putExtra("android.intent.extra.STREAM", view);
                }
                intent.putExtra("android.intent.extra.SUBJECT", (new StringBuilder("Powered by ")).append(getString(0x7f0800b1)).append(" - http://goo.gl/pTAlm4").toString());
                intent.putExtra("android.intent.extra.EMAIL", text.getText().toString());
                intent.putExtra("android.intent.extra.TEXT", text.getText().toString());
                intent.setType("image/jpeg");
                try
                {
                    startActivity(Intent.createChooser(intent, getString(0x7f080112)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Utils.showToastNotification(MyEncodeActivity.this, getString(0x7f080157));
                }
            }

            
            {
                this$0 = MyEncodeActivity.this;
                super();
            }
        });
        color.setOnClickListener(new android.view.View.OnClickListener() {

            final MyEncodeActivity this$0;

            public void onClick(View view)
            {
                (new AmbilWarnaDialog(MyEncodeActivity.this, 0xff000000, new yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener() {

                    final _cls2 this$1;

                    public void onCancel(AmbilWarnaDialog ambilwarnadialog)
                    {
                    }

                    public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
                    {
                        (new EncodeUtils(_fld0)).changeColor(getIntent().getStringExtra("parametro"), i, image, bmp, _fld0);
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                })).show();
            }


            
            {
                this$0 = MyEncodeActivity.this;
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
