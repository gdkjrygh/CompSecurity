// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.g;
import com.facebook.internal.h;
import com.facebook.internal.l;
import com.facebook.internal.m;
import com.facebook.internal.n;
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
//            HttpMethod, FacebookException, i, j, 
//            b, AccessToken, AccessTokenSource, h, 
//            LoggingBehavior, n, o, g, 
//            q

public class GraphRequest
{
    public static class ParcelableResourceWithMimeType
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new ParcelableResourceWithMimeType(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new ParcelableResourceWithMimeType[i1];
            }

        };
        final String a;
        final Parcelable b;

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
            b = parcel.readParcelable(com.facebook.g.g().getClassLoader());
        }

        ParcelableResourceWithMimeType(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

    private static final class a
    {

        final GraphRequest a;
        final Object b;

        public a(GraphRequest graphrequest, Object obj)
        {
            a = graphrequest;
            b = obj;
        }
    }

    public static interface b
    {

        public abstract void a(j j1);
    }

    private static interface c
    {

        public abstract void a(String s, String s1)
            throws IOException;
    }

    public static interface d
        extends b
    {
    }

    private static final class e
        implements c
    {

        private final OutputStream a;
        private final h b;
        private boolean c;
        private boolean d;

        private static RuntimeException a()
        {
            return new IllegalArgumentException("value is not a supported type.");
        }

        private void a(String s, Uri uri, String s1)
            throws IOException
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "content/unknown";
            }
            a(s, s, s2);
            s1 = com.facebook.g.g().getContentResolver().openInputStream(uri);
            int i1;
            if (a instanceof com.facebook.n)
            {
                long l1 = com.facebook.internal.m.a(uri);
                ((com.facebook.n)a).a(l1);
                i1 = 0;
            } else
            {
                i1 = com.facebook.internal.m.a(s1, a) + 0;
            }
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(i1)
                }));
            }
        }

        private void a(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
            throws IOException
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "content/unknown";
            }
            a(s, s, s2);
            int i1;
            if (a instanceof com.facebook.n)
            {
                ((com.facebook.n)a).a(parcelfiledescriptor.getStatSize());
                i1 = 0;
            } else
            {
                i1 = com.facebook.internal.m.a(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor), a) + 0;
            }
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(i1)
                }));
            }
        }

        private void a(String s, String s1, String s2)
            throws IOException
        {
            if (!d)
            {
                a("Content-Disposition: form-data; name=\"%s\"", new Object[] {
                    s
                });
                if (s1 != null)
                {
                    a("; filename=\"%s\"", new Object[] {
                        s1
                    });
                }
                b("", new Object[0]);
                if (s2 != null)
                {
                    b("%s: %s", new Object[] {
                        "Content-Type", s2
                    });
                }
                b("", new Object[0]);
                return;
            } else
            {
                a.write(String.format("%s=", new Object[] {
                    s
                }).getBytes());
                return;
            }
        }

        private transient void a(String s, Object aobj[])
            throws IOException
        {
            if (!d)
            {
                if (c)
                {
                    a.write("--".getBytes());
                    a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                    a.write("\r\n".getBytes());
                    c = false;
                }
                a.write(String.format(s, aobj).getBytes());
                return;
            } else
            {
                a.write(URLEncoder.encode(String.format(Locale.US, s, aobj), "UTF-8").getBytes());
                return;
            }
        }

        private void b()
            throws IOException
        {
            if (!d)
            {
                b("--%s", new Object[] {
                    "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
                });
                return;
            } else
            {
                a.write("&".getBytes());
                return;
            }
        }

        private transient void b(String s, Object aobj[])
            throws IOException
        {
            a(s, aobj);
            if (!d)
            {
                a("\r\n", new Object[0]);
            }
        }

        public final void a(String s, Object obj, GraphRequest graphrequest)
            throws IOException
        {
            if (a instanceof q)
            {
                ((q)a).a(graphrequest);
            }
            if (!GraphRequest.a(obj)) goto _L2; else goto _L1
_L1:
            a(s, GraphRequest.b(obj));
_L4:
            return;
_L2:
            if (!(obj instanceof Bitmap))
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (Bitmap)obj;
            a(s, s, "image/png");
            ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, a);
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s).toString(), "<Image>");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (obj instanceof byte[])
            {
                obj = (byte[])(byte[])obj;
                a(s, s, "content/unknown");
                a.write(((byte []) (obj)));
                b("", new Object[0]);
                b();
                if (b != null)
                {
                    b.a((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                        Integer.valueOf(obj.length)
                    }));
                    return;
                }
            } else
            {
                if (obj instanceof Uri)
                {
                    a(s, (Uri)obj, ((String) (null)));
                    return;
                }
                if (obj instanceof ParcelFileDescriptor)
                {
                    a(s, (ParcelFileDescriptor)obj, ((String) (null)));
                    return;
                }
                if (obj instanceof ParcelableResourceWithMimeType)
                {
                    graphrequest = (ParcelableResourceWithMimeType)obj;
                    obj = ((ParcelableResourceWithMimeType) (graphrequest)).b;
                    graphrequest = ((ParcelableResourceWithMimeType) (graphrequest)).a;
                    if (obj instanceof ParcelFileDescriptor)
                    {
                        a(s, (ParcelFileDescriptor)obj, ((String) (graphrequest)));
                        return;
                    }
                    if (obj instanceof Uri)
                    {
                        a(s, (Uri)obj, ((String) (graphrequest)));
                        return;
                    } else
                    {
                        throw a();
                    }
                } else
                {
                    throw a();
                }
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void a(String s, String s1)
            throws IOException
        {
            a(s, ((String) (null)), ((String) (null)));
            b("%s", new Object[] {
                s1
            });
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s).toString(), s1);
            }
        }

        public final void a(String s, JSONArray jsonarray, Collection collection)
            throws IOException, JSONException
        {
            if (!(a instanceof q))
            {
                a(s, jsonarray.toString());
            } else
            {
                q q1 = (q)a;
                a(s, ((String) (null)), ((String) (null)));
                a("[", new Object[0]);
                collection = collection.iterator();
                int i1 = 0;
                while (collection.hasNext()) 
                {
                    GraphRequest graphrequest = (GraphRequest)collection.next();
                    JSONObject jsonobject = jsonarray.getJSONObject(i1);
                    q1.a(graphrequest);
                    if (i1 > 0)
                    {
                        a(",%s", new Object[] {
                            jsonobject.toString()
                        });
                    } else
                    {
                        a("%s", new Object[] {
                            jsonobject.toString()
                        });
                    }
                    i1++;
                }
                a("]", new Object[0]);
                if (b != null)
                {
                    b.a((new StringBuilder("    ")).append(s).toString(), jsonarray.toString());
                    return;
                }
            }
        }

        public e(OutputStream outputstream, h h1, boolean flag)
        {
            c = true;
            d = false;
            a = outputstream;
            b = h1;
            d = flag;
        }
    }


    public static final String a = com/facebook/GraphRequest.getSimpleName();
    private static String h;
    private static Pattern i = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String q;
    AccessToken b;
    public JSONObject c;
    public Bundle d;
    b e;
    public Object f;
    public boolean g;
    private HttpMethod j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private String o;
    private String p;

    public GraphRequest()
    {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, b b1)
    {
        this(accesstoken, s, bundle, httpmethod, b1, (byte)0);
    }

    private GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, b b1, byte byte0)
    {
        n = true;
        g = false;
        b = accesstoken;
        k = s;
        p = null;
        a(b1);
        if (o != null && httpmethod != HttpMethod.a)
        {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpmethod == null)
        {
            httpmethod = HttpMethod.a;
        }
        j = httpmethod;
        if (bundle != null)
        {
            d = new Bundle(bundle);
        } else
        {
            d = new Bundle();
        }
        if (p == null)
        {
            p = com.facebook.internal.l.d();
        }
    }

    public static GraphRequest a(String s)
    {
        return new GraphRequest(null, s, null, null, null);
    }

    public static GraphRequest a(String s, JSONObject jsonobject)
    {
        s = new GraphRequest(null, s, null, HttpMethod.b, null);
        s.c = jsonobject;
        return s;
    }

    public static List a(i i1)
    {
        com.facebook.internal.n.a(i1, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = c(i1);
        }
        catch (Exception exception)
        {
            List list = com.facebook.j.a(i1.b, null, new FacebookException(exception));
            a(i1, list);
            return list;
        }
        return a(httpurlconnection, i1);
    }

    public static List a(HttpURLConnection httpurlconnection, i i1)
    {
        List list;
        boolean flag;
        flag = true;
        list = com.facebook.j.a(httpurlconnection, i1);
        com.facebook.internal.m.a(httpurlconnection);
        int j1 = i1.size();
        if (j1 != list.size())
        {
            throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(j1)
            }));
        }
        a(i1, list);
        httpurlconnection = com.facebook.b.a();
        if (((com.facebook.b) (httpurlconnection)).a == null) goto _L2; else goto _L1
