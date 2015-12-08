// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import java.lang.ref.WeakReference;

final class ist extends AsyncTask
{

    private final WeakReference a;
    private final int b;
    private final int c;
    private final float d;
    private final isf e;
    private final int f;
    private final int g;
    private final Context h;

    public ist(Context context, isr isr1, int i, int j, isf isf1, float f1)
    {
        h = context;
        a = new WeakReference(isr1);
        b = i;
        c = j;
        d = f1;
        e = isf1;
        f = isr1.getMeasuredWidth();
        g = isr1.getMeasuredHeight();
    }

    protected final Object doInBackground(Object aobj[])
    {
        Object obj = ((Bitmap[])aobj)[0];
        Bitmap bitmap = isr.d().a(f, g);
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            bitmap.setHasAlpha(true);
        }
        Canvas canvas = new Canvas(bitmap);
        Object obj1 = null;
        aobj = ((Object []) (obj1));
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            aobj = ((Object []) (obj1));
            if (d > 0.0F)
            {
                float f1 = d;
                int k = ((Bitmap) (obj)).getWidth();
                int i = ((Bitmap) (obj)).getHeight();
                k /= 4;
                i /= 4;
                aobj = isr.d().a(k, i);
                (new Canvas(((Bitmap) (aobj)))).drawBitmap(((Bitmap) (obj)), null, new Rect(0, 0, k, i), null);
                Object obj2 = RenderScript.create(h);
                obj1 = ScriptIntrinsicBlur.create(((RenderScript) (obj2)), Element.U8_4(((RenderScript) (obj2))));
                Allocation allocation = Allocation.createFromBitmap(((RenderScript) (obj2)), ((Bitmap) (aobj)));
                obj2 = Allocation.createFromBitmap(((RenderScript) (obj2)), ((Bitmap) (aobj)));
                ((ScriptIntrinsicBlur) (obj1)).setRadius(Math.min(25F, f1 / 4F));
                ((ScriptIntrinsicBlur) (obj1)).setInput(allocation);
                ((ScriptIntrinsicBlur) (obj1)).forEach(((Allocation) (obj2)));
                ((Allocation) (obj2)).copyTo(((Bitmap) (aobj)));
            }
        }
        if (aobj != null)
        {
            obj = ((Object) (aobj));
        }
        int j1 = f;
        int k1 = g;
        Rect rect;
        Paint paint;
        int j;
        boolean flag;
        int i1;
        if (b == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = k1;
        j = j1;
        if (flag)
        {
            i1 = Math.min(j1, k1);
            j = i1;
        }
        obj1 = new Rect(0, 0, j, i1);
        rect = new Rect();
        isr.a(((Bitmap) (obj)), ((Rect) (obj1)), rect);
        paint = new Paint(1);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(((Bitmap) (obj)), rect, ((Rect) (obj1)), paint);
        if (aobj != null)
        {
            isr.d().a(((Bitmap) (aobj)));
        }
        if (c != 0)
        {
            canvas.drawColor(c);
        }
        if (e != null)
        {
            aobj = new Rect(0, 0, f, g);
            obj = new Paint(1);
            ((Paint) (obj)).setDither(true);
            ((Paint) (obj)).setShader(new LinearGradient(e.a.a * (float)f, e.a.b * (float)g, e.a.c * (float)f, e.a.d * (float)g, e.b, e.c, android.graphics.Shader.TileMode.CLAMP));
            canvas.drawRect(((Rect) (aobj)), ((Paint) (obj)));
        }
        switch (b)
        {
        default:
            j = b;
            Log.w("StoryLayoutImageView", (new StringBuilder(36)).append("Unrecognised mask shape: ").append(j).toString());
            // fall through

        case 0: // '\0'
            return bitmap;

        case 1: // '\001'
            aobj = new Paint(1);
            ((Paint) (aobj)).setColor(0xff000000);
            ((Paint) (aobj)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
            obj = new Path();
            ((Path) (obj)).toggleInverseFillType();
            ((Path) (obj)).addCircle(f / 2, g / 2, f / 2, android.graphics.Path.Direction.CW);
            canvas.drawPath(((Path) (obj)), ((Paint) (aobj)));
            return bitmap;

        case 2: // '\002'
            j = f;
            break;
        }
        int l = g;
        i1 = (int)(1.3D * (double)j);
        aobj = new Paint(1);
        ((Paint) (aobj)).setColor(0xff000000);
        ((Paint) (aobj)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        obj = new RectF(j - i1 * 2, l / 2 - i1, j, i1 + l / 2);
        obj1 = new Path();
        ((Path) (obj1)).toggleInverseFillType();
        ((Path) (obj1)).arcTo(((RectF) (obj)), 200F, 340F);
        ((Path) (obj1)).moveTo(0.0F, l);
        ((Path) (obj1)).close();
        canvas.drawPath(((Path) (obj1)), ((Paint) (aobj)));
        return bitmap;
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (isCancelled())
        {
            obj = null;
        }
        if (a != null && obj != null)
        {
            isr isr1 = (isr)a.get();
            if (isr1 != null && isr.a(isr1) == this)
            {
                isr.a(isr1, ((Bitmap) (obj)));
            }
        }
    }
}
