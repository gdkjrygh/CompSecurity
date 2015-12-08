// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;

// Referenced classes of package org.chromium.net:
//            CronetLibraryLoader

static final class a
    implements Runnable
{

    private Context a;

    public final void run()
    {
        CronetLibraryLoader.a(a);
    }

    (Context context)
    {
        a = context;
        super();
    }
}
