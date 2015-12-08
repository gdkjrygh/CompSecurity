// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.Set;

final class ebk
    implements ebn
{

    private Context a;

    ebk(Context context)
    {
        a = context;
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1 = (qgg)obj;
        obj = new fzi(((qgg) (obj1)).b.a, null);
        obj1 = b.d(((qgg) (obj1)));
        return new fzu((new fzk(a, i, ((fzw) (obj1)))).a(((fzi) (obj))).a);
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return fzu;
    }
}
