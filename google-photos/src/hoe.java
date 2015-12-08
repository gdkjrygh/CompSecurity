// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.HashMap;

public final class hoe
    implements opl, opn, ops, opv
{

    hgz a;
    HashMap b;
    hof c;

    public hoe(opd opd1)
    {
        c = new hof(this);
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (HashMap)bundle.getSerializable("item_id_map");
        }
    }

    public final void c()
    {
        a.b(c);
    }

    public final void e(Bundle bundle)
    {
        bundle.putSerializable("item_id_map", b);
    }
}
