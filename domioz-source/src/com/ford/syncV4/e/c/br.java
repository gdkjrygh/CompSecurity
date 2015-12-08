// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.g;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.e.c:
//            ca

public final class br extends g
{

    public br()
    {
        super("SubscribeVehicleData");
    }

    public br(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final ca i()
    {
        Object obj;
        obj = b.get("gps");
        if (obj instanceof ca)
        {
            return (ca)obj;
        }
        if (!(obj instanceof Hashtable))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = new ca((Hashtable)obj);
        return ((ca) (obj));
        Exception exception;
        exception;
        c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".gps").toString(), exception);
        return null;
    }
}
