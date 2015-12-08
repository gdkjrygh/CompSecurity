// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class omr extends oqc
    implements olp
{

    public final olm d = new olm();
    private opi f;

    public omr()
    {
    }

    static oqd a(omr omr1)
    {
        return omr1.e;
    }

    public void a(Bundle bundle)
    {
        d.a(new omi(this, e));
    }

    public final olm ai_()
    {
        return d;
    }

    public void onCreate(Bundle bundle)
    {
        olm olm1 = olm.b(getApplicationContext());
        d.a(this);
        d.a = olm1;
        a(bundle);
        for (Iterator iterator = d.c(omm).iterator(); iterator.hasNext(); ((omm)iterator.next()).a(this, e)) { }
        d.a();
        f = e.a(new oms(this, bundle));
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        e.b(f);
        super.onDestroy();
    }
}
