// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.i;
import com.facebook.internal.l;
import com.facebook.internal.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginClient, d

class KatanaProxyLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        public final volatile Object[] newArray(int j)
        {
            return new KatanaProxyLoginMethodHandler[j];
        }

    };

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
        Object obj = null;
        intent = intent.getExtras();
        String s = a(((Bundle) (intent)));
        String s1 = intent.getString("error_code");
        String s2 = b(intent);
        String s3 = intent.getString("e2e");
        if (!m.a(s3))
        {
            a(s3);
        }
        if (s == null && s1 == null && s2 == null)
        {
            try
            {
                intent = LoginClient.Result.a(request, a(((Collection) (request.b)), ((Bundle) (intent)), AccessTokenSource.b, request.d));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return LoginClient.Result.a(request, null, intent.getMessage());
            }
        } else
        {
            intent = obj;
            if (!l.a.contains(s))
            {
                if (l.b.contains(s))
                {
                    return LoginClient.Result.a(request, null);
                } else
                {
                    return LoginClient.Result.a(request, s, s2, s1);
                }
            }
        }
        return intent;
    }

    private static String a(Bundle bundle)
    {
        String s1 = bundle.getString("error");
        String s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_type");
        }
        return s;
    }

    private boolean a(Intent intent, int j)
    {
        if (intent == null)
        {
            return false;
        }
        try
        {
            b.c.startActivityForResult(intent, j);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return false;
        }
        return true;
    }

    private static String b(Bundle bundle)
    {
        String s1 = bundle.getString("error_message");
        String s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_description");
        }
        return s;
    }

    final String a()
    {
        return "katana_proxy_auth";
    }

    final boolean a(int j, Intent intent)
    {
        LoginClient.Request request = b.g;
        if (intent == null)
        {
            intent = LoginClient.Result.a(request, "Operation canceled");
        } else
        if (j == 0)
        {
            intent = intent.getExtras();
            String s = a(((Bundle) (intent)));
            String s1 = intent.getString("error_code");
            if ("CONNECTION_FAILURE".equals(s1))
            {
                intent = LoginClient.Result.a(request, s, b(intent), s1);
            } else
            {
                intent = LoginClient.Result.a(request, s);
            }
        } else
        if (j != -1)
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
            b.d();
        }
        return true;
    }

    final boolean a(LoginClient.Request request)
    {
        String s;
        android.support.v4.app.i j;
        String s1;
        Set set;
        Iterator iterator;
        boolean flag1;
        s = LoginClient.f();
        j = b.c.getActivity();
        s1 = request.d;
        set = request.b;
        flag1 = request.f;
        iterator = request.b.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!d.a((String)iterator.next())) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        request = i.a(j, s1, set, s, flag1, flag, request.c);
        a("e2e", s);
        return a(((Intent) (request)), LoginClient.a());
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        super.writeToParcel(parcel, j);
    }

}
