// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import com.google.android.libraries.translate.tts.a.k;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.widget:
//            LangSpinner, af, ab

final class ag
    implements Runnable
{

    final String a;
    final af b;

    ag(af af1, String s)
    {
        b = af1;
        a = s;
        super();
    }

    public final void run()
    {
        LangSpinner.a().put(a, Integer.valueOf(2));
        new k(a);
        af.c(b).notifyDataSetChanged();
    }
}
