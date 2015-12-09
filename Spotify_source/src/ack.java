// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class ack
{

    private static act f = acl.a();
    String a;
    Double b;
    String c;
    Map d;
    Map e;

    public ack(String s)
    {
        boolean flag = false;
        super();
        act act1 = f;
        if (s.length() != 6)
        {
            act1.e("Malformed Event Token '%s'", new Object[] {
                s
            });
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return;
        } else
        {
            a = s;
            return;
        }
    }

}
