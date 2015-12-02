// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.mobvista.sdk.m.a.d.a.d;
import com.mobvista.sdk.m.a.d.a.k;
import com.mobvista.sdk.m.a.f.a;
import com.mobvista.sdk.m.core.c.f;
import com.mobvista.sdk.m.core.loader.b;
import com.mobvista.sdk.m.core.loader.c;
import java.util.HashMap;

// Referenced classes of package com.mobvista.sdk.m.core:
//            ac, w, x, z, 
//            aa, ab, AdMobvistaAct, WallIconCallback

public class MobvistaAdWall
{

    private ac a;
    private Context b;
    private String c;
    private String d;
    private final int e = 10004;
    private HashMap f;
    private f g;
    private HashMap h;
    private boolean i;

    protected MobvistaAdWall(Activity activity, String s, String s1)
    {
        g = null;
        i = false;
        b = activity;
        c = s;
        d = s1;
        h = new HashMap();
        a = new ac(b, c);
        if (g == null)
        {
            g = com.mobvista.sdk.m.core.c.f.a(b);
        }
    }

    static ac a(MobvistaAdWall mobvistaadwall)
    {
        return mobvistaadwall.a;
    }

    private void a(int j)
    {
        if (b == null)
        {
            return;
        }
        if (f == null)
        {
            f = new HashMap();
        }
        c c1;
        if (!f.containsKey(Integer.valueOf(j)))
        {
            c1 = new c(b, g, c);
            f.put(Integer.valueOf(j), c1);
        } else
        {
            c1 = (c)f.get(Integer.valueOf(j));
        }
        c1.a(j, new w(this, j));
    }

    static void a(MobvistaAdWall mobvistaadwall, int j)
    {
        mobvistaadwall.a(j);
    }

    static boolean b(MobvistaAdWall mobvistaadwall)
    {
        return mobvistaadwall.i;
    }

    static String c(MobvistaAdWall mobvistaadwall)
    {
        return mobvistaadwall.c;
    }

    static Context d(MobvistaAdWall mobvistaadwall)
    {
        return mobvistaadwall.b;
    }

    static HashMap e(MobvistaAdWall mobvistaadwall)
    {
        return mobvistaadwall.h;
    }

    public void clickWall()
    {
        clickWall(0);
    }

    public void clickWall(int j)
    {
        b.startActivity(getWallIntent(j));
    }

    public Drawable getAdWallIcon(WallIconCallback walliconcallback)
    {
        String s;
        String s1;
        SharedPreferences sharedpreferences = b.getSharedPreferences("mobvista_SDK_M", 0);
        s = sharedpreferences.getString("AD_WALL_ICON_URL", null);
        s1 = sharedpreferences.getString("AD_WALL_ICON_FILE", null);
        b b1 = new b();
        b1.a(b, c);
        b1.a(10004, new x(this, s, walliconcallback, sharedpreferences));
        if (s == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        Object obj = com.mobvista.sdk.m.a.f.a.a(s1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            com.mobvista.sdk.m.a.d.a.d.a().a(s, new z(this, walliconcallback));
        }
        catch (Exception exception)
        {
            com.mobvista.sdk.m.a.d.a.d.a().a(s, new aa(this, walliconcallback));
        }
        return k.a(b).a("img_market.png");
        if (b == null)
        {
            return k.a(b).a("img_market.png");
        }
        obj = new BitmapDrawable(b.getResources(), ((android.graphics.Bitmap) (obj)));
        return ((Drawable) (obj));
    }

    public Intent getWallIntent()
    {
        return getWallIntent(0);
    }

    public Intent getWallIntent(int j)
    {
        if (j > 2 || j < 0)
        {
            throw new IllegalArgumentException("only can set tab between 0 to 2");
        } else
        {
            Object obj = new ab(this);
            int l = obj.hashCode();
            h.put(Integer.valueOf(l), obj);
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction((new StringBuilder("com.mobvista.sdk.m.ACTION_ACT_ORDER")).append(c).append(l).toString());
            b.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (obj)), intentfilter);
            obj = new Intent(b, com/mobvista/sdk/m/core/AdMobvistaAct);
            ((Intent) (obj)).putExtra("BUNDLE_UNITID", c);
            ((Intent) (obj)).putExtra("BUNDLE_KEY", l);
            ((Intent) (obj)).putExtra("BUNDLE_TAB", j);
            ((Intent) (obj)).putExtra("BUNDLE_FBID", d);
            i = true;
            return ((Intent) (obj));
        }
    }

    public Drawable loadWallIcon(WallIconCallback walliconcallback)
    {
        return getAdWallIcon(walliconcallback);
    }

    public void preloadWall()
    {
        a(0);
        a(1);
        a(2);
    }

    public void release()
    {
        if (a != null)
        {
            a.a();
        }
    }
}
