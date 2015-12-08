// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationInputResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.LocalNotification;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class ReminderActivity extends Activity
    implements android.view.View.OnClickListener
{
    public class GetWalletNotificationAsyncTask extends AsyncTask
    {

        ProgressDialog progressDialog;
        final ReminderActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient boolean[] doInBackground(String as[])
        {
label0:
            {
                if (Appconfig.isNetworkAvailable(getApplicationContext()))
                {
                    mcurrentNotificationResponse = (new WalletService(new WeakReference(getApplicationContext()))).getWalletNotifications(as[0]);
                    if (mcurrentNotificationResponse != null && mcurrentNotificationResponse.isSuccess())
                    {
                        boolean aflag[] = new boolean[4];
                        as = aflag;
                        if (mcurrentNotificationResponse.getNotificationItems() != null)
                        {
                            as = aflag;
                            if (mcurrentNotificationResponse.getNotificationItems().size() > 0)
                            {
                                mlocalReminderNotification = new LocalNotification();
                                Iterator iterator = mcurrentNotificationResponse.getNotificationItems().iterator();
                                do
                                {
                                    as = aflag;
                                    if (!iterator.hasNext())
                                    {
                                        break;
                                    }
                                    as = (NotificationItemResponse)iterator.next();
                                    if (as != null && as.getOption() != null)
                                    {
                                        if (as.getOption().equals("1D") && as.getNotificationEnabled())
                                        {
                                            aflag[0] = true;
                                        }
                                        if (as.getOption().equals("3D") && as.getNotificationEnabled())
                                        {
                                            aflag[1] = true;
                                        }
                                        if (as.getOption().equals("1W") && as.getNotificationEnabled())
                                        {
                                            aflag[2] = true;
                                        }
                                        if (as.getNotificationEnabled())
                                        {
                                            aflag[3] = true;
                                        }
                                        if (as.getNotificationEnabled())
                                        {
                                            mlocalReminderNotification.createLocalNotification(getApplicationContext(), as.getNotificationId(), Long.valueOf(as.getTimeToFire()).longValue(), as.getType());
                                        } else
                                        {
                                            mlocalReminderNotification.cancelLocalNotification(getApplicationContext(), as.getNotificationId());
                                        }
                                    }
                                } while (true);
                            }
                        }
                        break label0;
                    }
                    if (mcurrentNotificationResponse != null)
                    {
                        isSessionTimedOut();
                    }
                }
                as = null;
            }
            return as;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((boolean[])obj);
        }

        protected void onPostExecute(boolean aflag[])
        {
            super.onPostExecute(aflag);
            Logger.debug("NotificationService", (new StringBuilder()).append("response complete: ").append(aflag).toString());
            if (aflag != null)
            {
                ((CheckBox)findViewById(0x7f0d011a)).setChecked(aflag[0]);
                ((CheckBox)findViewById(0x7f0d011c)).setChecked(aflag[1]);
                ((CheckBox)findViewById(0x7f0d011d)).setChecked(aflag[2]);
                ((CheckBox)findViewById(0x7f0d011e)).setChecked(aflag[3]);
            } else
            {
                Dialog.showDialog("Network Error", "Please try again later.", ReminderActivity.this, "OK", null, false, false);
            }
            enableordisableEmailCheckbox();
            if (progressDialog != null)
            {
                progressDialog.dismiss();
            }
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(ReminderActivity.this, "Fetching Reminders", "Please wait");
        }

        public GetWalletNotificationAsyncTask()
        {
            this$0 = ReminderActivity.this;
            super();
        }
    }

    public class SetWalletEmailNotificationAsyncTask extends AsyncTask
    {

        NotificationResponse currentNotificationResponse;
        NotificationResponse notificationResponse;
        ProgressDialog progressDialog;
        String response;
        final ReminderActivity this$0;

        protected transient NotificationResponse doInBackground(String as[])
        {
            if (!Appconfig.isNetworkAvailable(getApplicationContext())) goto _L2; else goto _L1
_L1:
            NotificationInputResponse notificationinputresponse;
            Iterator iterator;
            notificationinputresponse = new NotificationInputResponse();
            if (currentNotificationResponse == null)
            {
                currentNotificationResponse = (new WalletService(new WeakReference(getApplicationContext()))).getWalletNotifications(as[0]);
            }
            if (currentNotificationResponse == null || !currentNotificationResponse.isSuccess())
            {
                break MISSING_BLOCK_LABEL_298;
            }
            iterator = currentNotificationResponse.getNotificationItems().iterator();
_L4:
            NotificationItemResponse notificationitemresponse;
label0:
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    notificationitemresponse = (NotificationItemResponse)iterator.next();
                } while (notificationitemresponse == null || notificationitemresponse.getOption() == null);
                if (notificationitemresponse.getOption().equals("1D") && as[3].equals("1"))
                {
                    as[2] = notificationitemresponse.getNotificationId();
                } else
                {
                    if (!notificationitemresponse.getOption().equals("3D") || !as[3].equals("3"))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    as[2] = notificationitemresponse.getNotificationId();
                }
            }
_L5:
            notificationinputresponse.setEnabled(as[1]);
            notificationinputresponse.setNotificationId(as[2]);
            notificationinputresponse.setNotificationDelta(as[3]);
            notificationinputresponse.setMode(as[4]);
            notificationResponse = (new WalletService(new WeakReference(getApplicationContext()))).setWalletNotifications(as[0], notificationinputresponse, Boolean.valueOf(as[5]).booleanValue());
_L2:
            return notificationResponse;
            if (!notificationitemresponse.getOption().equals("1W") || !as[3].equals("7")) goto _L4; else goto _L3
_L3:
            as[2] = notificationitemresponse.getNotificationId();
              goto _L5
            if (currentNotificationResponse != null)
            {
                isSessionTimedOut();
            }
              goto _L2
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(NotificationResponse notificationresponse)
        {
            super.onPostExecute(notificationresponse);
            if (notificationresponse != null && notificationresponse.getNotificationItems() != null)
            {
                for (notificationresponse = notificationresponse.getNotificationItems().iterator(); notificationresponse.hasNext();)
                {
                    NotificationItemResponse notificationitemresponse = (NotificationItemResponse)notificationresponse.next();
                    if (notificationitemresponse.getNotificationEnabled())
                    {
                        mlocalReminderNotification.createLocalNotification(getApplicationContext(), notificationitemresponse.getNotificationId(), Long.valueOf(notificationitemresponse.getTimeToFire()).longValue(), notificationitemresponse.getType());
                    } else
                    {
                        mlocalReminderNotification.cancelLocalNotification(getApplicationContext(), notificationitemresponse.getNotificationId());
                    }
                }

                enableordisableEmailCheckbox();
            }
            if (progressDialog != null)
            {
                progressDialog.dismiss();
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((NotificationResponse)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(ReminderActivity.this, "Setting Reminder", "Please wait");
        }

        public SetWalletEmailNotificationAsyncTask()
        {
            this$0 = ReminderActivity.this;
            super();
            response = "false";
            notificationResponse = null;
        }
    }


    private NotificationResponse mcurrentNotificationResponse;
    private LocalNotification mlocalReminderNotification;
    private WalletItemResponse mwalletItemResponse;

    public ReminderActivity()
    {
    }

    private void enableordisableEmailCheckbox()
    {
        if (((CheckBox)findViewById(0x7f0d011a)).isChecked() || ((CheckBox)findViewById(0x7f0d011c)).isChecked() || ((CheckBox)findViewById(0x7f0d011d)).isChecked())
        {
            findViewById(0x7f0d011e).setEnabled(true);
            return;
        } else
        {
            findViewById(0x7f0d011e).setEnabled(false);
            ((CheckBox)findViewById(0x7f0d011e)).setChecked(false);
            return;
        }
    }

    private void isSessionTimedOut()
    {
        if ((mcurrentNotificationResponse.getErrors() == null || mcurrentNotificationResponse.getErrors().size() <= 0 || ((ErrorResponse)mcurrentNotificationResponse.getErrors().get(0)).getErrorCode() != 4) && mcurrentNotificationResponse.getErrorType() != com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR && mcurrentNotificationResponse.getErrorType() != com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.CONNECTION_ERROR)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        UtilityMethods.openAccountActivity(getApplicationContext(), true, false);
        startActivityForResult(new Intent(), 1213);
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserSignInStatus(false);
        finish();
        return;
        Exception exception;
        exception;
    }

    private void setNotification(int i, boolean flag, boolean flag1)
    {
        String as[] = new String[6];
        as[0] = mwalletItemResponse.getId();
        as[1] = String.valueOf(flag);
        as[2] = null;
        if (mwalletItemResponse.getCouponState() == Constants.AVAILABLE.intValue())
        {
            as[3] = String.valueOf(-i);
        } else
        {
            as[3] = String.valueOf(i);
        }
        as[4] = "1";
        as[5] = String.valueOf(flag1);
        (new SetWalletEmailNotificationAsyncTask()).execute(as);
    }

    public void onClick(View view)
    {
        if (view.getClass() != android/widget/CheckBox) goto _L2; else goto _L1
_L1:
        boolean flag;
        boolean flag1;
        flag = ((CheckBox)view).isChecked();
        flag1 = ((CheckBox)findViewById(0x7f0d011e)).isChecked();
        view.getId();
        JVM INSTR tableswitch 2131558682 2131558686: default 68
    //                   2131558682 69
    //                   2131558683 68
    //                   2131558684 77
    //                   2131558685 85
    //                   2131558686 94;
           goto _L2 _L3 _L2 _L4 _L5 _L6
_L2:
        return;
_L3:
        setNotification(1, flag1, flag);
        return;
_L4:
        setNotification(3, flag1, flag);
        return;
_L5:
        setNotification(7, flag1, flag);
        return;
_L6:
        if (((CheckBox)findViewById(0x7f0d011a)).isChecked())
        {
            setNotification(1, flag1, true);
        }
        if (((CheckBox)findViewById(0x7f0d011c)).isChecked())
        {
            setNotification(3, flag1, true);
        }
        if (((CheckBox)findViewById(0x7f0d011d)).isChecked())
        {
            setNotification(7, flag1, true);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030020);
        mwalletItemResponse = (WalletItemResponse)getIntent().getSerializableExtra("WalletCollection");
        findViewById(0x7f0d011a).setOnClickListener(this);
        findViewById(0x7f0d011c).setOnClickListener(this);
        findViewById(0x7f0d011d).setOnClickListener(this);
        findViewById(0x7f0d011e).setOnClickListener(this);
        findViewById(0x7f0d011e).setEnabled(false);
        setUpActionBar();
        mlocalReminderNotification = new LocalNotification();
        (new GetWalletNotificationAsyncTask()).execute(new String[] {
            mwalletItemResponse.getId()
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }



/*
    static NotificationResponse access$002(ReminderActivity reminderactivity, NotificationResponse notificationresponse)
    {
        reminderactivity.mcurrentNotificationResponse = notificationresponse;
        return notificationresponse;
    }

*/



/*
    static LocalNotification access$102(ReminderActivity reminderactivity, LocalNotification localnotification)
    {
        reminderactivity.mlocalReminderNotification = localnotification;
        return localnotification;
    }

*/


}
