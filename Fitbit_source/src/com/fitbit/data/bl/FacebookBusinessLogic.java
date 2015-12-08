// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.fitbit.c.a;
import com.fitbit.c.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.s;
import com.fitbit.savedstate.ChinaStoreUtilsSavedState;
import com.fitbit.savedstate.i;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.w;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookBusinessLogic
{
    public static final class FacebookFitbitState extends Enum
    {

        public static final FacebookFitbitState a;
        public static final FacebookFitbitState b;
        public static final FacebookFitbitState c;
        private static final FacebookFitbitState d[];

        public static FacebookFitbitState valueOf(String s)
        {
            return (FacebookFitbitState)Enum.valueOf(com/fitbit/data/bl/FacebookBusinessLogic$FacebookFitbitState, s);
        }

        public static FacebookFitbitState[] values()
        {
            return (FacebookFitbitState[])d.clone();
        }

        static 
        {
            a = new FacebookFitbitState("DISCONNECTED", 0);
            b = new FacebookFitbitState("UNLINKED", 1);
            c = new FacebookFitbitState("LINKED", 2);
            d = (new FacebookFitbitState[] {
                a, b, c
            });
        }

        private FacebookFitbitState(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class SuggestionsResult extends Enum
        implements s
    {

        public static final SuggestionsResult a;
        public static final SuggestionsResult b;
        public static final SuggestionsResult c;
        public static final SuggestionsResult d;
        public static final SuggestionsResult e;
        private static final String f = "SuggestionsResult";
        private static final SuggestionsResult g[];
        private final String serializableName;

        public static SuggestionsResult a(String s1)
        {
            SuggestionsResult suggestionsresult = e;
            if (s1 == null)
            {
                return suggestionsresult;
            }
            try
            {
                s1 = (SuggestionsResult)w.a(s1, com/fitbit/data/bl/FacebookBusinessLogic$SuggestionsResult);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.fitbit.e.a.e("SuggestionsResult", com.fitbit.e.a.a(s1), new Object[0]);
                s1 = suggestionsresult;
            }
            return s1;
        }

        public static SuggestionsResult valueOf(String s1)
        {
            return (SuggestionsResult)Enum.valueOf(com/fitbit/data/bl/FacebookBusinessLogic$SuggestionsResult, s1);
        }

        public static SuggestionsResult[] values()
        {
            return (SuggestionsResult[])g.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            a = new SuggestionsResult("FETCHING", 0, "FETCHING");
            b = new SuggestionsResult("FETCHED", 1, "FETCHED");
            c = new SuggestionsResult("UNLINKED", 2, "UNLINKED");
            d = new SuggestionsResult("EXPIRED", 3, "EXPIRED");
            e = new SuggestionsResult("FAILED", 4, "FAILED");
            g = (new SuggestionsResult[] {
                a, b, c, d, e
            });
        }

        private SuggestionsResult(String s1, int j, String s2)
        {
            super(s1, j);
            serializableName = s2;
        }
    }

    private static class a
    {

        public static FacebookBusinessLogic a = new FacebookBusinessLogic();


        private a()
        {
        }
    }


    private SuggestionsResult a;

    private FacebookBusinessLogic()
    {
        a = null;
    }


    public static FacebookBusinessLogic a()
    {
        return com.fitbit.data.bl.a.a;
    }

    public static void a(String s, String s1)
        throws ServerCommunicationException, JSONException
    {
        (new PublicAPI(ServerGateway.a())).i(s, s1);
    }

    public static com.fitbit.c.a e()
    {
        Object obj1 = null;
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        Object obj = obj1;
        if (com.fitbit.c.b.a(accesstoken))
        {
            obj = GraphRequest.newMeRequest(accesstoken, null).executeAndWait();
            if (((GraphResponse) (obj)).getError() != null)
            {
                throw new RuntimeException(String.format("Facebook error found %s", new Object[] {
                    ((GraphResponse) (obj)).getError()
                }));
            }
            JSONObject jsonobject = ((GraphResponse) (obj)).getJSONObject();
            obj = obj1;
            if (jsonobject != null)
            {
                obj = new com.fitbit.c.a();
                obj.a = accesstoken.getToken();
                obj.b = jsonobject.optString("id");
                obj.c = jsonobject.optString("name");
                obj.d = jsonobject.optString("email");
                obj.e = jsonobject.optString("birthday");
                obj.f = jsonobject.optString("gender");
            }
        }
        return ((com.fitbit.c.a) (obj));
    }

    public void a(SuggestionsResult suggestionsresult)
    {
        a = suggestionsresult;
        if (c())
        {
            i.b(false);
        }
    }

    public SuggestionsResult b()
    {
        return a;
    }

    public boolean c()
    {
        return EnumSet.of(SuggestionsResult.c, SuggestionsResult.d).contains(a);
    }

    public FacebookFitbitState d()
    {
        if (g() && com.fitbit.c.b.a(AccessToken.getCurrentAccessToken()))
        {
            if (i.i())
            {
                return FacebookFitbitState.c;
            } else
            {
                return com.fitbit.data.bl.FacebookFitbitState.b;
            }
        } else
        {
            return com.fitbit.data.bl.FacebookFitbitState.a;
        }
    }

    public void f()
    {
        if (g())
        {
            i.b(false);
            if (AccessToken.getCurrentAccessToken() != null)
            {
                LoginManager.getInstance().logOut();
            }
        }
    }

    public boolean g()
    {
        return ChinaStoreUtilsSavedState.h();
    }
}
