// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class hif
    implements dhv, omb, opv
{

    private ekb a;
    private hhu b;

    public hif(opd opd1)
    {
        opd1.a(this);
    }

    public final void a()
    {
        Object obj = a.a();
        HashMap hashmap = new HashMap();
        ekp ekp1;
        ekq ekq;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List)hashmap.get(ekq)).add(ekp1))
        {
            ekp1 = (ekp)((Iterator) (obj)).next();
            ekq = ekp1.e();
            if (!hashmap.containsKey(ekq))
            {
                hashmap.put(ekq, new ArrayList());
            }
        }

        b.a(hashmap);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (ekb)olm1.a(ekb);
        b = (hhu)olm1.a(hhu);
    }
}
