// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Iterator;

public final class exw
    implements Iterable
{

    private final Cursor a;

    public exw(Cursor cursor)
    {
        a = cursor;
    }

    public final Iterator iterator()
    {
        return new exx(a);
    }
}
