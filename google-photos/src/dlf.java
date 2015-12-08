// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dlf
    implements dkl
{

    private static final Set a = Collections.singleton("position");

    dlf()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return new hjx(((Cursor) (obj)).getDouble(((Cursor) (obj)).getColumnIndexOrThrow("position")));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjx;
    }

}
