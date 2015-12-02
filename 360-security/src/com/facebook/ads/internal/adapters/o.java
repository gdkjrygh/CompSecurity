// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.c;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.i;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            e, q, f, d

public class o extends e
{

    private final String a = UUID.randomUUID().toString();
    private Context b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private d g;
    private f h;
    private boolean i;
    private q j;
    private WebView k;

    public o()
    {
        i = false;
    }

    static f a(o o1)
    {
        return o1.h;
    }

    private void a(q q1)
    {
        if (q1 == null)
        {
            return;
        } else
        {
            k = new WebView(b);
            k.setWebChromeClient(new WebChromeClient() {

                final o a;

                public void onProgressChanged(WebView webview, int l)
                {
                    if (l == 100 && o.a(a) != null)
                    {
                        o.a(a).a(a);
                    }
                }

            
            {
                a = o.this;
                super();
            }
            });
            k.loadDataWithBaseURL(com.facebook.ads.internal.util.i.a(), q1.d(), "text/html", "utf-8", null);
            return;
        }
    }

    public void a(Context context, f f1, Map map)
    {
        b = context;
        h = f1;
        j = q.a((JSONObject)map.get("data"));
        if (com.facebook.ads.internal.util.g.a(context, j))
        {
            f1.a(this, c.b);
        } else
        {
            g = new d(context, a, this, h);
            g.a();
            i = true;
            context = j.g();
            if (context.containsKey("is_tablet"))
            {
                c = Boolean.parseBoolean((String)context.get("is_tablet"));
            }
            if (context.containsKey("ad_height"))
            {
                d = Integer.parseInt((String)context.get("ad_height"));
            }
            if (context.containsKey("ad_width"))
            {
                e = Integer.parseInt((String)context.get("ad_width"));
            }
            if (context.containsKey("native_close"))
            {
                f = Boolean.valueOf((String)context.get("native_close")).booleanValue();
            }
            if (context.containsKey("preloadMarkup") && Boolean.parseBoolean((String)context.get("preloadMarkup")))
            {
                a(j);
                return;
            }
            if (h != null)
            {
                h.a(this);
                return;
            }
        }
    }

    public void b()
    {
        if (g != null)
        {
            g.b();
        }
        if (k != null)
        {
            com.facebook.ads.internal.util.i.a(k);
            k.destroy();
            k = null;
        }
    }

    public boolean c()
    {
        if (!i)
        {
            if (h != null)
            {
                h.a(this, c.e);
            }
            return false;
        } else
        {
            Intent intent = new Intent(b, com/facebook/ads/InterstitialAdActivity);
            j.a(intent);
            Display display = ((WindowManager)b.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            display.getMetrics(displaymetrics);
            intent.putExtra("displayRotation", display.getRotation());
            intent.putExtra("displayWidth", displaymetrics.widthPixels);
            intent.putExtra("displayHeight", displaymetrics.heightPixels);
            intent.putExtra("isTablet", c);
            intent.putExtra("adHeight", d);
            intent.putExtra("adWidth", e);
            intent.putExtra("adInterstitialUniqueId", a);
            intent.putExtra("useNativeCloseButton", f);
            intent.putExtra("viewType", com.facebook.ads.internal.adapters.view.b.b.a);
            intent.addFlags(0x10000000);
            b.startActivity(intent);
            return true;
        }
    }
}
