// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Bundle;
import android.util.Log;
import com.facebook.fbservice.c.c;
import com.facebook.http.b.ax;
import com.facebook.http.protocol.e;

// Referenced classes of package com.facebook.fbservice.service:
//            t

public class u
{

    public u()
    {
    }

    public static t a(Throwable throwable)
    {
        if (ax.a(throwable))
        {
            return t.HTTP_400_AUTHENTICATION;
        }
        if (ax.b(throwable))
        {
            return t.HTTP_400_OTHER;
        }
        if (ax.c(throwable))
        {
            return t.HTTP_500_CLASS;
        }
        if (throwable instanceof e)
        {
            return t.API_ERROR;
        }
        if (ax.d(throwable))
        {
            return t.CONNECTION_FAILURE;
        }
        if (ax.e(throwable))
        {
            return t.OUT_OF_MEMORY;
        } else
        {
            return t.OTHER;
        }
    }

    public static Bundle b(Throwable throwable)
    {
        Bundle bundle = new Bundle();
        bundle.putString("originalExceptionMessage", throwable.getMessage());
        bundle.putString("originalExceptionStack", Log.getStackTraceString(throwable));
        if (throwable instanceof c)
        {
            bundle.putParcelable("result", ((c)throwable).a());
        }
        return bundle;
    }
}
