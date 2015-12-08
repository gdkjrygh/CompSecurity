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
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.J;
import com.facebook.internal.K;
import com.facebook.internal.S;
import com.facebook.internal.U;
import com.facebook.internal.Y;
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
//            E, p, C, D, 
//            c, AccessToken, h, d, 
//            y, z, B, G, 
//            s, L, M, x, 
//            A, P

public class GraphRequest
{
    public static class ParcelableResourceWithMimeType
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new A();
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
            b = parcel.readParcelable(s.f().getClassLoader());
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

        public abstract void a(D d1);
    }

    private static interface c
    {

        public abstract void a(String s1, String s2)
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
        private final K b;
        private boolean c;
        private boolean d;

        private static RuntimeException a()
        {
            return new IllegalArgumentException("value is not a supported type.");
        }

        private void a(String s1, Uri uri, String s2)
            throws IOException
        {
            String s3 = s2;
            if (s2 == null)
            {
                s3 = "content/unknown";
            }
            a(s1, s1, s3);
            s2 = s.f().getContentResolver().openInputStream(uri);
            int i1;
            if (a instanceof L)
            {
                long l1 = U.e(uri);
                ((L)a).a(l1);
                i1 = 0;
            } else
            {
                i1 = U.a(s2, a) + 0;
            }
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s1).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(i1)
                }));
            }
        }

        private void a(String s1, ParcelFileDescriptor parcelfiledescriptor, String s2)
            throws IOException
        {
            String s3 = s2;
            if (s2 == null)
            {
                s3 = "content/unknown";
            }
            a(s1, s1, s3);
            int i1;
            if (a instanceof L)
            {
                ((L)a).a(parcelfiledescriptor.getStatSize());
                i1 = 0;
            } else
            {
                i1 = U.a(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor), a) + 0;
            }
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s1).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(i1)
                }));
            }
        }

        private void a(String s1, String s2, String s3)
            throws IOException
        {
            if (!d)
            {
                a("Content-Disposition: form-data; name=\"%s\"", new Object[] {
                    s1
                });
                if (s2 != null)
                {
                    a("; filename=\"%s\"", new Object[] {
                        s2
                    });
                }
                b("", new Object[0]);
                if (s3 != null)
                {
                    b("%s: %s", new Object[] {
                        "Content-Type", s3
                    });
                }
                b("", new Object[0]);
                return;
            } else
            {
                a.write(String.format("%s=", new Object[] {
                    s1
                }).getBytes());
                return;
            }
        }

        private transient void a(String s1, Object aobj[])
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
                a.write(String.format(s1, aobj).getBytes());
                return;
            } else
            {
                a.write(URLEncoder.encode(String.format(Locale.US, s1, aobj), "UTF-8").getBytes());
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

        private transient void b(String s1, Object aobj[])
            throws IOException
        {
            a(s1, aobj);
            if (!d)
            {
                a("\r\n", new Object[0]);
            }
        }

        public final void a(String s1, Object obj, GraphRequest graphrequest)
            throws IOException
        {
            if (a instanceof P)
            {
                ((P)a).a(graphrequest);
            }
            if (!GraphRequest.a(obj)) goto _L2; else goto _L1
_L1:
            a(s1, GraphRequest.b(obj));
_L4:
            return;
_L2:
            if (!(obj instanceof Bitmap))
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (Bitmap)obj;
            a(s1, s1, "image/png");
            ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, a);
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s1).toString(), "<Image>");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (obj instanceof byte[])
            {
                obj = (byte[])(byte[])obj;
                a(s1, s1, "content/unknown");
                a.write(((byte []) (obj)));
                b("", new Object[0]);
                b();
                if (b != null)
                {
                    b.a((new StringBuilder("    ")).append(s1).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                        Integer.valueOf(obj.length)
                    }));
                    return;
                }
            } else
            {
                if (obj instanceof Uri)
                {
                    a(s1, (Uri)obj, ((String) (null)));
                    return;
                }
                if (obj instanceof ParcelFileDescriptor)
                {
                    a(s1, (ParcelFileDescriptor)obj, ((String) (null)));
                    return;
                }
                if (obj instanceof ParcelableResourceWithMimeType)
                {
                    graphrequest = (ParcelableResourceWithMimeType)obj;
                    obj = ((ParcelableResourceWithMimeType) (graphrequest)).b;
                    graphrequest = ((ParcelableResourceWithMimeType) (graphrequest)).a;
                    if (obj instanceof ParcelFileDescriptor)
                    {
                        a(s1, (ParcelFileDescriptor)obj, ((String) (graphrequest)));
                        return;
                    }
                    if (obj instanceof Uri)
                    {
                        a(s1, (Uri)obj, ((String) (graphrequest)));
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

        public final void a(String s1, String s2)
            throws IOException
        {
            a(s1, ((String) (null)), ((String) (null)));
            b("%s", new Object[] {
                s2
            });
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s1).toString(), s2);
            }
        }

        public final void a(String s1, JSONArray jsonarray, Collection collection)
            throws IOException, JSONException
        {
            if (!(a instanceof P))
            {
                a(s1, jsonarray.toString());
            } else
            {
                P p1 = (P)a;
                a(s1, ((String) (null)), ((String) (null)));
                a("[", new Object[0]);
                collection = collection.iterator();
                int i1 = 0;
                while (collection.hasNext()) 
                {
                    GraphRequest graphrequest = (GraphRequest)collection.next();
                    JSONObject jsonobject = jsonarray.getJSONObject(i1);
                    p1.a(graphrequest);
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
                    b.a((new StringBuilder("    ")).append(s1).toString(), jsonarray.toString());
                    return;
                }
            }
        }

        public e(OutputStream outputstream, K k1, boolean flag)
        {
            c = true;
            d = false;
            a = outputstream;
            b = k1;
            d = flag;
        }
    }


    public static final String a = com/facebook/GraphRequest.getSimpleName();
    private static String i;
    private static Pattern j = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String q;
    AccessToken b;
    public JSONObject c;
    public Bundle d;
    b e;
    public Object f;
    public String g;
    public boolean h;
    private E k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;

    public GraphRequest()
    {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s1, Bundle bundle, E e1)
    {
        this(accesstoken, s1, bundle, e1, null);
    }

    public GraphRequest(AccessToken accesstoken, String s1, Bundle bundle, E e1, b b1)
    {
        this(accesstoken, s1, bundle, e1, b1, (byte)0);
    }

    private GraphRequest(AccessToken accesstoken, String s1, Bundle bundle, E e1, b b1, byte byte0)
    {
        o = true;
        h = false;
        b = accesstoken;
        l = s1;
        g = null;
        a(b1);
        if (p != null && e1 != E.a)
        {
            throw new p("Can't change HTTP method on request with overridden URL.");
        }
        if (e1 == null)
        {
            e1 = E.a;
        }
        k = e1;
        if (bundle != null)
        {
            d = new Bundle(bundle);
        } else
        {
            d = new Bundle();
        }
        if (g == null)
        {
            g = S.d();
        }
    }

    public static GraphRequest a(String s1)
    {
        s1 = new GraphRequest(null, s1, null, E.b, null);
        s1.c = null;
        return s1;
    }

    public static List a(C c1)
    {
        Y.a(c1, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = c(c1);
        }
        catch (Exception exception)
        {
            List list = D.a(c1.b, null, new p(exception));
            a(c1, list);
            return list;
        }
        return a(httpurlconnection, c1);
    }

    public static List a(HttpURLConnection httpurlconnection, C c1)
    {
        List list;
        boolean flag;
        flag = true;
        list = D.a(httpurlconnection, c1);
        U.a(httpurlconnection);
        int i1 = c1.size();
        if (i1 != list.size())
        {
            throw new p(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(i1)
            }));
        }
        a(c1, list);
        httpurlconnection = com.facebook.c.a();
        if (((com.facebook.c) (httpurlconnection)).b == null) goto _L2; else goto _L1
