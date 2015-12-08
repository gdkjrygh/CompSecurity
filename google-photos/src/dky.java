// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dky
    implements dkl
{

    private static final Set a = Collections.singleton("byte_size");

    dky()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return new izm(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("byte_size")));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return izm;
    }

}
