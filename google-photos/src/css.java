// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class css
{

    private final Context a;
    private final String b;

    public css(Context context, String s)
    {
        a = (Context)b.a(context, "context", null);
        b = b.a(s, "dirName");
    }

    public final csp a(csq csq, csr csr)
    {
        return new csp(a, a.getDir(b, 0), csq, csr);
    }
}
