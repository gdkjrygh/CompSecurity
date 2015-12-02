// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.os.PowerManager;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.common.hardware:
//            o

public class n
{

    private final PowerManager a;
    private final Map b = ik.c();
    private long c;

    public n(PowerManager powermanager)
    {
        c = 0L;
        a = powermanager;
    }

    public o a(int i, String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new o(this, a.newWakeLock(i, s), s);
        b.put(s, s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }
}
