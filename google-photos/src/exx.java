// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Iterator;

final class exx
    implements Iterator
{

    private final Cursor a;

    exx(Cursor cursor)
    {
        a = cursor;
    }

    public final boolean hasNext()
    {
        return !a.isLast() && !a.isAfterLast();
    }

    public final Object next()
    {
        a.moveToNext();
        return a;
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
