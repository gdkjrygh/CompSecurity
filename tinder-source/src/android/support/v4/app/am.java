// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

public abstract class am
{

    static int b = 0x100000;
    Matrix a;

    static Bitmap a(Drawable drawable)
    {
        int i = drawable.getIntrinsicWidth();
        int j = drawable.getIntrinsicHeight();
        if (i <= 0 || j <= 0)
        {
            return null;
        }
        float f = Math.min(1.0F, (float)b / (float)(i * j));
        if ((drawable instanceof BitmapDrawable) && f == 1.0F)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            i = (int)((float)i * f);
            j = (int)((float)j * f);
            Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Rect rect = drawable.getBounds();
            int k = rect.left;
            int l = rect.top;
            int i1 = rect.right;
            int j1 = rect.bottom;
            drawable.setBounds(0, 0, i, j);
            drawable.draw(canvas);
            drawable.setBounds(k, l, i1, j1);
            return bitmap;
        }
    }

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

}
