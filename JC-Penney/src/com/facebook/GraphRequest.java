// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.b.ak;
import com.facebook.b.al;
import com.facebook.b.ar;
import com.facebook.b.z;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ao, m, an, ak, 
//            d, ai, ac, aq, 
//            av, aw, aa, af, 
//            AccessToken, ab, aj, al, 
//            am, ag, s, z, 
//            ad

public class GraphRequest
{

    public static final String a = com/facebook/GraphRequest.getSimpleName();
    private static String b;
    private static Pattern c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String q;
    private AccessToken d;
    private ao e;
    private String f;
    private JSONObject g;
    private String h;
    private String i;
    private boolean j;
    private Bundle k;
    private ad l;
    private String m;
    private Object n;
    private String o;
    private boolean p;

    public GraphRequest()
    {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s1, Bundle bundle, ao ao1, ad ad)
    {
        this(accesstoken, s1, bundle, ao1, ad, null);
    }

    public GraphRequest(AccessToken accesstoken, String s1, Bundle bundle, ao ao1, ad ad, String s2)
    {
        j = true;
        p = false;
        d = accesstoken;
        f = s1;
        o = s2;
        a(ad);
        a(ao1);
        if (bundle != null)
        {
            k = new Bundle(bundle);
        } else
        {
            k = new Bundle();
        }
        if (o == null)
        {
            o = ak.d();
        }
    }

    public static GraphRequest a(AccessToken accesstoken, String s1, ad ad)
    {
        return new GraphRequest(accesstoken, s1, null, null, ad);
    }

    public static GraphRequest a(AccessToken accesstoken, String s1, JSONObject jsonobject, ad ad)
    {
        accesstoken = new GraphRequest(accesstoken, s1, null, ao.b, ad);
        accesstoken.a(jsonobject);
        return accesstoken;
    }

    public static an a(GraphRequest graphrequest)
    {
        graphrequest = a(new GraphRequest[] {
            graphrequest
        });
        if (graphrequest == null || graphrequest.size() != 1)
        {
            throw new m("invalid state: expected a single response");
        } else
        {
            return (an)graphrequest.get(0);
        }
    }

    private String a(String s1)
    {
        android.net.Uri.Builder builder;
label0:
        {
            builder = (new android.net.Uri.Builder()).encodedPath(s1);
label1:
            do
            {
                String s2;
                for (Iterator iterator = k.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s2, f(s1).toString()))
                {
                    s2 = (String)iterator.next();
                    Object obj = k.get(s2);
                    s1 = ((String) (obj));
                    if (obj == null)
                    {
                        s1 = "";
                    }
                    if (!e(s1))
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (e != ao.a);
            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
                s1.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    public static HttpURLConnection a(com.facebook.ak ak1)
    {
        Object obj;
        if (ak1.size() != 1)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = new URL(ak1.a(0).j());
_L1:
        try
        {
            obj = a(((URL) (obj)));
            a(ak1, ((HttpURLConnection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.ak ak1)
        {
            throw new m("could not construct request body", ak1);
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.ak ak1)
        {
            throw new m("could not construct request body", ak1);
        }
        return ((HttpURLConnection) (obj));
        try
        {
            obj = new URL(ak.b());
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.ak ak1)
        {
            throw new m("could not construct URL for request", ak1);
        }
          goto _L1
    }

    private static HttpURLConnection a(URL url)
    {
        url = (HttpURLConnection)url.openConnection();
        url.setRequestProperty("User-Agent", n());
        url.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        url.setChunkedStreamingMode(0);
        return url;
    }

    public static List a(HttpURLConnection httpurlconnection, com.facebook.ak ak1)
    {
        List list = an.a(httpurlconnection, ak1);
        al.a(httpurlconnection);
        int i1 = ak1.size();
        if (i1 != list.size())
        {
            throw new m(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(i1)
            }));
        } else
        {
            a(ak1, list);
            com.facebook.d.a().d();
            return list;
        }
    }

    public static List a(Collection collection)
    {
        return b(new com.facebook.ak(collection));
    }

    public static transient List a(GraphRequest agraphrequest[])
    {
        ar.a(agraphrequest, "requests");
        return a(((Collection) (Arrays.asList(agraphrequest))));
    }

    private static void a(Bundle bundle, ai ai1, GraphRequest graphrequest)
    {
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            Object obj = bundle.get(s1);
            if (e(obj))
            {
                ai1.a(s1, obj, graphrequest);
            }
        } while (true);
    }

    private static void a(ai ai1, Collection collection, Map map)
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).a(jsonarray, map)) { }
        ai1.a("batch", jsonarray, collection);
    }

