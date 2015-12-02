// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.message;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baidu.android.pushservice.ad;
import com.baidu.android.pushservice.c.h;
import com.baidu.android.pushservice.f.b;
import com.baidu.android.pushservice.f.k;
import com.baidu.android.pushservice.f.l;
import com.baidu.android.pushservice.f.t;
import com.baidu.android.pushservice.util.f;
import com.baidu.frontia.a.b.a.a;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice.message:
//            i, h

public class PublicMsg
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    public static final int FLAG_NEED_CLEAR = 1;
    public static final int FLAG_NEED_SOUND = 4;
    public static final int FLAG_NEED_VIBRATE = 2;
    private static final String TAG = "PublicMsg";
    public String mAdvertiseBigPictureClickUrl;
    public String mAdvertiseBigPictureContent;
    public String mAdvertiseBigPictureTitle;
    public String mAdvertiseBigPictureUrl;
    public String mAdvertiseClickUrl;
    public String mAdvertiseDetailClickUrl;
    public String mAdvertiseDownloadClickUrl;
    public String mAdvertiseLargeIconUrl;
    public String mAdvertiseSmallIconUrl;
    public int mAdvertiseStyle;
    public String mAppId;
    public String mCustomContent;
    public String mDescription;
    public boolean mIsSupportApp;
    public String mMsgId;
    public int mNetType;
    public int mNotificationBasicStyle;
    public int mNotificationBuilder;
    public int mOpenType;
    public String mPkgContent;
    public String mPkgName;
    public int mPkgVercode;
    public String mSupportAppname;
    public String mTitle;
    public String mUrl;
    public int mUserConfirm;

    public PublicMsg()
    {
        mPkgVercode = 0;
        mNetType = 0;
        mNotificationBuilder = 0;
        mOpenType = 0;
        mNotificationBasicStyle = 7;
        mIsSupportApp = true;
        mUserConfirm = 0;
    }

    PublicMsg(Parcel parcel)
    {
        mPkgVercode = 0;
        mNetType = 0;
        mNotificationBuilder = 0;
        mOpenType = 0;
        mNotificationBasicStyle = 7;
        mIsSupportApp = true;
        mUserConfirm = 0;
        mMsgId = parcel.readString();
        mAppId = parcel.readString();
        mTitle = parcel.readString();
        mDescription = parcel.readString();
        mUrl = parcel.readString();
        mPkgName = parcel.readString();
        mPkgVercode = parcel.readInt();
        mNotificationBuilder = parcel.readInt();
        mNotificationBasicStyle = parcel.readInt();
        mOpenType = parcel.readInt();
        mUserConfirm = parcel.readInt();
        mCustomContent = parcel.readString();
        mPkgContent = parcel.readString();
        mAdvertiseStyle = parcel.readInt();
        mAdvertiseSmallIconUrl = parcel.readString();
        mAdvertiseLargeIconUrl = parcel.readString();
        mAdvertiseClickUrl = parcel.readString();
        mAdvertiseBigPictureUrl = parcel.readString();
        mAdvertiseBigPictureClickUrl = parcel.readString();
        mAdvertiseDownloadClickUrl = parcel.readString();
        mAdvertiseDetailClickUrl = parcel.readString();
        mAdvertiseBigPictureTitle = parcel.readString();
        mAdvertiseBigPictureContent = parcel.readString();
    }

    private void addCustomContentToIntent(Intent intent)
    {
label0:
        {
            if (mCustomContent != null)
            {
                try
                {
                    JSONObject jsonobject = new JSONObject(mCustomContent);
                    String s;
                    for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); intent.putExtra(s, jsonobject.getString(s)))
                    {
                        s = (String)iterator.next();
                    }

                    break label0;
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    a.c("PublicMsg", (new StringBuilder("Custom content to JSONObject exception::")).append(intent.getMessage()).toString());
                }
            }
            return;
        }
        intent.putExtra("extra_extra_custom_content", mCustomContent);
        return;
    }

    private String getLauncherActivityName(Context context, String s)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(s);
        for (context = context.getPackageManager().queryIntentActivities(intent, 0).iterator(); context.hasNext();)
        {
            s = (ResolveInfo)context.next();
            if (((ResolveInfo) (s)).activityInfo != null)
            {
                return ((ResolveInfo) (s)).activityInfo.name;
            }
        }

        return null;
    }

    private void insertADBehavior(Context context, h h1, b b1, k k1)
    {
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1.d(h1.c());
        k1.c(f.c(h1.e));
        k1.b(h1.e);
        h1 = f.a(k1, context, h1.c());
        t.a(context, b1);
        t.a(context, h1);
        return;
        context;
        a.a("PublicMsg", "PM insert db exception");
        return;
    }

    private void insertADNotiBehavior(Context context, String s, String s1, String s2, String s3, String s4)
    {
        b b1 = new b();
        b1.g = s4;
        b1.a = s;
        b1.h = System.currentTimeMillis();
        b1.i = com.baidu.frontia.a.d.b.d(context);
        b1.c = com.baidu.android.pushservice.message.a.k.j.a();
        b1.k = s1;
        b1.d = s2;
        b1.e = s3;
        s = com.baidu.android.pushservice.c.b.a(context).b(s1);
        if (s != null)
        {
            insertADBehavior(context, s, b1, new k(s1));
            if (com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
            {
                f.a("pushadvertise:  insert user action", context);
            }
        }
    }

    private void insertBehavior(Context context, h h1, l l1, k k1)
    {
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1.d(h1.c());
        k1.c(f.c(h1.e));
        k1.b(h1.e);
        h1 = f.a(k1, context, h1.c());
        t.a(context, l1);
        t.a(context, h1);
        return;
        context;
        a.a("PublicMsg", "PM insert db exception");
        return;
    }

    private void insertNotiBehavior(Context context, String s, String s1, String s2)
    {
        l l1 = new l();
        l1.g = s2;
        l1.a = s;
        l1.h = System.currentTimeMillis();
        l1.i = com.baidu.frontia.a.d.b.d(context);
        l1.c = com.baidu.android.pushservice.message.a.k.f.a();
        l1.k = s1;
        s = com.baidu.android.pushservice.c.b.a(context).b(s1);
        if (s != null)
        {
            insertBehavior(context, s, l1, new k(s1));
        }
    }

    private void startApplicationLauncher(Context context, String s, String s1)
    {
        Intent intent;
        if (mPkgContent == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        intent = Intent.parseUri(mPkgContent, 0);
_L1:
        String s2 = getLauncherActivityName(context, s);
        if (s2 != null)
        {
            try
            {
                intent.setClassName(s, s2);
                intent.setFlags(intent.getFlags() | 0x10000000);
                intent.putExtra("open_type", 1);
                intent.putExtra("msgid", s1);
                context.startActivity(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.d("PublicMsg", (new StringBuilder("error ")).append(context.getMessage()).toString());
            }
        }
        break MISSING_BLOCK_LABEL_119;
        intent = new Intent();
          goto _L1
    }

    public int describeContents()
    {
        return 0;
    }

    public void handle(Context context, String s, String s1)
    {
        int j;
        j = 1;
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("=== Handle msg: ")).append(toString()).toString());
        }
        if ("com.baidu.pushservice.action.publicmsg.DELETE_V2".equals(s))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.b("PublicMsg", (new StringBuilder("Public msg deleted by user, title = ")).append(mTitle).toString());
            }
            sendResult(context, s1, 2);
            return;
        }
        s = context.getPackageManager();
        int i1 = s.getPackageInfo(mPkgName, 0).versionCode;
        if (i1 < mPkgVercode) goto _L2; else goto _L1
