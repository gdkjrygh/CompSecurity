// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.app.Activity;
import android.text.TextUtils;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.time.Clock;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.contacts:
//            InviterManager

public class UploadContactsUtil
{

    private static final int CONTACT_MAX_NUM = 400;
    static final String DELIMITER = ":";
    private static final String KEY = "PREF_ACCOUNTS_STORED_CONTACTS";
    private static final int NEXT_SYNC_TIME = 1;
    private static final int PREV_CONTACT_HASH = 2;
    public static final UploadContactsResponseHandler RESPONSE_HANDLER = new _cls1(true);
    private static final int UID = 0;
    static Clock clock;

    public UploadContactsUtil()
    {
    }

    private static String findUploadDataByUser(Set set, String s)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            String s1 = (String)set.next();
            if (s.equals(s1.split(":")[0]))
            {
                return s1;
            }
        }

        return null;
    }

    static Set getAccountsStoredContacts()
    {
        return Preferences.persisted().getStringSet("PREF_ACCOUNTS_STORED_CONTACTS", null);
    }

    private static Date getLastShownDate()
    {
        return new Date(Preferences.user().getLong("PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN", 0L));
    }

    public static boolean isAccountStoredContacts()
    {
        Set set = getAccountsStoredContacts();
        return set != null && findUploadDataByUser(set, MyUser.getUid()) != null;
    }

    private static boolean isContactUploadNeeded(String s)
    {
        if (s != null)
        {
            s = s.split(":");
            if (s.length <= 1)
            {
                return true;
            }
            long l = Long.parseLong(s[1]);
            if (System.currentTimeMillis() > l)
            {
                return true;
            }
        }
        return false;
    }

    public static void onDialogShown()
    {
        saveLastShownDate();
    }

    public static void postContactUploadNavigation()
    {
        Events.post(new Navigation(Location.UPLOAD_CONTACTS));
    }

    private static void saveLastShownDate()
    {
        saveLastShownDate((new Date()).getTime());
    }

    static void saveLastShownDate(long l)
    {
        Preferences.user().set("PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN", l);
    }

    static boolean setAccountsStoredContactStatusSynced(long l, int i)
    {
        Set set;
        for (set = getAccountsStoredContacts(); set == null || !set.remove(findUploadDataByUser(set, MyUser.getUid()));)
        {
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        calendar.add(5, 7);
        set.add((new StringBuilder()).append(MyUser.getUid()).append(":").append(calendar.getTimeInMillis()).append(":").append(i).toString());
        Preferences.persisted().set("PREF_ACCOUNTS_STORED_CONTACTS", set);
        return true;
    }

    private static void setAccountsStoredContacts()
    {
        Set set = getAccountsStoredContacts();
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet(1);
        }
        ((Set) (obj)).add(MyUser.getUid());
        Preferences.persisted().set("PREF_ACCOUNTS_STORED_CONTACTS", ((Set) (obj)));
    }

    public static void setStoreContacts(boolean flag)
    {
        if (flag)
        {
            setAccountsStoredContacts();
            uploadContacts(RESPONSE_HANDLER);
            return;
        } else
        {
            AccountApi.c();
            unsetAccountsStoredContacts();
            unsetContactDialogShown();
            return;
        }
    }

    public static boolean shouldShowDialog(Activity activity)
    {
        if (!isAccountStoredContacts() && !PermissionUtil.isPermissionDeniedPermanently(activity, "android.permission.READ_CONTACTS"))
        {
            activity = getLastShownDate();
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -30);
            if (calendar.getTime().compareTo(activity) > 0)
            {
                return true;
            }
        }
        return false;
    }

    private static void unsetAccountsStoredContacts()
    {
        Set set = getAccountsStoredContacts();
        if (set != null)
        {
            set.remove(findUploadDataByUser(set, MyUser.getUid()));
            Preferences.persisted().set("PREF_ACCOUNTS_STORED_CONTACTS", set);
        }
    }

    public static void unsetContactDialogShown()
    {
        Preferences.user().set("PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN", 0L);
    }

    public static void uploadContacts()
    {
        if (!isAccountStoredContacts())
        {
            return;
        } else
        {
            uploadContacts(new UploadContactsResponseHandler(false));
            return;
        }
    }

    private static boolean uploadContacts(UploadContactsResponseHandler uploadcontactsresponsehandler)
    {
        Set set = getAccountsStoredContacts();
        String s;
        if (set != null)
        {
            if (isContactUploadNeeded(s = findUploadDataByUser(set, MyUser.getUid())))
            {
                HashMap hashmap = InviterManager.getLocalInvitabilityContacts(Application.context(), 400);
                int i = hashmap.hashCode();
                String as[] = s.split(":");
                if (as.length <= 2 || i != Integer.parseInt(as[2]))
                {
                    StringBuilder stringbuilder = (new StringBuilder("[")).append(TextUtils.join(",", hashmap.values())).append(']');
                    PLog.info("Try upload %d contacts.", new Object[] {
                        Integer.valueOf(hashmap.size())
                    });
                    uploadcontactsresponsehandler.contactsHash = i;
                    AccountApi.d(stringbuilder.toString(), uploadcontactsresponsehandler);
                    return true;
                }
            }
        }
        return false;
    }

    static 
    {
        clock = Clock.a;
    }


    private class UploadContactsResponseHandler extends ApiResponseHandler
    {

        private int contactsHash;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new UploadContactsCancelledEvent());
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = UploadContactsUtil.clock;
            UploadContactsUtil.setAccountsStoredContactStatusSynced(Clock.a(), contactsHash);
        }


/*
        static int access$102(UploadContactsResponseHandler uploadcontactsresponsehandler, int i)
        {
            uploadcontactsresponsehandler.contactsHash = i;
            return i;
        }

*/

        public UploadContactsResponseHandler(boolean flag)
        {
            super(flag);
        }

        private class UploadContactsCancelledEvent
        {

            public UploadContactsCancelledEvent()
            {
            }
        }

    }


    private class _cls1 extends UploadContactsResponseHandler
    {

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            UploadContactsUtil.unsetAccountsStoredContacts();
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToast(0x7f07017c);
        }

        _cls1(boolean flag)
        {
            super(flag);
        }
    }

}
