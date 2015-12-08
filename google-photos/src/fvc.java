// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fvc
    implements emd
{

    private final Context a;
    private final elp b;

    public fvc(Context context, elp elp1)
    {
        a = context;
        b = elp1;
    }

    private elm a(fux fux1, ekk ekk)
    {
        Object obj;
        obj = fux1.b;
        ArrayList arraylist = new ArrayList();
        nek anek[] = neh.a();
        int j = anek.length;
label0:
        for (int i = 0; i < j; i++)
        {
            nek nek1 = anek[i];
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                Object obj1 = (Integer)iterator.next();
                Context context = a;
                int k = ((Integer) (obj1)).intValue();
                obj1 = ((ejr)olm.a(context, ejr)).a(nek1.b, nek1.d.e, nek1.d.b, new String[] {
                    String.valueOf(k)
                }, "1 LIMIT 1");
                if (obj1 != null)
                {
                    arraylist.add(obj1);
                }
            } while (true);
        }

        if (arraylist.isEmpty())
        {
            throw new ekd(fux1);
        }
        obj = new MergeCursor((Cursor[])arraylist.toArray(new Cursor[arraylist.size()]));
        if (!((MergeCursor) (obj)).moveToFirst())
        {
            throw new ekd(fux1);
        }
        break MISSING_BLOCK_LABEL_233;
        fux1;
        ((MergeCursor) (obj)).close();
        throw fux1;
        fvb fvb1 = new fvb(((Cursor) (obj)), fux1.b());
        fux1 = b.a(fux1.d, fvb1, ekk);
        ((MergeCursor) (obj)).close();
        return fux1;
    }

    public final ekq a(ekq ekq, elm elm)
    {
        ekq = (fux)ekq;
        return new fux(((fux) (ekq)).a, ((fux) (ekq)).b, ((fux) (ekq)).c, ((fux) (ekq)).d, elm);
    }

    public final volatile elm a(ekq ekq, ekk ekk)
    {
        return a((fux)ekq, ekk);
    }

    public final Class a()
    {
        return fux;
    }
}
