// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class qd extends OV
{

    private final List a;

    public qd(List list, LB lb, OV.a a1)
    {
        super(lb, a1);
        a = list;
    }

    protected final List a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return a;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            pT pt = (pT)iterator.next();
            if (pt.a(s))
            {
                arraylist.add(pt);
            }
        } while (true);
        return arraylist;
    }
}
