// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package jp.co.cyberagent.android.a:
//            ag

final class ah
    implements Runnable
{

    final ag a;

    ah(ag ag1)
    {
        a = ag1;
        super();
    }

    public final void run()
    {
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, ag.a(a)[0]);
        if (ag.b(a).size() >= 256 && ag.c(a).size() >= 256 && ag.d(a).size() >= 256 && ag.e(a).size() >= 256)
        {
            byte abyte0[] = new byte[2048];
            for (int i = 0; i < 256; i++)
            {
                float f = i;
                abyte0[i * 4 + 2] = (byte)((int)Math.min(Math.max(((Float)ag.e(a).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4 + 1] = (byte)((int)Math.min(Math.max(((Float)ag.e(a).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4] = (byte)((int)Math.min(Math.max(((Float)ag.e(a).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                abyte0[i * 4 + 3] = -1;
                f = i;
                abyte0[i * 4 + 2 + 1024] = (byte)((int)Math.min(Math.max(((Float)ag.d(a).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4 + 1 + 1024] = (byte)((int)Math.min(Math.max(((Float)ag.c(a).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                f = i;
                abyte0[i * 4 + 1024] = (byte)((int)Math.min(Math.max(((Float)ag.b(a).get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                abyte0[i * 4 + 3 + 1024] = -1;
            }

            GLES20.glTexImage2D(3553, 0, 6408, 256, 2, 0, 6408, 5121, ByteBuffer.wrap(abyte0));
        }
    }
}
