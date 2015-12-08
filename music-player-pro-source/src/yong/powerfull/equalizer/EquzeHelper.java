// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;


public class EquzeHelper
{

    static int e0;
    static int e1;
    static int e2;
    static int e3;
    static int e4;
    static int ee[];

    public EquzeHelper()
    {
    }

    public static int getEe(int i)
    {
        return ee[i];
    }

    public static void setEe(int i, int j)
    {
        ee[i] = j;
    }

    static 
    {
        e0 = 0;
        e1 = 0;
        e2 = 0;
        e3 = 0;
        e4 = 0;
        ee = (new int[] {
            e0, e1, e2, e3, e4
        });
    }
}
