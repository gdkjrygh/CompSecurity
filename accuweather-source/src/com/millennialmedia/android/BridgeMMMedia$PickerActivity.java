// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.millennialmedia.android:
//            MMBaseActivity, BridgeMMMedia, MMLog

static class hasRequestedPic extends MMBaseActivity
{

    private Uri fileUri;
    boolean hasRequestedPic;

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (intent == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj3;
        Object obj4;
        Object obj5;
        File file;
        Object obj6;
        Object obj7;
        obj6 = null;
        obj5 = null;
        obj = null;
        obj4 = null;
        obj7 = null;
        obj3 = null;
        file = null;
        Object obj2 = intent.getData();
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        if (intent.getExtras() == null) goto _L2; else goto _L5
_L5:
        obj3 = (Bitmap)intent.getExtras().get("data");
        intent = obj;
        obj2 = new File(getIntent().getData().getPath());
        intent = obj;
        obj4 = new ByteArrayOutputStream();
        intent = obj;
        ((Bitmap) (obj3)).compress(android.graphics.erActivity.getIntent, 0, ((OutputStream) (obj4)));
        intent = obj;
        obj3 = new ByteArrayInputStream(((ByteArrayOutputStream) (obj4)).toByteArray());
        intent = obj;
        obj1 = new FileOutputStream(((File) (obj2)));
        intent = new byte[1024];
_L8:
        i = ((ByteArrayInputStream) (obj3)).read(intent);
        if (i <= 0) goto _L7; else goto _L6
_L6:
        ((OutputStream) (obj1)).write(intent, 0, i);
          goto _L8
        obj2;
_L35:
        intent = ((Intent) (obj1));
        MMLog.e("BridgeMMMedia", "Problem getting bitmap from data", ((Throwable) (obj2)));
        if (true) goto _L10; else goto _L9
_L9:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
          goto _L11
_L10:
        if (obj1 == null) goto _L2; else goto _L12
_L12:
        ((OutputStream) (obj1)).close();
_L2:
        synchronized (BridgeMMMedia.access$000())
        {
            BridgeMMMedia.access$000().notify();
        }
        finish();
        return;
_L7:
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            break MISSING_BLOCK_LABEL_253;
        }
        if (obj1 == null) goto _L2; else goto _L13
_L13:
        ((OutputStream) (obj1)).close();
          goto _L2
        MMLog.e("BridgeMMMedia", "Error closing file", intent);
          goto _L2
_L11:
        MMLog.e("BridgeMMMedia", "Error closing file", intent);
          goto _L2
_L14:
        MMLog.e("BridgeMMMedia", "Error with picture: ", intent);
          goto _L2
        obj2;
        obj1 = intent;
        intent = ((Intent) (obj2));
_L33:
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            break MISSING_BLOCK_LABEL_322;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        ((OutputStream) (obj1)).close();
_L15:
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
          goto _L14
        MMLog.e("BridgeMMMedia", "Error closing file", ((Throwable) (obj1)));
          goto _L15
_L4:
        if (obj2 == null) goto _L2; else goto _L16
_L16:
        intent = getContentResolver();
        if (intent == null) goto _L2; else goto _L17
_L17:
        obj1 = intent.query(((Uri) (obj2)), new String[] {
            "_data"
        }, null, null, null);
        if (obj1 == null) goto _L2; else goto _L18
_L18:
        i = ((Cursor) (obj1)).getColumnIndex("_data");
        if (i == -1) goto _L2; else goto _L19
_L19:
        ((Cursor) (obj1)).moveToFirst();
        intent = new File(((Cursor) (obj1)).getString(i));
        ((Cursor) (obj1)).close();
        obj1 = obj6;
        obj2 = obj7;
        file = new File(getIntent().getData().getPath());
        obj1 = obj6;
        obj2 = obj7;
        intent = new FileInputStream(intent);
        obj1 = new FileOutputStream(file);
        obj2 = new byte[1024];
_L22:
        i = intent.read(((byte []) (obj2)));
        if (i <= 0) goto _L21; else goto _L20
_L20:
        ((OutputStream) (obj1)).write(((byte []) (obj2)), 0, i);
          goto _L22
        obj3;
        obj4 = obj1;
_L32:
        obj1 = intent;
        obj2 = obj4;
        MMLog.e("BridgeMMMedia", "Error copying image", ((Throwable) (obj3)));
        if (intent == null) goto _L24; else goto _L23
_L23:
        intent.close();
_L24:
        if (obj4 == null) goto _L2; else goto _L25
_L25:
        ((OutputStream) (obj4)).close();
          goto _L2
        intent;
        MMLog.e("BridgeMMMedia", "Error closing file", intent);
          goto _L2
_L21:
        if (intent == null) goto _L27; else goto _L26
_L26:
        intent.close();
_L27:
        if (obj1 == null) goto _L2; else goto _L28
_L28:
        ((OutputStream) (obj1)).close();
          goto _L2
        intent;
        MMLog.e("BridgeMMMedia", "Error closing file", intent);
          goto _L2
        intent;
_L31:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_603;
        }
        ((InputStream) (obj1)).close();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_613;
        }
        ((OutputStream) (obj2)).close();
_L30:
        throw intent;
        obj1;
        MMLog.e("BridgeMMMedia", "Error closing file", ((Throwable) (obj1)));
        if (true) goto _L30; else goto _L29
_L29:
        obj1;
        intent;
        JVM INSTR monitorexit ;
        throw obj1;
        intent;
          goto _L14
        intent;
          goto _L14
        obj2;
        obj1 = intent;
        intent = ((Intent) (obj2));
        obj2 = obj3;
          goto _L31
        obj3;
        obj2 = obj1;
        obj1 = intent;
        intent = ((Intent) (obj3));
          goto _L31
        obj3;
        intent = obj5;
          goto _L32
        obj3;
          goto _L32
        intent;
          goto _L33
        obj2;
        obj1 = file;
        if (true) goto _L35; else goto _L34
_L34:
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            if (getLastNonConfigurationInstance() != null)
            {
                hasRequestedPic = ((Bundle)getLastNonConfigurationInstance()).getBoolean("hasRequestedPic");
            }
            if (!hasRequestedPic)
            {
                if (!getIntent().getStringExtra("type").equalsIgnoreCase("Camera"))
                {
                    break label0;
                }
                bundle = new Intent("android.media.action.IMAGE_CAPTURE");
                fileUri = getIntent().getData();
                bundle.putExtra("return-data", true);
                hasRequestedPic = true;
                startActivityForResult(bundle, 0);
            }
            return;
        }
        bundle = new Intent();
        bundle.setType("image/*");
        bundle.setAction("android.intent.action.GET_CONTENT");
        hasRequestedPic = true;
        startActivityForResult(bundle, 0);
    }

    public Object onRetainNonConfigurationInstance()
    {
        super.onRetainNonConfigurationInstance();
        Bundle bundle = new Bundle();
        bundle.putBoolean("hasRequestedPic", hasRequestedPic);
        return bundle;
    }

    ()
    {
        hasRequestedPic = false;
    }
}
