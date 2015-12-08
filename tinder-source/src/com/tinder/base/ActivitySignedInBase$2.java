// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.content.DialogInterface;
import com.tinder.managers.ae;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

final class a
    implements android.content.ssListener
{

    final ActivitySignedInBase a;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (!ae.a())
        {
            a.a("swipeLimit");
        }
    }

    ssListener(ActivitySignedInBase activitysignedinbase)
    {
        a = activitysignedinbase;
        super();
    }
}
