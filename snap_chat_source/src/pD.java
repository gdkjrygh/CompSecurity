// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class pD
    implements Xt
{

    public pD()
    {
    }

    public final XA a(Xt.a a1)
    {
        Object obj = a1.a();
        String s;
        if (obj == null)
        {
            s = null;
        } else
        {
            s = (String)((Xy) (obj)).e;
        }
        a1 = a1.a(((Xy) (obj)));
        if (a1 != null)
        {
            obj = a1.a("Content-Length");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = eR.a(((String) (obj)));
                if (obj != null)
                {
                    pj.a(s, ((Long) (obj)).longValue());
                }
            }
        }
        return a1;
    }
}
