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
import java.util.List;
import java.util.Map;

public abstract class SharedElementCallback
{

    private static final String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    private static final String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static int MAX_IMAGE_SIZE = 0x100000;
    private Matrix mTempMatrix;

    public SharedElementCallback()
    {
    }

    private static Bitmap createDrawableBitmap(Drawable drawable)
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

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
    {
        if (!(view instanceof ImageView)) goto _L2; else goto _L1
_L1:
        Object obj;
        ImageView imageview;
        Object obj2;
        imageview = (ImageView)view;
        obj = imageview.getDrawable();
        obj2 = imageview.getBackground();
        if (obj == null || obj2 != null) goto _L2; else goto _L3
_L3:
        obj2 = createDrawableBitmap(((Drawable) (obj)));
        if (obj2 == null) goto _L2; else goto _L4
_L4:
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj2)));
        ((Bundle) (obj)).putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().toString());
        if (imageview.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
        {
            view = imageview.getImageMatrix();
            matrix = new float[9];
            view.getValues(matrix);
            ((Bundle) (obj)).putFloatArray("sharedElement:snapshot:imageMatrix", matrix);
        }
_L6:
        return ((Parcelable) (obj));
_L2:
        int j = Math.round(rectf.width());
        int i = Math.round(rectf.height());
        Object obj1 = null;
        obj = obj1;
        if (j > 0)
        {
            obj = obj1;
            if (i > 0)
            {
                float f = Math.min(1.0F, (float)MAX_IMAGE_SIZE / (float)(j * i));
                j = (int)((float)j * f);
                i = (int)((float)i * f);
                if (mTempMatrix == null)
                {
                    mTempMatrix = new Matrix();
                }
                mTempMatrix.set(matrix);
                mTempMatrix.postTranslate(-rectf.left, -rectf.top);
                mTempMatrix.postScale(f, f);
                matrix = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
                rectf = new Canvas(matrix);
                rectf.concat(mTempMatrix);
                view.draw(rectf);
                return matrix;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable)
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

    public void onMapSharedElements(List list, Map map)
    {
    }

    public void onRejectSharedElements(List list)
    {
    }

    public void onSharedElementEnd(List list, List list1, List list2)
    {
    }

    public void onSharedElementStart(List list, List list1, List list2)
    {
    }

}
