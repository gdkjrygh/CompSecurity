// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class iqc
    implements iqb
{

    private final Context a;
    private final int b;
    private final String c;
    private final String d;

    public iqc(Context context, int i, String s, String s1)
    {
        a = context;
        b = i;
        d = s;
        c = s1;
    }

    public final void a()
    {
        mtj.b(a, new hlv(b, d, c));
    }
}
