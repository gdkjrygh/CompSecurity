// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;


// Referenced classes of package com.qihoo.security.gamebooster:
//            LocalGamePkg

public static final class a extends Enum
{

    public static final Add Add;
    public static final Add CleanRecmd;
    public static final Add UserAdd;
    public static final Add V5Recmd;
    private static final Add b[];
    private int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/qihoo/security/gamebooster/LocalGamePkg$State, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    public void setCode(int i)
    {
        a = i;
    }

    static 
    {
        V5Recmd = new <init>("V5Recmd", 0, 0);
        CleanRecmd = new <init>("CleanRecmd", 1, 1);
        UserAdd = new <init>("UserAdd", 2, 2);
        Add = new <init>("Add", 3, 4);
        b = (new b[] {
            V5Recmd, CleanRecmd, UserAdd, Add
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
