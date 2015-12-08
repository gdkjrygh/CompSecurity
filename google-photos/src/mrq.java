// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class mrq
{

    public final int a;
    public final String b;
    public final String c;

    private mrq(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public static mrq a(int i)
    {
        boolean flag;
        if (i != 0 && i != mrr.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "status must be non-empty and non-success");
        return new mrq(i, null, null);
    }

    public static mrq a(String s, String s1)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "photoId must be non-empty.");
        return new mrq(mrr.a, s, s1);
    }
}
