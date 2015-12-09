// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.AuthenticationException;
import com.fitbit.data.bl.exceptions.MobileTrackBackOffException;
import com.fitbit.data.bl.exceptions.SendResetEmailException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.SignupException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.ProfilePreference;
import com.fitbit.data.domain.UnitSystem;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.domain.s;
import com.fitbit.serverinteraction.b.g;
import com.fitbit.serverinteraction.validators.FitbitResponseValidator;
import com.fitbit.serverinteraction.validators.a;
import com.fitbit.serverinteraction.validators.f;
import com.fitbit.util.al;
import com.fitbit.util.bh;
import com.fitbit.util.bn;
import com.fitbit.util.br;
import com.fitbit.util.c.d;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.util.t;
import com.fitbit.util.w;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.http.HttpParameters;
import org.apache.http.message.BasicHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction:
//            ServerGateway, RequestParametersBuilder, k, o, 
//            a

public class PublicAPI
{
    public static final class DataRange extends Enum
    {

        public static final DataRange a;
        public static final DataRange b;
        public static final DataRange c;
        public static final DataRange d;
        public static final DataRange e;
        public static final DataRange f;
        public static final DataRange g;
        private static final DataRange h[];
        private final long interval;
        private final String value;

        static String a(DataRange datarange)
        {
            return datarange.value;
        }

        public static DataRange valueOf(String s1)
        {
            return (DataRange)Enum.valueOf(com/fitbit/serverinteraction/PublicAPI$DataRange, s1);
        }

        public static DataRange[] values()
        {
            return (DataRange[])h.clone();
        }

        public long a()
        {
            return interval;
        }

        static 
        {
            a = new DataRange("ONE_SEC", 0, "1d/1sec", 0x5265c00L);
            b = new DataRange("ONE_MIN", 1, "1d/1min", 0x5265c00L);
            c = new DataRange("FIVE_MIN", 2, "1d/5min", 0x5265c00L);
            d = new DataRange("DAY", 3, "1d/15min", 0x5265c00L);
            e = new DataRange("WEEK", 4, "1w", 0x240c8400L);
            f = new DataRange("MONTH", 5, "1m", 0x9fa52400L);
            g = new DataRange("HALF_YEAR", 6, "6m", 0x3abd89600L);
            h = (new DataRange[] {
                a, b, c, d, e, f, g
            });
        }

        private DataRange(String s1, int i1, String s2, long l1)
        {
            super(s1, i1);
            value = s2;
            interval = l1;
        }
    }

    public static final class EmailStatus extends Enum
        implements s
    {

        public static final EmailStatus a;
        public static final EmailStatus b;
        public static final EmailStatus c;
        private static final String d = "EmailStatus";
        private static final EmailStatus e[];
        private final String serializableName;

        public static EmailStatus a(String s1)
        {
            EmailStatus emailstatus = c;
            if (s1 == null)
            {
                return emailstatus;
            }
            try
            {
                s1 = (EmailStatus)com.fitbit.util.w.a(s1, com/fitbit/serverinteraction/PublicAPI$EmailStatus);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.fitbit.e.a.e("EmailStatus", com.fitbit.e.a.a(s1), new Object[0]);
                s1 = emailstatus;
            }
            return s1;
        }

        public static EmailStatus valueOf(String s1)
        {
            return (EmailStatus)Enum.valueOf(com/fitbit/serverinteraction/PublicAPI$EmailStatus, s1);
        }

        public static EmailStatus[] values()
        {
            return (EmailStatus[])e.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            a = new EmailStatus("FACEBOOK", 0, "FACEBOOK");
            b = new EmailStatus("EMAIL", 1, "EMAIL");
            c = new EmailStatus("NONE", 2, "NONE");
            e = (new EmailStatus[] {
                a, b, c
            });
        }

        private EmailStatus(String s1, int i1, String s2)
        {
            super(s1, i1);
            serializableName = s2;
        }
    }

    public static final class InviteSource extends Enum
    {

        public static final InviteSource a;
        public static final InviteSource b;
        public static final InviteSource c;
        public static final InviteSource d;
        private static final InviteSource e[];
        private final String parameter;

        public static InviteSource valueOf(String s1)
        {
            return (InviteSource)Enum.valueOf(com/fitbit/serverinteraction/PublicAPI$InviteSource, s1);
        }

        public static InviteSource[] values()
        {
            return (InviteSource[])e.clone();
        }

        public String toString()
        {
            return parameter;
        }

        static 
        {
            a = new InviteSource("Facebook", 0, "FACEBOOK_INVITATION");
            b = new InviteSource("Contacts", 1, "CONTACT_INVITATION");
            c = new InviteSource("Profile", 2, "PROFILE_INVITATION");
            d = new InviteSource("Email", 3, "EMAIL_INVITATION");
            e = (new InviteSource[] {
                a, b, c, d
            });
        }

        private InviteSource(String s1, int i1, String s2)
        {
            super(s1, i1);
            parameter = s2;
        }
    }

    public static class a
    {

        public a()
        {
        }
    }

    public static class b
    {

        public final int b;
        public final Date c;
        public final int d;
        public final b e;
        public final Integer f;

        public b b()
        {
            Date date = c;
            int i1 = b;
            return new b(this, date, d + i1, d, f);
        }

        Map c()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("beforeDate", com.fitbit.util.format.e.h(c));
            hashmap.put("limit", String.valueOf(d));
            hashmap.put("offset", String.valueOf(b));
            hashmap.put("sort", "desc");
            if (f != null)
            {
                hashmap.put("activityId", f.toString());
            }
            return hashmap;
        }

        public b(b b1, Date date, int i1, int j1, Integer integer)
        {
            if (j1 > 100)
            {
                throw new IllegalArgumentException("Limit cannot be greater than 100");
            }
            if (i1 < 0)
            {
                throw new IllegalArgumentException("Offset cannot be less than 0");
            } else
            {
                e = b1;
                c = date;
                b = i1;
                d = j1;
                f = integer;
                return;
            }
        }

