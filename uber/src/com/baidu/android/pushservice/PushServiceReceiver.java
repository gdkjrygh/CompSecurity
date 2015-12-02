// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.baidu.android.pushservice.a.a.g;
import com.baidu.android.pushservice.a.b.c;
import com.baidu.android.pushservice.message.PublicMsg;
import com.baidu.android.pushservice.richmedia.b;
import com.baidu.android.pushservice.richmedia.n;
import com.baidu.android.pushservice.richmedia.o;
import com.baidu.android.pushservice.util.f;
import com.baidu.android.pushservice.util.i;
import com.baidu.frontia.a.c.a;
import java.io.File;
import java.lang.reflect.Method;

// Referenced classes of package com.baidu.android.pushservice:
//            a, g, y, PushSettings

public class PushServiceReceiver extends BroadcastReceiver
{

    private static final String TAG = "PushServiceReceiver";

    public PushServiceReceiver()
    {
    }

    private static void checkWifi(Context context)
    {
        com/baidu/android/pushservice/PushServiceReceiver;
        JVM INSTR monitorenter ;
        if (ConnectivityManager.isNetworkTypeValid(1) && a.a(context))
        {
            i.a(context, false);
        }
        com/baidu/android/pushservice/PushServiceReceiver;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private Intent getCommandServiceIntent(Context context, Intent intent, String s)
    {
        if (com.baidu.android.pushservice.a.a() < 32)
        {
            return intent;
        } else
        {
            intent.setFlags(32);
            intent.setAction(s);
            intent.setClassName(context.getPackageName(), "com.baidu.android.pushservice.CommandService");
            intent.putExtra("command_type", "reflect_receiver");
            return intent;
        }
    }

    public static void handleRichMediaClick(Context context, PublicMsg publicmsg)
    {
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            context = Toast.makeText(context, "\u8BF7\u63D2\u5165SD\u5361", 1);
            context.setGravity(17, 0, 0);
            context.show();
        } else
        if (publicmsg != null && publicmsg.mUrl != null)
        {
            Object obj = Uri.parse(publicmsg.mUrl);
            Object obj1 = ((Uri) (obj)).getPath();
            if (!TextUtils.isEmpty(((Uri) (obj)).getPath()))
            {
                obj1 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/baidu/pushservice/files/").append(((Uri) (obj)).getAuthority()).append("/").append(((String) (obj1)).substring(0, ((String) (obj1)).lastIndexOf('/'))).toString());
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.b("PushServiceReceiver", (new StringBuilder("<<< download url ")).append(((Uri) (obj)).toString()).toString());
                }
                obj = o.a(com.baidu.android.pushservice.richmedia.n.a.a, ((Uri) (obj)).toString());
                obj.a = publicmsg.mPkgName;
                obj.b = ((File) (obj1)).getAbsolutePath();
                obj.c = publicmsg.mTitle;
                obj.d = publicmsg.mDescription;
                (new b(context, new a(context, publicmsg), ((n) (obj)))).start();
                return;
            }
        }
    }

    private static void sendNotificationArrivedReceiver(Context context, String s, PublicMsg publicmsg)
    {
        Intent intent = new Intent();
        intent.setPackage(s);
        intent.putExtra("method", "com.baidu.android.pushservice.action.notification.ARRIVED");
        intent.putExtra("notification_title", publicmsg.mTitle);
        intent.putExtra("notification_content", publicmsg.mCustomContent);
        intent.putExtra("extra_extra_custom_content", publicmsg.mDescription);
        f.a(context, intent, "com.baidu.android.pushservice.action.RECEIVE", publicmsg.mPkgName);
    }

    private void showAdvertiseNotifiation(Context context, String s, String s1, PublicMsg publicmsg, String s2, String s3)
    {
        s = context.getApplicationContext();
        if (s != null) goto _L2; else goto _L1
_L1:
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.d("PushServiceReceiver", "showAdvertiseNotifiation pkgName is invalid");
        }
_L8:
        return;
_L2:
        int j;
        s1 = getCommandServiceIntent(s, new Intent(), "com.baidu.android.pushservice.action.adnotification.ADDELETE");
        s1.putExtra("app_id", s3);
        s1.putExtra("msg_id", s2);
        s1.putExtra("ad_msg", publicmsg);
        s1.putExtra("action_type", "05");
        s1.putExtra("click_url", publicmsg.mUrl);
        s1.putExtra("advertise_Style", String.valueOf(publicmsg.mAdvertiseStyle));
        j = 0;
        int k = Long.valueOf(System.currentTimeMillis()).intValue();
        j = k;
