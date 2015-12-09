// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            t

public static abstract class s
    implements Cloneable
{

    protected final long s;

    public static final boolean b(Cursor cursor)
    {
        return cursor != null && !cursor.isAfterLast() && !cursor.isBeforeFirst();
    }

    public abstract Object clone();

    public final long p()
    {
        return s;
    }

    public (long l)
    {
        s = l;
    }
}
