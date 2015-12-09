// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.l;
import com.jcp.e.ae;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.Profile;
import java.util.Map;

// Referenced classes of package com.jcp.util:
//            ag, au

public final class af
{

    private static af a;
    private static SharedPreferences b;

    private af(Context context)
    {
        b = context.getSharedPreferences("com.jcp.activities", 0);
    }

    public static af a(Context context)
    {
        if (context == null)
        {
            throw new Exception("Need context to initialize the instance");
        }
        if (a == null)
        {
            a = new af(context);
        }
        return a;
    }

    public static void a(Context context, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        String s;
label0:
        {
            if (context != null)
            {
                s = context.getResources().getString(0x7f0701bb);
                if (errormessageentitycontainer == null || !"SRV_INVALID_CAPTCHA_REQUEST".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
                {
                    break label0;
                }
                au.a(context, s, errormessageentitycontainer.getErrorMessage(), new ag(context));
            }
            return;
        }
        au.a(context, s, errormessageentitycontainer);
    }

    private void a(String s, ae ae, Map map, Context context, int i)
    {
        context = new l(context);
        context.a(ae);
        context.a(s, map, i);
    }

    private void b(String s, ae ae, Map map, Context context, int i)
    {
        context = new l(context);
        context.a(ae);
        context.b(s, map, i);
    }

    public void a()
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.clear();
        editor.putBoolean("Login", false);
        editor.putBoolean("keep_me_signin", false);
        editor.commit();
    }

    public void a(ae ae, Profile profile, Context context, boolean flag)
    {
        a(ae, ad.a(profile.getUsername(), profile.getPassword()), context, flag);
    }

    public void a(ae ae, Map map, Context context)
    {
        a(com.jcp.b.b.z(), ae, map, context, 2);
    }

    public void a(ae ae, Map map, Context context, boolean flag)
    {
        if (flag)
        {
            a(com.jcp.b.b.y(), ae, map, context, 1);
            return;
        } else
        {
            a(com.jcp.b.b.x(), ae, map, context, 1);
            return;
        }
    }

    public void a(GetAccountResponse getaccountresponse)
    {
        if (getaccountresponse == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = b.edit();
            editor.putString("userID", getaccountresponse.getId());
            editor.putString("firstName", getaccountresponse.getFirstName());
            editor.putString("lastName", getaccountresponse.getLastName());
            editor.putString("email", getaccountresponse.getEmail());
            editor.commit();
            return;
        }
    }

    public void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("Login", flag);
        editor.commit();
    }

    public void a(boolean flag, boolean flag1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("Login", flag);
        editor.putBoolean("keep_me_signin", flag1);
        editor.commit();
    }

    public void b(ae ae, Map map, Context context)
    {
        b(com.jcp.b.b.z(), ae, map, context, 2);
    }

    public void b(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("rewards_linked_status", flag);
        editor.commit();
    }

    public boolean b()
    {
        return b.getBoolean("keep_me_signin", false);
    }

    public boolean c()
    {
        return b.getBoolean("Login", false);
    }

    public boolean d()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c())
        {
            flag = flag1;
            if (b.getBoolean("rewards_linked_status", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    public String e()
    {
        return b.getString("userID", "");
    }

    public String f()
    {
        return b.getString("firstName", "");
    }
}
