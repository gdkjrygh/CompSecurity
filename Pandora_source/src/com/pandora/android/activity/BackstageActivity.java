// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.pandora.android.ads.c;
import com.pandora.android.util.AddCommentLayout;
import com.pandora.android.util.af;
import com.pandora.android.util.h;
import com.pandora.android.util.s;
import com.pandora.radio.util.i;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import p.ca.ac;
import p.cp.b;
import p.cp.d;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseAdFragmentActivity, c, a, BaseFragmentActivity

public class BackstageActivity extends BaseAdFragmentActivity
    implements com.pandora.android.util.AddCommentLayout.a, com.pandora.android.util.af.d
{
    public static class BackstagePandoraWebViewFragment extends ac
    {

        private BackstageActivity a;

        static BackstageActivity a(BackstagePandoraWebViewFragment backstagepandorawebviewfragment)
        {
            return backstagepandorawebviewfragment.a;
        }

        protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
        {
            a = (BackstageActivity)basefragmentactivity;
            return new a(this, basefragmentactivity, q, webview);
        }

        protected d a(boolean flag, int j, boolean flag1)
        {
            d d1 = super.a(flag, j, flag1);
            com.pandora.android.view.PandoraWebView pandorawebview = B();
            if (pandorawebview != null)
            {
                pandorawebview.setOnLongClickListener(new android.view.View.OnLongClickListener(this) {

                    final BackstagePandoraWebViewFragment a;

                    public boolean onLongClick(View view)
                    {
                        return !com.pandora.android.activity.BackstageActivity.a(com.pandora.android.activity.BackstagePandoraWebViewFragment.a(a));
                    }

            
            {
                a = backstagepandorawebviewfragment;
                super();
            }
                });
            }
            return d1;
        }

        public BackstagePandoraWebViewFragment()
        {
        }
    }

    public class BackstagePandoraWebViewFragment.a extends p.ca.ac.c
    {

        final BackstagePandoraWebViewFragment a;
        private final BackstageActivity b;

        protected void a(String s1, String s2, String s3)
        {
            if (com.pandora.android.util.s.a(s1))
            {
                return;
            } else
            {
                com.pandora.android.activity.BackstageActivity.b((BackstageActivity)i()).a(s1, s2, s3);
                return;
            }
        }

        protected void a(String s1, String s2, String s3, String s4, String s5, String s6)
        {
            s1 = p.cp.b.a(s1);
            p.df.a.c("BackstageActivity", (new StringBuilder()).append("BackstageActivity.openBackstage ").append(s1).toString());
            com.pandora.android.activity.BackstageActivity.a((BackstageActivity)i(), s1, s3, s4, s5, s6);
        }

        protected void a(JSONObject jsonobject)
        {
            super.a(jsonobject);
            jsonobject = jsonobject.optString("category");
            if (com.pandora.android.util.s.a(jsonobject))
            {
                return;
            } else
            {
                BackstageActivity backstageactivity = (BackstageActivity)i();
                backstageactivity.p = "social".equalsIgnoreCase(jsonobject);
                backstageactivity.d(false);
                backstageactivity.r();
                return;
            }
        }

        protected boolean a()
        {
            return true;
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            af.a().a(b.v());
        }

        public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            super.onPageStarted(webview, s1, bitmap);
            com.pandora.android.provider.b.a.b().f().b();
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            com.pandora.android.activity.BackstageActivity.b(b).b();
            return super.shouldOverrideUrlLoading(webview, s1);
        }

        public BackstagePandoraWebViewFragment.a(BackstagePandoraWebViewFragment backstagepandorawebviewfragment, BaseFragmentActivity basefragmentactivity, p.ca.ac.d d1, WebView webview)
        {
            a = backstagepandorawebviewfragment;
            super(backstagepandorawebviewfragment, basefragmentactivity, d1, webview);
            b = (BackstageActivity)basefragmentactivity;
        }
    }


    public static final int o = Color.parseColor("#DDE2E8");
    private LinearLayout A;
    private d B;
    private h C;
    private boolean D;
    private AddCommentLayout E;
    private String F;
    private boolean G;
    private p.ca.ac.a H;
    public boolean p;
    private BackstagePandoraWebViewFragment z;

    public BackstageActivity()
    {
        H = new p.ca.ac.a() {

            final BackstageActivity a;

            public void a(String s1)
            {
                a.b(s1);
            }

            
            {
                a = BackstageActivity.this;
                super();
            }
        };
    }

    static void a(BackstageActivity backstageactivity, String s1, String s2, String s3, String s4, String s5)
    {
        backstageactivity.a(s1, s2, s3, s4, s5);
    }

    private void a(String s1, String s2, String s3, String s4, String s5)
    {
        if (i.a(F, s1) == 0)
        {
            return;
        } else
        {
            b(c(s4));
            z.b(s1, true);
            F = s1;
            return;
        }
    }

    static boolean a(BackstageActivity backstageactivity)
    {
        return backstageactivity.ad();
    }

    private boolean ad()
    {
        return D;
    }

    private void ae()
    {
        c(false);
    }

    static AddCommentLayout b(BackstageActivity backstageactivity)
    {
        return backstageactivity.E;
    }

    public static String c(String s1)
    {
        return (new StringBuilder()).append(s1.substring(0, 1).toUpperCase(Locale.US)).append(s1.substring(1)).toString();
    }

    public void a(com.pandora.android.ads.h.b b1)
    {
    }

    public void a(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("text", com.pandora.android.util.s.d(s1));
        B.a(z.B(), s2, hashmap);
    }

    public void b(String s1)
    {
        boolean flag4 = true;
        boolean flag2 = true;
        if (!com.pandora.android.util.s.a(s1))
        {
            f((new StringBuilder()).append("title changed to: ").append(s1).toString());
            boolean flag;
            boolean flag1;
            if (s1 != null && s1.toLowerCase(Locale.US).contains("comment"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                E.setHideOnClick(false);
                E.setForceKeyboard(false);
            } else
            {
                E.setHideOnClick(true);
                E.setForceKeyboard(true);
            }
            if (C == null)
            {
                flag1 = false;
            } else
            {
                flag1 = C.a();
            }
            if (C == null)
            {
                if (flag)
                {
                    flag2 = false;
                }
                C = new h(flag2, false);
            } else
            {
                h h1 = C;
                boolean flag3;
                if (!flag)
                {
                    flag3 = flag4;
                } else
                {
                    flag3 = false;
                }
                h1.a(flag3);
            }
            if (C.a() != flag1)
            {
                H();
            }
            D = flag;
            setTitle(s1);
        }
    }

    public void c(boolean flag)
    {
        boolean flag1 = false;
        if (E != null)
        {
            AddCommentLayout addcommentlayout = E;
            int j;
            if (flag)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            addcommentlayout.setVisibility(j);
            if (!flag)
            {
                flag1 = true;
            }
            e(flag1);
        }
    }

    protected void k()
    {
        com.pandora.android.activity.c.a().d(this);
    }

    public int m()
    {
        return !p ? 1 : 5;
    }

    protected ViewGroup n()
    {
        return A;
    }

    protected int o()
    {
        return 0x7f1000e6;
    }

    public void onBackPressed()
    {
        F = null;
        if (z.w())
        {
            z.u();
            a("backstage_back_pressed", true);
            ae();
            return;
        } else
        {
            s();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!com.pandora.android.util.s.l())
        {
            setContentView(0x7f04002a);
            A = (LinearLayout)findViewById(0x7f1000e5);
            z = (BackstagePandoraWebViewFragment)f().a(0x7f1000e7);
            z.a(H);
            E = (AddCommentLayout)findViewById(0x7f1000e8);
            E.setCommentButtonListener(this);
            int j = o;
            Object obj = getIntent();
            if (obj != null)
            {
                boolean flag;
                if (((Intent) (obj)).hasExtra("intent_backstage_type"))
                {
                    bundle = ((Intent) (obj)).getStringExtra("intent_backstage_type");
                    b(c(bundle));
                } else
                {
                    bundle = null;
                }
                if (((Intent) (obj)).hasExtra("intent_backstage_category"))
                {
                    p = "social".equalsIgnoreCase(((Intent) (obj)).getStringExtra("intent_backstage_category"));
                }
                if (((Intent) (obj)).hasExtra("intent_backstage_background_color"))
                {
                    j = Color.parseColor((new StringBuilder()).append("#").append(((Intent) (obj)).getStringExtra("intent_backstage_background_color")).toString());
                }
                if (((Intent) (obj)).hasExtra("intent_uri"))
                {
                    obj = p.cp.b.a(((Intent) (obj)).getStringExtra("intent_uri"));
                } else
                {
                    p.df.a.c("BackstageActivity", "BackstageActivity called with no URL to show!");
                    obj = null;
                }
            } else
            {
                bundle = null;
                obj = null;
            }
            b(((Bundle) (null)));
            if (!"comment".equalsIgnoreCase(bundle))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            C = new h(flag, false);
            D = "comment".equalsIgnoreCase(bundle);
            B = z.a(true, j, android.webkit.WebSettings.ZoomDensity.MEDIUM, false);
            if (obj != null)
            {
                z.b(((String) (obj)), true);
                G = true;
                return;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        com.pandora.android.activity.a.a(menu, getMenuInflater(), new android.view.View.OnClickListener() {

            final BackstageActivity a;

            public void onClick(View view)
            {
                if (com.pandora.android.activity.a.d(a, 0x7f10000f))
                {
                    com.pandora.android.activity.BackstageActivity.b(a).c();
                }
            }

            
            {
                a = BackstageActivity.this;
                super();
            }
        });
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (com.pandora.android.activity.a.d(this, menuitem.getItemId()))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        G = false;
    }

    protected ViewGroup p()
    {
        return (ViewGroup)findViewById(o());
    }

    protected boolean q()
    {
        if (G)
        {
            return false;
        } else
        {
            return super.q();
        }
    }

    protected void r()
    {
        if (!I())
        {
            a(com.pandora.android.ads.c.e(m()), true);
        }
    }

    public void s()
    {
        setResult(-1);
        finish();
    }

    public boolean t()
    {
        if (C == null)
        {
            return false;
        } else
        {
            return C.a();
        }
    }

    public Point u()
    {
        return null;
    }

    public com.pandora.android.util.af.c v()
    {
        String s1 = getTitle().toString();
        if (!com.pandora.android.util.s.a(s1))
        {
            if (s1.equalsIgnoreCase("track"))
            {
                return com.pandora.android.util.af.c.X;
            }
            if (s1.equalsIgnoreCase("artist"))
            {
                return com.pandora.android.util.af.c.Y;
            }
            if (s1.equalsIgnoreCase("album"))
            {
                return com.pandora.android.util.af.c.Z;
            }
        }
        return com.pandora.android.util.af.c.aa;
    }

}
