// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.bmwgroup.connected.car.internal.SdkManager;

public class agw
    implements ahy
{

    public static final ahn b = ahn.a("connected.car.sdk");
    public final String c;
    public final agm d = (agm)aia.a().a(agj);

    public agw(String s)
    {
        b.a("InternalWidget(%s)", new Object[] {
            s
        });
        c = s;
        SdkManager.a.a(c, this);
    }

    public void a(boolean flag)
    {
        b.a("setVisible(%s)", new Object[] {
            Boolean.valueOf(flag)
        });
        d.a(c, flag);
    }

}
