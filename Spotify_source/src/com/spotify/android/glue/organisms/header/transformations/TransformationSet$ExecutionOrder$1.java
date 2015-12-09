// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header.transformations;

import dev;
import java.util.Iterator;
import java.util.List;

final class nit> extends nit>
{

    final float a(List list, float f)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            f = ((dev)list.next()).a(f);
        }

        return f;
    }

    (String s)
    {
        super(s, 0, (byte)0);
    }
}
