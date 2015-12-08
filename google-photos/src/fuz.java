// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class fuz
    implements nes
{

    private final elp a;
    private final int b;
    private final ekk c;
    private final noz d;

    fuz(Context context, int i, ekk ekk)
    {
        b = i;
        c = ekk;
        d = noz.a(context, "LocalFollderCollapse", new String[0]);
        a = new elp(context, fva);
    }

    private ekq b(List list)
    {
        Object obj = new MergeCursor((Cursor[])list.toArray(new Cursor[list.size()]));
        list = new HashSet();
        long l;
        long l1;
        for (l = 0L; ((MergeCursor) (obj)).moveToNext(); l = l1)
        {
            long l2 = ((MergeCursor) (obj)).getLong(2);
            l1 = l;
            if (l2 > l)
            {
                l1 = l2;
            }
            list.add(Integer.valueOf(((MergeCursor) (obj)).getInt(0)));
        }

        if (list.size() == 0)
        {
            return null;
        }
        list = new ArrayList(list);
        obj = new fvb(((Cursor) (obj)), true);
        try
        {
            obj = a.a(b, obj, c);
            list = new fux(true, list, l, b, ((elm) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return null;
        }
        return list;
    }

    public final Object a(List list)
    {
        return b(list);
    }
}
