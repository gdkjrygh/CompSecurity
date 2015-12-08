// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;

final class fvf
    implements ner
{

    private final elp a;
    private final int b;
    private final ekk c;
    private final noz d;

    fvf(Context context, int i, ekk ekk)
    {
        a = new elp(context, fva);
        d = noz.a(context, "LocalCollectionTransform", new String[0]);
        b = i;
        c = ekk;
    }

    private ekq a(Cursor cursor, boolean flag)
    {
        java.util.List list;
        long l;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        list = Collections.singletonList(Integer.valueOf(cursor.getInt(0)));
        l = cursor.getLong(2);
        cursor = new fvb(cursor, flag);
        try
        {
            cursor = a.a(b, cursor, c);
            cursor = new fux(flag, list, l, b, cursor);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            return null;
        }
        return cursor;
    }

    public final volatile Object a(nek nek, Cursor cursor, boolean flag)
    {
        return a(cursor, flag);
    }
}
