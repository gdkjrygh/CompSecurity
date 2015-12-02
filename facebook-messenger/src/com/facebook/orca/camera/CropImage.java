// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.facebook.debug.log.b;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.camera.a.c;
import com.facebook.orca.camera.a.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.facebook.orca.camera:
//            x, k, CropImageView, g, 
//            aa, j, m, ImageManager, 
//            i, w, e, f

public class CropImage extends x
{

    private static final Class e = com/facebook/orca/camera/CropImage;
    boolean a;
    boolean b;
    m c;
    Runnable d;
    private android.graphics.Bitmap.CompressFormat f;
    private Uri g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private final Handler m = new Handler();
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private CropImageView r;
    private ContentResolver s;
    private Bitmap t;
    private d u;
    private c v;

    public CropImage()
    {
        f = android.graphics.Bitmap.CompressFormat.JPEG;
        g = null;
        h = false;
        k = true;
        l = false;
        q = true;
        d = new com.facebook.orca.camera.k(this);
    }

    static Bitmap a(CropImage cropimage, Bitmap bitmap)
    {
        cropimage.t = bitmap;
        return bitmap;
    }

    private void a()
    {
        if (isFinishing())
        {
            return;
        } else
        {
            r.a(t, true);
            aa.a(this, null, getResources().getString(o.image_crop_running_face_detection), new g(this), m);
            return;
        }
    }

    private void a(Bitmap bitmap)
    {
        Object obj;
        Object obj1;
        int i1;
        obj1 = null;
        obj = null;
        i1 = 0;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        java.io.OutputStream outputstream = s.openOutputStream(g);
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj = outputstream;
        obj1 = outputstream;
        bitmap.compress(f, 75, outputstream);
        aa.a(outputstream);
_L1:
        obj = new Bundle();
        setResult(-1, (new Intent(g.toString())).putExtras(((Bundle) (obj))));
_L2:
        m.post(new j(this, bitmap));
        finish();
        return;
        IOException ioexception1;
        ioexception1;
        obj1 = obj;
        com.facebook.debug.log.b.e(e, (new StringBuilder()).append("Cannot open file: ").append(g).toString(), ioexception1);
        aa.a(((java.io.Closeable) (obj)));
          goto _L1
        bitmap;
        aa.a(((java.io.Closeable) (obj1)));
        throw bitmap;
        if (h)
        {
            try
            {
                WallpaperManager.getInstance(this).setBitmap(bitmap);
                setResult(-1);
            }
            catch (IOException ioexception)
            {
                com.facebook.debug.log.b.e(e, "Failed to set wallpaper.", ioexception);
                setResult(0);
            }
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("rect", c.b().toString());
            Object obj3 = new File(v.a());
            Object obj2 = new File(((File) (obj3)).getParent());
            obj3 = ((File) (obj3)).getName();
            obj3 = ((String) (obj3)).substring(0, ((String) (obj3)).lastIndexOf("."));
            do
            {
                i1++;
            } while ((new File((new StringBuilder()).append(((File) (obj2)).toString()).append("/").append(((String) (obj3))).append("-").append(i1).append(".jpg").toString())).exists());
            try
            {
                int ai[] = new int[1];
                obj2 = ImageManager.a(s, v.d(), v.b(), null, ((File) (obj2)).toString(), (new StringBuilder()).append(((String) (obj3))).append("-").append(i1).append(".jpg").toString(), bitmap, null, ai);
                setResult(-1, (new Intent()).setAction(((Uri) (obj2)).toString()).putExtras(bundle));
            }
            catch (Exception exception)
            {
                com.facebook.debug.log.b.e(e, "store image fail, continue anyway", exception);
            }
        }
          goto _L2
    }

    static void a(CropImage cropimage)
    {
        cropimage.b();
    }

    static c b(CropImage cropimage)
    {
        return cropimage.v;
    }

