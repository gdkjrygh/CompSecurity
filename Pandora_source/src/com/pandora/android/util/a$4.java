// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.util:
//            a

static final class a
    implements android.content.ogInterface.OnDismissListener
{

    final Intent a;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (a != null)
        {
            b.a.C().a(a);
        }
    }

    ce(Intent intent)
    {
        a = intent;
        super();
    }
}
