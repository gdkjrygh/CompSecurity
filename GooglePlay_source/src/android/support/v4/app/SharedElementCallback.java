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
import java.util.List;

public abstract class SharedElementCallback
{

    static int MAX_IMAGE_SIZE = 0x100000;
    Matrix mTempMatrix;

    public SharedElementCallback()
    {
    }

    static Bitmap createDrawableBitmap(Drawable drawable)
    {
        int i = drawable.getIntrinsicWidth();
        int j = drawable.getIntrinsicHeight();
        if (i <= 0 || j <= 0)
        {
            return null;
        }
        float f = Math.min(1.0F, (float)MAX_IMAGE_SIZE / (float)(i * j));
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

    public static View onCreateSnapshotView(Context context, Parcelable parcelable)
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

    public void onSharedElementStart$70d861b8(List list)
    {
    }

}
