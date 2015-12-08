// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


// Referenced classes of package com.facebook.login:
//            LoginClient

static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    final String d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    static 
    {
        a = new <init>("SUCCESS", 0, "success");
        b = new <init>("CANCEL", 1, "cancel");
        c = new <init>("ERROR", 2, "error");
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }
}