_L1:
        Intent intent;
        intent = Intent.parseUri(mPkgContent, 0);
        intent.setPackage(mPkgName);
        if (s.queryBroadcastReceivers(intent, 0).size() <= 0) goto _L4; else goto _L3
_L3:
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("Intent broadcasted to app! ===> ")).append(intent.toURI()).toString());
        }
        context.sendBroadcast(intent);
_L8:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        s = new Intent("android.intent.action.VIEW");
        s.setData(Uri.parse(mUrl));
        s.addFlags(0x10000000);
        context.startActivity(s);
_L6:
        sendResult(context, s1, j);
        return;
_L4:
        if (s.queryIntentActivities(intent, 0).size() > 0)
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.b("PublicMsg", (new StringBuilder("Intent sent to actvity! ===> ")).append(intent.toURI()).toString());
            }
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.b("PublicMsg", (new StringBuilder("No app component can deal, so start ")).append(mPkgName).append(" launcher activity!").toString());
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.d("PublicMsg", (new StringBuilder("package not exist \r\n")).append(s.getMessage()).toString());
            }
            j = 0;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.d("PublicMsg", (new StringBuilder("uri to intent fail \r\n")).append(s.getMessage()).toString());
            }
            j = 0;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.d("PublicMsg", (new StringBuilder("parse customize action error\r\n")).append(s.getMessage()).toString());
            j = 0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("Version code is too low! ===> app ver: ")).append(i1).append(", request ver:").append(mPkgVercode).toString());
        }
        j = 0;
        continue; /* Loop/switch isn't completed */
        s;
        if (com.baidu.android.pushservice.a.b())
        {
            a.d("PublicMsg", (new StringBuilder(">>> Url cann't be deal! \r\n")).append(s.getMessage()).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
        j = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void handleADNotification(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("=== Handle AD notification: ")).append(s).toString());
        }
        if (!"com.baidu.android.pushservice.action.adnotification.ADDELETE".equals(s)) goto _L2; else goto _L1
