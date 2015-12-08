// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dli
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(Collections.singleton("type"));

    dli()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return new hkf(esm.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("type"))));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hkf;
    }

}
