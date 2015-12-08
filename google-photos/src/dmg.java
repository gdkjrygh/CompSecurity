// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class dmg
    implements djx
{

    private static final ekz b;
    private static final String c[] = {
        "capture_timestamp"
    };
    private final Context d;
    private final drz e;
    private final noz f;
    private final noz g;

    dmg(Context context)
    {
        d = context;
        e = (drz)olm.a(context, drz);
        f = noz.a(context, 2, "AllMediaProvider", new String[] {
            "perf"
        });
        g = noz.a(context, 3, "AllMediaProvider", new String[] {
            "perf"
        });
    }

    public final boolean a(dke dke1, ekw ekw1, Set set)
    {
        return a.containsAll(set) && b.a(ekw1);
    }

    public final Map b(dke dke1, ekw ekw1, Set set)
    {
        p.a(a.containsAll(set));
        long l = noy.a();
        int i = dke1.a;
        dke1 = mvj.b(d, i);
        erm erm1;
        long l1;
        boolean flag;
        if (!e.a(i).e.contains(gav.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        new HashMap(set.size());
        erm1 = new erm();
        erm1.o = false;
        erm1.h = flag;
        erm1.l = false;
        dke1 = erm1.a(ekw1.f).a(c).b(dke1);
        if (f.a())
        {
            noy.a(i);
            noy.a("duration", l);
        }
        l1 = noy.a();
        ekw1 = b.a(dke1, 0).a(set);
        dke1.close();
        if (g.a())
        {
            noy.a(i);
            noy.a("duration", l);
            noy.a("processing time", l1);
            noy.a("total headers", Integer.valueOf(ekw1.size()));
        }
        return ekw1;
        ekw1;
        dke1.close();
        throw ekw1;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.c = true;
        b = ela1.a();
    }
}
