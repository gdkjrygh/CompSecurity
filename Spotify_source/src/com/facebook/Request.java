// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import aol;
import aom;
import aon;
import aoo;
import aop;
import aoq;
import aor;
import aos;
import aot;
import aou;
import aov;
import aow;
import aoz;
import apf;
import aph;
import arb;
import arc;
import ark;
import arp;
import ars;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.GraphUser;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            HttpMethod, FacebookException, Session, SessionState, 
//            AccessToken, AccessTokenSource, LoggingBehavior

public class Request
{

    private static String h = com/facebook/Request.getSimpleName();
    private static Pattern i = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String l;
    public Session a;
    public GraphObject b;
    public Bundle c;
    public aoo d;
    public Object e;
    public String f;
    public boolean g;
    private HttpMethod j;
    private String k;

    public Request()
    {
        this(null, null, null, null, null);
    }

    public Request(Session session, String s, Bundle bundle, HttpMethod httpmethod)
    {
        this(session, s, bundle, httpmethod, null);
    }

    public Request(Session session, String s, Bundle bundle, HttpMethod httpmethod, aoo aoo)
    {
        this(session, s, bundle, httpmethod, aoo, (byte)0);
    }

    private Request(Session session, String s, Bundle bundle, HttpMethod httpmethod, aoo aoo, byte byte0)
    {
        g = false;
        a = session;
        k = s;
        d = aoo;
        f = null;
        if (httpmethod == null)
        {
            httpmethod = HttpMethod.a;
        }
        j = httpmethod;
        if (bundle != null)
        {
            c = new Bundle(bundle);
        } else
        {
            c = new Bundle();
        }
        if (f == null)
        {
            f = ark.d();
        }
    }

    public static transient aot a(Request arequest[])
    {
        ars.a(arequest, "requests");
        return b(new aou(Arrays.asList(arequest)));
    }

    public static Request a(Session session, aop aop)
    {
        return new Request(session, "me", null, null, new aoo(aop) {

            private aop a;

            public final void a(aoz aoz1)
            {
                if (a != null)
                {
                    a.a((GraphUser)aoz1.a(com/facebook/model/GraphUser), aoz1);
                }
            }

            
            {
                a = aop1;
                super();
            }
        });
    }

    public static Request a(String s)
    {
        return new Request(null, s, null, null, null);
    }

    public static Request a(String s, GraphObject graphobject)
    {
        s = new Request(null, s, null, HttpMethod.b, null);
        s.b = graphobject;
        return s;
    }

