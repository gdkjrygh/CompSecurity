// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fxg extends mvc
{

    private static final ekk l = (new ekm()).a(gax).a(elt).a(eev).a();
    private final ej m = new ej(this);
    private final ekr n;
    private final ekv o;
    private final ekk p;
    private final int q;
    private final int r;

    public fxg(Context context, int i, int j, ekk ekk)
    {
        super(context);
        q = i;
        r = j;
        p = ekk;
        n = b.b(context, fux.a(i));
        o = b.a(context, fux.a(i));
    }

    private elb s()
    {
        Object obj;
        try
        {
            Object obj1 = (List)n.a(fux.a(q), p).a();
            obj = new ArrayList(((List) (obj1)).size());
            ekq ekq1;
            Object obj2;
            long l1;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new fwi((fux)ekq1, ((List) (obj2)), l1)))
            {
                ekq1 = (ekq)((Iterator) (obj1)).next();
                obj2 = o;
                eky eky1 = new eky();
                eky1.a = r;
                obj2 = (List)((ekv) (obj2)).a(ekq1, eky1.a(), l).a();
                l1 = o.a(ekq1, ekw.a);
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return b.a(((eke) (obj)));
        }
        obj = b.b(obj);
        return ((elb) (obj));
    }

    public final Object d()
    {
        return s();
    }

    protected final boolean q()
    {
        n.a(fux.a(q), m);
        return true;
    }

    protected final boolean r()
    {
        n.b(fux.a(q), m);
        return true;
    }

}
