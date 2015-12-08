// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            i

final class l
    implements android.content.DialogInterface.OnClickListener
{

    final Intent a;
    final i b;

    l(i j, Intent intent)
    {
        b = j;
        a = intent;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        Singleton.b().a(Event.OFFLINE_SETUP_WIFI_CLICKED, null, null);
        i.b(b).startActivity(a);
    }
}
