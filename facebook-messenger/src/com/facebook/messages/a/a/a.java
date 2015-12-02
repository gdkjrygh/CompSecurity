// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.a.a;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.base.c;
import com.facebook.common.e.h;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.messages.a.a:
//            b, c

public class a
    implements c
{

    private final com.facebook.abtest.qe.c a;
    private final h b;
    private Optional c;
    private Optional d;

    public a(com.facebook.abtest.qe.c c1, h h1)
    {
        c = null;
        d = null;
        a = (com.facebook.abtest.qe.c)Preconditions.checkNotNull(c1);
        b = (h)Preconditions.checkNotNull(h1);
    }

    public void a()
    {
        i.a(a.a("messaging_composer_text", new b(this)), new com.facebook.messages.a.a.c(this));
    }

    void a(QuickExperimentInfo quickexperimentinfo)
    {
        this;
        JVM INSTR monitorenter ;
        c = quickexperimentinfo.a("recipient_label");
        d = quickexperimentinfo.a("recipient_placeholder");
        this;
        JVM INSTR monitorexit ;
        return;
        quickexperimentinfo;
        throw quickexperimentinfo;
    }

    public Optional b()
    {
        this;
        JVM INSTR monitorenter ;
        Optional optional = c;
        this;
        JVM INSTR monitorexit ;
        return optional;
        Exception exception;
        exception;
        throw exception;
    }

    public Optional c()
    {
        this;
        JVM INSTR monitorenter ;
        Optional optional = d;
        this;
        JVM INSTR monitorexit ;
        return optional;
        Exception exception;
        exception;
        throw exception;
    }
}
