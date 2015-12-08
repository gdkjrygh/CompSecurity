// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class npq extends BroadcastReceiver
{

    private CopyOnWriteArraySet a;
    private final npk b;

    public npq(npk npk1)
    {
        a = new CopyOnWriteArraySet();
        b = npk1;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (b.a())
        {
            for (intent = a.iterator(); intent.hasNext(); context.getApplicationContext())
            {
                intent.next();
            }

        }
    }
}
