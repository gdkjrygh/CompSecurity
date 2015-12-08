// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dlc
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Collections.singletonList("total_items")));

    dlc()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return new hjr(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("total_items")));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjr;
    }

}
