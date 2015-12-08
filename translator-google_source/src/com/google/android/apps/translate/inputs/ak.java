// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.wordlens.NativeBitmapInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class ak extends k
    implements android.content.DialogInterface.OnCancelListener
{

    final Camera2InputPopup a;
    private final ProgressDialog b;

    ak(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
        b = ProgressDialog.show(camera2inputpopup.getContext(), null, camera2inputpopup.getContext().getText(r.msg_img_loading), true, true, this);
    }

    private static int a(Context context, Uri uri)
    {
        try
        {
            context = context.getContentResolver().query(uri, new String[] {
                "orientation"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context == null || context.getCount() != 1)
        {
            return -1;
        } else
        {
            context.moveToFirst();
            return context.getInt(0);
        }
    }

    private transient NativeBitmapInfo a(Uri auri[])
    {
        auri = auri[0];
        Object obj;
        Object obj1;
        int l;
        obj = a.getContext().getContentResolver();
        InputStream inputstream = ((ContentResolver) (obj)).openInputStream(auri);
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        inputstream.close();
        l = a(a.getContext(), ((Uri) (auri)));
        if (l != 90 && l != 270) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        j = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
_L9:
        InputStream inputstream1;
        inputstream1 = ((ContentResolver) (obj)).openInputStream(auri);
        if ((float)Math.max(j, i) <= 1024F)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        float f = Math.max((float)i / 1024F, (float)j / 1024F);
        auri = new android.graphics.BitmapFactory.Options();
        auri.inSampleSize = (int)f;
        auri = BitmapFactory.decodeStream(inputstream1, null, auri);
        j = (int)((float)j / f);
        auri = Bitmap.createScaledBitmap(auri, (int)((float)i / f), j, false);
_L5:
        if ((float)Math.min(auri.getWidth(), auri.getHeight()) >= 256F) goto _L4; else goto _L3
_L3:
        j = (int)Math.max(auri.getWidth(), 256F);
        i = (int)Math.max(auri.getHeight(), 256F);
        obj = Bitmap.createBitmap(j, i, auri.getConfig());
        obj1 = new Canvas(((Bitmap) (obj)));
        j = (j - auri.getWidth()) / 2;
        i = (i - auri.getHeight()) / 2;
        ((Canvas) (obj1)).drawBitmap(auri, j, i, null);
        auri = ((Uri []) (obj));
_L4:
        inputstream1.close();
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        obj = new Matrix();
        ((Matrix) (obj)).postRotate(l);
        auri = Bitmap.createBitmap(auri, 0, 0, auri.getWidth(), auri.getHeight(), ((Matrix) (obj)), true);
        if (auri == null)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        i = auri.getByteCount();
        obj = new NativeBitmapInfo();
        obj.bytesPerPixel = 4;
        obj.height = auri.getHeight();
        obj.width = auri.getWidth();
        inputstream1 = new byte[i];
        auri.copyPixelsToBuffer(ByteBuffer.wrap(inputstream1));
        obj.rawData = inputstream1;
        return ((NativeBitmapInfo) (obj));
_L2:
        i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        j = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        continue; /* Loop/switch isn't completed */
        auri = BitmapFactory.decodeStream(inputstream1);
          goto _L5
        auri;
_L7:
        return null;
        auri;
        continue; /* Loop/switch isn't completed */
        auri;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((Uri[])aobj);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        b.dismiss();
        cancel(true);
        a.onDismiss(null);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (NativeBitmapInfo)obj;
        p.a(b, "CameraGalleryLoader");
        if (obj != null)
        {
            a.show();
            Camera2InputPopup.a(a, Camera2InputPopup.InputUIState.FROZEN);
            if (4 != ((NativeBitmapInfo) (obj)).bytesPerPixel)
            {
                throw new IllegalArgumentException("Was supposed to load a 32RGBA, 4bpp image");
            }
            Camera2InputPopup.a(a, ((NativeBitmapInfo) (obj)).width, ((NativeBitmapInfo) (obj)).height, ((NativeBitmapInfo) (obj)).rawData);
            Camera2InputPopup camera2inputpopup = a;
            if (Camera2InputPopup.f(a))
            {
                obj = Event.WORDLENS_IMPORT_PICKED;
            } else
            {
                obj = Event.PHOTO_IMPORT_PICKED;
            }
            camera2inputpopup.a(((Event) (obj)));
            return;
        } else
        {
            m.a(r.msg_img_load_failed, 0);
            a.onDismiss(null);
            return;
        }
    }
}
