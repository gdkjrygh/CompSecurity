// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.kik.sdkutils.y;
import java.util.ArrayList;
import java.util.Iterator;
import kik.android.chat.KikApplication;
import kik.android.util.bf;

public class VideoKeyFrameView extends View
{
    private final class a extends bf
    {

        final VideoKeyFrameView a;
        private int b;

        private transient Bitmap a()
        {
            Object obj1 = VideoKeyFrameView.b(a).getFrameAtTime(VideoKeyFrameView.a(a) * (long)b * 1000L);
            Object obj;
            Object obj2;
            obj = obj1;
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            obj2 = obj1;
            obj = VideoKeyFrameView.b(a).getFrameAtTime(VideoKeyFrameView.a(a) * (long)b * 1000L + 100L);
            if (obj == null) goto _L2; else goto _L1
_L1:
            obj2 = obj;
            obj1 = obj;
            Bitmap bitmap = VideoKeyFrameView.a(((Bitmap) (obj)), VideoKeyFrameView.c(a), VideoKeyFrameView.d(a));
            obj2 = obj;
            obj1 = obj;
            ((Bitmap) (obj)).recycle();
            return bitmap;
            obj1;
            obj = null;
_L3:
            com.a.a.a.a(((Exception) (obj1)).getMessage());
            return ((Bitmap) (obj));
            obj;
            return null;
            obj;
            return ((Bitmap) (obj2));
            Exception exception;
            exception;
            obj = obj1;
            obj1 = exception;
            if (true) goto _L3; else goto _L2
_L2:
            return ((Bitmap) (obj));
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a();
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (Bitmap)obj;
            if (b < VideoKeyFrameView.e(a))
            {
                VideoKeyFrameView.f(a).add(obj);
                a.invalidate();
                (a. new a(b + 1)).a(new Void[0]);
            }
        }

        public a(int i1)
        {
            a = VideoKeyFrameView.this;
            super();
            b = i1;
        }
    }

    public static interface b
    {

        public abstract void a(float f1, int i1);
    }


    final float a;
    private Drawable b;
    private Drawable c;
    private Drawable d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private Paint k;
    private Paint l;
    private boolean m;
    private boolean n;
    private boolean o;
    private float p;
    private ArrayList q;
    private int r;
    private int s;
    private int t;
    private long u;
    private long v;
    private MediaMetadataRetriever w;
    private b x;

    public VideoKeyFrameView(Context context)
    {
        super(context);
        m = false;
        n = false;
        o = false;
        q = new ArrayList();
        a = getContext().getResources().getDisplayMetrics().density;
    }

