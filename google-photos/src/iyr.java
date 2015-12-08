// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Set;

final class iyr
    implements iyx
{

    private final dse a;

    iyr(Context context)
    {
        a = new dse(context, eun.b, new iys());
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return a.a(i, ((Cursor) (obj)));
    }

    public final Set a()
    {
        dse dse1 = a;
        return dse.a;
    }

    public final Class b()
    {
        dse dse1 = a;
        return hpg;
    }
}
