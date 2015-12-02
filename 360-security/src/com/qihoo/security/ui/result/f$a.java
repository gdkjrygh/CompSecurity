// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import com.qihoo.security.ui.result.card.a;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.ui.result:
//            f

private class <init>
    implements Comparator
{

    final f a;

    public int a(a a1, a a2)
    {
        if (a1.e && a2.e || !a1.e && !a2.e)
        {
            return a1.d - a2.d;
        }
        if (a1.e && !a2.e)
        {
            return -1;
        }
        return a1.e || !a2.e ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }

    private .a(f f1)
    {
        a = f1;
        super();
    }

    a(f f1, a a1)
    {
        this(f1);
    }
}
