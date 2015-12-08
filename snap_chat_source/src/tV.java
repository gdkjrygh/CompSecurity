// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.database.table.SnapbryoTable;
import java.util.ArrayList;
import java.util.Collection;

public final class tV extends SnapbryoTable
{

    private static tV a = new tV();

    private tV()
    {
    }

    public static tV a()
    {
        return a;
    }

    protected final Collection a(Br br)
    {
        return new ArrayList(Bf.a().e());
    }

    public final void b(Br br)
    {
        Bf.a().b(a(null, null));
    }

    public final String c()
    {
        return "PostingSnapbryoTable";
    }

}