_L1:
        i1 = Long.valueOf((new Date()).getTime());
        if (!((com.facebook.b) (httpurlconnection)).a.e.h || i1.longValue() - ((com.facebook.b) (httpurlconnection)).b.getTime() <= 0x36ee80L || i1.longValue() - ((com.facebook.b) (httpurlconnection)).a.f.getTime() <= 0x5265c00L) goto _L2; else goto _L3
_L3:
        if (flag)
        {
            httpurlconnection.c();
        }
        return list;
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
    }

    private static void a(Bundle bundle, e e1, GraphRequest graphrequest)
        throws IOException
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
                e1.a(s, obj, graphrequest);
            }
        } while (true);
    }

    private static void a(e e1, Collection collection, Map map)
        throws JSONException, IOException
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).a(jsonarray, map)) { }
        e1.a("batch", jsonarray, collection);
    }

    private static void a(i i1, h h1, int j1, URL url, OutputStream outputstream, boolean flag)
        throws IOException, JSONException
    {
        outputstream = new e(outputstream, h1, flag);
        if (j1 == 1)
        {
            i1 = i1.a(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((GraphRequest) (i1)).d.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Object obj = ((GraphRequest) (i1)).d.get(s);
                if (c(obj))
                {
                    hashmap.put(s, new a(i1, obj));
                }
            } while (true);
            if (h1 != null)
            {
                h1.b("  Parameters:\n");
            }
            a(((GraphRequest) (i1)).d, ((e) (outputstream)), ((GraphRequest) (i1)));
            if (h1 != null)
            {
                h1.b("  Attachments:\n");
            }
            a(((Map) (hashmap)), ((e) (outputstream)));
            if (((GraphRequest) (i1)).c != null)
            {
                a(((GraphRequest) (i1)).c, url.getPath(), ((c) (outputstream)));
            }
            return;
        }
        url = f(i1);
        if (com.facebook.internal.m.a(url))
        {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        outputstream.a("batch_app_id", url);
        url = new HashMap();
        a(((e) (outputstream)), ((Collection) (i1)), ((Map) (url)));
        if (h1 != null)
        {
            h1.b("  Attachments:\n");
        }
        a(((Map) (url)), ((e) (outputstream)));
    }

    private static void a(i i1, List list)
    {
label0:
        {
            int k1 = i1.size();
            ArrayList arraylist = new ArrayList();
            for (int j1 = 0; j1 < k1; j1++)
            {
                GraphRequest graphrequest = i1.a(j1);
                if (graphrequest.e != null)
                {
                    arraylist.add(new Pair(graphrequest.e, list.get(j1)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new Runnable(arraylist, i1) {

                    final ArrayList a;
                    final i b;

                    public final void run()
                    {
                        Pair pair;
                        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)pair.first).a((j)pair.second))
                        {
                            pair = (Pair)iterator.next();
                        }

                        for (Iterator iterator1 = b.e.iterator(); iterator1.hasNext(); ((i.a)iterator1.next()).a()) { }
                    }

            
            {
                a = arraylist;
                b = i1;
                super();
            }
                };
                i1 = i1.a;
                if (i1 != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        i1.post(list);
    }

    private static void a(String s, Object obj, c c1, boolean flag)
        throws IOException
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
}), ((JSONObject) (obj)).opt(s1), c1, flag))
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
                    }), ((JSONArray) (obj)).opt(i1), c1, flag);
                }

            } else
            if (java/lang/String.isAssignableFrom(((Class) (obj1))) || java/lang/Number.isAssignableFrom(((Class) (obj1))) || java/lang/Boolean.isAssignableFrom(((Class) (obj1))))
            {
                c1.a(s, obj.toString());
            } else
            if (java/util/Date.isAssignableFrom(((Class) (obj1))))
            {
                obj = (Date)obj;
                c1.a(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
                return;
            }
        }
    }

    private static void a(Map map, e e1)
        throws IOException
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            a a1 = (a)map.get(s);
            if (c(a1.b))
            {
                e1.a(s, a1.b, a1.a);
            }
        } while (true);
    }

    private void a(JSONArray jsonarray, Map map)
        throws JSONException, IOException
    {
        JSONObject jsonobject = new JSONObject();
        if (l != null)
        {
            jsonobject.put("name", l);
            jsonobject.put("omit_response_on_success", n);
        }
        if (m != null)
        {
            jsonobject.put("depends_on", m);
        }
        String s = d();
        jsonobject.put("relative_url", s);
        jsonobject.put("method", j);
        if (b != null)
        {
            com.facebook.internal.h.a(b.d);
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = d.get(((String) (obj)));
            if (c(obj))
            {
                String s1 = String.format(Locale.ROOT, "%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s1);
                map.put(s1, new a(this, obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        if (c != null)
        {
            map = new ArrayList();
            a(c, s, new c(map) {

                final ArrayList a;
                final GraphRequest b;

                public final void a(String s2, String s3)
                    throws IOException
                {
                    a.add(String.format(Locale.US, "%s=%s", new Object[] {
                        s2, URLEncoder.encode(s3, "UTF-8")
                    }));
                }

            
            {
                b = GraphRequest.this;
                a = arraylist;
                super();
            }
            });
            jsonobject.put("body", TextUtils.join("&", map));
        }
        jsonarray.put(jsonobject);
    }

    private static void a(JSONObject jsonobject, String s, c c1)
        throws IOException
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
            a(((String) (obj)), obj1, c1, flag);
        }
    }

    static boolean a(Object obj)
    {
        return d(obj);
    }

    public static com.facebook.h b(i i1)
    {
        com.facebook.internal.n.a(i1, "requests");
        i1 = new com.facebook.h(i1);
        i1.a();
        return i1;
    }

    static String b(Object obj)
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
                for (Iterator iterator = d.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s1, e(s).toString()))
                {
                    s1 = (String)iterator.next();
                    Object obj = d.get(s1);
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
            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
                s.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    private static HttpURLConnection c(i i1)
    {
        Iterator iterator = i1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            GraphRequest graphrequest = (GraphRequest)iterator.next();
            if (HttpMethod.a.equals(graphrequest.j))
            {
                String s1 = graphrequest.p;
                boolean flag;
                if (com.facebook.internal.m.a(s1))
                {
                    flag = true;
                } else
                {
                    String s = s1;
                    if (s1.startsWith("v"))
                    {
                        s = s1.substring(1);
                    }
                    String as[] = s.split("\\.");
                    if (as.length >= 2 && Integer.parseInt(as[0]) > 2 || Integer.parseInt(as[0]) >= 2 && Integer.parseInt(as[1]) >= 4)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                if (flag)
                {
                    Bundle bundle = graphrequest.d;
                    if (!bundle.containsKey("fields") || com.facebook.internal.m.a(bundle.getString("fields")))
                    {
                        com.facebook.internal.h.b(LoggingBehavior.f, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] {
                            graphrequest.k
                        });
                    }
                }
            }
        } while (true);
        if (i1.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj1 = i1.a(0);
        if (((GraphRequest) (obj1)).o == null) goto _L4; else goto _L3
_L3:
        Object obj = ((GraphRequest) (obj1)).o.toString();
_L20:
        obj = new URL(((String) (obj)));
_L14:
        Object obj2;
        HttpURLConnection httpurlconnection;
        h h1;
        URL url;
        boolean flag1;
        int j1;
        int k1;
        boolean flag2;
        try
        {
            httpurlconnection = (HttpURLConnection)((URL) (obj)).openConnection();
            if (q == null)
            {
                q = String.format("%s.%s", new Object[] {
                    "FBAndroidSDK", "4.5.0"
                });
                obj = g.a;
                if (!com.facebook.internal.m.a(((String) (obj))))
                {
                    q = String.format(Locale.ROOT, "%s/%s", new Object[] {
                        q, obj
                    });
                }
            }
            httpurlconnection.setRequestProperty("User-Agent", q);
            httpurlconnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpurlconnection.setChunkedStreamingMode(0);
            h1 = new h(LoggingBehavior.a, "Request");
            k1 = i1.size();
            flag2 = e(i1);
        }
        // Misplaced declaration of an exception variable
        catch (i i1)
        {
            throw new FacebookException("could not construct request body", i1);
        }
        // Misplaced declaration of an exception variable
        catch (i i1)
        {
            throw new FacebookException("could not construct request body", i1);
        }
        if (k1 != 1) goto _L6; else goto _L5
_L5:
        obj = i1.a(0).j;
_L15:
        httpurlconnection.setRequestMethod(((HttpMethod) (obj)).name());
        if (!flag2) goto _L8; else goto _L7
_L7:
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
_L16:
        url = httpurlconnection.getURL();
        h1.b("Request:\n");
        h1.a("Id", i1.d);
        h1.a("URL", url);
        h1.a("Method", httpurlconnection.getRequestMethod());
        h1.a("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        h1.a("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(i1.c);
        httpurlconnection.setReadTimeout(i1.c);
        if (obj == HttpMethod.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1) goto _L10; else goto _L9
_L9:
        h1.a();
        return httpurlconnection;
_L4:
        if (((GraphRequest) (obj1)).j != HttpMethod.b || ((GraphRequest) (obj1)).k == null || !((GraphRequest) (obj1)).k.endsWith("/videos")) goto _L12; else goto _L11
_L11:
        obj = com.facebook.internal.l.c();
_L13:
        obj = String.format("%s/%s", new Object[] {
            obj, ((GraphRequest) (obj1)).e()
        });
        ((GraphRequest) (obj1)).c();
        obj = ((GraphRequest) (obj1)).b(((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L12:
        try
        {
            obj = com.facebook.internal.l.b();
        }
        // Misplaced declaration of an exception variable
        catch (i i1)
        {
            throw new FacebookException("could not construct URL for request", i1);
        }
        if (true) goto _L13; else goto _L2
_L2:
        obj = new URL(com.facebook.internal.l.b());
          goto _L14
_L6:
        obj = HttpMethod.b;
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
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_730;
        }
        obj1 = obj2;
        obj = new GZIPOutputStream(((OutputStream) (obj2)));
        obj1 = obj;
        if (!d(i1))
        {
            break MISSING_BLOCK_LABEL_794;
        }
        obj1 = obj;
        obj2 = new com.facebook.n(i1.a);
        obj1 = obj;
        a(i1, null, k1, url, ((OutputStream) (obj2)), flag2);
        obj1 = obj;
        j1 = ((com.facebook.n) (obj2)).b;
        obj1 = obj;
        obj = new o(((OutputStream) (obj)), i1, ((com.facebook.n) (obj2)).a, j1);
        a(i1, h1, k1, url, ((OutputStream) (obj)), flag2);
        ((OutputStream) (obj)).close();
        h1.a();
        return httpurlconnection;
        i1;
        obj1 = null;
_L18:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_843;
        }
        ((OutputStream) (obj1)).close();
        throw i1;
        i1;
        continue; /* Loop/switch isn't completed */
        i1;
        obj1 = obj;
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
    }

    private void c()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        if (!d.containsKey("access_token"))
        {
            String s = b.d;
            com.facebook.internal.h.a(s);
            d.putString("access_token", s);
        }
_L8:
        d.putString("sdk", "android");
        d.putString("format", "json");
        if (!com.facebook.g.a(com.facebook.LoggingBehavior.h)) goto _L4; else goto _L3
_L3:
        d.putString("debug", "info");
_L6:
        return;
_L2:
        if (!g && !d.containsKey("access_token"))
        {
            String s1 = com.facebook.g.j();
            String s2 = com.facebook.g.k();
            if (!com.facebook.internal.m.a(s1) && !com.facebook.internal.m.a(s2))
            {
                s1 = (new StringBuilder()).append(s1).append("|").append(s2).toString();
                d.putString("access_token", s1);
            } else
            {
                Log.d(a, "Warning: Request without access token missing application ID or client token.");
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!com.facebook.g.a(com.facebook.LoggingBehavior.g)) goto _L6; else goto _L5
_L5:
        d.putString("debug", "warning");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static boolean c(Object obj)
    {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    private String d()
    {
        if (o != null)
        {
            throw new FacebookException("Can't override URL for a batch request");
        } else
        {
            String s = e();
            c();
            return b(s);
        }
    }

    private static boolean d(i i1)
    {
        for (Iterator iterator = i1.e.iterator(); iterator.hasNext();)
        {
            if ((i.a)iterator.next() instanceof i.b)
            {
                return true;
            }
        }

        for (i1 = i1.iterator(); i1.hasNext();)
        {
            if (((GraphRequest)i1.next()).e instanceof d)
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
                p, k
            });
        }
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

    private static boolean e(i i1)
    {
        i1 = i1.iterator();
label0:
        do
        {
            if (i1.hasNext())
            {
                GraphRequest graphrequest = (GraphRequest)i1.next();
                Iterator iterator = graphrequest.d.keySet().iterator();
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s = (String)iterator.next();
                } while (!c(graphrequest.d.get(s)));
                break;
            } else
            {
                return true;
            }
        } while (true);
        return false;
    }

    private static String f(i i1)
    {
        if (!com.facebook.internal.m.a(i1.f))
        {
            return i1.f;
        }
        for (i1 = i1.iterator(); i1.hasNext();)
        {
            Object obj = ((GraphRequest)i1.next()).b;
            if (obj != null)
            {
                obj = ((AccessToken) (obj)).g;
                if (obj != null)
                {
                    return ((String) (obj));
                }
            }
        }

        if (!com.facebook.internal.m.a(h))
        {
            return h;
        } else
        {
            return com.facebook.g.j();
        }
    }

    public final j a()
    {
        GraphRequest agraphrequest[] = new GraphRequest[1];
        agraphrequest[0] = this;
        com.facebook.internal.n.a(agraphrequest, "requests");
        List list = a(new i(Arrays.asList(agraphrequest)));
        if (list == null || list.size() != 1)
        {
            throw new FacebookException("invalid state: expected a single response");
        } else
        {
            return (j)list.get(0);
        }
    }

    public final void a(b b1)
    {
        if (com.facebook.g.a(com.facebook.LoggingBehavior.h) || com.facebook.g.a(com.facebook.LoggingBehavior.g))
        {
            e = new b(b1) {

                final b a;
                final GraphRequest b;

                public final void a(j j1)
                {
                    Object obj = j1.a;
                    JSONArray jsonarray;
                    if (obj != null)
                    {
                        obj = ((JSONObject) (obj)).optJSONObject("__debug__");
                    } else
                    {
                        obj = null;
                    }
                    if (obj != null)
                    {
                        jsonarray = ((JSONObject) (obj)).optJSONArray("messages");
                    } else
                    {
                        jsonarray = null;
                    }
                    if (jsonarray != null)
                    {
                        int i1 = 0;
                        while (i1 < jsonarray.length()) 
                        {
                            Object obj1 = jsonarray.optJSONObject(i1);
                            String s;
                            LoggingBehavior loggingbehavior;
                            if (obj1 != null)
                            {
                                obj = ((JSONObject) (obj1)).optString("message");
                            } else
                            {
                                obj = null;
                            }
                            if (obj1 != null)
                            {
                                s = ((JSONObject) (obj1)).optString("type");
                            } else
                            {
                                s = null;
                            }
                            if (obj1 != null)
                            {
                                obj1 = ((JSONObject) (obj1)).optString("link");
                            } else
                            {
                                obj1 = null;
                            }
                            if (obj == null || s == null)
                            {
                                continue;
                            }
                            loggingbehavior = com.facebook.LoggingBehavior.h;
                            if (s.equals("warning"))
                            {
                                loggingbehavior = com.facebook.LoggingBehavior.g;
                            }
                            s = ((String) (obj));
                            if (!com.facebook.internal.m.a(((String) (obj1))))
                            {
                                s = (new StringBuilder()).append(((String) (obj))).append(" Link: ").append(((String) (obj1))).toString();
                            }
                            com.facebook.internal.h.a(loggingbehavior, GraphRequest.a, s);
                            i1++;
                        }
                    }
                    if (a != null)
                    {
                        a.a(j1);
                    }
                }

            
            {
                b = GraphRequest.this;
                a = b1;
                super();
            }
            };
            return;
        } else
        {
            e = b1;
            return;
        }
    }

    public final com.facebook.h b()
    {
        GraphRequest agraphrequest[] = new GraphRequest[1];
        agraphrequest[0] = this;
        com.facebook.internal.n.a(agraphrequest, "requests");
        return b(new i(Arrays.asList(agraphrequest)));
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("{Request:  accessToken: ");
        Object obj;
        if (b == null)
        {
            obj = "null";
        } else
        {
            obj = b;
        }
        return stringbuilder.append(obj).append(", graphPath: ").append(k).append(", graphObject: ").append(c).append(", httpMethod: ").append(j).append(", parameters: ").append(d).append("}").toString();
    }

}
