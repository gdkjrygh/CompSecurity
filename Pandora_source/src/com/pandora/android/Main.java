// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.ParseException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.appindexing.AndroidAppUri;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.iap.d;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.c;
import com.pandora.radio.util.i;
import p.cr.k;
import p.df.a;
import p.di.p;
import p.di.r;

// Referenced classes of package com.pandora.android:
//            PandoraService

public class Main extends BaseFragmentActivity
{

    private final Runnable A = new Runnable() {

        final Main a;

        public void run()
        {
            View view = a.findViewById(0x7f10029e);
            if (view != null)
            {
                view.setVisibility(0);
            }
        }

            
            {
                a = Main.this;
                super();
            }
    };
    private boolean o;
    private Intent p;
    private p.cp.b.c q;
    private Handler z;

    public Main()
    {
        o = false;
        z = new Handler();
    }

    private p.cp.b.c c(Intent intent)
    {
        if (intent != null)
        {
            if ("com.google.android.gms.actions.SEARCH_ACTION".equals(intent.getAction()))
            {
                return new p.cp.b.c(p.di.p.a(intent.getStringExtra("query"), new c(null), true, true, p.cx.x.e.i));
            }
            intent = intent.getData();
            if (intent != null)
            {
                return p.cr.k.b(intent);
            }
        }
        return null;
    }

    private boolean d(Intent intent)
    {
        if (intent != null)
        {
            if (PandoraIntent.a("show_now_playing").equals(intent.getAction()))
            {
                return true;
            }
            if (PandoraIntent.a("SHOW_VIDEOAD").equals(intent.getAction()) && intent.hasExtra("intent_followon_action"))
            {
                return true;
            }
        }
        return false;
    }

    private void m()
    {
        b.a.a(this, r());
    }

    private void n()
    {
        View view = findViewById(0x7f10029d);
        if (view != null)
        {
            f f1 = b.a.b().x();
            boolean flag = f1.a("KEY_IS_P1").booleanValue();
            boolean flag1 = f1.a("KEY_IS_WITHIN_TRIAL").booleanValue();
            int j;
            if (flag || flag1)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                j = 0x7f020200;
            } else
            {
                j = 0x7f02022d;
            }
            view.setBackgroundResource(j);
        }
    }

    private void o()
    {
        String s1 = null;
        Object obj = getIntent();
        Object obj1 = getReferrer();
        if (obj1 != null)
        {
            String s2 = ((Uri) (obj1)).getScheme();
            if (obj != null && ((Intent) (obj)).getData() != null)
            {
                obj = ((Intent) (obj)).getData().toString();
            } else
            {
                obj = null;
            }
            if (((Uri) (obj1)).getScheme().equals("http") || ((Uri) (obj1)).getScheme().equals("https"))
            {
                s1 = ((Uri) (obj1)).getHost();
                b.a.b().o().b(s2, s1, null, ((String) (obj)));
            } else
            if (((Uri) (obj1)).getScheme().equals("android-app"))
            {
                Object obj2 = AndroidAppUri.newAndroidAppUri(((Uri) (obj1)));
                obj1 = ((AndroidAppUri) (obj2)).getPackageName();
                if ("com.google.android.googlequicksearchbox".equals(obj1))
                {
                    obj2 = ((AndroidAppUri) (obj2)).getDeepLinkUri();
                    if (obj2 != null)
                    {
                        s1 = ((Uri) (obj2)).getHost();
                    }
                    b.a.b().o().b(s2, s1, ((String) (obj1)), ((String) (obj)));
                    return;
                }
            }
        }
    }

    private Uri p()
    {
        Intent intent = getIntent();
        Uri uri;
        if (intent == null)
        {
            uri = null;
        } else
        {
            Uri uri1 = (Uri)intent.getParcelableExtra("android.intent.extra.REFERRER");
            uri = uri1;
            if (uri1 == null)
            {
                Object obj = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (obj != null)
                {
                    try
                    {
                        obj = Uri.parse(((String) (obj)));
                    }
                    catch (ParseException parseexception)
                    {
                        return null;
                    }
                    return ((Uri) (obj));
                } else
                {
                    return null;
                }
            }
        }
        return uri;
    }

    private void q()
    {
        if (q == null)
        {
            return;
        }
        if (!q.a()) goto _L2; else goto _L1
_L1:
        b.a.a(q.c());
_L4:
        o = true;
        q = null;
        return;
_L2:
        if (q.b())
        {
            b.a.a(q.d());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Intent r()
    {
        if (p == null)
        {
            p = new Intent(this, com/pandora/android/PandoraService);
        }
        return p;
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (o && s1.equals(PandoraIntent.a("user_acknowledged_error")))
        {
            o = false;
            m();
        }
    }

    protected boolean a(Context context, Intent intent)
    {
        if (d(intent))
        {
            context = com.pandora.android.ads.VideoAdManager.c.a();
            if (context.l())
            {
                context = context.m();
                if (context != null)
                {
                    context = new Intent(this, context.getClass());
                    context.setFlags(0x24000000);
                    intent = intent.getExtras();
                    if (intent != null)
                    {
                        context.putExtras(intent);
                    }
                    startActivity(context);
                    finish();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    public Uri getReferrer()
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            return super.getReferrer();
        } else
        {
            return p();
        }
    }

    protected void k()
    {
        com.pandora.android.activity.c.a().d(this);
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("user_acknowledged_error");
        return pandoraintentfilter;
    }

    protected void onActivityResult(int j, int i1, Intent intent)
    {
        super.onActivityResult(j, i1, intent);
        if (j == 130)
        {
            b.a.E();
        }
    }

    public void onAmazonInAppPurchasingResponse(p.bz.c c1)
    {
        b.a.E();
    }

    public void onBackPressed()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        n();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(getIntent().getAction()))
        {
            f("Main Activity is not the root.  Finishing Main Activity instead of launching.");
            finish();
            return;
        }
        o();
        if (!b.a.b().C())
        {
            q = c(getIntent());
        }
        setContentView(0x7f04009e);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            getWindow().setFlags(0x1000000, 0x1000000);
        }
        ((TextView)findViewById(0x7f10025d)).setText(b.a.i());
        if (!i.e())
        {
            ((TextView)findViewById(0x7f1002a0)).setText(b.a.k());
        }
        com.pandora.android.iap.d.d.a().d().a(false);
        p.df.a.a("Main", "STARTING UP");
        q();
        m();
    }

    public void onResume()
    {
        super.onResume();
        n();
        b.a.v();
    }

    protected void onStart()
    {
        super.onStart();
        Uri uri = getIntent().getData();
        if (uri != null && !s.l() && uri.toString().equals("pandora://pandora/upgraded"))
        {
            p.df.a.c("Main", "Pandora one upgrade complete");
            (new r()).execute(new Object[] {
                b.a.b()
            });
            b.a.d().a(false);
        }
        z.postDelayed(A, 5000L);
    }

    protected void onStop()
    {
        super.onStop();
        z.removeCallbacks(A);
        View view = findViewById(0x7f10029d);
        if (view != null)
        {
            Drawable drawable = view.getBackground();
            if (drawable != null)
            {
                drawable.setCallback(null);
                view.setBackgroundResource(0);
            }
        }
        finish();
    }
}
