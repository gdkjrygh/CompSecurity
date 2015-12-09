// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.widgets.actionbutton:
//            ActionsContainer

final class this._cls0
    implements android.view.r
{

    final ActionsContainer this$0;

    public final void onClick(final View action)
    {
        action = (tion)action.getTag(com.google.android.apps.walletnfcrel.ButtonAction);
        close();
        if (ActionsContainer.access$200(ActionsContainer.this) != null)
        {
            ActionsContainer.access$200(ActionsContainer.this).addListener(new AnimatorListenerAdapter() {

                final ActionsContainer._cls8 this$1;
                final ActionsContainer.Action val$action;

                public final void onAnimationEnd(Animator animator)
                {
                    getContext().startActivity(action.getIntent());
                }

            
            {
                this$1 = ActionsContainer._cls8.this;
                action = action1;
                super();
            }
            });
            return;
        } else
        {
            getContext().startActivity(action.getIntent());
            return;
        }
    }

    _cls1.val.action()
    {
        this$0 = ActionsContainer.this;
        super();
    }
}
