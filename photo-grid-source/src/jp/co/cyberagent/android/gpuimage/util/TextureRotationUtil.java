// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage.util;

import jp.co.cyberagent.android.gpuimage.Rotation;

public class TextureRotationUtil
{

    public static final float TEXTURE_NO_ROTATION[] = {
        0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F
    };
    public static final float TEXTURE_ROTATED_180[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F
    };
    public static final float TEXTURE_ROTATED_270[] = {
        0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
    };
    public static final float TEXTURE_ROTATED_90[] = {
        1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F
    };

    private TextureRotationUtil()
    {
    }

    private static float flip(float f)
    {
        float f1 = 0.0F;
        if (f == 0.0F)
        {
            f1 = 1.0F;
        }
        return f1;
    }

    public static float[] getRotation(Rotation rotation, boolean flag, boolean flag1)
    {
        _cls1..SwitchMap.jp.co.cyberagent.android.gpuimage.Rotation[rotation.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 188
    //                   2 195
    //                   3 202;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_202;
_L1:
        rotation = TEXTURE_NO_ROTATION;
_L5:
        if (flag)
        {
            float af[] = new float[8];
            af[0] = flip(rotation[0]);
            af[1] = rotation[1];
            af[2] = flip(rotation[2]);
            af[3] = rotation[3];
            af[4] = flip(rotation[4]);
            af[5] = rotation[5];
            af[6] = flip(rotation[6]);
            af[7] = rotation[7];
            rotation = af;
        }
        if (flag1)
        {
            return (new float[] {
                rotation[0], flip(rotation[1]), rotation[2], flip(rotation[3]), rotation[4], flip(rotation[5]), rotation[6], flip(rotation[7])
            });
        } else
        {
            return rotation;
        }
_L2:
        rotation = TEXTURE_ROTATED_90;
          goto _L5
_L3:
        rotation = TEXTURE_ROTATED_180;
          goto _L5
        rotation = TEXTURE_ROTATED_270;
          goto _L5
    }


    private class _cls1
    {

        static final int $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[];

        static 
        {
            $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation = new int[Rotation.values().length];
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.ROTATION_90.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.ROTATION_180.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.ROTATION_270.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.NORMAL.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
