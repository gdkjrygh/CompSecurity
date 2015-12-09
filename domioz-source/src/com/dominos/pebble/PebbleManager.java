// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import android.content.Intent;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.AnalyticsUtil;
import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.a.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.androidannotations.api.c.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.dominos.pebble:
//            PebbleCommand, PebbleSession

public class PebbleManager
{

    private static final UUID DOMINOS_PEBBLE_UID = UUID.fromString("1210b165-1052-447d-80b1-55ce6e5d1b20");
    private static final String LOG_TAG = "PebbleController";
    private static final int MAX_TRIES = 15;
    private static final String PEBBLE_DICTIONARY_ARGUMENT_KEY = "key";
    private static final String PEBBLE_DICTIONARY_ARGUMENT_VALUE = "value";
    private static final String PEBBLE_KEY_COMMAND = "0";
    AnalyticsUtil mAnalyticsUtil;
    private ConfigurationManager mConfigurationManager;
    private Context mContext;
    private boolean mIsPebbleAppConnected;
    private String mLastStatus;
    private int mNACKCount;
    private Queue mOutQueue;
    PebbleSession mPebbleSession;
    private UserProfileManager mProfileManager;
    private int mTransactionCounter;
    private HashMap mTransactionMap;
    PowerRestClient powerRestClient;
    DominosPrefs_ prefs;

    public PebbleManager(Context context)
    {
        mTransactionCounter = 0;
        mOutQueue = new LinkedList();
        mNACKCount = 0;
        mContext = context;
    }

    private String formatPhoneNumber(String s)
    {
        String s1 = "Not Available";
        if (s != null)
        {
            s1 = (new StringBuilder("(")).append(s.substring(0, 3)).append(")-").append(s.substring(3, 6)).append("-").append(s.substring(6)).toString();
        }
        return s1;
    }

    private Object[] getArgumentsFromDictionary(a a1)
    {
        int j = 0;
        Object aobj[];
        JSONObject jsonobject;
        int i;
        int k;
        int l;
        try
        {
            a1 = new JSONArray(a1.c());
            l = a1.length();
            aobj = new Object[l - 1];
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return null;
        }
        i = 0;
        if (i >= l) goto _L2; else goto _L1
_L1:
        jsonobject = a1.getJSONObject(i);
        k = j;
        if (StringHelper.equals(jsonobject.getString("key"), "0"))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        aobj[j] = jsonobject.get("value");
        k = j + 1;
        i++;
        j = k;
        break MISSING_BLOCK_LABEL_32;
_L2:
        return aobj;
    }

    private void resetQueue()
    {
        if (!mOutQueue.isEmpty())
        {
            mOutQueue.clear();
        }
    }

    public void connectionAvailable()
    {
        a a1 = new a();
        PebbleCommand.GetConnectionEstablished.addCommand(a1);
        mOutQueue.clear();
        mTransactionMap.clear();
        sendToPebble(a1);
    }

    void getTrackerInfo(String s)
    {
        mAnalyticsUtil.postPebbleTrackerInfo();
        resetQueue();
        final String formattedPhoneNumber = new a();
        PebbleCommand.GetUserInfo.addCommand(formattedPhoneNumber);
        formattedPhoneNumber.a(1, "Fail");
        formattedPhoneNumber = s.replaceAll("[^0-9]+", "");
        s = s.replaceAll("[^0-9]+", "");
        powerRestClient.trackOrderByPhone(s, "", new _cls6());
    }

    public String getmLastStatus()
    {
        return mLastStatus;
    }

    protected void initialize()
    {
        mConfigurationManager = (ConfigurationManager)mPebbleSession.getManager("configuration_manager");
        mProfileManager = (UserProfileManager)mPebbleSession.getManager("user_manager");
        mTransactionMap = new HashMap();
        mIsPebbleAppConnected = false;
        App.getInstance().bus.register(this);
        PebbleKit.a(mContext, new _cls1());
        PebbleKit.b(mContext, new _cls2());
        if (isPebbleConnectedAndEnabled())
        {
            PebbleKit.a(mContext, new _cls3(DOMINOS_PEBBLE_UID));
            PebbleKit.a(mContext, new _cls4(DOMINOS_PEBBLE_UID));
            PebbleKit.a(mContext, new _cls5(DOMINOS_PEBBLE_UID));
        }
    }

