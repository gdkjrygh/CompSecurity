// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

final class ijd
    implements ikf
{

    private static final Set a = Collections.singleton("protobuf");
    private final ifj b;

    ijd(ifj ifj1)
    {
        b = ifj1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getBlob(((Cursor) (obj)).getColumnIndexOrThrow("protobuf"));
        qfz qfz1 = (qfz)mve.a(new qfz(), ((byte []) (obj)));
        obj = new ArrayList(qfz1.b.e.length);
        pzh apzh[] = qfz1.b.e;
        int k = apzh.length;
        for (int j = 0; j < k; j++)
        {
            ((List) (obj)).add(Integer.valueOf(apzh[j].a));
        }

        return new hjn(b.a(i), ((List) (obj)));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjn;
    }

}
