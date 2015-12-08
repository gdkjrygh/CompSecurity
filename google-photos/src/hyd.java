// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class hyd extends fud
{

    private final hye c;

    public hyd(am am, opd opd, hye hye1)
    {
        super(am, opd, c.eK);
        c = hye1;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new hyc(b, bundle.getInt("account_id"), hsw.valueOf(bundle.getString("searchCategory")));
    }

    public final void a(int i, hsw hsw1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", i);
        bundle.putString("searchCategory", hsw1.name());
        b(bundle);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (hsr)obj;
        c.a(ei);
    }
}