        public b(Date date, int i1, int j1)
        {
            this(null, date, i1, j1, null);
        }
    }


    public static int a = 0;
    public static final String b = "LIQUID";
    public static final String c = "DRY";
    public static final String d = "7d";
    public static final String e = "30d";
    private static final String f = "1.1";
    private static final long k;
    private final com.fitbit.serverinteraction.b.e g = new com.fitbit.serverinteraction.b.e() {

        final PublicAPI a;

        public JSONObject a(InputStream inputstream, String s1)
            throws JSONException, ServerCommunicationException
        {
label0:
            {
                if (inputstream == null)
                {
                    break label0;
                }
                try
                {
                    inputstream = c(inputstream, s1);
                    if (TextUtils.isEmpty(inputstream))
                    {
                        break label0;
                    }
                    inputstream = new JSONObject(inputstream);
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream)
                {
                    throw new ServerCommunicationException("Could not parse JSON from output", inputstream);
                }
                return inputstream;
            }
            return null;
        }

        public Object b(InputStream inputstream, String s1)
            throws Throwable, ServerCommunicationException
        {
            return a(inputstream, s1);
        }

            
            {
                a = PublicAPI.this;
                super();
            }
    };
    private final ServerGateway h;
    private final com.fitbit.serverinteraction.o i;
    private final Map j = new HashMap();

    public PublicAPI(ServerGateway servergateway)
    {
        h = servergateway;
        i = servergateway.c();
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT, "body/weight");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT, "body/fat");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER, "foods/log/water");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS, "activities/steps");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES, "activities/calories");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS, "activities/floors");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN, "foods/log/caloriesIn");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE, "activities/distance");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE, "activities/minutesVeryActive");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP, "sleep/minutesAsleep");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT, "sleep/awakeningsCount");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY, "activities/steps");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY, "activities/distance");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY, "activities/minutesVeryActive");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY, "activities/floors");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY, "activities/calories");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, "activities/heart");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.RESTING_HEART_RATE, "activities/restingHeartRate");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE, "activities/minutesFairlyActive");
        j.put(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE_INTRADAY, "activities/minutesFairlyActive");
    }

    private static List F()
    {
        return H(al.e());
    }

    private static List G()
    {
        return Collections.singletonList(new BasicHeader("Accept-Locale", al.i()));
    }

    private static List H()
    {
        return Collections.singletonList(new BasicHeader("Accept-Locale", al.f()));
    }

    private static List H(String s1)
    {
        if (s1 == null || "".equals(s1))
        {
            return new ArrayList();
        } else
        {
            return Collections.singletonList(new BasicHeader("Accept-Locale", s1));
        }
    }

    private FitbitResponseValidator I()
    {
        return com.fitbit.serverinteraction.validators.f.a();
    }

    private JSONObject I(String s1)
        throws JSONException, ServerCommunicationException
    {
        s1 = a(s1, null, com.fitbit.serverinteraction.ServerGateway.HttpMethods.a, true, F(), com.fitbit.serverinteraction.b.f.b(), I());
        return (JSONObject)h.b(s1.a()).f();
    }

    private RequestParametersBuilder.RequestParameters J(String s1)
    {
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(true).a(String.format("%s%s", new Object[] {
            i.a("1.1"), "/user/-/foods/log.json"
        })).b(s1).a(G()).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return c1.a();
    }

    private RequestParametersBuilder.RequestParameters a(Long long1, String s1)
    {
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(true).a(String.format("%s/user/-/foods/log/%s.json", new Object[] {
            i.a("1.1"), long1
        })).b(s1).a(G()).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return c1.a();
    }

    private static RequestParametersBuilder a(String s1, String s2, ServerGateway.HttpMethods httpmethods, boolean flag, List list, g g1, com.fitbit.serverinteraction.validators.a a1)
    {
        RequestParametersBuilder requestparametersbuilder = new RequestParametersBuilder();
        requestparametersbuilder.a(s1).b(s2).a(httpmethods).a(flag).a(list).a(g1).a(a1);
        return requestparametersbuilder;
    }

    private g a(Class class1)
    {
        com.fitbit.serverinteraction.b.d d1 = null;
        if (class1 == org/json/JSONArray)
        {
            d1 = com.fitbit.serverinteraction.b.f.c();
        } else
        {
            if (class1 == org/json/JSONObject)
            {
                return com.fitbit.serverinteraction.b.f.b();
            }
            if (class1 == com/fasterxml/jackson/core/JsonParser)
            {
                return com.fitbit.serverinteraction.b.f.e();
            }
        }
        return d1;
    }

    private Object a(String s1, String s2, Class class1)
        throws ServerCommunicationException, JSONException
    {
        return b(s1, s2, ((Map) (null)), class1);
    }

    private Object a(String s1, String s2, String s3, Class class1)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(s1, s2, s3, ((Map) (null)));
        s2 = a(class1);
        if (s2 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            s1 = a(s1.toString(), null, com.fitbit.serverinteraction.ServerGateway.HttpMethods.a, true, H(), ((g) (s2)), ((com.fitbit.serverinteraction.validators.a) (I())));
            return h.b(s1.a()).f();
        }
    }

    private Object a(String s1, String s2, String s3, Map map, com.fitbit.serverinteraction.validators.a a1, Class class1, boolean flag, 
            boolean flag1)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(s1, s2, s3, map);
        s2 = a(class1);
        if (s2 == null)
        {
            throw new IllegalArgumentException();
        }
        s3 = new RequestParametersBuilder();
        s3.a(flag1).a(s1).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.a).a(a1).a(s2);
        if (flag)
        {
            s3.a(F());
            if (a1 == null)
            {
                s3.a(I());
            }
        }
        return h.b(s3.a()).f();
    }

    private Object a(String s1, String s2, String s3, Map map, com.fitbit.serverinteraction.validators.a a1, Class class1, boolean flag, 
            boolean flag1, boolean flag2, long l1, RequestParametersBuilder.RequestParameters.ContentType contenttype, boolean flag3)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(s1, s2, s3, map);
        s2 = a(class1);
        if (s2 == null)
        {
            throw new IllegalArgumentException();
        }
        s3 = new RequestParametersBuilder();
        s3.a(flag1).a(s1).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.a).a(a1).a(s2).b(flag2).a(l1).a(contenttype).d(flag3);
        if (flag)
        {
            s3.a(F());
            if (a1 == null)
            {
                s3.a(I());
            }
        }
        return h.b(s3.a()).f();
    }

    private Object a(String s1, String s2, String s3, Map map, Class class1)
        throws ServerCommunicationException, JSONException
    {
        return b(s1, s2, s3, map, class1);
    }

    private Object a(String s1, String s2, String s3, Map map, Class class1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        return a(s1, s2, s3, map, ((com.fitbit.serverinteraction.validators.a) (I())), class1, flag, true);
    }

    private Object a(String s1, String s2, Map map, Class class1)
        throws ServerCommunicationException, JSONException
    {
        return b("1", s1, s2, map, class1);
    }

    private Object a(String s1, String s2, Map map, Class class1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        return a(null, s1, s2, map, ((com.fitbit.serverinteraction.validators.a) (I())), class1, flag, true);
    }

    private String a(String s1, String s2, String s3, Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s2 != null)
        {
            if (s1 == null)
            {
                s1 = i.n();
            } else
            {
                s1 = i.a(s1);
            }
            stringbuilder.append(String.format("%s/%s/%s.json", new Object[] {
                s1, s2, s3
            }));
        } else
        {
            if (s1 == null)
            {
                s1 = i.n();
            } else
            {
                s1 = i.a(s1);
            }
            stringbuilder.append(String.format("%s/%s.json", new Object[] {
                s1, s3
            }));
        }
        a(map, stringbuilder);
        return stringbuilder.toString();
    }

    private static List a(UnitSystem unitsystem)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicHeader("Accept-Locale", al.f()));
        if (unitsystem != null)
        {
            arraylist.add(new BasicHeader("Accept-Language", unitsystem.getSerializableName()));
        }
        return Collections.unmodifiableList(arraylist);
    }

    private JSONObject a(String s1, UnitSystem unitsystem)
        throws JSONException, ServerCommunicationException
    {
        s1 = a(s1, null, com.fitbit.serverinteraction.ServerGateway.HttpMethods.a, true, a(unitsystem), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (I())));
        return (JSONObject)h.b(s1.a()).f();
    }

    private JSONObject a(String s1, String s2, ServerGateway.HttpMethods httpmethods)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(s1, s2, httpmethods, true, F(), ((g) (g)), ((com.fitbit.serverinteraction.validators.a) (I())));
        return (JSONObject)h.b(s1.a()).f();
    }

    private JSONObject a(String s1, byte abyte0[])
        throws JSONException, ServerCommunicationException
    {
        s1 = a(s1, null, com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, ((List) (null)), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (I())));
        s1.a(abyte0, false);
        s1.a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.d);
        return (JSONObject)h.b(s1.a()).f();
    }

    private JSONObject a(JSONObject jsonobject, long l1)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.getJSONArray("sentInvites");
        JSONArray jsonarray1 = new JSONArray();
        Date date = com.fitbit.util.o.b();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            JSONObject jsonobject1 = (JSONObject)jsonarray.get(i1);
            if (com.fitbit.util.o.a(com.fitbit.util.format.e.d(jsonobject1.getString("dateTime")), date, TimeUnit.MILLISECONDS) <= l1)
            {
                jsonarray1.put(jsonobject1);
            }
        }

        jsonobject.put("sentInvites", jsonarray1);
        return jsonobject;
    }

    private void a(Map map, StringBuilder stringbuilder)
    {
        if (map != null)
        {
            stringbuilder.append("?");
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                String s2 = (String)map.get(s1);
                stringbuilder.append(s1).append("=").append(s2);
                if (iterator.hasNext())
                {
                    stringbuilder.append("&");
                }
            } while (true);
        }
    }

    private Object b(String s1, String s2, String s3, Map map, Class class1)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(s1, s2, s3, map);
        s2 = a(class1);
        if (s2 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            s1 = a(s1.toString(), null, com.fitbit.serverinteraction.ServerGateway.HttpMethods.a, true, G(), s2, I());
            return h.b(s1.a()).f();
        }
    }

    private Object b(String s1, String s2, Map map, Class class1)
        throws ServerCommunicationException, JSONException
    {
        return a(s1, s2, map, class1, true);
    }

    private String b(int i1, String s1, Date date)
    {
        br br1 = new br();
        br1.a("isQuickCaloriesAdd", Boolean.valueOf(true));
        br1.a("calories", Integer.valueOf(i1));
        br1.a("mealType", s1);
        br1.a("date", com.fitbit.util.format.e.h(date));
        return br1.toString();
    }

    private String b(long l1, String s1, String s2, double d1, String s3, 
            String s4, double d2, Date date, boolean flag, boolean flag1)
    {
        br br1 = new br();
        if (s1 == null)
        {
            br1.a("foodId", Long.valueOf(l1));
        } else
        {
            br1.a("foodName", s1);
        }
        if (s2 != null)
        {
            br1.a("brandName", s2);
        }
        if (s1 != null)
        {
            br1.a("calories", com.fitbit.util.format.e.h(d1));
        }
        if (flag)
        {
            br1.a("isGeneric", Boolean.valueOf(true));
            if (s1 == null)
            {
                br1.a("calories", com.fitbit.util.format.e.h(d1));
            }
        }
        br1.a("mealType", s3);
        br1.a("unitName", s4);
        br1.a("amount", String.format(Locale.US, "%.2f", new Object[] {
            Double.valueOf(d2)
        }));
        br1.a("date", com.fitbit.util.format.e.h(date));
        if (s1 == null)
        {
            if (flag1)
            {
                s1 = "true";
            } else
            {
                s1 = "false";
            }
            br1.a("favorite", s1);
        }
        return br1.toString();
    }

    private String b(String s1, String s2, float f1, float f2, String s3, String s4, String s5, 
            Map map)
    {
        br br1 = new br();
        br1.a("name", s1);
        br1.a("defaultServingUnit", s2);
        br1.a("defaultServingSize", String.format(Locale.US, "%.2f", new Object[] {
            Float.valueOf(f1)
        }));
        br1.a("calories", Integer.valueOf((int)f2));
        if (s3 != null)
        {
            br1.a("formType", s3);
        }
        if (s4 != null)
        {
            br1.a("description", s4);
        }
        if (s5 != null)
        {
            br1.a("brand", s5);
        }
        s1 = map.keySet().iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            s2 = (String)s1.next();
            if (!"calories".equals(s2))
            {
                br1.a(s2, Integer.valueOf(((Double)map.get(s2)).intValue()));
            }
        } while (true);
        return br1.toString();
    }

    private JSONObject c(String s1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        if (flag) goto _L2; else goto _L1
_L1:
        ((br) (obj)).a("pair", Boolean.valueOf(flag));
_L4:
        s1 = ((br) (obj)).toString();
        obj = String.format("%s/%s", new Object[] {
            i.n(), "user/-/devices/tracker.json"
        });
        RequestParametersBuilder.RequestParameters.d d1 = new RequestParametersBuilder.RequestParameters.d() {

            final PublicAPI a;

            void a(HttpURLConnection httpurlconnection)
            {
                com.fitbit.util.c.d.a(httpurlconnection);
            }

            
            {
                a = PublicAPI.this;
                super();
            }
        };
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(((String) (obj))).b(s1).a(F()).a(I()).a(com.fitbit.serverinteraction.b.f.b()).a(d1);
        try
        {
            s1 = h.b(c1.a());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.a(com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.c);
            throw s1;
        }
        return (JSONObject)s1.f();
_L2:
        if (s1 != null)
        {
            ((br) (obj)).a("wireId", s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private JSONObject j(String s1, String s2)
        throws JSONException, ServerCommunicationException
    {
        s1 = a(s1, s2, com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, F(), com.fitbit.serverinteraction.b.f.b(), I());
        return (JSONObject)h.b(s1.a()).f();
    }

    public JSONObject A()
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = null;
        if (com.fitbit.config.b.a.a())
        {
            hashmap = new HashMap();
            hashmap.put("betaTypes", "NEUTRINO,GRAVITON,PROTON,TAU");
        }
        return (JSONObject)a("1.1", "devices", "types", hashmap, I(), org/json/JSONObject, true, false);
    }

    public JSONObject A(String s1)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/notifications/enable.json").toString()
        }), "");
    }

    public JSONObject B()
        throws ServerCommunicationException, JSONException
    {
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(String.format("%s/%s", new Object[] {
            i.n(), "account/restrictions.json"
        })).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.a).a(F()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(c1.a()).f();
    }

    public JSONObject B(String s1)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/notifications/disable.json").toString()
        }), "");
    }

    public JSONObject C()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a(((String) (null)), "locales", org/json/JSONObject);
    }

    public boolean C(String s1)
        throws ServerCommunicationException, JSONException
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj = new br();
        if (s1 != null)
        {
            ((br) (obj)).a("deviceGUID", s1);
        }
        obj = j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/devices/android/subscriptions.json"
        }), ((br) (obj)).toString()).optJSONArray("androidSubscriptions");
        flag = flag1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= ((JSONArray) (obj)).length()) goto _L2; else goto _L3
