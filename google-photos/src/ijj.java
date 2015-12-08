// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class ijj
    implements ikf
{

    private static final Set a = Collections.singleton("owner_actor_id");
    private final iiv b;

    ijj(iiv iiv1)
    {
        b = iiv1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("owner_actor_id"));
        obj = b.a(i, ((String) (obj)));
        p.b(obj, "Owner cannot be null.");
        return new hjv(((diy) (obj)));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjv;
    }

}
