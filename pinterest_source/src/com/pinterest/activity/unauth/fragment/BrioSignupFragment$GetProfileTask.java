// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.util.Pair;
import android.widget.TextView;
import com.pinterest.base.Device;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.reporting.CrashReporting;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            BrioSignupFragment

public class activity extends BackgroundTask
{

    Activity activity;
    String names[];
    final BrioSignupFragment this$0;

    public void onFinish()
    {
        if (names != null && _userName != null)
        {
            if (names.length > 1)
            {
                _userName.setText((new StringBuilder()).append(names[0]).append(" ").append(names[1]).toString());
                BrioSignupFragment.access$002(BrioSignupFragment.this, names[0]);
                BrioSignupFragment.access$102(BrioSignupFragment.this, names[1]);
            } else
            {
                BrioSignupFragment.access$002(BrioSignupFragment.this, names[0]);
                _userName.setText(names[0]);
            }
            try
            {
                String s = Device.getDefaultEmailAddress();
                if (StringUtils.isNotEmpty(s))
                {
                    BrioSignupFragment.access$202(BrioSignupFragment.this, s);
                    _emailTv.setText(s);
                    return;
                }
            }
            catch (Exception exception)
            {
                return;
            }
        }
    }

    public void run()
    {
        if (activity != null)
        {
            Cursor cursor;
            try
            {
                cursor = activity.getContentResolver().query(android.provider.RI, null, null, null, null);
            }
            catch (SecurityException securityexception)
            {
                CrashReporting.a(securityexception);
                securityexception = null;
            }
            if (cursor != null)
            {
                if (cursor.getCount() > 0 && cursor.moveToFirst())
                {
                    Pair pair = new Pair("display_name", cursor.getString(cursor.getColumnIndex("display_name")));
                    if ("display_name".equals(pair.first) && pair.second != null && (pair.second instanceof String))
                    {
                        names = ((String)pair.second).split(" ");
                    }
                }
                cursor.close();
                return;
            }
        }
    }

    public (Activity activity1)
    {
        this$0 = BrioSignupFragment.this;
        super();
        activity = activity1;
    }
}
