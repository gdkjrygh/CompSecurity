// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public final class hxt extends fud
{

    private final hxu c;

    public hxt(am am, opd opd, hxu hxu1)
    {
        super(am, opd, c.eU);
        c = hxu1;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new hxs(b, bundle.getInt("account_id"), bundle.getString("queryPrefix"), bundle.getInt("maxItemsKey"), bundle.getInt("categoryKey"));
    }

    public final void a(int i, String s, int j, int k)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", i);
        bundle.putString("queryPrefix", s);
        bundle.putInt("maxItemsKey", j);
        bundle.putInt("categoryKey", k);
        c(bundle);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (List)obj;
        c.a(ei);
    }
}
