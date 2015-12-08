// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            k, h

public final class Polygon
{

    private final FloatBuffer a;

    private Polygon(float af[])
    {
        a = k.a(af);
    }

    public static Polygon a()
    {
        return new Polygon(new float[] {
            -1F, -1F, -1F, 1.0F, 1.0F, 1.0F, 1.0F, -1F
        });
    }

    public final void a(int i)
    {
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, a);
        GLES20.glEnableVertexAttribArray(i);
    }

    public final void a(DrawMode drawmode)
    {
        switch (h.a[drawmode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            GLES20.glDrawArrays(2, 0, a.capacity() / 2);
            return;

        case 2: // '\002'
            GLES20.glDrawArrays(6, 0, a.capacity() / 2);
            break;
        }
    }

    private class DrawMode extends Enum
    {

        public static final DrawMode OUTLINE;
        public static final DrawMode SOLID;
        private static final DrawMode a[];

        public static DrawMode valueOf(String s)
        {
            return (DrawMode)Enum.valueOf(com/google/android/apps/unveil/env/gl/Polygon$DrawMode, s);
        }

        public static DrawMode[] values()
        {
            return (DrawMode[])a.clone();
        }

        static 
        {
            OUTLINE = new DrawMode("OUTLINE", 0);
            SOLID = new DrawMode("SOLID", 1);
            a = (new DrawMode[] {
                OUTLINE, SOLID
            });
        }

        private DrawMode(String s, int i)
        {
            super(s, i);
        }
    }

}
