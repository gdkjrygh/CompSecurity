// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;

public final class djz
    implements emf
{

    private final Context a;
    private final elp b;
    private final noz c;

    public djz(Context context, elp elp1)
    {
        a = context;
        b = elp1;
        c = noz.a(context, 2, "AllMediaProvider", new String[] {
            "perf"
        });
    }

    private elm a(djo djo1, ekk ekk)
    {
        Cursor cursor;
        long l;
        l = noy.a();
        cursor = (new erm()).c(djo1.b).b(a, djo1.a);
        elm elm;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        elm = b.a(djo1.a, cursor, ekk);
        cursor.close();
        if (c.a())
        {
            b.a(djo1);
            b.a(ekk);
            noy.a("duration", l);
        }
        return elm;
        throw new eku(djo1);
        djo1;
        cursor.close();
        throw djo1;
    }

    public final ekp a(ekp ekp, elm elm)
    {
        ekp = (djo)ekp;
        return new djo(((djo) (ekp)).a, ((djo) (ekp)).b, ((djo) (ekp)).c, ((djo) (ekp)).d, elm);
    }

    public final volatile elm a(ekp ekp, ekk ekk)
    {
        return a((djo)ekp, ekk);
    }

    public final Class a()
    {
        return djo;
    }

    static 
    {
        Collections.emptySet();
    }
}
