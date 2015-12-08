// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.common.collect.ImmutableSet;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            c

public class d
{

    private static final Set b = ImmutableSet.of(Integer.valueOf(0));
    public final Set a;
    private final InputStream c = null;
    private AtomicBoolean d;

    protected d(Set set)
    {
        d = new AtomicBoolean();
        a = set;
    }

    public c a(int i)
    {
        if (i != 8000 && i != 11025 && i != 16000)
        {
            throw new GsaIOException((new StringBuilder(70)).append("Unsupported sample rate: ").append(i).append(", must be 8000, 11025, or 16000 Hz").toString(), 0x6001b);
        }
        if (!d.compareAndSet(false, true))
        {
            throw new GsaIOException("reader already created once", 0x60013);
        } else
        {
            return new c(c, 1);
        }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
    }

}
