// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.helpers;

import android.app.IntentService;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.EchoesListActivity;
import com.cardinalblue.android.piccollage.activities.FeedsListActivity;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.activities.PicUsersListActivity;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.activities.RemixableListActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicEditAccountActivity;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.util.List;
import java.util.concurrent.Callable;
import ly.kite.KiteSDK;
import ly.kite.catalogue.AssetHelper;
import ly.kite.journey.selection.ProductSelectionActivity;
import org.json.JSONException;

public class PICAppRoutesService extends IntentService
{
    public class a extends Exception
    {

        final PICAppRoutesService a;

        public a(String s)
        {
            a = PICAppRoutesService.this;
            super(s);
        }
    }


    private UriMatcher a;

    public PICAppRoutesService()
    {
        super("AppRoutingService");
        a = new UriMatcher(-1);
        a.addURI("*", "collages/feeds/*", 0);
        a.addURI("*", "collages/#/echoes", 1);
        a.addURI("*", "collages/#", 2);
        a.addURI("*", "collages/#/activities", 18);
        a.addURI("*", "users/#", 3);
        a.addURI("*", "users/#/followers", 4);
        a.addURI("*", "users/#/followed_users", 5);
        a.addURI("*", "sticker_store", 6);
        a.addURI("*", "sticker_store/*", 7);
        a.addURI("*", "search/user", 8);
        a.addURI("*", "search/collage", 9);
        a.addURI("*", "explore/featured", 10);
        a.addURI("*", "explore/following", 11);
        a.addURI("*", "explore/contests", 12);
        a.addURI("*", "account/edit", 13);
        a.addURI("*", "profile/me", 14);
        a.addURI("*", "gallery/create", 15);
        a.addURI("*", "gallery/me", 16);
        a.addURI("*", "templates", 17);
        a.addURI("*", "photobox/greeting_card", 20);
        a.addURI("*", "photobox", 19);
    }

    public static Intent a(Uri uri)
    {
        return new Intent("android.intent.action.VIEW", uri, k.a(), com/cardinalblue/android/piccollage/helpers/PICAppRoutesService);
    }

