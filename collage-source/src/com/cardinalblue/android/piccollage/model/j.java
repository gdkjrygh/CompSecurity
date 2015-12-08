// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.b.b;
import com.cardinalblue.android.piccollage.controller.b.c;
import com.cardinalblue.android.piccollage.model.gson.Album;
import com.cardinalblue.android.piccollage.model.gson.AlbumList;
import com.cardinalblue.android.piccollage.model.gson.AlbumListResponse;
import com.cardinalblue.android.piccollage.model.gson.Media;
import com.cardinalblue.android.piccollage.model.gson.MediaList;
import com.cardinalblue.android.piccollage.model.gson.MediaListResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.a.a.a;
import org.a.d.d;
import org.a.d.g;
import org.a.d.h;
import org.json.JSONObject;

public class j
{

    public static final byte a[] = "__boundary_au_smart_cloud__".getBytes();
    private static j b;
    private SharedPreferences c;
    private org.a.e.b d;
    private c e;

    private j(Context context)
    {
        c = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        d = (new a()).a(com/cardinalblue/android/piccollage/controller/b/b).b("AAAAawAAATV77e1n").c("qxiboXkGxNuoxwp_csPEp-t9JawqrSIc").a("https://pic-collage.com").d("user_data_photo_reference%20user_data_photo_update%20user_data_photo_upload").a();
        e = new c(c.getString("kddi_access_token", ""), c.getString("kddi_refresh_token", ""), c.getLong("kddi_expired_time", 0L));
    }

    public static j a(Context context)
    {
        if (b == null)
        {
            b = new j(context);
        }
        return b;
    }

    private int g()
    {
        Object obj = new org.a.d.b(g.b, "https://oa.connect.auone.jp/net/opi/hny_oauth_rt_net/cca?ID=OpenAPITokenRefreshReq");
        ((org.a.d.b) (obj)).b("grant_type", "refresh_token");
        ((org.a.d.b) (obj)).b("client_id", "AAAAawAAATV77e1n");
        ((org.a.d.b) (obj)).b("client_secret", "qxiboXkGxNuoxwp_csPEp-t9JawqrSIc");
        ((org.a.d.b) (obj)).b("refresh_token", e.a());
        try
        {
            obj = ((org.a.d.b) (obj)).d().b();
            a((c)(c)(new com.cardinalblue.android.piccollage.controller.b.a()).a(((String) (obj))));
        }
        catch (org.a.b.a a1)
        {
            b();
            return 0;
        }
        catch (RuntimeException runtimeexception)
        {
            b();
            return 1;
        }
        return 2;
    }

