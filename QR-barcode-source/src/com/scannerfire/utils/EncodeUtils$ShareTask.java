// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.EnumMap;

// Referenced classes of package com.scannerfire.utils:
//            EncodeUtils, Utils

private class <init> extends AsyncTask
{

    final EncodeUtils this$0;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        Object obj = new QRCodeWriter();
        Object obj1;
        int l;
        int i1;
        obj1 = new EnumMap(com/google/zxing/EncodeHintType);
        ((EnumMap) (obj1)).put(EncodeHintType.CHARACTER_SET, "UTF-8");
        obj1 = ((QRCodeWriter) (obj)).encode(as[0], BarcodeFormat.QR_CODE, 350, 350, ((java.util.Map) (obj1)));
        l = ((BitMatrix) (obj1)).getWidth();
        i1 = ((BitMatrix) (obj1)).getHeight();
        obj = new int[l * i1];
        int i = 0;
_L2:
        if (i < i1)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        as = as[0];
        obj1 = Bitmap.createBitmap(l, i1, android.graphics._fld8);
        ((Bitmap) (obj1)).setPixels(((int []) (obj)), 0, l, 0, 0, l, i1);
        obj = EncodeUtils.getImageUri(activity.getApplicationContext(), ((Bitmap) (obj1)));
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Utils.showToastNotification(activity, "Error");
        return "ERROR";
        int j = 0;
_L3:
label0:
        {
            if (j < l)
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
        int k;
        if (((BitMatrix) (obj1)).get(j, i))
        {
            k = 0xff000000;
        } else
        {
            k = -1;
        }
        break MISSING_BLOCK_LABEL_298;
_L1:
        try
        {
            obj1 = new Intent();
            ((Intent) (obj1)).setAction("android.intent.action.SEND");
            ((Intent) (obj1)).putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
            ((Intent) (obj1)).putExtra("android.intent.extra.SUBJECT", (new StringBuilder("Powered by ")).append(activity.getString(0x7f0800b1)).append(" - http://goo.gl/pTAlm4").toString());
            ((Intent) (obj1)).putExtra("android.intent.extra.EMAIL", as);
            ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", as);
            ((Intent) (obj1)).setType("image/jpeg");
            activity.startActivity(Intent.createChooser(((Intent) (obj1)), activity.getString(0x7f080112)));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace();
        }
        return "OK";
        obj[i * l + j] = k;
        j++;
          goto _L3
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        prog.dismiss();
    }

    protected void onPreExecute()
    {
    }

    protected volatile transient void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Void[])aobj);
    }

    protected transient void onProgressUpdate(Void avoid[])
    {
    }

    private ()
    {
        this$0 = EncodeUtils.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
