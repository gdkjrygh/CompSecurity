// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiClient;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.reporting.CrashReporting;
import java.util.Map;

public class BaseApi
{

    public BaseApi()
    {
    }

    public static String a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return String.valueOf(i);
    }

    protected static void a(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!MyUser.hasAccessToken())
        {
            return;
        } else
        {
            ApiHttpClient.get(s, baseapiresponsehandler, s1);
            return;
        }
    }

    protected static void a(String s, RequestParams requestparams, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.get(s, requestparams, baseapiresponsehandler, s1);
            return;
        }
    }

    protected static void a(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.get(String.format(s, new Object[] {
                s1
            }), baseapiresponsehandler, s2);
            return;
        }
    }

    protected static void a(String s, String s1, RequestParams requestparams, BaseApiResponseHandler baseapiresponsehandler)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.put(String.format(s, new Object[] {
                s1
            }), requestparams, baseapiresponsehandler, null);
            return;
        }
    }

    protected static void a(String s, String s1, RequestParams requestparams, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.post(String.format(s, new Object[] {
                s1
            }), requestparams, baseapiresponsehandler, s2);
            return;
        }
    }

    public static void a(String s, Map map, BaseApiResponseHandler baseapiresponsehandler)
    {
        if (MyUser.hasAccessToken())
        {
            b(s, new RequestParams(map), baseapiresponsehandler, null);
            return;
        }
        try
        {
            ApiHttpClient.signedCall(s, "PUT", map, baseapiresponsehandler, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
        }
    }

    public static void a(String s, Map map, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        a(s, MyUser.hasAccessToken(), map, baseapiresponsehandler, s1);
    }

    public static void a(String s, boolean flag, Map map, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (flag)
        {
            if (map == null)
            {
                a(s, baseapiresponsehandler, s1);
                return;
            } else
            {
                a(s, new RequestParams(map), baseapiresponsehandler, s1);
                return;
            }
        }
        try
        {
            ApiHttpClient.signedCall(s, "GET", map, baseapiresponsehandler, null, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
        }
    }

    protected static void b(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.put(s, baseapiresponsehandler, s1);
            return;
        }
    }

    protected static void b(String s, RequestParams requestparams, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.put(s, requestparams, baseapiresponsehandler, s1);
            return;
        }
    }

    protected static void b(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.put(String.format(s, new Object[] {
                s1
            }), baseapiresponsehandler, s2);
            return;
        }
    }

    public static void b(String s, Map map, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (MyUser.hasAccessToken())
        {
            if (map == null)
            {
                d(s, baseapiresponsehandler, s1);
                return;
            } else
            {
                c(s, new RequestParams(map), baseapiresponsehandler, s1);
                return;
            }
        }
        try
        {
            ApiHttpClient.signedCall(s, "POST", map, baseapiresponsehandler, null, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
        }
    }

    protected static void c(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.delete(s, baseapiresponsehandler, s1);
            return;
        }
    }

    protected static void c(String s, RequestParams requestparams, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.post(s, requestparams, baseapiresponsehandler, s1);
            return;
        }
    }

    protected static void c(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.delete(String.format(s, new Object[] {
                s1
            }), baseapiresponsehandler, s2);
            return;
        }
    }

    protected static void d(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ApiClient.d())
        {
            return;
        } else
        {
            ApiHttpClient.post(s, baseapiresponsehandler, s1);
            return;
        }
    }

    public static void e(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (!ModelHelper.isValid(s))
        {
            return;
        } else
        {
            a(s, baseapiresponsehandler, s1);
            return;
        }
    }
}