    private static void a(com.facebook.ak ak1, z z1, int i1, URL url, OutputStream outputstream, boolean flag)
    {
        outputstream = new ai(outputstream, z1, flag);
        if (i1 == 1)
        {
            ak1 = ak1.a(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((GraphRequest) (ak1)).k.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                Object obj = ((GraphRequest) (ak1)).k.get(s1);
                if (d(obj))
                {
                    hashmap.put(s1, new ac(ak1, obj));
                }
            } while (true);
            if (z1 != null)
            {
                z1.c("  Parameters:\n");
            }
            a(((GraphRequest) (ak1)).k, ((ai) (outputstream)), ((GraphRequest) (ak1)));
            if (z1 != null)
            {
                z1.c("  Attachments:\n");
            }
            a(((Map) (hashmap)), ((ai) (outputstream)));
            if (((GraphRequest) (ak1)).g != null)
            {
                a(((GraphRequest) (ak1)).g, url.getPath(), ((af) (outputstream)));
            }
            return;
        }
        url = f(ak1);
        if (al.a(url))
        {
            throw new m("App ID was not specified at the request or Settings.");
        }
        outputstream.a("batch_app_id", url);
        url = new HashMap();
        a(((ai) (outputstream)), ((Collection) (ak1)), ((Map) (url)));
        if (z1 != null)
        {
            z1.c("  Attachments:\n");
        }
        a(((Map) (url)), ((ai) (outputstream)));
    }

