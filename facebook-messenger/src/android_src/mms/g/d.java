// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.preference.PreferenceManager;
import android_src.mms.e.h;
import android_src.mms.e.t;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.g:
//            e, f, i, g, 
//            o, h

public class d
{

    private static d g;
    private final Context a;
    private final Handler b = new Handler();
    private final SharedPreferences c;
    private boolean d;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener e = new e(this);
    private final BroadcastReceiver f = new f(this);

    private d(Context context)
    {
        a = context;
        c = PreferenceManager.getDefaultSharedPreferences(context);
        c.registerOnSharedPreferenceChangeListener(e);
        context.registerReceiver(f, new IntentFilter("android.intent.action.SERVICE_STATE"));
        d = a(c);
    }

    static Context a(d d1)
    {
        return d1.a;
    }

    private String a(Uri uri)
    {
        return "";
    }

    static String a(d d1, Uri uri)
    {
        return d1.a(uri);
    }

    public static void a(Context context)
    {
        if (g != null)
        {
            com.facebook.debug.log.b.d("DownloadManager", "Already initialized.");
        }
        g = new d(context);
    }

    static boolean a(SharedPreferences sharedpreferences)
    {
        return a(sharedpreferences, c());
    }

    static boolean a(SharedPreferences sharedpreferences, boolean flag)
    {
        return true;
    }

    public static d b()
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized.");
        } else
        {
            return g;
        }
    }

    static boolean c()
    {
        return false;
    }

    public void a(int j)
    {
        b.post(new i(this, j));
    }

    public void a(Uri uri, int j)
    {
        if (((h)t.a(a).a(uri)).c() < System.currentTimeMillis() / 1000L && j == 129)
        {
            try
            {
                b.post(new g(this));
                o.a(a, a.getContentResolver(), uri, null, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                com.facebook.debug.log.b.d("DownloadManager", uri.getMessage(), uri);
            }
            return;
        }
        if (j != 135) goto _L2; else goto _L1
_L1:
        int k;
        b.post(new android_src.mms.g.h(this, uri));
        k = j;
_L4:
        ContentValues contentvalues = new ContentValues(1);
        contentvalues.put("st", Integer.valueOf(k));
        o.a(a, a.getContentResolver(), uri, contentvalues, null, null);
        return;
_L2:
        k = j;
        if (!d)
        {
            k = j | 4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a()
    {
        return d;
    }
}