    private Intent a(Bundle bundle, int i)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/HomeActivity);
        intent.addFlags(0x10000000);
        intent.setAction("piccollage.intent.action.VIEW_PAGE");
        intent.putExtras(bundle);
        intent.putExtra("key_position", 0x7f1002df);
        intent.putExtra("extra_position", i);
        return intent;
    }

    public static String a(WebPhoto webphoto)
    {
        return (new StringBuilder("app")).append(":/collages/").append(webphoto.getId()).append("/echoes").toString();
    }

    public static String a(String s)
    {
        return (new StringBuilder("app")).append(":/").append(s).toString();
    }

    private void a()
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/RemixableListActivity);
        intent.addFlags(0x10000000);
        startActivity(intent);
    }

    private void a(int i, Bundle bundle)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/HomeActivity);
        intent.addFlags(0x10000000);
        intent.setAction("piccollage.intent.action.VIEW_PAGE");
        intent.putExtras(bundle);
        intent.putExtra("key_position", i);
        startActivity(intent);
    }

    public static void a(Context context, String s)
    {
        context.startService(d(s));
    }

    private void a(Bundle bundle)
    {
        g("com.cardinalblue.sticker.menu", bundle);
    }

    private void a(String s, Bundle bundle)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/FeedsListActivity);
        intent.addFlags(0x10000000);
        intent.putExtras(bundle);
        intent.putExtra("extra_feed_name", s);
        startActivity(intent);
    }

    private void a(String s, ly.kite.KiteSDK.DefaultEnvironment defaultenvironment)
    {
        KiteSDK.getInstance(this, s, defaultenvironment);
        AssetHelper.clearCachedImages(this);
        s = new Intent(this, ly/kite/journey/selection/ProductSelectionActivity);
        s.addFlags(0x10000000);
        startActivity(s);
    }

    public static String b(String s)
    {
        return (new StringBuilder("app")).append(":/").append("sticker_store").append("/").append(s).toString();
    }

    private void b()
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/RemixableListActivity);
        intent.addFlags(0x10000000);
        startActivity(intent);
    }

    private void b(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putInt("extra_init_fragment_pos", 1);
        a(0x7f1002e1, bundle1);
    }

    private void b(String s, Bundle bundle)
    {
        com.cardinalblue.android.piccollage.controller.network.f.a(k.a(), s, new com.android.volley.m.b(bundle) {

            final Bundle a;
            final PICAppRoutesService b;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s1)
            {
                Intent intent;
                try
                {
                    s1 = (CBCollageStructResponse)k.b(s1, com/cardinalblue/android/piccollage/model/CBCollageStructResponse);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(s1);
                    return;
                }
                if (s1 == null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                if (s1.b())
                {
                    intent = new Intent(b, com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
                    intent.putExtras(a);
                    intent.addFlags(0x10020000);
                    intent.setAction("piccollage.intent.action.VIEW_COLLAGE");
                    intent.putExtra("web_photo_data", s1.a());
                    b.startActivity(intent);
                }
            }

            
            {
                b = PICAppRoutesService.this;
                a = bundle;
                super();
            }
        }, null);
    }

    private void c(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putInt("extra_init_fragment_pos", 0);
        a(0x7f1002e1, bundle1);
    }

    private void c(String s, Bundle bundle)
    {
        com.cardinalblue.android.piccollage.controller.network.f.a(this, s, new com.android.volley.m.b(bundle) {

            final Bundle a;
            final PICAppRoutesService b;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s1)
            {
                Intent intent;
                try
                {
                    s1 = (CBCollageStructResponse)k.b(s1, com/cardinalblue/android/piccollage/model/CBCollageStructResponse);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(s1);
                    return;
                }
                if (s1 == null)
                {
                    break MISSING_BLOCK_LABEL_79;
                }
                if (s1.b())
                {
                    intent = new Intent(b, com/cardinalblue/android/piccollage/activities/EchoesListActivity);
                    intent.addFlags(0x10000000);
                    intent.putExtras(a);
                    intent.putExtra("extra_webphoto", s1.a());
                    intent.putExtra("extra_start_from", "notification");
                    b.startActivity(intent);
                }
            }

            
            {
                b = PICAppRoutesService.this;
                a = bundle;
                super();
            }
        }, null);
    }

    public static boolean c(String s)
    {
        return "piccollage".equalsIgnoreCase(s);
    }

    public static Intent d(String s)
    {
        return a(Uri.parse(s));
    }

    private void d(Bundle bundle)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/auth/PicEditAccountActivity);
        intent.addFlags(0x10000000);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void d(String s, Bundle bundle)
    {
        com.cardinalblue.android.piccollage.controller.network.f.b(this, s, new com.android.volley.m.b(bundle) {

            final Bundle a;
            final PICAppRoutesService b;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s1)
            {
                try
                {
                    s1 = com.cardinalblue.android.piccollage.controller.network.f.u(s1);
                    if (s1.isValid())
                    {
                        Intent intent = new Intent(b, com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                        intent.addFlags(0x10000000);
                        intent.putExtras(a);
                        intent.putExtra("user", s1);
                        b.startActivity(intent);
                    }
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(s1);
                }
            }

            
            {
                b = PICAppRoutesService.this;
                a = bundle;
                super();
            }
        }, null);
    }

    private void e(String s, Bundle bundle)
    {
        j.a(new Callable(s) {

            final String a;
            final PICAppRoutesService b;

            public PicUser a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.u(com.cardinalblue.android.piccollage.controller.network.f.t(a));
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PICAppRoutesService.this;
                a = s;
                super();
            }
        }).a(new i(bundle) {

            final Bundle a;
            final PICAppRoutesService b;

            public Void a(j j1)
                throws Exception
            {
                if (j1.c() || j1.d())
                {
                    j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/HomeActivity);
                    j1.putExtras(a);
                } else
                {
                    PicUser picuser = (PicUser)j1.e();
                    j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/PicUsersListActivity);
                    j1.putExtras(a);
                    j1.putExtra("type", 1);
                    j1.putExtra("user_name", picuser.getDisplayName());
                    j1.putExtra("user_list_path", String.format("users/%s/followers", new Object[] {
                        picuser.getId()
                    }));
                }
                j1.addFlags(0x10000000);
                b.startActivity(j1);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PICAppRoutesService.this;
                a = bundle;
                super();
            }
        }, k.a);
    }

    private void f(String s, Bundle bundle)
    {
        j.a(new Callable(s) {

            final String a;
            final PICAppRoutesService b;

            public PicUser a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.u(com.cardinalblue.android.piccollage.controller.network.f.t(a));
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PICAppRoutesService.this;
                a = s;
                super();
            }
        }).a(new i(bundle) {

            final Bundle a;
            final PICAppRoutesService b;

            public Void a(j j1)
                throws Exception
            {
                if (j1.c() || j1.d())
                {
                    j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/HomeActivity);
                    j1.putExtras(a);
                } else
                {
                    PicUser picuser = (PicUser)j1.e();
                    j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/PicUsersListActivity);
                    j1.putExtras(a);
                    j1.putExtra("type", 0);
                    j1.putExtra("user_name", picuser.getDisplayName());
                    j1.putExtra("user_list_path", String.format("users/%s/followers", new Object[] {
                        picuser.getId()
                    }));
                }
                j1.addFlags(0x10000000);
                b.startActivity(j1);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PICAppRoutesService.this;
                a = bundle;
                super();
            }
        }, k.a);
    }

    private void g(String s, Bundle bundle)
    {
        s = Collage.a(this, s);
        s.addFlags(0x10000000);
        s.putExtras(bundle);
        startActivity(s);
    }

    public int a(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            return -1;

        case 0: // '\0'
            return 2;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
            return 1;
        }
    }

    public String a(Uri uri, int i)
    {
        if (i < 0) goto _L2; else goto _L1
_L1:
        String s = (String)uri.getPathSegments().get(i);
        uri = s;
_L4:
        return uri;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        throw new a((new StringBuilder()).append("Cannot get argument for ").append(uri).append(" with index ").append(i).toString());
        uri;
        return null;
_L2:
        uri = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(Uri uri, Bundle bundle)
    {
        Bundle bundle1;
        int i;
        boolean flag;
        flag = true;
        bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        i = b(uri);
        bundle = a(uri, a(i));
        bundle1.putBoolean("extra_applink_route", c(uri.getScheme()));
        i;
        JVM INSTR tableswitch 0 20: default 152
    //                   0 158
    //                   1 166
    //                   2 174
    //                   3 182
    //                   4 190
    //                   5 198
    //                   6 206
    //                   7 213
    //                   8 221
    //                   9 228
    //                   10 235
    //                   11 247
    //                   12 259
    //                   13 271
    //                   14 287
    //                   15 297
    //                   16 316
    //                   17 326
    //                   18 152
    //                   19 338
    //                   20 332;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L1 _L20 _L21
_L1:
        flag = false;
_L23:
        return flag;
_L2:
        a(((String) (bundle)), bundle1);
        return true;
_L3:
        c(bundle, bundle1);
        return true;
_L4:
        b(bundle, bundle1);
        return true;
_L5:
        d(bundle, bundle1);
        return true;
_L6:
        e(bundle, bundle1);
        return true;
_L7:
        f(bundle, bundle1);
        return true;
_L8:
        a(bundle1);
        return true;
_L9:
        g(bundle, bundle1);
        return true;
_L10:
        b(bundle1);
        return true;
_L11:
        c(bundle1);
        return true;
_L12:
        startActivity(a(bundle1, 1));
        return true;
_L13:
        startActivity(a(bundle1, 0));
        return true;
_L14:
        startActivity(a(bundle1, 2));
        return true;
_L15:
        if (!PicAuth.h().b()) goto _L23; else goto _L22
_L22:
        d(bundle1);
        return true;
_L16:
        a(10000, bundle1);
        return true;
_L17:
        uri = Collage.a(this);
        uri.addFlags(0x10000000);
        startActivity(uri);
        return true;
_L18:
        a(0x7f1002de, bundle1);
        return true;
_L19:
        a();
        return true;
_L21:
        b();
        return true;
_L20:
        if (com.cardinalblue.android.b.d.h())
        {
            a(getString(0x7f070346), ly.kite.KiteSDK.DefaultEnvironment.TEST);
            return true;
        } else
        {
            a(getString(0x7f070345), ly.kite.KiteSDK.DefaultEnvironment.LIVE);
            return true;
        }
    }

    public int b(Uri uri)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("Routing uri is null");
        } else
        {
            return a.match(uri);
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        Uri uri = intent.getData();
        if (uri != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Bundle bundle = intent.getExtras();
        if (a(uri, bundle)) goto _L2; else goto _L4
_L4:
        intent = new Intent("android.intent.action.VIEW", intent.getData());
        intent.addFlags(0x10000000);
        startActivity(intent);
        return;
        intent;
_L6:
        com.cardinalblue.android.piccollage.a.f.a(intent);
        return;
        intent;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
