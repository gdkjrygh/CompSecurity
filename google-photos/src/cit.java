// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

public final class cit
{

    private final File a;
    private final dfj b;

    public cit(Context context)
    {
        b.a(context, "context", null);
        a = new File(context.getCacheDir(), "aamlogs");
        a.mkdirs();
        b = (dfj)olm.a(context, dfj);
    }

    public final nfj a(String s)
    {
        return new nfj(new File(a, s), 100, 10, b.a());
    }

    public final nfi b(String s)
    {
        return new nfi(new File(a, s));
    }
}
