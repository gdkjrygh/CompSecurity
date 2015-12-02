// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.richmedia;


// Referenced classes of package com.baidu.android.pushservice.richmedia:
//            n

public class o
{

    public static n a(n.a a1, String s)
    {
        n n1 = new n();
        n1.a(a1);
        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("illegal request type ")).append(a1).toString());

        case 1: // '\001'
            n1.b(s);
            break;
        }
        n1.a("GET");
        return n1;
    }

    /* member class not found */
    class _cls1 {}

}
