// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Set;

final class dko
    implements dkl
{

    private final dru a;

    dko(drz drz)
    {
        a = new dru(new djv(), drz);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final ekf a(Cursor cursor)
    {
        return a.a(cursor);
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
