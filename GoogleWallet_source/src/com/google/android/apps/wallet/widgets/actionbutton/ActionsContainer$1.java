// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.widgets.actionbutton:
//            ActionsContainer, FloatingActionButton

final class val.id
    implements Runnable
{

    final ActionsContainer this$0;
    final Context val$context;
    final int val$id;

    public final void run()
    {
        if (ActionsContainer.access$100(ActionsContainer.this) != null)
        {
            return;
        } else
        {
            FloatingActionButton floatingactionbutton = (FloatingActionButton)Views.findViewById((Activity)val$context, val$id);
            setFloatingActionButton(floatingactionbutton);
            return;
        }
    }

    n()
    {
        this$0 = final_actionscontainer;
        val$context = context1;
        val$id = I.this;
        super();
    }
}
