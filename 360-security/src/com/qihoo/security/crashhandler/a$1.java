// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;


// Referenced classes of package com.qihoo.security.crashhandler:
//            a

static final class a
    implements Runnable
{

    final Process a;

    public void run()
    {
        a.destroy();
    }

    (Process process)
    {
        a = process;
        super();
    }
}
