// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import java.util.Locale;

// Referenced classes of package com.pandora.android.util:
//            r

static final class a
    implements android.content.ogInterface.OnClickListener
{

    final String a[];

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == a.length - 1)
        {
            r.a(null);
            return;
        } else
        {
            r.a(new Locale("en", a[i]));
            return;
        }
    }

    ce(String as[])
    {
        a = as;
        super();
    }
}
