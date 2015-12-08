// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

public final class dtk extends mtf
{

    public dtk()
    {
        super("LogFirstOpenTask");
    }

    protected final mue a(Context context)
    {
        dst dst1;
        Object obj;
        obj = (lvs)olm.a(context, lvs);
        dst1 = (dst)olm.a(context, dst);
        if (dst1.a().getBoolean("first_open_complete", false))
        {
            return new mue(true);
        }
        String s = dst1.a().getString("referrer", null);
        obj = ((lvs) (obj)).a(context);
        (new obs(s, 1, 2, ((lvt) (obj)).a(), ((lvt) (obj)).b())).b(context);
        dst1.a().edit().putBoolean("first_open_complete", true).commit();
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
