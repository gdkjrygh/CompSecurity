// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.ImageType;
import java.util.Hashtable;

final class ang.Object
    implements egc
{

    private egc a;
    private String b;
    private egi c;

    public final void a(boolean flag)
    {
        if (!flag)
        {
            a.a(false);
        }
        awf awf1 = new awf();
        auu auu1 = new auu();
        auu1.a(b);
        auu1.a(ImageType.b);
        awf1.b.put("graphic", auu1);
        c.a.a(awf1, a);
    }

    (egi egi1, egc egc1, String s)
    {
        c = egi1;
        a = egc1;
        b = s;
        super();
    }
}
