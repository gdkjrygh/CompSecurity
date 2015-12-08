// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.e.h;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.speech:
//            c

final class d extends BroadcastReceiver
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = a;
        intent = getResultExtras(true);
        java.util.ArrayList arraylist = intent.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES");
        context.e = intent.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        context.f = f.b(((c) (context)).e);
        ((c) (context)).d.clear();
        ((c) (context)).c.clear();
        if (arraylist != null)
        {
            for (intent = arraylist.iterator(); intent.hasNext(); c.a((String)intent.next(), ((c) (context)).d, ((c) (context)).c)) { }
        }
        h.a(18);
    }
}
