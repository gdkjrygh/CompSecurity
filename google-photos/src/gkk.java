// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.ContentObserver;
import java.util.HashMap;
import java.util.Map;

final class gkk
{

    private final Context a;
    private final gkm b;
    private final Map c = new HashMap();

    gkk(Context context, gkm gkm)
    {
        a = context;
        b = gkm;
    }

    final void a(ehr ehr1)
    {
        if (c.containsKey(ehr1))
        {
            return;
        } else
        {
            gkl gkl1 = new gkl(b, ehr1);
            c.put(ehr1, gkl1);
            b.b(a, ehr1.a).a(ehr1.a, gkl1);
            return;
        }
    }

    final void b(ehr ehr1)
    {
        if (!c.containsKey(ehr1))
        {
            return;
        } else
        {
            ContentObserver contentobserver = (ContentObserver)c.remove(ehr1);
            b.b(a, ehr1.a).b(ehr1.a, contentobserver);
            return;
        }
    }
}