    static final void a(com.facebook.ak ak1, HttpURLConnection httpurlconnection)
    {
        z z1;
        URL url;
        int j1;
        boolean flag1;
        z1 = new z(aq.a, "Request");
        j1 = ak1.size();
        flag1 = e(ak1);
        ao ao1;
        boolean flag;
        if (j1 == 1)
        {
            ao1 = ak1.a(0).e;
        } else
        {
            ao1 = ao.b;
        }
        httpurlconnection.setRequestMethod(ao1.name());
        a(httpurlconnection, flag1);
        url = httpurlconnection.getURL();
        z1.c("Request:\n");
        z1.a("Id", ak1.b());
        z1.a("URL", url);
        z1.a("Method", httpurlconnection.getRequestMethod());
        z1.a("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        z1.a("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(ak1.a());
        httpurlconnection.setReadTimeout(ak1.a());
        if (ao1 == ao.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            z1.a();
            return;
        }
        httpurlconnection.setDoOutput(true);
        Object obj1 = new BufferedOutputStream(httpurlconnection.getOutputStream());
        Object obj;
        httpurlconnection = ((HttpURLConnection) (obj1));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = obj1;
        httpurlconnection = new GZIPOutputStream(((OutputStream) (obj1)));
        obj = httpurlconnection;
        if (!d(ak1))
        {
            break MISSING_BLOCK_LABEL_281;
        }
        obj = httpurlconnection;
        obj1 = new av(ak1.c());
        obj = httpurlconnection;
        a(ak1, null, j1, url, ((OutputStream) (obj1)), flag1);
        obj = httpurlconnection;
        int i1 = ((av) (obj1)).a();
        obj = httpurlconnection;
        httpurlconnection = new aw(httpurlconnection, ak1, ((av) (obj1)).b(), i1);
        a(ak1, z1, j1, url, ((OutputStream) (httpurlconnection)), flag1);
        if (httpurlconnection != null)
        {
            httpurlconnection.close();
        }
        z1.a();
        return;
        ak1;
        obj = null;
_L2:
        if (obj != null)
        {
            ((OutputStream) (obj)).close();
        }
        throw ak1;
        ak1;
        continue; /* Loop/switch isn't completed */
        ak1;
        obj = httpurlconnection;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void a(com.facebook.ak ak1, List list)
    {
label0:
        {
            int j1 = ak1.size();
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < j1; i1++)
            {
                GraphRequest graphrequest = ak1.a(i1);
                if (graphrequest.l != null)
                {
                    arraylist.add(new Pair(graphrequest.l, list.get(i1)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new aa(arraylist, ak1);
                ak1 = ak1.c();
                if (ak1 != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        ak1.post(list);
    }

    private static void a(String s1, Object obj, af af1, boolean flag)
    {
        Object obj1 = obj.getClass();
        if (!org/json/JSONObject.isAssignableFrom(((Class) (obj1)))) goto _L2; else goto _L1
_L1:
        obj = (JSONObject)obj;
        if (!flag) goto _L4; else goto _L3
_L3:
        String s2;
        for (obj1 = ((JSONObject) (obj)).keys(); ((Iterator) (obj1)).hasNext(); a(String.format("%s[%s]", new Object[] {
    s1, s2
}), ((JSONObject) (obj)).opt(s2), af1, flag))
        {
            s2 = (String)((Iterator) (obj1)).next();
        }

          goto _L5
_L4:
        if (!((JSONObject) (obj)).has("id")) goto _L7; else goto _L6
_L6:
        a(s1, ((JSONObject) (obj)).optString("id"), af1, flag);
_L5:
        return;
_L7:
        if (((JSONObject) (obj)).has("url"))
        {
            a(s1, ((JSONObject) (obj)).optString("url"), af1, flag);
            return;
        }
        if (((JSONObject) (obj)).has("fbsdk:create_object"))
        {
            a(s1, ((JSONObject) (obj)).toString(), af1, flag);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!org/json/JSONArray.isAssignableFrom(((Class) (obj1))))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JSONArray)obj;
        int j1 = ((JSONArray) (obj)).length();
        int i1 = 0;
        while (i1 < j1) 
        {
            a(String.format(Locale.ROOT, "%s[%d]", new Object[] {
                s1, Integer.valueOf(i1)
            }), ((JSONArray) (obj)).opt(i1), af1, flag);
            i1++;
        }
        if (true) goto _L5; else goto _L8
_L8:
        if (java/lang/String.isAssignableFrom(((Class) (obj1))) || java/lang/Number.isAssignableFrom(((Class) (obj1))) || java/lang/Boolean.isAssignableFrom(((Class) (obj1))))
        {
            af1.a(s1, obj.toString());
            return;
        }
        if (java/util/Date.isAssignableFrom(((Class) (obj1))))
        {
            obj = (Date)obj;
            af1.a(s1, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
            return;
        }
        if (true) goto _L5; else goto _L9
_L9:
    }

    private static void a(HttpURLConnection httpurlconnection, boolean flag)
    {
        if (flag)
        {
            httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        } else
        {
            httpurlconnection.setRequestProperty("Content-Type", m());
            return;
        }
    }

    private static void a(Map map, ai ai1)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            ac ac1 = (ac)map.get(s1);
            if (d(ac1.b()))
            {
                ai1.a(s1, ac1.b(), ac1.a());
            }
        } while (true);
    }

    private void a(JSONArray jsonarray, Map map)
    {
        JSONObject jsonobject = new JSONObject();
        if (h != null)
        {
            jsonobject.put("name", h);
            jsonobject.put("omit_response_on_success", j);
        }
        if (i != null)
        {
            jsonobject.put("depends_on", i);
        }
        String s1 = i();
        jsonobject.put("relative_url", s1);
        jsonobject.put("method", e);
        if (d != null)
        {
            z.a(d.b());
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = k.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = k.get(((String) (obj)));
            if (d(obj))
            {
                String s2 = String.format(Locale.ROOT, "%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s2);
                map.put(s2, new ac(this, obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        if (g != null)
        {
            map = new ArrayList();
            a(g, s1, ((af) (new ab(this, map))));
            jsonobject.put("body", TextUtils.join("&", map));
        }
        jsonarray.put(jsonobject);
    }

    private static void a(JSONObject jsonobject, String s1, af af1)
    {
        int i1;
        if (b(s1))
        {
            i1 = s1.indexOf(":");
            int j1 = s1.indexOf("?");
            String s2;
            Object obj;
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
        s1 = jsonobject.keys();
        while (s1.hasNext()) 
        {
            s2 = (String)s1.next();
            obj = jsonobject.opt(s2);
            boolean flag;
            if (i1 && s2.equalsIgnoreCase("image"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(s2, obj, af1, flag);
        }
    }

    public static aj b(Collection collection)
    {
        return c(new com.facebook.ak(collection));
    }

    public static transient aj b(GraphRequest agraphrequest[])
    {
        ar.a(agraphrequest, "requests");
        return b(((Collection) (Arrays.asList(agraphrequest))));
    }

    public static List b(com.facebook.ak ak1)
    {
        ar.c(ak1, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = a(ak1);
        }
        catch (Exception exception)
        {
            List list = an.a(ak1.d(), null, new m(exception));
            a(ak1, list);
            return list;
        }
        return a(httpurlconnection, ak1);
    }

    static boolean b(Object obj)
    {
        return e(obj);
    }

    private static boolean b(String s1)
    {
        Matcher matcher = c.matcher(s1);
        if (matcher.matches())
        {
            s1 = matcher.group(1);
        }
        return s1.startsWith("me/") || s1.startsWith("/me/");
    }

    public static aj c(com.facebook.ak ak1)
    {
        ar.c(ak1, "requests");
        ak1 = new aj(ak1);
        ak1.a();
        return ak1;
    }

    static String c(Object obj)
    {
        return f(obj);
    }

    private static boolean d(com.facebook.ak ak1)
    {
        for (Iterator iterator = ak1.e().iterator(); iterator.hasNext();)
        {
            if ((com.facebook.al)iterator.next() instanceof am)
            {
                return true;
            }
        }

        for (ak1 = ak1.iterator(); ak1.hasNext();)
        {
            if (((GraphRequest)ak1.next()).e() instanceof ag)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean d(Object obj)
    {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    private static boolean e(com.facebook.ak ak1)
    {
        ak1 = ak1.iterator();
label0:
        do
        {
            if (ak1.hasNext())
            {
                GraphRequest graphrequest = (GraphRequest)ak1.next();
                Iterator iterator = graphrequest.k.keySet().iterator();
                String s1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s1 = (String)iterator.next();
                } while (!d(graphrequest.k.get(s1)));
                break;
            } else
            {
                return true;
            }
        } while (true);
        return false;
    }

    private static boolean e(Object obj)
    {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    private static String f(com.facebook.ak ak1)
    {
        if (!al.a(ak1.f()))
        {
            return ak1.f();
        }
        for (ak1 = ak1.iterator(); ak1.hasNext();)
        {
            Object obj = ((GraphRequest)ak1.next()).d;
            if (obj != null)
            {
                obj = ((AccessToken) (obj)).h();
                if (obj != null)
                {
                    return ((String) (obj));
                }
            }
        }

        if (!al.a(b))
        {
            return b;
        } else
        {
            return s.h();
        }
    }

    private static String f(Object obj)
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

    private void k()
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        if (!k.containsKey("access_token"))
        {
            String s1 = d.b();
            z.a(s1);
            k.putString("access_token", s1);
        }
_L8:
        k.putString("sdk", "android");
        k.putString("format", "json");
        if (!s.a(aq.h)) goto _L4; else goto _L3
_L3:
        k.putString("debug", "info");
_L6:
        return;
_L2:
        if (!p && !k.containsKey("access_token"))
        {
            String s2 = s.h();
            String s3 = s.i();
            if (!al.a(s2) && !al.a(s3))
            {
                s2 = (new StringBuilder()).append(s2).append("|").append(s3).toString();
                k.putString("access_token", s2);
            } else
            {
                Log.d(a, "Warning: Request without access token missing application ID or client token.");
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s.a(aq.g)) goto _L6; else goto _L5
_L5:
        k.putString("debug", "warning");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String l()
    {
        if (c.matcher(f).matches())
        {
            return f;
        } else
        {
            return String.format("%s/%s", new Object[] {
                o, f
            });
        }
    }

    private static String m()
    {
        return String.format("multipart/form-data; boundary=%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        });
    }

    private static String n()
    {
        if (q == null)
        {
            q = String.format("%s.%s", new Object[] {
                "FBAndroidSDK", "4.1.0"
            });
        }
        return q;
    }

    public final JSONObject a()
    {
        return g;
    }

    public final void a(Bundle bundle)
    {
        k = bundle;
    }

    public final void a(ad ad)
    {
        if (s.a(aq.h) || s.a(aq.g))
        {
            l = new com.facebook.z(this, ad);
            return;
        } else
        {
            l = ad;
            return;
        }
    }

    public final void a(ao ao1)
    {
        if (m != null && ao1 != ao.a)
        {
            throw new m("Can't change HTTP method on request with overridden URL.");
        }
        if (ao1 == null)
        {
            ao1 = ao.a;
        }
        e = ao1;
    }

    public final void a(Object obj)
    {
        n = obj;
    }

    public final void a(JSONObject jsonobject)
    {
        g = jsonobject;
    }

    public final void a(boolean flag)
    {
        p = flag;
    }

    public final ao b()
    {
        return e;
    }

    public final Bundle c()
    {
        return k;
    }

    public final AccessToken d()
    {
        return d;
    }

    public final ad e()
    {
        return l;
    }

    public final Object f()
    {
        return n;
    }

    public final an g()
    {
        return a(this);
    }

    public final aj h()
    {
        return b(new GraphRequest[] {
            this
        });
    }

    final String i()
    {
        if (m != null)
        {
            throw new m("Can't override URL for a batch request");
        } else
        {
            String s1 = l();
            k();
            return a(s1);
        }
    }

    final String j()
    {
        if (m != null)
        {
            return m.toString();
        }
        String s1;
        if (b() == ao.b && f != null && f.endsWith("/videos"))
        {
            s1 = ak.c();
        } else
        {
            s1 = ak.b();
        }
        s1 = String.format("%s/%s", new Object[] {
            s1, l()
        });
        k();
        return a(s1);
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("{Request: ").append(" accessToken: ");
        Object obj;
        if (d == null)
        {
            obj = "null";
        } else
        {
            obj = d;
        }
        return stringbuilder.append(obj).append(", graphPath: ").append(f).append(", graphObject: ").append(g).append(", httpMethod: ").append(e).append(", parameters: ").append(k).append("}").toString();
    }


    private class ParcelableResourceWithMimeType
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new ah();
        private final String a;
        private final Parcelable b;

        public String a()
        {
            return a;
        }

        public Parcelable b()
        {
            return b;
        }

        public int describeContents()
        {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(a);
            parcel.writeParcelable(b, i1);
        }


        private ParcelableResourceWithMimeType(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readParcelable(s.f().getClassLoader());
        }

        ParcelableResourceWithMimeType(Parcel parcel, y y)
        {
            this(parcel);
        }
    }

}
