// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ab;
import com.nuance.b.b.a.ac;

// Referenced classes of package com.nuance.b.b:
//            ai, w

final class al extends ai
{

    al()
    {
        super((byte)0);
    }

    protected final boolean c(Object obj)
    {
        obj = (ab)obj;
        switch (w.b[((ab) (obj)).b.ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return false;
        }
    }
}
