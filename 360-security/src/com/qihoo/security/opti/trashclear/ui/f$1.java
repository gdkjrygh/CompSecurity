// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            f, TrashItemInfo

class a
    implements Comparator
{

    final f a;
    private final Collator b = Collator.getInstance();

    public int a(TrashItemInfo trashiteminfo, TrashItemInfo trashiteminfo1)
    {
        if (trashiteminfo.size < trashiteminfo1.size)
        {
            return 1;
        }
        if (trashiteminfo.size > trashiteminfo1.size)
        {
            return -1;
        }
        String s1 = trashiteminfo.name;
        String s = trashiteminfo1.name;
        trashiteminfo = s1;
        if (s1 == null)
        {
            trashiteminfo = "";
        }
        trashiteminfo1 = s;
        if (s == null)
        {
            trashiteminfo1 = "";
        }
        return b.compare(trashiteminfo, trashiteminfo1);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((TrashItemInfo)obj, (TrashItemInfo)obj1);
    }

    hItemInfo(f f1)
    {
        a = f1;
        super();
    }
}
