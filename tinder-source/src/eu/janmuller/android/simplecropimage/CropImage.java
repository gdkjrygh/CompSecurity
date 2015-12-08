// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            b, HighlightView, CropImageView, BitmapManager

public class CropImage extends b
{

    final int a = 1024;
    boolean b;
    boolean c;
    HighlightView d;
    Runnable e;
    private final Handler g = new Handler();
    private final BitmapManager.a h = new BitmapManager.a();
    private android.graphics.Bitmap.CompressFormat i;
    private Uri j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private CropImageView p;
    private ContentResolver q;
    private Bitmap r;
    private String s;
    private boolean t;

    public CropImage()
    {
        i = android.graphics.Bitmap.CompressFormat.JPEG;
        j = null;
        k = true;
        l = 1;
        m = 1;
        e = new Runnable() {

            float a;
            Matrix b;
            android.media.FaceDetector.Face c[];
            int d;
            final CropImage e;

            public final void run()
            {
                b = CropImage.a(e).getImageMatrix();
                Object obj;
                if (CropImage.b(e) == null)
                {
                    obj = null;
                } else
                {
                    if (CropImage.b(e).getWidth() > 256)
                    {
                        a = 256F / (float)CropImage.b(e).getWidth();
                    }
                    obj = new Matrix();
                    ((Matrix) (obj)).setScale(a, a);
                    obj = Bitmap.createBitmap(CropImage.b(e), 0, 0, CropImage.b(e).getWidth(), CropImage.b(e).getHeight(), ((Matrix) (obj)), true);
                }
                a = 1.0F / a;
                if (obj != null && CropImage.e(e))
                {
                    d = (new FaceDetector(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), c.length)).findFaces(((Bitmap) (obj)), c);
                }
                if (obj != null && obj != CropImage.b(e))
                {
                    ((Bitmap) (obj)).recycle();
                }
                CropImage.f(e).post(new Runnable(this) {

                    final _cls1 a;

                    public final void run()
                    {
                        CropImage cropimage = a.e;
                        boolean flag;
                        if (a.d > 1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        cropimage.b = flag;
                        if (a.d > 0)
                        {
                            int i1 = 0;
                            while (i1 < a.d) 
                            {
                                _cls1 _lcls1 = a;
                                Object obj = a.c[i1];
                                Object obj1 = new PointF();
                                int k1 = (int)(((android.media.FaceDetector.Face) (obj)).eyesDistance() * _lcls1.a) * 2;
                                ((android.media.FaceDetector.Face) (obj)).getMidPoint(((PointF) (obj1)));
                                obj1.x = ((PointF) (obj1)).x * _lcls1.a;
                                obj1.y = ((PointF) (obj1)).y * _lcls1.a;
                                int i2 = (int)((PointF) (obj1)).x;
                                int l2 = (int)((PointF) (obj1)).y;
                                obj = new HighlightView(CropImage.a(_lcls1.e));
                                obj1 = new Rect(0, 0, CropImage.b(_lcls1.e).getWidth(), CropImage.b(_lcls1.e).getHeight());
                                RectF rectf = new RectF(i2, l2, i2, l2);
                                rectf.inset(-k1, -k1);
                                if (rectf.left < 0.0F)
                                {
                                    rectf.inset(-rectf.left, -rectf.left);
                                }
                                if (rectf.top < 0.0F)
                                {
                                    rectf.inset(-rectf.top, -rectf.top);
                                }
                                if (rectf.right > (float)((Rect) (obj1)).right)
                                {
                                    rectf.inset(rectf.right - (float)((Rect) (obj1)).right, rectf.right - (float)((Rect) (obj1)).right);
                                }
                                if (rectf.bottom > (float)((Rect) (obj1)).bottom)
                                {
                                    rectf.inset(rectf.bottom - (float)((Rect) (obj1)).bottom, rectf.bottom - (float)((Rect) (obj1)).bottom);
                                }
                                Matrix matrix = _lcls1.b;
                                if (CropImage.c(_lcls1.e) != 0 && CropImage.d(_lcls1.e) != 0)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                ((HighlightView) (obj)).a(matrix, ((Rect) (obj1)), rectf, flag);
                                CropImage.a(_lcls1.e).a(((HighlightView) (obj)));
                                i1++;
                            }
                        } else
                        {
                            _cls1 _lcls1_1 = a;
                            HighlightView highlightview = new HighlightView(CropImage.a(_lcls1_1.e));
                            int j3 = CropImage.b(_lcls1_1.e).getWidth();
                            int i3 = CropImage.b(_lcls1_1.e).getHeight();
                            Rect rect = new Rect(0, 0, j3, i3);
                            int l1 = (Math.min(j3, i3) * 4) / 5;
                            RectF rectf1;
                            Matrix matrix1;
                            int j1;
                            int j2;
                            boolean flag1;
                            if (CropImage.c(_lcls1_1.e) != 0 && CropImage.d(_lcls1_1.e) != 0)
                            {
                                if (CropImage.c(_lcls1_1.e) > CropImage.d(_lcls1_1.e))
                                {
                                    j1 = (CropImage.d(_lcls1_1.e) * l1) / CropImage.c(_lcls1_1.e);
                                } else
                                {
                                    int k2 = (CropImage.c(_lcls1_1.e) * l1) / CropImage.d(_lcls1_1.e);
                                    j1 = l1;
                                    l1 = k2;
                                }
                            } else
                            {
                                j1 = l1;
                            }
                            j2 = (j3 - l1) / 2;
                            i3 = (i3 - j1) / 2;
                            rectf1 = new RectF(j2, i3, l1 + j2, j1 + i3);
                            matrix1 = _lcls1_1.b;
                            if (CropImage.c(_lcls1_1.e) != 0 && CropImage.d(_lcls1_1.e) != 0)
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            highlightview.a(matrix1, rect, rectf1, flag1);
                            CropImage.a(_lcls1_1.e).a.clear();
                            CropImage.a(_lcls1_1.e).a(highlightview);
                        }
                        CropImage.a(a.e).invalidate();
                        if (CropImage.a(a.e).a.size() == 1)
                        {
                            a.e.d = (HighlightView)CropImage.a(a.e).a.get(0);
                            a.e.d.e = true;
                        }
                        if (a.d > 1)
                        {
                            Toast.makeText(a.e, "Multi face crop help", 0).show();
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                e = CropImage.this;
                super();
                a = 1.0F;
                c = new android.media.FaceDetector.Face[3];
            }
        };
        t = false;
    }

    private static int a(Activity activity)
    {
        try
        {
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                activity = Environment.getExternalStorageDirectory().toString();
            } else
            {
                activity = activity.getFilesDir().toString();
            }
            activity = new StatFs(activity);
            return (int)(((float)activity.getAvailableBlocks() * (float)activity.getBlockSize()) / 400000F);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return -2;
        }
    }

    static Bitmap a(CropImage cropimage, Bitmap bitmap)
    {
        cropimage.r = bitmap;
        return bitmap;
    }

    private static Uri a(String s1)
    {
        return Uri.fromFile(new File(s1));
    }

    static CropImageView a(CropImage cropimage)
    {
        return cropimage.p;
    }

    static Bitmap b(CropImage cropimage)
    {
        return cropimage.r;
    }

    private Bitmap b(String s1)
    {
        Object obj;
        int i1;
        i1 = 1;
        obj = a(s1);
        Object obj2;
        obj2 = q.openInputStream(((Uri) (obj)));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, options);
        ((InputStream) (obj2)).close();
        if (options.outHeight > 1024 || options.outWidth > 1024)
        {
            i1 = (int)Math.pow(2D, (int)Math.round(Math.log(1024D / (double)Math.max(options.outHeight, options.outWidth)) / Math.log(0.5D)));
        }
        obj2 = new android.graphics.BitmapFactory.Options();
        obj2.inSampleSize = i1;
        obj = q.openInputStream(((Uri) (obj)));
        obj2 = BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj2)));
        ((InputStream) (obj)).close();
        return ((Bitmap) (obj2));
        Object obj1;
        obj1;
        Log.e("Tinder", (new StringBuilder("file ")).append(s1).append(" not found").toString());
_L2:
        return null;
        obj1;
        Log.e("Tinder", (new StringBuilder("file ")).append(s1).append(" not found").toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    static int c(CropImage cropimage)
    {
        return cropimage.l;
    }

    static int d(CropImage cropimage)
    {
        return cropimage.m;
    }

    static boolean e(CropImage cropimage)
    {
        return cropimage.k;
    }

    static Handler f(CropImage cropimage)
    {
        return cropimage.g;
    }

    static void g(CropImage cropimage)
        throws Exception
    {
        Log.e("Tinder", "onSaveClicked");
        if (!cropimage.c && cropimage.d != null)
        {
            cropimage.c = true;
            Object obj = cropimage.d;
            obj = new Rect((int)((HighlightView) (obj)).h.left, (int)((HighlightView) (obj)).h.top, (int)((HighlightView) (obj)).h.right, (int)((HighlightView) (obj)).h.bottom);
            RectF rectf = cropimage.d.k;
            float f1 = ((Rect) (obj)).width();
            float f2 = ((Rect) (obj)).height();
            float f3 = ((Rect) (obj)).left;
            float f4 = ((Rect) (obj)).top;
            float f5 = rectf.width();
            float f6 = rectf.height();
            Log.e("Tinder", (new StringBuilder("rect=")).append(obj).toString());
            obj = new Intent();
            ((Intent) (obj)).putExtra("rect_crop_x", f3);
            ((Intent) (obj)).putExtra("rect_crop_y", f4);
            ((Intent) (obj)).putExtra("rect_crop_width", f1);
            ((Intent) (obj)).putExtra("rect_crop_height", f2);
            ((Intent) (obj)).putExtra("image_width", f5);
            ((Intent) (obj)).putExtra("image_height", f6);
            cropimage.setResult(-1, ((Intent) (obj)));
            cropimage.finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.d("Tinder", "ENTER");
        q = getContentResolver();
        setContentView(c.c.cropimage);
        bundle = getSupportActionBar();
        if (bundle != null)
        {
            bundle.hide();
        }
        p = (CropImageView)findViewById(c.b.image);
        int i1 = a(this);
        if (i1 == -1)
        {
            if (Environment.getExternalStorageState().equals("checking"))
            {
                bundle = getString(c.d.preparing_card);
            } else
            {
                bundle = getString(c.d.no_storage_card);
            }
        } else
        if (i1 <= 0)
        {
            bundle = getString(c.d.not_enough_space);
        } else
        {
            bundle = null;
        }
        if (bundle != null)
        {
            Toast.makeText(this, bundle, 5000).show();
        }
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            s = bundle.getString("image-path");
            Log.d("Tinder", (new StringBuilder("mImagePath=")).append(s).toString());
            j = a(s);
            r = b(s);
            n = bundle.getInt("outputX");
            o = bundle.getInt("outputY");
            t = bundle.getBoolean("scaleUpIfNeeded", false);
            Log.d("Tinder", (new StringBuilder("mOutputX=")).append(n).toString());
            Log.d("Tinder", (new StringBuilder("mOutputY=")).append(o).toString());
            Log.d("Tinder", (new StringBuilder("mScaleUp=")).append(t).toString());
        }
        if (r == null)
        {
            Log.d("Tinder", "finish!!!");
            finish();
        } else
        {
            getWindow().addFlags(1024);
            bundle = (Button)findViewById(c.b.discard);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final CropImage a;

                public final void onClick(View view)
                {
                    a.setResult(0);
                    a.finish();
                }

            
            {
                a = CropImage.this;
                super();
            }
            });
            Button button = (Button)findViewById(c.b.save);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final CropImage a;

                public final void onClick(View view)
                {
                    try
                    {
                        CropImage.g(a);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        a.finish();
                    }
                }

            
            {
                a = CropImage.this;
                super();
            }
            });
            int j1;
            int k1;
            if (getIntent() != null)
            {
                k1 = getIntent().getIntExtra("cancel res id", 0);
                j1 = getIntent().getIntExtra("save res id", 0);
            } else
            {
                j1 = 0;
                k1 = 0;
            }
            bundle.setText(k1);
            button.setText(j1);
            Log.e("Tinder", "startFaceDetection");
            if (!isFinishing())
            {
                p.a(r);
                bundle = new Runnable() {

                    final CropImage a;

                    public final void run()
                    {
                        CountDownLatch countdownlatch = new CountDownLatch(1);
                        Bitmap bitmap = CropImage.b(a);
                        CropImage.f(a).post(new Runnable(this, bitmap, countdownlatch) {

                            final Bitmap a;
                            final CountDownLatch b;
                            final _cls4 c;

                            public final void run()
                            {
                                if (a != CropImage.b(c.a) && a != null)
                                {
                                    CropImage.a(c.a).a(a);
                                    CropImage.b(c.a).recycle();
                                    CropImage.a(c.a, a);
                                }
                                if (CropImage.a(c.a).b() == 1.0F)
                                {
                                    CropImage.a(c.a).a();
                                }
                                b.countDown();
                            }

            
            {
                c = _pcls4;
                a = bitmap;
                b = countdownlatch;
                super();
            }
                        });
                        try
                        {
                            countdownlatch.await();
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            throw new RuntimeException(interruptedexception);
                        }
                        a.e.run();
                    }

            
            {
                a = CropImage.this;
                super();
            }
                };
                Handler handler = g;
                (new Thread(new e.a(this, bundle, ProgressDialog.show(this, null, "Please wait\u2026", true, false), handler))).start();
                return;
            }
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (r != null)
        {
            r.recycle();
        }
    }

    protected void onPause()
    {
        super.onPause();
        BitmapManager.a().a(h);
    }
}
