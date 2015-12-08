// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import p.e.e;

// Referenced classes of package com.pandora.android.util:
//            s

public class UrlImageView extends ImageView
{
    class a extends AsyncTask
    {

        final UrlImageView a;
        private String b;

        public transient BitmapDrawable a(String as[])
        {
            b = as[0];
            if (b != null && b.length() != 0) goto _L2; else goto _L1
_L1:
            return null;
_L2:
            as = (new URL(b)).openConnection().getInputStream();
            if (isCancelled()) goto _L1; else goto _L3
_L3:
            as = UrlImageView.a(BitmapFactory.decodeStream(as), UrlImageView.a(a), UrlImageView.b(a));
            as = new BitmapDrawable(a.getResources(), as);
_L5:
            return as;
            as;
            as.printStackTrace();
            as = null;
            continue; /* Loop/switch isn't completed */
            as;
            as.printStackTrace();
            as = null;
            continue; /* Loop/switch isn't completed */
            as;
            as.printStackTrace();
            as = null;
            continue; /* Loop/switch isn't completed */
            as;
            as.printStackTrace();
            as = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

        protected void a(BitmapDrawable bitmapdrawable)
        {
            if (bitmapdrawable != null)
            {
                UrlImageView.a(a, b, bitmapdrawable);
                a.setImageDrawable(bitmapdrawable);
            }
        }

        public Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((BitmapDrawable)obj);
        }

        a()
        {
            a = UrlImageView.this;
            super();
        }
    }


    private float a;
    private int b;
    private e c;

    public UrlImageView(Context context)
    {
        this(context, null, 0);
    }

    public UrlImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UrlImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 10F;
        b = 0;
        c = new e(4);
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.RoundUrlImageView);
        a = context.getDimension(0, 0.0F);
        b = context.getInt(1, 15);
        context.recycle();
    }

    static int a(UrlImageView urlimageview)
    {
        return urlimageview.b;
    }

    public static Bitmap a(Bitmap bitmap, int i, float f)
        throws IllegalArgumentException
    {
        if (bitmap == null)
        {
            throw new IllegalArgumentException("inpBitmap is null");
        }
        int k = bitmap.getWidth();
        int j = bitmap.getHeight();
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        Rect rect;
        RectF rectf;
        int l;
        boolean flag;
        boolean flag1;
        if (k <= j)
        {
            j = k;
        } else
        {
            k = j;
            l = j;
            j = k;
            k = l;
        }
        bitmap1 = Bitmap.createBitmap(k, j, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        paint = new Paint();
        rect = new Rect(0, 0, k, j);
        rectf = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(0xff424242);
        canvas.drawRoundRect(rectf, f, f, paint);
        if ((i & 1) != 1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if ((i & 2) != 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 4) != 4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i & 8) != 8)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (l != 0)
        {
            canvas.drawRect(0.0F, 0.0F, k / 2, j / 2, paint);
        }
        if (flag)
        {
            canvas.drawRect(k / 2, 0.0F, k, j / 2, paint);
        }
        if (i != 0)
        {
            canvas.drawRect(0.0F, j / 2, k / 2, j, paint);
        }
        if (flag1)
        {
            canvas.drawRect(k / 2, j / 2, k, j, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        bitmap.recycle();
        return bitmap1;
    }

    private BitmapDrawable a(String s1)
    {
        return (BitmapDrawable)c.a(s1);
    }

    static void a(UrlImageView urlimageview, String s1, BitmapDrawable bitmapdrawable)
    {
        urlimageview.a(s1, bitmapdrawable);
    }

    private void a(String s1, BitmapDrawable bitmapdrawable)
    {
        synchronized (c)
        {
            if (a(s1) == null)
            {
                c.a(s1, bitmapdrawable);
            }
        }
        return;
        s1;
        e1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static float b(UrlImageView urlimageview)
    {
        return urlimageview.a;
    }

    public void setImageUrl(String s1)
    {
        if (s.a(s1))
        {
            return;
        }
        BitmapDrawable bitmapdrawable = a(s1);
        if (bitmapdrawable != null)
        {
            setImageDrawable(bitmapdrawable);
            return;
        } else
        {
            (new a()).execute(new String[] {
                s1
            });
            return;
        }
    }

    public void setRoundedCorners(int i)
    {
        b = i;
    }
}
