// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Set;

final class izk
    implements iyx
{

    private final dru a;

    izk(drz drz)
    {
        a = new dru(new ize(), drz);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return a.a(((Cursor) (obj)));
    }

    public final Set a()
    {
        return dru.a();
    }

    public final Class b()
    {
        return dru.b();
    }
}
