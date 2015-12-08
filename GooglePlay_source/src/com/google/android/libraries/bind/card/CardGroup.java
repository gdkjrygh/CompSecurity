// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.card;

import android.view.View;
import com.google.android.libraries.bind.data.BindingViewGroup;
import com.google.android.libraries.bind.logging.Logd;

public abstract class CardGroup
{

    private static final Logd LOGD = Logd.get(com/google/android/libraries/bind/card/CardGroup);
    private static final android.view.View.OnLongClickListener editableViewOnLongClickListener = new android.view.View.OnLongClickListener() {

        public final boolean onLongClick(View view)
        {
            if (!(view instanceof BindingViewGroup));
            return false;
        }

    };

}
