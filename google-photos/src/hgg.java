// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class hgg
{

    public int a;
    public Context b;
    public String c;
    public String d;
    hgk e;
    public boolean f;
    public boolean g;

    public hgg()
    {
        a = -1;
    }

    public final hgf a()
    {
        boolean flag1 = true;
        p.a(b);
        boolean flag;
        if (a != -1 || g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (!TextUtils.isEmpty(c))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        return new hgf(this);
    }
}
