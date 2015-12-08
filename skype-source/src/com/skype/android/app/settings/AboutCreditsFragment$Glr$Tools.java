// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Random;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment

public static final class 
{

    private static Random mRandom = new Random();

    public static void drawSprite(GL10 gl10, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        if (floatbuffer1 == null)
        {
            return;
        } else
        {
            gl10.glVertexPointer(2, 5126, 0, floatbuffer);
            gl10.glTexCoordPointer(2, 5126, 0, floatbuffer1);
            gl10.glDrawArrays(5, 0, 4);
            return;
        }
    }

    public static float getRandom(float f, float f1)
    {
        return mRandom.nextFloat() * (f1 - f) + f;
    }

    public static int getRandom(int i, int j)
    {
        return (int)(mRandom.nextFloat() * (float)(j - i)) + i;
    }

    public static float getRandomGaussian(float f)
    {
        return (float)(mRandom.nextGaussian() * (double)f);
    }

    public static FloatBuffer makeFloatBuffer(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7)
    {
        Object obj = ByteBuffer.allocateDirect(32);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        ((FloatBuffer) (obj)).put(new float[] {
            f, f1, f2, f1, f, f5, f2, f5
        });
        ((FloatBuffer) (obj)).position(0);
        return ((FloatBuffer) (obj));
    }

    public static FloatBuffer makeFloatBuffer(float af[])
    {
        Object obj = ByteBuffer.allocateDirect(af.length * 4);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        ((FloatBuffer) (obj)).put(af);
        ((FloatBuffer) (obj)).position(0);
        return ((FloatBuffer) (obj));
    }


    public ()
    {
    }
}
