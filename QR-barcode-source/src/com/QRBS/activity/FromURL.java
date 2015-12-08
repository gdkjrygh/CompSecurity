// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.QRBS.camera.RGBLuminanceSource;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.common.HybridBinarizer;
import com.scannerfire.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FromURL extends SherlockActivity
{
    private class DecodeTask extends AsyncTask
    {

        final FromURL this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            String s;
            as = getCorrectUrl(editUrl);
            boolean flag;
            try
            {
                flag = utils.checkConnectivity(app);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return "problem";
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return "problem";
            }
            if (!flag)
            {
                return "noConn";
            }
            s = (new URL(as)).openConnection().getHeaderField("Content-Type");
            if (s == null)
            {
                return "noImage";
            }
            if (!s.startsWith("image/"))
            {
                return "noImage";
            } else
            {
                getBitmapFromURL(as);
                return "OK";
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            utils.clearScreen();
            if (s.equals("OK"))
            {
                qrImage.setImageBitmap(myBitmap);
                if (myBitmap.getHeight() > 2024 || myBitmap.getWidth() > 2024)
                {
                    Utils.showToastNotification(app, getString(0x7f08010e));
                }
                decodeBitmap(myBitmap);
            } else
            {
                if (s.equals("noImage"))
                {
                    Utils.showToastNotification(app, getString(0x7f08010f));
                    return;
                }
                if (s.equals("noConn"))
                {
                    Utils.showToastNotification(app, getString(0x7f0800ff));
                    return;
                }
                if (s.equals("problem"))
                {
                    Utils.showToastNotification(app, getString(0x7f080110));
                    return;
                }
            }
        }

        private DecodeTask()
        {
            this$0 = FromURL.this;
            super();
        }

        DecodeTask(DecodeTask decodetask)
        {
            this();
        }
    }


    private SherlockActivity app;
    private EditText editUrl;
    private Bitmap myBitmap;
    private ImageView qrImage;
    private Utils utils;

    public FromURL()
    {
    }

    private void decodeBitmap(Bitmap bitmap)
    {
        Object obj;
        Object obj1;
        obj = new BinaryBitmap(new HybridBinarizer(new RGBLuminanceSource(bitmap)));
        obj1 = new MultiFormatReader();
        Log.d("", "dentro try");
        obj = ((Reader) (obj1)).decode(((BinaryBitmap) (obj)));
        if (!Utils.getAutomaticRedPref(getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj1 = ResultParser.parseResult(((Result) (obj)));
        if (((Result) (obj)).getBarcodeFormat().toString() != "QR_CODE" || ((ParsedResult) (obj1)).getType().toString() != "URI")
        {
            break MISSING_BLOCK_LABEL_138;
        }
        bitmap = ((Result) (obj)).getText();
        Utils.saveInDB(this, ((Result) (obj)));
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bitmap)));
_L1:
        finish();
        return;
        bitmap;
        Utils.showToastNotification(this, getString(0x7f080157));
          goto _L1
        if (((ParsedResult) (obj1)).getType().toString() != "PRODUCT")
        {
            break MISSING_BLOCK_LABEL_223;
        }
        bitmap = (new StringBuilder("http://www.google.com/m/products?q=")).append(((Result) (obj)).getText()).toString();
        Utils.saveInDB(this, ((Result) (obj)));
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bitmap)));
_L2:
        finish();
        return;
        bitmap;
        Utils.showToastNotification(this, getString(0x7f080157));
          goto _L2
        try
        {
            Utils.launchResultActivity(this, Utils.makeBundle(((Result) (obj))), bitmap);
            Utils.saveInDB(getApplication(), ((Result) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Utils.showToastNotification(this, getString(0x7f080111));
        }
        return;
    }

    public Uri getBitmapFromURL(String s)
    {
        Log.d("", "dentro getBitmapFromUrl");
        try
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
            s.setDoInput(true);
            s.connect();
            Log.d("", "check");
            myBitmap = BitmapFactory.decodeStream(s.getInputStream());
            s = new ByteArrayOutputStream();
            myBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 40, s);
            s = new File("data/data/com.ScannerPro.SCAN/downloadCache");
            if (!s.exists())
            {
                s.mkdir();
            }
            s = new File((new StringBuilder()).append(s).append(File.separator).append("test.jpg").toString());
            s.createNewFile();
            Log.d("", "check4");
            s = Uri.fromFile(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public String getCorrectUrl(EditText edittext)
    {
        String s = edittext.getText().toString();
        edittext = s;
        if (!s.startsWith("http"))
        {
            edittext = (new StringBuilder("http://")).append(s).toString();
        }
        return edittext;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030041);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d3);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        utils = new Utils();
        app = this;
        editUrl = (EditText)findViewById(0x7f0d00e7);
        qrImage = (ImageView)findViewById(0x7f0d00e8);
        ((Button)findViewById(0x7f0d00e6)).setOnClickListener(new android.view.View.OnClickListener() {

            final FromURL this$0;

            public void onClick(View view)
            {
                if (Utils.getVibratePref(getBaseContext()))
                {
                    view = utils.getVibrator(getBaseContext());
                    if (view != null)
                    {
                        view.vibrate(60L);
                    }
                }
                if (editUrl.getText().toString().equals(""))
                {
                    Utils.showToastNotification(app, getString(0x7f08010d));
                    return;
                } else
                {
                    utils.showProgress(FromURL.this, "", getString(0x7f0800f8));
                    (new DecodeTask(null)).execute(new String[0]);
                    return;
                }
            }

            
            {
                this$0 = FromURL.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }

    protected void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
    }






}
