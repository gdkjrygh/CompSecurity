// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

public abstract class ah
{

    private static int b = 0x100000;
    private Matrix a;

    public static View a(Context context, Parcelable parcelable)
    {
        Object obj = null;
        if (!(parcelable instanceof Bundle)) goto _L2; else goto _L1
_L1:
        Object obj1 = (Bundle)parcelable;
        obj = (Bitmap)((Bundle) (obj1)).getParcelable("sharedElement:snapshot:bitmap");
        if (obj == null)
        {
            return null;
        }
        parcelable = new ImageView(context);
        context = parcelable;
        parcelable.setImageBitmap(((Bitmap) (obj)));
        parcelable.setScaleType(android.widget.ImageView.ScaleType.valueOf(((Bundle) (obj1)).getString("sharedElement:snapshot:imageScaleType")));
        obj = context;
        if (parcelable.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
        {
            obj = ((Bundle) (obj1)).getFloatArray("sharedElement:snapshot:imageMatrix");
            obj1 = new Matrix();
            ((Matrix) (obj1)).setValues(((float []) (obj)));
            parcelable.setImageMatrix(((Matrix) (obj1)));
            obj = context;
        }
_L4:
        return ((View) (obj));
_L2:
        if (parcelable instanceof Bitmap)
        {
            parcelable = (Bitmap)parcelable;
            obj = new ImageView(context);
            ((ImageView) (obj)).setImageBitmap(parcelable);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Parcelable a(View view, Matrix matrix, RectF rectf)
    {
        if (view instanceof ImageView)
        {
            ImageView imageview = (ImageView)view;
            Drawable drawable1 = imageview.getDrawable();
            Drawable drawable = imageview.getBackground();
            if (drawable1 != null && drawable == null)
            {
                int i = drawable1.getIntrinsicWidth();
                int k = drawable1.getIntrinsicHeight();
                Object obj;
                if (i <= 0 || k <= 0)
                {
                    obj = null;
                } else
                {
                    float f = Math.min(1.0F, (float)b / (float)(i * k));
                    if ((drawable1 instanceof BitmapDrawable) && f == 1.0F)
                    {
                        obj = ((BitmapDrawable)drawable1).getBitmap();
                    } else
                    {
                        i = (int)((float)i * f);
                        k = (int)((float)k * f);
                        obj = Bitmap.createBitmap(i, k, android.graphics.Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(((Bitmap) (obj)));
                        Rect rect = drawable1.getBounds();
                        int i1 = rect.left;
                        int j1 = rect.top;
                        int k1 = rect.right;
                        int l1 = rect.bottom;
                        drawable1.setBounds(0, 0, i, k);
                        drawable1.draw(canvas);
                        drawable1.setBounds(i1, j1, k1, l1);
                    }
                }
                if (obj != null)
                {
                    view = new Bundle();
                    view.putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj)));
                    view.putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().toString());
                    if (imageview.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
                    {
                        matrix = imageview.getImageMatrix();
                        rectf = new float[9];
                        matrix.getValues(rectf);
                        view.putFloatArray("sharedElement:snapshot:imageMatrix", rectf);
                    }
                    return view;
                }
            }
        }
        int l = Math.round(rectf.width());
        int j = Math.round(rectf.height());
        Object obj1 = null;
        Bitmap bitmap = obj1;
        if (l > 0)
        {
            bitmap = obj1;
            if (j > 0)
            {
                float f1 = Math.min(1.0F, (float)b / (float)(l * j));
                l = (int)((float)l * f1);
                j = (int)((float)j * f1);
                if (a == null)
                {
                    a = new Matrix();
                }
                a.set(matrix);
                a.postTranslate(-rectf.left, -rectf.top);
                a.postScale(f1, f1);
                bitmap = Bitmap.createBitmap(l, j, android.graphics.Bitmap.Config.ARGB_8888);
                matrix = new Canvas(bitmap);
                matrix.concat(a);
                view.draw(matrix);
            }
        }
        return bitmap;
    }

}
