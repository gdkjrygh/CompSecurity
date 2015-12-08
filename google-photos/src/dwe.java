// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import android.view.View;
import java.util.Map;

final class dwe
    implements abk
{

    private Map a;
    private dwd b;

    dwe(dwd dwd1, Map map)
    {
        b = dwd1;
        a = map;
        super();
    }

    public final boolean a(MenuItem menuitem)
    {
        menuitem = (dwi)a.get(menuitem);
        ((dwi) (menuitem)).b.a(b.a);
        mry.a(b.b.a.getContext(), 4, (new msn()).a(new msm(((dwi) (menuitem)).c)).a(b.b.a));
        return true;
    }
}
