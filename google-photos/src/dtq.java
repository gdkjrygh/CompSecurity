// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

public final class dtq extends mtf
{

    private final String a;

    public dtq(String s)
    {
        super("InstallLogTask");
        a = s;
    }

    protected final mue a(Context context)
    {
        Object obj;
        obj = (lvs)olm.a(context, lvs);
        dst dst1 = (dst)olm.a(context, dst);
        String s1 = a;
        dst1.a().edit().putString("referrer", s1).commit();
        obj = ((lvs) (obj)).a(context);
        String s = ((lvt) (obj)).a();
        boolean flag = ((lvt) (obj)).b();
        (new obs(a, 1, 1, s, flag)).b(context);
        context = new mue(true);
        return context;
        context;
_L2:
        return new mue(0, context, null);
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
