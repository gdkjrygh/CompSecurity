// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class exz
    implements eyc
{

    private int a;

    public exz(int i)
    {
        a = i;
        super();
    }

    public final volatile int a(Object obj)
    {
        return 1;
    }

    public final long b(Object obj)
    {
        return ((Cursor)obj).getLong(a);
    }
}
