// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import uk.co.senab.photoview.a.d;
import uk.co.senab.photoview.a.e;
import uk.co.senab.photoview.a.f;
import uk.co.senab.photoview.b.a;
import uk.co.senab.photoview.b.b;

// Referenced classes of package uk.co.senab.photoview:
//            c, b

public class PhotoViewAttacher
    implements android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, e, c
{
    public static interface b
    {

        public abstract void a(View view, float f1, float f2);
    }


    static final Interpolator a = new AccelerateDecelerateInterpolator();
    private static final boolean c = Log.isLoggable("PhotoViewAttacher", 3);
    private android.widget.ImageView.ScaleType A;
    int b;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private WeakReference h;
    private GestureDetector i;
    private d j;
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Matrix m = new Matrix();
    private final RectF n = new RectF();
    private final float o[] = new float[9];
    private a p;
    private b q;
    private c r;
    private android.view.View.OnLongClickListener s;
    private int t;
    private int u;
    private int v;
    private int w;
    private FlingRunnable x;
    private int y;
    private boolean z;

    public PhotoViewAttacher(ImageView imageview)
    {
        b = 200;
        d = 1.0F;
        e = 1.75F;
        f = 3F;
        g = true;
        y = 2;
        A = android.widget.ImageView.ScaleType.FIT_CENTER;
        h = new WeakReference(imageview);
        imageview.setDrawingCacheEnabled(true);
        imageview.setOnTouchListener(this);
        ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.addOnGlobalLayoutListener(this);
        }
        b(imageview);
        if (imageview.isInEditMode())
        {
            return;
        } else
        {
            j = uk.co.senab.photoview.a.f.a(imageview.getContext(), this);
            i = new GestureDetector(imageview.getContext(), new _cls1());
            i.setOnDoubleTapListener(new uk.co.senab.photoview.b(this));
            b(true);
            return;
        }
    }

    private float a(Matrix matrix, int i1)
    {
        matrix.getValues(o);
        return o[i1];
    }

    private RectF a(Matrix matrix)
    {
        Object obj = c();
        if (obj != null)
        {
            obj = ((ImageView) (obj)).getDrawable();
            if (obj != null)
            {
                n.set(0.0F, 0.0F, ((Drawable) (obj)).getIntrinsicWidth(), ((Drawable) (obj)).getIntrinsicHeight());
                matrix.mapRect(n);
                return n;
            }
        }
        return null;
    }

    static android.view.View.OnLongClickListener a(PhotoViewAttacher photoviewattacher)
    {
        return photoviewattacher.s;
    }

    private void a(Drawable drawable)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        int i1;
        int j1;
        ImageView imageview = c();
        if (imageview == null || drawable == null)
        {
            return;
        }
        f1 = c(imageview);
        f2 = d(imageview);
        i1 = drawable.getIntrinsicWidth();
        j1 = drawable.getIntrinsicHeight();
        k.reset();
        f3 = f1 / (float)i1;
        f4 = f2 / (float)j1;
        if (A != android.widget.ImageView.ScaleType.CENTER) goto _L2; else goto _L1
_L1:
        k.postTranslate((f1 - (float)i1) / 2.0F, (f2 - (float)j1) / 2.0F);
_L4:
        s();
        return;
_L2:
        if (A == android.widget.ImageView.ScaleType.CENTER_CROP)
        {
            f3 = Math.max(f3, f4);
            k.postScale(f3, f3);
            k.postTranslate((f1 - (float)i1 * f3) / 2.0F, (f2 - (float)j1 * f3) / 2.0F);
            continue; /* Loop/switch isn't completed */
        }
        if (A != android.widget.ImageView.ScaleType.CENTER_INSIDE)
        {
            break; /* Loop/switch isn't completed */
        }
        f3 = Math.min(1.0F, Math.min(f3, f4));
        k.postScale(f3, f3);
        k.postTranslate((f1 - (float)i1 * f3) / 2.0F, (f2 - (float)j1 * f3) / 2.0F);
        if (true) goto _L4; else goto _L3
