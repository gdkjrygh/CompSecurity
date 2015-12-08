// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class imk
    implements nmu
{

    private final Context a;
    private final mhh b;
    private final noz c;

    imk(Context context, mhh mhh1)
    {
        a = context;
        b = mhh1;
        c = noz.a(context, 3, "ABStoragePolicyLoader", new String[0]);
    }

    private mhj b(String s)
    {
        mhe mhe1 = b.a(a, s);
        mhe1.a(10L, TimeUnit.SECONDS);
        if (!mhe1.c()) goto _L2; else goto _L1
_L1:
        s = (mhl)mhe1.d().a(5L, TimeUnit.SECONDS);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (!s.r().a() || s.a().isEmpty())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        s = (mhj)s.a().get(0);
        mhe1.b();
        return s;
        if (!c.a()) goto _L2; else goto _L3
_L3:
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        s = null;
_L4:
        noy.a("status", s);
_L2:
        mhe1.b();
        return null;
        s = s.r();
          goto _L4
        s;
        mhe1.b();
        throw s;
    }

    public final nnb a(String s)
    {
        p.a(s, "accountName must be non-empty");
        mhj mhj1 = b(s);
        if (mhj1 != null && mhj1.b && TextUtils.equals(s, mhj1.a))
        {
            if (mhj1.g)
            {
                s = nnb.b;
            } else
            {
                s = nnb.a;
            }
        } else
        {
            s = nnb.c;
        }
        if (c.a())
        {
            noy.a("storagePolicy", s);
        }
        return s;
    }
}
