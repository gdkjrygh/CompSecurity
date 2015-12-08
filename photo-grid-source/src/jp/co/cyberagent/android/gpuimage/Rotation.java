// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


public final class Rotation extends Enum
{

    private static final Rotation $VALUES[];
    public static final Rotation NORMAL;
    public static final Rotation ROTATION_180;
    public static final Rotation ROTATION_270;
    public static final Rotation ROTATION_90;

    private Rotation(String s, int i)
    {
        super(s, i);
    }

    public static Rotation fromInt(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append(i).append(" is an unknown rotation. Needs to be either 0, 90, 180 or 270!").toString());

        case 0: // '\0'
            return NORMAL;

        case 90: // 'Z'
            return ROTATION_90;

        case 180: 
            return ROTATION_180;

        case 270: 
            return ROTATION_270;

        case 360: 
            return NORMAL;
        }
    }

    public static Rotation valueOf(String s)
    {
        return (Rotation)Enum.valueOf(jp/co/cyberagent/android/gpuimage/Rotation, s);
    }

    public static Rotation[] values()
    {
        return (Rotation[])$VALUES.clone();
    }

    public final int asInt()
    {
        switch (_cls1..SwitchMap.jp.co.cyberagent.android.gpuimage.Rotation[ordinal()])
        {
        default:
            throw new IllegalStateException("Unknown Rotation!");

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 90;

        case 3: // '\003'
            return 180;

        case 4: // '\004'
            return 270;
        }
    }

    static 
    {
        NORMAL = new Rotation("NORMAL", 0);
        ROTATION_90 = new Rotation("ROTATION_90", 1);
        ROTATION_180 = new Rotation("ROTATION_180", 2);
        ROTATION_270 = new Rotation("ROTATION_270", 3);
        $VALUES = (new Rotation[] {
            NORMAL, ROTATION_90, ROTATION_180, ROTATION_270
        });
    }

    private class _cls1
    {

        static final int $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[];

        static 
        {
            $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation = new int[Rotation.values().length];
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.NORMAL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.ROTATION_90.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.ROTATION_180.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$jp$co$cyberagent$android$gpuimage$Rotation[Rotation.ROTATION_270.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