_L3:
        drawable = new RectF(0.0F, 0.0F, i1, j1);
        RectF rectf = new RectF(0.0F, 0.0F, f1, f2);
    /* anonymous class not found */
    class _anm2 {}

        switch (uk.co.senab.photoview._cls2.a[A.ordinal()])
        {
        case 2: // '\002'
            k.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.START);
            break;

        case 4: // '\004'
            k.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.CENTER);
            break;

        case 3: // '\003'
            k.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.END);
            break;

        case 5: // '\005'
            k.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.FILL);
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    static void a(PhotoViewAttacher photoviewattacher, Matrix matrix)
    {
        photoviewattacher.b(matrix);
    }

    private static boolean a(ImageView imageview)
    {
        return imageview != null && imageview.getDrawable() != null;
    }

    static Matrix b(PhotoViewAttacher photoviewattacher)
    {
        return photoviewattacher.m;
    }

    private static void b(float f1, float f2, float f3)
    {
        if (f1 >= f2)
        {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        }
        if (f2 >= f3)
        {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        } else
        {
            return;
        }
    }

    private void b(Matrix matrix)
    {
        ImageView imageview = c();
        if (imageview != null)
        {
            q();
            imageview.setImageMatrix(matrix);
            if (p != null)
            {
                matrix = a(matrix);
    /* block-local class not found */
    class a {}

                if (matrix != null)
                {
                    p.a(matrix);
                }
            }
        }
    }

    private static void b(ImageView imageview)
    {
        if (imageview != null && !(imageview instanceof c) && !android.widget.ImageView.ScaleType.MATRIX.equals(imageview.getScaleType()))
        {
            imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        }
    }

    private static boolean b(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype == null)
        {
            return false;
        }
        switch (uk.co.senab.photoview._cls2.a[scaletype.ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
            throw new IllegalArgumentException((new StringBuilder()).append(scaletype.name()).append(" is not supported in PhotoView").toString());
        }
    }

    private int c(ImageView imageview)
    {
        if (imageview == null)
        {
            return 0;
        } else
        {
            return imageview.getWidth() - imageview.getPaddingLeft() - imageview.getPaddingRight();
        }
    }

    static void c(PhotoViewAttacher photoviewattacher)
    {
        photoviewattacher.p();
    }

    private int d(ImageView imageview)
    {
        if (imageview == null)
        {
            return 0;
        } else
        {
            return imageview.getHeight() - imageview.getPaddingTop() - imageview.getPaddingBottom();
        }
    }

    static boolean n()
    {
        return c;
    }

    private void o()
    {
        if (x != null)
        {
    /* block-local class not found */
    class FlingRunnable {}

            x.a();
            x = null;
        }
    }

    private void p()
    {
        if (r())
        {
            b(l());
        }
    }

    private void q()
    {
        ImageView imageview = c();
        if (imageview != null && !(imageview instanceof c) && !android.widget.ImageView.ScaleType.MATRIX.equals(imageview.getScaleType()))
        {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        } else
        {
            return;
        }
    }

    private boolean r()
    {
        float f1;
        float f2;
        float f3;
        ImageView imageview;
        RectF rectf;
        int i1;
        f2 = 0.0F;
        imageview = c();
        if (imageview == null)
        {
            return false;
        }
        rectf = a(l());
        if (rectf == null)
        {
            return false;
        }
        f1 = rectf.height();
        f3 = rectf.width();
        i1 = d(imageview);
        if (f1 > (float)i1) goto _L2; else goto _L1
_L1:
        uk.co.senab.photoview._cls2.a[A.ordinal()];
        JVM INSTR tableswitch 2 3: default 92
    //                   2 187
    //                   3 197;
           goto _L3 _L4 _L5
_L3:
        f1 = ((float)i1 - f1) / 2.0F - rectf.top;
_L9:
        i1 = c(imageview);
        if (f3 > (float)i1)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        uk.co.senab.photoview._cls2.a[A.ordinal()];
        JVM INSTR tableswitch 2 3: default 156
    //                   2 257
    //                   3 267;
           goto _L6 _L7 _L8
_L6:
        f2 = ((float)i1 - f3) / 2.0F - rectf.left;
_L10:
        y = 2;
_L11:
        m.postTranslate(f2, f1);
        return true;
_L4:
        f1 = -rectf.top;
          goto _L9
_L5:
        f1 = (float)i1 - f1 - rectf.top;
          goto _L9
_L2:
        if (rectf.top > 0.0F)
        {
            f1 = -rectf.top;
        } else
        if (rectf.bottom < (float)i1)
        {
            f1 = (float)i1 - rectf.bottom;
        } else
        {
            f1 = 0.0F;
        }
          goto _L9
_L7:
        f2 = -rectf.left;
          goto _L10
_L8:
        f2 = (float)i1 - f3 - rectf.left;
          goto _L10
        if (rectf.left > 0.0F)
        {
            y = 0;
            f2 = -rectf.left;
        } else
        if (rectf.right < (float)i1)
        {
            f2 = (float)i1 - rectf.right;
            y = 1;
        } else
        {
            y = -1;
        }
          goto _L11
    }

    private void s()
    {
        m.reset();
        b(l());
        r();
    }

    public void a()
    {
        if (h == null)
        {
            return;
        }
        ImageView imageview = (ImageView)h.get();
        if (imageview != null)
        {
            ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
            if (viewtreeobserver != null && viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(this);
            }
            imageview.setOnTouchListener(null);
            o();
        }
        if (i != null)
        {
            i.setOnDoubleTapListener(null);
        }
        p = null;
        q = null;
        r = null;
        h = null;
    }

    public void a(float f1)
    {
        m.setRotate(f1 % 360F);
        p();
    }

    public void a(float f1, float f2)
    {
        if (!j.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (c)
        {
            uk.co.senab.photoview.b.a.a().a("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", new Object[] {
                Float.valueOf(f1), Float.valueOf(f2)
            }));
        }
        obj = c();
        m.postTranslate(f1, f2);
        p();
        obj = ((ImageView) (obj)).getParent();
        if (!g || j.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (y != 2 && (y != 0 || f1 < 1.0F) && (y != 1 || f1 > -1F) || obj == null) goto _L1; else goto _L3
_L3:
        ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        return;
        if (obj == null) goto _L1; else goto _L4
_L4:
        ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
        return;
    }

    public void a(float f1, float f2, float f3)
    {
        if (c)
        {
            uk.co.senab.photoview.b.a.a().a("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[] {
                Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3)
            }));
        }
        if (g() < f || f1 < 1.0F)
        {
            m.postScale(f1, f1, f2, f3);
            p();
        }
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        if (c)
        {
            uk.co.senab.photoview.b.a.a().a("PhotoViewAttacher", (new StringBuilder()).append("onFling. sX: ").append(f1).append(" sY: ").append(f2).append(" Vx: ").append(f3).append(" Vy: ").append(f4).toString());
        }
        ImageView imageview = c();
        x = new FlingRunnable(imageview.getContext());
        x.a(c(imageview), d(imageview), (int)f3, (int)f4);
        imageview.post(x);
    }

    public void a(float f1, float f2, float f3, boolean flag)
    {
        ImageView imageview;
label0:
        {
            imageview = c();
            if (imageview != null)
            {
                if (f1 >= d && f1 <= f)
                {
                    break label0;
                }
                uk.co.senab.photoview.b.a.a().b("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            }
            return;
        }
        if (flag)
        {
    /* block-local class not found */
    class AnimatedZoomRunnable {}

            imageview.post(new AnimatedZoomRunnable(g(), f1, f2, f3));
            return;
        } else
        {
            m.setScale(f1, f1, f2, f3);
            p();
            return;
        }
    }

    public void a(float f1, boolean flag)
    {
        ImageView imageview = c();
        if (imageview != null)
        {
            a(f1, imageview.getRight() / 2, imageview.getBottom() / 2, flag);
        }
    }

    public void a(int i1)
    {
        int j1 = i1;
        if (i1 < 0)
        {
            j1 = 200;
        }
        b = j1;
    }

    public void a(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        if (ondoubletaplistener != null)
        {
            i.setOnDoubleTapListener(ondoubletaplistener);
            return;
        } else
        {
            i.setOnDoubleTapListener(new uk.co.senab.photoview.b(this));
            return;
        }
    }

    public void a(android.view.View.OnLongClickListener onlongclicklistener)
    {
        s = onlongclicklistener;
    }

    public void a(android.widget.ImageView.ScaleType scaletype)
    {
        if (b(scaletype) && scaletype != A)
        {
            A = scaletype;
            k();
        }
    }

    public void a(a a1)
    {
        p = a1;
    }

    public void a(b b1)
    {
        q = b1;
    }

    public void a(c c1)
    {
        r = c1;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public RectF b()
    {
        r();
        return a(l());
    }

    public void b(float f1)
    {
        m.postRotate(f1 % 360F);
        p();
    }

    public void b(boolean flag)
    {
        z = flag;
        k();
    }

    public ImageView c()
    {
        ImageView imageview = null;
        if (h != null)
        {
            imageview = (ImageView)h.get();
        }
        if (imageview == null)
        {
            a();
            Log.i("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageview;
    }

    public void c(float f1)
    {
        b(f1, e, f);
        d = f1;
    }

    public float d()
    {
        return d;
    }

    public void d(float f1)
    {
        b(d, f1, f);
        e = f1;
    }

    public float e()
    {
        return e;
    }

    public void e(float f1)
    {
        b(d, e, f1);
        f = f1;
    }

    public float f()
    {
        return f;
    }

    public void f(float f1)
    {
        a(f1, false);
    }

    public float g()
    {
        return android.a.a.a((float)Math.pow(a(m, 0), 2D) + (float)Math.pow(a(m, 3), 2D));
    }

    public android.widget.ImageView.ScaleType h()
    {
        return A;
    }

    public b i()
    {
        return q;
    }

    public c j()
    {
        return r;
    }

    public void k()
    {
label0:
        {
            ImageView imageview = c();
            if (imageview != null)
            {
                if (!z)
                {
                    break label0;
                }
                b(imageview);
                a(imageview.getDrawable());
            }
            return;
        }
        s();
    }

    public Matrix l()
    {
        l.set(k);
        l.postConcat(m);
        return l;
    }

    public Bitmap m()
    {
        ImageView imageview = c();
        if (imageview == null)
        {
            return null;
        } else
        {
            return imageview.getDrawingCache();
        }
    }

    public void onGlobalLayout()
    {
        ImageView imageview;
label0:
        {
            imageview = c();
            if (imageview != null)
            {
                if (!z)
                {
                    break label0;
                }
                int i1 = imageview.getTop();
                int j1 = imageview.getRight();
                int k1 = imageview.getBottom();
                int l1 = imageview.getLeft();
                if (i1 != t || k1 != v || l1 != w || j1 != u)
                {
                    a(imageview.getDrawable());
                    t = i1;
                    u = j1;
                    v = k1;
                    w = l1;
                }
            }
            return;
        }
        a(imageview.getDrawable());
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!z || !a((ImageView)view)) goto _L2; else goto _L1
_L1:
        Object obj = view.getParent();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 56
    //                   0 122
    //                   1 155
    //                   2 56
    //                   3 155;
           goto _L3 _L4 _L5 _L3 _L5
_L3:
        boolean flag = false;
_L6:
        boolean flag1 = flag;
        if (j != null)
        {
            flag1 = flag;
            if (j.c(motionevent))
            {
                flag1 = true;
            }
        }
        flag = flag1;
        if (i != null)
        {
            flag = flag1;
            if (i.onTouchEvent(motionevent))
            {
                flag = true;
            }
        }
        return flag;
_L4:
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
        } else
        {
            Log.i("PhotoViewAttacher", "onTouch getParent() returned null");
        }
        o();
        flag = false;
          goto _L6
_L5:
        if (g() >= d) goto _L3; else goto _L7
_L7:
        obj = b();
        if (obj == null) goto _L3; else goto _L8
_L8:
        view.post(new AnimatedZoomRunnable(g(), d, ((RectF) (obj)).centerX(), ((RectF) (obj)).centerY()));
        flag = true;
          goto _L6
_L2:
        return false;
    }


    // Unreferenced inner class uk/co/senab/photoview/PhotoViewAttacher$c
    /* block-local class not found */
    class c {}


    /* member class not found */
    class _cls1 {}

}
