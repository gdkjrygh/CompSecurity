// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.EnterpriseMobileBanking.AppHelper;
import com.capitalone.mobile.banking.session.TimeoutBroadcastReceiver;

public class MiSnapPreviewActivity extends Activity
{
    private class OnRetakeClickListener
        implements android.view.View.OnClickListener
    {

        final MiSnapPreviewActivity this$0;

        public void onClick(View view)
        {
            finishRetakeOrBackPressed();
        }

        private OnRetakeClickListener()
        {
            this$0 = MiSnapPreviewActivity.this;
            super();
        }

    }

    private class OnUseClickListener
        implements android.view.View.OnClickListener
    {

        final MiSnapPreviewActivity this$0;

        public void onClick(View view)
        {
            setResult(0x631198, getIntent());
            finish();
        }

        private OnUseClickListener()
        {
            this$0 = MiSnapPreviewActivity.this;
            super();
        }

    }


    public static final int RETAKE_RESPONSE_CODE = 0x845fed;
    public static final String TAG = "MiSnapPreviewActivity";
    public static final int USE_RESPONSE_CODE = 0x631198;
    private RelativeLayout outerLayout;
    private Button retakeButton;
    private Button useButton;

    public MiSnapPreviewActivity()
    {
        outerLayout = null;
        useButton = null;
        retakeButton = null;
    }

    private Bitmap decodeByteArrayMemCheck(byte abyte0[], int i, int j, android.graphics.BitmapFactory.Options options)
    {
        try
        {
            abyte0 = BitmapFactory.decodeByteArray(abyte0, i, j, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f09014c)).setMessage(getString(0x7f09014e)).setCancelable(false).setNeutralButton("OK", new android.content.DialogInterface.OnClickListener() {

                final MiSnapPreviewActivity this$0;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    finish();
                }

            
            {
                this$0 = MiSnapPreviewActivity.this;
                super();
            }
            }).show();
            return null;
        }
        return abyte0;
    }

    private void finishRetakeOrBackPressed()
    {
        setResult(0x845fed, getIntent());
        finish();
    }

    public void onBackPressed()
    {
        finishRetakeOrBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f03001b);
        setRequestedOrientation(0);
        outerLayout = (RelativeLayout)findViewById(0x7f0800b7);
        useButton = (Button)findViewById(0x7f0800bb);
        retakeButton = (Button)findViewById(0x7f0800ba);
        useButton.setOnClickListener(new OnUseClickListener());
        retakeButton.setOnClickListener(new OnRetakeClickListener());
        bundle = getIntent().getByteArrayExtra("com.miteksystems.misnap.PICTURE");
        if (bundle != null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inTempStorage = new byte[16384];
            bundle = decodeByteArrayMemCheck(bundle, 0, bundle.length, options);
            bundle = new BitmapDrawable(getResources(), bundle);
            outerLayout.setBackgroundDrawable(bundle);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!AppHelper.isAuthenticated())
        {
            sendBroadcast(new Intent(this, com/capitalone/mobile/banking/session/TimeoutBroadcastReceiver));
        }
    }

}
