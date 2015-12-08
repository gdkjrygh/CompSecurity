// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.app.DialogFragment;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.RetryDialogFragmentWithSendlog;

public class j
{

    public j()
    {
    }

    public static com.fitbit.util.q.a a(com.fitbit.util.SimpleConfirmDialogFragment.a a1)
    {
        return new com.fitbit.util.q.a(a1) {

            final com.fitbit.util.SimpleConfirmDialogFragment.a a;

            public DialogFragment a()
            {
                if (b.a == BuildType.a)
                {
                    return RetryDialogFragment.a(a, 0x7f08048f, 0x7f08048e);
                } else
                {
                    return RetryDialogFragmentWithSendlog.b(a, 0x7f08048f, 0x7f08048e);
                }
            }

            
            {
                a = a1;
                super();
            }
        };
    }
}
