// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

public final class j
    implements android.view.View.OnClickListener
{

    private final Intent a;
    private final Event b;

    public j(Intent intent, Event event)
    {
        a = intent;
        b = event;
    }

    public final void onClick(View view)
    {
        try
        {
            view.getContext().startActivity(a);
            Singleton.b().a(b, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }
}