_L1:
        c1 = Long.valueOf((new Date()).getTime());
        if (!((com.facebook.c) (httpurlconnection)).b.e.h || c1.longValue() - ((com.facebook.c) (httpurlconnection)).c.getTime() <= 0x36ee80L || c1.longValue() - ((com.facebook.c) (httpurlconnection)).b.f.getTime() <= 0x5265c00L) goto _L2; else goto _L3
_L3:
        if (flag)
        {
            if (!Looper.getMainLooper().equals(Looper.myLooper()))
            {
                break; /* Loop/switch isn't completed */
            }
            httpurlconnection.b();
        }
        return list;
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
        (new Handler(Looper.getMainLooper())).post(new com.facebook.d(httpurlconnection));
        return list;
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
            String s1 = (String)iterator.next();
            Object obj = bundle.get(s1);
            if (d(obj))
            {
                e1.a(s1, obj, graphrequest);
            }
        } while (true);
    }

    private static void a(C c1, K k1, int i1, URL url, OutputStream outputstream, boolean flag)
        throws IOException, JSONException
    {
        outputstream = new e(outputstream, k1, flag);
        if (i1 == 1)
        {
            c1 = c1.a(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((GraphRequest) (c1)).d.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                Object obj = ((GraphRequest) (c1)).d.get(s1);
                if (c(obj))
                {
                    hashmap.put(s1, new a(c1, obj));
                }
            } while (true);
            if (k1 != null)
            {
                k1.b("  Parameters:\n");
            }
            a(((GraphRequest) (c1)).d, ((e) (outputstream)), ((GraphRequest) (c1)));
            if (k1 != null)
            {
                k1.b("  Attachments:\n");
            }
            a(((Map) (hashmap)), ((e) (outputstream)));
            if (((GraphRequest) (c1)).c != null)
            {
                a(((GraphRequest) (c1)).c, url.getPath(), ((c) (outputstream)));
            }
            return;
        }
        url = f(c1);
        if (U.a(url))
        {
            throw new p("App ID was not specified at the request or Settings.");
        }
        outputstream.a("batch_app_id", url);
        url = new HashMap();
        a(((e) (outputstream)), ((Collection) (c1)), ((Map) (url)));
        if (k1 != null)
        {
            k1.b("  Attachments:\n");
        }
        a(((Map) (url)), ((e) (outputstream)));
    }

    private static void a(C c1, List list)
    {
label0:
        {
            int j1 = c1.size();
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < j1; i1++)
            {
                GraphRequest graphrequest = c1.a(i1);
                if (graphrequest.e != null)
                {
                    arraylist.add(new Pair(graphrequest.e, list.get(i1)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new y(arraylist, c1);
                c1 = c1.a;
                if (c1 != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        c1.post(list);
    }

    private static void a(e e1, Collection collection, Map map)
        throws JSONException, IOException
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).a(jsonarray, map)) { }
        e1.a("batch", jsonarray, collection);
    }

    private static void a(String s1, Object obj, c c1, boolean flag)
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
                    String s2;
                    for (obj1 = ((JSONObject) (obj)).keys(); ((Iterator) (obj1)).hasNext(); a(String.format("%s[%s]", new Object[] {
    s1, s2
}), ((JSONObject) (obj)).opt(s2), c1, flag))
                    {
                        s2 = (String)((Iterator) (obj1)).next();
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
                        s1, Integer.valueOf(i1)
                    }), ((JSONArray) (obj)).opt(i1), c1, flag);
                }

            } else
            if (java/lang/String.isAssignableFrom(((Class) (obj1))) || java/lang/Number.isAssignableFrom(((Class) (obj1))) || java/lang/Boolean.isAssignableFrom(((Class) (obj1))))
            {
                c1.a(s1, obj.toString());
            } else
            if (java/util/Date.isAssignableFrom(((Class) (obj1))))
            {
                obj = (Date)obj;
                c1.a(s1, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
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
            String s1 = (String)iterator.next();
            a a1 = (a)map.get(s1);
            if (c(a1.b))
            {
                e1.a(s1, a1.b, a1.a);
            }
        } while (true);
    }

    private void a(JSONArray jsonarray, Map map)
        throws JSONException, IOException
    {
        JSONObject jsonobject = new JSONObject();
        if (m != null)
        {
            jsonobject.put("name", m);
            jsonobject.put("omit_response_on_success", o);
        }
        if (n != null)
        {
            jsonobject.put("depends_on", n);
        }
        String s1 = c();
        jsonobject.put("relative_url", s1);
        jsonobject.put("method", k);
        if (b != null)
        {
            K.a(b.d);
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
                String s2 = String.format(Locale.ROOT, "%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s2);
                map.put(s2, new a(this, obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        if (c != null)
        {
            map = new ArrayList();
            a(c, s1, ((c) (new z(this, map))));
            jsonobject.put("body", TextUtils.join("&", map));
        }
        jsonarray.put(jsonobject);
    }

    private static void a(JSONObject jsonobject, String s1, c c1)
        throws IOException
    {
        Object obj = j.matcher(s1);
        int i1;
        if (((Matcher) (obj)).matches())
        {
            obj = ((Matcher) (obj)).group(1);
        } else
        {
            obj = s1;
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
            i1 = s1.indexOf(":");
            int j1 = s1.indexOf("?");
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
        s1 = jsonobject.keys();
        while (s1.hasNext()) 
        {
            obj = (String)s1.next();
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

    public static B b(C c1)
    {
        Y.a(c1, "requests");
        c1 = new B(c1);
        c1.a();
        return c1;
    }

    public static GraphRequest b(String s1)
    {
        return new GraphRequest(null, s1, null, null, null);
    }

    static String b(Object obj)
    {
        return e(obj);
    }

    private void b()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        if (!d.containsKey("access_token"))
        {
            String s1 = b.d;
            K.a(s1);
            d.putString("access_token", s1);
        }
_L8:
        d.putString("sdk", "android");
        d.putString("format", "json");
        if (!s.a(G.h)) goto _L4; else goto _L3
_L3:
        d.putString("debug", "info");
_L6:
        return;
_L2:
        if (!h && !d.containsKey("access_token"))
        {
            String s2 = s.h();
            String s3 = s.j();
            if (!U.a(s2) && !U.a(s3))
            {
                s2 = (new StringBuilder()).append(s2).append("|").append(s3).toString();
                d.putString("access_token", s2);
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s.a(G.g)) goto _L6; else goto _L5
_L5:
        d.putString("debug", "warning");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String c()
    {
        if (p != null)
        {
            throw new p("Can't override URL for a batch request");
        } else
        {
            String s1 = d();
            b();
            return c(s1);
        }
    }

    private String c(String s1)
    {
        android.net.Uri.Builder builder;
label0:
        {
            builder = (new android.net.Uri.Builder()).encodedPath(s1);
label1:
            do
            {
                String s2;
                for (Iterator iterator = d.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s2, e(s1).toString()))
                {
                    s2 = (String)iterator.next();
                    Object obj = d.get(s2);
                    s1 = ((String) (obj));
                    if (obj == null)
                    {
                        s1 = "";
                    }
                    if (!d(s1))
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (k != E.a);
            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
                s1.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    private static HttpURLConnection c(C c1)
    {
        if (c1.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj1 = c1.a(0);
        if (((GraphRequest) (obj1)).p == null) goto _L4; else goto _L3
_L3:
        Object obj = ((GraphRequest) (obj1)).p.toString();
_L20:
        obj = new URL(((String) (obj)));
_L14:
        Object obj2;
        HttpURLConnection httpurlconnection;
        K k1;
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
                    "FBAndroidSDK", "4.4.0"
                });
                obj = J.a;
                if (!U.a(((String) (obj))))
                {
                    q = String.format(Locale.ROOT, "%s/%s", new Object[] {
                        q, obj
                    });
                }
            }
            httpurlconnection.setRequestProperty("User-Agent", q);
            httpurlconnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpurlconnection.setChunkedStreamingMode(0);
            k1 = new K(G.a, "Request");
            j1 = c1.size();
            flag1 = e(c1);
        }
        // Misplaced declaration of an exception variable
        catch (C c1)
        {
            throw new p("could not construct request body", c1);
        }
        // Misplaced declaration of an exception variable
        catch (C c1)
        {
            throw new p("could not construct request body", c1);
        }
        if (j1 != 1) goto _L6; else goto _L5
_L5:
        obj = c1.a(0).k;
_L15:
        httpurlconnection.setRequestMethod(((E) (obj)).name());
        if (!flag1) goto _L8; else goto _L7
_L7:
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
_L16:
        url = httpurlconnection.getURL();
        k1.b("Request:\n");
        k1.a("Id", c1.d);
        k1.a("URL", url);
        k1.a("Method", httpurlconnection.getRequestMethod());
        k1.a("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        k1.a("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(c1.c);
        httpurlconnection.setReadTimeout(c1.c);
        if (obj == E.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L10; else goto _L9
_L9:
        k1.a();
        return httpurlconnection;
_L4:
        if (((GraphRequest) (obj1)).k != E.b || ((GraphRequest) (obj1)).l == null || !((GraphRequest) (obj1)).l.endsWith("/videos")) goto _L12; else goto _L11
_L11:
        obj = S.c();
_L13:
        obj = String.format("%s/%s", new Object[] {
            obj, ((GraphRequest) (obj1)).d()
        });
        ((GraphRequest) (obj1)).b();
        obj = ((GraphRequest) (obj1)).c(((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L12:
        try
        {
            obj = S.b();
        }
        // Misplaced declaration of an exception variable
        catch (C c1)
        {
            throw new p("could not construct URL for request", c1);
        }
        if (true) goto _L13; else goto _L2
_L2:
        obj = new URL(S.b());
          goto _L14
_L6:
        obj = E.b;
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
            break MISSING_BLOCK_LABEL_540;
        }
        obj1 = obj2;
        obj = new GZIPOutputStream(((OutputStream) (obj2)));
        obj1 = obj;
        if (!d(c1))
        {
            break MISSING_BLOCK_LABEL_604;
        }
        obj1 = obj;
        obj2 = new L(c1.a);
        obj1 = obj;
        a(c1, null, j1, url, ((OutputStream) (obj2)), flag1);
        obj1 = obj;
        i1 = ((L) (obj2)).b;
        obj1 = obj;
        obj = new M(((OutputStream) (obj)), c1, ((L) (obj2)).a, i1);
        a(c1, k1, j1, url, ((OutputStream) (obj)), flag1);
        ((OutputStream) (obj)).close();
        k1.a();
        return httpurlconnection;
        c1;
        obj1 = null;
_L18:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_653;
        }
        ((OutputStream) (obj1)).close();
        throw c1;
        c1;
        continue; /* Loop/switch isn't completed */
        c1;
        obj1 = obj;
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
    }

    private static boolean c(Object obj)
    {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    private String d()
    {
        if (j.matcher(l).matches())
        {
            return l;
        } else
        {
            return String.format("%s/%s", new Object[] {
                g, l
            });
        }
    }

    private static boolean d(C c1)
    {
        for (Iterator iterator = c1.e.iterator(); iterator.hasNext();)
        {
            if ((C.a)iterator.next() instanceof C.b)
            {
                return true;
            }
        }

        for (c1 = c1.iterator(); c1.hasNext();)
        {
            if (((GraphRequest)c1.next()).e instanceof d)
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

    private static boolean e(C c1)
    {
        c1 = c1.iterator();
label0:
        do
        {
            if (c1.hasNext())
            {
                GraphRequest graphrequest = (GraphRequest)c1.next();
                Iterator iterator = graphrequest.d.keySet().iterator();
                String s1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s1 = (String)iterator.next();
                } while (!c(graphrequest.d.get(s1)));
                break;
            } else
            {
                return true;
            }
        } while (true);
        return false;
    }

    private static String f(C c1)
    {
        if (!U.a(c1.f))
        {
            return c1.f;
        }
        for (c1 = c1.iterator(); c1.hasNext();)
        {
            Object obj = ((GraphRequest)c1.next()).b;
            if (obj != null)
            {
                obj = ((AccessToken) (obj)).g;
                if (obj != null)
                {
                    return ((String) (obj));
                }
            }
        }

        if (!U.a(i))
        {
            return i;
        } else
        {
            return s.h();
        }
    }

    public final D a()
    {
        GraphRequest agraphrequest[] = new GraphRequest[1];
        agraphrequest[0] = this;
        Y.a(agraphrequest, "requests");
        List list = a(new C(Arrays.asList(agraphrequest)));
        if (list == null || list.size() != 1)
        {
            throw new p("invalid state: expected a single response");
        } else
        {
            return (D)list.get(0);
        }
    }

    public final void a(b b1)
    {
        if (s.a(G.h) || s.a(G.g))
        {
            e = new x(this, b1);
            return;
        } else
        {
            e = b1;
            return;
        }
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
        return stringbuilder.append(obj).append(", graphPath: ").append(l).append(", graphObject: ").append(c).append(", httpMethod: ").append(k).append(", parameters: ").append(d).append("}").toString();
    }

}
