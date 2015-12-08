// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

final class fcf
    implements fbk
{

    private final Context a;
    private final noz b;

    public fcf(Context context)
    {
        a = context;
        b = noz.a(context, 5, "PhotosDeviceMgmt", new String[0]);
    }

    private static void a(mhe mhe1)
    {
        if (mhe1.c())
        {
            mhe1.b();
        }
    }

    public final String a(String s)
    {
        mhe mhe1;
        p.a(s);
        mhe1 = ((mhh)olm.a(a, mhh)).a(a, s);
        mhe1.a(2L, TimeUnit.SECONDS);
        if (!mhe1.c())
        {
            return null;
        }
        s = (mhn)mhe1.a(s).a();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.r().a()) goto _L2; else goto _L3
_L3:
        s = s.a().e();
_L5:
        a(mhe1);
        return s;
_L2:
        s = null;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        a(mhe1);
        throw s;
    }
}