    private void b()
    {
        while (c == null || b) 
        {
            return;
        }
        b = true;
        if (n == 0 || o == 0 || p) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = Bitmap.createBitmap(n, o, android.graphics.Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        Rect rect = c.b();
        Rect rect2 = new Rect(0, 0, n, o);
        int i1 = (rect.width() - rect2.width()) / 2;
        int l1 = (rect.height() - rect2.height()) / 2;
        rect.inset(Math.max(0, i1), Math.max(0, l1));
        rect2.inset(Math.max(0, -i1), Math.max(0, -l1));
        canvas.drawBitmap(t, rect, rect2, null);
        r.a();
        t.recycle();
_L4:
        r.a(((Bitmap) (obj)), true);
        r.a(true, true);
        r.a.clear();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && (bundle.getParcelable("data") != null || bundle.getBoolean("return-data")))
        {
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("data", ((android.os.Parcelable) (obj)));
            setResult(-1, (new Intent()).setAction("inline-data").putExtras(bundle1));
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        Rect rect1 = c.b();
        int j1 = rect1.width();
        int i2 = rect1.height();
        Bitmap bitmap;
        Rect rect3;
        if (l)
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            obj = android.graphics.Bitmap.Config.RGB_565;
        }
        bitmap = Bitmap.createBitmap(j1, i2, ((android.graphics.Bitmap.Config) (obj)));
        obj = new Canvas(bitmap);
        rect3 = new Rect(0, 0, j1, i2);
        ((Canvas) (obj)).drawBitmap(t, rect1, rect3, null);
        r.a();
        t.recycle();
        if (l)
        {
            obj = new Canvas(bitmap);
            Path path = new Path();
            path.addCircle((float)j1 / 2.0F, (float)i2 / 2.0F, (float)j1 / 2.0F, android.graphics.Path.Direction.CW);
            ((Canvas) (obj)).clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            ((Canvas) (obj)).drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        }
        obj = bitmap;
        if (n != 0)
        {
            obj = bitmap;
            if (o != 0)
            {
                obj = bitmap;
                if (p)
                {
                    obj = aa.a(new Matrix(), bitmap, n, o, q, true);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        int k1;
        if (h)
        {
            k1 = o.image_crop_wallpaper;
        } else
        {
            k1 = o.image_crop_saving_image;
        }
        aa.a(this, null, getResources().getString(k1), new com.facebook.orca.camera.i(this, ((Bitmap) (obj))), m);
        return;
    }

    static void b(CropImage cropimage, Bitmap bitmap)
    {
        cropimage.a(bitmap);
    }

    static Bitmap c(CropImage cropimage)
    {
        return cropimage.t;
    }

    static CropImageView d(CropImage cropimage)
    {
        return cropimage.r;
    }

    static Handler e(CropImage cropimage)
    {
        return cropimage.m;
    }

    static boolean f(CropImage cropimage)
    {
        return cropimage.l;
    }

    static int g(CropImage cropimage)
    {
        return cropimage.i;
    }

    static int h(CropImage cropimage)
    {
        return cropimage.j;
    }

    static boolean i(CropImage cropimage)
    {
        return cropimage.k;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        s = getContentResolver();
        requestWindowFeature(1);
        setContentView(k.orca_cropimage);
        r = (CropImageView)findViewById(i.image);
        w.a(this);
        bundle = getIntent();
        Bundle bundle1 = bundle.getExtras();
        if (bundle1 != null)
        {
            if (bundle1.getString("circleCrop") != null)
            {
                l = true;
                i = 1;
                j = 1;
            }
            g = (Uri)bundle1.getParcelable("output");
            boolean flag;
            if (g != null)
            {
                String s1 = bundle1.getString("outputFormat");
                if (s1 != null)
                {
                    f = android.graphics.Bitmap.CompressFormat.valueOf(s1);
                }
            } else
            {
                h = bundle1.getBoolean("setWallpaper");
            }
            t = (Bitmap)bundle1.getParcelable("data");
            i = bundle1.getInt("aspectX");
            j = bundle1.getInt("aspectY");
            n = bundle1.getInt("outputX");
            o = bundle1.getInt("outputY");
            p = bundle1.getBoolean("scale", true);
            q = bundle1.getBoolean("scaleUpIfNeeded", true);
            if (bundle1.containsKey("noFaceDetection"))
            {
                if (!bundle1.getBoolean("noFaceDetection"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = true;
            }
            k = flag;
        }
        if (t == null)
        {
            bundle = bundle.getData();
            u = ImageManager.a(s, bundle, 1);
            v = u.a(bundle);
            if (v != null)
            {
                t = v.a(true);
            }
        }
        if (t == null)
        {
            finish();
            return;
        } else
        {
            getWindow().addFlags(1024);
            findViewById(i.discard).setOnClickListener(new e(this));
            findViewById(i.save).setOnClickListener(new f(this));
            a();
            return;
        }
    }

    protected void onDestroy()
    {
        if (u != null)
        {
            u.a();
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
    }

}
