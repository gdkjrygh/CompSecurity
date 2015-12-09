// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.b;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;

// Referenced classes of package com.fitbit.serverinteraction.b:
//            g

public class c extends g
{

    public c()
    {
    }

    public boolean S_()
    {
        return false;
    }

    public JsonParser a(InputStream inputstream, String s)
        throws JSONException, ServerCommunicationException
    {
        try
        {
            inputstream = (new JsonFactory()).a(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new ServerCommunicationException("Could not parse JSON", inputstream);
        }
        return inputstream;
    }

    public Object b(InputStream inputstream, String s)
        throws Throwable, ServerCommunicationException
    {
        return a(inputstream, s);
    }
}
