// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.HandlerThread;
import com.facebook.auth.annotations.ViewerContextUserId;
import com.facebook.auth.c.b;
import com.facebook.common.e.h;
import com.facebook.common.process.MyProcessId;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.i.a:
//            c, o

class p extends d
{

    private p()
    {
    }

    p(o o)
    {
        this();
    }

    public c a()
    {
        return new c(b(java/lang/Integer, com/facebook/common/process/MyProcessId), (com.facebook.common.process.d)a(com/facebook/common/process/d), (h)a(com/facebook/common/e/h), (HandlerThread)a(android/os/HandlerThread), b(java/lang/String, com/facebook/auth/annotations/ViewerContextUserId), (b)a(com/facebook/auth/c/b));
    }

    public Object b()
    {
        return a();
    }
}
