// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.CheckBox;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.LocalNotification;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ReminderActivity

public class this._cls0 extends AsyncTask
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
                ReminderActivity.access$002(ReminderActivity.this, (new WalletService(new WeakReference(getApplicationContext()))).getWalletNotifications(as[0]));
                if (ReminderActivity.access$000(ReminderActivity.this) != null && ReminderActivity.access$000(ReminderActivity.this).isSuccess())
                {
                    boolean aflag[] = new boolean[4];
                    as = aflag;
                    if (ReminderActivity.access$000(ReminderActivity.this).getNotificationItems() != null)
                    {
                        as = aflag;
                        if (ReminderActivity.access$000(ReminderActivity.this).getNotificationItems().size() > 0)
                        {
                            ReminderActivity.access$102(ReminderActivity.this, new LocalNotification());
                            Iterator iterator = ReminderActivity.access$000(ReminderActivity.this).getNotificationItems().iterator();
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
                                        ReminderActivity.access$100(ReminderActivity.this).createLocalNotification(getApplicationContext(), as.getNotificationId(), Long.valueOf(as.getTimeToFire()).longValue(), as.getType());
                                    } else
                                    {
                                        ReminderActivity.access$100(ReminderActivity.this).cancelLocalNotification(getApplicationContext(), as.getNotificationId());
                                    }
                                }
                            } while (true);
                        }
                    }
                    break label0;
                }
                if (ReminderActivity.access$000(ReminderActivity.this) != null)
                {
                    ReminderActivity.access$200(ReminderActivity.this);
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
        ReminderActivity.access$300(ReminderActivity.this);
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

    public ()
    {
        this$0 = ReminderActivity.this;
        super();
    }
}
