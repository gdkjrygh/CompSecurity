// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.callstatus;

import android.net.Uri;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

// Referenced classes of package com.google.android.apps.wallet.callstatus:
//            CallErrorException

public class CallErrorDialogs
{

    private static final String TAG = com/google/android/apps/wallet/callstatus/CallErrorDialogs.getSimpleName();

    public CallErrorDialogs()
    {
    }

    public static com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder createBuilder(com.google.wallet.proto.NanoWalletError.CallError callerror, int i, int j)
    {
        com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder = AlertDialogFragment.newBuilder();
        if (callerror != null && callerror.title != null && callerror.content != null)
        {
            builder.setTitle(callerror.title);
            builder.setMessage(callerror.content);
        } else
        {
            builder.setTitle(i).setMessage(j);
        }
        if (callerror != null && callerror.action != null && callerror.action.length != 0)
        {
            setPositiveButtonFromAction(builder, callerror.action[0]);
            if (callerror.action.length > 1)
            {
                setNegativeButtonFromAction(builder, callerror.action[1]);
                if (callerror.action.length > 2)
                {
                    WLog.wfmt(TAG, "Received call error with %d actions. Only handling 2", new Object[] {
                        Integer.valueOf(callerror.action.length)
                    });
                }
            }
        }
        return builder;
    }

    public static com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder createBuilder(Throwable throwable, int i, int j)
    {
        if (throwable instanceof CallErrorException)
        {
            return createBuilder(((CallErrorException)throwable).getCallError(), i, j);
        } else
        {
            return AlertDialogFragment.newBuilder().setTitle(i).setMessage(j);
        }
    }

    public static com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder createBuilderWithGenericTitle(com.google.wallet.proto.NanoWalletError.CallError callerror, int i)
    {
        return createBuilder(callerror, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_title, i);
    }

    public static com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder createBuilderWithGenericTitle(Throwable throwable, int i)
    {
        return createBuilder(throwable, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_title, i);
    }

    private static void setNegativeButtonFromAction(com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder, com.google.wallet.proto.NanoWalletError.CallError.Action action)
    {
        if (action.text != null)
        {
            if (action.linkUri != null)
            {
                builder.setNegativeButtonActionUri(Uri.parse(action.linkUri));
            } else
            {
                builder.setDismissDialogOnClickNegativeButton();
            }
            builder.setNegativeButton(action.text);
        }
    }

    private static void setPositiveButtonFromAction(com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder, com.google.wallet.proto.NanoWalletError.CallError.Action action)
    {
        if (action.text != null)
        {
            if (action.linkUri != null)
            {
                builder.setPositiveButtonActionUri(Uri.parse(action.linkUri));
            } else
            {
                builder.setDismissDialogOnClickPositiveButton();
            }
            builder.setPositiveButton(action.text);
            return;
        } else
        {
            builder.setDismissDialogOnClickPositiveButton();
            return;
        }
    }

}
