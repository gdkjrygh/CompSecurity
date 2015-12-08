// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class heu
    implements iwj
{

    private static final ekk a = (new ekm()).a(elt).a();
    private final Context b;
    private final ekw c;
    private final hev d;
    private final noz e;

    public heu(Context context, ekw ekw, hev hev1)
    {
        b = context;
        c = ekw;
        d = hev1;
        e = noz.a(context, 3, "FolderItemTransform", new String[0]);
    }

    private ekp a(ekq ekq)
    {
        Object obj;
        obj = (List)b.a(b, ekq).a(ekq, c, a).a();
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = (ekp)((List) (obj)).get(0);
        return ((ekp) (obj));
        eke eke1;
        eke1;
        if (e.a())
        {
            b.a(ekq);
            b.a(a);
            b.a(c);
        }
        return null;
    }

    public final Object a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new ArrayList(((List) (obj1)).size());
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            heq heq1 = (heq)((Iterator) (obj1)).next();
            ekq ekq = heq1.a;
            ekp ekp1 = a(ekq);
            long l = b.a(b, ekq).a(ekq, c);
            if (l > 0L)
            {
                heq1.c = ekp1;
                heq1.b = d.a((int)l);
                ((List) (obj)).add(heq1);
            }
        } while (true);
        return obj;
    }

}
