// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import com.spotify.mobile.android.video.exo.GlUtil;
import java.nio.Buffer;

public final class gle
{

    private final int a;
    private Buffer b;
    private int c;

    public gle(int i, String s)
    {
        a = GLES20.glGetAttribLocation(i, s);
    }

    public final void a()
    {
        if (b == null)
        {
            throw new IllegalStateException("call setBuffer before bind");
        } else
        {
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(a, c, 5126, false, 0, b);
            GLES20.glEnableVertexAttribArray(a);
            GlUtil.d();
            return;
        }
    }

    public final void a(float af[], int i)
    {
        b = GlUtil.a(af);
        c = i;
    }
}
