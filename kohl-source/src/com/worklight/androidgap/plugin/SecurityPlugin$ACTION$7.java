// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import com.worklight.common.security.AppAuthenticityToken;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;

// Referenced classes of package com.worklight.androidgap.plugin:
//            SecurityPlugin

static final class nit> extends nit>
{

    public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
    {
        try
        {
            callbackcontext.success((new AppAuthenticityToken()).a1(context, jsonarray.getString(0)));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return executeError(hashData, callbackcontext, jsonarray.getLocalizedMessage());
        }
        return true;
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
