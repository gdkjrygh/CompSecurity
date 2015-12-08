// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.app:
//            am

public final class android.support.v4.app.a extends android.support.v4.b.a
{
    public static interface a
    {

        public abstract void onRequestPermissionsResult(int i, String as[], int ai[]);
    }

    private static final class b extends b.a
    {

        private am a;

        public final Parcelable a(View view, Matrix matrix, RectF rectf)
        {
            am am1 = a;
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
            obj2 = am.a(((android.graphics.drawable.Drawable) (obj)));
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
                    float f = Math.min(1.0F, (float)am.b / (float)(j * i));
                    j = (int)((float)j * f);
                    i = (int)((float)i * f);
                    if (am1.a == null)
                    {
                        am1.a = new Matrix();
                    }
                    am1.a.set(matrix);
                    am1.a.postTranslate(-rectf.left, -rectf.top);
                    am1.a.postScale(f, f);
                    matrix = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
                    rectf = new Canvas(matrix);
                    rectf.concat(am1.a);
                    view.draw(rectf);
                    return matrix;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final View a(Context context, Parcelable parcelable)
        {
            return am.a(context, parcelable);
        }

        public b(am am1)
        {
            a = am1;
        }
    }


    static b.a a(am am)
    {
        b b1 = null;
        if (am != null)
        {
            b1 = new b(am);
        }
        return b1;
    }

    public static void a(Activity activity, String as[], int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            if (activity instanceof c.a)
            {
                ((c.a)activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(as, i);
        } else
        if (activity instanceof a)
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable(as, activity, i) {

                final String a[];
                final Activity b;
                final int c;

                public final void run()
                {
                    int ai[] = new int[a.length];
                    PackageManager packagemanager = b.getPackageManager();
                    String s = b.getPackageName();
                    int k = a.length;
                    for (int j = 0; j < k; j++)
                    {
                        ai[j] = packagemanager.checkPermission(a[j], s);
                    }

                    ((a)b).onRequestPermissionsResult(c, a, ai);
                }

            
            {
                a = as;
                b = activity;
                c = i;
                super();
            }
            });
            return;
        }
    }
}
