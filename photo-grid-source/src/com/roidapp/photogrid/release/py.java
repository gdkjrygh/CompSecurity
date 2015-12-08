// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.util.Comparator;

// Referenced classes of package com.roidapp.photogrid.release:
//            PickFolder

final class py
    implements Comparator
{

    final PickFolder a;

    py(PickFolder pickfolder)
    {
        a = pickfolder;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        return ((String)obj).compareToIgnoreCase((String)obj1);
    }
}
