// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.c;

import rx.Y;
import rx.b.b;

// Referenced classes of package rx.c:
//            b

final class c
    implements b
{

    final Y a[];
    final rx.c.b b;

    c(rx.c.b b1, Y ay[])
    {
        b = b1;
        a = ay;
        super();
    }

    public final volatile void call(Object obj)
    {
        obj = (Y)obj;
        a[0] = ((Y) (obj));
    }
}
