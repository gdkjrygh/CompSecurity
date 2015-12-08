// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v4.app.TaskStackBuilder;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.ui.RemoteActivity;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.service:
//            IntentActionsService

public class NotificationService extends Service
    implements org.xbmc.kore.host.HostConnectionObserver.PlayerEventsObserver
{

    public static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/service/NotificationService);
    private static Target picassoTarget = null;
    private HostConnectionObserver mHostConnectionObserver;
    private PendingIntent mRemoteStartPendingIntent;

    public NotificationService()
    {
        mHostConnectionObserver = null;
    }

    private PendingIntent buildActionPendingIntent(int i, String s)
    {
        return PendingIntent.getService(this, 0, (new Intent(this, org/xbmc/kore/service/IntentActionsService)).setAction(s).putExtra("extra_player_id", i), 0x8000000);
    }

    private void buildNotification(final org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType notification, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, final org.xbmc.kore.jsonrpc.type.ListType.ItemsAll collapsedRV)
    {
        final String title;
        final int posterHeight;
        boolean flag;
        if (collapsedRV.type.equals("movie") || collapsedRV.type.equals("episode"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        title = collapsedRV.type;
        posterHeight = -1;
        title.hashCode();
        JVM INSTR lookupswitch 4: default 84
    //                   -1544438277: 139
    //                   -759089802: 171
    //                   3536149: 155
    //                   104087344: 123;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        posterHeight;
        JVM INSTR tableswitch 0 3: default 116
    //                   0 187
    //                   1 612
    //                   2 694
    //                   3 746;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        return;
_L5:
        if (title.equals("movie"))
        {
            posterHeight = 0;
        }
          goto _L1
_L2:
        if (title.equals("episode"))
        {
            posterHeight = 1;
        }
          goto _L1
_L4:
        if (title.equals("song"))
        {
            posterHeight = 2;
        }
          goto _L1
_L3:
        if (title.equals("musicvideo"))
        {
            posterHeight = 3;
        }
          goto _L1
_L7:
        String s;
        String s1;
        title = collapsedRV.title;
        s1 = collapsedRV.tagline;
        s = collapsedRV.thumbnail;
        posterHeight = 0x7f02006c;
_L13:
        propertyvalue.speed;
        JVM INSTR tableswitch 1 1: default 232
    //                   1 804;
           goto _L11 _L12
_L11:
        final int expandedIconResId = 0x7f020074;
_L14:
        PendingIntent pendingintent = buildActionPendingIntent(notification.playerid, "play_pause");
        final RemoteViews expandedRV;
        final int posterWidth;
        int i;
        if (collapsedRV.type.equals("song"))
        {
            propertyvalue = buildActionPendingIntent(notification.playerid, "previous");
            i = 0x7f020086;
            notification = buildActionPendingIntent(notification.playerid, "next");
            posterWidth = 0x7f020084;
        } else
        {
            propertyvalue = buildActionPendingIntent(notification.playerid, "rewind");
            i = 0x7f020058;
            notification = buildActionPendingIntent(notification.playerid, "fast_forward");
            posterWidth = 0x7f020056;
        }
        collapsedRV = new RemoteViews(getPackageName(), 0x7f030047);
        collapsedRV.setImageViewResource(0x7f0e0098, i);
        collapsedRV.setOnClickPendingIntent(0x7f0e0098, propertyvalue);
        collapsedRV.setImageViewResource(0x7f0e009a, expandedIconResId);
        collapsedRV.setOnClickPendingIntent(0x7f0e009a, pendingintent);
        collapsedRV.setImageViewResource(0x7f0e009b, posterWidth);
        collapsedRV.setOnClickPendingIntent(0x7f0e009b, notification);
        collapsedRV.setTextViewText(0x7f0e002d, title);
        collapsedRV.setTextViewText(0x7f0e00cb, s1);
        expandedRV = new RemoteViews(getPackageName(), 0x7f030048);
        expandedRV.setImageViewResource(0x7f0e0098, i);
        expandedRV.setOnClickPendingIntent(0x7f0e0098, propertyvalue);
        expandedRV.setImageViewResource(0x7f0e009a, expandedIconResId);
        expandedRV.setOnClickPendingIntent(0x7f0e009a, pendingintent);
        expandedRV.setImageViewResource(0x7f0e009b, posterWidth);
        expandedRV.setOnClickPendingIntent(0x7f0e009b, notification);
        expandedRV.setTextViewText(0x7f0e002d, title);
        expandedRV.setTextViewText(0x7f0e00cb, s1);
        if (flag)
        {
            expandedIconResId = 0x7f0e00ce;
            expandedRV.setViewVisibility(0x7f0e00ce, 0);
            expandedRV.setViewVisibility(0x7f0e00cd, 8);
        } else
        {
            expandedIconResId = 0x7f0e00cd;
            expandedRV.setViewVisibility(0x7f0e00ce, 8);
            expandedRV.setViewVisibility(0x7f0e00cd, 0);
        }
        notification = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(posterHeight).setShowWhen(false).setOngoing(true).setVisibility(1).setCategory("transport").setContentIntent(mRemoteStartPendingIntent).setContent(collapsedRV).build();
        propertyvalue = getResources();
        posterWidth = propertyvalue.getDimensionPixelOffset(0x7f080028);
        if (flag)
        {
            posterHeight = propertyvalue.getDimensionPixelOffset(0x7f080026);
        } else
        {
            posterHeight = posterWidth;
        }
        if (picassoTarget == null)
        {
            picassoTarget = new Target() {

                final NotificationService this$0;
                final RemoteViews val$collapsedRV;
                final int val$expandedIconResId;
                final RemoteViews val$expandedRV;
                final Notification val$notification;
                final int val$posterHeight;
                final int val$posterWidth;
                final String val$title;

                private void showNotification(Bitmap bitmap)
                {
                    collapsedRV.setImageViewBitmap(0x7f0e002c, bitmap);
                    if (Utils.isJellybeanOrLater())
                    {
                        notification.bigContentView = expandedRV;
                        expandedRV.setImageViewBitmap(expandedIconResId, bitmap);
                    }
                    ((NotificationManager)getSystemService("notification")).notify(1, notification);
                    NotificationService.picassoTarget = null;
                }

                public void onBitmapFailed(Drawable drawable)
                {
                    showNotification(Utils.drawableToBitmap(UIUtils.getCharacterAvatar(NotificationService.this, title), posterWidth, posterHeight));
                }

                public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
                {
                    showNotification(bitmap);
                }

                public void onPrepareLoad(Drawable drawable)
                {
                }

            
            {
                this$0 = NotificationService.this;
                title = s;
                posterWidth = i;
                posterHeight = j;
                collapsedRV = remoteviews;
                notification = notification1;
                expandedRV = remoteviews1;
                expandedIconResId = k;
                super();
            }
            };
            notification = HostManager.getInstance(this);
            notification.getPicasso().load(notification.getHostInfo().getImageUrl(s)).resize(posterWidth, posterHeight).into(picassoTarget);
            return;
        }
          goto _L6
_L8:
        title = collapsedRV.title;
        s = String.format(getString(0x7f070082), new Object[] {
            Integer.valueOf(collapsedRV.season), Integer.valueOf(collapsedRV.episode)
        });
        s1 = String.format("%s | %s", new Object[] {
            collapsedRV.showtitle, s
        });
        s = collapsedRV.art.poster;
        posterHeight = 0x7f02008c;
          goto _L13
_L9:
        title = collapsedRV.title;
        s1 = (new StringBuilder()).append(collapsedRV.displayartist).append(" | ").append(collapsedRV.album).toString();
        s = collapsedRV.thumbnail;
        posterHeight = 0x7f020060;
          goto _L13
_L10:
        title = collapsedRV.title;
        s1 = (new StringBuilder()).append(Utils.listStringConcat(collapsedRV.artist, ", ")).append(" | ").append(collapsedRV.album).toString();
        s = collapsedRV.thumbnail;
        posterHeight = 0x7f020060;
          goto _L13
_L12:
        expandedIconResId = 0x7f020070;
          goto _L14
    }

    private void removeNotification()
    {
        ((NotificationManager)getSystemService("notification")).cancel(1);
    }

    public void inputOnInputRequested(String s, String s1, String s2)
    {
    }

    public void observerOnStopObserving()
    {
        removeNotification();
        LogUtils.LOGD(TAG, "Shutting down notification service - System quit");
        stopSelf();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(this);
        taskstackbuilder.addParentStack(org/xbmc/kore/ui/RemoteActivity);
        taskstackbuilder.addNextIntent(new Intent(this, org/xbmc/kore/ui/RemoteActivity));
        mRemoteStartPendingIntent = taskstackbuilder.getPendingIntent(0, 0x8000000);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        LogUtils.LOGD(TAG, "onStartCommand");
        intent = HostManager.getInstance(this).getHostConnectionObserver();
        if (mHostConnectionObserver == intent)
        {
            LogUtils.LOGD(TAG, "Already initialized");
            return 1;
        }
        if (mHostConnectionObserver != null)
        {
            mHostConnectionObserver.unregisterPlayerObserver(this);
        }
        mHostConnectionObserver = intent;
        mHostConnectionObserver.registerPlayerObserver(this, true);
        return 1;
    }

    public void onTaskRemoved(Intent intent)
    {
        removeNotification();
        LogUtils.LOGD(TAG, "Shutting down notification service - Task removed");
        if (mHostConnectionObserver != null)
        {
            mHostConnectionObserver.unregisterPlayerObserver(this);
        }
        stopSelf();
    }

    public void playerNoResultsYet()
    {
        removeNotification();
    }

    public void playerOnConnectionError(int i, String s)
    {
        removeNotification();
        LogUtils.LOGD(TAG, "Shutting down notification service - Connection error");
        if (mHostConnectionObserver != null)
        {
            mHostConnectionObserver.unregisterPlayerObserver(this);
        }
        stopSelf();
    }

    public void playerOnPause(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        buildNotification(getactiveplayersreturntype, propertyvalue, itemsall);
    }

    public void playerOnPlay(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        buildNotification(getactiveplayersreturntype, propertyvalue, itemsall);
    }

    public void playerOnStop()
    {
        removeNotification();
        LogUtils.LOGD(TAG, "Shutting down notification service - Player stopped");
        if (mHostConnectionObserver != null)
        {
            mHostConnectionObserver.unregisterPlayerObserver(this);
        }
        stopSelf();
    }

    public void systemOnQuit()
    {
        removeNotification();
        LogUtils.LOGD(TAG, "Shutting down notification service - System quit");
        if (mHostConnectionObserver != null)
        {
            mHostConnectionObserver.unregisterPlayerObserver(this);
        }
        stopSelf();
    }



/*
    static Target access$002(Target target)
    {
        picassoTarget = target;
        return target;
    }

*/
}
