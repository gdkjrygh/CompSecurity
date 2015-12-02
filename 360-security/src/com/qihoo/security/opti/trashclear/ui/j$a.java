// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            j, TrashItemInfo, i

public static final class hItemInfo
{

    public static List a(List list, int k)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new j((TrashItemInfo)list.next(), k))) { }
        return arraylist;
    }

    public static void a(i k, List list, int l)
    {
        if (k != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                j j1 = new j((TrashItemInfo)list.next(), l);
                if (k.b() != null)
                {
                    k.b().add(j1);
                    j1.a(k);
                }
            }
        }
    }
}
