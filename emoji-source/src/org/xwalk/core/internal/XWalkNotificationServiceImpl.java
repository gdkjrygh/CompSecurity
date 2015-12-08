// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AndroidRuntimeException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkNotificationService, XWalkViewInternal, XWalkContentsClientBridge

public class XWalkNotificationServiceImpl
    implements XWalkNotificationService
{
    private class WebNotification
    {

        public android.app.Notification.Builder mBuilder;
        public Integer mMessageNum;
        public Integer mNotificationId;
        public String mReplaceId;
        final XWalkNotificationServiceImpl this$0;

        WebNotification()
        {
            this$0 = XWalkNotificationServiceImpl.this;
            super();
            mMessageNum = Integer.valueOf(1);
        }
    }


    private static final String TAG = "XWalkNotificationServiceImpl";
    private static final String XWALK_ACTION_CLICK_NOTIFICATION_SUFFIX = ".notification.click";
    private static final String XWALK_ACTION_CLOSE_NOTIFICATION_SUFFIX = ".notification.close";
    private static final String XWALK_INTENT_CATEGORY_NOTIFICATION_PREFIX = "notification_";
    private static final String XWALK_INTENT_EXTRA_KEY_NOTIFICATION_ID = "xwalk.NOTIFICATION_ID";
    private XWalkContentsClientBridge mBridge;
    private Context mContext;
    private HashMap mExistNotificationIds;
    private HashMap mExistReplaceIds;
    private BroadcastReceiver mNotificationCloseReceiver;
    private NotificationManager mNotificationManager;
    private XWalkViewInternal mView;

    public XWalkNotificationServiceImpl(Context context, XWalkViewInternal xwalkviewinternal)
    {
        mContext = context;
        mView = xwalkviewinternal;
        mNotificationManager = (NotificationManager)mContext.getSystemService("notification");
        mNotificationManager.cancelAll();
        mNotificationCloseReceiver = new BroadcastReceiver() {

            final XWalkNotificationServiceImpl this$0;

            public void onReceive(Context context1, Intent intent)
            {
                mView.onNewIntent(intent);
            }

            
            {
                this$0 = XWalkNotificationServiceImpl.this;
                super();
            }
        };
        mExistNotificationIds = new HashMap();
        mExistReplaceIds = new HashMap();
    }

    private static String getCategoryFromNotificationId(int i)
    {
        return (new StringBuilder()).append("notification_").append(i).toString();
    }

    private void notificationChanged()
    {
        if (mExistNotificationIds.isEmpty())
        {
            Log.i("XWalkNotificationServiceImpl", "notifications are all cleared,unregister broadcast receiver for close pending intent");
            unregisterReceiver();
            return;
        } else
        {
            registerReceiver();
            return;
        }
    }

    private void registerReceiver()
    {
        IntentFilter intentfilter = new IntentFilter((new StringBuilder()).append(mView.getActivity().getPackageName()).append(".notification.close").toString());
        for (Iterator iterator = mExistNotificationIds.keySet().iterator(); iterator.hasNext(); intentfilter.addCategory(getCategoryFromNotificationId(((Integer)iterator.next()).intValue()))) { }
        try
        {
            mView.getActivity().registerReceiver(mNotificationCloseReceiver, intentfilter);
            return;
        }
        catch (AndroidRuntimeException androidruntimeexception)
        {
            Log.w("XWalkNotificationServiceImpl", androidruntimeexception.getLocalizedMessage());
        }
    }

    private void unregisterReceiver()
    {
        mView.getActivity().unregisterReceiver(mNotificationCloseReceiver);
    }

    public void cancelNotification(int i)
    {
        mNotificationManager.cancel(i);
        onNotificationClose(i, false);
    }

    public void doShowNotification(int i, Notification notification)
    {
        mNotificationManager.notify(i, notification);
    }

    public boolean maybeHandleIntent(Intent intent)
    {
        int i;
        if (intent.getAction() != null)
        {
            if ((i = intent.getIntExtra("xwalk.NOTIFICATION_ID", -1)) > 0)
            {
                if (intent.getAction().equals((new StringBuilder()).append(mView.getActivity().getPackageName()).append(".notification.close").toString()))
                {
                    onNotificationClose(i, true);
                    return true;
                }
                if (intent.getAction().equals((new StringBuilder()).append(mView.getActivity().getPackageName()).append(".notification.click").toString()))
                {
                    onNotificationClick(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void onNotificationClick(int i)
    {
        WebNotification webnotification = (WebNotification)mExistNotificationIds.get(Integer.valueOf(i));
        if (webnotification != null)
        {
            mExistNotificationIds.remove(Integer.valueOf(i));
            mExistReplaceIds.remove(webnotification.mReplaceId);
            notificationChanged();
            if (mBridge != null)
            {
                mBridge.notificationClicked(i);
                return;
            }
        }
    }

    public void onNotificationClose(int i, boolean flag)
    {
        WebNotification webnotification = (WebNotification)mExistNotificationIds.get(Integer.valueOf(i));
        if (webnotification != null)
        {
            mExistNotificationIds.remove(Integer.valueOf(i));
            mExistReplaceIds.remove(webnotification.mReplaceId);
            notificationChanged();
            if (mBridge != null)
            {
                mBridge.notificationClosed(i, flag);
                return;
            }
        }
    }

    public void onNotificationShown(int i)
    {
        while ((WebNotification)mExistNotificationIds.get(Integer.valueOf(i)) == null || mBridge == null) 
        {
            return;
        }
        mBridge.notificationDisplayed(i);
    }

    public void setBridge(XWalkContentsClientBridge xwalkcontentsclientbridge)
    {
        mBridge = xwalkcontentsclientbridge;
    }

    public void showNotification(String s, String s1, String s2, int i)
    {
        android.app.Notification.Builder builder;
        int j;
        int k;
        if (!s2.isEmpty() && mExistReplaceIds.containsKey(s2))
        {
            s2 = (WebNotification)mExistReplaceIds.get(s2);
            j = ((WebNotification) (s2)).mNotificationId.intValue();
            builder = ((WebNotification) (s2)).mBuilder;
            Integer integer = Integer.valueOf(((WebNotification) (s2)).mMessageNum.intValue() + 1);
            s2.mMessageNum = integer;
            builder.setNumber(integer.intValue());
        } else
        {
            android.app.Notification.Builder builder1 = (new android.app.Notification.Builder(mContext.getApplicationContext())).setAutoCancel(true);
            WebNotification webnotification = new WebNotification();
            webnotification.mNotificationId = Integer.valueOf(i);
            webnotification.mReplaceId = s2;
            webnotification.mBuilder = builder1;
            mExistNotificationIds.put(Integer.valueOf(i), webnotification);
            builder = builder1;
            j = i;
            if (!s2.isEmpty())
            {
                mExistReplaceIds.put(s2, webnotification);
                builder = builder1;
                j = i;
            }
        }
        builder.setContentTitle(s);
        builder.setContentText(s1);
        k = mContext.getApplicationInfo().icon;
        i = k;
        if (k == 0)
        {
            i = 0x1080093;
        }
        builder.setSmallIcon(i);
        s = mView.getActivity();
        s2 = getCategoryFromNotificationId(j);
        s1 = (new Intent(s, s.getClass())).setAction((new StringBuilder()).append(s.getPackageName()).append(".notification.click").toString()).putExtra("xwalk.NOTIFICATION_ID", j).setFlags(0x20100000).addCategory(s2);
        s2 = (new Intent((new StringBuilder()).append(s.getPackageName()).append(".notification.close").toString())).putExtra("xwalk.NOTIFICATION_ID", j).addCategory(s2);
        builder.setContentIntent(PendingIntent.getActivity(s, 0, s1, 0x8000000));
        builder.setDeleteIntent(PendingIntent.getBroadcast(s, 0, s2, 0x8000000));
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            s = builder.build();
        } else
        {
            s = builder.getNotification();
        }
        doShowNotification(j, s);
        notificationChanged();
        onNotificationShown(j);
    }

    public void shutdown()
    {
        if (!mExistNotificationIds.isEmpty())
        {
            unregisterReceiver();
        }
        mBridge = null;
    }

    public void updateNotificationIcon(int i, Bitmap bitmap)
    {
        Object obj = (WebNotification)mExistNotificationIds.get(Integer.valueOf(i));
        if (obj != null)
        {
            int j1 = bitmap.getWidth();
            int k1 = bitmap.getHeight();
            if (j1 != 0 && k1 != 0)
            {
                int l = mContext.getResources().getDimensionPixelSize(0x1050005);
                int i1 = mContext.getResources().getDimensionPixelSize(0x1050006);
                int j = i1;
                int k = l;
                if (j1 > l)
                {
                    j = i1;
                    k = l;
                    if (k1 > i1)
                    {
                        if (j1 * i1 > k1 * l)
                        {
                            j = (k1 * l) / j1;
                            k = l;
                        } else
                        {
                            k = (j1 * i1) / k1;
                            j = i1;
                        }
                    }
                }
                obj = ((WebNotification) (obj)).mBuilder;
                ((android.app.Notification.Builder) (obj)).setLargeIcon(Bitmap.createScaledBitmap(bitmap, k, j, true));
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    bitmap = ((android.app.Notification.Builder) (obj)).build();
                } else
                {
                    bitmap = ((android.app.Notification.Builder) (obj)).getNotification();
                }
                doShowNotification(i, bitmap);
                return;
            }
        }
    }

}
