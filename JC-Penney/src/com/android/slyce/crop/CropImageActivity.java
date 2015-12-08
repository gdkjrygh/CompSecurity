// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.android.a.d;
import com.android.a.e;
import com.android.slyce.k.h;
import java.io.ByteArrayOutputStream;
import java.io.File;

// Referenced classes of package com.android.slyce.crop:
//            u, d, l, i, 
//            y, x, CropImageView, j, 
//            n, f, g, h, 
//            a, p

public class CropImageActivity extends u
{

    boolean a;
    boolean b;
    n c;
    Runnable d;
    private android.graphics.Bitmap.CompressFormat e;
    private Uri f;
    private int g;
    private int h;
    private boolean i;
    private final Handler j = new Handler();
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private CropImageView p;
    private ContentResolver q;
    private Bitmap r;
    private final com.android.slyce.crop.d s = new com.android.slyce.crop.d();
    private p t;
    private final int u = 90;
    private int v;

    public CropImageActivity()
    {
        e = android.graphics.Bitmap.CompressFormat.JPEG;
        f = null;
        i = false;
        n = true;
        o = true;
        v = 0;
        d = new l(this);
    }

    public static int a()
    {
        float f1;
        int i1;
        try
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().toString());
            f1 = statfs.getAvailableBlocks();
            i1 = statfs.getBlockSize();
        }
        catch (Exception exception)
        {
            return -2;
        }
        return (int)((f1 * (float)i1) / 400000F);
    }

    static Bitmap a(CropImageActivity cropimageactivity, Bitmap bitmap)
    {
        cropimageactivity.r = bitmap;
        return bitmap;
    }

    public static void a(Activity activity)
    {
        a(activity, a());
    }

    public static void a(Activity activity, int i1)
    {
        String s1 = null;
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        if (Environment.getExternalStorageState() == "checking")
        {
            s1 = "Preparing card";
        } else
        {
            s1 = "No storage card";
        }
_L4:
        if (s1 != null)
        {
            Toast.makeText(activity, s1, 1).show();
        }
        return;
_L2:
        if (i1 < 1)
        {
            s1 = "Not enough space";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(CropImageActivity cropimageactivity)
    {
        cropimageactivity.d();
    }

    static Bitmap b(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.r;
    }

    private void b()
    {
        MotionEvent motionevent = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis() + 100L, 1, 100F, 100F, 0);
        (new Handler()).postDelayed(new i(this, motionevent), 15L);
    }

    static CropImageView c(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.p;
    }

    private void c()
    {
        if (isFinishing())
        {
            return;
        }
        if (v != 0)
        {
            r = y.a(r, v);
            x x1 = new x(r);
            p.a(x1, true);
        } else
        {
            p.a(r, true);
        }
        y.a(this, null, "Please wait\u2026", new j(this), j);
    }

    private void d()
    {
        while (b || c == null) 
        {
            return;
        }
        b = true;
        Rect rect = c.b();
        int i1 = rect.width();
        int k1 = rect.height();
        Object obj;
        Object obj1;
        Rect rect1;
        if (i)
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            obj = android.graphics.Bitmap.Config.RGB_565;
        }
        obj1 = Bitmap.createBitmap(i1, k1, ((android.graphics.Bitmap.Config) (obj)));
        obj = new Canvas(((Bitmap) (obj1)));
        rect1 = new Rect(0, 0, i1, k1);
        ((Canvas) (obj)).drawBitmap(r, rect, rect1, null);
        if (i)
        {
            obj = new Canvas(((Bitmap) (obj1)));
            Path path = new Path();
            path.addCircle((float)i1 / 2.0F, (float)k1 / 2.0F, (float)i1 / 2.0F, android.graphics.Path.Direction.CW);
            ((Canvas) (obj)).clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            ((Canvas) (obj)).drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        }
        if (k != 0 && l != 0)
        {
            if (m)
            {
                Bitmap bitmap = y.a(new Matrix(), ((Bitmap) (obj1)), k, l, n);
                obj = bitmap;
                if (obj1 != bitmap)
                {
                    ((Bitmap) (obj1)).recycle();
                    obj = bitmap;
                }
            } else
            {
                obj = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(((Bitmap) (obj)));
                Rect rect2 = c.b();
                Rect rect3 = new Rect(0, 0, k, l);
                int j1 = (rect2.width() - rect3.width()) / 2;
                int l1 = (rect2.height() - rect3.height()) / 2;
                rect2.inset(Math.max(0, j1), Math.max(0, l1));
                rect3.inset(Math.max(0, -j1), Math.max(0, -l1));
                canvas.drawBitmap(r, rect2, rect3, null);
                ((Bitmap) (obj1)).recycle();
            }
        } else
        {
            obj = obj1;
        }
        getIntent().getExtras();
        obj1 = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, ((java.io.OutputStream) (obj1)));
        obj = new Bundle();
        ((Bundle) (obj)).putByteArray("data", ((ByteArrayOutputStream) (obj1)).toByteArray());
        setResult(-1, (new Intent()).setAction("inline-data").putExtras(((Bundle) (obj))));
        finish();
    }

    static void d(CropImageActivity cropimageactivity)
    {
        cropimageactivity.b();
    }

    static p e(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.t;
    }

    static Handler f(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.j;
    }

    static boolean g(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.i;
    }

    static int h(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.g;
    }

    static int i(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.h;
    }

    static boolean j(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.o;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        q = getContentResolver();
        requestWindowFeature(1);
        setContentView(e.activity_crop_image);
        p = (CropImageView)findViewById(d.image);
        a(this);
        bundle = getIntent().getExtras();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        if (bundle.getString("circleCrop") != null)
        {
            i = true;
            g = 1;
            h = 1;
        }
        r = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("byteArrayBitmap"), 0, getIntent().getByteArrayExtra("byteArrayBitmap").length);
        g = bundle.getInt("aspectX");
        h = bundle.getInt("aspectY");
        k = bundle.getInt("outputX");
        l = bundle.getInt("outputY");
        m = bundle.getBoolean("scale", true);
        n = bundle.getBoolean("scaleUpIfNeeded", true);
        if (bundle.getString("outputFormat") != null)
        {
            e = android.graphics.Bitmap.CompressFormat.valueOf(bundle.getString("outputFormat"));
        }
        bundle.getInt("orientation_state");
        JVM INSTR lookupswitch 4: default 252
    //                   0: 252
    //                   90: 273
    //                   180: 282
    //                   270: 292;
           goto _L3 _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_292;
_L2:
        if (r == null)
        {
            com.android.slyce.k.h.c("CropImageActivity", "finish!!!");
            finish();
            return;
        } else
        {
            getWindow().addFlags(1024);
            findViewById(d.retake_button).setOnClickListener(new f(this));
            findViewById(d.crop_button).setOnClickListener(new g(this));
            findViewById(d.rotate_button).setOnClickListener(new com.android.slyce.crop.h(this));
            c();
            return;
        }
_L4:
        v = 90;
          goto _L2
_L5:
        v = 180;
          goto _L2
        v = -90;
          goto _L2
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (r != null && r.isRecycled())
        {
            r.recycle();
        }
    }

    protected void onPause()
    {
        super.onPause();
        com.android.slyce.crop.a.a().a(s);
    }
}
