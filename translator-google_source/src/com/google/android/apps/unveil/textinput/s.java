// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.apps.unveil.env.j;
import com.google.android.apps.unveil.sensors.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput

final class s
    implements m
{

    final AtomicReference a;
    final TextInput b;

    s(TextInput textinput, AtomicReference atomicreference)
    {
        b = textinput;
        a = atomicreference;
        super();
    }

    public final void a(j j)
    {
        a.set(j);
        TextInput.c(b);
        TextInput.d(b).countDown();
    }
}
