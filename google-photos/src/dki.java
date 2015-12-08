// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class dki
{

    public String a;
    public int b;
    public int c;
    public String d;
    public String e;

    public dki()
    {
        b = -1;
        c = -1;
    }

    public final ekq a()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(a) || b != -1 || !TextUtils.isEmpty(d) || !TextUtils.isEmpty(e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Either query, clusterId, entityId or placeId must be set.");
        if (-1 != c)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "Account ID should be set");
        return new dnx(a, b, c, d, e);
    }
}
