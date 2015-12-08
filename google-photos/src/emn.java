// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class emn extends mvc
{

    private final List l;
    private final ekk m;
    private final elw n;
    private final ej o = new ej(this);

    public emn(Context context, List list, ekk ekk)
    {
        super(context);
        l = list;
        m = ekk;
        n = (elw)olm.a(context, elw);
    }

    private elb s()
    {
        Object obj = new ArrayList();
        try
        {
            ekp ekp1;
            for (Iterator iterator = l.iterator(); iterator.hasNext(); ((List) (obj)).add(((ekv)n.a(ekp1.a())).a(ekp1, m).a()))
            {
                ekp1 = (ekp)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return b.a(((eke) (obj)));
        }
        return b.b(obj);
    }

    public final Object d()
    {
        return s();
    }

    protected final boolean q()
    {
        ekp ekp1;
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((ekv)n.a(ekp1.a())).a(ekp1, o))
        {
            ekp1 = (ekp)iterator.next();
        }

        return true;
    }

    protected final boolean r()
    {
        ekp ekp1;
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((ekv)n.a(ekp1.a())).b(ekp1, o))
        {
            ekp1 = (ekp)iterator.next();
        }

        return true;
    }
}
