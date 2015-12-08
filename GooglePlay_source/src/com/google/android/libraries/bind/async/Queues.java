// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;


// Referenced classes of package com.google.android.libraries.bind.async:
//            Queue, AsyncUtil

public class Queues
{

    public static final Queue BIND_CPU = new Queue("BIND_CPU");
    public static final Queue BIND_IMMEDIATE = new Queue("BIND_IMMEDIATE", AsyncUtil.immediateExecutor());
    public static final Queue BIND_MAIN = new Queue("BIND_MAIN", AsyncUtil.mainThreadExecutor());

    public Queues()
    {
    }

}
