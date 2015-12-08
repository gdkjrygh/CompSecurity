// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.content.DialogInterface;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

final class a
    implements android.content.ssListener
{

    final ActivitySignedInBase a;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.q = null;
        ActivitySignedInBase.a(a);
    }

    ssListener(ActivitySignedInBase activitysignedinbase)
    {
        a = activitysignedinbase;
        super();
    }
}