    public int a(String s)
    {
        s = new h(s);
        try
        {
            a((c)d.a(null, s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return 2;
    }

    public c a()
    {
        return e;
    }

    public AlbumList a(int i, boolean flag, String s)
        throws Exception
    {
        Object obj = new org.a.d.b(g.a, "https://au-cloud-api.auone.jp/v1/service/");
        ((org.a.d.b) (obj)).a("method", "auone.photoapi.album.getList");
        ((org.a.d.b) (obj)).a("format", "json");
        ((org.a.d.b) (obj)).a("page", Integer.toString(i));
        ((org.a.d.b) (obj)).c("Content-Type", "text/plain");
        ((org.a.d.b) (obj)).c("Authorization", (new StringBuilder()).append("Bearer ").append(e.d()).toString());
        obj = ((org.a.d.b) (obj)).d();
        if (((d) (obj)).d() != 200)
        {
            throw new IOException();
        }
        obj = ((d) (obj)).b();
        Object obj1 = new JSONObject(((String) (obj)));
        if (((JSONObject) (obj1)).getString("stat").equalsIgnoreCase("ok"))
        {
            obj = ((AlbumListResponse)k.b(((String) (obj)), com/cardinalblue/android/piccollage/model/gson/AlbumListResponse)).getAlbumListObject();
            if (flag)
            {
                obj1 = new Album();
                ((Album) (obj1)).setId("4dd90f87-59ef-472a-bc99-d81c20b670cd4");
                ((Album) (obj1)).setTitle(s);
                ((AlbumList) (obj)).getList().add(obj1);
            }
            return ((AlbumList) (obj));
        } else
        {
            throw new org.a.b.a(((JSONObject) (obj1)).getString("message"));
        }
    }

    public MediaList a(String s, int i)
        throws Exception
    {
        Object obj = new org.a.d.b(g.a, "https://au-cloud-api.auone.jp/v1/service/");
        if (s.equals("4dd90f87-59ef-472a-bc99-d81c20b670cd4"))
        {
            ((org.a.d.b) (obj)).a("method", "auone.photoapi.media.search");
            ((org.a.d.b) (obj)).a("file_format", "photo");
            ((org.a.d.b) (obj)).a("sort", "media_title_asc");
        } else
        {
            ((org.a.d.b) (obj)).a("method", "auone.photoapi.album.getMedia");
            ((org.a.d.b) (obj)).a("album_id", s);
        }
        ((org.a.d.b) (obj)).a("format", "json");
        ((org.a.d.b) (obj)).a("page", Integer.toString(i));
        ((org.a.d.b) (obj)).c("Content-Type", "text/plain");
        ((org.a.d.b) (obj)).c("Authorization", (new StringBuilder()).append("Bearer ").append(e.d()).toString());
        s = ((org.a.d.b) (obj)).d();
        if (s.d() != 200)
        {
            throw new IOException();
        }
        s = s.b();
        obj = new JSONObject(s);
        if (((JSONObject) (obj)).getString("stat").equalsIgnoreCase("ok"))
        {
            return ((MediaListResponse)k.b(s, com/cardinalblue/android/piccollage/model/gson/MediaListResponse)).getMediaListObject();
        } else
        {
            throw new org.a.b.a(((JSONObject) (obj)).getString("message"));
        }
    }

    public d a(String s, String s1)
        throws org.a.b.a
    {
        org.a.d.b b1 = new org.a.d.b(g.a, "https://au-cloud-api.auone.jp/v1/service/");
        b1.a("method", "auone.photoapi.media.download");
        b1.a("format", "json");
        b1.a("media_id", s);
        if (!TextUtils.isEmpty(s1))
        {
            b1.a("thumb_size", s1);
        }
        b1.c("Content-Type", "text/plain");
        b1.c("Authorization", (new StringBuilder()).append("Bearer ").append(e.d()).toString());
        return b1.d();
    }

    public d a(ArrayList arraylist, String s)
        throws org.a.b.a
    {
        StringBuilder stringbuilder = new StringBuilder();
        arraylist = arraylist.iterator();
        for (boolean flag = true; arraylist.hasNext(); flag = false)
        {
            String s1 = (String)arraylist.next();
            if (!flag)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s1);
        }

        return a(stringbuilder.toString(), s);
    }

    public d a(List list, String s)
        throws org.a.b.a
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        for (boolean flag = true; list.hasNext(); flag = false)
        {
            Media media = (Media)list.next();
            if (!flag)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(media.getId());
        }

        return a(stringbuilder.toString(), s);
    }

    public void a(c c1)
    {
        e = c1;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("kddi_access_token", c1.d());
        editor.putString("kddi_refresh_token", c1.a());
        editor.putLong("kddi_expired_time", c1.b());
        editor.apply();
    }

    public void b()
    {
        a(new c());
    }

    public boolean c()
    {
        return !e.c() && !d();
    }

    public boolean d()
    {
        return e.b() <= System.currentTimeMillis();
    }

    public int e()
    {
        if (e.c())
        {
            return 0;
        }
        if (d())
        {
            return g();
        } else
        {
            return 2;
        }
    }

    public String f()
    {
        return d.a(null);
    }

}
