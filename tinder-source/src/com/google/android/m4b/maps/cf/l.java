// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            u, g

public final class l extends u
{

    private ByteBuffer b;
    private int c;
    private int d;
    private final ShortBuffer e;
    private final int f;
    private int g[];
    private int h[];

    public final boolean a(g g1, f.a a1)
    {
        boolean flag = super.a(g1, a1);
        if (flag)
        {
            if (a1.d)
            {
                GLES20.glGenBuffers(1, g, 0);
                GLES20.glBindBuffer(34962, g[0]);
                b.position(0);
                GLES20.glBufferData(34962, c * d, b, 35044);
                GLES20.glBindBuffer(34962, 0);
                com.google.android.m4b.maps.cf.g.a("InterleavedVertexData", "glBindBuffers");
                if (e != null)
                {
                    GLES20.glGenBuffers(1, h, 0);
                    GLES20.glBindBuffer(34963, h[0]);
                    e.position(0);
                    GLES20.glBufferData(34963, f * 2, e, 35044);
                    GLES20.glBindBuffer(34963, 0);
                    com.google.android.m4b.maps.cf.g.a("InterleavedVertexData", "glBindBuffers");
                }
            } else
            {
                GLES20.glDeleteBuffers(1, g, 0);
                g[0] = 0;
                if (e != null)
                {
                    GLES20.glDeleteBuffers(1, h, 0);
                    h[0] = 0;
                    return flag;
                }
            }
        }
        return flag;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof l)
        {
            if (g[0] == ((l) (obj = (l)obj)).g[0] && h[0] == ((l) (obj)).h[0])
            {
                return true;
            }
        }
        return false;
    }
}
