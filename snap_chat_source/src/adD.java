// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adD
{

    public static boolean a(int i)
    {
        if (i >= -1)
        {
            if (i == -1)
            {
                return true;
            }
            int j = i & 0xff;
            if (j == 0 || j == 255)
            {
                return true;
            }
            if ((0xff00 & i) == 0)
            {
                return true;
            }
        }
        return false;
    }
}
