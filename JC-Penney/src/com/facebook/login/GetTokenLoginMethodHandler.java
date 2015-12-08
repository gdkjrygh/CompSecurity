// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.b.al;
import com.facebook.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, e, LoginClient, b, 
//            c, d

class GetTokenLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private b c;

    GetTokenLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    String a()
    {
        return "get_token";
    }

    void a(LoginClient.Request request, Bundle bundle)
    {
        c = null;
        b.k();
        if (bundle != null)
        {
            ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object obj = request.a();
            if (arraylist != null && (obj == null || arraylist.containsAll(((java.util.Collection) (obj)))))
            {
                c(request, bundle);
                return;
            }
            bundle = new HashSet();
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                if (!arraylist.contains(s))
                {
                    bundle.add(s);
                }
            } while (true);
            if (!bundle.isEmpty())
            {
                a("new_permissions", TextUtils.join(",", bundle));
            }
            request.a(bundle);
        }
        b.h();
    }

    boolean a(LoginClient.Request request)
    {
        c = new b(b.b(), request.d());
        if (!c.a())
        {
            return false;
        } else
        {
            b.j();
            request = new c(this, request);
            c.a(request);
            return true;
        }
    }

    void b()
    {
        if (c != null)
        {
            c.b();
            c = null;
        }
    }

    void b(LoginClient.Request request, Bundle bundle)
    {
        request = a(bundle, j.d, request.d());
        request = LoginClient.Result.a(b.c(), request);
        b.a(request);
    }

    void c(LoginClient.Request request, Bundle bundle)
    {
        String s = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (s == null || s.isEmpty())
        {
            b.j();
            al.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new d(this, bundle, request));
            return;
        } else
        {
            b(request, bundle);
            return;
        }
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
