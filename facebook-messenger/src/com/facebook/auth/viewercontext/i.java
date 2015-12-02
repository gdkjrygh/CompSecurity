// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.userscope.b;
import com.facebook.auth.userscope.e;
import com.facebook.base.h;
import com.facebook.inject.aq;
import javax.inject.a;

// Referenced classes of package com.facebook.auth.viewercontext:
//            f, e

public class i
    implements a
{

    private final com.facebook.auth.b.b a;
    private final a b;
    private final f c;
    private final b d;

    public i(com.facebook.auth.b.b b1, a a1, Context context, b b2)
    {
        a = b1;
        b = a1;
        c = new f(b1, context);
        d = b2;
    }

    public com.facebook.auth.viewercontext.e a()
    {
        Context context;
        if (d.getCurrentViewerContextManager() != null)
        {
            return new e(a, d.getCurrentViewerContextManager());
        }
        context = (Context)b.b();
        if (!(context instanceof Activity))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!(context instanceof h))
        {
            throw new aq("Activity must support PropertyBag interface");
        }
        h h1 = (h)context;
        this;
        JVM INSTR monitorenter ;
        f f1 = (f)h1.a(this);
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        f1 = new f(a, context);
        h1.a(this, f1);
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        return c;
    }

    public Object b()
    {
        return a();
    }
}
