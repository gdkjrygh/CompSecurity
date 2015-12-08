// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.encode;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.zxing.WriterException;
import com.google.zxing.client.android.FinishListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.android.encode:
//            QRCodeEncoder

public final class EncodeActivity extends Activity
{

    private static final int MAX_BARCODE_FILENAME_LENGTH = 24;
    private static final Pattern NOT_ALPHANUMERIC = Pattern.compile("[^A-Za-z0-9]");
    private static final String TAG = com/google/zxing/client/android/encode/EncodeActivity.getSimpleName();
    private static final String USE_VCARD_KEY = "USE_VCARD";
    private QRCodeEncoder qrCodeEncoder;

    public EncodeActivity()
    {
    }

    private static CharSequence makeBarcodeFileName(CharSequence charsequence)
    {
        String s = NOT_ALPHANUMERIC.matcher(charsequence).replaceAll("_");
        charsequence = s;
        if (s.length() > 24)
        {
            charsequence = s.substring(0, 24);
        }
        return charsequence;
    }

    private void share()
    {
        QRCodeEncoder qrcodeencoder = qrCodeEncoder;
        if (qrcodeencoder != null) goto _L2; else goto _L1
_L1:
        Log.w(TAG, "No existing barcode to send?");
_L4:
        return;
_L2:
        Object obj;
        String s;
        Bitmap bitmap;
        s = qrcodeencoder.getContents();
        if (s == null)
        {
            Log.w(TAG, "No existing barcode to send?");
            return;
        }
        try
        {
            bitmap = qrcodeencoder.encodeAsBitmap();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(TAG, ((Throwable) (obj)));
            return;
        }
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        Object obj2;
        File file;
        obj = new File(new File(Environment.getExternalStorageDirectory(), "BarcodeScanner"), "Barcodes");
        if (!((File) (obj)).exists() && !((File) (obj)).mkdirs())
        {
            Log.w(TAG, (new StringBuilder("Couldn't make dir ")).append(obj).toString());
            showErrorMessage(com.google.zxing.client.android.R.string.msg_unmount_usb);
            return;
        }
        file = new File(((File) (obj)), (new StringBuilder()).append(makeBarcodeFileName(s)).append(".png").toString());
        file.delete();
        obj = null;
        obj2 = null;
        Object obj1 = new FileOutputStream(file);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (obj1)));
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        obj = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", (new StringBuilder(String.valueOf(getString(com.google.zxing.client.android.R.string.app_name)))).append(" - ").append(qrcodeencoder.getTitle()).toString());
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", s);
        ((Intent) (obj)).putExtra("android.intent.extra.STREAM", Uri.parse((new StringBuilder("file://")).append(file.getAbsolutePath()).toString()));
        ((Intent) (obj)).setType("image/png");
        ((Intent) (obj)).addFlags(0x80000);
        startActivity(Intent.createChooser(((Intent) (obj)), null));
        return;
        obj;
        obj1 = obj2;
        obj2 = obj;
_L8:
        obj = obj1;
        Log.w(TAG, (new StringBuilder("Couldn't access file ")).append(file).append(" due to ").append(obj2).toString());
        obj = obj1;
        showErrorMessage(com.google.zxing.client.android.R.string.msg_unmount_usb);
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        try
        {
            ((FileOutputStream) (obj1)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
_L7:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
          goto _L8
    }

    private void showErrorMessage(int i)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(i);
        builder.setPositiveButton(com.google.zxing.client.android.R.string.button_ok, new FinishListener(this));
        builder.setOnCancelListener(new FinishListener(this));
        builder.show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null)
        {
            finish();
            return;
        }
        bundle = bundle.getAction();
        if ("com.google.zxing.client.android.ENCODE".equals(bundle) || "android.intent.action.SEND".equals(bundle))
        {
            setContentView(com.google.zxing.client.android.R.layout.encode);
            return;
        } else
        {
            finish();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.google.zxing.client.android.R.menu.encode, menu);
        MenuItem menuitem;
        Intent intent;
        int i;
        if (qrCodeEncoder != null && qrCodeEncoder.isUseVCard())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = com.google.zxing.client.android.R.string.menu_encode_mecard;
        } else
        {
            i = com.google.zxing.client.android.R.string.menu_encode_vcard;
        }
        menuitem = menu.findItem(com.google.zxing.client.android.R.id.menu_encode);
        menuitem.setTitle(i);
        intent = getIntent();
        if (intent != null)
        {
            menuitem.setVisible("CONTACT_TYPE".equals(intent.getStringExtra("ENCODE_TYPE")));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        if (menuitem.getItemId() == com.google.zxing.client.android.R.id.menu_share)
        {
            share();
            return true;
        }
        if (menuitem.getItemId() == com.google.zxing.client.android.R.id.menu_encode)
        {
            menuitem = getIntent();
            if (menuitem == null)
            {
                return false;
            }
            if (!qrCodeEncoder.isUseVCard())
            {
                flag = true;
            }
            menuitem.putExtra("USE_VCARD", flag);
            startActivity(menuitem);
            finish();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onResume()
    {
        Object obj;
        int i;
        super.onResume();
        obj = ((WindowManager)getSystemService("window")).getDefaultDisplay();
        i = ((Display) (obj)).getWidth();
        int j = ((Display) (obj)).getHeight();
        if (i >= j)
        {
            i = j;
        }
        i = (i * 7) / 8;
        obj = getIntent();
        if (obj == null)
        {
            return;
        }
        Object obj1;
        qrCodeEncoder = new QRCodeEncoder(this, ((Intent) (obj)), i, ((Intent) (obj)).getBooleanExtra("USE_VCARD", false));
        obj1 = qrCodeEncoder.encodeAsBitmap();
        if (obj1 == null)
        {
            try
            {
                Log.w(TAG, "Could not encode barcode");
                showErrorMessage(com.google.zxing.client.android.R.string.msg_encode_contents_failed);
                qrCodeEncoder = null;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w(TAG, "Could not encode barcode", ((Throwable) (obj)));
            }
            showErrorMessage(com.google.zxing.client.android.R.string.msg_encode_contents_failed);
            qrCodeEncoder = null;
            return;
        }
        ((ImageView)findViewById(com.google.zxing.client.android.R.id.image_view)).setImageBitmap(((Bitmap) (obj1)));
        obj1 = (TextView)findViewById(com.google.zxing.client.android.R.id.contents_text_view);
        if (((Intent) (obj)).getBooleanExtra("ENCODE_SHOW_CONTENTS", true))
        {
            ((TextView) (obj1)).setText(qrCodeEncoder.getDisplayContents());
            setTitle(qrCodeEncoder.getTitle());
            return;
        }
        ((TextView) (obj1)).setText("");
        setTitle("");
        return;
    }

}
