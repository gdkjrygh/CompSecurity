// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletBaseResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.KohlsError;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            RegisterEventAsyncTask

public abstract class BaseAsyncTask extends AsyncTask
{

    protected Context mContext;

    public BaseAsyncTask(Context context)
    {
        mContext = context;
    }

    private void displayErrorDialog(String s, boolean flag)
    {
        if (flag)
        {
            if (mContext instanceof Activity)
            {
                ((Activity)mContext).runOnUiThread(new _cls1(s));
            }
            return;
        } else
        {
            Intent intent = (new Intent(mContext, com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog)).setFlags(0x10020000);
            intent.putExtra("ServerError", s);
            mContext.startActivity(intent);
            return;
        }
    }

    public static Bitmap getImageBitmap(String s)
    {
        try
        {
            s = BitmapFactory.decodeStream((new URL(s)).openStream());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private boolean isAirplaneModeOn(Context context)
    {
        boolean flag = false;
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0)
        {
            flag = true;
        }
        return flag;
    }

    private void showDialogonCondition(boolean flag, String s, boolean flag1)
    {
        if (flag)
        {
            displayErrorDialog(s, flag1);
        }
    }

    public boolean canAccessNetwork()
    {
        return canAccessNetwork(false);
    }

    public boolean canAccessNetwork(boolean flag)
    {
        return Appconfig.isNetworkAvailable(mContext, flag);
    }

    protected Boolean hasErrors(WalletBaseResponse walletbaseresponse)
    {
        return hasErrors(walletbaseresponse, true);
    }

    protected Boolean hasErrors(WalletBaseResponse walletbaseresponse, boolean flag)
    {
        return hasErrors(walletbaseresponse, true, false);
    }

    protected Boolean hasErrors(WalletBaseResponse walletbaseresponse, boolean flag, boolean flag1)
    {
        if (mContext == null)
        {
            return Boolean.valueOf(true);
        }
        if (walletbaseresponse == null)
        {
            showDialogonCondition(flag, KohlsError.getInstance().getErrorMessage(String.valueOf("defaultMessage")), flag1);
            return Boolean.valueOf(true);
        }
        if (walletbaseresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR)
        {
            showSignInPage();
            return Boolean.valueOf(true);
        }
        if (walletbaseresponse.getHttpStatusCode() != -1 && walletbaseresponse.getHttpStatusCode() != 200)
        {
            showDialogonCondition(flag, KohlsError.getInstance().getErrorMessage(walletbaseresponse.getRequestType(), String.valueOf(walletbaseresponse.getHttpStatusCode())), flag1);
            return Boolean.valueOf(true);
        }
        WalletBaseResponse walletbaseresponse1 = walletbaseresponse;
        if (walletbaseresponse.getErrors() != null)
        {
            walletbaseresponse1 = walletbaseresponse;
            if (walletbaseresponse.getErrors().size() > 0)
            {
                int i = ((ErrorResponse)walletbaseresponse.getErrors().get(0)).getErrorCode();
                OmnitureMeasurement.getInstance().setLoyaltyErrorEvents(((ErrorResponse)walletbaseresponse.getErrors().get(0)).getMessage());
                if (i == 5)
                {
                    walletbaseresponse = (new WalletService(new WeakReference(mContext))).createWallet();
                    walletbaseresponse1 = walletbaseresponse;
                    if (walletbaseresponse != null)
                    {
                        walletbaseresponse1 = walletbaseresponse;
                        if (walletbaseresponse.isSuccess())
                        {
                            if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
                            {
                                (new RegisterEventAsyncTask(mContext)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                                    "Mobile_Wallet1"
                                });
                            }
                            walletbaseresponse = new Intent("signin_page");
                            walletbaseresponse.putExtra("createwallet", "createwallet");
                            LocalBroadcastManager.getInstance(mContext).sendBroadcast(walletbaseresponse);
                            return Boolean.valueOf(true);
                        }
                    }
                } else
                {
                    if (i == 4 && !Appconfig.isSignInShown)
                    {
                        showSignInPage();
                        return Boolean.valueOf(true);
                    }
                    if (i == 8)
                    {
                        return Boolean.valueOf(true);
                    }
                    if (i == 2)
                    {
                        return Boolean.valueOf(true);
                    }
                    if (i == 12)
                    {
                        return Boolean.valueOf(true);
                    } else
                    {
                        showDialogonCondition(flag, ((ErrorResponse)walletbaseresponse.getErrors().get(0)).getMessage(), flag1);
                        return Boolean.valueOf(true);
                    }
                }
            }
        }
        if (walletbaseresponse1 != null && !walletbaseresponse1.isSuccess() && flag)
        {
            displayErrorDialog(KohlsError.getInstance().getErrorMessage(String.valueOf("defaultMessage")), flag1);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    protected void showSignInPage()
    {
        if (mContext instanceof Activity)
        {
            UtilityMethods.openAccountActivity(mContext, true, false);
        }
    }

    /* member class not found */
    class _cls1 {}

}
