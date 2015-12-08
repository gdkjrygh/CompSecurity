// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class gad extends nzc
{

    private final String a;
    private final String b;
    private final String c;
    private String d;

    private gad(Context context, int i, String s, String s1, String s2)
    {
        super(context, (new nyh()).a(context, i).a(), "photoseditcaption", new pch(), new pci());
        boolean flag;
        boolean flag1;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        flag = TextUtils.isEmpty(s1);
        flag1 = TextUtils.isEmpty(s2);
        p.a(flag ^ flag1);
        a = s;
        b = s2;
        c = s1;
        if (!flag1)
        {
            d = ((mmv)olm.a(context, mmv)).a(i).b("gaia_id");
        }
    }

    public static gad a(Context context, int i, String s, String s1)
    {
        return new gad(context, i, s, null, s1);
    }

    public static gad b(Context context, int i, String s, String s1)
    {
        return new gad(context, i, s, s1, null);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pch)qlw;
        qlw.a = new pjp();
        qlw = ((pch) (qlw)).a;
        qlw.d = a;
        if (!TextUtils.isEmpty(c))
        {
            qlw.b = c;
            return;
        } else
        {
            qlw.c = b;
            qlw.a = d;
            return;
        }
    }
}
