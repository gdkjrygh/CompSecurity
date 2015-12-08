// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.content.Intent;

// Referenced classes of package com.android.volley:
//            VolleyError, NetworkResponse

public class AuthFailureError extends VolleyError
{

    private Intent c;

    public AuthFailureError()
    {
    }

    public AuthFailureError(NetworkResponse networkresponse)
    {
        super(networkresponse);
    }

    public String getMessage()
    {
        if (c != null)
        {
            return "User needs to (re)enter credentials.";
        } else
        {
            return super.getMessage();
        }
    }
}
