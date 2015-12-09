// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.bmwgroup.connected.car.internal.SdkManager;

public abstract class agr extends agw
    implements ahq
{

    private Object a;

    public agr(String s)
    {
        super(s);
    }

    public void a(adm adm)
    {
        b.b("setScreenListener(mIdent=%s, l=%s)", new Object[] {
            c, adm
        });
        String s = SdkManager.a.a(c, adm, false);
        if (adm != null && s != null)
        {
            d.a(c, s);
        }
    }

    public final void a(Object obj)
    {
        a = obj;
    }

    public final Object c()
    {
        return a;
    }
}
