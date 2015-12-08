// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.libraries.velour.a.a;
import com.google.android.libraries.velour.a.b;
import com.google.android.libraries.velour.a.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.libraries.velour:
//            c, d, f, a, 
//            b, DynamicActivityLoader, e

public abstract class AbstractDynamicHostActivity extends Activity
    implements com.google.android.libraries.velour.c
{

    private d a;

    public AbstractDynamicHostActivity()
    {
    }

    private d d()
    {
        if (a == null)
        {
            a = new d(this);
        }
        return a;
    }

    protected void attachBaseContext(Context context)
    {
        d d1 = d();
        d1.h = new f(context.getApplicationContext());
        d1.i = new f(d1.a(), d1.h);
        d1.g = new com.google.android.libraries.velour.a(context);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        d();
    }

    public void finish()
    {
        d();
    }

    public Intent getIntent()
    {
        Object obj = d();
        Intent intent = ((d) (obj)).e.b();
        obj = ((d) (obj)).d.a.b();
        if (intent == null || obj == null)
        {
            return null;
        } else
        {
            return com.google.android.libraries.velour.b.a(intent, ((Intent) (obj)));
        }
    }

    public SharedPreferences getSharedPreferences(String s, int i)
    {
        return d().d.a.a(s, i);
    }

    public android.content.res.Resources.Theme getTheme()
    {
        d d1 = d();
        if (d1.k == null)
        {
            if (d1.d == null)
            {
                return d1.c();
            }
            d1.k = d1.c();
        }
        return d1.k;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        d();
    }

    public void onBackPressed()
    {
        d();
    }

    protected void onCreate(Bundle bundle)
    {
        d d1;
        Object obj;
        Object obj2;
        boolean flag2;
        flag2 = true;
        d1 = d();
        obj = d1.e.b();
        boolean flag;
        if (obj == null)
        {
            flag = false;
        } else
        {
            Object obj1 = ((Intent) (obj)).getData();
            if (obj1 == null)
            {
                flag = false;
            } else
            if (!"dynact".equals(((Uri) (obj1)).getScheme()))
            {
                flag = false;
            } else
            if (TextUtils.isEmpty(((Uri) (obj1)).getAuthority()))
            {
                flag = false;
            } else
            {
                obj1 = ((Uri) (obj1)).getPathSegments();
                if (((List) (obj1)).size() != 2 || TextUtils.isEmpty((CharSequence)((List) (obj1)).get(0)) || TextUtils.isEmpty((CharSequence)((List) (obj1)).get(1)))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
        }
        if (!flag)
        {
            bundle = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(bundle).length() + 32)).append("DynamicActivity got bad intent: ").append(bundle).toString());
        }
        d1.a = (String)((Intent) (obj)).getData().getPathSegments().get(1);
        d1.b = (String)((Intent) (obj)).getData().getPathSegments().get(0);
        d1.c = ((Intent) (obj)).getData().getAuthority();
        obj2 = d1.a(d1.c);
        d1.d = ((DynamicActivityLoader) (obj2)).a();
        d1.d.a = d1;
        d1.j = ((DynamicActivityLoader) (obj2)).b();
        d1.f = d1.j.a.a;
        obj = d1.h;
        obj2 = d1.j.a;
        e e1 = ((b) (obj2)).d;
        if (e1 != null)
        {
            obj.b = e1.b;
            obj.a = e1.a;
        }
        obj.c = ((b) (obj2)).a;
        obj2 = ((f) (obj)).a();
        if (((f) (obj)).a != null)
        {
            obj2 = ((Context) (obj2)).getResources();
            ((f) (obj)).a.updateConfiguration(((Resources) (obj2)).getConfiguration(), ((Resources) (obj2)).getDisplayMetrics());
        }
        d1.g. = d1.f;
        if (bundle != null)
        {
            bundle.setClassLoader(d1.f);
        }
_L2:
        return;
        bundle;
        obj = com.google.android.libraries.velour.b.a(((Intent) (obj)), "com.google.android.libraries.velour.FALLBACK_INTENT");
        boolean flag1;
        if (obj != null)
        {
            d1.startActivity(((Intent) (obj)));
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            throw new RuntimeException("Failed to create activity", bundle);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return d().d.a.a(menu);
    }

    protected void onDestroy()
    {
        d d1 = d();
        if (d1.j != null)
        {
            d1.j.a();
        }
    }

    public void onLowMemory()
    {
        d();
    }

    protected void onNewIntent(Intent intent)
    {
        d d1 = d();
        d1.l = intent;
        intent = com.google.android.libraries.velour.b.a(intent, d1.f);
        d1.d.a.b(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return d().d.a.a(menuitem);
    }

    protected void onPause()
    {
        d();
    }

    protected void onPostCreate(Bundle bundle)
    {
        d();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return d().d.a.b(menu);
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        d();
    }

    protected void onRestart()
    {
        d();
    }

    protected void onResume()
    {
        d();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        d();
    }

    protected void onStart()
    {
        d();
    }

    protected void onStop()
    {
        d();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        d();
    }

    public void setIntent(Intent intent)
    {
        d d1 = d();
        d1.l = intent;
        intent = com.google.android.libraries.velour.b.a(intent, d1.f);
        d1.d.a.a(intent);
    }
}
