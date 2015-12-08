// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;


class GamepadMappings
{

    private static final String MICROSOFT_XBOX_PAD_DEVICE_NAME = "Microsoft X-Box 360 pad";
    private static final String NVIDIA_SHIELD_DEVICE_NAME_PREFIX = "NVIDIA Corporation NVIDIA Controller";
    private static final String PS3_SIXAXIS_DEVICE_NAME = "Sony PLAYSTATION(R)3 Controller";
    private static final String SAMSUNG_EI_GP20_DEVICE_NAME = "Samsung Game Pad EI-GP20";

    GamepadMappings()
    {
    }

    private static void mapCommonDpadButtons(float af[], float af1[])
    {
        float f = af1[20];
        float f1 = af1[19];
        float f2 = af1[21];
        float f3 = af1[22];
        af[13] = f;
        af[12] = f1;
        af[14] = f2;
        af[15] = f3;
    }

    private static void mapCommonStartSelectMetaButtons(float af[], float af1[])
    {
        float f = af1[108];
        float f1 = af1[109];
        float f2 = af1[110];
        af[9] = f;
        af[8] = f1;
        af[16] = f2;
    }

    private static void mapCommonThumbstickButtons(float af[], float af1[])
    {
        float f = af1[106];
        float f1 = af1[107];
        af[10] = f;
        af[11] = f1;
    }

    private static void mapCommonTriggerButtons(float af[], float af1[])
    {
        float f = af1[102];
        float f1 = af1[103];
        af[6] = f;
        af[7] = f1;
    }

    private static void mapCommonXYABButtons(float af[], float af1[])
    {
        float f = af1[96];
        float f1 = af1[97];
        float f2 = af1[99];
        float f3 = af1[100];
        af[0] = f;
        af[1] = f1;
        af[2] = f2;
        af[3] = f3;
    }

    private static void mapHatAxisToDpadButtons(float af[], float af1[])
    {
        float f = af1[15];
        float f1 = af1[16];
        af[14] = negativeAxisValueAsButton(f);
        af[15] = positiveAxisValueAsButton(f);
        af[12] = negativeAxisValueAsButton(f1);
        af[13] = positiveAxisValueAsButton(f1);
    }

    private static void mapPS3SixAxisGamepad(float af[], float af1[], float af2[], float af3[])
    {
        float f = af1[96];
        float f1 = af1[97];
        float f2 = af1[99];
        float f3 = af1[100];
        af[0] = f2;
        af[1] = f3;
        af[2] = f;
        af[3] = f1;
        mapCommonTriggerButtons(af, af1);
        mapCommonThumbstickButtons(af, af1);
        mapCommonDpadButtons(af, af1);
        mapCommonStartSelectMetaButtons(af, af1);
        mapTriggerAxexToShoulderButtons(af, af3);
        mapXYAxes(af2, af3);
        mapZAndRZAxesToRightStick(af2, af3);
    }

    private static void mapRXAndRYAxesToRightStick(float af[], float af1[])
    {
        af[2] = af1[12];
        af[3] = af1[13];
    }

    private static void mapSamsungEIGP20Gamepad(float af[], float af1[], float af2[], float af3[])
    {
        mapCommonXYABButtons(af, af1);
        mapCommonTriggerButtons(af, af1);
        mapCommonThumbstickButtons(af, af1);
        mapCommonStartSelectMetaButtons(af, af1);
        mapHatAxisToDpadButtons(af, af3);
        mapXYAxes(af2, af3);
        mapRXAndRYAxesToRightStick(af2, af3);
    }

    private static void mapShieldGamepad(float af[], float af1[], float af2[], float af3[])
    {
        mapCommonXYABButtons(af, af1);
        mapCommonTriggerButtons(af, af1);
        mapCommonThumbstickButtons(af, af1);
        mapCommonStartSelectMetaButtons(af, af1);
        mapTriggerAxexToShoulderButtons(af, af3);
        mapHatAxisToDpadButtons(af, af3);
        mapXYAxes(af2, af3);
        mapZAndRZAxesToRightStick(af2, af3);
    }

    public static boolean mapToStandardGamepad(float af[], float af1[], float af2[], float af3[], String s)
    {
        if (s.startsWith("NVIDIA Corporation NVIDIA Controller"))
        {
            mapShieldGamepad(af1, af3, af, af2);
            return true;
        }
        if (s.equals("Microsoft X-Box 360 pad"))
        {
            mapXBox360Gamepad(af1, af3, af, af2);
            return true;
        }
        if (s.equals("Sony PLAYSTATION(R)3 Controller"))
        {
            mapPS3SixAxisGamepad(af1, af3, af, af2);
            return true;
        }
        if (s.equals("Samsung Game Pad EI-GP20"))
        {
            mapSamsungEIGP20Gamepad(af1, af3, af, af2);
            return true;
        } else
        {
            mapUnknownGamepad(af1, af3, af, af2);
            return false;
        }
    }

    private static void mapTriggerAxexToShoulderButtons(float af[], float af1[])
    {
        float f = af1[17];
        float f1 = af1[18];
        af[4] = f;
        af[5] = f1;
    }

    private static void mapUnknownGamepad(float af[], float af1[], float af2[], float af3[])
    {
        mapCommonXYABButtons(af, af1);
        mapCommonTriggerButtons(af, af1);
        mapCommonThumbstickButtons(af, af1);
        mapCommonStartSelectMetaButtons(af, af1);
        mapTriggerAxexToShoulderButtons(af, af3);
        mapCommonDpadButtons(af, af1);
        mapXYAxes(af2, af3);
        mapRXAndRYAxesToRightStick(af2, af3);
    }

    private static void mapXBox360Gamepad(float af[], float af1[], float af2[], float af3[])
    {
        mapShieldGamepad(af, af1, af2, af3);
    }

    private static void mapXYAxes(float af[], float af1[])
    {
        af[0] = af1[0];
        af[1] = af1[1];
    }

    private static void mapZAndRZAxesToRightStick(float af[], float af1[])
    {
        af[2] = af1[11];
        af[3] = af1[14];
    }

    private static float negativeAxisValueAsButton(float f)
    {
        return f >= -0.5F ? 0.0F : 1.0F;
    }

    private static float positiveAxisValueAsButton(float f)
    {
        return f <= 0.5F ? 0.0F : 1.0F;
    }
}
