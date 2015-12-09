// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import bolts.j;
import com.android.volley.r;
import com.android.volley.toolbox.m;
import com.androidquery.callback.AjaxCallback;
import com.cardinalblue.android.b.c;
import com.cardinalblue.android.b.e;
import com.cardinalblue.android.b.g;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.a.b;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeSearchResponse;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.PicUsersData;
import com.cardinalblue.android.piccollage.model.gson.PicUsersResponse;
import com.cardinalblue.android.piccollage.model.gson.SinglePicUserResponse;
import com.cardinalblue.android.piccollage.model.gson.SingleWebPhotoResponse;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPhotosData;
import com.facebook.AccessToken;
import com.google.android.gcm.a;
import com.google.b.o;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.network:
//            b, g, a

public class com.cardinalblue.android.piccollage.controller.network.f
{
    public static class a extends Exception
    {

        public a(String s1)
        {
            super(s1);
        }
    }

    public static class b extends a
    {

        public b(String s1)
        {
            super(s1);
        }
    }

    public static class c extends a
    {

        public c(String s1)
        {
            super(s1);
        }
    }

    public static class d extends a
    {

        public d(String s1)
        {
            super(s1);
        }
    }

    public static class e extends a
    {

        public e(String s1)
        {
            super(s1);
        }
    }

    public static class f extends a
    {

        public f(String s1)
        {
            super(s1);
        }
    }

    public static class g extends a
    {

        private final int a;
        private final boolean b;

        public static g a(String s1)
        {
            try
            {
                s1 = (new JSONObject(s1)).getJSONObject("error");
                s1 = new g(s1.getString("message"), s1.getBoolean("refresh_access_token"), s1.getString("provider"));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return null;
            }
            return s1;
        }

        private int b(String s1)
        {
            if (!TextUtils.isEmpty(s1))
            {
                if ("cb".equalsIgnoreCase(s1))
                {
                    return 0;
                }
                if ("facebook".equalsIgnoreCase(s1))
                {
                    return 1;
                }
                if ("twitter".equalsIgnoreCase(s1))
                {
                    return 2;
                }
                if ("tumblr".equalsIgnoreCase(s1))
                {
                    return 4;
                }
            }
            return -1;
        }

        public boolean a()
        {
            return b;
        }

        public int b()
        {
            return a;
        }

        public g(String s1, boolean flag, String s2)
        {
            super(s1);
            b = flag;
            a = b(s2);
        }
    }

    private static class h
        implements com.android.volley.m.a
    {

        private final com.android.volley.m.a a;

        public void a(r r1)
        {
            try
            {
                com.cardinalblue.android.piccollage.controller.network.f.a(r1);
            }
            catch (a a1)
            {
                com.cardinalblue.android.piccollage.a.f.a(a1);
            }
            if (a != null)
            {
                a.a(r1);
            }
        }

        public h(com.android.volley.m.a a1)
        {
            a = a1;
        }
    }


    private static String a = "https://";
    private static com.cardinalblue.android.piccollage.controller.network.a b;

    public com.cardinalblue.android.piccollage.controller.network.f()
    {
    }

    private static PicUsersData A(String s1)
        throws JSONException, IOException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new JSONException("JSON string is empty");
        }
        PicUsersData picusersdata = ((PicUsersResponse)com.cardinalblue.android.b.k.a(PicUsersResponse.getFieldNamingStrategy("users"), s1, com/cardinalblue/android/piccollage/model/gson/PicUsersResponse)).getData();
        if (picusersdata == null)
        {
            throw new JSONException((new StringBuilder()).append("Can't parse FollowUsersResponse from json: ").append(s1).toString());
        } else
        {
            return picusersdata;
        }
    }

    private static void B(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(s1 = new JSONObject(s1)).has("badge")) goto _L1; else goto _L3
