// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import jp.co.cyberagent.android.gpuimage.OpenGlUtils;

// Referenced classes of package jp.co.cyberagent.android.a:
//            aj

final class ak
    implements Runnable
{

    final Bitmap a;
    final aj b;

    ak(aj aj1, Bitmap bitmap)
    {
        b = aj1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        if (b.B != -1 || a == null || a.isRecycled())
        {
            return;
        } else
        {
            GLES20.glActiveTexture(33987);
            b.B = OpenGlUtils.loadTexture(a, -1, false);
            return;
        }
    }
}
