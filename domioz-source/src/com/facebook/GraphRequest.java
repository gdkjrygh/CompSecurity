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
import com.facebook.internal.ak;
import com.facebook.internal.av;
import com.facebook.internal.aw;
import com.facebook.internal.bc;
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
//            ak, l, ag, aj, 
//            d, ae, z, x, 
//            ab, AccessToken, y, af, 
//            am, ar, as, ah, 
//            ai, ac, q, w, 
//            aa

public class GraphRequest
{

    public static final String a = com/facebook/GraphRequest.getSimpleName();
    private static String b;
    private static Pattern c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String q;
    private AccessToken d;
    private com.facebook.ak e;
    private String f;
    private JSONObject g;
    private String h;
    private String i;
    private boolean j;
    private Bundle k;
    private aa l;
    private String m;
    private Object n;
    private String o;
    private boolean p;

    public GraphRequest()
    {
        this(null, null, null, null, (byte)0);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, com.facebook.ak ak1)
    {
        this(accesstoken, s, bundle, ak1, (byte)0);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, com.facebook.ak ak1, byte byte0)
    {
        this(accesstoken, s, bundle, ak1, '\0');
    }

    private GraphRequest(AccessToken accesstoken, String s, Bundle bundle, com.facebook.ak ak1, char c1)
    {
        j = true;
        p = false;
        d = accesstoken;
        f = s;
        o = null;
        a(((aa) (null)));
        if (m != null && ak1 != ak.a)
        {
            throw new l("Can't change HTTP method on request with overridden URL.");
        }
        if (ak1 == null)
        {
            ak1 = ak.a;
        }
        e = ak1;
        if (bundle != null)
        {
            k = new Bundle(bundle);
        } else
        {
            k = new Bundle();
        }
        if (o == null)
        {
            o = av.d();
        }
    }

    public static GraphRequest a(String s)
    {
        return new GraphRequest(null, s, null, null, (byte)0);
    }

    public static GraphRequest a(String s, JSONObject jsonobject)
    {
        s = new GraphRequest(null, s, null, ak.b, (byte)0);
        s.g = jsonobject;
        return s;
    }

    public static List a(ag ag1)
    {
        bc.a(ag1, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = c(ag1);
        }
        catch (Exception exception)
        {
            List list = aj.a(ag1.d(), null, new l(exception));
            a(ag1, list);
            return list;
        }
        return a(httpurlconnection, ag1);
    }