_L1:
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("AD notification deleted by user, title = ")).append(mTitle).toString());
        }
        if (com.baidu.android.pushservice.a.d > 0 && com.baidu.android.pushservice.a.d <= 5)
        {
            f.a("pushadvertise:  save delete action", context);
        }
        insertADNotiBehavior(context, s1, s2, s5, s3, "010502");
_L4:
        return;
_L2:
        int j;
        s = context.getPackageManager();
        try
        {
            j = s.getPackageInfo(mPkgName, 0).versionCode;
            if (j >= mPkgVercode)
            {
                insertADNotiBehavior(context, s1, s2, s5, s3, "010501");
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L3
_L3:
        a.d("PublicMsg", (new StringBuilder("package not exist \r\n")).append(context.getMessage()).toString());
        return;
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L5
_L5:
        a.b("PublicMsg", (new StringBuilder("Version code is too low! ===> app ver: ")).append(j).append(", request ver:").append(mPkgVercode).toString());
        return;
    }

    public void handlePrivateNotification(Context context, String s, String s1, String s2)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("=== Handle private notification: ")).append(s).toString());
        }
        if (!"com.baidu.android.pushservice.action.privatenotification.DELETE".equals(s)) goto _L2; else goto _L1
_L1:
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("private notification deleted by user, title = ")).append(mTitle).toString());
        }
        insertNotiBehavior(context, s1, s2, "010502");
_L4:
        return;
_L2:
        s = context.getPackageManager();
        int j;
        j = s.getPackageInfo(mPkgName, 0).versionCode;
        if (j >= mPkgVercode)
        {
            Intent intent = new Intent();
            intent.putExtra("notification_title", mTitle);
            intent.putExtra("notification_content", mDescription);
            addCustomContentToIntent(intent);
            f.a(context, intent, "com.baidu.android.pushservice.action.notification.CLICK", mPkgName);
            insertNotiBehavior(context, s1, s2, "010201");
            if (mOpenType == 1 && mUrl != null)
            {
                s = new Intent();
                s.setAction("android.intent.action.VIEW");
                s.setData(Uri.parse(mUrl));
                s.addFlags(0x10000000);
                context.startActivity(s);
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
        context;
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L3
_L3:
        a.d("PublicMsg", (new StringBuilder("package not exist \r\n")).append(context.getMessage()).toString());
        return;
        if (mOpenType != 2) goto _L4; else goto _L5
_L5:
        if (mPkgContent != null)
        {
            s2 = Intent.parseUri(mPkgContent, 0);
            s2.setPackage(mPkgName);
            if (s.queryBroadcastReceivers(s2, 0).size() > 0)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    a.b("PublicMsg", (new StringBuilder("Intent broadcasted to app! ===> ")).append(s2.toURI()).toString());
                }
                context.sendBroadcast(s2);
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_469;
        context;
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L6
_L6:
        a.d("PublicMsg", (new StringBuilder("uri to intent fail \r\n")).append(context.getMessage()).toString());
        return;
        if (s.queryIntentActivities(s2, 0).size() <= 0) goto _L4; else goto _L7
_L7:
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("Intent sent to actvity! ===> ")).append(s2.toURI()).toString());
        }
        s2.addFlags(0x10000000);
        s2.putExtra("open_type", 1);
        s2.putExtra("msgid", s1);
        context.startActivity(s2);
        return;
        startApplicationLauncher(context, mPkgName, s1);
        return;
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L8
_L8:
        a.b("PublicMsg", (new StringBuilder("Version code is too low! ===> app ver: ")).append(j).append(", request ver:").append(mPkgVercode).toString());
        return;
    }

    public void handleRichMediaNotification(Context context, String s, String s1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("=== Handle rich media notification: ")).append(s).append(" title = ").append(mTitle).toString());
        }
        l l1 = new l();
        if ("com.baidu.android.pushservice.action.media.DELETE".equals(s))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.b("PublicMsg", (new StringBuilder("rich media notification deleted by user, title = ")).append(mTitle).toString());
            }
            l1.g = "010402";
        } else
        {
            s = new Intent("com.baidu.android.pushservice.action.media.CLICK");
            s.setPackage(mPkgName);
            s.putExtra("public_msg", this);
            context.sendBroadcast(s);
            l1.g = "010401";
        }
        l1.a = mMsgId;
        l1.c = com.baidu.android.pushservice.message.a.k.h.a();
        l1.h = System.currentTimeMillis();
        l1.j = 0;
        l1.i = com.baidu.frontia.a.d.b.d(context);
        l1.k = s1;
        s = com.baidu.android.pushservice.c.b.a(context).b(s1);
        if (s != null)
        {
            insertBehavior(context, s, l1, new k(s1));
        }
    }

    void sendResult(Context context, String s, int j)
    {
        String s1;
        String s2;
        JSONObject jsonobject;
        s1 = ad.a().c();
        s2 = ad.a().d();
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                a.d("PublicMsg", "Fail Send Public msg result. Token invalid!");
            }
            return;
        }
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", (new StringBuilder("Send Linkhit, msgId = ")).append(s).append(", resultCode = ").append(j).toString());
        }
        jsonobject = new JSONObject();
        jsonobject.put("msgid", s);
        jsonobject.put("result_code", j);
