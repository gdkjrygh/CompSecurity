// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.bt;
import com.vungle.publisher.bv;
import com.vungle.publisher.db.model.LoggedException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            BaseJsonArray

public class ReportExceptions extends BaseJsonArray
{
    public static class Factory
    {

        public Provider a;

        Factory()
        {
        }
    }


    public List a;
    bt b;
    bv c;

    public ReportExceptions()
    {
    }

    public final JSONArray a()
        throws JSONException
    {
        JSONArray jsonarray1 = super.a();
        JSONObject jsonobject;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray1.put(jsonobject))
        {
            LoggedException loggedexception = (LoggedException)iterator.next();
            jsonobject = new JSONObject();
            JSONObject jsonobject1 = new JSONObject();
            String as[] = loggedexception.b;
            JSONArray jsonarray = null;
            if (as != null)
            {
                jsonarray = new JSONArray(Arrays.asList(as));
            }
            jsonobject.putOpt("code", Integer.valueOf(loggedexception.c));
            jsonobject.putOpt("timestamp", Long.valueOf(loggedexception.a));
            jsonobject.putOpt("stack_trace", jsonarray);
            jsonobject.putOpt("tag", loggedexception.d);
            jsonobject.putOpt("log_message", loggedexception.e);
            jsonobject.putOpt("exception_class", loggedexception.f);
            jsonobject.putOpt("platform", "android");
            jsonobject.putOpt("model", b.m());
            jsonobject.putOpt("os_version", loggedexception.g);
            jsonobject.putOpt("sdk_version", loggedexception.h);
            jsonobject.putOpt("app_id", c.b());
            jsonobject1.putOpt("play_services_version", loggedexception.i);
            jsonobject.putOpt("platform_specific", jsonobject1);
        }

        return jsonarray1;
    }

    public final Object b()
        throws JSONException
    {
        return a();
    }
}
