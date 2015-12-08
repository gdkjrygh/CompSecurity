// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.listener;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.ui.listener:
//            OnActionListener

public final class Listeners
{

    public static android.view.View.OnClickListener getOnClickListener(final OnActionListener listener, final Object action)
    {
        return new android.view.View.OnClickListener() {

            final Object val$action;
            final OnActionListener val$listener;

            public final void onClick(View view)
            {
                listener.onAction(action);
            }

            
            {
                listener = onactionlistener;
                action = obj;
                super();
            }
        };
    }
}
