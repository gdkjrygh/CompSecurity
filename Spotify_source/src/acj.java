// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.adjust.sdk.LogLevel;

public final class acj
{

    Context a;
    String b;
    String c;
    public LogLevel d;
    Boolean e;
    public String f;
    public long g;

    public acj(Context context, String s, String s1)
    {
        boolean flag2 = true;
        super();
        act act1 = acl.a();
        boolean flag;
        if (s.length() != 12)
        {
            act1.e("Malformed App Token '%s'", new Object[] {
                s
            });
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            flag = false;
        } else
        {
            act act2 = acl.a();
            if (s1.equals("sandbox"))
            {
                act2.f("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
                flag = true;
            } else
            if (s1.equals("production"))
            {
                act2.f("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
                flag = true;
            } else
            {
                act2.e("Unknown environment '%s'", new Object[] {
                    s1
                });
                flag = false;
            }
            if (!flag)
            {
                flag = false;
            } else
            {
                act act3 = acl.a();
                boolean flag1;
                if (context == null)
                {
                    act3.e("Missing context", new Object[0]);
                    flag1 = false;
                } else
                if (!adf.a(context, "android.permission.INTERNET"))
                {
                    act3.e("Missing permission: INTERNET", new Object[0]);
                    flag1 = false;
                } else
                {
                    flag1 = true;
                }
                flag = flag2;
                if (!flag1)
                {
                    flag = false;
                }
            }
        }
        if (!flag)
        {
            return;
        } else
        {
            a = context.getApplicationContext();
            b = s;
            c = s1;
            d = LogLevel.a;
            e = Boolean.valueOf(false);
            return;
        }
    }
}
