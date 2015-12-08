// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class ang.Object
    implements an
{

    private final String a[] = {
        "current_user", "country_code"
    };
    private gpp b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtw.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Object obj1 = (Cursor)obj;
        ctz.a(obj1);
        if (((Cursor) (obj1)).moveToFirst())
        {
            obj = ((Cursor) (obj1)).getString(0);
            obj1 = ((Cursor) (obj1)).getString(1);
            gpp.a(b, ((String) (obj)), ((String) (obj1)));
        }
    }

    (gpp gpp1)
    {
        b = gpp1;
        super();
    }
}
