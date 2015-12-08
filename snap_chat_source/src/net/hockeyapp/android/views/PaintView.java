// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

public class PaintView extends ImageView
{

    public Stack a;
    private Path b;
    private Paint c;
    private float d;
    private float e;

    public PaintView(Context context, Uri uri, int i, int j)
    {
        super(context);
        b = new Path();
        a = new Stack();
        c = new Paint();
        c.setAntiAlias(true);
        c.setDither(true);
        c.setColor(0xffff0000);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        c.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        c.setStrokeWidth(12F);
        (new AsyncTask() {

            private PaintView a;

            private static transient Bitmap a(Object aobj[])
            {
                Context context1 = (Context)aobj[0];
                Uri uri1 = (Uri)aobj[1];
                Integer integer = (Integer)aobj[2];
                aobj = (Integer)aobj[3];
                try
                {
                    aobj = PaintView.a(context1.getContentResolver(), uri1, integer.intValue(), ((Integer) (aobj)).intValue());
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return ((Bitmap) (aobj));
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a(aobj);
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (Bitmap)obj;
                if (obj != null)
                {
                    a.setImageBitmap(((Bitmap) (obj)));
                }
            }

            protected final void onPreExecute()
            {
                a.setAdjustViewBounds(true);
            }

            
            {
                a = PaintView.this;
                super();
            }
        }).execute(new Object[] {
            context, uri, Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    public static int a(ContentResolver contentresolver, Uri uri)
    {
        int i = 1;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        float f;
        int j;
        try
        {
            BitmapFactory.decodeStream(contentresolver.openInputStream(uri), null, options);
            f = options.outWidth;
            j = options.outHeight;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            return 1;
        }
        if (f / (float)j > 1.0F)
        {
            i = 0;
        }
        return i;
    }

    private static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int l = 1;
        int k = 1;
        if (i1 > j || j1 > i)
        {
            i1 /= 2;
            j1 /= 2;
            do
            {
                l = k;
                if (i1 / k <= j)
                {
                    break;
                }
                l = k;
                if (j1 / k <= i)
                {
                    break;
                }
                k <<= 1;
            } while (true);
        }
        return l;
    }

    static Bitmap a(ContentResolver contentresolver, Uri uri, int i, int j)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentresolver.openInputStream(uri), null, options);
        options.inSampleSize = a(options, i, j);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(contentresolver.openInputStream(uri), null, options);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); canvas.drawPath((Path)iterator.next(), c)) { }
        canvas.drawPath(b, c);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        f = motionevent.getX();
        f1 = motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 161
    //                   2 75;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        b.reset();
        b.moveTo(f, f1);
        d = f;
        e = f1;
        invalidate();
        continue; /* Loop/switch isn't completed */
_L4:
        float f2 = Math.abs(f - d);
        float f3 = Math.abs(f1 - e);
        if (f2 >= 4F || f3 >= 4F)
        {
            b.quadTo(d, e, (d + f) / 2.0F, (e + f1) / 2.0F);
            d = f;
            e = f1;
        }
        invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        b.lineTo(d, e);
        a.push(b);
        b = new Path();
        invalidate();
        if (true) goto _L1; else goto _L5
_L5:
    }
}
