// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.os.Message;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.rf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            r, BaseShareActivity

final class m
    implements Runnable
{

    private WeakReference a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;

    private m(r r1, m m1)
    {
        this(r1, m1.b, m1.e, m1.d, m1.f >> 1, m1.g >> 1, m1.h + 1);
    }

    m(r r1, m m1, byte byte0)
    {
        this(r1, m1);
    }

    m(r r1, String s, String s1, String s2, int i, int j)
    {
        this(r1, s, s1, s2, i, j, 1);
    }

    private m(r r1, String s, String s1, String s2, int i, int j, int k)
    {
        a = new WeakReference(r1);
        b = s;
        d = s2;
        e = s1;
        c = (new StringBuilder()).append(e).append("/").append(s2).toString();
        f = i;
        g = j;
        h = k;
    }

    public final void run()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj8;
        Object obj9;
        obj2 = null;
        obj4 = null;
        obj3 = null;
        obj9 = null;
        obj8 = null;
        obj1 = null;
        if (a != null && a.get() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        int i;
        s = b;
        if (b == null || c == null || f <= 0 || g <= 0)
        {
            break MISSING_BLOCK_LABEL_1765;
        }
        i = Math.max(f, g);
        Object obj;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPurgeable = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj.inSampleSize = h;
        obj = BitmapFactory.decodeFile(b, ((android.graphics.BitmapFactory.Options) (obj)));
        Object obj5;
        Object obj10;
        obj10 = new RectF();
        obj10.left = (i - f) / 2;
        obj10.top = (i - g) / 2;
        obj10.right = ((RectF) (obj10)).left + (float)f;
        obj10.bottom = ((RectF) (obj10)).top + (float)g;
        rf.a();
        obj5 = rf.a(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        Object obj6;
        Object obj7;
        obj2 = obj5;
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj5 = new Canvas(((Bitmap) (obj2)));
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((Canvas) (obj5)).save();
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((Canvas) (obj5)).restore();
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((Canvas) (obj5)).drawColor(-1);
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((Canvas) (obj5)).drawBitmap(((Bitmap) (obj)), null, ((RectF) (obj10)), null);
        if (obj == obj2)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((Bitmap) (obj)).recycle();
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        if (((Bitmap) (obj2)).hasAlpha())
        {
            i = 1;
        } else
        {
            i = 2;
        }
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj5 = new File(c);
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        if (!((File) (obj5)).isFile()) goto _L4; else goto _L3
_L3:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        if (((File) (obj5)).canWrite()) goto _L5; else goto _L4
_L4:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj10 = (r)a.get();
        byte byte0;
label0:
        {
            if (obj10 != null)
            {
                break label0;
            }
            Object obj11;
            boolean flag;
            if (obj != null && !((Bitmap) (obj)).isRecycled())
            {
                try
                {
                    ((Bitmap) (obj)).recycle();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
            {
                try
                {
                    ((Bitmap) (obj2)).recycle();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
            }
        }
          goto _L1
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L7; else goto _L6
_L6:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj11 = r.b(((r) (obj10)));
        if (obj11 != null) goto _L9; else goto _L8
_L8:
        obj8 = null;
_L10:
        if (obj8 != null)
        {
            break MISSING_BLOCK_LABEL_622;
        }
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj2)).recycle();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
          goto _L1
_L9:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj8 = (BaseShareActivity)r.b(((r) (obj10))).get();
          goto _L10
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = (new ae(((Context) (obj8)).getContentResolver(), ((File) (obj5)))).b();
        if (obj4 != null) goto _L12; else goto _L11
_L11:
        obj1 = obj4;
        obj3 = obj4;
        obj7 = obj2;
        obj6 = obj;
        obj5 = obj4;
        throw new IOException("4.4 IOException");
        obj9;
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        ((Exception) (obj9)).printStackTrace();
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        obj11 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(((Context) (obj8)).getString(0x7f07002e)).toString();
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        obj9 = new File(((String) (obj11)), d);
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj5 = obj1;
        ((File) (obj9)).createNewFile();
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        ap.a(((Context) (obj8)), ((String) (obj11)));
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        obj1 = new FileOutputStream(((File) (obj9)));
        obj5 = obj9;
_L19:
        if (i != 1) goto _L14; else goto _L13
_L13:
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj8 = android.graphics.Bitmap.CompressFormat.PNG;
_L21:
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        if (!((Bitmap) (obj2)).compress(((android.graphics.Bitmap.CompressFormat) (obj8)), 100, ((OutputStream) (obj1)))) goto _L16; else goto _L15
_L15:
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = ((File) (obj5)).getAbsolutePath();
        obj3 = obj5;
_L28:
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj2)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 == null) goto _L18; else goto _L17
_L17:
        ((OutputStream) (obj1)).close();
        flag = true;
        obj = obj3;
        byte0 = i;
        i = ((flag) ? 1 : 0);
_L22:
        obj1 = (r)a.get();
        if (obj1 != null && !r.a(((r) (obj1))))
        {
            if (i != 0 && r.b(((r) (obj1))) != null)
            {
                obj2 = (Context)r.b(((r) (obj1))).get();
                if (obj2 != null)
                {
                    try
                    {
                        ((Context) (obj2)).sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(((String) (obj))))));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj2) { }
                }
            }
            ((r) (obj1)).obtainMessage(52227, byte0, 0, obj).sendToTarget();
            return;
        }
          goto _L1
