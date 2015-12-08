// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.e;
import p.bh.d;

public class bs extends e
{

    public bs()
    {
        super("SubscribeButton");
    }

    public void a(d d)
    {
        if (d != null)
        {
            b.put("buttonName", d);
            return;
        } else
        {
            b.remove("buttonName");
            return;
        }
    }
}