    public static List a(aou aou1)
    {
        Object obj;
        Object obj1;
        ars.c(aou1, "requests");
        int i1;
        try
        {
            obj1 = c(aou1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = aoz.a(aou1.b, null, new FacebookException(((Throwable) (obj))));
            a(aou1, ((List) (obj)));
            return ((List) (obj));
        }
        obj = aoz.a(((HttpURLConnection) (obj1)), aou1);
        arp.a(((java.net.URLConnection) (obj1)));
        i1 = aou1.size();
        if (i1 != ((List) (obj)).size())
        {
            throw new FacebookException(String.format("Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(((List) (obj)).size()), Integer.valueOf(i1)
            }));
        }
        a(aou1, ((List) (obj)));
        obj1 = new HashSet();
        aou1 = aou1.iterator();
        do
        {
            if (!aou1.hasNext())
            {
                break;
            }
            Request request = (Request)aou1.next();
            if (request.a != null)
            {
                ((HashSet) (obj1)).add(request.a);
            }
        } while (true);
        obj1 = ((HashSet) (obj1)).iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Session session = (Session)((Iterator) (obj1)).next();
        Object obj2;
        boolean flag;
        if (session.currentTokenRefreshRequest != null)
        {
            flag = false;
        } else
        {
            aou1 = new Date();
            if (session.state.a() && session.tokenInfo.source.canExtendToken && aou1.getTime() - session.lastAttemptedTokenExtendDate.getTime() > 0x36ee80L && aou1.getTime() - session.tokenInfo.lastRefresh.getTime() > 0x5265c00L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        obj2 = session.lock;
        obj2;
        JVM INSTR monitorenter ;
        if (session.currentTokenRefreshRequest != null)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        aou1 = new apf(session);
        session.currentTokenRefreshRequest = aou1;
_L5:
        if (aou1 != null)
        {
            obj2 = arc.a(Session.b);
            if (obj2 != null && Session.b.bindService(((android.content.Intent) (obj2)), aou1, 1))
            {
                ((apf) (aou1)).a.lastAttemptedTokenExtendDate = new Date();
            } else
            {
                aou1.a();
            }
        }
          goto _L4
        aou1;
        obj2;
        JVM INSTR monitorexit ;
        throw aou1;
_L2:
        return ((List) (obj));
        aou1 = null;
          goto _L5
    }

    private static void a(Bundle bundle, aos aos1, Request request)
    {
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            if (d(obj))
            {
                aos1.a(s, obj, request);
            }
        } while (true);
    }

    private static void a(aos aos1, Collection collection, Map map)
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((Request)iterator.next()).a(jsonarray, map)) { }
        aos1.a("batch", jsonarray, collection);
    }

    private static void a(aou aou1, arb arb1, int i1, URL url, OutputStream outputstream)
    {
        outputstream = new aos(outputstream, arb1);
        if (i1 == 1)
        {
            aou1 = aou1.a(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((Request) (aou1)).c.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Object obj = ((Request) (aou1)).c.get(s);
                if (c(obj))
                {
                    hashmap.put(s, new aon(aou1, obj));
                }
            } while (true);
            if (arb1 != null)
            {
                aph.a();
            }
            a(((Request) (aou1)).c, ((aos) (outputstream)), ((Request) (aou1)));
            if (arb1 != null)
            {
                aph.a();
            }
            a(((Map) (hashmap)), ((aos) (outputstream)));
            if (((Request) (aou1)).b != null)
            {
                a(((Request) (aou1)).b, url.getPath(), ((aoq) (outputstream)));
            }
            return;
        }
        url = e(aou1);
        if (arp.a(url))
        {
            throw new FacebookException("At least one request in a batch must have an open Session, or a default app ID must be specified.");
        }
        outputstream.a("batch_app_id", url);
        url = new HashMap();
        a(((aos) (outputstream)), ((Collection) (aou1)), ((Map) (url)));
        if (arb1 != null)
        {
            aph.a();
        }
        a(((Map) (url)), ((aos) (outputstream)));
    }

    private static void a(aou aou1, List list)
    {
label0:
        {
            int j1 = aou1.size();
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < j1; i1++)
            {
                Request request = aou1.a(i1);
                if (request.d != null)
                {
                    arraylist.add(new Pair(request.d, list.get(i1)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new Runnable(arraylist, aou1) {

                    private ArrayList a;
                    private aou b;

                    public final void run()
                    {
                        Pair pair;
                        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((aoo)pair.first).a((aoz)pair.second))
                        {
                            pair = (Pair)iterator.next();
                        }

                        for (Iterator iterator1 = b.d.iterator(); iterator1.hasNext(); ((aov)iterator1.next()).a()) { }
                    }

            
            {
                a = arraylist;
                b = aou1;
                super();
            }
                };
                aou1 = aou1.a;
                if (aou1 != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        aou1.post(list);
    }

    private static void a(GraphObject graphobject, String s, aoq aoq1)
    {
        Object obj = i.matcher(s);
        int i1;
        if (((Matcher) (obj)).matches())
        {
            obj = ((Matcher) (obj)).group(1);
        } else
        {
            obj = s;
        }
        if (((String) (obj)).startsWith("me/") || ((String) (obj)).startsWith("/me/"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = s.indexOf(":");
            int j1 = s.indexOf("?");
            if (i1 > 3 && (j1 == -1 || i1 < j1))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        } else
        {
            i1 = 0;
        }
        graphobject = graphobject.asMap().entrySet().iterator();
        while (graphobject.hasNext()) 
        {
            s = (java.util.Map.Entry)graphobject.next();
            boolean flag;
            if (i1 != 0 && ((String)s.getKey()).equalsIgnoreCase("image"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a((String)s.getKey(), s.getValue(), aoq1, flag);
        }
    }

    private static void a(String s, Object obj, aoq aoq1, boolean flag)
    {
label0:
        {
            Object obj1;
            Object obj2;
            do
            {
                Class class1 = obj.getClass();
                if (com/facebook/model/GraphObject.isAssignableFrom(class1))
                {
                    obj1 = ((GraphObject)obj).getInnerJSONObject();
                    obj2 = obj1.getClass();
                } else
                {
                    obj1 = obj;
                    obj2 = class1;
                    if (com/facebook/model/GraphObjectList.isAssignableFrom(class1))
                    {
                        obj1 = ((GraphObjectList)obj).getInnerJSONArray();
                        obj2 = obj1.getClass();
                    }
                }
                if (!org/json/JSONObject.isAssignableFrom(((Class) (obj2))))
                {
                    break;
                }
                obj = (JSONObject)obj1;
                if (flag)
                {
                    for (obj1 = ((JSONObject) (obj)).keys(); ((Iterator) (obj1)).hasNext(); a(String.format("%s[%s]", new Object[] {
    s, obj2
}), ((JSONObject) (obj)).opt(((String) (obj2))), aoq1, flag))
                    {
                        obj2 = (String)((Iterator) (obj1)).next();
                    }

                    break label0;
                }
                if (((JSONObject) (obj)).has("id"))
                {
                    obj = ((JSONObject) (obj)).optString("id");
                } else
                if (((JSONObject) (obj)).has("url"))
                {
                    obj = ((JSONObject) (obj)).optString("url");
                } else
                {
                    if (!((JSONObject) (obj)).has("fbsdk:create_object"))
                    {
                        break label0;
                    }
                    obj = ((JSONObject) (obj)).toString();
                }
            } while (true);
            if (org/json/JSONArray.isAssignableFrom(((Class) (obj2))))
            {
                obj = (JSONArray)obj1;
                int j1 = ((JSONArray) (obj)).length();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    a(String.format("%s[%d]", new Object[] {
                        s, Integer.valueOf(i1)
                    }), ((JSONArray) (obj)).opt(i1), aoq1, flag);
                }

            } else
            if (java/lang/String.isAssignableFrom(((Class) (obj2))) || java/lang/Number.isAssignableFrom(((Class) (obj2))) || java/lang/Boolean.isAssignableFrom(((Class) (obj2))))
            {
                aoq1.a(s, obj1.toString());
            } else
            if (java/util/Date.isAssignableFrom(((Class) (obj2))))
            {
                obj = (Date)obj1;
                aoq1.a(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
                return;
            }
        }
    }

    private static void a(Map map, aos aos1)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            aon aon1 = (aon)map.get(s);
            if (c(aon1.b))
            {
                aos1.a(s, aon1.b, aon1.a);
            }
        } while (true);
    }

    private void a(JSONArray jsonarray, Map map)
    {
        JSONObject jsonobject = new JSONObject();
        String s = d();
        jsonobject.put("relative_url", s);
        jsonobject.put("method", j);
        if (a != null)
        {
            arb.a(a.d());
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = c.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = c.get(((String) (obj)));
            if (c(obj))
            {
                String s1 = String.format("%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s1);
                map.put(s1, new aon(this, obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        if (b != null)
        {
            map = new ArrayList();
            a(b, s, new aoq(map) {

                private ArrayList a;

                public final void a(String s2, String s3)
                {
                    a.add(String.format("%s=%s", new Object[] {
                        s2, URLEncoder.encode(s3, "UTF-8")
                    }));
                }

            
            {
                a = arraylist;
                super();
            }
            });
            jsonobject.put("body", TextUtils.join("&", map));
        }
        jsonarray.put(jsonobject);
    }

    public static boolean a(Object obj)
    {
        return d(obj);
    }

    public static aot b(aou aou1)
    {
        ars.c(aou1, "requests");
        aou1 = new aot(aou1);
        aou1.a();
        return aou1;
    }

    public static String b(Object obj)
    {
        return e(obj);
    }

    private String b(String s)
    {
        android.net.Uri.Builder builder;
label0:
        {
            builder = (new android.net.Uri.Builder()).encodedPath(s);
label1:
            do
            {
                String s1;
                for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s1, e(s).toString()))
                {
                    s1 = (String)iterator.next();
                    Object obj = c.get(s1);
                    s = ((String) (obj));
                    if (obj == null)
                    {
                        s = "";
                    }
                    if (!d(s))
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (j != HttpMethod.a);
            throw new IllegalArgumentException(String.format("Unsupported parameter type for GET request: %s", new Object[] {
                s.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    private static HttpURLConnection c(aou aou1)
    {
        if (aou1.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj = new URL(aou1.a(0).b());
_L3:
        HttpURLConnection httpurlconnection;
        arb arb1;
        URL url;
        int j1;
        try
        {
            httpurlconnection = (HttpURLConnection)((URL) (obj)).openConnection();
            if (l == null)
            {
                l = String.format("%s.%s", new Object[] {
                    "FBAndroidSDK", "3.19.1"
                });
            }
            httpurlconnection.setRequestProperty("User-Agent", l);
            httpurlconnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", new Object[] {
                "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
            }));
            httpurlconnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpurlconnection.setChunkedStreamingMode(0);
            arb1 = new arb(LoggingBehavior.a, "Request");
            j1 = aou1.size();
        }
        // Misplaced declaration of an exception variable
        catch (aou aou1)
        {
            throw new FacebookException("could not construct request body", aou1);
        }
        // Misplaced declaration of an exception variable
        catch (aou aou1)
        {
            throw new FacebookException("could not construct request body", aou1);
        }
        if (j1 != 1)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj = aou1.a(0).j;
_L4:
        httpurlconnection.setRequestMethod(((HttpMethod) (obj)).name());
        url = httpurlconnection.getURL();
        aph.a();
        arb.a("Id", aou1.c);
        arb.a("URL", url);
        arb.a("Method", httpurlconnection.getRequestMethod());
        arb.a("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        arb.a("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(0);
        httpurlconnection.setReadTimeout(0);
        int i1;
        if (obj == HttpMethod.b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        arb1.d();
        return httpurlconnection;
_L2:
        try
        {
            obj = new URL(ark.b());
        }
        // Misplaced declaration of an exception variable
        catch (aou aou1)
        {
            throw new FacebookException("could not construct URL for request", aou1);
        }
          goto _L3
        obj = HttpMethod.b;
          goto _L4
        httpurlconnection.setDoOutput(true);
        if (!d(aou1))
        {
            break MISSING_BLOCK_LABEL_388;
        }
        obj = new aol(aou1.a);
        a(aou1, null, j1, url, ((OutputStream) (obj)));
        i1 = ((aol) (obj)).b;
        obj = ((aol) (obj)).a;
        obj = new aom(new BufferedOutputStream(httpurlconnection.getOutputStream()), aou1, ((Map) (obj)), i1);
_L5:
        a(aou1, arb1, j1, url, ((OutputStream) (obj)));
        ((OutputStream) (obj)).close();
        arb1.d();
        return httpurlconnection;
        obj = new BufferedOutputStream(httpurlconnection.getOutputStream());
          goto _L5
        aou1;
        obj = null;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        ((OutputStream) (obj)).close();
        throw aou1;
        aou1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void c()
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        if (!a.a())
        {
            throw new FacebookException("Session provided to a Request in un-opened state.");
        }
        if (!c.containsKey("access_token"))
        {
            String s = a.d();
            arb.a(s);
            c.putString("access_token", s);
        }
_L4:
        c.putString("sdk", "android");
        c.putString("format", "json");
        return;
_L2:
        if (!g && !c.containsKey("access_token"))
        {
            String s1 = aph.i();
            String s2 = aph.j();
            if (!arp.a(s1) && !arp.a(s2))
            {
                s1 = (new StringBuilder()).append(s1).append("|").append(s2).toString();
                c.putString("access_token", s1);
            } else
            {
                Log.d(h, "Warning: Sessionless Request needs token but missing either application ID or client token.");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean c(Object obj)
    {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelFileDescriptorWithMimeType);
    }

    private String d()
    {
        String s = e();
        c();
        return b(s);
    }

    private static boolean d(aou aou1)
    {
        for (Iterator iterator = aou1.d.iterator(); iterator.hasNext();)
        {
            if ((aov)iterator.next() instanceof aow)
            {
                return true;
            }
        }

        for (aou1 = aou1.iterator(); aou1.hasNext();)
        {
            if (((Request)aou1.next()).d instanceof aor)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean d(Object obj)
    {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    private String e()
    {
        if (i.matcher(k).matches())
        {
            return k;
        } else
        {
            return String.format("%s/%s", new Object[] {
                f, k
            });
        }
    }

    private static String e(aou aou1)
    {
        if (!arp.a(aou1.e))
        {
            return aou1.e;
        }
        for (aou1 = aou1.iterator(); aou1.hasNext();)
        {
            Session session = ((Request)aou1.next()).a;
            if (session != null)
            {
                return session.applicationId;
            }
        }

        return null;
    }

    private static String e(Object obj)
    {
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number))
        {
            return obj.toString();
        }
        if (obj instanceof Date)
        {
            return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(obj);
        } else
        {
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
    }

    public final aoz a()
    {
        Request arequest[] = new Request[1];
        arequest[0] = this;
        ars.a(arequest, "requests");
        List list = a(new aou(Arrays.asList(arequest)));
        if (list == null || list.size() != 1)
        {
            throw new FacebookException("invalid state: expected a single response");
        } else
        {
            return (aoz)list.get(0);
        }
    }

    public final String b()
    {
        String s;
        if (j == HttpMethod.b && k != null && k.endsWith("/videos"))
        {
            s = ark.c();
        } else
        {
            s = ark.b();
        }
        s = String.format("%s/%s", new Object[] {
            s, e()
        });
        c();
        return b(s);
    }

    public String toString()
    {
        return (new StringBuilder("{Request:  session: ")).append(a).append(", graphPath: ").append(k).append(", graphObject: ").append(b).append(", httpMethod: ").append(j).append(", parameters: ").append(c).append("}").toString();
    }


    private class ParcelFileDescriptorWithMimeType
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new ParcelFileDescriptorWithMimeType(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new ParcelFileDescriptorWithMimeType[i1];
            }

        };
        public final String a;
        public final ParcelFileDescriptor b;

        public int describeContents()
        {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(a);
            parcel.writeFileDescriptor(b.getFileDescriptor());
        }


        private ParcelFileDescriptorWithMimeType(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readFileDescriptor();
        }

        ParcelFileDescriptorWithMimeType(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

}
