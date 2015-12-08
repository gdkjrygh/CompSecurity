// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.a.a.a;
import com.a.a.c.g;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.ay;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.h.d;
import com.kik.sdkutils.y;
import com.kik.ui.fragment.FragmentBase;
import java.io.File;
import java.lang.reflect.Field;
import kik.a.ab;
import kik.a.d.t;
import kik.a.e.h;
import kik.a.e.v;
import kik.android.chat.KikApplication;
import kik.android.chat.fragment.KikCardBrowserFragment;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.bx;
import kik.android.util.e;
import kik.android.widget.ey;

// Referenced classes of package kik.android.chat.activity:
//            a, c, d, k, 
//            e

public class FragmentWrapperActivity extends FragmentActivity
{

    protected v a;
    protected ab b;
    private boolean c;
    private p d;
    private String e;
    private f f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private i l;
    private i m;
    private i n;

    public FragmentWrapperActivity()
    {
        c = false;
        f = new f();
        h = true;
        i = false;
        j = false;
        l = new kik.android.chat.activity.a(this);
        m = new c(this);
        n = new kik.android.chat.activity.d(this);
    }

    private Fragment a(Intent intent)
    {
        Fragment fragment;
        String s;
        fragment = null;
        if (intent == null)
        {
            return null;
        }
        s = intent.getStringExtra("kik.android.util.FragmentBundle.FragmentClass");
        if (g == null)
        {
            g = kik.android.chat.activity.k.c(intent.getExtras());
        }
        d = kik.android.chat.activity.k.a(intent.getExtras());
        e = kik.android.chat.activity.k.b(intent.getExtras());
        Fragment fragment1 = (Fragment)Class.forName(s).newInstance();
        fragment = fragment1;
_L2:
        if (fragment == null)
        {
            throw new IllegalArgumentException();
        }
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        com.a.a.a.d().c.a((new StringBuilder("Attempting to create an instance of : ")).append(s).toString());
        com.a.a.a.d().c.a((new StringBuilder("With params: ")).append(intent.getExtras()).toString());
        com.a.a.a.d().c.a((new StringBuilder("With flags: ")).append(intent.getFlags()).toString());
        bx.a(exception);
        if (true) goto _L2; else goto _L1
_L1:
        fragment.setArguments(intent.getExtras());
        if (fragment instanceof FragmentBase)
        {
            ((FragmentBase)fragment).E().a(new kik.android.chat.activity.e(this));
        }
        getSupportFragmentManager().beginTransaction().replace(0x7f0e0062, fragment).commit();
        return fragment;
    }

    static f a(FragmentWrapperActivity fragmentwrapperactivity)
    {
        return fragmentwrapperactivity.f;
    }

    static String b(FragmentWrapperActivity fragmentwrapperactivity)
    {
        return fragmentwrapperactivity.g;
    }

    static String c(FragmentWrapperActivity fragmentwrapperactivity)
    {
        return fragmentwrapperactivity.e;
    }

    static p d(FragmentWrapperActivity fragmentwrapperactivity)
    {
        return fragmentwrapperactivity.d;
    }

    private void f()
    {
        if (y.b(11))
        {
            if (i)
            {
                if (c && !j)
                {
                    i = false;
                    onConfigurationChanged(getResources().getConfiguration());
                }
            } else
            if (j && !c)
            {
                i = true;
                return;
            }
        }
    }

    public final Fragment a()
    {
        return getSupportFragmentManager().findFragmentById(0x7f0e0062);
    }

    public final void a(int i1)
    {
        Window window;
label0:
        {
            if (y.a(21))
            {
                window = getWindow();
                if (window != null)
                {
                    break label0;
                }
            }
            return;
        }
        window.addFlags(0x80000000);
        window.clearFlags(0x4000000);
        window.setStatusBarColor(i1);
    }

    final void a(String s)
    {
        g = s;
    }

    public final boolean a(boolean flag)
    {
        boolean flag2 = false;
        Fragment fragment = a();
        boolean flag1 = flag2;
        if (!flag)
        {
            flag1 = flag2;
            if (fragment instanceof com.kik.h.a)
            {
                flag1 = ((com.kik.h.a)fragment).v();
            }
        }
        if (!flag1 && (fragment instanceof KikCardBrowserFragment))
        {
            if (((KikCardBrowserFragment)fragment).B())
            {
                ((KikCardBrowserFragment)fragment).a(null);
                flag = true;
            } else
            {
                flag = flag1;
            }
            flag1 = flag;
            if (!flag)
            {
                finish();
                flag1 = true;
            }
            return flag1;
        } else
        {
            return flag1;
        }
    }

    public final String b()
    {
        return g;
    }

    public final String c()
    {
        return e;
    }

