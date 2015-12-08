// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class csf
    implements csq
{

    private cse a;

    csf(cse cse1)
    {
        a = cse1;
        super();
    }

    public final cvn a(cqa cqa)
    {
        Object obj;
        try
        {
            obj = cse.a(a).a(cqa);
            obj = cse.a(a, ((cnx) (obj)));
        }
        catch (cri cri1)
        {
            String s = cse.a();
            cqa = String.valueOf(cqa);
            Log.w(s, (new StringBuilder(String.valueOf(cqa).length() + 42)).append("Can not extract detail for deleted track: ").append(cqa).toString(), cri1);
            return null;
        }
        return ((cvn) (obj));
    }
}
