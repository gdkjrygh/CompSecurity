// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class arh
{

    private static arh b;
    public Map a;

    public arh()
    {
        a = new HashMap();
    }

    public static arh a()
    {
        if (b == null)
        {
            b();
        }
        return b;
    }

    public static String a(String s)
    {
        return (new StringBuilder("com.facebook.internal.PendingCallStore.")).append(s).toString();
    }

    private static void b()
    {
        arh;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new arh();
        }
        arh;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(UUID uuid)
    {
        if (uuid != null)
        {
            a.remove(uuid.toString());
        }
    }

    public final com.facebook.widget.FacebookDialog.PendingCall b(UUID uuid)
    {
        if (uuid == null)
        {
            return null;
        } else
        {
            return (com.facebook.widget.FacebookDialog.PendingCall)a.get(uuid.toString());
        }
    }
}
