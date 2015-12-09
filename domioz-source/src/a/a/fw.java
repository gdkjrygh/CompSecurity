// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.NoSuchElementException;

// Referenced classes of package a.a:
//            gs

final class fw extends gs
{

    boolean a;
    final Object b;

    fw(Object obj)
    {
        b = obj;
        super();
    }

    public final boolean hasNext()
    {
        return !a;
    }

    public final Object next()
    {
        if (a)
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return b;
        }
    }
}
