// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.facebook.messenger.MessengerUtils;
import com.facebook.messenger.ShareToMessengerParams;
import com.facebook.messenger.ShareToMessengerParamsBuilder;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

public class FacebookMessengerActivity extends Activity
{

    public static FacebookMessengerActivity a;
    public static boolean b;
    private String c;
    private String d;

    public FacebookMessengerActivity()
    {
    }

    public static boolean a(Activity activity)
    {
        while (a == null || a.isFinishing() || activity == null || activity.getTaskId() != a.getTaskId()) 
        {
            return false;
        }
        return true;
    }

    public static boolean a(String s, String s1)
    {
        if (a == null || a.isFinishing())
        {
            return false;
        } else
        {
            a.d = s;
            a.c = s1;
            return true;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(new FrameLayout(this));
        a = this;
        b = true;
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
    }

    protected void onDestroy()
    {
        a = null;
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        if (c != null && d != null)
        {
            MessengerUtils.finishShareToMessenger(this, ShareToMessengerParams.newBuilder(Uri.fromFile(new File(d)), c).build());
        }
        d = null;
        c = null;
    }
}
