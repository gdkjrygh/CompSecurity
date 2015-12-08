// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.kik.platform.util.ExifHelper;
import kik.android.util.bx;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.widget:
//            ClampImageView

public class KikCropView extends ClampImageView
{

    private static final b f = org.c.c.a("KikCropView");
    private static int o;
    String a;
    Bitmap b;
    private int c;
    private int d;
    private int e;
    private double g;
    private Rect h;
    private Paint i;
    private boolean j;
    private boolean k;
    private Rect l;
    private float m;
    private float n;

    public KikCropView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 854D;
        h = new Rect();
        j = false;
        k = false;
    }

    private void a(int i1, int j1, int k1)
    {
        h.set(i1 - k1, j1 - k1, i1 + k1, j1 + k1);
    }

    private void f()
    {
        if (h.width() > getWidth() || h.height() > getHeight())
        {
            int i1 = Math.min(getWidth() / 2, getHeight() / 2);
            Rect rect = h;
            a(rect.centerX(), rect.centerY(), i1);
        }
        if (h.left < 0)
        {
            h.offsetTo(0, h.top);
        }
        if (h.top < 0)
        {
            h.offsetTo(h.left, 0);
        }
        if (h.right > getWidth())
        {
            h.offsetTo(getWidth() - h.width(), h.top);
        }
        if (h.bottom > getHeight())
        {
            h.offsetTo(h.left, getHeight() - h.height());
        }
    }

    public final void a(String s)
    {
        Object obj = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        g = Math.max(((Display) (obj)).getWidth(), ((Display) (obj)).getHeight());
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        e = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        d = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        double d1 = Math.min(g / (double)e, g / (double)d);
        float f1;
        int i1;
        if (d1 < 1.0D)
        {
            i1 = (int)Math.ceil(Math.log(1.0D / d1) / Math.log(2D) + 0.0D);
        } else
        {
            i1 = 1;
        }
        a = s;
        obj = new android.graphics.BitmapFactory.Options();
        if (i1 > 0)
        {
            obj.inSampleSize = (int)Math.pow(2D, i1);
        }
        b = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        f1 = ExifHelper.a(s);
        if (f1 != 0.0F)
        {
            s = new Matrix();
            s.postRotate(f1);
            Bitmap bitmap = b;
            b = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), s, true);
            if (bitmap != b)
            {
                bitmap.recycle();
            }
            c = (int)f1;
        }
        setImageBitmap(b);
        i = new Paint();
        i.setColor(-1);
        i.setStrokeWidth(3F);
        i.setStyle(android.graphics.Paint.Style.STROKE);
    }

    public final boolean a()
    {
        return b != null;
    }

    public final void b()
    {
        if (b == null)
        {
            return;
        }
        setImageBitmap(null);
        Matrix matrix = new Matrix();
        matrix.postRotate(90F);
        c = c + 90;
        if (c >= 360)
        {
            c = c - 360;
        }
        (new StringBuilder("rotating 90, now at ")).append(c);
        Bitmap bitmap = b;
        b = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (bitmap != b)
        {
            bitmap.recycle();
        }
        setImageBitmap(b);
    }

    public final void c()
    {
        if (b == null)
        {
            return;
        }
        setImageBitmap(null);
        Matrix matrix = new Matrix();
        matrix.postRotate(-90F);
        c = c - 90;
        if (c < 0)
        {
            c = c + 360;
        }
        (new StringBuilder("rotating -90, now at ")).append(c);
        Bitmap bitmap = b;
        b = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (bitmap != b)
        {
            bitmap.recycle();
        }
        setImageBitmap(b);
    }

    public final Bitmap d()
    {
        int i2 = getWidth();
        int j2 = getHeight();
        if (h == null)
        {
            return null;
        }
        h.width();
        int i1 = 1;
        if ((double)Math.max(d, e) > 1500D)
        {
            i1 = (int)Math.ceil(((double)Math.max(d, e) * 1.0D) / 1500D);
        }
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inTempStorage = new byte[16384];
        if (i1 > 1)
        {
            obj.inSampleSize = i1;
        }
        try
        {
            obj = BitmapFactory.decodeFile(a, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bx.a(((Throwable) (obj)));
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        Object obj1 = new Matrix();
        if (c != 0)
        {
            ((Matrix) (obj1)).postRotate(c);
        }
        int j1;
        int k1;
        int l1;
        if (c == 90)
        {
            l1 = h.top;
            k1 = i2 - h.right;
            j1 = ((Bitmap) (obj)).getHeight();
            i1 = ((Bitmap) (obj)).getWidth();
        } else
        if (c == 180)
        {
            l1 = i2 - h.right;
            k1 = j2 - h.bottom;
            j1 = ((Bitmap) (obj)).getWidth();
            i1 = ((Bitmap) (obj)).getHeight();
        } else
        if (c == 270)
        {
            l1 = j2 - h.bottom;
            k1 = h.left;
            j1 = ((Bitmap) (obj)).getHeight();
            i1 = ((Bitmap) (obj)).getWidth();
        } else
        {
            l1 = h.left;
            k1 = h.top;
            j1 = ((Bitmap) (obj)).getWidth();
            i1 = ((Bitmap) (obj)).getHeight();
        }
        l1 = (int)((((double)l1 * 1.0D) / (double)i2) * (double)j1);
        i1 = (int)((((double)k1 * 1.0D) / (double)j2) * (double)i1);
        j1 = (int)(((double)h.width() * 1.0D * (double)j1) / (double)i2);
        (new StringBuilder("Final coords are left = ")).append(l1).append(" top = ").append(i1).append(" width = ").append(j1);
        k1 = Math.max(l1, 0);
        i1 = Math.max(i1, 0);
        j1 = Math.min(j1, Math.min(((Bitmap) (obj)).getWidth() - k1, ((Bitmap) (obj)).getHeight() - i1));
        obj1 = Bitmap.createBitmap(((Bitmap) (obj)), k1, i1, j1, j1, ((Matrix) (obj1)), false);
        if (obj != obj1)
        {
            ((Bitmap) (obj)).recycle();
        }
        return ((Bitmap) (obj1));
    }

    public final void e()
    {
        setImageBitmap(null);
        if (b != null)
        {
            if (!b.isRecycled())
            {
                b.recycle();
            }
            b = null;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (isInEditMode())
        {
            return;
        }
        if (h != null)
        {
            f();
        }
        canvas.drawRect(h, i);
        i.setColor(Color.argb(100, 100, 100, 100));
        i.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawRect(new Rect(0, 0, h.left, canvas.getHeight()), i);
        canvas.drawRect(new Rect(h.left, 0, h.right, h.top), i);
        canvas.drawRect(new Rect(h.left, h.bottom, h.right, canvas.getHeight()), i);
        canvas.drawRect(new Rect(h.right, 0, canvas.getWidth(), canvas.getHeight()), i);
        i.setColor(-1);
        i.setStrokeWidth(3F);
        i.setStyle(android.graphics.Paint.Style.STROKE);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        i1 = Math.min(getWidth(), getHeight()) / 3;
        a(getWidth() / 2, getHeight() / 2, i1);
        o = Math.min(getWidth() / 3, getHeight() / 3);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 267
    //                   2 288;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        float f1;
        float f4;
        l = new Rect(h);
        m = motionevent.getX();
        n = motionevent.getY();
        f1 = m;
        f4 = n;
        if (Math.abs(Math.abs(f1 - (float)h.centerX()) - (float)(h.width() / 2)) >= 15F || f4 >= (float)(h.bottom + 15) || f4 <= (float)(h.top - 15)) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (flag)
        {
            k = true;
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        flag = flag1;
        if (Math.abs(Math.abs(f4 - (float)h.centerY()) - (float)(h.height() / 2)) < 15F)
        {
            flag = flag1;
            if (f1 < (float)(h.right + 15))
            {
                flag = flag1;
                if (f1 > (float)(h.left - 15))
                {
                    flag = true;
                }
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (h.contains((int)m, (int)n))
        {
            j = true;
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        l = null;
        j = false;
        k = false;
        f();
        return true;
_L4:
        if (j)
        {
            float f2 = motionevent.getX();
            float f5 = m;
            float f7 = motionevent.getY();
            float f9 = n;
            h.set(l);
            h.offset((int)(f2 - f5), (int)(f7 - f9));
            f();
            invalidate();
            return true;
        }
        if (k)
        {
            float f3 = motionevent.getX();
            float f6 = motionevent.getY();
            float f8 = l.centerX();
            float f10 = l.centerY();
            if (Math.abs(f3 - f8) > Math.abs(f6 - f10))
            {
                f3 = Math.abs(f3 - (float)l.centerX());
            } else
            {
                f3 = Math.abs(f6 - (float)l.centerY());
            }
            f3 = Math.max(o / 2, f3);
            a(l.centerX(), l.centerY(), (int)f3);
            f();
            invalidate();
            return true;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

}
