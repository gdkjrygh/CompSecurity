// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;


// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

public static final class a extends Enum
{

    public static final LaunchApp Click;
    public static final LaunchApp Install;
    public static final LaunchApp LaunchApp;
    public static final LaunchApp Request;
    public static final LaunchApp Show;
    private static final LaunchApp b[];
    private int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/qihoo/security/adv/AdvDataManager$AdvReportType, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public int getType()
    {
        return a;
    }

    public void setType(int i)
    {
        a = i;
    }

    static 
    {
        Request = new <init>("Request", 0, 1);
        Show = new <init>("Show", 1, 2);
        Click = new <init>("Click", 2, 3);
        Install = new <init>("Install", 3, 4);
        LaunchApp = new <init>("LaunchApp", 4, 5);
        b = (new b[] {
            Request, Show, Click, Install, LaunchApp
        });
    }

    private _cls9(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
