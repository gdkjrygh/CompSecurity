// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.util.Log;
import com.android.volley.VolleyError;

public final class NonListener
    implements com.android.volley.Response.ErrorListener, com.android.volley.Response.Listener
{

    public NonListener()
    {
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        Log.w("NonListener", "Network error in non-listened request", volleyerror);
    }

    public final void onResponse(Object obj)
    {
    }
}
