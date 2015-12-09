// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            p

public final class ak extends Enum
{

    public static final ak a;
    public static final ak b;
    public static final ak c;
    public static final ak d;
    public static final ak e;
    public static final ak f;
    public static final ak g;
    public static final ak h;
    public static final ak i;
    public static final ak j;
    public static final ak k;
    private static final ak n[];
    private final String l;
    private final String m;

    private ak(String s, int i1)
    {
        super(s, i1);
        s = p.valueOf(name());
        l = s.toString();
        m = s.a();
    }

    static ak a(p p1)
    {
        return valueOf(p1.name());
    }

    public static ak valueOf(String s)
    {
        return (ak)Enum.valueOf(com/threatmetrix/TrustDefenderMobile/ak, s);
    }

    public static ak[] values()
    {
        return (ak[])n.clone();
    }

    public final String a()
    {
        return m;
    }

    final p b()
    {
        return p.valueOf(name());
    }

    public final String toString()
    {
        return l;
    }

    static 
    {
        a = new ak("THM_NotYet", 0);
        b = new ak("THM_OK", 1);
        c = new ak("THM_Connection_Error", 2);
        d = new ak("THM_HostNotFound_Error", 3);
        e = new ak("THM_NetworkTimeout_Error", 4);
        f = new ak("THM_Internal_Error", 5);
        g = new ak("THM_HostVerification_Error", 6);
        h = new ak("THM_Interrupted_Error", 7);
        i = new ak("THM_InvalidOrgID", 8);
        j = new ak("THM_ConfigurationError", 9);
        k = new ak("THM_PartialProfile", 10);
        n = (new ak[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
