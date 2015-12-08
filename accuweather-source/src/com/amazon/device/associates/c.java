// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.HashMap;

// Referenced classes of package com.amazon.device.associates:
//            i, br, n, bb, 
//            ah, bq, bo, p, 
//            o

class c
{
    private static class a extends RelativeLayout
        implements android.view.View.OnTouchListener
    {

        private final Context a;
        private final String b;
        private final boolean c;
        private RelativeLayout d;
        private WebView e;
        private ImageView f;
        private ProgressBar g;
        private TextView h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private boolean n;
        private boolean o;
        private ViewGroup p;

        private ViewGroup a(ViewGroup viewgroup)
        {
            for (; viewgroup.getParent() != null && !viewgroup.getParent().getClass().getName().equals("com.android.internal.policy.impl.PhoneWindow$DecorView"); viewgroup = viewgroup.getParent()) { }
            if (viewgroup.getParent() != null && viewgroup.getParent().getClass().getName().equals("com.android.internal.policy.impl.PhoneWindow$DecorView"))
            {
                viewgroup = viewgroup.getParent();
            }
            com.amazon.device.associates.p.a(c.a(), (new StringBuilder()).append("Viewgroup identified as shadowPane's parent: ").append(viewgroup).toString());
            return (ViewGroup)viewgroup;
        }

        static ViewGroup a(a a1)
        {
            return a1.p;
        }

        static String a(a a1, String s)
        {
            return a1.b(s);
        }

        private void a(int i1, int j1)
        {
            f = new ImageView(getContext());
            Object obj = getResources().getDrawable(bo.a("x", "drawable"));
            int k1 = ((Drawable) (obj)).getIntrinsicWidth();
            int l1 = ((Drawable) (obj)).getIntrinsicHeight();
            i1 -= k1 / 2;
            j1 -= l1 / 2;
            f.setImageDrawable(((Drawable) (obj)));
            f.setVisibility(8);
            obj = new android.widget.RelativeLayout.LayoutParams(k1, l1);
            obj.leftMargin = i1;
            obj.topMargin = j1;
            com.amazon.device.associates.p.a(c.a(), (new StringBuilder()).append("Positioning the x image at : ").append(i1).append(" ").append(j1).toString());
            addView(f, ((android.view.ViewGroup.LayoutParams) (obj)));
        }

        private void a(Rect rect)
        {
            i = Math.round((float)l * 0.125F);
            j = Math.round((float)l * 0.085F);
            k = Math.round((float)m * 0.07F);
            com.amazon.device.associates.p.a(c.a(), (new StringBuilder()).append("Paddings left top right bottom :").append(k).append(" ").append(i).append(" ").append(k).append(" ").append(j).toString());
        }

        static boolean a(a a1, boolean flag)
        {
            a1.n = flag;
            return flag;
        }

        private boolean a(String s)
        {
            if (s.matches("^((http|https)://)(www[.])?(amazon[.])(com|ca|cn|de|es|fr|it|in|co[.]jp|co[.]uk)(/gp/aw/d)?(/)?(([A-Za-z0-9])*)[?]?") || s.matches("^((http|https)://)(www[.])?(amazon[.])(com)(/gp/dmusic/device/mp3/store/)(album|track)(/)?(([A-Za-z0-9])*)?.*") || c.b().booleanValue() && s.matches("^((http|https)://)(www[.])?(amazon[.])(com)(/gp/dmusic/device/mp3/store)([/])?(\\Q?ie=UTF8&*Version*=1&*entries*=0#\\E)(album|track)(/)?(([A-Za-z0-9])*)?.*"))
            {
                com.amazon.device.associates.p.a(c.a(), "Whitelisted url");
                return true;
            } else
            {
                com.amazon.device.associates.p.a(c.a(), "Not whitelisted url");
                return false;
            }
        }

        private Rect b(View view)
        {
            int ai[] = new int[2];
            view.getLocationOnScreen(ai);
            return new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        }

        static WebView b(a a1)
        {
            return a1.e;
        }

        private String b(String s)
        {
label0:
            {
                String s2;
label1:
                {
                    String s1 = bq.a(b, "tag");
                    s2 = bq.a(b, "linkCode");
                    s2 = (new StringBuilder()).append("tag=").append(s1).append("&linkCode=").append(s2).toString();
                    if (s2 == null)
                    {
                        break label0;
                    }
                    s1 = bq.e(s);
                    if (s1.charAt(s1.length() - 1) != '?')
                    {
                        s = s1;
                        if (s1.charAt(s1.length() - 1) != '/')
                        {
                            break label1;
                        }
                    }
                    s = s1.substring(0, s1.length() - 1);
                }
                if (s.contains("?"))
                {
                    return s.concat((new StringBuilder()).append("&").append(s2).toString());
                } else
                {
                    return s.concat((new StringBuilder()).append("?").append(s2).toString());
                }
            }
            return s;
        }

        private void b()
        {
            d = new RelativeLayout(a);
            d.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            d.setPadding(k, i, k, j);
            if (e != null)
            {
                d.addView(e);
            }
        }

        private void b(Rect rect)
        {
            int i1 = Math.round((float)l * 0.8F);
            int j1 = Math.round((float)m * 0.85F);
            com.amazon.device.associates.p.a(c.a(), (new StringBuilder()).append("Dimensions of the webview created h :").append(i1).append(" w :").append(j1).toString());
            e = new WebView(a);
            e.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(j1, i1));
            e.getSettings().setJavaScriptEnabled(true);
            e.getSettings().setDomStorageEnabled(true);
            e.setVisibility(8);
            if (c.b().booleanValue())
            {
                e.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 4.1.1; Nexus 7 Build/JRO03D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166  Safari/535.19");
            }
            e.setWebChromeClient(new WebChromeClient(this) {

                final a a;

                public void onProgressChanged(WebView webview, int j)
                {
                    a.c(a).setProgress(j);
                    if (j == 100)
                    {
                        a.c(a).setVisibility(8);
                        a.d(a).setVisibility(8);
                    }
                }

            
            {
                a = a1;
                super();
            }
            });
            rect = e();
            if (c.b().booleanValue())
            {
                if (c)
                {
                    rect = rect.replace("$ADDITIONAL_MESSAGE", "$CHARACTERTo buy, the browser view mode $CHARACTERshould be MOBILE.");
                } else
                {
                    rect = rect.replace("$ADDITIONAL_MESSAGE", "");
                }
                rect = rect.replace("$CHARACTER", "<br />");
            } else
            {
                rect = rect.replace("$ADDITIONAL_MESSAGE", "").replace("$CHARACTER", "");
            }
            e.setWebViewClient(new WebViewClient(this, i1, j1, rect) {

                boolean a;
                final int b;
                final int c;
                final String d;
                final a e;

                public void onPageFinished(WebView webview, String s)
                {
                    if (!a)
                    {
                        if (a.e(e))
                        {
                            float f1 = e.getContext().getResources().getDisplayMetrics().density;
                            webview = a.f(e).replace("$DIMENSION", (new StringBuilder()).append("height:").append(String.valueOf((float)b / f1)).append("px;width:").append(String.valueOf((float)c / f1)).append("px").toString());
                            if (c.b().booleanValue())
                            {
                                webview = webview.replace("$CHARACTER", "<br />");
                            } else
                            {
                                webview = webview.replace("$CHARACTER", "");
                            }
                            a.b(e).loadDataWithBaseURL("blarg://ignored", webview, "text/html", "UTF-8", "");
                            a.b(e).setVerticalScrollBarEnabled(false);
                            a.b(e).setHorizontalScrollBarEnabled(false);
                        } else
                        {
                            if (!a.b(e, s))
                            {
                                bq.d(s);
                                e.a();
                                p.c(c.a(), "Popover dismissed due to security reasons. Opening the url in browser");
                                return;
                            }
                            p.a(c.a(), (new StringBuilder()).append("onPageFinished: ").append(s).toString());
                            a.b(e).loadUrl(d);
                        }
                        a.b(e).setVisibility(0);
                        a.g(e).setVisibility(0);
                        if (!c.b().booleanValue() || c.b().booleanValue() && a.e(e))
                        {
                            a = true;
                            p.a(c.a(), "onPageFinished completed. Setting flag to true!!");
                            return;
                        }
                    }
                }

                public void onReceivedError(WebView webview, int j, String s, String s1)
                {
                    super.onReceivedError(webview, j, s, s1);
                    a.b(e, true);
                }

                public boolean shouldOverrideUrlLoading(WebView webview, String s)
                {
                    if ((c.b().booleanValue() && s.matches("^((http|https)://)(www[.])?(amazon[.])(com)(/gp/dmusic/device/mp3/store)([/])?(\\Q?ie=UTF8&*Version*=1&*entries*=0#\\E)(album|track)(/)?(([A-Za-z0-9])*)?.*") || s.matches("^((http|https)://)(www[.])?(amazon[.])(com)(/gp/dmusic/device/mp3/store/)(album|track)(/)?(([A-Za-z0-9])*)?.*")) && !a)
                    {
                        p.a(c.a(), (new StringBuilder()).append("Avoiding the redirect for ").append(s).toString());
                        return false;
                    } else
                    {
                        p.a(c.a(), (new StringBuilder()).append("Calling OverrideLinkInvocation for url : ").append(s).toString());
                        bq.d(a.a(e, s));
                        e.a();
                        return true;
                    }
                }

            
            {
                e = a1;
                b = j;
                c = k;
                d = s;
                super();
                a = false;
            }
            });
            e.setOnTouchListener(new android.view.View.OnTouchListener(this) {

                final a a;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 0)
                    {
                        a.b(a).loadUrl("javascript:(function() {hideMessageBox();})();");
                        if (a.e(a))
                        {
                            bq.d(bq.a());
                            a.a();
                        }
                    }
                    return false;
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        static boolean b(a a1, String s)
        {
            return a1.a(s);
        }

        static boolean b(a a1, boolean flag)
        {
            a1.o = flag;
            return flag;
        }

        static ProgressBar c(a a1)
        {
            return a1.g;
        }

        private void c()
        {
            g = new ProgressBar(getContext(), null, 0x1010078);
            g.setVisibility(0);
            g.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(Math.round((float)m * 0.5F), 15));
        }

        static TextView d(a a1)
        {
            return a1.h;
        }

        private void d()
        {
            h = new TextView(getContext());
            h.setWidth(Math.round((float)m * 0.5F));
            h.setText("Loading product detail from Amazon");
            h.setGravity(17);
            h.setTextSize(15F);
            h.setTextColor(-1);
            h.setPadding(0, 15, 0, 0);
            h.setVisibility(0);
        }

        private String e()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("javascript:(function() {").append("\n").append("   var messageBox = document.createElement('div');").append("\n").append("   messageBox.style.position = 'fixed';").append("\n").append("   messageBox.style.bottom = '30px';").append("\n").append("   messageBox.style.left = '0';").append("\n").append("   messageBox.style.width = '100%';").append("\n").append("   messageBox.style.textAlign = 'center';").append("\n").append("   messageBox.style.zIndex = '1000';").append("\n").append("   var message = \"<span style='display:inline-block; border:1px solid #CCC; padding:5px 10px; border-radius:5px; background:#555; color:#FFF;'>\"").append("\n").append("   +\"Clicking a link on this page takes you $CHARACTERto Amazon website in a browser.$ADDITIONAL_MESSAGE</span>\";").append("\n").append("   messageBox.innerHTML = message;").append("\n").append("   var bodyTag = document.getElementsByTagName('body')[0];").append("\n").append("   bodyTag.appendChild(messageBox);").append("\n").append("   var allforms = document.forms;").append("\n").append("   for (var i = 0; i < allforms.length; i++) {").append("\n").append("       var form = allforms[i];").append("\n").append("       if (form.method && form.method.toUpperCase() == 'POST') {").append("\n").append("           form.method = 'GET';").append("\n").append("       }").append("\n").append("   }").append("\n").append("   var addToWishListButton = document.querySelector('button.a-button.a-button-supplemental');").append("\n").append("   if(addToWishListButton)").append("\n").append("       addToWishListButton.style.display = 'none';").append("\n").append("   var addToCartButton = document.querySelector('button.a-button.a-button-primary > span > span.a-button-text');").append("\n").append("   if(addToCartButton)").append("\n").append("       addToCartButton.innerHTML = 'Buy on Amazon';").append("\n").append("   var addToCartPreorderButton = document.querySelector('button.a-button.a-button-preorder > span > span.a-button-text');").append("\n").append("   if(addToCartPreorderButton)").append("\n").append("       addToCartPreorderButton.innerHTML = 'Preorder on Amazon';").append("\n").append("   var addToCartForm = document.getElementById('addToCart');").append("\n").append("   if(addToCartForm)").append("\n").append("       addToCartForm.onsubmit = function(){").append("\n").append("           window.location = window.location+\"/\";").append("\n").append("           return false;").append("\n").append("       }").append("\n").append("   window.hideMessageBox = function() {").append("\n").append("       messageBox.style.display = 'none';").append("\n").append("   }").append("\n").append("})();");
            return stringbuilder.toString();
        }

