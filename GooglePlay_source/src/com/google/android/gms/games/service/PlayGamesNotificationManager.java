// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.AccountManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.SingleRefDataBufferIterator;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.notification.GameNotification;
import com.google.android.gms.games.internal.notification.GameNotificationBuffer;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.provider.GamesPanoContentProvider;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.PanoUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class PlayGamesNotificationManager
{
    private static final class NotificationRecord
    {

        public final String externalGameId;
        public final long internalId;
        public final boolean isSilent;
        public final String notificationId;
        public final String text;
        public final int type;

        public final boolean equals(Object obj)
        {
            if (obj instanceof NotificationRecord)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (NotificationRecord)obj;
                if (Objects.equal(Long.valueOf(internalId), Long.valueOf(((NotificationRecord) (obj)).internalId)) && Objects.equal(notificationId, ((NotificationRecord) (obj)).notificationId) && Objects.equal(externalGameId, ((NotificationRecord) (obj)).externalGameId) && Objects.equal(text, ((NotificationRecord) (obj)).text) && Objects.equal(Integer.valueOf(type), Integer.valueOf(((NotificationRecord) (obj)).type)) && Objects.equal(Boolean.valueOf(isSilent), Boolean.valueOf(((NotificationRecord) (obj)).isSilent)))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Long.valueOf(internalId), notificationId, externalGameId, text, Integer.valueOf(type), Boolean.valueOf(isSilent)
            });
        }

        public NotificationRecord(long l, String s, String s1, String s2, int i, boolean flag)
        {
            internalId = l;
            notificationId = s;
            externalGameId = s1;
            text = s2;
            type = i;
            isSilent = flag;
        }
    }


    private static final int NOTIFICATION_ID_BASE = "PlayGamesNotifiManager".hashCode();
    private static final SparseArray NOTIFICATION_MAP = new SparseArray();

    private static android.support.v4.app.NotificationCompat.InboxStyle buildInbox(Context context, String s, GameNotificationBuffer gamenotificationbuffer)
    {
        android.support.v4.app.NotificationCompat.InboxStyle inboxstyle;
label0:
        {
            int j = gamenotificationbuffer.getCount();
            inboxstyle = new android.support.v4.app.NotificationCompat.InboxStyle();
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break label0;
                }
                GameNotification gamenotification = gamenotificationbuffer.get(i);
                if (gamenotification.isSilent())
                {
                    break;
                }
                String s1 = gamenotification.getCoalescedText();
                if (s1 == null)
                {
                    GamesLog.wtf(context, "PlayGamesNotifiManager", (new StringBuilder("Null coalesced text when parsing notification ")).append(gamenotification.getNotificationId()).toString());
                } else
                {
                    inboxstyle.addLine(Html.fromHtml(s1));
                }
                i++;
            } while (true);
            i = j - i;
            inboxstyle.addLine(context.getResources().getQuantityString(0x7f0f0009, i, new Object[] {
                Integer.valueOf(i)
            }));
        }
        inboxstyle.setSummaryText(s);
        return inboxstyle;
    }

    public static void cancelNotification(Context context, int i)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(i);
    }

    private static void clearAllNotifications(Context context, String s, String s1, int i)
    {
        GamesLog.d("PlayGamesNotifiManager", "Clearing displayed notifications.");
        logDisplayedNotificationAction(context, s, s1, 5);
        cancelNotification(context, i);
        NOTIFICATION_MAP.remove(i);
    }

    private static void clearIfPreviouslySilent(Context context, int i)
    {
        ArrayList arraylist = (ArrayList)NOTIFICATION_MAP.get(i);
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        boolean flag1;
        flag1 = true;
        j = 0;
_L4:
        boolean flag;
        flag = flag1;
        if (j >= arraylist.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((NotificationRecord)arraylist.get(j)).isSilent)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        flag = false;
        if (!flag) goto _L1; else goto _L3
_L3:
        cancelNotification(context, i);
        return;
        j++;
          goto _L4
    }

    private static Intent createNotificationIntent(String s, String s1, String s2)
    {
        s2 = new Intent(s2);
        s2.setPackage("com.google.android.play.games");
        s2.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        s2.putExtra("com.google.android.gms.games.PLAYER_ID", s1);
        s2.addFlags(0x10000000);
        s2.addFlags(16384);
        s2.addFlags(0x4000000);
        return s2;
    }

    private static android.support.v4.app.NotificationCompat.Builder getBaseNotificationBuilder(Context context)
    {
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setFlag(16, true);
        builder = builder.setSmallIcon(0x7f020291);
        builder.mCategory = "social";
        builder.mColor = context.getResources().getColor(0x7f0b0255);
        builder.mVisibility = 1;
        builder.mNotification.defaults = -1;
        context = builder.mNotification;
        context.flags = ((Notification) (context)).flags | 1;
        return builder;
    }

    private static PendingIntent getDeleteIntent(Context context, String s, int i)
    {
        Intent intent = new Intent("com.google.android.gms.games.ACKNOWLEDGE_NOTIFICATIONS");
        intent.putExtra("com.google.android.gms.games.ACCOUNT_KEY", s);
        return PendingIntent.getBroadcast(context, getNotificationId(s, i), intent, 0x40000000);
    }

    private static PendingIntent getInboxIntent(Context context, int i, String s, String s1)
    {
        String s2;
        if (PanoUtils.isPano(context))
        {
            s2 = "com.google.android.gms.games.destination.pano.SHOW_INBOX_PANO";
        } else
        {
            s2 = "com.google.android.gms.games.destination.SHOW_INBOX";
        }
        return PendingIntent.getActivity(context, i, createNotificationIntent(s, s1, s2), 0x40000000);
    }

    private static Notification getMultipleNotification(Context context, String s, String s1, String s2, boolean flag, GameNotificationBuffer gamenotificationbuffer, Bitmap bitmap)
    {
        Object obj = context.getResources();
        int k = gamenotificationbuffer.getCount();
        PendingIntent pendingintent = getInboxIntent(context, getNotificationId(s, 0), s1, s2);
        String s3 = ((Resources) (obj)).getQuantityString(0x7f0f0008, k, new Object[] {
            Integer.valueOf(k)
        });
        Bitmap bitmap1;
        int i;
        boolean flag2;
        if (flag)
        {
            s2 = getNotificationText$39e223ba(context, s1);
            bitmap = BitmapFactory.decodeResource(((Resources) (obj)), 0x7f020290);
        } else
        {
            s2 = s1;
        }
        bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = BitmapFactory.decodeResource(((Resources) (obj)), 0x7f020291);
        }
        flag2 = true;
        i = getNotificationId(s, 0);
        obj = (ArrayList)NOTIFICATION_MAP.get(i);
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = ((ArrayList) (obj)).size();
        }
        bitmap = new ArrayList(i);
        for (int j = 0; j < i; j++)
        {
            String s4 = ((NotificationRecord)((ArrayList) (obj)).get(j)).notificationId;
            if (s4 != null)
            {
                bitmap.add(s4);
            }
        }

        obj = gamenotificationbuffer.iterator();
        boolean flag1;
        do
        {
            flag1 = flag2;
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            GameNotification gamenotification = (GameNotification)((Iterator) (obj)).next();
            if (gamenotification.isAcknowledged() || bitmap.contains(gamenotification.getNotificationId()) || gamenotification.isSilent())
            {
                continue;
            }
            flag1 = false;
            break;
        } while (true);
        obj = getBaseNotificationBuilder(context);
        if (flag1)
        {
            bitmap = null;
        } else
        {
            bitmap = s3;
        }
        bitmap = ((android.support.v4.app.NotificationCompat.Builder) (obj)).setTicker(bitmap);
        bitmap.mLargeIcon = bitmap1;
        s2 = bitmap.setContentTitle(s3).setContentText(s2);
        s2.mContentIntent = pendingintent;
        s = s2.setContentInfo(String.valueOf(k)).setDeleteIntent(getDeleteIntent(context, s, 0));
        if (flag1)
        {
            flag1 = -2;
        } else
        {
            flag1 = false;
        }
        s.mPriority = ((flag1) ? 1 : 0);
        if (!flag)
        {
            s.setStyle(buildInbox(context, s1, gamenotificationbuffer));
        }
        logNotifications(context, s1, gamenotificationbuffer);
        return s.build();
    }

    private static int getNotificationId(String s, int i)
    {
        return (i & 1) << 31 | (NOTIFICATION_ID_BASE ^ s.hashCode()) & 0x7fffffff;
    }

    private static String getNotificationText$39e223ba(Context context, String s)
    {
        if (AccountManager.get(context).getAccountsByType("com.google").length > 1)
        {
            return s;
        } else
        {
            return context.getResources().getString(0x7f100206);
        }
    }

    private static Uri getPanoImageUri$4abca774(String s, GameNotificationBuffer gamenotificationbuffer)
    {
        for (gamenotificationbuffer = gamenotificationbuffer.iterator(); gamenotificationbuffer.hasNext();)
        {
            Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getFeaturedImageUri(s, ((GameNotification)gamenotificationbuffer.next()).getApplicationId());
            if (uri != null)
            {
                return uri;
            }
        }

        return null;
    }

    private static String getPanoRecommendationTitleString(Context context, GameNotificationBuffer gamenotificationbuffer)
    {
        Asserts.checkState(PanoUtils.isPano(context), "getPanoRecommendationTextString() should only be used on Pano.");
        if (gamenotificationbuffer.getCount() == 1)
        {
            GameNotification gamenotification = gamenotificationbuffer.get(0);
            if (!TextUtils.isEmpty(gamenotification.getTitle()))
            {
                return gamenotification.getTitle();
            }
        }
        int i = -1;
        boolean flag = false;
        int j = 0;
        gamenotificationbuffer = gamenotificationbuffer.iterator();
        do
        {
            if (!gamenotificationbuffer.hasNext())
            {
                break;
            }
            GameNotification gamenotification1 = (GameNotification)gamenotificationbuffer.next();
            if ((gamenotification1.getType() & 3) != 0)
            {
                int k = j + 1;
                if (i == -1)
                {
                    i = gamenotification1.getType();
                    j = k;
                } else
                {
                    j = k;
                    if (i != gamenotification1.getType())
                    {
                        flag = true;
                        j = k;
                    }
                }
            }
        } while (true);
        if (flag)
        {
            return context.getResources().getQuantityString(0x7f0f0008, j, new Object[] {
                Integer.valueOf(j)
            });
        }
        if (i == 1)
        {
            return context.getResources().getQuantityString(0x7f0f000b, j, new Object[] {
                Integer.valueOf(j)
            });
        }
        if (i == 2)
        {
            return context.getResources().getQuantityString(0x7f0f000a, j, new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            GamesLog.w("PlayGamesNotifiManager", (new StringBuilder("getRecommendationTitleString: unexpected type: ")).append(i).toString());
            return context.getResources().getQuantityString(0x7f0f0008, j, new Object[] {
                Integer.valueOf(j)
            });
        }
    }

    private static NotificationRecord getRecord(GameNotification gamenotification, long l)
    {
        return new NotificationRecord(l, gamenotification.getNotificationId(), gamenotification.getApplicationId(), gamenotification.getText(), gamenotification.getType(), gamenotification.isSilent());
    }

    private static Notification getSingleNotification$260e0581(Context context, String s, GameNotification gamenotification, PendingIntent pendingintent, PendingIntent pendingintent1, boolean flag, Bitmap bitmap)
    {
        Resources resources = context.getResources();
        String s1;
        String s2;
        String s3;
        Bitmap bitmap1;
        if (flag)
        {
            s3 = resources.getQuantityString(0x7f0f0008, 1, new Object[] {
                Integer.valueOf(1)
            });
            s2 = s3;
            bitmap = BitmapFactory.decodeResource(resources, 0x7f020290);
            s1 = getNotificationText$39e223ba(context, s);
        } else
        {
            s3 = gamenotification.getTicker();
            s2 = gamenotification.getTitle();
            s1 = gamenotification.getText();
        }
        bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = BitmapFactory.decodeResource(resources, 0x7f020291);
        }
        bitmap = getBaseNotificationBuilder(context).setTicker(s3);
        bitmap.mLargeIcon = bitmap1;
        bitmap = bitmap.setContentTitle(s2).setContentText(s1);
        bitmap.mContentIntent = pendingintent;
        pendingintent = bitmap.setContentInfo("1").setDeleteIntent(pendingintent1);
        pendingintent.mPriority = 0;
        if (!flag && PlatformVersion.checkVersion(16))
        {
            pendingintent1 = new android.support.v4.app.NotificationCompat.InboxStyle();
            pendingintent1.addLine(gamenotification.getText());
            pendingintent1.setSummaryText(s);
            pendingintent.setStyle(pendingintent1);
            pendingintent.setContentText(s);
        }
        GamesPlayLogger.logNotificationAction(context, gamenotification.getApplicationId(), s, gamenotification.getType(), 2, gamenotification.getNotificationId());
        return pendingintent.build();
    }

    public static int getUniqueNotificationId(String s)
    {
        return getNotificationId(s, 0);
    }

    public static void logDisplayedNotificationAction(Context context, String s, String s1, int i)
    {
        logDisplayedNotificationAction(context, s, s1, i, 0);
        logDisplayedNotificationAction(context, s, s1, i, 1);
    }

    private static void logDisplayedNotificationAction(Context context, String s, String s1, int i, int j)
    {
        j = getNotificationId(s, j);
        s = (ArrayList)NOTIFICATION_MAP.get(j);
        if (s != null)
        {
            ArrayList arraylist = new ArrayList();
            j = 0;
            for (int k = s.size(); j < k; j++)
            {
                NotificationRecord notificationrecord = (NotificationRecord)s.get(j);
                arraylist.add(new com.google.android.gms.games.logging.GamesPlayLogger.NotificationData(notificationrecord.externalGameId, notificationrecord.notificationId, notificationrecord.type));
            }

            if (arraylist.size() > 0)
            {
                GamesPlayLogger.logNotificationAction(context, s1, i, arraylist);
                return;
            }
        }
    }

    private static void logNotifications(Context context, String s, GameNotificationBuffer gamenotificationbuffer)
    {
        ArrayList arraylist = new ArrayList();
        GameNotification gamenotification;
        for (gamenotificationbuffer = new SingleRefDataBufferIterator(gamenotificationbuffer); gamenotificationbuffer.hasNext(); arraylist.add(new com.google.android.gms.games.logging.GamesPlayLogger.NotificationData(gamenotification.getApplicationId(), gamenotification.getNotificationId(), gamenotification.getType())))
        {
            gamenotification = (GameNotification)gamenotificationbuffer.next();
        }

        GamesPlayLogger.logNotificationAction(context, s, 2, arraylist);
    }

    public static void showLevelUpNotification(Context context, String s, String s1, String s2, GameNotification gamenotification, Bitmap bitmap)
    {
        int i = getNotificationId(s, 1);
        clearAllNotifications(context, s, s1, i);
        s2 = PendingIntent.getActivity(context, getNotificationId(s, 1), createNotificationIntent(s1, s2, "com.google.android.gms.games.destination.VIEW_MY_PROFILE"), 0x40000000);
        s = getDeleteIntent(context, s, 1);
        boolean flag;
        if (gamenotification.getType() == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Notification type must be level-up.");
        s = getSingleNotification$260e0581(context, s1, gamenotification, s2, s, false, bitmap);
        if (s != null)
        {
            showNotification(context, i, s);
            context = new ArrayList(1);
            context.add(getRecord(gamenotification, 1L));
            NOTIFICATION_MAP.put(i, context);
        }
    }

    public static void showNotification(Context context, int i, Notification notification)
    {
        ((NotificationManager)context.getSystemService("notification")).notify(i, notification);
    }

    public static void updateNotifications(Context context, String s, String s1, String s2, boolean flag, GameNotificationBuffer gamenotificationbuffer, Bitmap bitmap)
    {
        int k = getNotificationId(s, 0);
        if (gamenotificationbuffer.getCount() > 0) goto _L2; else goto _L1
_L1:
        clearAllNotifications(context, s, s1, k);
_L4:
        return;
_L2:
        Object obj;
        ArrayList arraylist;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        obj = (ArrayList)NOTIFICATION_MAP.get(k);
        arraylist = new ArrayList(gamenotificationbuffer.getCount());
        flag4 = false;
        flag3 = true;
        flag1 = false;
        Iterator iterator = gamenotificationbuffer.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            GameNotification gamenotification = (GameNotification)iterator.next();
            arraylist.add(getRecord(gamenotification, gamenotification.getId()));
            boolean flag5 = flag4;
            if (!gamenotification.isAcknowledged())
            {
                flag5 = true;
            }
            boolean flag6 = flag3;
            if (!gamenotification.isSilent())
            {
                flag6 = false;
            }
            flag3 = flag6;
            flag4 = flag5;
            if ((gamenotification.getType() & 3) > 0)
            {
                flag1 = true;
                flag3 = flag6;
                flag4 = flag5;
            }
        } while (true);
        if (arraylist.equals(obj) || !flag4) goto _L4; else goto _L3
_L3:
        if (!flag3)
        {
            clearIfPreviouslySilent(context, k);
        }
        if (!PanoUtils.isPano(context))
        {
            break MISSING_BLOCK_LABEL_535;
        }
        if (!((Boolean)G.enablePanoRecommendationNotifications.get()).booleanValue()) goto _L6; else goto _L5
_L5:
        if (!flag1) goto _L8; else goto _L7
_L7:
        PendingIntent pendingintent;
        PendingIntent pendingintent1;
        String s4;
        pendingintent = getInboxIntent(context, getNotificationId(s, 0), s1, s2);
        pendingintent1 = getDeleteIntent(context, s, 0);
        obj = context.getResources();
        gamenotificationbuffer.getCount();
        s4 = getPanoRecommendationTitleString(context, gamenotificationbuffer);
        Asserts.checkState(PanoUtils.isPano(context), "getPanoRecommendationTextString() should only be used on Pano.");
        if (gamenotificationbuffer.getCount() != 1) goto _L10; else goto _L9
_L9:
        s2 = gamenotificationbuffer.get(0);
        if (TextUtils.isEmpty(s2.getText())) goto _L10; else goto _L11
_L11:
        s2 = s2.getText();
_L12:
        String s5 = ((Resources) (obj)).getString(0x7f10009e);
        Bundle bundle = new Bundle();
        if (bitmap != null)
        {
            boolean flag2;
            if (UiUtils.getDestinationAppVersion(context) >= 0x15ef3c0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = bitmap;
            if (flag2)
            {
                bundle.putString("android.backgroundImageUri", GamesPanoContentProvider.convertInternalToPanoUri(context, getPanoImageUri$4abca774(s, gamenotificationbuffer).toString()));
                obj = bitmap;
            }
        } else
        {
            obj = BitmapFactory.decodeResource(((Resources) (obj)), 0x7f02016a);
        }
        s = getBaseNotificationBuilder(context).setSmallIcon(0x7f020292);
        s.mLargeIcon = ((Bitmap) (obj));
        s = s.setContentTitle(s4).setContentText(s2);
        s.mContentIntent = pendingintent;
        s = s.setContentInfo(s5).setDeleteIntent(pendingintent1);
        s.mPriority = 0;
        s.mExtras = bundle;
        s.mCategory = "recommendation";
        logNotifications(context, s1, gamenotificationbuffer);
        s = s.build();
_L13:
        if (s != null)
        {
            showNotification(context, k, s);
        }
        NOTIFICATION_MAP.put(k, arraylist);
        return;
_L10:
        if (s1 != null)
        {
            s2 = s1;
        } else
        {
            s2 = context.getResources().getString(0x7f100206);
        }
          goto _L12
_L8:
        s = null;
          goto _L13
_L6:
        s = null;
          goto _L13
        if (flag3)
        {
            Object obj1 = context.getResources();
            s2 = getInboxIntent(context, getNotificationId(s, 0), s1, s2);
            int i = gamenotificationbuffer.getCount();
            bitmap = ((Resources) (obj1)).getQuantityString(0x7f0f0008, i, new Object[] {
                Integer.valueOf(i)
            });
            obj1 = BitmapFactory.decodeResource(((Resources) (obj1)), 0x7f020290);
            String s3 = getNotificationText$39e223ba(context, s1);
            android.support.v4.app.NotificationCompat.Builder builder = getBaseNotificationBuilder(context).setTicker(null);
            builder.mLargeIcon = ((Bitmap) (obj1));
            bitmap = builder.setContentTitle(bitmap).setContentText(s3);
            bitmap.mContentIntent = s2;
            s = bitmap.setContentInfo(String.valueOf(i)).setDeleteIntent(getDeleteIntent(context, s, 0));
            s.mPriority = -2;
            logNotifications(context, s1, gamenotificationbuffer);
            s = s.build();
        } else
        if (gamenotificationbuffer.getCount() == 1)
        {
            int j = getNotificationId(s, 0);
            gamenotificationbuffer = gamenotificationbuffer.get(0);
            s2 = getInboxIntent(context, j, s1, s2);
            s = getDeleteIntent(context, s, 0);
            if (flag && gamenotificationbuffer.getType() != 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s = getSingleNotification$260e0581(context, s1, gamenotificationbuffer, s2, s, flag, bitmap);
        } else
        {
            s = getMultipleNotification(context, s, s1, s2, flag, gamenotificationbuffer, bitmap);
        }
          goto _L13
    }

}
