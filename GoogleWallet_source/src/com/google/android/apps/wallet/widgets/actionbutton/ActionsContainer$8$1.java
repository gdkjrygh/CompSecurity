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

final class on extends AnimatorListenerAdapter
{

    final on.getIntent this$1;
    final on val$action;

    public final void onAnimationEnd(Animator animator)
    {
        getContext().startActivity(val$action.getIntent());
    }

    on()
    {
        this$1 = final_on;
        val$action = on.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/widgets/actionbutton/ActionsContainer$8

/* anonymous class */
    final class ActionsContainer._cls8
        implements android.view.View.OnClickListener
    {

        final ActionsContainer this$0;

        public final void onClick(View view)
        {
            view = (ActionsContainer.Action)view.getTag(com.google.android.apps.walletnfcrel.R.id.FloatingActionButtonAction);
            close();
            if (ActionsContainer.access$200(ActionsContainer.this) != null)
            {
                ActionsContainer.access$200(ActionsContainer.this).addListener(view. new ActionsContainer._cls8._cls1());
                return;
            } else
            {
                getContext().startActivity(view.getIntent());
                return;
            }
        }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
    }

}
