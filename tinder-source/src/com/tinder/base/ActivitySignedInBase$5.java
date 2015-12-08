// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.content.DialogInterface;
import android.support.v4.app.m;
import com.tinder.fragments.FragmentSideMenu;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

final class a
    implements android.content.ssListener
{

    final ActivitySignedInBase a;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        dialoginterface = (FragmentSideMenu)a.getSupportFragmentManager().a(0x7f0e0210);
        if (dialoginterface != null)
        {
            dialoginterface.c();
        }
    }

    ssListener(ActivitySignedInBase activitysignedinbase)
    {
        a = activitysignedinbase;
        super();
    }
}
