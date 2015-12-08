// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.g;
import com.facebook.internal.am;
import com.facebook.internal.av;
import com.facebook.internal.aw;
import com.facebook.l;
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
        if (!aw.a(s1))
        {
            a(s1);
        }
        if (intent == null && s2 == null && s == null)
        {
            try
            {
                intent = LoginClient.Result.a(request, a(((Collection) (request.a())), bundle, g.b, request.d()));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return LoginClient.Result.a(request, null, intent.getMessage());
            }
            return intent;
        }
        if (av.a.contains(intent))
        {
            return null;
        }
        if (av.b.contains(intent))
        {
            return LoginClient.Result.a(request, null);
        } else
        {
            return LoginClient.Result.a(request, intent, s, s2);
        }
    }

    private boolean a(Intent intent, int i)
    {
        if (intent == null)
        {
            return false;
        }
        try
        {
            b.c.startActivityForResult(intent, i);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return false;
        }
        return true;
    }

    final String a()
    {
        return "katana_proxy_auth";
    }

    final boolean a(int i, Intent intent)
    {
        LoginClient.Request request = b.g;
        if (intent == null)
        {
            intent = LoginClient.Result.a(request, "Operation canceled");
        } else
        if (i == 0)
        {
            intent = LoginClient.Result.a(request, intent.getStringExtra("error"));
        } else
        if (i != -1)
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
            b.c();
        }
        return true;
    }

    final boolean a(LoginClient.Request request)
    {
        String s = LoginClient.e();
        request = am.a(b.c.getActivity(), request.d(), request.a(), s, request.f(), request.c());
        a("e2e", s);
        return a(((Intent) (request)), LoginClient.a());
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
