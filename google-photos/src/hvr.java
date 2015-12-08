// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class hvr extends mtf
{

    private final String a;
    private final List b;
    private final int c;

    public hvr(int i, String s, List list)
    {
        super("RemoveResultsTask");
        a = s;
        b = list;
        c = i;
    }

    protected final mue a(Context context)
    {
        eto eto1 = (eto)olm.a(context, eto);
        context = (hpb)olm.a(context, hpb);
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            ekp ekp1 = (ekp)iterator.next();
            Iterator iterator1 = context.a(ekp1).iterator();
            while (iterator1.hasNext()) 
            {
                arraylist.add(new etv(((hpk)iterator1.next()).e, ekp1.d()));
            }
        }

        eto1.a(c, a, arraylist, true, true);
        return new mue(true);
    }
}
