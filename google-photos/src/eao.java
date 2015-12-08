// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

final class eao
    implements dzd
{

    private final Context a;
    private final String b;

    eao(Context context, String s)
    {
        a = context;
        b = s;
    }

    public final Intent a(int i, pzt pzt1)
    {
        boolean flag1 = true;
        String s;
        fhm fhm1;
        boolean flag;
        if (pzt1.c != null && pzt1.c.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "assistantMessage must have a non-empty collection");
        pzt1 = pzt1.c[0];
        if (((qfz) (pzt1)).a != null && !TextUtils.isEmpty(((qfz) (pzt1)).a.a))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "collection must have a media key");
        s = ((qfz) (pzt1)).a.a;
        if (((qfz) (pzt1)).b == null)
        {
            pzt1 = null;
        } else
        {
            pzt1 = ((qfz) (pzt1)).b.h;
        }
        fhm1 = new fhm(a);
        fhm1.a = i;
        fhm1.b = s;
        fhm1.c = pzt1;
        return fhm1.a();
    }

    public final Object a()
    {
        return b;
    }
}
