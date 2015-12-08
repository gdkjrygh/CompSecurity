// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import java.nio.ByteBuffer;

public final class ajz
{

    public int a;
    int b;
    boolean c;
    private boolean d;

    private ajz(int i, int j, boolean flag)
    {
        c = false;
        a = i;
        b = j;
        d = true;
    }

    public static ajz a()
    {
        return new ajz(b.b(), 3553, true);
    }

    public static ajz b()
    {
        return new ajz(b.b(), 36197, true);
    }

    public final void a(int i, int j)
    {
        b.a(a, b, i, j);
        c = true;
    }

    public final void a(ByteBuffer bytebuffer, int i, int j)
    {
        b.a(a, b, bytebuffer, i, j);
        c = true;
    }

    public final void b(int i, int j)
    {
        GLES20.glBindTexture(b, a);
        GLES20.glTexParameteri(b, i, j);
        GLES20.glBindTexture(b, 0);
    }

    public final void c()
    {
        GLES20.glBindTexture(b, a);
        GLES20.glTexParameteri(b, 10241, 9987);
        GLES20.glGenerateMipmap(b);
        GLES20.glBindTexture(b, 0);
    }

    public final void d()
    {
        GLES20.glBindTexture(b, a);
        b.d();
        GLES20.glBindTexture(b, 0);
    }

    public final void e()
    {
        if (b.b(a) && d)
        {
            b.c(a);
        }
        a = 0;
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        return (new StringBuilder(49)).append("TextureSource(id=").append(i).append(", target=").append(j).append(")").toString();
    }
}
