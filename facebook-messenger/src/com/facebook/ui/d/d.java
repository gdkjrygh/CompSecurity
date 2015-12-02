// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.d;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.e.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.o;
import com.google.common.a.ev;

public class d
{

    private static final String a = com/facebook/ui/d/d.getSimpleName();
    private static final ev d;
    private final Context b;
    private final h c;

    public d(Context context, h h1)
    {
        b = context;
        c = h1;
    }

    public String a(int i)
    {
        if (!d.containsKey(Integer.valueOf(i)))
        {
            c.a(a, (new StringBuilder()).append("No error message for error code ").append(i).toString());
            return null;
        } else
        {
            return b.getString(((Integer)d.get(Integer.valueOf(i))).intValue());
        }
    }

    public String a(ServiceException serviceexception, boolean flag, boolean flag1)
    {
        Object obj = null;
        Object obj1 = serviceexception.a();
        if (obj1 == t.API_ERROR)
        {
            obj1 = (ApiErrorResult)serviceexception.b().i();
            serviceexception = ((ServiceException) (obj));
            if (flag)
            {
                serviceexception = a(((ApiErrorResult) (obj1)).a());
            }
            if (serviceexception == null)
            {
                serviceexception = ((ApiErrorResult) (obj1)).b();
            }
        } else
        if (obj1 == t.CONNECTION_FAILURE)
        {
            serviceexception = b.getResources().getString(o.network_error_message);
        } else
        {
            serviceexception = null;
        }
        obj = serviceexception;
        if (serviceexception == null)
        {
            obj = serviceexception;
            if (flag1)
            {
                obj = b.getString(o.generic_error_message);
            }
        }
        return ((String) (obj));
    }

    static 
    {
        d = ev.a(Integer.valueOf(506), Integer.valueOf(o.publish_duplicate_error_message), Integer.valueOf(368), Integer.valueOf(o.publish_sentry_fail), Integer.valueOf(0x189117), Integer.valueOf(o.publish_invalid_tag_error_message));
    }
}
