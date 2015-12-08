// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.widget:
//            LangSpinner, af, ab

final class ah
    implements Runnable
{

    final String a;
    final af b;

    ah(af af1, String s)
    {
        b = af1;
        a = s;
        super();
    }

    public final void run()
    {
        LangSpinner.a().put(a, Integer.valueOf(1));
        af.c(b).notifyDataSetChanged();
    }
}
