// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.QRBS.activity.MyEncodeActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.EnumMap;

// Referenced classes of package com.scannerfire.utils:
//            EncodeUtils

private class activity extends AsyncTask
{

    MyEncodeActivity activity;
    Bitmap bmp;
    ImageView image;
    int newColor;
    final EncodeUtils this$0;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        QRCodeWriter qrcodewriter = new QRCodeWriter();
        int ai[];
        int l;
        int i1;
        EnumMap enummap = new EnumMap(com/google/zxing/EncodeHintType);
        enummap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        as = qrcodewriter.encode(as[0], BarcodeFormat.QR_CODE, 350, 350, enummap);
        l = as.getWidth();
        i1 = as.getHeight();
        ai = new int[l * i1];
        int i = 0;
_L1:
        if (i >= i1)
        {
            int j;
            int k;
            try
            {
                bmp = Bitmap.createBitmap(l, i1, android.graphics.Task.bmp);
                bmp.setPixels(ai, 0, l, 0, 0, l, i1);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                as.printStackTrace();
            }
            return "OK";
        }
        j = 0;
label0:
        {
            if (j < l)
            {
                break label0;
            }
            i++;
        }
          goto _L1
        if (!as.get(j, i))
        {
            break MISSING_BLOCK_LABEL_167;
        }
        k = newColor;
_L3:
        ai[i * l + j] = k;
        j++;
        break MISSING_BLOCK_LABEL_113;
        k = -1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        prog.dismiss();
        image.setImageBitmap(bmp);
        activity.changeBmp(bmp);
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

    protected (int i, ImageView imageview, MyEncodeActivity myencodeactivity)
    {
        this$0 = EncodeUtils.this;
        super();
        newColor = i;
        image = imageview;
        activity = myencodeactivity;
    }
}
