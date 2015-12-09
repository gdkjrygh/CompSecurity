// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class cjl
{

    public cjl()
    {
    }

    cjl(byte byte0)
    {
        this();
    }

    public static boolean a(WebView webview)
    {
        if (webview == null)
        {
            return false;
        } else
        {
            webview.onPause();
            return true;
        }
    }

    public static boolean b(WebView webview)
    {
        if (webview == null)
        {
            return false;
        } else
        {
            webview.onResume();
            return true;
        }
    }

    public int a()
    {
        return 0;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean flag, float f)
    {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebChromeClient a(ckw ckw)
    {
        return null;
    }

    public ckx a(ckw ckw, boolean flag)
    {
        return new ckx(ckw, flag);
    }

    public String a(Context context)
    {
        return "";
    }

    public String a(SslError sslerror)
    {
        return "";
    }

    public Set a(Uri uri)
    {
        if (uri.isOpaque())
        {
            return Collections.emptySet();
        }
        uri = uri.getEncodedQuery();
        if (uri == null)
        {
            return Collections.emptySet();
        }
        LinkedHashSet linkedhashset = new LinkedHashSet();
        int j = 0;
        do
        {
            int i;
            int k;
label0:
            {
                k = uri.indexOf('&', j);
                i = k;
                if (k == -1)
                {
                    i = uri.length();
                }
                int l = uri.indexOf('=', j);
                if (l <= i)
                {
                    k = l;
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                k = i;
            }
            linkedhashset.add(Uri.decode(uri.substring(j, k)));
            i++;
            j = i;
            if (i >= uri.length())
            {
                return Collections.unmodifiableSet(linkedhashset);
            }
        } while (true);
    }

    public void a(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            a(activity.getDecorView().getViewTreeObserver(), ongloballayoutlistener);
        }
    }

    public void a(View view, Drawable drawable)
    {
        view.setBackgroundDrawable(drawable);
    }

    public void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
    }

    public boolean a(android.app.DownloadManager.Request request)
    {
        return false;
    }

    public boolean a(Context context, WebSettings websettings)
    {
        return false;
    }

    public boolean a(View view)
    {
        return view.getWindowToken() != null || view.getWindowVisibility() != 8;
    }

    public boolean a(Window window)
    {
        return false;
    }

    public int b()
    {
        return 1;
    }

    public boolean b(View view)
    {
        return false;
    }

    public int c()
    {
        return 5;
    }

    public boolean c(View view)
    {
        return false;
    }

    public android.view.ViewGroup.LayoutParams d()
    {
        return new android.view.ViewGroup.LayoutParams(-2, -2);
    }
}
