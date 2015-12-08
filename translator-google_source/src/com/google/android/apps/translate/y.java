// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;

// Referenced classes of package com.google.android.apps.translate:
//            w, TranslateActivity

final class y extends w
{

    final TranslateActivity c;

    y(TranslateActivity translateactivity, Context context, String s, Language language, Event event)
    {
        c = translateactivity;
        super(context, s, language, event);
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        TranslateActivity.a(c, TranslateActivity.a(c) & ((w)dialoginterface).a);
    }
}
