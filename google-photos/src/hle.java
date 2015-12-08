// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class hle extends mtf
{

    private final int a;
    private final Collection b;
    private final ekq c;

    public hle(int i, Collection collection, ekq ekq1)
    {
        boolean flag1 = true;
        super("RemoveFromCollectionTask");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Invalid account id.");
        if (!collection.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "Cannot remove 0 media.");
        p.b(ekq1, "collection must be non-null");
        a = i;
        b = collection;
        c = ekq1;
    }

    private void a(Context context, List list)
    {
        hgg hgg1;
        for (list = list.iterator(); list.hasNext(); mtj.b(context, hgg1.a()))
        {
            String s = (String)list.next();
            hgg1 = new hgg();
            hgg1.b = context;
            hgg1.a = a;
            hgg1.c = s;
            hgg1.g = false;
        }

    }

    protected final mue a(Context context)
    {
        Object obj;
        try
        {
            obj = b.a(b, c, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        if (((List) (obj)).isEmpty())
        {
            return new mue(0, new eke("Remote remove from album failed: No resolved media."), null);
        }
        Object obj1 = (ila)c.b(ila);
        boolean flag;
        if (obj1 != null && ((ila) (obj1)).a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj1 = new hkq(((hpe)c.a(hpe)).a.a, ((List) (obj)));
            ((hpz)olm.a(context, hpz)).a(a, ((ds) (obj1)));
            if (!((hkq) (obj1)).a)
            {
                return new mue(false);
            }
            obj1 = (est)olm.a(context, est);
            String s = b.b(c);
            ((est) (obj1)).a(a, s, ((List) (obj)), true);
            obj = b.b(c);
            obj1 = new hgg();
            obj1.b = context;
            obj1.a = a;
            obj1.c = ((String) (obj));
            obj = (iks)c.b(iks);
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((iks) (obj)).a;
            }
            obj1.d = ((String) (obj));
            obj1.g = true;
            mtj.b(context, ((hgg) (obj1)).a());
            return new mue(true);
        }
        obj1 = new hky(context, a, ((List) (obj)));
        ((hky) (obj1)).d();
        if (((hky) (obj1)).l())
        {
            ((hky) (obj1)).d("RemoveFromCollection");
            return new mue(((nxx) (obj1)).l, ((nxx) (obj1)).n, ((nxx) (obj1)).m);
        }
        qgg aqgg[] = ((hky) (obj1)).a.a;
        qfu qfu = ((hky) (obj1)).a();
        ((eto)olm.a(context, eto)).a(a, aqgg, ((Collection) (obj)), qfu, true);
        obj = new ArrayList(((hky) (obj1)).a.b.length);
        qfz aqfz[] = ((hky) (obj1)).a.b;
        int j = aqfz.length;
        for (int i = 0; i < j; i++)
        {
            ((ArrayList) (obj)).add(aqfz[i].a.a);
        }

        a(context, ((List) (obj)));
        return new mue(true);
    }
}
