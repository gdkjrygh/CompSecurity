// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;

import android.util.Pair;
import com.fitbit.data.bl.exceptions.ApplicationBackedOffException;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerValidationException;
import com.fitbit.data.bl.exceptions.SignupException;
import com.fitbit.serverinteraction.b.f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction.validators:
//            a, d

class e
    implements a
{

    e()
    {
    }

    protected int a(JSONObject jsonobject)
    {
        String s = jsonobject.optString("fieldName");
        jsonobject = jsonobject.optString("errorType");
        if (s != null && s.equals("email"))
        {
            return 1;
        }
        if (s != null && s.equals("n/a") && jsonobject != null && jsonobject.equals("request"))
        {
            return 2;
        }
        if (s != null && s.equals("birthday"))
        {
            return 4;
        }
        return jsonobject == null || !jsonobject.equals("oauth") ? 0 : 5;
    }

    public void a(HttpURLConnection httpurlconnection)
        throws ApplicationBackedOffException, ServerCommunicationException, SignupException, ServerValidationException, IOException
    {
        Object obj;
        JSONObject jsonobject;
        int i;
        int j = httpurlconnection.getResponseCode();
        i = j / 100;
        if (i != 4 && i != 5)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = d.a(httpurlconnection);
        if (obj != null)
        {
            throw obj;
        }
        try
        {
            httpurlconnection = ((JSONObject)f.b().a(httpurlconnection)).getJSONArray("errors");
            obj = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw new SignupException(Collections.singletonList(new Pair(Integer.valueOf(3), httpurlconnection.getMessage())));
        }
        i = 0;
_L2:
        if (i >= httpurlconnection.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = httpurlconnection.getJSONObject(i);
        if (d.a(jsonobject, j))
        {
            throw new ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
        }
        if (d.a(jsonobject))
        {
            throw new IncorrectTimestampException();
        }
        ((List) (obj)).add(new Pair(Integer.valueOf(a(jsonobject)), jsonobject.getString("message")));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throw new SignupException(((List) (obj)));
    }
}
