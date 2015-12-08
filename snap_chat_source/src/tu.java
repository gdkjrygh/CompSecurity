// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.database.table.IdToFileTable;
import java.util.Collection;

public class tu extends IdToFileTable
{

    private final String a;
    private final JY b;

    public tu(String s, JY jy)
    {
        a = s;
        b = jy;
    }

    protected final Collection a(Br br)
    {
        return b.d();
    }

    public final void b(Br br)
    {
        b.a(f());
        b.a(true);
    }

    public final String c()
    {
        return a;
    }
}