    public boolean isPebbleAppOpen()
    {
        LogUtil.d("PebbleController", (new StringBuilder()).append(mIsPebbleAppConnected).toString(), new Object[0]);
        return mIsPebbleAppConnected;
    }

    public boolean isPebbleConnectedAndEnabled()
    {
        return PebbleKit.a(mContext) && mConfigurationManager != null && mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isPebbleEnabled();
    }

    public void notifyPebble(Context context, String s)
    {
        if (isPebbleConnectedAndEnabled())
        {
            Intent intent = new Intent("com.getpebble.action.SEND_NOTIFICATION");
            HashMap hashmap = new HashMap();
            hashmap.put("title", "Domino's Pizza");
            hashmap.put("body", s);
            s = new JSONObject(hashmap);
            s = (new JSONArray()).put(s).toString();
            intent.putExtra("messageType", "PEBBLE_ALERT");
            intent.putExtra("sender", "Domino's Pizza");
            intent.putExtra("notificationData", s);
            LogUtil.d("PebbleController", (new StringBuilder("About to send a modal alert to Pebble: ")).append(s).toString(), new Object[0]);
            context.sendBroadcast(intent);
        }
    }

    public void openPebbleApp(Context context)
    {
        if (isPebbleConnectedAndEnabled())
        {
            UUID uuid = DOMINOS_PEBBLE_UID;
            if (uuid == null)
            {
                throw new IllegalArgumentException("uuid cannot be null");
            }
            Intent intent = new Intent("com.getpebble.action.app.START");
            intent.putExtra("uuid", uuid);
            context.sendBroadcast(intent);
            connectionAvailable();
            LogUtil.d("PebbleController", "Launching pebble app", new Object[0]);
        }
    }

    public void sendErrorToPebble(int i)
    {
        a a1 = new a();
        PebbleCommand.Error.addCommand(a1);
        a1.a(91, i);
        sendToPebble(a1);
    }

    protected void sendNextChunk()
    {
        if (!mOutQueue.isEmpty())
        {
            sendToPebble((a)mOutQueue.remove());
        }
    }

    public void sendToPebble(a a1)
    {
        mTransactionCounter = mTransactionCounter + 1;
        LogUtil.d("PebbleController", (new StringBuilder("Sent:  ")).append(mTransactionCounter).toString(), new Object[0]);
        mTransactionMap.put(Integer.valueOf(mTransactionCounter), a1);
        if (a1 != null)
        {
            Context context = mContext;
            UUID uuid = DOMINOS_PEBBLE_UID;
            int i = mTransactionCounter;
            if (uuid == null)
            {
                throw new IllegalArgumentException("uuid cannot be null");
            }
            if (a1 == null)
            {
                throw new IllegalArgumentException("data cannot be null");
            }
            if (a1.a() != 0)
            {
                Intent intent = new Intent("com.getpebble.action.app.SEND");
                intent.putExtra("uuid", uuid);
                intent.putExtra("transaction_id", i);
                intent.putExtra("msg_data", a1.c());
                context.sendBroadcast(intent);
            }
        }
    }

    public void sendToPebbleChunked(List list)
    {
        mOutQueue.clear();
        a a1;
        for (list = list.iterator(); list.hasNext(); mOutQueue.add(a1))
        {
            a1 = (a)list.next();
        }

        sendNextChunk();
    }

    void sendUserInfo()
    {
        resetQueue();
        a a1 = new a();
        PebbleCommand.GetUserInfo.addCommand(a1);
        if (mProfileManager.getCurrentUser() != null)
        {
            a1.a(41, formatPhoneNumber(mProfileManager.getCurrentUser().getPhone()));
            if (mProfileManager.getCurrentUser().getAlternatePhone() != null && !mProfileManager.getCurrentUser().getAlternatePhone().isEmpty())
            {
                a1.a(42, formatPhoneNumber(mProfileManager.getCurrentUser().getAlternatePhone()));
            }
        }
        LogUtil.d("PebbleController", a1.c(), new Object[0]);
        sendToPebble(a1);
    }

    public void setPebbleAppOpen(boolean flag)
    {
        mIsPebbleAppConnected = flag;
    }

    public void setmLastStatus(String s)
    {
        mLastStatus = s;
    }

