// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;


// Referenced classes of package org.chromium.base.library_loader:
//            Linker

static final class val.opaque
    implements Runnable
{

    final long val$opaque;

    public void run()
    {
        Linker.access$000(val$opaque);
    }

    (long l)
    {
        val$opaque = l;
        super();
    }
}
