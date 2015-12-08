// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import com.cm.kinfoc.a.d;
import com.cm.kinfoc.a.h;

// Referenced classes of package com.roidapp.photogrid.b:
//            h

final class i
    implements d
{

    final com.roidapp.photogrid.b.h a;

    i(com.roidapp.photogrid.b.h h1)
    {
        a = h1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (h)obj;
        if (obj == null || ((h) (obj)).a == null)
        {
            return;
        }
        switch (((h) (obj)).b)
        {
        default:
            return;

        case 2: // '\002'
            h.b(((h) (obj)).a);
            break;
        }
    }
}