    public boolean showPebbleAppDialog()
    {
        return isPebbleConnectedAndEnabled() && !mIsPebbleAppConnected && prefs.firstTimePebbleDetected().a(Boolean.valueOf(true)).booleanValue();
    }




/*
    static int access$002(PebbleManager pebblemanager, int i)
    {
        pebblemanager.mNACKCount = i;
        return i;
    }

*/


/*
    static int access$008(PebbleManager pebblemanager)
    {
        int i = pebblemanager.mNACKCount;
        pebblemanager.mNACKCount = i + 1;
        return i;
    }

*/





/*
    static boolean access$402(PebbleManager pebblemanager, boolean flag)
    {
        pebblemanager.mIsPebbleAppConnected = flag;
        return flag;
    }

*/



/*
    static String access$602(PebbleManager pebblemanager, String s)
    {
        pebblemanager.mLastStatus = s;
        return s;
    }

*/


    private class _cls6 extends PowerRestCallback
    {

        final PebbleManager this$0;
        final String val$formattedPhoneNumber;

        public void onError(Exception exception, String s)
        {
            sendErrorToPebble(1);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            mLastStatus = "";
            if (TrackerResult.from(s).getOrderStatuses().size() > 0)
            {
                Intent intent = new Intent(mContext, com/dominos/notification/TrackerService_);
                intent.putExtra("phone", formattedPhoneNumber);
                intent.putExtra("extension", "");
                intent.putExtra("Silent", false);
                intent.setAction("OrderPlaced");
                mContext.startService(intent);
            } else
            {
                sendErrorToPebble(2);
            }
            LogUtil.d("PebbleController", s, new Object[0]);
        }

        _cls6()
        {
            this$0 = PebbleManager.this;
            formattedPhoneNumber = s;
            super();
        }
    }


    private class _cls1 extends BroadcastReceiver
    {

        final PebbleManager this$0;

        public void onReceive(Context context, Intent intent)
        {
            LogUtil.d("PebbleController", "Pebble connected!", new Object[0]);
        }

        _cls1()
        {
            this$0 = PebbleManager.this;
            super();
        }
    }


    private class _cls2 extends BroadcastReceiver
    {

        final PebbleManager this$0;

        public void onReceive(Context context, Intent intent)
        {
            LogUtil.d("PebbleController", "Pebble disconnected!", new Object[0]);
        }

        _cls2()
        {
            this$0 = PebbleManager.this;
            super();
        }
    }


    private class _cls3 extends com.getpebble.android.kit.PebbleKit.PebbleAckReceiver
    {

        final PebbleManager this$0;

        public void receiveAck(Context context, int i)
        {
            mNACKCount = 0;
            LogUtil.d("PebbleController", (new StringBuilder("Received ACK for transaction ")).append(i).append("still queued ").append(mOutQueue.size()).toString(), new Object[0]);
            mTransactionMap.remove(Integer.valueOf(i));
            if (mTransactionMap.isEmpty())
            {
                sendNextChunk();
            }
            setPebbleAppOpen(true);
        }

        _cls3(UUID uuid)
        {
            this$0 = PebbleManager.this;
            super(uuid);
        }
    }


    private class _cls4 extends com.getpebble.android.kit.PebbleKit.PebbleNackReceiver
    {

        final PebbleManager this$0;

        public void receiveNack(Context context, int i)
        {
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        _cls4(UUID uuid)
        {
            this$0 = PebbleManager.this;
            super(uuid);
        }
    }


    private class _cls5 extends com.getpebble.android.kit.PebbleKit.PebbleDataReceiver
    {

        final PebbleManager this$0;

        public void receiveData(Context context, int i, a a1)
        {
            mIsPebbleAppConnected = true;
            int j = a1.b().intValue();
            a1 = ((a) (getArgumentsFromDictionary(a1)));
            setPebbleAppOpen(true);
            PebbleCommand pebblecommand = (PebbleCommand)PebbleCommand.getIfPresent(j).a(PebbleCommand.Unknown);
            LogUtil.i("PebbleController", (new StringBuilder("Received command ")).append(pebblecommand).append("[").append(j).append("(").append(Arrays.deepToString(a1)).append(")]").toString(), new Object[0]);
            pebblecommand.execute(context, i, a1);
        }

        _cls5(UUID uuid)
        {
            this$0 = PebbleManager.this;
            super(uuid);
        }
    }

}
