// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import android.util.Log;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.a.a.a;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h, an

public class k extends h
{

    protected int A[];
    protected int B[];
    protected final FloatBuffer C;
    protected final FloatBuffer D;
    protected FloatBuffer E;
    private String F;
    protected List y;
    protected List z;

    public k()
    {
        this(null);
    }

    public k(List list)
    {
        F = getClass().getSimpleName();
        y = list;
        if (y == null)
        {
            y = new ArrayList();
        } else
        {
            g();
        }
        C = ByteBuffer.allocateDirect(g.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C.put(g.a).position(0);
        D = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        D.put(a.a).position(0);
        list = jp.co.cyberagent.android.a.a.a.a(jp.co.cyberagent.android.a.an.a, false, true);
        E = ByteBuffer.allocateDirect(list.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        E.put(list).position(0);
    }

    private void f()
    {
        if (B != null)
        {
            GLES20.glDeleteTextures(B.length, B, 0);
            B = null;
        }
        if (A != null)
        {
            GLES20.glDeleteFramebuffers(A.length, A, 0);
            A = null;
        }
    }

    private void g()
    {
        if (y != null)
        {
            Iterator iterator;
            if (z == null)
            {
                z = new ArrayList();
            } else
            {
                z.clear();
            }
            iterator = y.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (h)iterator.next();
                if (obj instanceof k)
                {
                    ((k)obj).g();
                    obj = ((k)obj).z;
                    if (obj != null && !((List) (obj)).isEmpty())
                    {
                        z.addAll(((java.util.Collection) (obj)));
                    }
                } else
                {
                    z.add(obj);
                }
            }
        }
    }

    public void a(int i, int j)
    {
        Log.e("GPUImage", (new StringBuilder("onOutputSizeChanged width:")).append(i).append("height:").append(j).toString());
        if (A == null || g != i || h != j || y.size() != A.length + 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Log.e("GPUImage", (new StringBuilder("2 onOutputSizeChanged width:")).append(i).append("height:").append(j).toString());
        super.a(i, j);
        if (A != null)
        {
            f();
        }
        int j1 = y.size();
        for (int l = 0; l < j1; l++)
        {
            ((h)y.get(l)).a(i, j);
        }

        if (z != null && z.size() > 0)
        {
            int k1 = z.size();
            A = new int[k1 - 1];
            B = new int[k1 - 1];
            int i1 = 0;
            while (i1 < k1 - 1) 
            {
                B[i1] = -1;
                GLES20.glGenFramebuffers(1, A, i1);
                GLES20.glGenTextures(1, B, i1);
                if (B[i1] == -1)
                {
                    GLES20.glGenTextures(1, B, i1);
                }
                if (B[i1] == -1)
                {
                    Log.e("OpenglError", "G:opengl can't allocate texture.....");
                }
                GLES20.glBindTexture(3553, B[i1]);
                GLES20.glTexImage2D(3553, 0, 6408, i, j, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729F);
                GLES20.glTexParameterf(3553, 10241, 9729F);
                GLES20.glTexParameterf(3553, 10242, 33071F);
                GLES20.glTexParameterf(3553, 10243, 33071F);
                GLES20.glBindFramebuffer(36160, A[i1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, B[i1], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                com.roidapp.videolib.gl.g.a((new StringBuilder("onOutputSizeChanged:")).append(i1).toString());
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1, float af[])
    {
        Log.e("GPUImageGroup", "onDraw in");
        l();
        com.roidapp.videolib.gl.g.a("runPendingOnDrawTasks");
        if (!m() || A == null || B == null)
        {
            return;
        }
        if (z != null)
        {
            int l = z.size();
            int j = 0;
            while (j < l) 
            {
                h h1 = (h)z.get(j);
                Log.e("GPUImageGroup", (new StringBuilder("onDraw ")).append(j).append(",size:").append(l).append(" ").append(h1.getClass().getSimpleName()).toString());
                boolean flag;
                if (j < l - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
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
                    com.roidapp.videolib.gl.g.a("glClearColor");
                    GLES20.glClear(16640);
                    com.roidapp.videolib.gl.g.a("glClear");
                }
                if (j == 0)
                {
                    if (l == 1)
                    {
                        h1.a(i, floatbuffer, floatbuffer1);
                    } else
                    {
                        h1.a(i, C, D);
                    }
                } else
                if (j == l - 1)
                {
                    h1.a(i, floatbuffer, floatbuffer1, true);
                } else
                {
                    h1.a(i, C, D, true);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                if (flag)
                {
                    GLES20.glBindFramebuffer(36160, 0);
                    i = B[j];
                }
                j++;
            }
        }
        Log.e("GPUImageGroup", "onDraw out");
    }

    public final void a(List list)
    {
        y = list;
        g();
    }

    public final void a(h h1)
    {
        if (h1 == null)
        {
            return;
        } else
        {
            y.add(h1);
            g();
            return;
        }
    }

    public final int b(int i)
    {
        while (z == null || i >= z.size() || z.size() <= 1 || B == null || i >= B.length) 
        {
            return -1;
        }
        return B[i];
    }

    public void c()
    {
        super.c();
        for (Iterator iterator = y.iterator(); iterator.hasNext(); ((h)iterator.next()).h()) { }
    }

    public final void e()
    {
        f();
        for (Iterator iterator = y.iterator(); iterator.hasNext(); ((h)iterator.next()).i()) { }
        super.e();
    }

    public final List q()
    {
        return y;
    }
}
