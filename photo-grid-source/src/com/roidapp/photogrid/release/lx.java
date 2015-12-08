// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.util.Comparator;

// Referenced classes of package com.roidapp.photogrid.release:
//            lu, PathSelector

final class lx
    implements Comparator
{

    final PathSelector a;

    lx(PathSelector pathselector)
    {
        a = pathselector;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (lu)obj;
        obj1 = (lu)obj1;
        return ((lu) (obj)).a.compareToIgnoreCase(((lu) (obj1)).a);
    }
}
