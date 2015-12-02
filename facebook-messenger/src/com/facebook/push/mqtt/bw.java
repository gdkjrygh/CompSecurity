// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.os.RemoteException;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.facebook.push.mqtt:
//            j, bu, bx

public class bw
{

    private final bx a;
    private volatile j b;
    private volatile boolean c;

    bw(bx bx1)
    {
        a = bx1;
    }

    private j d()
    {
        e();
        j j1 = b;
        if (j1 == null)
        {
            throw new IllegalStateException("No service bound");
        } else
        {
            return j1;
        }
    }

    private void e()
    {
        if (c)
        {
            throw new IllegalStateException("Closed already called");
        } else
        {
            return;
        }
    }

    void a(j j1)
    {
        b = j1;
    }

    public boolean a()
    {
        return d().a();
    }

    public boolean a(long l)
    {
        return d().a(l);
    }

    public boolean a(String s, JsonNode jsonnode, long l)
    {
        return d().a(s, jsonnode.toString(), l);
    }

    public bu b()
    {
        e();
        Object obj = b;
        if (obj == null)
        {
            return bu.DISCONNECTED;
        }
        try
        {
            obj = bu.valueOf(((j) (obj)).c());
        }
        catch (RemoteException remoteexception)
        {
            return bu.DISCONNECTED;
        }
        return ((bu) (obj));
    }

    public void c()
    {
        a.a(this);
        c = true;
    }
}
