// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.operation;

import Bt;
import CN;
import CQ;
import DK;
import DL;
import IC;
import LY;
import MA;
import Mf;
import Pj;
import android.content.Intent;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.api2.framework.HttpMethod;
import com.snapchat.android.camera.CameraFragment;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.scan.ScannableData_Factory;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.emoji.Emoji;
import com.squareup.otto.Bus;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import mA;
import org.json.JSONArray;
import org.json.JSONObject;
import pi;
import pn;

public class ScannableOperation extends CQ
{
    public static final class SCAN_CODE_TYPE extends Enum
    {

        private static final SCAN_CODE_TYPE $VALUES[];
        public static final SCAN_CODE_TYPE SNAPCODE;

        public static SCAN_CODE_TYPE valueOf(String s)
        {
            return (SCAN_CODE_TYPE)Enum.valueOf(com/snapchat/android/operation/ScannableOperation$SCAN_CODE_TYPE, s);
        }

        public static SCAN_CODE_TYPE[] values()
        {
            return (SCAN_CODE_TYPE[])$VALUES.clone();
        }

        static 
        {
            SNAPCODE = new SCAN_CODE_TYPE("SNAPCODE");
            $VALUES = (new SCAN_CODE_TYPE[] {
                SNAPCODE
            });
        }

        private SCAN_CODE_TYPE(String s)
        {
            super(s, 0);
        }
    }


    private static final String a = com/snapchat/android/operation/ScannableOperation.getSimpleName();
    private SCAN_CODE_TYPE b;
    private String c;
    private CN d;

    public ScannableOperation(Intent intent)
    {
        super(intent);
        b = (SCAN_CODE_TYPE)intent.getSerializableExtra("scanType");
        c = intent.getStringExtra("scanData");
        d = new CN("SCANNABLE_ACTION_PRESENTED", c, b.name(), b.name(), intent.getStringExtra("scanSource"), "camera");
        Timber.c(a, (new StringBuilder("Scannable type - ")).append(b).append(" data - ").append(c).toString(), new Object[0]);
    }

    private void a(pi pi1)
    {
        String s = (new JSONObject(pi1.d())).getString("error_display_text");
        pi1 = s;
_L2:
        Object obj = pi1;
        if (TextUtils.isEmpty(pi1))
        {
            obj = IC.a(null, 0x7f080235, new Object[0]);
        }
        d.a = "SCANNABLE_ACTION_API_FAILURE";
        d.a("reason", ((String) (obj)));
        Mf.a().a(new MA(CameraFragment.E(), ((String) (obj)), d, (byte)0));
        return;
        Exception exception;
        exception;
        Timber.e(a, (new StringBuilder("Server response is not successful: ")).append(pi1.toString()).toString(), new Object[0]);
        pi1 = IC.a(null, 0x7f080235, new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Map getHeaders(pn pn)
    {
        pn = new TreeMap();
        if (ReleaseManager.f())
        {
            pn.put("X-Snapchat-UUID", Pj.c());
        }
        pn.put("User-Agent", Pj.a());
        pn.put("Accept-Language", Pj.b());
        pn.put("Accept-Locale", Locale.getDefault().toString());
        String s = String.valueOf(System.currentTimeMillis());
        String s1 = mA.a(s);
        String s2 = Bt.q();
        pn.put("req_token", s1);
        pn.put("timestamp", s);
        pn.put("username", s2);
        return pn;
    }

    public HttpMethod getMethod()
    {
        return HttpMethod.GET;
    }

    protected String getPath()
    {
        return (new StringBuilder("/scannables/")).append(b).append("/").append(c).append("/actions").toString();
    }

    public pn getRequestPayload()
    {
        return null;
    }

    public void onResult(pi pi1)
    {
        Object obj;
        super.onResult(pi1);
        if (!pi1.c())
        {
            a(pi1);
            return;
        }
        JSONObject jsonobject;
        try
        {
            obj = new JSONObject(pi1.d());
            Timber.c(a, (new StringBuilder("get response: ")).append(((JSONObject) (obj)).toString()).toString(), new Object[0]);
            obj = ((JSONObject) (obj)).getJSONArray("scannable_actions");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Timber.e(a, (new StringBuilder("Error parsing server response: ")).append(pi1.d().toString()).toString(), new Object[0]);
            a(pi1);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        if (((JSONArray) (obj)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        jsonobject = ((JSONArray) (obj)).getJSONObject(0);
        obj = (String)jsonobject.get("type");
        Timber.c(a, (new StringBuilder("Receive response type: ")).append(((String) (obj))).toString(), new Object[0]);
        jsonobject = new JSONObject((String)jsonobject.get("data"));
        d.a("action", ((String) (obj)));
        obj = ScannableData_Factory.INSTANCE.create(((String) (obj)), jsonobject);
        if (!((DK) (obj)).d)
        {
            a(pi1);
            return;
        }
        if (!(obj instanceof DL))
        {
            break MISSING_BLOCK_LABEL_419;
        }
        obj = (DL)obj;
        if (Bt.q().equals(((DL) (obj)).e))
        {
            d.a = "SCANNABLE_ACTION_API_FAILURE";
            d.a("reason", "Add self");
            Mf.a().a(new MA(CameraFragment.E(), com.snapchat.android.notification.ScanNotificationItemAddFriend.SnapcodeNotificationSteps.SHOW_PROFILE_INFO, LY.a(Emoji.SMIRKING_FACE).toString(), null, d));
            return;
        }
        if (FriendManager.e().a(((DL) (obj)).e) != null)
        {
            d.a = "SCANNABLE_ACTION_API_FAILURE";
            d.a("reason", "Add toasted-friend");
            Mf.a().a(new MA(CameraFragment.E(), com.snapchat.android.notification.ScanNotificationItemAddFriend.SnapcodeNotificationSteps.SHOW_PROFILE_INFO, (new StringBuilder()).append(((DL) (obj)).e).append(" is already your friend!").append(LY.a(Emoji.SEE_NO_EVIL_MONKEY).toString()).toString(), null, d));
            return;
        }
        Mf.a().a(new MA(CameraFragment.E(), com.snapchat.android.notification.ScanNotificationItemAddFriend.SnapcodeNotificationSteps.SHOW_PROFILE_INFO, null, ((DL) (obj)).e, d));
        return;
        Mf.a().a(new MA(CameraFragment.E(), ((DK) (obj)), d));
        return;
        a(pi1);
        return;
    }

}
