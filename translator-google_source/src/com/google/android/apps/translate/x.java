// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.DialogInterface;
import com.google.android.libraries.translate.c.c;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.apps.translate:
//            TranslateActivity

final class x
    implements android.content.DialogInterface.OnClickListener
{

    final TranslateActivity a;

    x(TranslateActivity translateactivity)
    {
        a = translateactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        (new c()).a(a).d();
        Singleton.b().a(Event.HISTORY_CLEAR_FROM_MENU, null, null);
        com.google.android.libraries.translate.e.h.a(14);
    }
}
