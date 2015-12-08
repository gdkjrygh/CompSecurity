// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.listener;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.ui.listener:
//            Listeners, OnActionListener

final class val.action
    implements android.view.Listener
{

    final Object val$action;
    final OnActionListener val$listener;

    public final void onClick(View view)
    {
        val$listener.onAction(val$action);
    }

    ener()
    {
        val$listener = onactionlistener;
        val$action = obj;
        super();
    }
}
