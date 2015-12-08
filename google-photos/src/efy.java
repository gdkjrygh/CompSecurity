// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class efy extends mtf
{

    private final String a;

    public efy(String s)
    {
        super("DisableIfIsActiveAutoBackupAccountBackgroundTask");
        a = s;
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, 4, "DisableAbTask", new String[0]);
        context = ((mhh)olm.a(context, mhh)).a(context, a);
        context.a(60L, TimeUnit.SECONDS);
        if (!context.c())
        {
            if (!noz1.a());
        } else
        {
            Object obj = (mhl)context.d().a(30L, TimeUnit.SECONDS);
            if (((mhl) (obj)).r().a() && !((mhl) (obj)).a().isEmpty())
            {
                obj = (mhj)((mhl) (obj)).a().get(0);
                if (((mhj) (obj)).b && TextUtils.equals(a, ((mhj) (obj)).a))
                {
                    obj = new mhk(((mhj) (obj)));
                    obj.a = false;
                    if (context.a(((mhk) (obj)).a()).a(30L, TimeUnit.SECONDS).r().a())
                    {
                        return new mue(true);
                    }
                } else
                {
                    return new mue(true);
                }
            }
        }
        return new mue(false);
    }
}