    public VideoKeyFrameView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        m = false;
        n = false;
        o = false;
        q = new ArrayList();
        a = getContext().getResources().getDisplayMetrics().density;
    }

    public VideoKeyFrameView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        m = false;
        n = false;
        o = false;
        q = new ArrayList();
        a = getContext().getResources().getDisplayMetrics().density;
    }

    private int a(int i1)
    {
        return KikApplication.a(j * i1) + j * i1;
    }

    static long a(VideoKeyFrameView videokeyframeview)
    {
        return videokeyframeview.u;
    }

    public static Bitmap a(Bitmap bitmap, int i1, int j1)
    {
        int k1 = bitmap.getWidth();
        int l1 = bitmap.getHeight();
        float f2 = Math.max((float)j1 / (float)k1, (float)i1 / (float)l1);
        float f1 = (float)k1 * f2;
        f2 = (float)l1 * f2;
        float f3 = ((float)j1 - f1) / 2.0F;
        float f4 = ((float)i1 - f2) / 2.0F;
        RectF rectf = new RectF(f3, f4, f1 + f3, f2 + f4);
        Bitmap bitmap1 = Bitmap.createBitmap(j1, i1, bitmap.getConfig());
        (new Canvas(bitmap1)).drawBitmap(bitmap, null, rectf, null);
        return bitmap1;
    }

    static MediaMetadataRetriever b(VideoKeyFrameView videokeyframeview)
    {
        return videokeyframeview.w;
    }

    static int c(VideoKeyFrameView videokeyframeview)
    {
        return videokeyframeview.r;
    }

    static int d(VideoKeyFrameView videokeyframeview)
    {
        return videokeyframeview.s;
    }

    static int e(VideoKeyFrameView videokeyframeview)
    {
        return videokeyframeview.t;
    }

    private void e()
    {
        o = false;
        n = false;
        m = false;
    }

    static ArrayList f(VideoKeyFrameView videokeyframeview)
    {
        return videokeyframeview.q;
    }

    public final void a()
    {
        j = 16;
    }

    public final void a(float f1)
    {
        h = f1;
        f = h;
    }

    public final void a(Paint paint, Paint paint1)
    {
        k = paint;
        l = paint1;
    }

    public final void a(Drawable drawable, Drawable drawable1, Drawable drawable2)
    {
        b = drawable;
        c = drawable1;
        d = drawable2;
    }

    public final void a(String s1, long l1)
    {
        w = new MediaMetadataRetriever();
        w.setDataSource(s1);
        v = l1;
    }

    public final void a(b b1)
    {
        x = b1;
    }

    public final float b()
    {
        return e;
    }

    public final void b(float f1)
    {
        i = (float)(1 / a(1)) + f1;
    }

    public final float c()
    {
        return f;
    }

    public final void c(float f1)
    {
        g = f1;
        invalidate();
    }

    public final float d()
    {
        return g;
    }

    protected void onDraw(Canvas canvas)
    {
        int k1 = getMeasuredHeight() - KikApplication.a(16);
        float f1 = getMeasuredWidth() - a(2);
        float f2 = e * f1 + (float)a(1);
        float f3 = f * f1 + (float)a(1);
        float f4 = g;
        float f5 = a(1);
        int l1 = KikApplication.a(30);
        canvas.drawRect(a(1), l1, 20F + ((float)KikApplication.a(j) + f1), KikApplication.a(36) + l1, l);
        if (y.a(10) && !q.isEmpty())
        {
            for (int i1 = 0; (float)(a(1) + s * i1) < f1 && i1 < q.size(); i1++)
            {
                Bitmap bitmap = (Bitmap)q.get(i1);
                if (bitmap != null)
                {
                    canvas.drawBitmap(bitmap, a(1) + s * i1, KikApplication.a(30), null);
                }
            }

        }
        canvas.drawRect(a(1), l1, f2, KikApplication.a(36) + l1, k);
        canvas.drawRect(f3, l1, f1 + (float)a(1), KikApplication.a(36) + l1, k);
        int j1 = (int)(f4 * f1 + f5) - d.getIntrinsicWidth() / 2;
        d.setBounds(j1, 0, d.getIntrinsicWidth() + j1, d.getIntrinsicHeight());
        d.draw(canvas);
        j1 = (int)f2 - b.getIntrinsicWidth() / 2 - KikApplication.a(9);
        b.setBounds(j1, k1 - b.getIntrinsicHeight(), b.getIntrinsicWidth() + j1, k1);
        b.draw(canvas);
        j1 = ((int)f3 - c.getIntrinsicWidth() / 2) + KikApplication.a(10);
        c.setBounds(j1, k1 - c.getIntrinsicHeight(), c.getIntrinsicWidth() + j1, k1);
        c.draw(canvas);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (y.a(10))
        {
            Iterator iterator = q.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Bitmap bitmap = (Bitmap)iterator.next();
                if (bitmap != null)
                {
                    bitmap.recycle();
                }
            } while (true);
            q.clear();
            r = KikApplication.a(36);
            t = (getMeasuredWidth() - a(2)) / r;
            s = (int)((float)(getMeasuredWidth() - a(2)) / (float)t);
            u = v / (long)t;
            (new a(0)).a(new Void[0]);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        float f3 = motionevent.getX();
        float f5 = motionevent.getY();
        int i1 = getMeasuredWidth() - a(2);
        float f1 = i1;
        float f2 = e;
        f1 = (float)a(1) + f1 * f2;
        f2 = (float)i1 * f + (float)a(1);
        float f4 = (float)i1 * g + (float)a(1);
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            if (f1 - (float)(b.getIntrinsicWidth() * 3) <= f3 && f3 <= (float)b.getIntrinsicWidth() + f1 && f5 >= (float)(getMeasuredHeight() - KikApplication.a(j) - b.getIntrinsicHeight()) && f5 <= (float)getMeasuredHeight())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                m = true;
                p = f3 - f1;
            } else
            {
                if (f2 - (float)c.getIntrinsicWidth() <= f3 && f3 <= (float)(c.getIntrinsicWidth() * 3) + f2 && f5 >= (float)(getMeasuredHeight() - c.getIntrinsicHeight() - KikApplication.a(j)) && f5 <= (float)getMeasuredHeight())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    n = true;
                    p = f3 - f2;
                } else
                {
                    i1 = ((flag) ? 1 : 0);
                    if (f4 - (float)d.getIntrinsicWidth() - 10F <= f3)
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (f3 <= (float)d.getIntrinsicWidth() + f4 + 10F)
                        {
                            i1 = ((flag) ? 1 : 0);
                            if (f5 >= 0.0F)
                            {
                                i1 = ((flag) ? 1 : 0);
                                if (f5 <= (float)(getMeasuredHeight() - b.getIntrinsicHeight()))
                                {
                                    i1 = 1;
                                }
                            }
                        }
                    }
                    if (i1 != 0)
                    {
                        o = true;
                        p = f3 - f4;
                    }
                }
            }
            return true;

        case 1: // '\001'
            e();
            return true;

        case 3: // '\003'
            e();
            return true;

        case 2: // '\002'
            break;
        }
        if (m)
        {
            f3 -= p;
            if (f3 < (float)a(1))
            {
                f1 = a(1);
            } else
            {
                f1 = f2;
                if (f3 <= f2)
                {
                    f1 = f3;
                }
            }
            f2 = e;
            e = (f1 - (float)a(1)) / (float)i1;
            if (f - e > h || f - e < i)
            {
                f = Math.min(1.0F, f - (f2 - e));
                if (x != null)
                {
                    x.a(f, 2);
                }
                if (g > f)
                {
                    g = f;
                }
                if (f - e < i)
                {
                    e = f2;
                }
            }
            if (x != null)
            {
                x.a(e, 1);
            }
            if (f1 > f4)
            {
                g = e;
            }
        } else
        if (n)
        {
            f2 = f3 - p;
            if (f2 >= f1)
            {
                f1 = f2;
                if (f2 > (float)(a(1) + i1))
                {
                    f1 = a(1) + i1;
                }
            }
            f2 = f;
            f = (f1 - (float)a(1)) / (float)i1;
            if (f - e > h || f - e < i)
            {
                e = Math.max(0.0F, (e + f) - f2);
                if (x != null)
                {
                    x.a(e, 1);
                }
                if (g < e)
                {
                    g = e;
                }
                if (f - e < i)
                {
                    f = f2;
                }
            }
            if (x != null)
            {
                x.a(f, 2);
            }
            if (f4 > f1)
            {
                g = f;
            }
        } else
        if (o)
        {
            f3 -= p;
            if (f3 >= f1)
            {
                if (f3 > f2)
                {
                    f1 = f2;
                } else
                {
                    f1 = f3;
                }
            }
            g = (f1 - (float)a(1)) / (float)i1;
            if (x != null)
            {
                x.a(g, 3);
            }
        }
        invalidate();
        return true;
    }
}
