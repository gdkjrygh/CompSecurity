// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            iwiiwi, iiiiwi, wwiiwi, wiiiwi

public abstract class wwwwii
{

    public static final wwwwii b041E041E041E041E041E041E = new iwiiwi();
    public static final wwwwii b041E041E041E041E041E041E;
    public static final wwwwii b041E041E041E041E041E041E;
    public static final wwwwii b041E041E041E041E041E041E;

    public wwwwii()
    {
    }

    public static wwwwii b041A041A041A041A041A041A(int i)
    {
        if (i == 0)
        {
            return b041E041E041E041E041E041E;
        }
        if ((0xffff0000 & i) != 0)
        {
            return b041E041E041E041E041E041E;
        }
        if ((0xf800 & i) != 0)
        {
            return b041E041E041E041E041E041E;
        }
        if ((i & 0x780) != 0)
        {
            return b041E041E041E041E041E041E;
        } else
        {
            return b041E041E041E041E041E041E;
        }
    }

    public abstract int b041A041A041A041A041A041A(int i);

    public abstract int b041A041A041A041A041A041A();

    public abstract boolean b041A041A041A041A041A041A(int i);

    public abstract int b041A041A041A041A041A041A(int i);

    static 
    {
        b041E041E041E041E041E041E = new iiiiwi();
        b041E041E041E041E041E041E = new wwiiwi();
        b041E041E041E041E041E041E = new wiiiwi();
    }
}
