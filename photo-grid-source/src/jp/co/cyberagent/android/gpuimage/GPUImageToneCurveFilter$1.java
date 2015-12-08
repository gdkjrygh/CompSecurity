// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageToneCurveFilter

class this._cls0
    implements Runnable
{

    final GPUImageToneCurveFilter this$0;

    public void run()
    {
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, GPUImageToneCurveFilter.access$000(GPUImageToneCurveFilter.this)[0]);
        if (GPUImageToneCurveFilter.access$100(GPUImageToneCurveFilter.this).size() >= 256 && GPUImageToneCurveFilter.access$200(GPUImageToneCurveFilter.this).size() >= 256 && GPUImageToneCurveFilter.access$300(GPUImageToneCurveFilter.this).size() >= 256 && GPUImageToneCurveFilter.access$400(GPUImageToneCurveFilter.this).size() >= 256)
        {
            byte abyte0[] = new byte[2048];
            for (int i = 0; i < 256; i++)
            {
                float f = i;
                abyte0[i * 4 + 2] = (byte)((int)Math.min(Math.max(((Float)GPUImageToneCurveFilter.access$400(GPUImageToneCurveFilter.this).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4 + 1] = (byte)((int)Math.min(Math.max(((Float)GPUImageToneCurveFilter.access$400(GPUImageToneCurveFilter.this).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4] = (byte)((int)Math.min(Math.max(((Float)GPUImageToneCurveFilter.access$400(GPUImageToneCurveFilter.this).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                abyte0[i * 4 + 3] = -1;
                f = i;
                abyte0[i * 4 + 2 + 1024] = (byte)((int)Math.min(Math.max(((Float)GPUImageToneCurveFilter.access$300(GPUImageToneCurveFilter.this).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4 + 1 + 1024] = (byte)((int)Math.min(Math.max(((Float)GPUImageToneCurveFilter.access$200(GPUImageToneCurveFilter.this).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4 + 1024] = (byte)((int)Math.min(Math.max(((Float)GPUImageToneCurveFilter.access$100(GPUImageToneCurveFilter.this).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                abyte0[i * 4 + 3 + 1024] = -1;
            }

            GLES20.glTexImage2D(3553, 0, 6408, 256, 2, 0, 6408, 5121, ByteBuffer.wrap(abyte0));
        }
    }

    A()
    {
        this$0 = GPUImageToneCurveFilter.this;
        super();
    }
}
