// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import com.pandora.radio.util.b;

// Referenced classes of package p.bx:
//            c, f, b, e

public class d extends b
{

    private static p.bx.b a = new c();
    private static e b = new f();

    public static p.bx.b a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    public static e b()
    {
        if (b == null)
        {
            b = new f();
        }
        return b;
    }

}
