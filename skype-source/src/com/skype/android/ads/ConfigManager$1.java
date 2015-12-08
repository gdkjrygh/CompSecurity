// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;


// Referenced classes of package com.skype.android.ads:
//            ConfigManager

static final class b
    implements Runnable
{

    final nfigListener a;
    final Exception b;

    public final void run()
    {
        a.a(b);
    }

    nfigListener(nfigListener nfiglistener, Exception exception)
    {
        a = nfiglistener;
        b = exception;
        super();
    }
}
