// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.enums;


public final class CipherMode extends Enum
{

    private static final CipherMode $VALUES[];
    public static final CipherMode CBC;
    public static final CipherMode CTR;
    public static final CipherMode DET_CBC;
    public static final CipherMode ECB;
    private String jceMode;
    private int value;

    private CipherMode(String s, int i, int j, String s1, boolean flag)
    {
        super(s, i);
        value = j;
        jceMode = s1;
    }

    public static CipherMode valueOf(String s)
    {
        return (CipherMode)Enum.valueOf(org/keyczar/enums/CipherMode, s);
    }

    public static CipherMode[] values()
    {
        return (CipherMode[])$VALUES.clone();
    }

    public final String getMode()
    {
        return jceMode;
    }

    public final int getOutputSize(int i, int j)
    {
        int k;
        if (this == CBC)
        {
            k = i * (j / i + 2);
        } else
        {
            k = i;
            if (this != ECB)
            {
                if (this == CTR)
                {
                    return j + i / 2;
                }
                if (this == DET_CBC)
                {
                    return i * (j / i + 1);
                } else
                {
                    return 0;
                }
            }
        }
        return k;
    }

    static 
    {
        CBC = new CipherMode("CBC", 0, 0, "AES/CBC/PKCS5Padding", true);
        CTR = new CipherMode("CTR", 1, 1, "AES/CTR/NoPadding", true);
        ECB = new CipherMode("ECB", 2, 2, "AES/ECB/NoPadding", false);
        DET_CBC = new CipherMode("DET_CBC", 3, 3, "AES/CBC/PKCS5Padding", false);
        $VALUES = (new CipherMode[] {
            CBC, CTR, ECB, DET_CBC
        });
    }
}
