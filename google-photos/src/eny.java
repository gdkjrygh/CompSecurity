// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eny
    implements iwj
{

    private final Context a;
    private final int b;

    public eny(Context context, int i)
    {
        a = context;
        b = i;
    }

    public final Object a(Object obj)
    {
        obj = (List)obj;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ((List) (obj)).iterator();
        while (iterator.hasNext()) 
        {
            ekq ekq1 = (ekq)iterator.next();
            hjt hjt1 = (hjt)ekq1.a(hjt);
            obj = (hjr)ekq1.a(hjr);
            String s = ((hkd)ekq1.a(hkd)).a(a);
            int i = ((hjr) (obj)).a;
            if (i == 0)
            {
                obj = a.getResources().getString(b.ms);
            } else
            {
                obj = a.getResources().getQuantityString(b.mr, i, new Object[] {
                    s, Integer.valueOf(i)
                });
            }
            arraylist.add(new eor(ekq1, b, ((String) (obj)), hjt1.a));
        }
        return arraylist;
    }
}
