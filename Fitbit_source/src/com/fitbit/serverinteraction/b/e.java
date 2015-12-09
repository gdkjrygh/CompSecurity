// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.b;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerResponseException;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction.b:
//            a

public class e extends a
{

    public e()
    {
    }

    public JSONObject a(InputStream inputstream, String s)
        throws JSONException, ServerCommunicationException
    {
        try
        {
            inputstream = super.c(inputstream, s);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new ServerCommunicationException("Could not parse Response", inputstream);
        }
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new ServerCommunicationException("No Response");
        inputstream = new JSONObject(inputstream);
        a(((JSONObject) (inputstream)));
        return inputstream;
    }

    protected void a(JSONObject jsonobject)
        throws JSONException, ServerResponseException
    {
        Object obj = null;
        if (jsonobject.has("MESSAGES"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONArray("MESSAGES").getJSONObject(0);
            com.fitbit.data.bl.exceptions.ServerResponseException.ErrorCode errorcode;
            com.fitbit.data.bl.exceptions.ServerResponseException.ErrorType errortype;
            if (jsonobject1.has("message"))
            {
                jsonobject = jsonobject1.getString("code");
            } else
            {
                jsonobject = null;
            }
            errorcode = com.fitbit.data.bl.exceptions.ServerResponseException.ErrorCode.a(jsonobject, com.fitbit.data.bl.exceptions.ServerResponseException.ErrorCode.f);
            if (jsonobject1.has("type"))
            {
                jsonobject = jsonobject1.getString("type");
            } else
            {
                jsonobject = null;
            }
            errortype = com.fitbit.data.bl.exceptions.ServerResponseException.ErrorType.a(jsonobject, com.fitbit.data.bl.exceptions.ServerResponseException.ErrorType.b);
            jsonobject = obj;
            if (jsonobject1.has("message"))
            {
                jsonobject = jsonobject1.getString("message");
            }
            throw new ServerResponseException(errorcode, errortype, jsonobject);
        } else
        {
            return;
        }
    }

    public Object b(InputStream inputstream, String s)
        throws Throwable, ServerCommunicationException
    {
        return a(inputstream, s);
    }
}
