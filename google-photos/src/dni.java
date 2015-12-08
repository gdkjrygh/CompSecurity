// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

final class dni
    implements elf
{

    private static final ekz a;
    private final Context b;
    private final drw c;

    dni(Context context, drw drw1)
    {
        b = context;
        c = drw1;
    }

    private List a(dnd dnd1, ekw ekw, ekk ekk)
    {
        Cursor cursor = (new euj()).a(new String[] {
            "dedup_key"
        }).a(Collections.singleton(dnd1.b)).a(b, dnd1.a);
        String s;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        s = cursor.getString(cursor.getColumnIndexOrThrow("dedup_key"));
_L1:
        cursor.close();
        if (TextUtils.isEmpty(s))
        {
            return Collections.emptyList();
        } else
        {
            return c.a(dnd1.a, ekw, ekk, new drx[] {
                new dnj(this, s)
            });
        }
        s = "";
          goto _L1
        dnd1;
        cursor.close();
        throw dnd1;
    }

    public final long a(ekq ekq, ekw ekw)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final Class a()
    {
        return dnd;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk)
    {
        ekq = (dnd)ekq;
        if (((dnd) (ekq)).c)
        {
            return a(((dnd) (ekq)), ekw, ekk);
        } else
        {
            return c.a(((dnd) (ekq)).a, ekw, ekk, new drx[] {
                new dnk(this, ekq)
            });
        }
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        ela ela1 = new ela();
        ela1.a = true;
        ela1.b = true;
        ela1.e = true;
        ela1.c = true;
        a = ela1.a();
    }
}
