// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;
import p.bh.r;

public class bw extends e
{

    public bw()
    {
        super("SystemRequest");
    }

    public bw(boolean flag)
    {
        super("EncodedSyncPData");
    }

    public void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("data", vector);
            return;
        } else
        {
            b.remove("data");
            return;
        }
    }

    public void a(r r)
    {
        if (r != null)
        {
            b.put("requestType", r);
            return;
        } else
        {
            b.remove("requestType");
            return;
        }
    }
}
