// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.List;

public final class kul extends kwr
{

    final kxu a;
    final kuq b;
    private final String e;

    kul(kxu kxu, kuq kuq, String s)
    {
        a = kxu;
        b = kuq;
        e = s;
        jqc.k().a.add(this);
    }

    public final void a()
    {
        kwz.a.post(new kum(this));
    }
}