    public final boolean d()
    {
        boolean flag;
        try
        {
            FragmentManager fragmentmanager = getSupportFragmentManager();
            Field field = Class.forName("android.support.v4.app.FragmentManagerImpl").getDeclaredField("mStateSaved");
            field.setAccessible(true);
            flag = field.getBoolean(fragmentmanager);
        }
        catch (Exception exception)
        {
            return h;
        }
        return !flag;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        Fragment fragment = a();
        if ((fragment instanceof ay) && ((ay)fragment).a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public final boolean e()
    {
        return j;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = 0xffff & i1;
        if (k1 != 17 || j1 != -1) goto _L2; else goto _L1
_L1:
        t t2 = a.n().a();
        File file;
        if (t2 == null)
        {
            file = null;
        } else
        {
            file = new File(t2.b());
        }
        if (file == null || !file.exists())
        {
            Toast.makeText(this, getString(0x7f090062), 1).show();
        } else
        {
            kik.android.f.a.f.a().a(this, file, "com.kik.ext.camera", t2.a(), true, a);
        }
_L4:
        super.onActivityResult(i1, j1, intent);
        return;
_L2:
        if (k1 == 203 && j1 == -1)
        {
            Object obj = kik.android.util.e.a(intent);
            t t1 = a.n().a();
            if (obj != null)
            {
                obj = kik.android.util.e.a(((android.net.Uri) (obj)), this);
                if (obj != null && t1 != null)
                {
                    kik.android.f.a.f.a().a(this, ((File) (obj)), "com.kik.ext.gallery", t1.a(), false, a);
                } else
                {
                    Toast.makeText(this, getString(0x7f090062), 1).show();
                }
            }
        } else
        if (i1 == 0x17318)
        {
            if (a() instanceof CardsWebViewFragment)
            {
                a().onActivityResult(i1, j1, intent);
            } else
            if (a() instanceof CardsWebViewFragment)
            {
                a().onActivityResult(i1, j1, intent);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        Fragment fragment = a();
        boolean flag;
        if (fragment instanceof com.kik.h.a)
        {
            flag = ((com.kik.h.a)fragment).A();
        } else
        {
            flag = false;
        }
        if (!flag && !a(false))
        {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration != null && k != configuration.orientation)
        {
            View view = null;
            Window window = getWindow();
            if (window != null)
            {
                view = window.getDecorView();
            }
            if (view != null)
            {
                view.dispatchConfigurationChanged(configuration);
            }
            k = configuration.orientation;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        ((kik.android.chat.a)getApplication()).a().a(this);
        getWindow().setBackgroundDrawable(new ey());
        Object obj;
        boolean flag;
        if (getIntent() != null)
        {
            obj = getIntent().getExtras();
        } else
        {
            obj = null;
        }
        if (bundle == null)
        {
            bundle = ((Bundle) (obj));
        }
        g = null;
        if (bundle != null)
        {
            g = bundle.getString("com.kik.util.KActivityLauncher.synthTaskId");
        }
        bundle = kik.android.chat.activity.k.c();
        if (g != null && bundle != null && !g.equals(bundle))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            finish();
            return;
        }
        f.a(b.a(), l);
        f.a(b.c(), l);
        f.a(kik.android.chat.activity.k.a(), m);
        f.a(kik.android.chat.activity.k.b(), n);
        requestWindowFeature(1);
        setContentView(0x7f03000d);
        bundle = a(getIntent());
        if (bundle instanceof FragmentBase)
        {
            obj = (FragmentBase)bundle;
            if (((FragmentBase) (obj)).M())
            {
                if (y.a(19))
                {
                    obj = getWindow();
                    if (obj != null)
                    {
                        ((Window) (obj)).clearFlags(0x80000000);
                        ((Window) (obj)).addFlags(0x4000000);
                    }
                }
            } else
            {
                a(((FragmentBase) (obj)).y());
            }
        } else
        {
            a(KikApplication.e(0x7f0c0078));
        }
        kik.android.chat.activity.k.a(this, bundle);
    }

    protected void onDestroy()
    {
        Fragment fragment = a();
        f.a();
        if (isFinishing())
        {
            kik.android.chat.activity.k.a(this);
        }
        if (fragment instanceof KikScopedDialogFragment)
        {
            ((KikScopedDialogFragment)fragment).ab();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag1 = super.onKeyDown(i1, keyevent);
        boolean flag = flag1;
        if (keyevent.isLongPress())
        {
            flag = flag1;
            if (i1 == 82)
            {
                flag = true;
            }
        }
        return flag;
    }

    protected void onNewIntent(Intent intent)
    {
        boolean flag = false;
        super.onNewIntent(intent);
        if (intent != null)
        {
            flag = intent.getBooleanExtra("com.kik.util.KActivityLauncher.no.refresh", false);
        }
        if (flag)
        {
            return;
        } else
        {
            a(intent);
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
        j = true;
        f();
        ((KikApplication)getApplication()).c(this);
    }

    protected void onResume()
    {
        super.onResume();
        h = true;
        j = false;
        f();
        ((KikApplication)getApplication()).d(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        h = false;
        bundle.putString("com.kik.util.KActivityLauncher.synthTaskId", g);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        c = flag;
        Object obj = a();
        if (obj != null && (obj instanceof d))
        {
            ((d)obj).a(c);
        }
        f();
        obj = (KikApplication)getApplication();
        if (flag)
        {
            ((KikApplication) (obj)).a(this);
            return;
        } else
        {
            ((KikApplication) (obj)).b(this);
            return;
        }
    }
}