_L3:
        if (!s1.equals(((JSONArray) (obj)).getJSONObject(i1).optString("deviceGUID"))) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public JSONObject D()
        throws ServerCommunicationException, JSONException
    {
        return c(((String) (null)), false);
    }

    public JSONObject D(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/-/devices/tracker/").append(s1).toString(), "alarms", org/json/JSONObject);
    }

    public JSONObject E()
        throws JSONException, ServerCommunicationException
    {
        return (JSONObject)a(((String) (null)), "timezones", org/json/JSONObject);
    }

    public JSONObject E(String s1)
        throws ServerCommunicationException, JSONException
    {
        return c(s1, true);
    }

    public void F(String s1)
        throws ServerCommunicationException, JSONException, SendResetEmailException
    {
        br br1 = new br();
        br1.a("email", s1);
        s1 = new RequestParametersBuilder();
        s1.a("https://api.fitbit.com/1/account/resetPassword.json").b(br1.toString()).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.b).a(false).a(F()).a(com.fitbit.serverinteraction.b.f.b()).a(I()).f(true);
        h.b(s1.a());
    }

    public void G(String s1)
        throws ServerCommunicationException
    {
        RequestParametersBuilder requestparametersbuilder = new RequestParametersBuilder();
        requestparametersbuilder.a(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/devices/tracker/").append(s1).append(".json").toString()
        }));
        requestparametersbuilder.a(ServerGateway.HttpMethods.c);
        requestparametersbuilder.a(true);
        requestparametersbuilder.a(F());
        requestparametersbuilder.a(null);
        requestparametersbuilder.a(I());
        h.b(requestparametersbuilder.a());
    }

    public JsonParser a(ActivityLogEntry activitylogentry)
        throws ServerCommunicationException, JSONException
    {
        return (JsonParser)a("1.1", "user/-/activities", String.valueOf(activitylogentry.getServerId()), ((Map) (null)), ((com.fitbit.serverinteraction.validators.a) (I())), com/fasterxml/jackson/core/JsonParser, true, true);
    }

    public com.fitbit.serverinteraction.a a(String s1, String s2, boolean flag)
        throws ServerCommunicationException, AuthenticationException
    {
        return h.a(s1, s2, flag);
    }

    public JSONObject a()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/foods/log/water", "goal", org/json/JSONObject);
    }

    public JSONObject a(double d1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        ((br) (obj)).a("target", String.format(Locale.US, "%.1f", new Object[] {
            Double.valueOf(d1)
        }));
        obj = ((br) (obj)).toString();
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(true).a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/foods/log/water/goal.json"
        })).b(((String) (obj))).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(c1.a()).f();
    }

    public JSONObject a(double d1, Date date, String s1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("amount", String.format(Locale.US, "%.2f", new Object[] {
            Double.valueOf(d1)
        }));
        br1.a("date", com.fitbit.util.format.e.h(date));
        br1.a("unit", s1);
        date = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/foods/log/water.json"
        }), date);
    }

    public JSONObject a(int i1, int j1, Date date)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("systolic", Integer.valueOf(i1));
        br1.a("diastolic", Integer.valueOf(j1));
        br1.a("date", com.fitbit.util.format.e.h(date));
        date = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/bp.json"
        }), date);
    }

    public JSONObject a(int i1, String s1, Date date)
        throws ServerCommunicationException, JSONException
    {
        s1 = J(b(i1, s1, date));
        return (JSONObject)h.b(s1).f();
    }

    public JSONObject a(int i1, String s1, Date date, Long long1)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(long1, b(i1, s1, date));
        return (JSONObject)h.b(s1).f();
    }

    public JSONObject a(long l1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        ((br) (obj)).a("lastViewedNotificationTimestamp", Long.valueOf(l1));
        obj = ((br) (obj)).toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/notifications/lastviewed/update.json"
        }), ((String) (obj)));
    }

    public JSONObject a(long l1, String s1, int i1, Date date, long l2, 
            double d1, com.fitbit.data.domain.b b1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (s1 == null)
        {
            br1.a("activityTypeId", Long.valueOf(l1));
        } else
        {
            br1.a("activityName", s1);
        }
        if (i1 != a)
        {
            br1.a("manualCalories", Integer.valueOf(i1));
        }
        br1.a("startTime", com.fitbit.util.format.e.d(date));
        br1.a("duration", Long.valueOf(l2));
        if (d1 != (double)a)
        {
            br1.a("manualDistance", String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(d1)
            }));
        }
        if (b1 != null)
        {
            br1.a("details", String.valueOf(b1.a(FitBitApplication.a())));
        }
        s1 = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.a("1.1"), "/user/-/activities.json"
        }), s1);
    }

    public JSONObject a(long l1, String s1, String s2, double d1, String s3, 
            String s4, double d2, Date date, boolean flag, boolean flag1)
        throws ServerCommunicationException, JSONException
    {
        s1 = J(b(l1, s1, s2, d1, s3, s4, d2, date, flag, flag1));
        return (JSONObject)h.b(s1).f();
    }

    public JSONObject a(long l1, String s1, String s2, double d1, String s3, 
            String s4, double d2, Date date, boolean flag, boolean flag1, Long long1)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(long1, b(l1, s1, s2, d1, s3, s4, d2, date, flag, flag1));
        return (JSONObject)h.b(s1).f();
    }

    public JSONObject a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
        throws ServerCommunicationException
    {
        br br1 = new br();
        if (activitylogentry.m() != activitylogentry1.m())
        {
            br1.a("activityTypeId", Long.valueOf(activitylogentry1.m()));
        }
        br1.a("startTime", (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US)).format(activitylogentry.e()));
        br1.a("duration", Integer.valueOf(activitylogentry.a(TimeUnit.MILLISECONDS)));
        activitylogentry = String.format("%s/user/-/activities/%s.json", new Object[] {
            i.a("1.1"), Long.valueOf(activitylogentry.getServerId())
        });
        try
        {
            activitylogentry = j(activitylogentry, br1.toString());
        }
        // Misplaced declaration of an exception variable
        catch (ActivityLogEntry activitylogentry)
        {
            throw new ServerCommunicationException(activitylogentry);
        }
        return activitylogentry;
    }

    public JSONObject a(BodyFatLogEntry bodyfatlogentry)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("fat", Double.valueOf(bodyfatlogentry.a().b())).a("date", com.fitbit.util.format.e.h(bodyfatlogentry.getLogDate())).a("time", com.fitbit.util.format.e.j(bodyfatlogentry.getLogDate()));
        return a(String.format("%s/%s.json", new Object[] {
            i.n(), "user/-/body/log/fat"
        }), br1.toString(), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b);
    }

    public JSONObject a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
        throws ServerCommunicationException, JSONException
    {
        timeseriesresourcetype = (String)j.get(timeseriesresourcetype);
        return I(String.format("%s/%s/%s/date/%s/%s.json", new Object[] {
            i.n(), "user/-", timeseriesresourcetype, com.fitbit.util.format.e.h(date), "1d"
        }));
    }

    public JSONObject a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, DataRange datarange)
        throws ServerCommunicationException, JSONException
    {
        timeseriesresourcetype = (String)j.get(timeseriesresourcetype);
        return I(String.format("%s/%s/%s/date/%s/%s.json", new Object[] {
            i.n(), "user/-", timeseriesresourcetype, com.fitbit.util.format.e.h(date), com.fitbit.serverinteraction.DataRange.a(datarange)
        }));
    }

    public JSONObject a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        timeseriesresourcetype = (String)j.get(timeseriesresourcetype);
        return I(String.format("%s/%s/%s/date/%s/%s.json", new Object[] {
            i.n(), "user/-", timeseriesresourcetype, com.fitbit.util.format.e.h(date), com.fitbit.util.format.e.h(date1)
        }));
    }

    public JSONObject a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, DataRange datarange)
        throws ServerCommunicationException, JSONException
    {
        timeseriesresourcetype = (String)j.get(timeseriesresourcetype);
        return I(String.format("%s/%s/%s/date/%s/%s/time/%s/%s.json", new Object[] {
            i.n(), "user/-", timeseriesresourcetype, com.fitbit.util.format.e.h(date), com.fitbit.serverinteraction.DataRange.a(datarange), com.fitbit.util.format.e.j(date), com.fitbit.util.format.e.j(date1)
        }));
    }

    public JSONObject a(WeightLogEntry weightlogentry, UnitSystem unitsystem)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("weight", Double.valueOf(weightlogentry.a().a(unitsystem.getWeightUnits()).b())).a("date", com.fitbit.util.format.e.h(weightlogentry.getLogDate())).a("time", com.fitbit.util.format.e.j(weightlogentry.getLogDate()));
        weightlogentry = a(String.format("%s/%s.json", new Object[] {
            i.n(), "user/-/body/log/weight"
        }), br1.toString(), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, a(unitsystem), ((g) (g)), ((com.fitbit.serverinteraction.validators.a) (I())));
        return (JSONObject)h.b(weightlogentry.a()).f();
    }

    public JSONObject a(b b1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("1.1", "user/-/activities", "list", b1.c(), ((com.fitbit.serverinteraction.validators.a) (I())), org/json/JSONObject, true, true);
    }

    public JSONObject a(Boolean boolean1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (boolean1 != null)
        {
            br1.a("hideMeFromLeaderboard", boolean1);
        }
        boolean1 = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/friends/leaderboard.json"
        }), boolean1);
    }

    public JSONObject a(Double double1, String s1, Boolean boolean1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (s1 != null)
        {
            br1.a("intensity", s1);
        }
        if (double1 != null)
        {
            br1.a("calories", Integer.valueOf(double1.intValue()));
        }
        if (boolean1 != null)
        {
            br1.a("personalized", s1);
        }
        double1 = br1.toString();
        double1 = a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/foods/log/goal.json"
        }), ((String) (double1)), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, F(), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (I())));
        return (JSONObject)h.b(double1.a()).f();
    }

    public JSONObject a(Long long1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.a("1.1"), "user/-/foods", long1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject a(String s1)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s/%s.json", new Object[] {
            i.a("1"), "user/-/devices/tracker/generateBtleClientAuthCredentials"
        }), (new StringBuilder()).append("serialNumber=").append(s1).toString());
    }

    public JSONObject a(String s1, double d1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        ((br) (obj)).a("type", s1);
        ((br) (obj)).a("value", Double.valueOf(d1));
        s1 = ((br) (obj)).toString();
        obj = new RequestParametersBuilder.c();
        ((RequestParametersBuilder.c) (obj)).a(true).a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/activities/goals/daily.json"
        })).b(s1).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(((RequestParametersBuilder.c) (obj)).a()).f();
    }

    public JSONObject a(String s1, int i1, int j1)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("friend", s1);
        hashmap.put("count", Integer.toString(i1));
        hashmap.put("page", Integer.toString(j1));
        return (JSONObject)b("user/-/friends", "messages", hashmap, org/json/JSONObject);
    }

    public JSONObject a(String s1, int i1, int j1, Date date)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("offset", Integer.toString(i1));
        hashmap.put("limit", Integer.toString(j1));
        hashmap.put("beforeDate", com.fitbit.util.format.e.h(date));
        hashmap.put("sort", "desc");
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        date = s1;
        if (s1 == null)
        {
            date = "-";
        }
        return (JSONObject)a("1.1", stringbuilder.append(date).append("/foods/log").toString(), "listByDay", ((Map) (hashmap)), org/json/JSONObject);
    }

    public JSONObject a(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/invitation/").append(s2).append(".json").toString()
        }), "");
    }

    public JSONObject a(String s1, String s2, float f1, float f2, String s3, String s4, String s5, 
            Map map)
        throws ServerCommunicationException, JSONException
    {
        s1 = b(s1, s2, f1, f2, s3, s4, s5, map);
        s2 = new RequestParametersBuilder.c();
        s2.a(true).a(String.format("%s%s", new Object[] {
            i.a("1.1"), "/foods.json"
        })).b(s1).a(G()).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(s2.a()).f();
    }

    public JSONObject a(String s1, String s2, float f1, float f2, String s3, String s4, String s5, 
            Map map, Long long1)
        throws ServerCommunicationException, JSONException
    {
        s1 = b(s1, s2, f1, f2, s3, s4, s5, map);
        s2 = new RequestParametersBuilder.c();
        s2.a(true).a(String.format("%s%s", new Object[] {
            i.a("1.1"), (new StringBuilder()).append("/user/-/foods/").append(long1.toString()).append(".json").toString()
        })).b(s1).a(G()).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(s2.a()).f();
    }

    public JSONObject a(String s1, String s2, String s3)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("type", s1);
        br1.a("friend", s2);
        if (s3 != null)
        {
            br1.a("body", s3);
        }
        s1 = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/friends/messages.json"
        }), s1);
    }

    public JSONObject a(String s1, String s2, String s3, Integer integer)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (s2 != null)
        {
            br1.a("name", s2);
        }
        if (s3 != null)
        {
            br1.a("defaultUnit", s3);
        }
        if (integer != null)
        {
            br1.a("brightness", integer);
        }
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/devices/scale/").append(s1).append(".json").toString()
        }), br1.toString());
    }

    public JSONObject a(String s1, String s2, String s3, String s4, String s5, String s6)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("os", s1).a("versionRelease", s2).a("manufacturer", s3).a("model", s4).a("btleLibrary", s6).a("buildNumber", s5);
        s1 = a(String.format("%s/%s", new Object[] {
            i.n(), "devices/bluetooth-support-level.json"
        }), null, com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, false, F(), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (null)));
        s1.b(br1.toString());
        return (JSONObject)h.b(s1.a()).f();
    }

    public JSONObject a(String s1, String s2, String s3, Date date, Length length, String s4, Weight weight, 
            String s5, String s6, boolean flag)
        throws ServerCommunicationException, JSONException, SignupException
    {
        Locale locale = Locale.getDefault();
        br br1 = new br();
        br1.a("email", s1);
        br1.a("password", s2);
        br1.a("timezone", Calendar.getInstance().getTimeZone().getID());
        br1.a("localeLang", locale.getLanguage());
        br1.a("localeCountry", locale.getCountry());
        br1.a("emailSubscribe", Boolean.valueOf(flag));
        if (s3 != null)
        {
            br1.a("fullname", s3);
        }
        if (date != null)
        {
            br1.a("birthday", com.fitbit.util.format.e.c(date, bn.c()));
        }
        if (length != null)
        {
            br1.a("height", String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(length.a(com.fitbit.data.domain.Length.LengthUnits.CM).b())
            }));
        }
        if (s4 != null)
        {
            br1.a("heightUnit", s4);
        }
        if (weight != null)
        {
            br1.a("weight", String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(weight.a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b())
            }));
        }
        if (s5 != null)
        {
            br1.a("weightUnit", s5);
        }
        if (s6 != null)
        {
            br1.a("gender", s6);
        }
        s1 = br1.toString();
        s2 = new RequestParametersBuilder();
        s2.a(i.b()).b(s1).a(Collections.singletonList(new BasicHeader("Accept-Locale", al.e()))).a(com.fitbit.serverinteraction.validators.f.d()).a(com.fitbit.serverinteraction.b.f.b());
        return h.a(s2.a());
    }

    public JSONObject a(String s1, String s2, Date date)
        throws ServerCommunicationException, JSONException
    {
        s2 = new br();
        s2.a("tracker", s1);
        s2.a("date", com.fitbit.util.format.e.h(date));
        s1 = s2.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/heart.json"
        }), s1);
    }

    public JSONObject a(String s1, String s2, Set set)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (s2 == null || s2.length() <= 0) goto _L2; else goto _L1
