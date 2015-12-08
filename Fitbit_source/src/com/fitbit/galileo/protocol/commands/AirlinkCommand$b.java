// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.protocol.commands;

import android.os.Bundle;
import android.support.v4.content.Loader;

// Referenced classes of package com.fitbit.galileo.protocol.commands:
//            AirlinkCommand

public static abstract class a
    implements android.support.v4.app.derCallbacks
{

    private final a a;

    public void a(Loader loader, a a1)
    {
    /* block-local class not found */
    class a {}

label0:
        {
            if (a != null)
            {
                if (!a1.a())
                {
                    break label0;
                }
                a.a((AirlinkCommand)loader, a1.b, (Throwable)a1.b.getSerializable(AirlinkCommand.a));
            }
            return;
        }
        a.a((AirlinkCommand)loader, a1.a);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public a(a a1)
    {
        a = a1;
    }
}
