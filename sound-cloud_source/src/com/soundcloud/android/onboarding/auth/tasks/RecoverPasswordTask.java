// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import com.soundcloud.android.api.legacy.AsyncApiTask;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public class RecoverPasswordTask extends AsyncApiTask
{

    public RecoverPasswordTask(PublicApi publicapi)
    {
        super(publicapi);
    }

    protected transient Boolean doInBackground(String as[])
    {
        as = as[0];
        int i;
        try
        {
            com.soundcloud.android.api.oauth.Token token = api.clientCredentials(new String[0]);
            as = api.post(Request.to("/passwords/reset-instructions", new Object[0]).with(new Object[] {
                "email", as
            }).usingToken(token));
            i = as.getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            warn("error requesting password reset", as);
            return Boolean.valueOf(false);
        }
        i;
        JVM INSTR lookupswitch 2: default 148
    //                   202: 122
    //                   404: 127;
           goto _L1 _L2 _L3
_L1:
        warn((new StringBuilder("unexpected status code ")).append(i).append(" received").toString());
        return Boolean.valueOf(false);
_L2:
        return Boolean.valueOf(true);
_L3:
        extractErrors(as);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }
}