_L1:
        br1.a("invitedUserId", s2);
_L4:
        if (set.isEmpty())
        {
            set.add(InviteSource.c);
        }
        br1.a("source", TextUtils.join(",", set));
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/friends/invitations.json"
        }), br1.toString());
_L2:
        if (s1 != null && s1.length() > 0)
        {
            br1.a("invitedUserEmail", s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JSONObject a(String s1, String s2, boolean flag, int i1, Date date, String s3, Integer integer, 
            Long long1, boolean flag1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("enabled", Boolean.valueOf(flag));
        br1.a("weekDays", Alarm.c(i1));
        date = new StringBuilder(com.fitbit.util.format.e.f(date));
        date.insert(date.length() - 2, ":");
        br1.a("time", date.toString());
        if (s3 != null)
        {
            br1.a("label", s3);
        }
        if (integer != null)
        {
            br1.a("snoozeCount", integer);
        }
        if (long1 != null)
        {
            br1.a("snoozeLength", long1);
        }
        br1.a("vibe", "DEFAULT");
        br1.a("recurring", Boolean.valueOf(flag1));
        date = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/devices/tracker/").append(s1).append("/alarms/").append(s2).append(".json").toString()
        }), date);
    }

    public JSONObject a(String s1, Date date)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "-";
        }
        return (JSONObject)a("1.1", stringbuilder.append(s2).append("/activities/date").toString(), com.fitbit.util.format.e.h(date), ((Map) (null)), ((com.fitbit.serverinteraction.validators.a) (I())), org/json/JSONObject, true, true);
    }

    public JSONObject a(String s1, Date date, Length length, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits, boolean flag, int i1, int j1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (s1 != null)
        {
            br1.a("gender", s1);
        }
        if (date != null)
        {
            br1.a("birthday", com.fitbit.util.format.e.c(date, bn.c()));
        }
        if (length != null)
        {
            br1.a("height", String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(length.a(com.fitbit.data.domain.Length.LengthUnits.CM).b())
            }));
        }
        if (s2 != null)
        {
            br1.a("nickname", s2);
        }
        if (s3 != null)
        {
            br1.a("fullname", s3);
        }
        if (s4 != null)
        {
            br1.a("timezone", s4);
        }
        if (s5 != null)
        {
            br1.a("foodsLocale", s5);
        }
        if (s6 != null)
        {
            br1.a("locale", s6);
        }
        if (s7 != null)
        {
            br1.a("heightUnit", s7);
        }
        if (s8 != null)
        {
            br1.a("weightUnit", s8);
        }
        if (waterunits != null)
        {
            br1.a("waterUnit", UnitSystem.getByWaterUnit(waterunits).getSerializableName());
            br1.a("waterUnitName", waterunits);
        }
        br1.a("customHeartRateZoneEnabled", Boolean.valueOf(flag));
        if (flag)
        {
            br1.a("customHeartRateZoneMin", Integer.valueOf(i1));
            br1.a("customHeartRateZoneMax", Integer.valueOf(j1));
        }
        s1 = br1.toString();
        return j(String.format("%s/%s", new Object[] {
            i.n(), "user/-/profile.json"
        }), s1);
    }

    public JSONObject a(String s1, Date date, Date date1, long l1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("startTime", com.fitbit.util.format.e.a(date1, bn.b()));
        br1.a("duration", Long.valueOf(l1));
        br1.a("date", com.fitbit.util.format.e.h(date));
        date = br1.toString();
        if (s1 == null)
        {
            s1 = String.format("%s%s", new Object[] {
                i.n(), "/user/-/sleep.json"
            });
        } else
        {
            s1 = String.format("%s/user/-/sleep/%s.json", new Object[] {
                i.n(), s1
            });
        }
        s1 = a(s1, ((String) (date)), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, F(), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (I())));
        return (JSONObject)h.b(s1.a()).f();
    }

    public JSONObject a(String s1, Date date, Set set)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("type", s1);
        if (date != null)
        {
            br1.a("startTime", com.fitbit.util.format.e.d(date));
        }
        if (set != null && set.size() > 0)
        {
            br1.a("inviteeIds", bh.a(set, ","));
        }
        s1 = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), "/user/-/challenges/create.json"
        }), s1);
    }

    public JSONObject a(String s1, Map map)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getValue() != null && !((String)entry.getValue()).equals(""))
            {
                br1.a((String)entry.getKey(), entry.getValue());
            }
        } while (true);
        return j(String.format("%s/user/-/devices/tracker/%s.json", new Object[] {
            i.n(), s1
        }), br1.toString());
    }

    public JSONObject a(String s1, Set set)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("inviteeIds", bh.a(set, ","));
        set = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/invitation/bulk.json").toString()
        }), set);
    }

    public JSONObject a(String s1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("accept", Boolean.valueOf(flag));
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/friends/invitations/").append(s1).append(".json").toString()
        }), br1.toString());
    }

    public JSONObject a(String s1, boolean flag, int i1, Date date, String s2, Integer integer, Long long1, 
            boolean flag1)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("enabled", Boolean.valueOf(flag));
        br1.a("weekDays", Alarm.c(i1));
        date = new StringBuilder(com.fitbit.util.format.e.f(date));
        date.insert(date.length() - 2, ":");
        br1.a("time", date.toString());
        if (s2 != null)
        {
            br1.a("label", s2);
        }
        if (integer != null)
        {
            br1.a("snoozeCount", integer);
        }
        if (long1 != null)
        {
            br1.a("snoozeLength", long1);
        }
        br1.a("vibe", "DEFAULT");
        br1.a("recurring", Boolean.valueOf(flag1));
        date = br1.toString();
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/devices/tracker/").append(s1).append("/alarms.json").toString()
        }), date);
    }

    public JSONObject a(Date date)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/foods/log/water/date", com.fitbit.util.format.e.h(date), org/json/JSONObject);
    }

    public JSONObject a(Date date, double d1, double d2)
        throws ServerCommunicationException, JSONException
    {
        return a(date, d1, d2, ((UnitSystem) (null)));
    }

    public JSONObject a(Date date, double d1, double d2, UnitSystem unitsystem)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        ((br) (obj)).a("startDate", com.fitbit.util.format.e.h(date));
        ((br) (obj)).a("startWeight", Double.valueOf(d1));
        ((br) (obj)).a("weight", Double.valueOf(d2));
        date = ((br) (obj)).toString();
        obj = new RequestParametersBuilder.c();
        ((RequestParametersBuilder.c) (obj)).a(true).a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/body/log/weight/goal.json"
        })).b(date).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        if (unitsystem != null)
        {
            ((RequestParametersBuilder.c) (obj)).a(a(unitsystem));
        }
        return (JSONObject)h.b(((RequestParametersBuilder.c) (obj)).a()).f();
    }

    public JSONObject a(Date date, DataRange datarange)
        throws ServerCommunicationException, JSONException
    {
        DataRange datarange1 = datarange;
        if (datarange == null)
        {
            datarange1 = com.fitbit.serverinteraction.DataRange.d;
        }
        return (JSONObject)a("user/-/activities/heart/date", (new StringBuilder()).append(com.fitbit.util.format.e.h(date)).append("/").append(com.fitbit.serverinteraction.DataRange.a(datarange1)).toString(), org/json/JSONObject);
    }

    public JSONObject a(Date date, String s1, UnitSystem unitsystem)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s/%s.json", new Object[] {
            i.n(), "user/-/body/log/weight/date", com.fitbit.util.format.e.h(date), s1
        }), unitsystem);
    }

    public JSONObject a(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return I(String.format("%s/%s/%s/%s.json", new Object[] {
            i.n(), "user/-/body/log/fat/date", com.fitbit.util.format.e.h(date), com.fitbit.util.format.e.h(date1)
        }));
    }

    public JSONObject a(Date date, Date date1, long l1)
        throws ServerCommunicationException, JSONException
    {
        return a(((String) (null)), date, date1, l1);
    }

    public JSONObject a(Date date, Date date1, UnitSystem unitsystem)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s/%s.json", new Object[] {
            i.n(), "user/-/body/log/weight/date", com.fitbit.util.format.e.h(date), com.fitbit.util.format.e.h(date1)
        }), unitsystem);
    }

    public JSONObject a(Date date, Map map)
        throws ServerCommunicationException
    {
        br br1;
        try
        {
            br1 = new br();
            String s1;
            for (Iterator iterator = (new TreeSet(map.keySet())).iterator(); iterator.hasNext(); br1.a(s1, String.format(Locale.US, "%.2f", new Object[] {
    map.get(s1)
})))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new ServerCommunicationException(date);
        }
        br1.a("date", com.fitbit.util.format.e.h(date));
        date = a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/body.json"
        }), br1.toString(), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b);
        return date;
    }

    public JSONObject a(Set set, int i1)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!set.isEmpty())
        {
            for (set = set.iterator(); set.hasNext(); stringbuilder.append((String)set.next()).append(",")) { }
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        set = a(a(((String) (null)), "user/-/friends", "suggestions", ((Map) (null))), (new br()).a("email", stringbuilder.toString()).a("secondsToWait", Integer.valueOf(i1)).toString(), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, F(), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (I())));
        return (JSONObject)h.b(set.a()).f();
    }

    public JSONObject a(boolean flag)
        throws ServerCommunicationException, JSONException
    {
        Map map = null;
        if (flag)
        {
            map = Collections.singletonMap("showEverything", "true");
        }
        return (JSONObject)b("user/-/friends", "leaderboard", map, org/json/JSONObject);
    }

    public JSONObject a(boolean flag, long l1, boolean flag1)
        throws ServerCommunicationException, JSONException
    {
        Object obj;
        obj = new br();
        ((br) (obj)).a("preferences", ProfilePreference.MULTI_DEVICE_SUPPORT.getJsonKey());
        obj = a(a(((String) (null)), "devices/client/tracker/data", "preferences", ((Map) (null))), ((br) (obj)).toString(), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, true, ((List) (null)), ((g) (com.fitbit.serverinteraction.b.f.b())), ((com.fitbit.serverinteraction.validators.a) (I())));
        ((RequestParametersBuilder) (obj)).a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.a).b(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b).b(true);
        if (!flag) goto _L2; else goto _L1
