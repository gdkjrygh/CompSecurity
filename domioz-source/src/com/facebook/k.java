// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            l

public final class k extends l
{

    private int a;
    private String b;

    public k(String s, int i, String s1)
    {
        super(s);
        a = i;
        b = s1;
    }

    public final String toString()
    {
        return (new StringBuilder("{FacebookDialogException: errorCode: ")).append(a).append(", message: ").append(getMessage()).append(", url: ").append(b).append("}").toString();
    }
}
