// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;

import android.content.Intent;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ApplicationBackedOffException;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.MobileTrackBackOffException;
import com.fitbit.data.bl.exceptions.NotLinkedTrackerException;
import com.fitbit.data.bl.exceptions.RateLimitException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerResponseException;
import com.fitbit.data.bl.exceptions.ServerValidationException;
import com.fitbit.data.bl.exceptions.SynclairBackOffException;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.q;
import com.fitbit.serverinteraction.t;
import com.fitbit.util.z;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.EnumSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction.validators:
//            a, d

public class FitbitResponseValidator
    implements com.fitbit.serverinteraction.validators.a
{
    public static final class FitbitServerError extends Enum
    {

        public static final FitbitServerError a;
        public static final FitbitServerError b;
        public static final FitbitServerError c;
        public static final FitbitServerError d;
        public static final FitbitServerError e;
        public static final FitbitServerError f;
        public static final FitbitServerError g;
        public static final FitbitServerError h;
        public static final FitbitServerError i;
        private static final FitbitServerError j[];

        public static FitbitServerError valueOf(String s)
        {
            return (FitbitServerError)Enum.valueOf(com/fitbit/serverinteraction/validators/FitbitResponseValidator$FitbitServerError, s);
        }

        public static FitbitServerError[] values()
        {
            return (FitbitServerError[])j.clone();
        }

        static 
        {
            a = new FitbitServerError("APP_BACKOFF", 0);
            b = new FitbitServerError("SYNCLAIR_BACKOFF", 1);
            c = new FitbitServerError("MOBILETRACK_BACKOFF", 2);
            d = new FitbitServerError("RATE_LIMIT", 3);
            e = new FitbitServerError("INVALID_TIME_STAMP", 4);
            f = new FitbitServerError("OATH_ACCESS_TOKEN", 5);
            g = new FitbitServerError("VALIDATION", 6);
            h = new FitbitServerError("SERVER_RESPONSE", 7);
            i = new FitbitServerError("NOT_LINKED_TRACKER", 8);
            j = (new FitbitServerError[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private FitbitServerError(String s, int k)
        {
            super(s, k);
        }
    }


    private static final String a = "FitbitResponseValidator";
    private static final String b = "errors";
    private final EnumSet c;

    public FitbitResponseValidator(EnumSet enumset)
    {
        if (enumset == null)
        {
            enumset = EnumSet.noneOf(com/fitbit/serverinteraction/validators/FitbitResponseValidator$FitbitServerError);
        }
        c = enumset;
    }

    private MobileTrackBackOffException a(JSONObject jsonobject, int i, HttpURLConnection httpurlconnection)
    {
        return com.fitbit.serverinteraction.validators.d.a(jsonobject, i, httpurlconnection);
    }

    private SynclairBackOffException a(int i, HttpURLConnection httpurlconnection)
    {
        return com.fitbit.serverinteraction.validators.d.a(i, httpurlconnection);
    }

    private void a(q q1, int i)
        throws NotLinkedTrackerException
    {
        if (q1 != null)
        {
            NotLinkedTrackerException.a(q1.a(), i, q1.b());
        }
    }

    private void a(JSONObject jsonobject, int i)
        throws ApplicationBackedOffException, JSONException
    {
        if (com.fitbit.serverinteraction.validators.d.a(jsonobject, i))
        {
            throw new ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
        } else
        {
            return;
        }
    }

    private void b()
    {
        z.a(new Intent("com.fitbit.serverinteraction.validators.Validators.ACTION_INCORRECT_TIMESTAMP"));
    }

    private void b(HttpURLConnection httpurlconnection)
        throws RateLimitException, IOException
    {
        httpurlconnection = com.fitbit.serverinteraction.validators.d.a(httpurlconnection);
        if (httpurlconnection != null)
        {
            throw httpurlconnection;
        } else
        {
            return;
        }
    }

    private boolean b(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getString("fieldName");
        return jsonobject != null && jsonobject.equals("oauth_timestamp");
    }

    private boolean c(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getString("fieldName");
        return jsonobject != null && jsonobject.equals("oauth_access_token");
    }

    private q d(JSONObject jsonobject)
        throws JSONException
    {
        return q.a(jsonobject);
    }

    protected ServerResponseException a(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            String s = jsonobject.optString("errorType");
            if (s != null && s.equalsIgnoreCase("request"))
            {
                String s1 = jsonobject.optString("code");
                if (s1 != null && !s1.isEmpty())
                {
                    return new ServerResponseException(com.fitbit.data.bl.exceptions.ServerResponseException.ErrorCode.a(s1, com.fitbit.data.bl.exceptions.ServerResponseException.ErrorCode.f), com.fitbit.data.bl.exceptions.ServerResponseException.ErrorType.b, jsonobject.optString("message"));
                }
            }
        }
        return null;
    }

    protected void a()
    {
        ServerGateway.a().g();
    }

    public void a(HttpURLConnection httpurlconnection)
        throws ServerCommunicationException, ServerValidationException, IOException
    {
        int j = httpurlconnection.getResponseCode();
        if (j < 400 || j >= 600) goto _L2; else goto _L1
_L1:
        if (c.size() <= 0) goto _L4; else goto _L3
_L3:
        if (c.contains(FitbitServerError.d))
        {
            b(httpurlconnection);
        }
        if (!c.contains(com.fitbit.serverinteraction.validators.FitbitServerError.b)) goto _L6; else goto _L5
_L5:
        Object obj = a(j, httpurlconnection);
_L11:
        if (obj == null) goto _L8; else goto _L7
_L7:
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        JSONArray jsonarray;
        JSONObject jsonobject;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.fitbit.e.a.e("FitbitResponseValidator", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.fitbit.e.a.a("FitbitResponseValidator", ((JSONException) (obj)).toString(), new Object[0]);
        }
_L4:
        com.fitbit.e.a.a("FitbitResponseValidator", httpurlconnection.getResponseMessage(), new Object[0]);
        throw new ServerCommunicationException(j, httpurlconnection.getResponseMessage());
_L8:
        jsonarray = (new JSONObject(t.a(httpurlconnection.getErrorStream()))).optJSONArray("errors");
        if (jsonarray == null) goto _L4; else goto _L9
_L9:
        i = 0;
        Object obj1 = null;
        flag = false;
        obj3 = obj;
        obj4 = null;
        obj = obj1;
_L12:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_462;
        }
        jsonobject = jsonarray.getJSONObject(i);
        if (c.contains(com.fitbit.serverinteraction.validators.FitbitServerError.a))
        {
            a(jsonobject, j);
        }
        flag1 = flag;
        if (!c.contains(FitbitServerError.e))
        {
            break MISSING_BLOCK_LABEL_226;
        }
        flag1 = flag;
        if (b(jsonobject))
        {
            flag1 = true;
        }
        if (c.contains(FitbitServerError.f) && c(jsonobject))
        {
            a();
        }
        flag2 = c.contains(FitbitServerError.g);
        flag3 = c.contains(FitbitServerError.i);
        if (!flag2)
        {
            obj2 = obj4;
            if (!flag3)
            {
                break MISSING_BLOCK_LABEL_336;
            }
        }
        obj5 = d(jsonobject);
        obj2 = obj4;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        a(((q) (obj5)), j);
        obj2 = obj4;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        obj2 = new ServerValidationException(((q) (obj5)));
        obj4 = obj3;
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        obj4 = obj3;
        if (c.contains(FitbitServerError.c))
        {
            obj4 = a(jsonobject, j, httpurlconnection);
        }
        obj5 = obj;
        if (!c.contains(FitbitServerError.h))
        {
            break MISSING_BLOCK_LABEL_404;
        }
        obj5 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        obj5 = a(jsonobject);
        if (b.a.a())
        {
            com.fitbit.e.a.a("FitbitResponseValidator", jsonobject.toString(), new Object[0]);
            break MISSING_BLOCK_LABEL_507;
        }
        com.fitbit.e.a.a("FitbitResponseValidator", "Fitbit responded with an Error", new Object[0]);
        break MISSING_BLOCK_LABEL_507;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        b();
        throw new IncorrectTimestampException();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        throw obj3;
        if (obj4 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        throw obj4;
        if (obj == null) goto _L4; else goto _L10
_L10:
        throw obj;
_L2:
        return;
_L6:
        obj = null;
          goto _L11
        i++;
        obj3 = obj4;
        obj4 = obj2;
        flag = flag1;
        obj = obj5;
          goto _L12
    }
}
