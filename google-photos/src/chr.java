// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.Callable;

final class chr
    implements Callable
{

    private chy a;
    private Bitmap b;
    private chq c;

    chr(chq chq1, chy chy1, Bitmap bitmap)
    {
        c = chq1;
        a = chy1;
        b = bitmap;
        super();
    }

    public final Object call()
    {
        int i = a.d();
        int j = a.e();
        Bitmap bitmap;
        ByteBuffer bytebuffer;
        Pair pair;
        int ai[];
        if (b == null || !b.isMutable() || i != b.getWidth() || j != b.getHeight())
        {
            bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        } else
        {
            bitmap = b;
        }
        pair = chq.a(c, i * j);
        bytebuffer = (ByteBuffer)pair.first;
        ai = (int[])pair.second;
        aln.a("glReadPixels");
        GLES20.glReadPixels(0, 0, i, j, 6408, 5121, bytebuffer);
        b.i("glReadPixels");
        aln.a();
        bytebuffer.asIntBuffer().get(ai, 0, i * j);
        chq.a(ai, i, j);
        bitmap.setPixels(ai, 0, i, 0, 0, i, j);
        return bitmap;
    }
}
