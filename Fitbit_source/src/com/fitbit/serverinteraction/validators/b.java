// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;

import com.fitbit.data.bl.exceptions.ApplicationBackedOffException;
import com.fitbit.data.bl.exceptions.SearchEntityException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.serverinteraction.b.e;
import com.fitbit.serverinteraction.b.f;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction.validators:
//            a, d

public class b
    implements a
{

    public b()
    {
    }

    public void a(HttpURLConnection httpurlconnection)
        throws ApplicationBackedOffException, SearchEntityException, ServerCommunicationException, IOException
    {
        int i = httpurlconnection.getResponseCode();
        int j = i / 100;
        try
        {
            if (d.a((JSONObject)f.b().a(httpurlconnection), i))
            {
                throw new ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw new ServerCommunicationException(httpurlconnection);
        }
        if (i == 409)
        {
            throw new ServerCommunicationException(409, "Conflict");
        }
        if (i == 401)
        {
            throw new ServerCommunicationException(401, "Token expired");
        }
        if (j == 4)
        {
            throw new SearchEntityException();
        }
        if (j == 5)
        {
            throw new ServerCommunicationException();
        } else
        {
            return;
        }
    }
}
