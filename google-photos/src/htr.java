// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public final class htr extends fud
{

    private final htt c;

    public htr(am am, opd opd, htt htt1)
    {
        super(am, opd, au.E);
        c = htt1;
    }

    public final ei a(int i, Bundle bundle)
    {
        bundle = bundle.getString("queryString");
        return new hts(b, bundle);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (List)obj;
        c.a(ei);
    }

    public final void a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("queryString", s);
        c(bundle);
    }
}