_L6:
        s1 = PendingIntent.getService(context, j, s1, 0x8000000);
        if (publicmsg.mAdvertiseStyle != 1 && publicmsg.mAdvertiseStyle != 2 && publicmsg.mAdvertiseStyle != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        Intent intent = getCommandServiceIntent(s, new Intent(), "com.baidu.android.pushservice.action.adnotification.ADCLICK");
        intent.putExtra("app_id", s3);
        intent.putExtra("msg_id", s2);
        intent.putExtra("ad_msg", publicmsg);
        intent.putExtra("action_type", "01");
        intent.putExtra("click_url", publicmsg.mAdvertiseClickUrl);
        intent.putExtra("advertise_Style", String.valueOf(publicmsg.mAdvertiseStyle));
        c.a(publicmsg.mAdvertiseStyle, s, publicmsg.mDescription, publicmsg.mTitle, publicmsg.mAdvertiseLargeIconUrl, publicmsg.mAdvertiseSmallIconUrl, s1, intent);
        if (com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
        {
            f.a("pushadvertise:  show normal  advertise notification", context);
            return;
        }
        if (true) goto _L4; else goto _L3
_L4:
        Exception exception;
        continue; /* Loop/switch isn't completed */
_L3:
        exception;
        com.baidu.frontia.a.b.a.a.d("PushServiceReceiver", exception.getMessage());
        if (true) goto _L6; else goto _L5
_L5:
        if (publicmsg.mAdvertiseStyle != 4 && publicmsg.mAdvertiseStyle != 5) goto _L8; else goto _L7
_L7:
        context = getCommandServiceIntent(s, new Intent(), "com.baidu.android.pushservice.action.adnotification.ADCLICK");
        context.putExtra("app_id", s3);
        context.putExtra("msg_id", s2);
        context.putExtra("ad_msg", publicmsg);
        context.putExtra("action_type", "01");
        context.putExtra("click_url", publicmsg.mAdvertiseClickUrl);
        context.putExtra("advertise_Style", String.valueOf(publicmsg.mAdvertiseStyle));
        Intent intent1 = getCommandServiceIntent(s, new Intent(), "com.baidu.android.pushservice.action.adnotification.ADCLICK");
        intent1.putExtra("app_id", s3);
        intent1.putExtra("msg_id", s2);
        intent1.putExtra("ad_msg", publicmsg);
        intent1.putExtra("action_type", "02");
        intent1.putExtra("click_url", publicmsg.mAdvertiseBigPictureClickUrl);
        intent1.putExtra("advertise_Style", String.valueOf(publicmsg.mAdvertiseStyle));
        Intent intent2 = getCommandServiceIntent(s, new Intent(), "com.baidu.android.pushservice.action.adnotification.ADCLICK");
        intent2.putExtra("app_id", s3);
        intent2.putExtra("msg_id", s2);
        intent2.putExtra("ad_msg", publicmsg);
        intent2.putExtra("action_type", "03");
        intent2.putExtra("click_url", publicmsg.mAdvertiseDetailClickUrl);
        intent2.putExtra("advertise_Style", String.valueOf(publicmsg.mAdvertiseStyle));
        Intent intent3 = getCommandServiceIntent(s, new Intent(), "com.baidu.android.pushservice.action.adnotification.ADCLICK");
        intent3.putExtra("app_id", s3);
        intent3.putExtra("msg_id", s2);
        intent3.putExtra("ad_msg", publicmsg);
        intent3.putExtra("action_type", "04");
        intent3.putExtra("click_url", publicmsg.mAdvertiseDownloadClickUrl);
        intent3.putExtra("advertise_Style", String.valueOf(publicmsg.mAdvertiseStyle));
        if (publicmsg.mAdvertiseStyle == 4)
        {
            c.a(4, s, publicmsg.mDescription, publicmsg.mTitle, publicmsg.mAdvertiseLargeIconUrl, publicmsg.mAdvertiseSmallIconUrl, publicmsg.mAdvertiseBigPictureUrl, s1, new Intent[] {
                context, intent1
            });
        } else
        if (publicmsg.mAdvertiseStyle == 5)
        {
            c.a(5, s, publicmsg.mDescription, publicmsg.mTitle, publicmsg.mAdvertiseLargeIconUrl, publicmsg.mAdvertiseSmallIconUrl, publicmsg.mAdvertiseBigPictureUrl, s1, new Intent[] {
                context, intent2, intent3, intent1
            });
        }
        if (com.baidu.android.pushservice.a.b() && com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
        {
            f.b("pushadvertise:  show big picture  advertise notification");
            return;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    private static void showPrivateNotification(Context context, String s, String s1, PublicMsg publicmsg, String s2, String s3)
    {
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        Object obj = new Intent();
        ((Intent) (obj)).setClassName(s, s1);
        ((Intent) (obj)).setAction("com.baidu.android.pushservice.action.privatenotification.CLICK");
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder("content://")).append(s2).toString()));
        ((Intent) (obj)).putExtra("public_msg", publicmsg);
        ((Intent) (obj)).putExtra("app_id", s3);
        ((Intent) (obj)).putExtra("msg_id", s2);
        obj = PendingIntent.getService(context, 0, ((Intent) (obj)), 0);
        Intent intent = new Intent();
        intent.setClassName(s, s1);
        intent.setAction("com.baidu.android.pushservice.action.privatenotification.DELETE");
        intent.setData(Uri.parse((new StringBuilder("content://")).append(s2).toString()));
        intent.putExtra("public_msg", publicmsg);
        intent.putExtra("app_id", s3);
        intent.putExtra("msg_id", s2);
        s3 = PendingIntent.getService(context, 0, intent, 0);
        boolean flag = f.s(context, publicmsg.mPkgName);
        if (publicmsg.mNotificationBuilder == 0)
        {
            s1 = com.baidu.android.pushservice.g.a(context, publicmsg.mNotificationBuilder, publicmsg.mNotificationBasicStyle, publicmsg.mTitle, publicmsg.mDescription, flag);
        } else
        {
            s1 = com.baidu.android.pushservice.g.a(context, publicmsg.mNotificationBuilder, publicmsg.mTitle, publicmsg.mDescription, flag);
        }
        s1.contentIntent = ((PendingIntent) (obj));
        s1.deleteIntent = s3;
        notificationmanager.notify(s2, 0, s1);
        sendNotificationArrivedReceiver(context, s, publicmsg);
    }

    private static void showRichNotification(Context context, String s, String s1, PublicMsg publicmsg, String s2)
    {
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        Object obj = new Intent("com.baidu.android.pushservice.action.media.CLICK");
        ((Intent) (obj)).setClassName(s, s1);
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder("content://")).append(publicmsg.mMsgId).toString()));
        ((Intent) (obj)).putExtra("public_msg", publicmsg);
        ((Intent) (obj)).putExtra("app_id", s2);
        obj = PendingIntent.getService(context, 0, ((Intent) (obj)), 0);
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("PushServiceReceiver", (new StringBuilder("Set click broadcast, pkgname: ")).append(publicmsg.mPkgName).append(" action: com.baidu.android.pushservice.action.media.CLICK").toString());
        }
        Intent intent = new Intent();
        intent.setClassName(s, s1);
        intent.setAction("com.baidu.android.pushservice.action.media.DELETE");
        intent.setData(Uri.parse((new StringBuilder("content://")).append(publicmsg.mMsgId).toString()));
        intent.putExtra("public_msg", publicmsg);
        intent.putExtra("app_id", s2);
        s = PendingIntent.getService(context, 0, intent, 0);
        boolean flag = f.s(context, publicmsg.mPkgName);
        context = com.baidu.android.pushservice.g.a(context, 8888, publicmsg.mTitle, "\u5BCC\u5A92\u4F53\u6D88\u606F\uFF1A\u70B9\u51FB\u540E\u4E0B\u8F7D\u4E0E\u67E5\u770B", flag);
        context.contentIntent = ((PendingIntent) (obj));
        context.deleteIntent = s;
        notificationmanager.notify(publicmsg.mMsgId, 0, context);
    }

    private static void startOwnPushService(Context context)
    {
        (new Thread(new y(context))).start();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        Object obj1 = null;
        String s = intent.getAction();
        Object obj;
        if ("android.intent.action.BOOT_COMPLETED".equals(s) || "android.net.conn.CONNECTIVITY_CHANGE".equals(s) || "android.intent.action.USER_PRESENT".equals(s) || "android.intent.action.MEDIA_CHECKING".equals(s) || "android.intent.action.ACTION_POWER_CONNECTED".equals(s) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(s) || "android.bluetooth.adapter.action.STATE_CHANGED".equals(s))
        {
            com.baidu.frontia.a.b.a.a.a("PushServiceReceiver", (new StringBuilder("start PushSerevice for by ")).append(s).toString());
            startOwnPushService(context);
        } else
        {
label0:
            {
                if (!"com.baidu.android.pushservice.action.notification.SHOW".equals(s))
                {
                    break label0;
                }
                obj1 = intent.getStringExtra("pushService_package_name");
                String s1 = intent.getStringExtra("service_name");
                obj = intent.getParcelableExtra("public_msg");
                String s2;
                android.os.Parcelable parcelable;
                if (obj != null && (obj instanceof PublicMsg))
                {
                    obj = (PublicMsg)obj;
                } else
                {
                    obj = null;
                }
                if (TextUtils.isEmpty(((CharSequence) (obj1))) || TextUtils.isEmpty(s1) || obj == null)
                {
                    context = (new StringBuilder("Extra not valid, servicePkgName=")).append(((String) (obj1))).append(" serviceName=").append(s1).append(" pMsg==null - ");
                    if (obj == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.baidu.frontia.a.b.a.a.b("PushServiceReceiver", context.append(flag).toString());
                    return;
                }
                s2 = intent.getStringExtra("notify_type");
                if ("private".equals(s2))
                {
                    showPrivateNotification(context, ((String) (obj1)), s1, ((PublicMsg) (obj)), intent.getStringExtra("message_id"), intent.getStringExtra("app_id"));
                } else
                if ("rich_media".equals(s2))
                {
                    showRichNotification(context, ((String) (obj1)), s1, ((PublicMsg) (obj)), intent.getStringExtra("app_id"));
                }
            }
        }
        ((NotificationManager)context.getApplicationContext().getSystemService("notification")).cancel(intent.getStringExtra("msg_id"), 0);
        if (!com.baidu.android.pushservice.a.b()) goto _L2; else goto _L1
_L1:
        if (com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
        {
            f.b("pushadvertise:  cancel advertise notification");
        }
        obj = f.A(context);
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        return;
        if (!"com.baidu.android.pushservice.action.media.CLICK".equals(s)) goto _L6; else goto _L5
_L5:
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushServiceReceiver", "Rich media notification clicked");
        }
        try
        {
            if (!intent.hasExtra("public_msg"))
            {
                break MISSING_BLOCK_LABEL_993;
            }
            obj = (PublicMsg)intent.getParcelableExtra("public_msg");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.c("PushServiceReceiver", "Rich media notification clicked, parse pMsg exception");
            return;
        }
_L8:
        handleRichMediaClick(context, ((PublicMsg) (obj)));
        break MISSING_BLOCK_LABEL_116;
_L6:
label1:
        {
            if (!"com.baidu.android.pushservice.action.frontia.user".equals(s))
            {
                break label1;
            }
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("PushServiceReceiver", "receive frontia user");
            }
            com.baidu.android.pushservice.PushSettings.a(intent.getStringExtra("com.baidu.android.pushservice.frontia.user.apikey"), intent.getStringExtra("com.baidu.android.pushservice.frontia.user.pkgName"), intent.getStringExtra("com.baidu.android.pushservice.frontia.user.user"));
        }
        break MISSING_BLOCK_LABEL_116;
        if ("com.baidu.android.pushservice.action.advertise.notification.SHOW".equals(s))
        {
            s1 = intent.getStringExtra("pushService_package_name");
            s2 = intent.getStringExtra("service_name");
            parcelable = intent.getParcelableExtra("ad_msg");
            obj = obj1;
            if (parcelable != null)
            {
                obj = obj1;
                if (parcelable instanceof PublicMsg)
                {
                    obj = (PublicMsg)parcelable;
                }
            }
            if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) || obj == null)
            {
                context = (new StringBuilder("Extra not valid, servicePkgName=")).append(s1).append(" serviceName=").append(s2).append(" pMsg==null - ");
                if (obj != null)
                {
                    flag = false;
                }
                com.baidu.frontia.a.b.a.a.b("PushServiceReceiver", context.append(flag).toString());
                return;
            }
            showAdvertiseNotifiation(context, s1, s2, ((PublicMsg) (obj)), intent.getStringExtra("message_id"), intent.getStringExtra("app_id"));
            if (com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
            {
                f.a("pushadvertise:  show advertise notification", context);
            }
            break MISSING_BLOCK_LABEL_116;
        }
        if (!"com.baidu.android.pushservice.action.adnotification.ADCLICK".equals(s))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushServiceReceiver", "Handle ADNotification Click Action");
        }
        obj = intent.getStringExtra("click_url");
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(((String) (obj)).trim()))
        {
            obj = Uri.parse(((String) (obj)).trim());
            if (g.a(((Uri) (obj))))
            {
                if (com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
                {
                    f.b("pushadvertise:  open click url");
                }
                obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
                ((Intent) (obj)).addFlags(0x10000000);
                context.startActivity(((Intent) (obj)));
            }
        }
        obj1 = context.getSystemService("statusbar");
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            break MISSING_BLOCK_LABEL_858;
        }
        obj = obj1.getClass().getMethod("collapse", new Class[0]);
