// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            Polygon, k, Texture, ShaderProgram

public final class d
{

    Polygon a;
    final int b;
    final int c;
    final FloatBuffer d;
    final Texture e;
    final Texture f;
    ByteBuffer g;
    final ShaderProgram h;
    private final int i;
    private boolean j;

    public d(ShaderProgram shaderprogram, int l, int i1, boolean flag)
    {
        h = shaderprogram;
        b = l;
        c = i1;
        i = (int)Math.pow(2D, Math.ceil(Math.log(Math.max(l, i1)) / Math.log(2D)));
        a = Polygon.a();
        float f1 = (float)l / (float)i;
        float f2 = (float)i1 / (float)i;
        if (flag)
        {
            d = k.a(new float[] {
                0.0F, f2, 0.0F, 0.0F, f1, 0.0F, f1, f2
            });
        } else
        {
            d = k.a(new float[] {
                f1, f2, 0.0F, f2, 0.0F, 0.0F, f1, 0.0F
            });
        }
        e = new Texture(i, i, Texture.Format.LUMINANCE);
        f = new Texture(i / 2, i / 2, Texture.Format.LUMINANCE_ALPHA);
        j = true;
    }

    public final void a()
    {
        if (j)
        {
            j = false;
            e.a();
            f.a();
        }
    }

    protected final void finalize()
    {
        a();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }
}
