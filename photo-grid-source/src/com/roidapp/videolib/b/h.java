// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.opengl.GLES20;
import com.roidapp.videolib.gl.g;
import java.nio.FloatBuffer;
import java.util.List;
import jp.co.cyberagent.android.a.k;

public final class h extends k
{

    private int F;
    private boolean G;

    public h()
    {
        F = 0;
        G = false;
    }

    public final void a(int i)
    {
        F = i;
    }

    public final void a(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1, float af[])
    {
        l();
        break MISSING_BLOCK_LABEL_4;
        if (m() && A != null && B != null && z != null)
        {
            int l = z.size();
            int j = 0;
            while (j < l) 
            {
                jp.co.cyberagent.android.a.h h1 = (jp.co.cyberagent.android.a.h)z.get(j);
                boolean flag;
                if (j < l - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    GLES20.glBindFramebuffer(36160, A[j]);
                    if (af != null && af.length >= 4)
                    {
                        GLES20.glClearColor(af[0], af[1], af[2], af[3]);
                    } else
                    {
                        GLES20.glClearColor(1.0F, 1.0F, 1.0F, 0.0F);
                    }
                    GLES20.glClear(16640);
                } else
                {
                    GLES20.glBindFramebuffer(36160, F);
                    g.a("glBindFramebuffer");
                    if (af != null && af.length >= 4)
                    {
                        GLES20.glClearColor(af[0], af[1], af[2], af[3]);
                    } else
                    {
                        GLES20.glClearColor(1.0F, 1.0F, 1.0F, 0.0F);
                    }
                    g.a("glClearColor");
                    GLES20.glClear(16640);
                    g.a("glClear");
                }
                if (j == 0)
                {
                    if (l == 1)
                    {
                        h1.a(i, floatbuffer, floatbuffer1);
                    } else
                    {
                        FloatBuffer floatbuffer4 = C;
                        FloatBuffer floatbuffer2;
                        if (G)
                        {
                            floatbuffer2 = floatbuffer1;
                        } else
                        {
                            floatbuffer2 = D;
                        }
                        h1.a(i, floatbuffer4, floatbuffer2);
                    }
                } else
                if (j == l - 1)
                {
                    FloatBuffer floatbuffer3;
                    boolean flag1;
                    if (G)
                    {
                        floatbuffer3 = D;
                    } else
                    {
                        floatbuffer3 = floatbuffer1;
                    }
                    if (G)
                    {
                        flag1 = false;
                    } else
                    {
                        flag1 = true;
                    }
                    h1.a(i, floatbuffer, floatbuffer3, flag1);
                } else
                {
                    h1.a(i, C, D, true);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                if (flag)
                {
                    i = B[j];
                }
                j++;
            }
        }
        return;
    }

    public final void r_()
    {
        G = true;
    }
}
