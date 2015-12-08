// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeO
{

    public static String a(int i)
    {
        char ac[] = new char[8];
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < 8; i++)
        {
            ac[7 - i] = Character.forDigit(j & 0xf, 16);
            j >>= 4;
        }

        return new String(ac);
    }

    public static String a(long l)
    {
        char ac[] = new char[16];
        for (int i = 0; i < 16; i++)
        {
            ac[15 - i] = Character.forDigit((int)l & 0xf, 16);
            l >>= 4;
        }

        return new String(ac);
    }

    public static String b(int i)
    {
        char ac[] = new char[4];
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            ac[3 - i] = Character.forDigit(j & 0xf, 16);
            j >>= 4;
        }

        return new String(ac);
    }

    public static String c(int i)
    {
        if (i == (char)i)
        {
            return b(i);
        } else
        {
            return a(i);
        }
    }

    public static String d(int i)
    {
        char ac[] = new char[2];
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < 2; i++)
        {
            ac[1 - i] = Character.forDigit(j & 0xf, 16);
            j >>= 4;
        }

        return new String(ac);
    }
}
