// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ggh
    implements ggk, omb, opv
{

    private static final ekk a = (new ekm()).a(hpg).a(elt).b(jdy).a();
    private Context b;
    private ejn c;
    private ekb d;
    private noz e;

    public ggh(opd opd1)
    {
        opd1.a(this);
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ekp ekp1 = (ekp)list.next();
            try
            {
                arraylist.add(b.a(b, ekp1).a(ekp1, a).a());
            }
            catch (eke eke1)
            {
                if (e.a())
                {
                    b.a(ekp1);
                }
            }
        } while (true);
        return arraylist;
    }

    public final ggh a(olm olm1)
    {
        olm1.a(ggk, this);
        return this;
    }

    public final List a()
    {
        ArrayList arraylist = d.a();
        if (arraylist.isEmpty())
        {
            return Collections.emptyList();
        }
        Object obj = a(((List) (arraylist)));
        arraylist = new ArrayList(((List) (obj)).size());
        ekp ekp1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(c.a(ekp1, ejm.c)))
        {
            ekp1 = (ekp)((Iterator) (obj)).next();
        }

        return arraylist;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        c = (ejn)olm1.a(ejn);
        d = (ekb)olm1.a(ekb);
        e = noz.a(context, "BeamUrisSupplier", new String[0]);
    }

}
