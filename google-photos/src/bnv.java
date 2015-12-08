// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.ExecutorService;

final class bnv
    implements bny
{

    private Context a;
    private bww b;
    private noj c;
    private cjs d;
    private ExecutorService e;

    bnv(Context context, bww bww, noj noj, cjs cjs, ExecutorService executorservice)
    {
        a = context;
        b = bww;
        c = noj;
        d = cjs;
        e = executorservice;
        super();
    }

    public final mtf a(String s, brz brz, bnz bnz)
    {
        return new bnu(s, a, b, c, d, e, brz, bnz);
    }
}
