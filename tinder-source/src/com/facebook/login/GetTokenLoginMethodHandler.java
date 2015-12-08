// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.i;
import com.facebook.internal.j;
import com.facebook.internal.m;
import com.facebook.internal.n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginClient, a

class GetTokenLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new GetTokenLoginMethodHandler(parcel);
        }

        public final volatile Object[] newArray(int k)
        {
            return new GetTokenLoginMethodHandler[k];
        }

    };
    private a c;

    GetTokenLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    final String a()
    {
        return "get_token";
    }

    final void a(LoginClient.Request request, Bundle bundle)
    {
        if (c != null)
        {
            c.b = null;
        }
        c = null;
        LoginClient loginclient = b;
        if (loginclient.e != null)
        {
            loginclient.e.b();
        }
        if (bundle != null)
        {
            Object obj = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object obj1 = request.b;
            if (obj != null && (obj1 == null || ((ArrayList) (obj)).containsAll(((java.util.Collection) (obj1)))))
            {
                obj = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (obj == null || ((String) (obj)).isEmpty())
                {
                    b.e();
                    m.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new com.facebook.internal.m.c(bundle, request) {

                        final Bundle a;
                        final LoginClient.Request b;
                        final GetTokenLoginMethodHandler c;

                        public final void a(FacebookException facebookexception)
                        {
                            c.b.b(LoginClient.Result.a(c.b.g, "Caught exception", facebookexception.getMessage()));
                        }

                        public final void a(JSONObject jsonobject)
                        {
                            try
                            {
                                jsonobject = jsonobject.getString("id");
                                a.putString("com.facebook.platform.extra.USER_ID", jsonobject);
                                c.b(b, a);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (JSONObject jsonobject)
                            {
                                c.b.b(LoginClient.Result.a(c.b.g, "Caught exception", jsonobject.getMessage()));
                            }
                        }

            
            {
                c = GetTokenLoginMethodHandler.this;
                a = bundle;
                b = request;
                super();
            }
                    });
                    return;
                } else
                {
                    b(request, bundle);
                    return;
                }
            }
            bundle = new HashSet();
            obj1 = ((Set) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj1)).next();
                if (!((ArrayList) (obj)).contains(s))
                {
                    bundle.add(s);
                }
            } while (true);
            if (!bundle.isEmpty())
            {
                a("new_permissions", TextUtils.join(",", bundle));
            }
            n.a(bundle, "permissions");
            request.b = bundle;
        }
        b.d();
    }

    final boolean a(LoginClient.Request request)
    {
        c = new a(b.c.getActivity(), request.d);
        a a1 = c;
        boolean flag;
        if (((j) (a1)).c)
        {
            flag = false;
        } else
        if (i.a(((j) (a1)).e) == -1)
        {
            flag = false;
        } else
        {
            android.content.Intent intent = i.a(((j) (a1)).a);
            if (intent == null)
            {
                flag = false;
            } else
            {
                a1.c = true;
                ((j) (a1)).a.bindService(intent, a1, 1);
                flag = true;
            }
        }
        if (!flag)
        {
            return false;
        } else
        {
            b.e();
            request = new com.facebook.internal.j.a(request) {

                final LoginClient.Request a;
                final GetTokenLoginMethodHandler b;

                public final void a(Bundle bundle)
                {
                    b.a(a, bundle);
                }

            
            {
                b = GetTokenLoginMethodHandler.this;
                a = request;
                super();
            }
            };
            c.b = request;
            return true;
        }
    }

    final void b()
    {
        if (c != null)
        {
            c.c = false;
            c.b = null;
            c = null;
        }
    }

    final void b(LoginClient.Request request, Bundle bundle)
    {
        Object obj = null;
        AccessTokenSource accesstokensource = AccessTokenSource.d;
        request = request.d;
        Date date = m.a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String s = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (m.a(s))
        {
            request = obj;
        } else
        {
            request = new AccessToken(s, request, bundle.getString("com.facebook.platform.extra.USER_ID"), arraylist, null, accesstokensource, date, new Date());
        }
        request = LoginClient.Result.a(b.g, request);
        b.a(request);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        super.writeToParcel(parcel, k);
    }

}
