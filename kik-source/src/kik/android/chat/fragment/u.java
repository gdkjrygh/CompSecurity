// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;
import kik.android.i.d;
import kik.android.util.bx;
import kik.android.widget.AspectRatioImageView;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class u
    implements android.hardware.Camera.PictureCallback
{

    final CameraFragment a;

    u(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final void onPictureTaken(byte abyte0[], Camera camera)
    {
        Object obj2;
        int i;
        obj2 = null;
        if (kik.android.chat.fragment.CameraFragment.d(a) != null)
        {
            CameraFragment.f(a);
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        i = 0;
        camera = null;
_L5:
        Object obj;
        Object obj1;
        obj = camera;
        obj1 = obj2;
        if (i >= kik.android.util.u.a.length) goto _L2; else goto _L1
_L1:
        obj = kik.android.util.u.a(abyte0, kik.android.util.u.a[i]);
        if (obj == null) goto _L4; else goto _L3
_L3:
        Matrix matrix;
        Object obj3;
        obj3 = CameraFragment.a(a, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), CameraFragment.g(a));
        obj1 = ((d) (obj3)).a();
        int j = CameraFragment.h(a);
        matrix = new Matrix();
        matrix.postRotate(j);
        if (CameraFragment.i(a))
        {
            matrix.postScale(-1F, 1.0F);
            matrix.postTranslate(((Point) (obj1)).x, 0.0F);
        }
        obj3 = ((d) (obj3)).b();
        obj1 = Bitmap.createBitmap(((Bitmap) (obj)), ((Point) (obj3)).x, ((Point) (obj3)).y, ((Point) (obj1)).x, ((Point) (obj1)).y, matrix, true);
        obj = camera;
_L2:
        if (obj1 == null)
        {
            if (obj != null)
            {
                bx.a(((Throwable) (obj)));
            }
            CameraFragment.j(a);
            CameraFragment.k(a);
            return;
        } else
        {
            CameraFragment.a(a, ((Bitmap) (obj1)));
            a._previewImage.setImageBitmap(CameraFragment.l(a));
            CameraFragment.k(a);
            CameraFragment.m(a);
            return;
        }
        camera;
_L4:
        i++;
          goto _L5
        bx.a(new Exception("Null data returned from onPictureTaken"));
        obj = null;
        obj1 = obj2;
          goto _L2
    }
}
