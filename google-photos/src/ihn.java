// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;

public final class ihn extends mtf
{

    private final int a;
    private final ihi b;
    private final String c;
    private final boolean j;
    private final boolean k;

    public ihn(int i, ihi ihi1, String s, boolean flag, boolean flag1)
    {
        super("GetOrCreateEnvelopeTask");
        boolean flag2;
        if (i != -1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        p.a(flag2, "must specify a valid accountId");
        p.b(ihi1, "must specify a non-null envelope");
        a = i;
        b = ihi1;
        c = s;
        j = flag;
        k = flag1;
    }

    private mue a(Context context, String s)
    {
        context = new ihr(context, a, c, s);
        context.d();
        if (context.l())
        {
            return new mue(((nxx) (context)).l, ((nxx) (context)).n, null);
        }
        String s1 = ((ihr) (context)).a;
        if (TextUtils.isEmpty(s1))
        {
            return new mue(false);
        } else
        {
            ihm ihm1 = new ihm();
            ihm1.a = s;
            ihm1.b = s1;
            ihm1.c = ((ihr) (context)).b;
            return a(ihm1.a());
        }
    }

    private static mue a(ihk ihk)
    {
        mue mue1 = new mue(true);
        mue1.a().putParcelable("envelope_details", ihk);
        return mue1;
    }

    private mue g(Context context)
    {
        ihd ihd1 = new ihd(context, a, b, k);
        ((hpz)olm.a(context, hpz)).a(a, ihd1);
        if (ihd1.k())
        {
            return new mue(0, new IOException(ihd1.a.a), null);
        }
        if (ihd1.j())
        {
            ((erz)olm.a(context, erz)).a(a, new qfz[] {
                ihd1.d
            });
        }
        context = new ihm();
        context.a = ihd1.c;
        context.b = ihd1.b;
        context.c = b.d;
        context.d = true;
        return a(context.a());
    }

    protected final mue a(Context context)
    {
        iho.a[b.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 88
    //                   2 88
    //                   3 271;
           goto _L1 _L2 _L2 _L3
_L1:
        context = String.valueOf(b.a);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(context).length() + 26)).append("Unexpected envelope type: ").append(context).toString());
_L2:
        Object obj;
        obj = ((hhn)olm.a(context, hhn)).a(a, b.b).a;
        if (j)
        {
            return a(context, ((String) (obj)));
        }
        obj = ((erz)olm.a(context, erz)).d(a, ((String) (obj)));
        if (obj != null && ((qfz) (obj)).b != null && !b.a(((qfz) (obj)).b.f)) goto _L5; else goto _L4
_L4:
        obj = null;
_L10:
        pzy pzy1;
        int i;
        int l;
        if (obj != null)
        {
            return a(context, ((String) (obj)));
        } else
        {
            return g(context);
        }
_L5:
        obj = ((qfz) (obj)).b.f;
        l = obj.length;
        i = 0;
_L11:
        if (i >= l) goto _L7; else goto _L6
_L6:
        pzy1 = obj[i];
        if (pzy1.a != 12 || pzy1.b == null || pzy1.b.a == null) goto _L9; else goto _L8
_L8:
        obj = pzy1.b.a.a;
          goto _L10
_L9:
        i++;
          goto _L11
_L7:
        obj = null;
          goto _L10
_L3:
        return g(context);
    }
}
