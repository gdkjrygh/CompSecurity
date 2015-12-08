// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

public final class izh
    implements emf
{

    private final Context a;
    private final elp b;
    private final noz c;

    public izh(Context context, elp elp1)
    {
        a = context;
        b = elp1;
        c = noz.a(context, 2, "TrashMediaProvider", new String[] {
            "perf"
        });
    }

    private elm a(iyy iyy1, ekk ekk)
    {
        Cursor cursor;
        long l;
        l = noy.a();
        cursor = (new erm()).a().c(iyy1.b).b(a, iyy1.a);
        elm elm;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        elm = b.a(iyy1.a, cursor, ekk);
        cursor.close();
        if (c.a())
        {
            b.a(iyy1);
            b.a(ekk);
            noy.a("duration", l);
        }
        return elm;
        throw new eku(iyy1);
        iyy1;
        cursor.close();
        throw iyy1;
    }

    public final ekp a(ekp ekp, elm elm)
    {
        ekp = (iyy)ekp;
        return new iyy(((iyy) (ekp)).a, ((iyy) (ekp)).b, ((iyy) (ekp)).c, ((iyy) (ekp)).d, elm);
    }

    public final volatile elm a(ekp ekp, ekk ekk)
    {
        return a((iyy)ekp, ekk);
    }

    public final Class a()
    {
        return iyy;
    }
}
