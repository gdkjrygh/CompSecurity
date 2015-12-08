// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationInputResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.LocalNotification;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ReminderActivity

public class notificationResponse extends AsyncTask
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
            ReminderActivity.access$200(ReminderActivity.this);
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
                    ReminderActivity.access$100(ReminderActivity.this).createLocalNotification(getApplicationContext(), notificationitemresponse.getNotificationId(), Long.valueOf(notificationitemresponse.getTimeToFire()).longValue(), notificationitemresponse.getType());
                } else
                {
                    ReminderActivity.access$100(ReminderActivity.this).cancelLocalNotification(getApplicationContext(), notificationitemresponse.getNotificationId());
                }
            }

            ReminderActivity.access$300(ReminderActivity.this);
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

    public ()
    {
        this$0 = ReminderActivity.this;
        super();
        response = "false";
        notificationResponse = null;
    }
}
