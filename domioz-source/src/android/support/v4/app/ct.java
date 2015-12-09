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

public abstract class ct
{

    private static int b = 0x100000;
    private Matrix a;

    public static View a(Context context, Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            Bitmap bitmap = (Bitmap)parcelable.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null)
            {
                return null;
            }
            context = new ImageView(context);
            context.setImageBitmap(bitmap);
            context.setScaleType(android.widget.ImageView.ScaleType.valueOf(parcelable.getString("sharedElement:snapshot:imageScaleType")));
            if (context.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
            {
                parcelable = parcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(parcelable);
                context.setImageMatrix(matrix);
            }
        } else
        if (parcelable instanceof Bitmap)
        {
            parcelable = (Bitmap)parcelable;
            context = new ImageView(context);
            context.setImageBitmap(parcelable);
        } else
        {
            context = null;
        }
        return context;
    }

    public final Parcelable a(View view, Matrix matrix, RectF rectf)
    {
        if (!(view instanceof ImageView)) goto _L2; else goto _L1
_L1:
        Object obj;
        ImageView imageview;
        Drawable drawable;
        imageview = (ImageView)view;
        drawable = imageview.getDrawable();
        obj = imageview.getBackground();
        if (drawable == null || obj != null) goto _L2; else goto _L3
_L3:
        int i = drawable.getIntrinsicWidth();
        int k = drawable.getIntrinsicHeight();
        if (i <= 0 || k <= 0)
        {
            obj = null;
        } else
        {
            float f = Math.min(1.0F, (float)b / (float)(i * k));
            if ((drawable instanceof BitmapDrawable) && f == 1.0F)
            {
                obj = ((BitmapDrawable)drawable).getBitmap();
            } else
            {
                i = (int)((float)i * f);
                k = (int)((float)k * f);
                obj = Bitmap.createBitmap(i, k, android.graphics.Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(((Bitmap) (obj)));
                Rect rect = drawable.getBounds();
                int i1 = rect.left;
                int j1 = rect.top;
                int k1 = rect.right;
                int l1 = rect.bottom;
                drawable.setBounds(0, 0, i, k);
                drawable.draw(canvas);
                drawable.setBounds(i1, j1, k1, l1);
            }
        }
        if (obj == null) goto _L2; else goto _L4
_L4:
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
        obj = view;
_L6:
        return ((Parcelable) (obj));
_L2:
        int l = Math.round(rectf.width());
        int j = Math.round(rectf.height());
        Object obj1 = null;
        obj = obj1;
        if (l > 0)
        {
            obj = obj1;
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
                matrix = Bitmap.createBitmap(l, j, android.graphics.Bitmap.Config.ARGB_8888);
                rectf = new Canvas(matrix);
                rectf.concat(a);
                view.draw(rectf);
                return matrix;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

}
