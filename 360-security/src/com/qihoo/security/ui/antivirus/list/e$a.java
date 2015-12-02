// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            e

public static final class fo
{

    public static List a(List list, int j)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new e((MaliciousInfo)list.next(), j))) { }
        return arraylist;
    }

    public static void a(i j, List list, int k)
    {
        if (j != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                e e1 = new e((MaliciousInfo)list.next(), k);
                if (j.b() != null)
                {
                    j.b().add(e1);
                    e1.a(j);
                }
            }
        }
    }
}
