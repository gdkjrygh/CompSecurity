// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public final class atg
    implements atm
{

    private final Context a;

    atg(Context context)
    {
        a = context;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (Uri)obj;
        return new atn(new azw(obj), new ati(a, ((Uri) (obj))));
    }

    public final boolean a(Object obj)
    {
        return b.a((Uri)obj);
    }
}
