// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;


// Referenced classes of package com.tremorvideo.sdk.android.d:
//            s

class x extends s
{

    private final boolean a;

    x(boolean flag)
    {
        a = flag;
    }

    public static x a(boolean flag)
    {
        return new x(flag);
    }

    public String a()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("viewable: ");
        String s1;
        if (a)
        {
            s1 = "true";
        } else
        {
            s1 = "false";
        }
        return stringbuilder.append(s1).toString();
    }
}
