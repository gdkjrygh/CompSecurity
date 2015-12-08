// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.camera.CameraManager;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;
import com.scannerfire.utils.SharedVars;
import com.scannerfire.utils.SoundControl;
import com.scannerfire.utils.Utils;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

public class QrActivity extends CaptureActivity
{

    private static final long SCAN_DELAY_MS = 2000L;
    boolean continuousScan;
    ImageView flash;
    boolean flashOn;
    private Result result;

    public QrActivity()
    {
        flashOn = false;
        continuousScan = true;
    }

    private void playBeep()
    {
        if (SoundControl.isSoundLoaded())
        {
            SoundControl.playSound(0);
        }
    }

    public void handleDecode(Result result1, Bitmap bitmap, float f)
    {
        Object obj;
        obj = result1.getText().toString();
        result = result1;
        SharedVars.getInstance().addSavedCode(this, ((String) (obj)));
        result1 = new Intent(this, com/QRBS/activity/MyResultActivity);
        obj = Utils.makeBundle(result);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        result1.putExtra("picture", bytearrayoutputstream.toByteArray());
        result1.putExtras(((Bundle) (obj)));
        Log.d("", "INIZIO SALVATAGGIO");
        Utils.saveInDB(getApplicationContext(), result);
        Log.d("", "FINE SALVATAGGIO");
        if (Utils.getSoundPref(getApplicationContext()))
        {
            playBeep();
        }
        if (Utils.getVibratePref(getApplicationContext()))
        {
            ((Vibrator)getSystemService("vibrator")).vibrate(60L);
        }
        if (!Utils.getContinuousPref(getApplicationContext())) goto _L2; else goto _L1
_L1:
        restartPreviewAfterDelay(2000L);
        ((TextView)findViewById(0x7f0d005e)).setText(0x7f080153);
_L4:
        return;
_L2:
        if (flashOn)
        {
            turnOff();
        }
        if (Utils.getClipboardPref(getApplicationContext()))
        {
            Utils.copyToClipboard(getApplicationContext(), ((Bundle) (obj)).getString("label"));
        }
        if (!Utils.getAutomaticRedPref(getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_526;
        }
        bitmap = ResultParser.parseResult(result);
        if (result.getBarcodeFormat().toString() != "QR_CODE" || bitmap.getType().toString() != "URI")
        {
            break; /* Loop/switch isn't completed */
        }
        result1 = result.getText();
        if (result1 != null)
        {
            result1 = Utils.URICorrection(result1, "http://");
            if (result1.startsWith("market://details?id="))
            {
                bitmap = result1.split("=");
                try
                {
                    Log.d("", (new StringBuilder("SPLIT 1->")).append(bitmap[0]).append(" SPLIT 2->").append(bitmap[1]).toString());
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(result1)));
                }
                // Misplaced declaration of an exception variable
                catch (Result result1)
                {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://play.google.com/store/apps/details?id=")).append(bitmap[1]).toString())));
                }
                finish();
                return;
            }
            try
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(result1)));
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                Utils.showToastNotification(this, getString(0x7f080157));
                Log.d("", (new StringBuilder("ActivityNotFoundException: url is ->")).append(result1).toString());
            }
            finish();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (bitmap.getType().toString() == "PRODUCT")
        {
            result1 = (new StringBuilder("http://www.google.com/m/products?q=")).append(result.getText()).toString();
            try
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(result1)));
            }
            // Misplaced declaration of an exception variable
            catch (Result result1)
            {
                Utils.showToastNotification(this, getString(0x7f080157));
            }
            finish();
            return;
        }
        startActivity(result1);
        finish();
        return;
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        setTheme(0x7f070076);
        super.onCreate(bundle);
        setContentView(0x7f030018);
        SoundControl.init(getApplicationContext());
        flash = (ImageView)findViewById(0x7f0d005d);
        flash.setOnClickListener(new android.view.View.OnClickListener() {

            final QrActivity this$0;

            public void onClick(View view)
            {
                if (!flashOn)
                {
                    flashOn = true;
                    flash.setImageResource(0x7f0200cb);
                    turnOn();
                    return;
                } else
                {
                    flashOn = false;
                    flash.setImageResource(0x7f0200cc);
                    turnOff();
                    return;
                }
            }

            
            {
                this$0 = QrActivity.this;
                super();
            }
        });
        if (Utils.getContinuousPref(getApplicationContext()))
        {
            bundle = (TextView)findViewById(0x7f0d005e);
            bundle.setVisibility(0);
            bundle.setText(0x7f080153);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0f0006, menu);
        return true;
    }

    public void turnOff()
    {
        getCameraManager().setTorch(false);
    }

    public void turnOn()
    {
        getCameraManager().setTorch(true);
    }
}
