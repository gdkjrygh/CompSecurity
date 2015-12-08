// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class ang.Object
    implements an
{

    private final String a[] = {
        "unaccepted_licenses"
    };
    private gpp b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtx.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        ctz.a(obj);
        if (((Cursor) (obj)).moveToFirst())
        {
            obj = foq.a(((Cursor) (obj)));
            gpp.a(b, ((String []) (obj)));
        }
    }

    (gpp gpp1)
    {
        b = gpp1;
        super();
    }
}