_L3:
        int i1;
        i1 = s1.getInt("badge");
        s1 = com.cardinalblue.android.b.k.j().edit();
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            s1.putBoolean("pref_has_badge", flag).commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }

    public static com.android.volley.k a(Context context, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        String s1 = b("device_configuration", ((List) (null)));
        return com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.i()).b(s1).a(b1).a(a1).a());
    }

    private static com.cardinalblue.android.piccollage.controller.network.b a(Context context, b.a a1)
    {
        a1 = new com.cardinalblue.android.piccollage.controller.network.b(a1);
        a1.a(o()).a(a(context, true));
        return a1;
        a1;
        context = null;
_L2:
        com.cardinalblue.android.piccollage.a.f.a(a1);
        return context;
        Exception exception;
        exception;
        context = a1;
        a1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static CBCollageStructResponse a(Context context, String s1, byte abyte0[], byte abyte1[], String s2)
        throws IOException, a
    {
        context = a(context, com.cardinalblue.android.piccollage.controller.network.b.a.c);
        context.a(s1).a(abyte0).b(abyte1).a(new NameValuePair[] {
            new BasicNameValuePair("caption", s2)
        });
        return a(context.a());
    }

    public static CBCollageStructResponse a(Context context, byte abyte0[], String s1)
        throws IOException, a, com.cardinalblue.android.piccollage.controller.network.g
    {
        context = a(context, com.cardinalblue.android.piccollage.controller.network.b.a.b);
        context.a(a()).a(abyte0).a(new NameValuePair[] {
            new BasicNameValuePair("caption", s1)
        });
        return a(context.a());
    }

    public static transient CBCollageStructResponse a(Context context, byte abyte0[], byte abyte1[], String s1, com.cardinalblue.android.piccollage.auth.a.b ab[])
        throws IOException, a, com.cardinalblue.android.piccollage.controller.network.g
    {
        int i1 = 0;
        context = a(context, com.cardinalblue.android.piccollage.controller.network.b.a.a);
        context.a(a()).a(abyte0).b(abyte1).a(new NameValuePair[] {
            new BasicNameValuePair("caption", s1)
        });
        for (int j1 = ab.length; i1 < j1; i1++)
        {
            context.a(ab[i1].b());
        }

        return a(context.a());
    }

    private static CBCollageStructResponse a(HttpURLConnection httpurlconnection)
        throws IOException, a
    {
        CBCollageStructResponse cbcollagestructresponse;
        httpurlconnection = b(httpurlconnection);
        try
        {
            cbcollagestructresponse = (CBCollageStructResponse)com.cardinalblue.android.b.k.b(httpurlconnection, com/cardinalblue/android/piccollage/model/CBCollageStructResponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw new e(httpurlconnection.getMessage());
        }
        if (cbcollagestructresponse != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        throw new e((new StringBuilder()).append("No CreateAndShare response ").append(httpurlconnection).toString());
        if (!cbcollagestructresponse.b())
        {
            throw new e((new StringBuilder()).append("There's no created collage in response ").append(httpurlconnection).toString());
        }
        return cbcollagestructresponse;
    }

    public static CBCollagesResponse a(String s1, int i1)
        throws ExecutionException, InterruptedException
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(new BasicNameValuePair("offset", String.valueOf(i1)));
        ((ArrayList) (obj)).add(new BasicNameValuePair("q", s1));
        ((ArrayList) (obj)).add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        s1 = b("collages/search", ((List) (obj)));
        obj = com.android.volley.toolbox.m.a();
        ((m) (obj)).a(com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).b((new com.cardinalblue.android.piccollage.lib.i.d()).b(s1).a(((com.android.volley.m.b) (obj))).a(((com.android.volley.m.a) (obj))).a()));
        return (CBCollagesResponse)((m) (obj)).get();
    }

    public static PicUsersData a(String s1, int i1, List list)
        throws IOException, JSONException, URISyntaxException, a
    {
        ArrayList arraylist = new ArrayList();
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        if (accesstoken != null)
        {
            arraylist.add(new BasicNameValuePair("auth[facebook][token]", accesstoken.getToken()));
        }
        if (i1 > 0)
        {
            arraylist.add(new BasicNameValuePair("offset", Integer.toString(i1)));
        }
        if (list != null)
        {
            arraylist.addAll(list);
        }
        arraylist.add(new BasicNameValuePair("includes", "user, is_following"));
        return A(b((HttpURLConnection)(new URL(b(s1, arraylist))).openConnection()));
    }

    public static String a()
    {
        StringBuilder stringbuilder = new StringBuilder(a);
        stringbuilder.append(c());
        stringbuilder.append("/api/");
        return stringbuilder.toString();
    }

    private static String a(int i1, String s1)
        throws a
    {
        i1;
        JVM INSTR lookupswitch 7: default 68
    //                   200: 177
    //                   400: 92
    //                   401: 104
    //                   403: 116
    //                   404: 128
    //                   500: 140
    //                   503: 152;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        s1 = new a(s1);
_L9:
        if (b != null)
        {
            b.a(s1);
        }
        throw s1;
_L3:
        s1 = new c(s1);
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = new f(s1);
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = new b(s1);
        continue; /* Loop/switch isn't completed */
_L6:
        s1 = new d(s1);
        continue; /* Loop/switch isn't completed */
_L7:
        s1 = new a(s1);
        continue; /* Loop/switch isn't completed */
_L8:
        g g1 = com.cardinalblue.android.piccollage.controller.network.g.a(s1);
        s1 = g1;
        if (g1 == null)
        {
            s1 = new a("Cannot parse json for ShareAccountError");
        }
        if (true) goto _L9; else goto _L2
_L2:
        return s1;
    }

    public static String a(String s1, List list)
    {
        s1 = com.cardinalblue.android.b.g.a(b(), s1);
        try
        {
            s1 = com.cardinalblue.android.b.k.a(com.cardinalblue.android.b.k.a(s1, list), o());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return s1;
    }

    public static String a(List list)
        throws UnsupportedEncodingException
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        boolean flag = true;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            NameValuePair namevaluepair = (NameValuePair)list.next();
            if (namevaluepair != null)
            {
                boolean flag1;
                if (flag)
                {
                    flag1 = false;
                } else
                {
                    stringbuilder.append("&");
                    flag1 = flag;
                }
                flag = flag1;
                if (!TextUtils.isEmpty(namevaluepair.getName()))
                {
                    flag = flag1;
                    if (!TextUtils.isEmpty(namevaluepair.getValue()))
                    {
                        stringbuilder.append(URLEncoder.encode(namevaluepair.getName(), "UTF-8"));
                        stringbuilder.append("=");
                        stringbuilder.append(URLEncoder.encode(namevaluepair.getValue(), "UTF-8"));
                        flag = flag1;
                    }
                }
            }
        } while (true);
        return stringbuilder.toString();
    }

    protected static List a(Context context, boolean flag)
        throws IOException
    {
        if (context == null)
        {
            throw new IOException("Context can't be null");
        } else
        {
            return a(context, flag, com.google.android.gcm.a.e(context));
        }
    }

    private static List a(Context context, boolean flag, String s1)
        throws IOException
    {
        if (context == null)
        {
            throw new IOException("Context can't be null");
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("uuid", com.cardinalblue.android.b.k.c(context)));
        String s2 = Locale.getDefault().getLanguage();
        String s3 = Locale.getDefault().getCountry();
        arraylist.add(new BasicNameValuePair("locale", (new StringBuilder()).append(s2).append("_").append(s3).toString()));
        arraylist.add(new BasicNameValuePair("language", s2));
        arraylist.add(new BasicNameValuePair("country_code", s3));
        arraylist.add(new BasicNameValuePair("os_name", com.cardinalblue.android.b.c.a()));
        arraylist.add(new BasicNameValuePair("os_version", com.cardinalblue.android.b.c.b()));
        arraylist.add(new BasicNameValuePair("device_model", com.cardinalblue.android.b.c.c()));
        arraylist.add(new BasicNameValuePair("dpi", q()));
        arraylist.add(new BasicNameValuePair("app_version", com.cardinalblue.android.b.c.a(context)));
        arraylist.add(new BasicNameValuePair("operating_system", "Android"));
        arraylist.add(new BasicNameValuePair("cb_device_id", com.cardinalblue.android.b.k.c(com.cardinalblue.android.b.k.a())));
        if (!TextUtils.isEmpty(s1))
        {
            arraylist.add(new BasicNameValuePair("gcm_registration_id", s1));
        }
        if (flag)
        {
            arraylist.add(new BasicNameValuePair("bundle_identifier", com.cardinalblue.android.b.c.b(context)));
        }
        return arraylist;
    }

    public static void a(Context context)
        throws IOException, InvalidParameterException, a
    {
        d(context, ((String) (null)));
        com.google.android.gcm.a.a(context, false);
    }

    public static void a(Context context, int i1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(new BasicNameValuePair("includes", "user,collage"));
        ((ArrayList) (obj)).add(new BasicNameValuePair("offset", String.valueOf(i1)));
        obj = b("/users/me/notifications", ((List) (obj)));
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.g()).a(new com.android.volley.m.b(b1) {

            final com.android.volley.m.b a;

            public void a(NotificationResponse notificationresponse)
            {
                com.cardinalblue.android.piccollage.controller.network.f.a(notificationresponse);
                if (a != null)
                {
                    a.a(notificationresponse);
                }
            }

            public volatile void a(Object obj1)
            {
                a((NotificationResponse)obj1);
            }

            
            {
                a = b1;
                super();
            }
        }).a(new h(a1)).b(((String) (obj))).a());
    }

    public static void a(Context context, String s1)
        throws IOException, InvalidParameterException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IOException("Can't register with an empty gcm registration id");
        } else
        {
            d(context, s1);
            com.google.android.gcm.a.a(context, true);
            return;
        }
    }

    public static void a(Context context, String s1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,is_following,like_total,echoes_total"));
        s1 = b(String.format("collages/%s", new Object[] {
            s1
        }), arraylist);
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.i()).a(b1).a(new h(a1)).b(s1).a());
    }

    public static void a(Context context, String s1, com.android.volley.m.b b1, com.android.volley.m.a a1, boolean flag)
        throws IOException
    {
        if (TextUtils.isEmpty(s1) || context == null)
        {
            return;
        }
        String s2 = String.format("collages/%s", new Object[] {
            s1
        });
        ArrayList arraylist = new ArrayList();
        int i1 = Collage.n();
        int j1 = Collage.o();
        if (flag)
        {
            i1 = Math.min(i1, j1);
            s1 = String.format(Locale.getDefault(), "%dx%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(i1)
            });
        } else
        {
            s1 = String.format(Locale.getDefault(), "%dx%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
        }
        arraylist.add(new BasicNameValuePair("includes", "struct"));
        arraylist.add(new BasicNameValuePair("version", "v5"));
        arraylist.add(new BasicNameValuePair("size", s1));
        s1 = b(s2, arraylist);
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.i()).a(b1).a(new h(a1)).b(s1).a());
    }

    public static void a(Context context, String s1, boolean flag, String s2, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        int i1 = 1;
        ArrayList arraylist = new ArrayList();
        s1 = b(String.format("collages/%s/like", new Object[] {
            s1
        }), arraylist);
        if (!flag)
        {
            i1 = 3;
        }
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.i()).a(s2).b(s1).a(i1).a(b1).a(new h(a1)).a());
    }

    public static void a(Context context, String s1, byte abyte0[], byte abyte1[])
        throws IOException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("target", "cb"));
        b(context, b(String.format("collages/%s/echoes", new Object[] {
            s1
        }), arraylist), abyte0, abyte1);
    }

    public static void a(com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("lang", com.cardinalblue.android.b.k.i()));
        ((List) (obj)).add(new BasicNameValuePair("type", "collage"));
        obj = b("search_suggestions", ((List) (obj)));
        com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).b((new com.cardinalblue.android.piccollage.lib.i.i()).b(((String) (obj))).a(b1).a(new h(a1)).a());
    }

    public static void a(com.android.volley.m.b b1, String s1)
    {
        String s2 = b("notifications/opened", ((List) (null)));
        Hashtable hashtable = new Hashtable();
        hashtable.put("payload", s1);
        com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).b((new com.cardinalblue.android.piccollage.lib.i.i()).b(s2).a(hashtable).a(1).a(b1).a());
    }

    public static void a(r r1)
        throws a
    {
        if (r1 == null || r1.a == null)
        {
            return;
        } else
        {
            a(r1.a.a, String.valueOf(r1.a.b));
            return;
        }
    }

    public static void a(com.cardinalblue.android.piccollage.controller.network.a a1)
    {
        b = a1;
    }

    static void a(NotificationResponse notificationresponse)
    {
        b(notificationresponse);
    }

    public static void a(String s1, int i1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("offset", String.valueOf(i1)));
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        s1 = b(String.format("collages/feeds/%s", new Object[] {
            s1
        }), arraylist);
        com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).b((new com.cardinalblue.android.piccollage.lib.i.d()).b(s1).a(b1).a(new h(a1)).a());
    }

    public static void a(String s1, Bundle bundle)
        throws IOException, a
    {
        ArrayList arraylist = new ArrayList();
        String s2;
        String s3;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s3, s2)))
        {
            String s4 = (String)iterator.next();
            s3 = bundle.getString(s4);
            s2 = s3;
            if (s3 == null)
            {
                s2 = "";
            }
            s3 = s4;
            if ("caption".equals(s4))
            {
                s3 = "message";
            }
        }

        s1 = (HttpURLConnection)(new URL(b(String.format("collages/%s/share_link", new Object[] {
            s1
        }), arraylist))).openConnection();
        s1.setRequestMethod("POST");
        b(s1);
    }

    public static void a(String s1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).b((new com.cardinalblue.android.piccollage.lib.i.i()).b(s1).a(b1).a(new h(a1)).a());
    }

    public static boolean a(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            return com.cardinalblue.android.b.k.j().edit().putString("pref_target_pc_authority", s1).commit();
        } else
        {
            return false;
        }
    }

    public static j b(Context context)
    {
        return b(context, "http://cdn.pic-collage.com/bundles/backgrounds/background_bundles.json");
    }

    public static j b(Context context, String s1)
    {
        context = new com.androidquery.a(context);
        bolts.j.a a1 = bolts.j.a();
        context.a(s1, java/io/File, new PicApiHelper._cls1(a1));
        return a1.a();
    }

    public static CBCollagesResponse b(String s1, int i1)
        throws IOException, JSONException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new c("Unknown collageId");
        }
        s1 = String.format("collages/%s/echoes", new Object[] {
            s1
        });
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        if (i1 > 0)
        {
            arraylist.add(new BasicNameValuePair("offset", Integer.toString(i1)));
        }
        return k(b((HttpURLConnection)(new URL(b(s1, ((List) (arraylist))))).openConnection()));
    }

    public static WebPhoto b(String s1)
        throws JSONException
    {
        s1 = (SingleWebPhotoResponse)com.cardinalblue.android.b.k.b(s1, com/cardinalblue/android/piccollage/model/gson/SingleWebPhotoResponse);
        if (s1 == null)
        {
            throw new JSONException("Failed to parse SingleWebPhotoResponse");
        } else
        {
            return s1.getWebPhoto();
        }
    }

    public static String b()
    {
        StringBuilder stringbuilder = new StringBuilder(a);
        stringbuilder.append(c());
        stringbuilder.append("/");
        return stringbuilder.toString();
    }

    public static String b(String s1, List list)
    {
        s1 = com.cardinalblue.android.b.g.a(a(), s1);
        try
        {
            s1 = com.cardinalblue.android.b.k.a(com.cardinalblue.android.b.k.a(s1, list), o());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return s1;
    }

    private static String b(HttpURLConnection httpurlconnection)
        throws IOException, a
    {
        int i1;
        httpurlconnection.connect();
        i1 = httpurlconnection.getResponseCode();
        Object obj = httpurlconnection.getInputStream();
_L1:
        obj = a(i1, new String(com.cardinalblue.android.b.k.a(((java.io.InputStream) (obj))), "UTF-8"));
        httpurlconnection.disconnect();
        return ((String) (obj));
        Object obj1;
        obj1;
        obj1 = httpurlconnection.getErrorStream();
          goto _L1
        obj1;
        httpurlconnection.disconnect();
        throw obj1;
    }

    public static void b(Context context, int i1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(new BasicNameValuePair("includes", "user,collage"));
        ((ArrayList) (obj)).add(new BasicNameValuePair("offset", String.valueOf(i1)));
        obj = b("/notifications", ((List) (obj)));
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.g()).a(b1).a(new h(a1)).b(((String) (obj))).a());
    }

    public static void b(Context context, String s1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        s1 = b(String.format("users/%s", new Object[] {
            s1
        }), ((List) (null)));
        String s2 = com.cardinalblue.android.b.k.a(s1, r());
        s1 = s2;
_L2:
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.i()).a(b1).a(new h(a1)).b(s1).a());
        return;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        com.cardinalblue.android.piccollage.a.f.a(urisyntaxexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void b(Context context, String s1, byte abyte0[], byte abyte1[])
        throws IOException, a
    {
        MultipartEntity multipartentity = new MultipartEntity();
        multipartentity.addPart("image", new ByteArrayBody(abyte0, "image/jpeg", "echo.jpeg"));
        multipartentity.addPart("struct_json", new ByteArrayBody(abyte1, "echo.json"));
        abyte0 = Charset.forName("utf-8");
        StringBody stringbody;
        for (context = a(context, true).iterator(); context.hasNext(); multipartentity.addPart(abyte1.getName(), stringbody))
        {
            abyte1 = (BasicNameValuePair)context.next();
            stringbody = new StringBody(abyte1.getValue(), "text/plain", abyte0);
        }

        multipartentity.addPart("cb_access_token", new StringBody(PicAuth.h().d(), "text/plain", abyte0));
        context = (HttpURLConnection)(new URL(s1)).openConnection();
        context.setRequestMethod("POST");
        context.addRequestProperty("Content-length", String.valueOf(multipartentity.getContentLength()));
        context.addRequestProperty(multipartentity.getContentType().getName(), multipartentity.getContentType().getValue());
        context.setDoOutput(true);
        s1 = new BufferedOutputStream(context.getOutputStream());
        multipartentity.writeTo(s1);
        s1.close();
        b(((HttpURLConnection) (context)));
    }

    private static void b(NotificationResponse notificationresponse)
    {
        com.cardinalblue.android.b.k.j().edit().putBoolean("pref_has_badge", notificationresponse.hasBadge()).commit();
    }

    public static j c(Context context)
    {
        String s1 = b("sticker_bundles.json", ((List) (null)));
        context = new com.androidquery.a(context);
        bolts.j.a a1 = bolts.j.a();
        context.a(s1, java/io/File, new PicApiHelper._cls2(a1));
        return a1.a();
    }

    public static String c()
    {
        return com.cardinalblue.android.b.k.j().getString("pref_target_pc_authority", "pic-collage.com");
    }

    public static String c(Context context, String s1)
        throws IOException, a
    {
        if (TextUtils.isEmpty(s1) || context == null)
        {
            return null;
        } else
        {
            context = String.format("collages/%s/echoes/new.json", new Object[] {
                s1
            });
            s1 = new ArrayList();
            s1.add(new BasicNameValuePair("size", String.format(Locale.getDefault(), "%dx%d", new Object[] {
                Integer.valueOf(com.cardinalblue.android.b.k.c()), Integer.valueOf(com.cardinalblue.android.b.k.d())
            })));
            s1.add(new BasicNameValuePair("version", "v5"));
            return b((HttpURLConnection)(new URL(b(context, s1))).openConnection());
        }
    }

    public static String c(String s1, int i1)
        throws ExecutionException, InterruptedException
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("name", s1));
        if (i1 > 0)
        {
            arraylist.add(new BasicNameValuePair("size", String.format("%dx%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(i1)
            })));
        }
        return b("assets", arraylist);
    }

    public static ArrayList c(String s1)
        throws IOException, JSONException, a
    {
        if (TextUtils.isEmpty(s1.trim()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid query string ").append(s1).toString());
        }
        ArrayList arraylist = new ArrayList();
        String s2 = (new StringBuilder()).append(Locale.getDefault().getLanguage()).append("-").append(Locale.getDefault().getCountry()).toString();
        arraylist.add(new BasicNameValuePair("query", s1));
        arraylist.add(new BasicNameValuePair("market", s2));
        try
        {
            s1 = com.cardinalblue.android.b.k.a("http://api.bing.com/osjson.aspx", arraylist, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return y(b((HttpURLConnection)(new URL(s1)).openConnection()));
    }

    public static void c(Context context, String s1, com.android.volley.m.b b1, com.android.volley.m.a a1)
        throws IOException
    {
        while (TextUtils.isEmpty(s1) || context == null || b1 == null || a1 == null) 
        {
            return;
        }
        s1 = String.format("collages/%s/echoes/new.json", new Object[] {
            s1
        });
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("size", String.format(Locale.US, "%dx%d", new Object[] {
            Integer.valueOf(Collage.n()), Integer.valueOf(Collage.o())
        })));
        arraylist.add(new BasicNameValuePair("version", "v5"));
        s1 = b(s1, arraylist);
        com.cardinalblue.android.piccollage.lib.i.a(context).b((new com.cardinalblue.android.piccollage.lib.i.i()).a(new com.android.volley.m.b(b1) {

            final com.android.volley.m.b a;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s2)
            {
                com.cardinalblue.android.piccollage.controller.network.f.x(s2);
                if (a != null)
                {
                    a.a(s2);
                }
            }

            
            {
                a = b1;
                super();
            }
        }).a(new h(a1)).b(s1).a());
    }

    public static Bitmap d(String s1, int i1)
        throws ExecutionException, InterruptedException
    {
        return com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).a(c(s1, i1), i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public static NotificationResponse d(Context context)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        Object obj = b("/users/me/notifications", ((List) (null)));
        m m1 = com.android.volley.toolbox.m.a();
        obj = (new com.cardinalblue.android.piccollage.lib.i.g()).a(m1).a(m1).b(((String) (obj))).a();
        ((com.android.volley.k) (obj)).a(new com.android.volley.c(2500, 5, 1.0F));
        m1.a(com.cardinalblue.android.piccollage.lib.i.a(context).b(((com.android.volley.k) (obj))));
        return (NotificationResponse)m1.get(15L, TimeUnit.SECONDS);
    }

    public static ArrayList d(String s1)
        throws JSONException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new JSONException("Can't parse empty json");
        }
        ArrayList arraylist = new ArrayList();
        s1 = (new JSONObject(s1)).getJSONObject("words").getJSONArray("data");
        for (int i1 = 0; i1 < s1.length(); i1++)
        {
            arraylist.add(s1.getString(i1));
        }

        return arraylist;
    }

    private static void d(Context context, String s1)
        throws IOException, InvalidParameterException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(a(context, false, s1));
        context = (HttpURLConnection)(new URL((new StringBuilder()).append(a()).append("devices").toString())).openConnection();
        context.setRequestMethod("POST");
        context.setDoOutput(true);
        s1 = new BufferedOutputStream(context.getOutputStream());
        s1.write(a(arraylist).getBytes());
        s1.close();
        b(context);
    }

    public static boolean d()
    {
        return com.cardinalblue.android.b.k.j().edit().remove("pref_target_pc_authority").commit();
    }

    public static CBCollagesResponse e(String s1)
        throws IOException, JSONException, InvalidParameterException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IOException("keyword can't be empty");
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("q", s1));
        try
        {
            s1 = com.cardinalblue.android.b.k.a((new StringBuilder()).append(a()).append("search").toString(), arraylist, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return g(s1);
    }

    public static String e()
    {
        StringBuilder stringbuilder = new StringBuilder(b());
        stringbuilder.append("news");
        return stringbuilder.toString();
    }

    public static CBYoutubeSearchResponse f(String s1)
        throws IOException, JSONException, InvalidParameterException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IOException("keyword can't be empty");
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("q", s1));
        try
        {
            s1 = com.cardinalblue.android.b.k.a((new StringBuilder()).append(a()).append("search/videos").toString(), arraylist, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return h(s1);
    }

    public static ArrayList f()
        throws IOException, JSONException, a
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("lang", com.cardinalblue.android.b.k.i()));
        try
        {
            obj = com.cardinalblue.android.b.k.a((new StringBuilder()).append(a()).append("search_suggestions").toString(), ((List) (obj)));
        }
        catch (URISyntaxException urisyntaxexception)
        {
            urisyntaxexception.printStackTrace();
            return null;
        }
        return d(b((HttpURLConnection)(new URL(((String) (obj)))).openConnection()));
    }

    public static CBCollagesResponse g(String s1)
        throws IOException, JSONException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IOException("Empty url");
        } else
        {
            return k(b((HttpURLConnection)(new URL(s1)).openConnection()));
        }
    }

    public static ArrayList g()
        throws IOException, JSONException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("lang", com.cardinalblue.android.b.k.i()));
        arraylist.add(new BasicNameValuePair("type", "background"));
        return d(b((HttpURLConnection)(new URL(b("search_suggestions", arraylist))).openConnection()));
    }

    public static CBYoutubeSearchResponse h()
        throws JSONException, a, IOException
    {
        return h((new StringBuilder(a())).append("video_suggestions").toString());
    }

    public static CBYoutubeSearchResponse h(String s1)
        throws IOException, JSONException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IOException("Empty url");
        } else
        {
            return l(b((HttpURLConnection)(new URL(s1)).openConnection()));
        }
    }

    public static CBCollagesResponse i()
        throws IOException, JSONException, a
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        obj = i(b("collages/feed", ((List) (obj))));
        com.cardinalblue.android.piccollage.a.b.i();
        return ((CBCollagesResponse) (obj));
    }

    public static CBCollagesResponse i(String s1)
        throws IOException, JSONException, a
    {
        return k(b((HttpURLConnection)(new URL(s1)).openConnection()));
    }

    public static CBCollagesResponse j()
        throws IOException, JSONException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        arraylist.add(new BasicNameValuePair("limit", "0"));
        return k(b((HttpURLConnection)(new URL(b("collages/feed", arraylist))).openConnection()));
    }

    public static WebPhoto j(String s1)
        throws IOException, JSONException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,is_following,like_total,echoes_total"));
        s1 = (CBCollageStructResponse)com.cardinalblue.android.b.k.b(b((HttpURLConnection)(new URL(b(String.format("collages/%s", new Object[] {
            s1
        }), arraylist))).openConnection()), com/cardinalblue/android/piccollage/model/CBCollageStructResponse);
        if (s1 != null)
        {
            return s1.a();
        } else
        {
            return null;
        }
    }

    public static CBCollagesResponse k()
        throws IOException, JSONException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total,size"));
        return i(b("collages/downloadable_feed", arraylist));
    }

    public static CBCollagesResponse k(String s1)
        throws JSONException
    {
        CBCollagesResponse cbcollagesresponse;
label0:
        {
            if (TextUtils.isEmpty(s1))
            {
                throw new JSONException("JSON string is empty");
            }
            cbcollagesresponse = (CBCollagesResponse)com.cardinalblue.android.b.k.b(s1, com/cardinalblue/android/piccollage/model/gson/CBCollagesResponse);
            WebPhotosData webphotosdata = cbcollagesresponse.getCollages();
            if (webphotosdata == null)
            {
                throw new JSONException((new StringBuilder()).append("Can't parse WebPhotosResponse from json: ").append(s1).toString());
            }
            s1 = webphotosdata.getPhotos();
            if (s1 != null && s1.size() != 0)
            {
                int i1 = webphotosdata.getOffset();
                if (s1.size() + i1 < webphotosdata.getTotal())
                {
                    break label0;
                }
            }
            webphotosdata.setNextPageUrl(null);
        }
        return cbcollagesresponse;
    }

    public static CBCollagesResponse l()
        throws IOException, JSONException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,liked,like_total,echoes_total"));
        return i(b("collages/home", arraylist));
    }

    public static CBYoutubeSearchResponse l(String s1)
        throws JSONException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new JSONException("JSON string is empty");
        }
        CBYoutubeSearchResponse cbyoutubesearchresponse = (CBYoutubeSearchResponse)com.cardinalblue.android.b.k.b(s1, com/cardinalblue/android/piccollage/model/gson/CBYoutubeSearchResponse);
        if (cbyoutubesearchresponse.getVideos() == null)
        {
            throw new JSONException((new StringBuilder()).append("Can't parse CBYoutubeSearchResponse from json: ").append(s1).toString());
        } else
        {
            return cbyoutubesearchresponse;
        }
    }

    public static CBCollagesResponse m()
        throws IOException, JSONException, a
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,liked,like_total,echoes_total"));
        return i(b("collages/feeds/contests", arraylist));
    }

    public static void m(String s1)
        throws IOException, a
    {
        s1 = (HttpURLConnection)(new URL(b(String.format("collages/%s", new Object[] {
            s1
        }), ((List) (null))))).openConnection();
        s1.setRequestMethod("DELETE");
        b(s1);
    }

    public static o n()
    {
        o o1 = new o();
        o1.a("app_version", com.cardinalblue.android.b.c.a(com.cardinalblue.android.b.k.a()));
        o1.a("bundle_identifier", com.cardinalblue.android.b.k.a().getPackageName());
        o1.a("cb_device_id", com.cardinalblue.android.b.k.c(com.cardinalblue.android.b.k.a()));
        o1.a("device_model", com.cardinalblue.android.b.c.c());
        o1.a("dpi", q());
        o1.a("os_name", com.cardinalblue.android.b.c.a());
        o1.a("os_version", com.cardinalblue.android.b.c.b());
        String s1 = Locale.getDefault().getLanguage();
        String s2 = Locale.getDefault().getCountry();
        o1.a("locale", (new StringBuilder()).append(s1).append("_").append(s2).toString());
        o1.a("language", s1);
        o1.a("country_code", s2);
        return o1;
    }

    public static void n(String s1)
        throws IOException, a
    {
        s1 = (HttpURLConnection)(new URL(b(String.format("collages/%s/flag", new Object[] {
            s1
        }), ((List) (null))))).openConnection();
        s1.setRequestMethod("POST");
        b(s1);
    }

    public static CBCollagesResponse o(String s1)
        throws IOException, URISyntaxException, JSONException, a
    {
        s1 = b(String.format("users/%s/collages", new Object[] {
            s1
        }), ((List) (null)));
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("shared_to", "cb"));
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        return z(com.cardinalblue.android.b.k.a(s1, arraylist));
    }

    public static List o()
    {
        ArrayList arraylist = new ArrayList();
        PicAuth picauth;
        try
        {
            arraylist.addAll(a(com.cardinalblue.android.b.k.a(), true));
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        picauth = PicAuth.h();
        if (picauth.b())
        {
            arraylist.add(new BasicNameValuePair("cb_access_token", picauth.d()));
        }
        arraylist.add(new BasicNameValuePair("client", "1"));
        arraylist.add(new BasicNameValuePair("client_type", "android"));
        return arraylist;
    }

    public static com.cardinalblue.android.piccollage.lib.b.b p()
        throws IOException, a
    {
        Object obj = b((HttpURLConnection)(new URL(b(String.format("announcement", new Object[0]), ((List) (null))))).openConnection());
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = (com.cardinalblue.android.piccollage.lib.b.b)com.cardinalblue.android.b.k.b(((String) (obj)), com/cardinalblue/android/piccollage/lib/b$b);
        }
        catch (JSONException jsonexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(jsonexception);
            return null;
        }
        return ((com.cardinalblue.android.piccollage.lib.b.b) (obj));
    }

    public static CBCollagesResponse p(String s1)
        throws IOException, JSONException, URISyntaxException, a
    {
        s1 = b(String.format("users/%s/likes", new Object[] {
            s1
        }), ((List) (null)));
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        return z(com.cardinalblue.android.b.k.a(s1, arraylist));
    }

    public static CBCollagesResponse q(String s1)
        throws IOException, JSONException, URISyntaxException, a
    {
        s1 = b(String.format("users/%s/echoes", new Object[] {
            s1
        }), ((List) (null)));
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,like_total,echoes_total"));
        return z(com.cardinalblue.android.b.k.a(s1, arraylist));
    }

    private static String q()
    {
        Configuration configuration = com.cardinalblue.android.b.k.a().getResources().getConfiguration();
        return String.format(Locale.getDefault(), "%dx%d", new Object[] {
            Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp)
        });
    }

    private static List r()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("includes", "user,is_following,followed_users_count,followers_count,liked_collages_count,collages_count,is_blocked"));
        return arraylist;
    }

    public static void r(String s1)
        throws IOException, JSONException, a
    {
        s1 = b(String.format("users/%s/followings", new Object[] {
            s1
        }), ((List) (null)));
        String s2 = com.cardinalblue.android.b.k.a(s1, r());
        s1 = s2;
_L2:
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        s1.setRequestMethod("POST");
        b(s1);
        return;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        urisyntaxexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void s(String s1)
        throws IOException, JSONException, a
    {
        s1 = b(String.format("users/%s/followings", new Object[] {
            s1
        }), ((List) (null)));
        Object obj;
        obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("includes", "user,is_following"));
        obj = com.cardinalblue.android.b.k.a(s1, ((List) (obj)));
        s1 = ((String) (obj));
_L2:
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        s1.setRequestMethod("DELETE");
        b(s1);
        return;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        urisyntaxexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String t(String s1)
        throws IOException, a
    {
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        s1 = b(String.format("users/%s", new Object[] {
            s1
        }), ((List) (null)));
        String s2 = com.cardinalblue.android.b.k.a(s1, r());
        s1 = s2;
_L2:
        return b((HttpURLConnection)(new URL(s1)).openConnection());
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        com.cardinalblue.android.piccollage.a.f.a(urisyntaxexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static PicUser u(String s1)
        throws JSONException
    {
        s1 = (SinglePicUserResponse)com.cardinalblue.android.b.k.b(s1, com/cardinalblue/android/piccollage/model/gson/SinglePicUserResponse);
        if (s1 == null)
        {
            throw new JSONException("Failed to parse SinglePicUserResponse");
        } else
        {
            return s1.getPicUser();
        }
    }

    public static PicUser v(String s1)
        throws IOException, JSONException, a
    {
        Object obj = b("users/me", r());
        MultipartEntity multipartentity = new MultipartEntity();
        multipartentity.addPart("user[avatar]", new FileBody(new File(s1), "binary/octet-stream"));
        s1 = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
        s1.setRequestMethod("PUT");
        s1.addRequestProperty("Content-length", String.valueOf(multipartentity.getContentLength()));
        s1.addRequestProperty(multipartentity.getContentType().getName(), multipartentity.getContentType().getValue());
        s1.setDoOutput(true);
        obj = new BufferedOutputStream(s1.getOutputStream());
        multipartentity.writeTo(((OutputStream) (obj)));
        ((OutputStream) (obj)).close();
        return u(b(s1));
    }

    public static void w(String s1)
        throws IOException, a
    {
        s1 = (HttpURLConnection)(new URL(b(String.format("users/%s/block", new Object[] {
            s1
        }), ((List) (null))))).openConnection();
        s1.setRequestMethod("POST");
        b(s1);
    }

    static void x(String s1)
    {
        B(s1);
    }

    private static ArrayList y(String s1)
    {
        ArrayList arraylist = new ArrayList();
        if (s1 != null && s1.length() >= 2)
        {
            Collections.addAll(arraylist, s1.substring(2, s1.length() - 2).split("[\"]?,[^\"]*[\"]?"));
            if (arraylist.size() > 0)
            {
                arraylist.remove(0);
                return arraylist;
            }
        }
        return arraylist;
    }

    private static CBCollagesResponse z(String s1)
        throws IOException, JSONException, a
    {
        m m1 = com.android.volley.toolbox.m.a();
        m1.a((com.cardinalblue.android.piccollage.lib.a.a)com.cardinalblue.android.piccollage.lib.i.a().b(new com.cardinalblue.android.piccollage.lib.a.a(s1, com/cardinalblue/android/piccollage/model/gson/CBCollagesResponse, null, com.cardinalblue.android.b.k.a(null), m1, m1)));
        try
        {
            s1 = (CBCollagesResponse)m1.get();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IOException(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a((r)s1.getCause());
            throw new IOException(s1);
        }
        return s1;
    }

    static 
    {
        if (com.cardinalblue.android.b.e.a)
        {
            a = "http://";
        }
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/network/PicApiHelper$1

/* anonymous class */
    static final class PicApiHelper._cls1 extends AjaxCallback
    {

        final bolts.j.a i;

        public void a(String s1, Object obj, com.androidquery.callback.a a1)
        {
            b(s1, (File)obj, a1);
        }

        public void b(String s1, File file, com.androidquery.callback.a a1)
        {
            if (file != null)
            {
                i.b(file);
                return;
            } else
            {
                i.b(new Exception(a1.l()));
                return;
            }
        }

            
            {
                i = a1;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/network/PicApiHelper$2

/* anonymous class */
    static final class PicApiHelper._cls2 extends AjaxCallback
    {

        final bolts.j.a i;

        public void a(String s1, Object obj, com.androidquery.callback.a a1)
        {
            b(s1, (File)obj, a1);
        }

        public void b(String s1, File file, com.androidquery.callback.a a1)
        {
            if (file != null)
            {
                i.b(file);
                return;
            } else
            {
                i.b(new Exception(a1.l()));
                return;
            }
        }

            
            {
                i = a1;
                super();
            }
    }

}
