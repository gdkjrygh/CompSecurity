// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.apps.unveil.env.f;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput

public final class x extends f
{

    boolean b;
    final TextInput c;

    x(TextInput textinput)
    {
        c = textinput;
        super();
        b = false;
    }

    protected final Object a()
    {
        TextInput.a(c, b);
        return null;
    }

    protected final volatile void a(Object obj)
    {
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        super.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
