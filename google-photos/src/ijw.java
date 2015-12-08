// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ijw
    implements ikj
{

    private eto a;

    ijw(eto eto1)
    {
        a = eto1;
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1;
        boolean flag;
        flag = true;
        obj = Collections.singleton(b.c((qgg)obj));
        obj1 = a;
        if (!((Set) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        return new ilc(flag);
_L2:
        obj1 = mvj.b(((eto) (obj1)).a, i);
        erm erm1 = (new erm()).b(((Set) (obj)));
        erm1.i = true;
        if (erm1.a(((android.database.sqlite.SQLiteDatabase) (obj1))) != (long)((Set) (obj)).size())
        {
            flag = false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return ilc;
    }
}
