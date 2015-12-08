// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;


// Referenced classes of package com.microsoft.onlineid.sts:
//            o

public static final class d extends Enum
{

    public static final b a;
    public static final b b;
    private static final b e[];
    private final int c = 32;
    private final String d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/microsoft/onlineid/sts/o$a, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    final int a()
    {
        return c;
    }

    final String b()
    {
        return d;
    }

    static 
    {
        a = new <init>("CredentialSignature", 0, "WS-SecureConversation");
        b = new <init>("STSDigest", 1, "WS-SecureConversationWS-SecureConversation");
        e = (new e[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }
}