    public static List a(HttpURLConnection httpurlconnection, ag ag1)
    {
        List list = aj.a(httpurlconnection, ag1);
        aw.a(httpurlconnection);
        int i1 = ag1.size();
        if (i1 != list.size())
        {
            throw new l(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(i1)
            }));
        } else
        {
            a(ag1, list);
            com.facebook.d.a().d();
            return list;
        }
    }

    private static void a(Bundle bundle, ae ae1, GraphRequest graphrequest)
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
            if (e(obj))
            {
                ae1.a(s, obj, graphrequest);
            }
        } while (true);
    }

    private static void a(ae ae1, Collection collection, Map map)
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).a(jsonarray, map)) { }
        ae1.a("batch", jsonarray, collection);
    }

    private static void a(ag ag1, ak ak1, int i1, URL url, OutputStream outputstream, boolean flag)
    {
        outputstream = new ae(outputstream, ak1, flag);
        if (i1 == 1)
        {
            ag1 = ag1.a(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((GraphRequest) (ag1)).k.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Object obj = ((GraphRequest) (ag1)).k.get(s);
                if (d(obj))
                {
                    hashmap.put(s, new z(ag1, obj));
                }
            } while (true);
            if (ak1 != null)
            {
                ak1.b("  Parameters:\n");
            }
            a(((GraphRequest) (ag1)).k, ((ae) (outputstream)), ((GraphRequest) (ag1)));
            if (ak1 != null)
            {
                ak1.b("  Attachments:\n");
            }
            a(((Map) (hashmap)), ((ae) (outputstream)));
            if (((GraphRequest) (ag1)).g != null)
            {
                a(((GraphRequest) (ag1)).g, url.getPath(), ((ab) (outputstream)));
            }
            return;
        }
        url = f(ag1);
        if (aw.a(url))
        {
            throw new l("App ID was not specified at the request or Settings.");
        }
        outputstream.a("batch_app_id", url);
        url = new HashMap();
        a(((ae) (outputstream)), ((Collection) (ag1)), ((Map) (url)));
        if (ak1 != null)
        {
            ak1.b("  Attachments:\n");
        }
        a(((Map) (url)), ((ae) (outputstream)));
    }

    private static void a(ag ag1, List list)
    {
label0:
        {
            int j1 = ag1.size();
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < j1; i1++)
            {
                GraphRequest graphrequest = ag1.a(i1);
                if (graphrequest.l != null)
                {
                    arraylist.add(new Pair(graphrequest.l, list.get(i1)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new x(arraylist, ag1);
                ag1 = ag1.c();
                if (ag1 != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        ag1.post(list);
    }

    private static void a(String s, Object obj, ab ab1, boolean flag)
    {
label0:
        {
            Object obj1;
            do
            {
                obj1 = obj.getClass();
                if (!org/json/JSONObject.isAssignableFrom(((Class) (obj1))))
                {
                    break;
                }
                obj = (JSONObject)obj;
                if (flag)
                {
                    String s1;
                    for (obj1 = ((JSONObject) (obj)).keys(); ((Iterator) (obj1)).hasNext(); a(String.format("%s[%s]", new Object[] {
    s, s1
}), ((JSONObject) (obj)).opt(s1), ab1, flag))
                    {
                        s1 = (String)((Iterator) (obj1)).next();
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
            if (org/json/JSONArray.isAssignableFrom(((Class) (obj1))))
            {
                obj = (JSONArray)obj;
                int j1 = ((JSONArray) (obj)).length();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    a(String.format(Locale.ROOT, "%s[%d]", new Object[] {
                        s, Integer.valueOf(i1)
                    }), ((JSONArray) (obj)).opt(i1), ab1, flag);
                }

            } else
            if (java/lang/String.isAssignableFrom(((Class) (obj1))) || java/lang/Number.isAssignableFrom(((Class) (obj1))) || java/lang/Boolean.isAssignableFrom(((Class) (obj1))))
            {
                ab1.a(s, obj.toString());
            } else
            if (java/util/Date.isAssignableFrom(((Class) (obj1))))
            {
                obj = (Date)obj;
                ab1.a(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
                return;
            }
        }
    }

    private static void a(Map map, ae ae1)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            z z1 = (z)map.get(s);
            if (d(z1.b()))
            {
                ae1.a(s, z1.b(), z1.a());
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
        String s = j();
        jsonobject.put("relative_url", s);
        jsonobject.put("method", e);
        if (d != null)
        {
            ak.a(d.b());
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
                String s1 = String.format(Locale.ROOT, "%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s1);
                map.put(s1, new z(this, obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        if (g != null)
        {
            map = new ArrayList();
            a(g, s, ((ab) (new y(this, map))));
            jsonobject.put("body", TextUtils.join("&", map));
        }
        jsonarray.put(jsonobject);
    }

    private static void a(JSONObject jsonobject, String s, ab ab1)
    {
        Object obj = c.matcher(s);
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
            Object obj1;
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
        s = jsonobject.keys();
        while (s.hasNext()) 
        {
            obj = (String)s.next();
            obj1 = jsonobject.opt(((String) (obj)));
            boolean flag;
            if (i1 != 0 && ((String) (obj)).equalsIgnoreCase("image"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(((String) (obj)), obj1, ab1, flag);
        }
    }

    public static af b(ag ag1)
    {
        bc.a(ag1, "requests");
        ag1 = new af(ag1);
        ag1.a();
        return ag1;
    }

    static boolean b(Object obj)
    {
        return e(obj);
    }

    static String c(Object obj)
    {
        return f(obj);
    }

    private String c(String s)
    {
        android.net.Uri.Builder builder;
label0:
        {
            builder = (new android.net.Uri.Builder()).encodedPath(s);
label1:
            do
            {
                String s1;
                for (Iterator iterator = k.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s1, f(s).toString()))
                {
                    s1 = (String)iterator.next();
                    Object obj = k.get(s1);
                    s = ((String) (obj));
                    if (obj == null)
                    {
                        s = "";
                    }
                    if (!e(s))
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (e != ak.a);
            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
                s.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    private static HttpURLConnection c(ag ag1)
    {
        if (ag1.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj1 = ag1.a(0);
        if (((GraphRequest) (obj1)).m == null) goto _L4; else goto _L3
_L3:
        Object obj = ((GraphRequest) (obj1)).m.toString();
_L20:
        obj = new URL(((String) (obj)));
_L14:
        Object obj2;
        HttpURLConnection httpurlconnection;
        ak ak1;
        URL url;
        boolean flag;
        int i1;
        int j1;
        boolean flag1;
        try
        {
            httpurlconnection = (HttpURLConnection)((URL) (obj)).openConnection();
            if (q == null)
            {
                q = String.format("%s.%s", new Object[] {
                    "FBAndroidSDK", "4.0.0"
                });
            }
            httpurlconnection.setRequestProperty("User-Agent", q);
            httpurlconnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpurlconnection.setChunkedStreamingMode(0);
            ak1 = new ak(am.a, "Request");
            j1 = ag1.size();
            flag1 = e(ag1);
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            throw new l("could not construct request body", ag1);
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            throw new l("could not construct request body", ag1);
        }
        if (j1 != 1) goto _L6; else goto _L5
_L5:
        obj = ag1.a(0).e;
_L15:
        httpurlconnection.setRequestMethod(((com.facebook.ak) (obj)).name());
        if (!flag1) goto _L8; else goto _L7
_L7:
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
_L16:
        url = httpurlconnection.getURL();
        ak1.b("Request:\n");
        ak1.a("Id", ag1.b());
        ak1.a("URL", url);
        ak1.a("Method", httpurlconnection.getRequestMethod());
        ak1.a("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        ak1.a("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(ag1.a());
        httpurlconnection.setReadTimeout(ag1.a());
        if (obj == ak.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L10; else goto _L9
_L9:
        ak1.a();
        return httpurlconnection;
_L4:
        if (((GraphRequest) (obj1)).e != ak.b || ((GraphRequest) (obj1)).f == null || !((GraphRequest) (obj1)).f.endsWith("/videos")) goto _L12; else goto _L11
_L11:
        obj = av.c();
_L13:
        obj = String.format("%s/%s", new Object[] {
            obj, ((GraphRequest) (obj1)).k()
        });
        ((GraphRequest) (obj1)).i();
        obj = ((GraphRequest) (obj1)).c(((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L12:
        try
        {
            obj = av.b();
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            throw new l("could not construct URL for request", ag1);
        }
        if (true) goto _L13; else goto _L2
_L2:
        obj = new URL(av.b());
          goto _L14
_L6:
        obj = ak.b;
          goto _L15
_L8:
        httpurlconnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        }));
          goto _L16
_L10:
        httpurlconnection.setDoOutput(true);
        obj2 = new BufferedOutputStream(httpurlconnection.getOutputStream());
        obj = obj2;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        obj1 = obj2;
        obj = new GZIPOutputStream(((OutputStream) (obj2)));
        obj1 = obj;
        if (!d(ag1))
        {
            break MISSING_BLOCK_LABEL_567;
        }
        obj1 = obj;
        obj2 = new ar(ag1.c());
        obj1 = obj;
        a(ag1, null, j1, url, ((OutputStream) (obj2)), flag1);
        obj1 = obj;
        i1 = ((ar) (obj2)).a();
        obj1 = obj;
        obj = new as(((OutputStream) (obj)), ag1, ((ar) (obj2)).b(), i1);
        a(ag1, ak1, j1, url, ((OutputStream) (obj)), flag1);
        ((OutputStream) (obj)).close();
        ak1.a();
        return httpurlconnection;
        ag1;
        obj1 = null;
_L18:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_616;
        }
        ((OutputStream) (obj1)).close();
        throw ag1;
        ag1;
        continue; /* Loop/switch isn't completed */
        ag1;
        obj1 = obj;
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
    }

    private static boolean d(ag ag1)
    {
        for (Iterator iterator = ag1.e().iterator(); iterator.hasNext();)
        {
            if ((ah)iterator.next() instanceof ai)
            {
                return true;
            }
        }

        for (ag1 = ag1.iterator(); ag1.hasNext();)
        {
            if (((GraphRequest)ag1.next()).l instanceof ac)
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

    private static boolean e(ag ag1)
    {
        ag1 = ag1.iterator();
label0:
        do
        {
            if (ag1.hasNext())
            {
                GraphRequest graphrequest = (GraphRequest)ag1.next();
                Iterator iterator = graphrequest.k.keySet().iterator();
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s = (String)iterator.next();
                } while (!d(graphrequest.k.get(s)));
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

    private static String f(ag ag1)
    {
        if (!aw.a(ag1.f()))
        {
            return ag1.f();
        }
        for (ag1 = ag1.iterator(); ag1.hasNext();)
        {
            Object obj = ((GraphRequest)ag1.next()).d;
            if (obj != null)
            {
                obj = ((AccessToken) (obj)).f();
                if (obj != null)
                {
                    return ((String) (obj));
                }
            }
        }

        if (!aw.a(b))
        {
            return b;
        } else
        {
            return com.facebook.q.h();
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

    private void i()
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        if (!k.containsKey("access_token"))
        {
            String s = d.b();
            ak.a(s);
            k.putString("access_token", s);
        }
_L8:
        k.putString("sdk", "android");
        k.putString("format", "json");
        if (!com.facebook.q.a(am.h)) goto _L4; else goto _L3
_L3:
        k.putString("debug", "info");
_L6:
        return;
_L2:
        if (!p && !k.containsKey("access_token"))
        {
            String s1 = com.facebook.q.h();
            String s2 = com.facebook.q.i();
            if (!aw.a(s1) && !aw.a(s2))
            {
                s1 = (new StringBuilder()).append(s1).append("|").append(s2).toString();
                k.putString("access_token", s1);
            } else
            {
                Log.d(a, "Warning: Request without access token missing application ID or client token.");
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!com.facebook.q.a(am.g)) goto _L6; else goto _L5
_L5:
        k.putString("debug", "warning");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String j()
    {
        if (m != null)
        {
            throw new l("Can't override URL for a batch request");
        } else
        {
            String s = k();
            i();
            return c(s);
        }
    }

    private String k()
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

    public final JSONObject a()
    {
        return g;
    }

    public final void a(Bundle bundle)
    {
        k = bundle;
    }

    public final void a(aa aa)
    {
        if (com.facebook.q.a(am.h) || com.facebook.q.a(am.g))
        {
            l = new w(this, aa);
            return;
        } else
        {
            l = aa;
            return;
        }
    }

    public final void a(Object obj)
    {
        n = obj;
    }

    public final void a(JSONObject jsonobject)
    {
        g = jsonobject;
    }

    public final void b()
    {
        p = true;
    }

    public final void b(String s)
    {
        o = s;
    }

    public final Bundle c()
    {
        return k;
    }

    public final AccessToken d()
    {
        return d;
    }

    public final aa e()
    {
        return l;
    }

    public final Object f()
    {
        return n;
    }

    public final aj g()
    {
        GraphRequest agraphrequest[] = new GraphRequest[1];
        agraphrequest[0] = this;
        bc.a(agraphrequest, "requests");
        List list = a(new ag(Arrays.asList(agraphrequest)));
        if (list == null || list.size() != 1)
        {
            throw new l("invalid state: expected a single response");
        } else
        {
            return (aj)list.get(0);
        }
    }

    public final af h()
    {
        GraphRequest agraphrequest[] = new GraphRequest[1];
        agraphrequest[0] = this;
        bc.a(agraphrequest, "requests");
        return b(new ag(Arrays.asList(agraphrequest)));
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("{Request:  accessToken: ");
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

        public static final android.os.Parcelable.Creator CREATOR = new ad();
        private final String a;
        private final Parcelable b;

        public final String a()
        {
            return a;
        }

        public final Parcelable b()
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
            b = parcel.readParcelable(com.facebook.q.f().getClassLoader());
        }

        ParcelableResourceWithMimeType(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

}
