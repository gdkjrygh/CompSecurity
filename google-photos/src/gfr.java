// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

final class gfr
    implements gfq
{

    private Map a;

    gfr()
    {
        a = new HashMap();
    }

    public final Uri a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (Uri)a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s, Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(s, uri);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean a(Uri uri)
    {
        return a.containsValue(uri);
    }
}
