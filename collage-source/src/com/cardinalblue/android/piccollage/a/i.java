// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import bolts.j;
import com.cardinalblue.android.b.c;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.facebook.AccessToken;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.UserVoice;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.a:
//            b, f

public class i
{

    public i()
    {
    }

    public static j a(String s, com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation picrelation, String s1)
    {
        if (!PicAuth.h().b())
        {
            com.cardinalblue.android.piccollage.a.b.af("now");
            return j.a(new com.cardinalblue.android.piccollage.auth.PicAuth.a(1));
        }
        if (picrelation == com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.FOLLOWING)
        {
            com.cardinalblue.android.piccollage.a.f.f(k.a());
        }
        a(s1, picrelation);
        return j.a(new Callable(picrelation, s) {

            final com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation a;
            final String b;

            public Void a()
                throws Exception
            {
                static class _cls2
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.values().length];
                        try
                        {
                            a[com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.UNFOLLOW.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.FOLLOWING.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls2.a[a.ordinal()];
                JVM INSTR tableswitch 1 2: default 32
            //                           1 34
            //                           2 44;
                   goto _L1 _L2 _L3
_L1:
                return null;
_L2:
                f.s(b);
                continue; /* Loop/switch isn't completed */
_L3:
                f.r(b);
                if (true) goto _L1; else goto _L4
_L4:
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = picrelation;
                b = s;
                super();
            }
        });
    }

    public static void a(Context context)
    {
        Config config = new Config("piccollage.uservoice.com", "hRn1XymXgDWAZQSeLXzg", "mpvq1c9o3ntMQoe3N4iJpdye4pwjpayedtipOOeHL4");
        a(context, config);
        b(context, config);
        try
        {
            config.setTopicId(context.getResources().getInteger(0x7f090000));
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception) { }
        UserVoice.init(config, context);
    }

    private static void a(Context context, Config config)
    {
        if (PicAuth.h().b())
        {
            context = PicAuth.h().i();
            if (context != null)
            {
                config.identifyUser(context.getId(), context.getDisplayName(), context.getEmail());
            }
        } else
        if (AccessToken.getCurrentAccessToken() != null)
        {
            context = context.getSharedPreferences("cardinalblue_3", 0);
            config.identifyUser(context.getString("facebook_uid", ""), context.getString("facebook_user_name", ""), context.getString("facebook_email", ""));
            return;
        }
    }

    private static void a(String s, com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation picrelation)
    {
        if (picrelation == com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.FOLLOWING)
        {
            Object obj = PicAuth.h();
            String s1;
            if (((PicAuth) (obj)).b())
            {
                s1 = String.valueOf(((PicAuth) (obj)).i().getFollowingCount());
            } else
            {
                s1 = "n/a";
            }
            if (((PicAuth) (obj)).b())
            {
                obj = "yes";
            } else
            {
                obj = "no";
            }
            com.cardinalblue.android.piccollage.a.b.a(s, s1, ((String) (obj)));
        }
        if (picrelation == com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.UNFOLLOW)
        {
            com.cardinalblue.android.piccollage.a.b.r(s);
        }
    }

    public static void b(Context context)
    {
        UserVoice.launchContactUs(context);
    }

    private static void b(Context context, Config config)
    {
        HashMap hashmap = new HashMap();
        Object obj = context.getSharedPreferences("cardinalblue_3", 0);
        if (PicAuth.h().b())
        {
            PicUser picuser = PicAuth.h().i();
            hashmap.put("cb_uid", picuser.getId());
            hashmap.put("cb_name", picuser.getDisplayName());
            hashmap.put("cb_email", picuser.getEmail());
        }
        String s = ((SharedPreferences) (obj)).getString("facebook_uid", "");
        ((SharedPreferences) (obj)).getString("facebook_user_name", "");
        String s1 = ((SharedPreferences) (obj)).getString("facebook_email", "");
        obj = ((SharedPreferences) (obj)).getString("pref_device_uuid", "");
        hashmap.put("facebook_uid", s);
        hashmap.put("facebook_email", s1);
        hashmap.put("app_version", com.cardinalblue.android.b.c.a(context));
        hashmap.put("os_version", com.cardinalblue.android.b.c.b());
        hashmap.put("device_model", com.cardinalblue.android.b.c.c());
        hashmap.put("country_code", Locale.getDefault().getCountry());
        hashmap.put("device_uuid", obj);
        config.setCustomFields(hashmap);
    }

    public static void c(Context context)
    {
        UserVoice.launchUserVoice(context);
    }
}
