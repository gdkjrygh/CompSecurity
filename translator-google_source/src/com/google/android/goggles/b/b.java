// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.b;

import com.google.android.apps.gsa.a.a.e;
import com.google.android.apps.gsa.a.c;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.f.e.m;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b
    implements c
{

    public e a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public b()
    {
    }

    public final void a(NetworkRecognizeException networkrecognizeexception)
    {
        if (!b.get());
    }

    public final void a(m m1)
    {
        if (!b.get()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (m1.a)
        {
        default:
            return;

        case 1: // '\001'
            b.set(true);
            if (a != null)
            {
                a.a();
                return;
            }
            break;

        case 2: // '\002'
            b(new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException(m1.b));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void b(NetworkRecognizeException networkrecognizeexception)
    {
        while (b.getAndSet(true) || a == null) 
        {
            return;
        }
        a.a();
    }
}