_L2:
        context = new Thread(new com.baidu.android.pushservice.message.h(this, context, s1, s2, jsonobject.toString()));
        context.setName("PushService-linkhit");
        context.start();
        return;
        s;
        if (com.baidu.android.pushservice.a.b())
        {
            a.b("PublicMsg", s.getMessage());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String toString()
    {
        return (new StringBuilder("\r\n mMsgId = ")).append(mMsgId).append("\r\n mAppId = ").append(mAppId).append("\r\n mTitle = ").append(mTitle).append("\r\n mDescription = ").append(mDescription).append("\r\n mUrl = ").append(mUrl).append("\r\n mNetType = ").append(mNetType).append("\r\n mSupportAppname = ").append(mSupportAppname).append("\r\n mIsSupportApp = ").append(mIsSupportApp).append("\r\n mPkgName = ").append(mPkgName).append("\r\n mPlgVercode = ").append(mPkgVercode).append("\r\n mNotificationBuilder = ").append(mNotificationBuilder).append("\r\n mNotificationBasicStyle = ").append(mNotificationBasicStyle).append("\r\n mOpenType = ").append(mOpenType).append("\r\n mCustomContent = ").append(mCustomContent).append("\r\n mIntent = ").append(mPkgContent).append("AdvertiseStyle ").append(mAdvertiseStyle).append("\r\n AdvertiseBigpictureTitle ").append(mAdvertiseBigPictureTitle).append("\r\nAdvertiseBigpictureContent ").append(mAdvertiseBigPictureClickUrl).append("\r\nAdvertiseBigpictureUrl ").append(mAdvertiseBigPictureUrl).append("\r\nAdvertiseClickUrl ").append(mAdvertiseClickUrl).append("\r\nAdvertiseSamllIcon ").append(mAdvertiseSmallIconUrl).append("\r\nAdvertiseLargeIcon ").append(mAdvertiseLargeIconUrl).append("\r\nAdvertiseBigPictureUrl ").append(mAdvertiseBigPictureClickUrl).append("\r\nAdvertiseDownloadClickUrl ").append(mAdvertiseDownloadClickUrl).append("\r\nAdvertiseDetailClickUrl ").append(mAdvertiseDetailClickUrl).append("\r\n").toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(mMsgId);
        parcel.writeString(mAppId);
        parcel.writeString(mTitle);
        parcel.writeString(mDescription);
        parcel.writeString(mUrl);
        parcel.writeString(mPkgName);
        parcel.writeInt(mPkgVercode);
        parcel.writeInt(mNotificationBuilder);
        parcel.writeInt(mNotificationBasicStyle);
        parcel.writeInt(mOpenType);
        parcel.writeInt(mUserConfirm);
        parcel.writeString(mCustomContent);
        parcel.writeString(mPkgContent);
        parcel.writeInt(mAdvertiseStyle);
        parcel.writeString(mAdvertiseSmallIconUrl);
        parcel.writeString(mAdvertiseLargeIconUrl);
        parcel.writeString(mAdvertiseClickUrl);
        parcel.writeString(mAdvertiseBigPictureUrl);
        parcel.writeString(mAdvertiseBigPictureClickUrl);
        parcel.writeString(mAdvertiseDownloadClickUrl);
        parcel.writeString(mAdvertiseDetailClickUrl);
        parcel.writeString(mAdvertiseBigPictureTitle);
        parcel.writeString(mAdvertiseBigPictureContent);
    }

}
