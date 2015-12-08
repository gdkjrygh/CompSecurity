// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.b.aa;
import com.facebook.b.ak;
import com.facebook.b.al;
import com.facebook.j;
import com.facebook.m;
import java.util.Collection;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, f, LoginClient

class KatanaProxyLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new f();

    KatanaProxyLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    private LoginClient.Result a(LoginClient.Request request, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("error");
        intent = s;
        if (s == null)
        {
            intent = bundle.getString("error_type");
        }
        String s2 = bundle.getString("error_code");
        String s1 = bundle.getString("error_message");
        s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_description");
        }
        s1 = bundle.getString("e2e");
        if (!al.a(s1))
        {
            a(s1);
        }
        if (intent == null && s2 == null && s == null)
        {
            try
            {
                intent = LoginClient.Result.a(request, a(((Collection) (request.a())), bundle, j.b, request.d()));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return LoginClient.Result.a(request, null, intent.getMessage());
            }
            return intent;
        }
        if (ak.a.contains(intent))
        {
            return null;
        }
        if (ak.b.contains(intent))
        {
            return LoginClient.Result.a(request, null);
        } else
        {
            return LoginClient.Result.a(request, intent, s, s2);
        }
    }

    String a()
    {
        return "katana_proxy_auth";
    }

    boolean a(int i, int k, Intent intent)
    {
        LoginClient.Request request = b.c();
        if (intent == null)
        {
            intent = LoginClient.Result.a(request, "Operation canceled");
        } else
        if (k == 0)
        {
            intent = LoginClient.Result.a(request, intent.getStringExtra("error"));
        } else
        if (k != -1)
        {
            intent = LoginClient.Result.a(request, "Unexpected resultCode from authorization.", null);
        } else
        {
            intent = a(request, intent);
        }
        if (intent != null)
        {
            b.a(intent);
        } else
        {
            b.h();
        }
        return true;
    }

    protected boolean a(Intent intent, int i)
    {
        if (intent == null)
        {
            return false;
        }
        try
        {
            b.a().a(intent, i);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return false;
        }
        return true;
    }

    boolean a(LoginClient.Request request)
    {
        String s = LoginClient.l();
        request = aa.a(b.b(), request.d(), request.a(), s, request.f(), request.g(), request.c());
        a("e2e", s);
        return a(((Intent) (request)), LoginClient.d());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
    }

}
