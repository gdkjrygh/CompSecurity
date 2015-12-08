// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            ActivityCompat, SharedElementCallback

private static final class mCallback extends mCallback
{

    private SharedElementCallback mCallback;

    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
    {
        SharedElementCallback sharedelementcallback = mCallback;
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
        obj2 = SharedElementCallback.createDrawableBitmap(((android.graphics.drawable.Drawable) (obj)));
        if (obj2 == null) goto _L2; else goto _L4
_L4:
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj2)));
        ((Bundle) (obj)).putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().eBitmap());
        if (imageview.getScaleType() == android.widget.eBitmap)
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
                float f = Math.min(1.0F, (float)SharedElementCallback.MAX_IMAGE_SIZE / (float)(j * i));
                j = (int)((float)j * f);
                i = (int)((float)i * f);
                if (sharedelementcallback.mTempMatrix == null)
                {
                    sharedelementcallback.mTempMatrix = new Matrix();
                }
                sharedelementcallback.mTempMatrix.set(matrix);
                sharedelementcallback.mTempMatrix.postTranslate(-rectf.left, -rectf.top);
                sharedelementcallback.mTempMatrix.postScale(f, f);
                matrix = Bitmap.createBitmap(j, i, android.graphics.itmap);
                rectf = new Canvas(matrix);
                rectf.concat(sharedelementcallback.mTempMatrix);
                view.draw(rectf);
                return matrix;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final View onCreateSnapshotView(Context context, Parcelable parcelable)
    {
        return SharedElementCallback.onCreateSnapshotView(context, parcelable);
    }

    public final void onSharedElementStart$70d861b8(List list)
    {
        mCallback.onSharedElementStart$70d861b8(list);
    }

    public (SharedElementCallback sharedelementcallback)
    {
        mCallback = sharedelementcallback;
    }
}