        static boolean e(a a1)
        {
            return a1.o;
        }

        private String f()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("<!DOCTYPE html>").append("<html lang=\"en\">").append("<head></head>").append("<body style=\"margin: auto; padding:auto;\">").append("   <div style='$DIMENSION; text-align:center; vertical-align:middle; display:table-cell;'>").append("       <img src='file:///android_res/drawable/alogo.png' alt='amazon' style='' />").append("   </div>").append("   <script type=\"text/javascript\">").append("       var messageBox = document.createElement('div');").append("       messageBox.style.position = 'fixed';").append("       messageBox.style.bottom = '30px';").append("       messageBox.style.left = '0';").append("       messageBox.style.width = '100%';").append("       messageBox.style.textAlign = 'center';").append("       messageBox.style.zIndex = '1000';").append("       ").append("       var message = \"<span style='display:inline-block; border:1px solid #CCC; padding:5px 10px; border-radius:5px; background:#555; color:#FFF;'>\"").append("       +\"Clicking a link on this page takes you $CHARACTERto Amazon website in a browser.</span>\";").append("       messageBox.innerHTML = message;").append("   ").append("       var bodyTag = document.getElementsByTagName('body')[0];").append("       bodyTag.appendChild(messageBox);").append("       ").append("       window.hideMessageBox = function() {").append("           messageBox.style.display = 'none';").append("       }").append("   </script>").append("</body>").append("</html>");
            return stringbuilder.toString();
        }

        static String f(a a1)
        {
            return a1.f();
        }

        static ImageView g(a a1)
        {
            return a1.f;
        }

        static RelativeLayout h(a a1)
        {
            return a1.d;
        }

        public void a()
        {
            if (!n)
            {
                e.setVisibility(4);
                f.setVisibility(4);
                AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation.setDuration(300L);
                alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                    final a a;

                    public void onAnimationEnd(Animation animation)
                    {
                        a.h(a).removeAllViews();
                        a.removeAllViews();
                        a.a(a).removeView(a);
                        a.a(a, false);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = a1;
                super();
            }
                });
                n = true;
                startAnimation(alphaanimation);
            }
        }

        public void a(View view)
        {
            view = a((ViewGroup)view.getParent());
            p = view;
            Rect rect = b(view);
            l = rect.bottom - rect.top;
            m = rect.right - rect.left;
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams(m, l));
            b(rect);
            a(rect);
            b();
            addView(d);
            c();
            addView(g);
            d();
            addView(h);
            view.addView(this);
            a((int)((float)rect.width() * 0.93F), i);
            setOnTouchListener(this);
            view = new AlphaAnimation(0.0F, 1.0F);
            view.setDuration(300L);
            view.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                final a a;

                public void onAnimationEnd(Animation animation)
                {
                    a.a(a, false);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                a = a1;
                super();
            }
            });
            n = true;
            startAnimation(view);
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (!n && view == this)
            {
                a();
            }
            return true;
        }

        public a(Context context, String s, boolean flag)
        {
            super(context);
            n = false;
            o = false;
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            setGravity(17);
            setBackgroundColor(0x962c3539);
            a = context;
            b = s;
            c = flag;
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b e[];
        private final String d;

        public static b a(String s)
        {
            if (s != null) goto _L2; else goto _L1
_L1:
            b b1 = c;
_L4:
            return b1;
_L2:
            b ab[] = values();
            int k = ab.length;
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= k)
                    {
                        break label1;
                    }
                    b b2 = ab[j];
                    b1 = b2;
                    if (b2.d.equals(s))
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return c;
        }

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/amazon/device/associates/c$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("MP3_ALBUM", 0, "Digital Music Album");
            b = new b("MP3_TRACK", 1, "Digital Music Track");
            c = new b("OTHERS", 2, "Others");
            e = (new b[] {
                a, b, c
            });
        }

        private b(String s, int j, String s1)
        {
            super(s, j);
            d = s1;
        }
    }


    private static a b;
    private static final String c = com/amazon/device/associates/c.getName();
    private static Boolean d = null;
    private final String a;
    private String e;
    private br f;
    private b g;
    private i h;
    private boolean i;

    public c(String s)
    {
        e = "";
        i = false;
        a = s;
        c();
    }

    static String a()
    {
        return c;
    }

    private String a(i j)
    {
        if (!e() || d.booleanValue() && !i)
        {
            return (String)j.a().get(i.f);
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[g.ordinal()])
        {
        default:
            return (String)j.a().get(i.f);

        case 1: // '\001'
            return (String)j.a().get(i.g);

        case 2: // '\002'
            return (String)j.a().get(i.h);
        }
    }

    private b b(String s)
    {
        if (s != null && f != null)
        {
            return b.a(f.h());
        } else
        {
            return b.c;
        }
    }

    static Boolean b()
    {
        return d;
    }

    private void c()
    {
        d();
        f = n.a(a);
        h = (i)((bb)ah.a(com/amazon/device/associates/bb)).j();
        g = b(a);
        f();
    }

    private void d()
    {
label0:
        {
            if (d == null)
            {
                if (Build.MANUFACTURER == null || !Build.MANUFACTURER.equalsIgnoreCase("AMAZON"))
                {
                    break label0;
                }
                d = Boolean.valueOf(true);
            }
            return;
        }
        d = Boolean.valueOf(false);
    }

    private boolean e()
    {
        return !i || android.os.Build.VERSION.SDK_INT >= 11;
    }

    private void f()
    {
        if (b.a.equals(g) || b.b.equals(g))
        {
            i = true;
        }
    }

    public String a(String s)
    {
        String s2 = bq.a(s);
        s = null;
        String s1;
        if (s2 != null)
        {
            if (h != null)
            {
                s = a(h);
            }
        } else
        {
            p.a(c, "ASIN not received. Providing Amazon homepage Url");
            s = bq.a();
        }
        s1 = s;
        if (s == null)
        {
            s1 = a(((bb)ah.a(com/amazon/device/associates/bb)).a());
        }
        s = s1;
        if (!s1.startsWith("http://"))
        {
            s = (new StringBuilder()).append("http://").append(s1).toString();
        }
        s1 = s;
        if (s.contains("$ASIN"))
        {
            s1 = s.replace("$ASIN", s2);
        }
        s = s1;
        if (s1.contains("$DEVICE"))
        {
            if (d.booleanValue())
            {
                s = s1.replace("$DEVICE", "device=android_browser&");
            } else
            {
                s = s1.replace("$DEVICE", "");
            }
        }
        return s.replace("$SUBTAG", bo.b());
    }

    public void a(View view)
    {
        String s1;
        if (b != null && b.isShown())
        {
            a.a(b).removeView(b);
        }
        e = a(a);
        s1 = bq.e(e);
        String s = s1;
        if (s1.charAt(s1.length() - 1) == '?')
        {
            s = s1.substring(0, s1.length() - 1);
        }
        p.a(c, (new StringBuilder()).append("Original URL : ").append(e).append(". New UDP URL").append(s).toString());
        b = new a(bo.a(), e, i);
        if (!e())
        {
            bq.d(a.a(b, s));
            return;
        }
        try
        {
            b.a(view);
            a.b(b).loadUrl(s);
            (new o()).execute(new String[] {
                bq.a(e, "tag"), bq.a(e, "linkCode"), a
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            p.b(c, "Error displaying product detail popover");
        }
        return;
    }

}
