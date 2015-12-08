// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class ang.Object
    implements an
{

    private String a[] = {
        "uri"
    };
    private fyn b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtr.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (obj != null && ((Cursor) (obj)).getCount() >= 20 && System.currentTimeMillis() >= fyn.a(b) + 0x48190800L)
        {
            fyn.b(b);
        }
    }

    (fyn fyn1)
    {
        b = fyn1;
        super();
    }
}
