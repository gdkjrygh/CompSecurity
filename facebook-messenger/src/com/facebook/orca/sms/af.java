// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.orca.sms:
//            ag

public class af
{

    private final av a;
    private final Context b;
    private final PackageManager c;
    private final f d = new ag(this);

    public af(Context context, av av1, PackageManager packagemanager, d d1)
    {
        b = context;
        a = av1;
        c = packagemanager;
        d1.a(d);
    }

    private String e()
    {
        ResolveInfo resolveinfo = c.resolveActivity(new Intent("android.intent.action.SENDTO", (new android.net.Uri.Builder()).scheme("smsto").build()), 0x10000);
        if (resolveinfo == null)
        {
            return null;
        } else
        {
            return resolveinfo.activityInfo.packageName;
        }
    }

    public void a()
    {
        a.b(new cb("mms_received"));
    }

    public void a(int i)
    {
        a.b((new cb("sms_sent_not_in_app")).a("num", i));
    }

    public void a(int i, boolean flag)
    {
        a.b((new cb("sms_tcreate")).a("num_users", i).a("success", flag));
    }

    public void a(String s)
    {
        a.b((new cb("sms_send_timeout")).b("thread_id", s));
    }

    public void a(String s, int i)
    {
        a.b((new cb("sms_delivered")).b("thread_id", s).a("resultCode", i));
    }

    public void a(String s, int i, int j, String s1, boolean flag, String s2)
    {
        a.b((new cb("mms_sent")).b("thread_id", s).a("attachNum", j).b("attachType", s1).a("numUsers", i).a("success", flag).b("trigger", s2));
    }

    public void a(String s, int i, boolean flag, String s1)
    {
        a.b((new cb("mms_sent")).b("thread_id", s).a("numUsers", i).a("success", flag).b("trigger", s1));
    }

    public void a(String s, long l, boolean flag)
    {
        a.b((new cb("mms_received_downloaded")).b("thread_id", s).a("message_id", l).a("success", flag));
    }

    public void a(String s, boolean flag)
    {
        a.b((new cb("sms_received")).b("thread_id", s).a("success", flag));
    }

    public void a(String s, boolean flag, int i, String s1)
    {
        a.b((new cb("sms_sent")).b("thread_id", s).a("success", flag).a("resultCode", i).b("trigger", s1));
    }

    public void a(boolean flag)
    {
        a.b((new cb("sms_enabled_during_nux")).a("enabled", flag));
    }

    public void a(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        a.b((new cb("sms_feature")).a("beta_enabled", flag).a("beta_enabled_set", flag1).a("alerts_enabled", flag2).a("alerts_enabled_set", flag3));
    }

    public void b()
    {
        String s = e();
        av av1 = a;
        cb cb1 = (new cb("sms_default_app")).a("is_default", b.getPackageName().equals(s));
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        av1.b(cb1.a("has_default", flag));
    }

    public void b(int i)
    {
        a.b((new cb("mms_sent_not_in_app")).a("num", i));
    }

    public void b(String s)
    {
        a.b((new cb("sms_received_by_content_observer")).b("thread_id", s));
    }

    public void b(String s, boolean flag)
    {
        a.b((new cb("sms_tdelete")).b("thread_id", s).a("success", flag));
    }

    public void b(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        a.b((new cb("sms_nux_shown")).a("is_upgrading_user", flag).a("is_forced_on_user", flag1).a("is_ansible_user", flag2).a("is_send_cliff_disabled", flag3));
    }

    public void c()
    {
        a.b(new cb("sms_enabled_during_background_login"));
    }

    public void c(int i)
    {
        a.b((new cb("sms_received_not_in_app")).a("num", i));
    }

    public void c(String s, boolean flag)
    {
        a.b((new cb("sms_mdelete")).b("message_id", s).a("success", flag));
    }

    public void d()
    {
        a.b(new cb("sms_learn_more_nux_shown"));
    }

    public void d(int i)
    {
        a.b((new cb("mms_received_not_in_app")).a("num", i));
    }
}
