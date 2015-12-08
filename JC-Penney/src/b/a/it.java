// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Comparator;

// Referenced classes of package b.a:
//            ir, kp

final class it
    implements Comparator
{

    private it()
    {
    }

    it(byte byte0)
    {
        this();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (ir)obj;
        obj1 = (ir)obj1;
        int i = ir.a(((ir) (obj))).d();
        int j = ir.a(((ir) (obj1))).d();
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }
}
