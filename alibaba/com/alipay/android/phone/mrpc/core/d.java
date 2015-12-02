// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

// Referenced classes of package com.alipay.android.phone.mrpc.core:
//            ag

public abstract class d
    implements ag
{

    protected Method a;
    protected byte b[];
    protected String c;
    protected int d;
    protected String e;
    protected boolean f;

    public d(Method method, int i, String s, byte abyte0[], String s1, boolean flag)
    {
        a = method;
        d = i;
        c = s;
        b = abyte0;
        e = s1;
        f = flag;
    }
}
