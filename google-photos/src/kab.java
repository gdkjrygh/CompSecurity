// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

final class kab extends BroadcastReceiver
{

    private WeakReference a;

    kab(jzu jzu1)
    {
        a = new WeakReference(jzu1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        intent = intent.getData();
        context = null;
        if (intent != null)
        {
            context = intent.getSchemeSpecificPart();
        }
        if (context != null && context.equals("com.google.android.gms"))
        {
            if ((context = (jzu)a.get()) != null)
            {
                jzu.a(context);
                return;
            }
        }
    }
}
