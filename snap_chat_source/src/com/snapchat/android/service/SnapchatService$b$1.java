// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.service;


// Referenced classes of package com.snapchat.android.service:
//            SnapchatService

final class a
    implements Runnable
{

    private RuntimeException a;

    public final void run()
    {
        throw a;
    }

    (RuntimeException runtimeexception)
    {
        a = runtimeexception;
        super();
    }
}