_L7:
        ((Method) (obj)).invoke(obj1, new Object[0]);
        break MISSING_BLOCK_LABEL_116;
        try
        {
            obj = obj1.getClass().getMethod("collapsePanels", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.baidu.frontia.a.b.a.a.d("PushServiceReceiver", ((Exception) (obj)).getMessage());
            break MISSING_BLOCK_LABEL_116;
        }
        if (true) goto _L7; else goto _L4
_L4:
        intent.setClassName(((String) (obj)), "com.baidu.android.pushservice.PushService");
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.d("PushServiceReceiver", (new StringBuilder("CLICK  ")).append(intent.toURI()).toString());
        }
        context.startService(intent);
        return;
_L2:
        if ("com.baidu.android.pushservice.action.adnotification.ADDELETE".equals(s))
        {
            obj = f.A(context);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                intent.setClassName(((String) (obj)), "com.baidu.android.pushservice.PushService");
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.d("PushServiceReceiver", (new StringBuilder("DELETE  ")).append(intent.toURI()).toString());
                }
                context.startService(intent);
                return;
            }
        }
          goto _L3
        obj = null;
          goto _L8
    }

    private class a
        implements q
    {

        public Context a;
        public RemoteViews b;
        public int c;
        public int d;
        public int e;
        public int f;
        NotificationManager g;

        public void a(b b1)
        {
            b1 = a.getResources();
            String s = a.getPackageName();
            if (b1 != null)
            {
                int j = b1.getIdentifier("bpush_download_progress", "layout", s);
                b = new RemoteViews(a.getPackageName(), j);
                if (j != 0)
                {
                    c = b1.getIdentifier("bpush_download_progress", "id", s);
                    d = b1.getIdentifier("bpush_progress_percent", "id", s);
                    e = b1.getIdentifier("bpush_progress_text", "id", s);
                    f = b1.getIdentifier("bpush_download_icon", "id", s);
                    b.setImageViewResource(f, a.getApplicationInfo().icon);
                    return;
                }
            }
        }

        public void a(b b1, m m1)
        {
            b1 = b1.d.d();
            if (m1.a != m1.b && b != null)
            {
                int j = (int)(((double)m1.a * 100D) / (double)m1.b);
                b.setTextViewText(d, (new StringBuilder()).append(j).append("%").toString());
                b.setTextViewText(e, (new StringBuilder("\u6B63\u5728\u4E0B\u8F7D\u5BCC\u5A92\u4F53:")).append(b1).toString());
                b.setProgressBar(c, 100, j, false);
                m1 = new Notification(0x1080081, null, System.currentTimeMillis());
                m1.contentView = b;
                m1.contentIntent = PendingIntent.getActivity(a, 0, new Intent(), 0);
                m1.flags = ((Notification) (m1)).flags | 0x20;
                m1.flags = ((Notification) (m1)).flags | 2;
                g.notify(b1, 0, m1);
            }
        }

        public void a(b b1, p p)
        {
            b1 = b1.d.d();
            g.cancel(b1, 0);
            p = PushDatabase.getFileDownloadingInfo(a, b1);
            if (p != null && ((com.baidu.android.pushservice.util.PushDatabase.g) (p)).i == b.f)
            {
                b1 = ((com.baidu.android.pushservice.util.PushDatabase.g) (p)).e;
                p = ((com.baidu.android.pushservice.util.PushDatabase.g) (p)).f;
                b1 = (new StringBuilder()).append(b1).append("/").append(p.substring(0, p.lastIndexOf("."))).append("/index.html").toString();
                p = new Intent();
                p.setClass(a, com/baidu/android/pushservice/richmedia/MediaViewActivity);
                p.setData(Uri.fromFile(new File(b1)));
                p.addFlags(0x10000000);
                a.startActivity(p);
            }
        }

        public void a(b b1, Throwable throwable)
        {
            b1 = b1.d.d();
            g.cancel(b1, 0);
            b1 = Toast.makeText(a, (new StringBuilder("\u4E0B\u8F7D\u5BCC\u5A92\u4F53")).append(Uri.parse(b1).getAuthority()).append("\u5931\u8D25").toString(), 1);
            b1.setGravity(17, 0, 0);
            b1.show();
        }

        public void b(b b1)
        {
            b1 = b1.d.d();
            g.cancel(b1, 0);
        }

        a(Context context, PublicMsg publicmsg)
        {
            a = null;
            b = null;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            a = context;
            g = (NotificationManager)context.getSystemService("notification");
        }
    }

}
