// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class pm
{

    public static int a(int i)
    {
        int j = i >> 7;
        for (i = 0; j != 0; i++)
        {
            j >>= 7;
        }

        return i + 1;
    }
}
