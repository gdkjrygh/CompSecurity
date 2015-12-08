// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.error;

import android.content.Context;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;

// Referenced classes of package com.kohls.mcommerce.opal.helper.error:
//            Error

public class ErrorHelper
{

    private static final String TAG = com/kohls/mcommerce/opal/common/app/KohlsPhoneApplication.getSimpleName();

    public ErrorHelper()
    {
    }

    public static boolean isApplicationManagable(Error error)
    {
        if (error.getErrorType() == Error.ErrorType.APPLICATION_EXCEPTION)
        {
            manageException(error);
            return false;
        } else
        {
            return manageError(error);
        }
    }

    private static boolean manageError(Error error)
    {
        Context context = KohlsPhoneApplication.getContext();
        if (error.getErrorType() == Error.ErrorType.ADAPTER_FAILURE || error.getErrorType() == Error.ErrorType.ADAPTER_ERROR)
        {
            UtilityMethods.showToast(context, context.getString(0x7f080165), 1);
            return true;
        }
        if (error.getErrorType() == Error.ErrorType.NO_NETWORK)
        {
            UtilityMethods.showToast(context, context.getString(0x7f0803cd), 1);
            return true;
        } else
        {
            return false;
        }
    }

    private static void manageException(Error error)
    {
        Exception exception = error.getException();
        if (exception != null)
        {
            Logger.error(TAG, String.format("Exception is: Type: [%s], Message: [%s]", new Object[] {
                error.getErrorType().getErrorDescription(), exception.getMessage()
            }));
            Logger.error(TAG, "Stack Trace ----->");
            exception.printStackTrace();
            Logger.error(TAG, "<----- Stack Trace");
        }
    }

}
