// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class ome extends opz
    implements olp
{

    private opi d;
    public final olm f = new olm();

    public ome()
    {
    }

    static oqd a(ome ome1)
    {
        return ome1.g;
    }

    public void a(Bundle bundle)
    {
        f.a(new omi(this, g));
    }

    public final olm ai_()
    {
        return f;
    }

    public void onCreate(Bundle bundle)
    {
        olm olm1 = olm.b(getApplicationContext());
        f.a(this);
        f.a = olm1;
        a(bundle);
        for (Iterator iterator = f.c(omm).iterator(); iterator.hasNext(); ((omm)iterator.next()).a(this, g)) { }
        f.a();
        d = g.a(new omf(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        g.b(d);
        super.onDestroy();
    }
}
