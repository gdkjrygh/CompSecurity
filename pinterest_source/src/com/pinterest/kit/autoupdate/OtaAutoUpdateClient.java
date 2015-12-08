// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.autoupdate;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.ByteApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.notification.NotificationHelper;
import java.io.File;

// Referenced classes of package com.pinterest.kit.autoupdate:
//            AutoUpdateClient

public class OtaAutoUpdateClient
    implements AutoUpdateClient
{

    private static int a;
    private static boolean b = false;
    private static BaseApiResponseHandler c = new _cls1();
    private static ByteApiResponseHandler d = new _cls2();

    public OtaAutoUpdateClient()
    {
    }

    static int a()
    {
        return e();
    }

    static int a(int i)
    {
        a = i;
        return i;
    }

    static void a(File file)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        intent.addFlags(0x10000000);
        Application.context().startActivity(intent);
    }

    static boolean a(boolean flag)
    {
        b = flag;
        return flag;
    }

    static int b()
    {
        return a;
    }

    static void c()
    {
        BaseDialog basedialog = new BaseDialog();
        basedialog.setTitle(0x7f070392);
        basedialog.setMessage(Resources.string(0x7f070611, new Object[] {
            Integer.valueOf(a - e())
        }));
        basedialog.setPositiveButton(0x7f0705ca, new _cls3(basedialog));
        basedialog.setNegativeButton(0x7f0703a9, null);
        basedialog.setCancelable(true);
        Events.post(new DialogEvent(basedialog));
    }

    static void d()
    {
        Notification notification = NotificationHelper.getNotification(Resources.string(0x7f07005d), Resources.string(0x7f0706f4));
        notification.flags = notification.flags & 0xffffffef;
        ((NotificationManager)Application.context().getSystemService("notification")).notify(1, notification);
    }

    private static int e()
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (ApplicationInfo.isPrerelease())
        {
            String s = ApplicationInfo.getVersionName();
            i = ((flag) ? 1 : 0);
            if (s != null)
            {
                String as[] = s.split("[ ]+")[0].split("-");
                i = ((flag) ? 1 : 0);
                if (as.length > 0)
                {
                    i = Integer.parseInt(as[as.length - 1]);
                }
            }
        }
        return i;
    }

    public void checkForUpdate()
    {
        if (b)
        {
            return;
        } else
        {
            ApiHttpClient.get("https://s3.amazonaws.com/pinterest-ota-builds/status_android.json", c, false, true, false, null, null);
            return;
        }
    }

    public void startUpdate(Activity activity)
    {
        Application.showToast(0x7f0705cc);
        activity = String.format("https://s3.amazonaws.com/pinterest-ota-builds/android/Android/%d/pinterest-master.apk", new Object[] {
            Integer.valueOf(a)
        });
        d.setBaseUrl(activity);
        ApiHttpClient.getBinaryData(activity, d, false, true, null);
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final BaseDialog a;

        public final void onClick(View view)
        {
            AutoUpdateManager.a().startUpdate(null);
            a.dismiss();
        }

        _cls3(BaseDialog basedialog)
        {
            a = basedialog;
            super();
        }
    }


    private class _cls1 extends BaseApiResponseHandler
    {

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Log.e("DebugAutoUpdateManager", (new StringBuilder("Failed to retrieve latest Jenkins Build Version ")).append(apiresponse).append(" ").append(apiresponse.getCode()).append(" ").append(apiresponse.getStatus()).append(" ").append(apiresponse.getMessage()).toString(), throwable);
        }

        public final void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            if (pinterestjsonobject == null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            OtaAutoUpdateClient.a(Integer.parseInt(pinterestjsonobject.a("android_latest_version", "")));
            int i = OtaAutoUpdateClient.a();
            if (OtaAutoUpdateClient.b() - i >= 4)
            {
                OtaAutoUpdateClient.c();
            }
            return;
            pinterestjsonobject;
        }

        _cls1()
        {
        }
    }


    private class _cls2 extends ByteApiResponseHandler
    {

        public final void onErrorResponse(VolleyError volleyerror)
        {
            Application.showToast(0x7f07072f);
            OtaAutoUpdateClient.a(false);
        }

        public final volatile void onResponse(Object obj)
        {
            onResponse((byte[])obj);
        }

        public final void onResponse(byte abyte0[])
        {
            File file = new File(Application.context().getExternalCacheDir(), "pinterest-master.apk");
            file.delete();
            try
            {
                FileUtils.writeByteArrayToFile(file, abyte0);
                if (file.exists())
                {
                    OtaAutoUpdateClient.a(file);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                PLog.error(abyte0, "exception occurred", new Object[0]);
            }
            NotificationHelper.cancelNotification(1);
            OtaAutoUpdateClient.a(false);
        }

        public final void onStart()
        {
            OtaAutoUpdateClient.d();
            OtaAutoUpdateClient.a(true);
        }

        _cls2()
        {
        }
    }

}
