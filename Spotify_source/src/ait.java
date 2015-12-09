// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.comscore.applications.EventType;
import java.util.HashMap;

final class ait
    implements Runnable
{

    private EventType a;
    private HashMap b;
    private aif c;

    ait(aif aif1, EventType eventtype, HashMap hashmap)
    {
        c = aif1;
        a = eventtype;
        b = hashmap;
        super();
    }

    public final void run()
    {
        c.a(a, b);
    }
}
