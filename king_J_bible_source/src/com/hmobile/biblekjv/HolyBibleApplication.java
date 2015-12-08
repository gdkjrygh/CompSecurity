// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.activerecorbase.Database;
import com.hmobile.activerecorbase.DatabaseBuilder;
import com.hmobile.common.NotificationCenter;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.BookMarkInfo;
import com.hmobile.model.FavoriteInfo;
import com.hmobile.model.LikeShareList;
import com.hmobile.model.NotesInfo;
import com.hmobile.model.TodayVerseInfo;
import com.hmobile.model.VerseInfo;
import com.hmobile.model.WidgetSettingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.hmobile.biblekjv:
//            DataBaseHelper

public class HolyBibleApplication extends Application
{
    class getAllLikeShareData extends AsyncTask
    {

        final HolyBibleApplication this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            return null;
        }

        getAllLikeShareData()
        {
            this$0 = HolyBibleApplication.this;
            super();
        }
    }


    private static HolyBibleApplication _intance = null;
    static boolean isPurchased = false;
    private static ActiveRecordBase mDatabase;
    private static ActiveRecordBase mLocalDatabase;
    static IInAppBillingService mService;
    static ServiceConnection mServiceConn = new ServiceConnection() {

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HolyBibleApplication.mService = com.android.vending.billing.IInAppBillingService.Stub.asInterface(ibinder);
            componentname = new ArrayList();
            componentname.add(HolyBibleApplication._intance.getString(0x7f0700b9));
            ibinder = new Bundle();
            ibinder.putStringArrayList("ITEM_ID_LIST", componentname);
            componentname = HolyBibleApplication.mService.getSkuDetails(3, HolyBibleApplication._intance.getPackageName(), "inapp", ibinder);
            if (componentname.getInt("RESPONSE_CODE") != 0) goto _L2; else goto _L1
_L1:
            componentname = componentname.getStringArrayList("DETAILS_LIST").iterator();
_L3:
            if (componentname.hasNext())
            {
                break MISSING_BLOCK_LABEL_99;
            }
_L2:
            NotificationCenter.Instance().postNotification("purchase");
            return;
            try
            {
                ibinder = new JSONObject((String)componentname.next());
                String s = ibinder.getString("productId");
                ibinder.getString("price");
                s.equalsIgnoreCase(HolyBibleApplication._intance.getString(0x7f0700b9));
                HolyBibleApplication.isPurchased = HolyBibleApplication.isItemPurchased();
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                return;
            }
              goto _L3
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HolyBibleApplication.mService = null;
            Utils.LogInfo("in onServiceDisconnected **********************");
        }

    };
    private static DataBaseHelper myDbHelper;

    public HolyBibleApplication()
    {
        _intance = this;
    }

    public static ActiveRecordBase Connection()
    {
        mDatabase = myDbHelper.Connection();
        return mDatabase;
    }

    public static ActiveRecordBase LocalConnection()
    {
        return mLocalDatabase;
    }

    public static Context getContext()
    {
        return _intance;
    }

    public static boolean isItemPurchased()
    {
        Object obj = mService.getPurchases(3, _intance.getPackageName(), "inapp", null);
        if (((Bundle) (obj)).getInt("RESPONSE_CODE") != 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE");
        ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
        if (arraylist1.size() >= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = (String)arraylist1.get(0);
        if (!((String)arraylist.get(0)).equalsIgnoreCase(_intance.getString(0x7f0700b9)))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        isPurchased = true;
        return true;
        try
        {
            isPurchased = false;
        }
        catch (RemoteException remoteexception)
        {
            remoteexception.printStackTrace();
            return false;
        }
        return false;
        return false;
        return false;
    }

    public static void stopBilllingService()
    {
        if (mService == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        _intance.unbindService(mServiceConn);
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        illegalargumentexception.printStackTrace();
        return;
    }

    public void onCreate()
    {
        super.onCreate();
        LikeShareList.Instance().clearList();
        DatabaseBuilder databasebuilder;
        try
        {
            myDbHelper = new DataBaseHelper(this);
        }
        catch (IOException ioexception)
        {
            throw new Error("Unable to create database");
        }
        databasebuilder = new DatabaseBuilder("hmobile.db");
        databasebuilder.addClass(com/hmobile/model/BookMarkInfo);
        databasebuilder.addClass(com/hmobile/model/BookInfo);
        databasebuilder.addClass(com/hmobile/model/VerseInfo);
        databasebuilder.addClass(com/hmobile/model/FavoriteInfo);
        databasebuilder.addClass(com/hmobile/model/WidgetSettingInfo);
        Database.setBuilder(databasebuilder);
        databasebuilder = new DatabaseBuilder("localhmobile.db");
        databasebuilder.addClass(com/hmobile/model/TodayVerseInfo);
        databasebuilder.addClass(com/hmobile/model/NotesInfo);
        databasebuilder.addClass(com/hmobile/model/BookMarkInfo);
        databasebuilder.addClass(com/hmobile/model/FavoriteInfo);
        Database.setBuilder(databasebuilder);
        try
        {
            mLocalDatabase = ActiveRecordBase.open(this, "localhmobile.db", 1);
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
        }
        catch (Exception exception)
        {
            Utils.LogException(exception);
        }
        bindService(new Intent("com.android.vending.billing.InAppBillingService.BIND"), mServiceConn, 1);
    }


}