_L12:
        obj1 = obj4;
          goto _L19
        obj8;
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        ((Exception) (obj8)).printStackTrace();
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj5 = obj1;
        ((r) (obj10)).obtainMessage(52227, i, 0, s).sendToTarget();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj2)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
            return;
        }
          goto _L1
_L7:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        ((File) (obj5)).createNewFile();
_L20:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj1 = new FileOutputStream(((File) (obj5)));
          goto _L19
        obj1;
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((Exception) (obj1)).printStackTrace();
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        ((r) (obj10)).obtainMessage(52227, i, 0, s).sendToTarget();
          goto _L20
        obj1;
        obj1 = null;
_L27:
        a.get();
        obj3 = (r)a.get();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1319;
        }
        if (!r.a(((r) (obj3))))
        {
            ((r) (obj3)).sendMessageDelayed(((r) (obj3)).obtainMessage(52228, this), 100L);
        }
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj2)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
            return;
        }
          goto _L1
_L5:
        obj3 = obj9;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj8;
        obj1 = new FileOutputStream(((File) (obj5)));
          goto _L19
_L14:
        obj3 = obj1;
        obj7 = obj2;
        obj6 = obj;
        obj4 = obj1;
        obj8 = android.graphics.Bitmap.CompressFormat.JPEG;
          goto _L21
        obj;
        ((IOException) (obj)).printStackTrace();
        flag = true;
        byte0 = i;
        obj = obj3;
        i = ((flag) ? 1 : 0);
          goto _L22
        obj;
        obj2 = null;
        obj = null;
_L26:
        obj3 = obj4;
        obj7 = obj2;
        obj6 = obj;
        a.get();
        obj3 = obj4;
        obj7 = obj2;
        obj6 = obj;
        obj1 = (r)a.get();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1524;
        }
        obj3 = obj4;
        obj7 = obj2;
        obj6 = obj;
        if (r.a(((r) (obj1))))
        {
            break MISSING_BLOCK_LABEL_1524;
        }
        obj3 = obj4;
        obj7 = obj2;
        obj6 = obj;
        ((r) (obj1)).sendMessageDelayed(((r) (obj1)).obtainMessage(52228, this), 100L);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj2)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj4 == null) goto _L1; else goto _L23
_L23:
        try
        {
            ((OutputStream) (obj4)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        obj2 = null;
        obj = null;
_L25:
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            try
            {
                ((Bitmap) (obj2)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((OutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = obj7;
        obj = obj6;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj3 = obj1;
        obj1 = exception;
        if (true) goto _L25; else goto _L24
_L24:
        obj1;
        obj2 = null;
          goto _L26
        obj1;
          goto _L26
        obj;
        obj = null;
        obj1 = null;
          goto _L27
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        outofmemoryerror = null;
          goto _L27
        outofmemoryerror;
        outofmemoryerror = ((OutOfMemoryError) (obj5));
          goto _L27
        obj3;
          goto _L27
_L18:
        boolean flag1 = true;
        byte0 = i;
        obj = obj3;
        i = ((flag1) ? 1 : 0);
          goto _L22
_L16:
        obj3 = s;
          goto _L28
        i = 0;
        obj = s;
        byte0 = -1;
          goto _L22
    }
}