_L1:
        ((RequestParametersBuilder) (obj)).c(flag);
_L4:
        return (JSONObject)h.b(((RequestParametersBuilder) (obj)).a()).f();
_L2:
        ((RequestParametersBuilder) (obj)).a(l1).d(flag1);
        if (flag1)
        {
            ((RequestParametersBuilder) (obj)).e(true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JSONObject a(byte abyte0[])
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s", new Object[] {
            i.c(), "1/user/-/photo/profile.json"
        }), abyte0);
    }

    public JSONArray b()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a(((String) (null)), "user/-/activities", "recent", org/json/JSONArray);
    }

    public JSONArray b(Date date)
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("user/-/bp/date", com.fitbit.util.format.e.h(date), org/json/JSONArray);
    }

    public JSONObject b(double d1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        ((br) (obj)).a("fat", String.format(Locale.US, "%.2f", new Object[] {
            Double.valueOf(d1)
        }));
        obj = ((br) (obj)).toString();
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(true).a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/body/log/fat/goal.json"
        })).b(((String) (obj))).a(com.fitbit.serverinteraction.validators.f.a()).a(F()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(c1.a()).f();
    }

    public JSONObject b(String s1)
        throws ServerCommunicationException, JSONException
    {
        return I(s1);
    }

    public JSONObject b(String s1, int i1, int j1)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("offset", (new StringBuilder()).append(i1).append("").toString());
        hashmap.put("length", (new StringBuilder()).append(j1).append("").toString());
        return (JSONObject)b((new StringBuilder()).append("user/-/challenges/").append(s1).toString(), "messages", ((Map) (hashmap)), org/json/JSONObject);
    }

    public JSONObject b(String s1, int i1, int j1, Date date)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("offset", Integer.toString(i1));
        hashmap.put("limit", Integer.toString(j1));
        hashmap.put("beforeDate", com.fitbit.util.format.e.h(date));
        hashmap.put("sort", "desc");
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        date = s1;
        if (s1 == null)
        {
            date = "-";
        }
        return (JSONObject)a("1.1", stringbuilder.append(date).append("/sleep").toString(), "list", hashmap, org/json/JSONObject, true);
    }

    public JSONObject b(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (s2 != null)
        {
            br1.a("body", s2);
        }
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/messages/send.json").toString()
        }), br1.toString());
    }

    public JSONObject b(String s1, Date date)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "-";
        }
        return (JSONObject)a("1.1", stringbuilder.append(s2).append("/foods/log/date").toString(), com.fitbit.util.format.e.h(date), ((Map) (null)), org/json/JSONObject);
    }

    public JSONObject b(String s1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = "-";
        }
        return (JSONObject)a(null, stringbuilder.append(s2).toString(), "badges", null, I(), org/json/JSONObject, true, true, true, 60000L, com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b, flag);
    }

    public JSONObject b(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return I(String.format("%s/%s/%s/%s.json", new Object[] {
            i.n(), "user/-/sleep/date", com.fitbit.util.format.e.h(date), com.fitbit.util.format.e.h(date1)
        }));
    }

    public JSONArray c()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a(((String) (null)), "user/-/activities", "frequent", org/json/JSONArray);
    }

    public JSONArray c(Date date)
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("user/-/heart/date", com.fitbit.util.format.e.h(date), org/json/JSONArray);
    }

    public JSONObject c(double d1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = new br();
        ((br) (obj)).a("minDuration", Integer.valueOf((int)d1));
        obj = ((br) (obj)).toString();
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(true).a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/sleep/goal.json"
        })).b(((String) (obj))).a(I()).a(F()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(c1.a()).f();
    }

    public JSONObject c(String s1)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "-";
        }
        return (JSONObject)a(stringbuilder.append(s2).toString(), "profile", org/json/JSONObject);
    }

    public JSONObject c(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/messages/").append(s2).append("/cheer.json").toString()
        }), br1.toString());
    }

    public JSONObject c(String s1, Date date)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "-";
        }
        return (JSONObject)a(stringbuilder.append(s2).append("/sleep/date").toString(), com.fitbit.util.format.e.h(date), org/json/JSONObject);
    }

    public JSONObject c(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/-/activities/calories/date/").append(com.fitbit.util.format.e.h(date)).toString(), com.fitbit.util.format.e.h(date1), ((Map) (null)), org/json/JSONObject, true);
    }

    public JSONArray d()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("1.1", "user/-/foods/log", "recent", ((Map) (null)), org/json/JSONArray);
    }

    public JSONArray d(Date date)
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("user/-/glucose/date", com.fitbit.util.format.e.h(date), org/json/JSONArray);
    }

    public JSONObject d(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.a("1.1"), "user/-/activities", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject d(String s1, Date date)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        if (date != null)
        {
            br1.a("startTime", com.fitbit.util.format.e.d(date));
        }
        return j(String.format("%s/user/-/challenges/%s/rematch.json", new Object[] {
            i.n(), s1
        }), br1.toString());
    }

    public JSONObject d(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/-/activities/steps/date/").append(com.fitbit.util.format.e.h(date)).toString(), com.fitbit.util.format.e.h(date1), ((Map) (null)), org/json/JSONObject, true);
    }

    public void d(String s1, String s2)
        throws ServerCommunicationException
    {
        s1 = a(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/devices/tracker/").append(s1).append("/alarms/").append(s2).append(".json").toString()
        }), null, ServerGateway.HttpMethods.c, true, F(), ((g) (null)), I());
        h.b(s1.a());
    }

    public JSONArray e()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("1.1", "user/-/foods/log", "frequent", ((Map) (null)), org/json/JSONArray);
    }

    public JSONObject e(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.a("1.1"), "user/-/foods/log", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject e(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap();
        if (s1 != null)
        {
            hashmap.put("localeLang", s1);
        }
        if (s2 != null)
        {
            hashmap.put("localeCountry", s2);
        }
        return (JSONObject)a("locales", "resolve", hashmap, org/json/JSONObject, false);
    }

    public JSONObject e(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/-/activities/floors/date/").append(com.fitbit.util.format.e.h(date)).toString(), com.fitbit.util.format.e.h(date1), ((Map) (null)), org/json/JSONObject, true);
    }

    public JSONObject f()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("1.1", "user/-", "meals", ((Map) (null)), org/json/JSONObject);
    }

    public JSONObject f(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.n(), "user/-/foods/log/water", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject f(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        s1 = String.format("user/-/devices/tracker/%s/sync.json", new Object[] {
            s1
        });
        s1 = String.format("%s/%s", new Object[] {
            i.n(), s1
        });
        RequestParametersBuilder.RequestParameters.d d1 = new RequestParametersBuilder.RequestParameters.d(s2) {

            final String a;
            final PublicAPI b;

            void a(HttpURLConnection httpurlconnection)
            {
                com.fitbit.util.c.d.a(httpurlconnection);
            }

            void a(HttpURLConnection httpurlconnection, OAuthConsumer oauthconsumer)
            {
                httpurlconnection = com.fitbit.util.c.d.a(a);
                HttpParameters httpparameters = new HttpParameters();
                httpparameters.a("oauth_body_hash", httpurlconnection);
                oauthconsumer.a(httpparameters);
            }

            
            {
                b = PublicAPI.this;
                a = s1;
                super();
            }
        };
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(s1).b(s2).a(RequestParametersBuilder.RequestParameters.ContentType.c).a(I()).a(F()).a(com.fitbit.serverinteraction.b.f.b()).a(d1);
        try
        {
            s1 = h.b(c1.a());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.a(com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.b);
            throw s1;
        }
        return (JSONObject)s1.f();
    }

    public JSONObject f(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/-/activities/distance/date/").append(com.fitbit.util.format.e.h(date)).toString(), com.fitbit.util.format.e.h(date1), ((Map) (null)), org/json/JSONObject, true);
    }

    public JSONObject g()
        throws ServerCommunicationException, JSONException
    {
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(true).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.a).a(String.format("%s%s", new Object[] {
            i.a("1.1"), "/user/-/foods.json"
        })).a(G()).a(I()).a(com.fitbit.serverinteraction.b.f.b());
        return (JSONObject)h.b(c1.a()).f();
    }

    public JSONObject g(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.n(), "user/-/sleep", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject g(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("badgeId", s1);
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/").append(s2).append("/badges/cheer.json").toString()
        }), br1.toString());
    }

    public JSONObject g(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/-/activities/minutesVeryActive/date/").append(com.fitbit.util.format.e.h(date)).toString(), com.fitbit.util.format.e.h(date1), ((Map) (null)), org/json/JSONObject, true);
    }

    public JSONObject h()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-", "friends", org/json/JSONObject);
    }

    public JSONObject h(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.n(), "user/-/heart", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject h(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("email", s1);
        br1.a("password", s2);
        s1 = a(a(((String) (null)), "account/register", "validate", ((Map) (null))), br1.toString(), com.fitbit.serverinteraction.ServerGateway.HttpMethods.b, false, F(), com.fitbit.serverinteraction.b.f.b(), I());
        return (JSONObject)h.b(s1.a()).f();
    }

    public JSONArray i()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("user/-", "devices", org/json/JSONArray);
    }

    public JSONObject i(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.n(), "user/-/bp", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject i(String s1, String s2)
        throws ServerCommunicationException, JSONException
    {
        br br1 = new br();
        br1.a("facebookAccessToken", s1).a("facebookUID", s2);
        return j(String.format("%s/%s", new Object[] {
            i.n(), "user/-/account/link/facebook.json"
        }), br1.toString());
    }

    public JSONArray j()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("foods", "units", ((Map) (null)), org/json/JSONArray);
    }

    public JSONArray j(String s1)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "-";
        }
        return (JSONArray)a(stringbuilder.append(s2).append("/foods/log").toString(), "favorite", ((Map) (null)), org/json/JSONArray);
    }

    public JSONArray k()
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("foods", "locales", ((Map) (null)), org/json/JSONArray);
    }

    public JSONObject k(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.n(), "user/-/foods/log/favorite", s1
        }), "", com.fitbit.serverinteraction.ServerGateway.HttpMethods.b);
    }

    public JSONObject l()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a(((String) (null)), "activities", org/json/JSONObject);
    }

    public JSONObject l(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s/%s/%s.json", new Object[] {
            i.n(), "user/-/foods/log/favorite", s1
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject m()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/devices", "scale", org/json/JSONObject);
    }

    public JSONObject m(String s1)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("query", com.fitbit.util.t.a(s1));
        return (JSONObject)b("1", "foods", "search", hashmap, org/json/JSONObject);
    }

    public JSONObject n()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-", "notifications", org/json/JSONObject);
    }

    public JSONObject n(String s1)
        throws ServerCommunicationException, JSONException
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("barcode", s1);
        return (JSONObject)b("1.1", "foods", "search", hashmap, org/json/JSONObject);
    }

    public JSONObject o()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-", "challenges", org/json/JSONObject);
    }

    public JSONObject o(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a((new StringBuilder()).append("user/").append(s1).toString(), "friends", org/json/JSONObject);
    }

    public JSONArray p(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONArray)a("user/-/friends/leaders", s1, org/json/JSONArray);
    }

    public JSONObject p()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/challenges", "types", org/json/JSONObject);
    }

    public JSONObject q()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/activities/goals", "daily", ((Map) (null)), org/json/JSONObject, false);
    }

    public JSONObject q(String s1)
        throws ServerCommunicationException, JSONException
    {
        s1 = a(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/friends/").append(s1).append(".json").toString()
        }), null, ServerGateway.HttpMethods.c, true, F(), com.fitbit.serverinteraction.b.f.b(), I());
        return (JSONObject)h.b(s1.a()).f();
    }

    public JSONObject r()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/activities/goals", "weekly", ((Map) (null)), org/json/JSONObject, false);
    }

    public JSONObject r(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/devices", s1, org/json/JSONObject);
    }

    public JSONObject s()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/body/log/weight", "goal", ((Map) (null)), org/json/JSONObject, false);
    }

    public JSONObject s(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("1.1", "activities", s1, org/json/JSONObject);
    }

    public JSONObject t()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/sleep", "goal", ((Map) (null)), org/json/JSONObject, false);
    }

    public JSONObject t(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("1.1", "foods", s1, ((Map) (null)), org/json/JSONObject);
    }

    public JSONObject u()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/body/log/fat", "goal", org/json/JSONObject);
    }

    public JSONObject u(String s1)
        throws ServerCommunicationException, JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("user/");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "-";
        }
        return (JSONObject)b(stringbuilder.append(s2).append("/friends").toString(), "leaderboard", Collections.singletonMap("showAllFriends", "true"), org/json/JSONObject);
    }

    public JSONObject v()
        throws ServerCommunicationException, JSONException
    {
        return a(String.format("%s%s", new Object[] {
            i.n(), "/user/-/sleep/goal.json"
        }), ((String) (null)), ServerGateway.HttpMethods.c);
    }

    public JSONObject v(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)b("user/-/friends", "messages", Collections.singletonMap("friend", s1), org/json/JSONObject);
    }

    public JSONObject w()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/foods/log", "goal", org/json/JSONObject);
    }

    public JSONObject w(String s1)
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/challenges", s1, org/json/JSONObject);
    }

    public JSONObject x()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/devices", "tracker", org/json/JSONObject);
    }

    public JSONObject x(String s1)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/quit.json").toString()
        }), "");
    }

    public JSONObject y()
        throws ServerCommunicationException, JSONException
    {
        return (JSONObject)a("user/-/devices/tracker", "options", org/json/JSONObject);
    }

    public JSONObject y(String s1)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/invitation/accept.json").toString()
        }), "");
    }

    public JSONObject z()
        throws ServerCommunicationException, JSONException
    {
        return a((JSONObject)a("user/-/friends", "invitations", org/json/JSONObject), k);
    }

    public JSONObject z(String s1)
        throws ServerCommunicationException, JSONException
    {
        return j(String.format("%s%s", new Object[] {
            i.n(), (new StringBuilder()).append("/user/-/challenges/").append(s1).append("/invitation/decline.json").toString()
        }), "");
    }

    static 
    {
        a = -1;
        k = TimeUnit.DAYS.toMillis(1L);
    }

    // Unreferenced inner class com/fitbit/serverinteraction/PublicAPI$a$a
    /* block-local class not found */
    class a.a {}

}
