// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class aje
{

    private aje()
    {
    }

    aje(byte byte0)
    {
        this();
    }

    public static aje a(int i)
    {
        if (i >= 19)
        {
            return new ajl();
        }
        if (i >= 18)
        {
            return new ajj();
        }
        if (i >= 17)
        {
            return new aji();
        }
        if (i >= 16)
        {
            return new ajk();
        }
        if (i >= 14)
        {
            return new ajh();
        }
        if (i >= 11)
        {
            return new ajg();
        }
        if (i >= 9)
        {
            return new ajf();
        } else
        {
            return new aje();
        }
    }

    public int a()
    {
        return 0;
    }

    public akl a(akk akk, boolean flag)
    {
        return new akl(akk, flag);
    }

    public WebChromeClient a(akk akk)
    {
        return null;
    }

    public String a(Context context)
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
            activity.getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(ongloballayoutlistener);
        }
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

    public boolean a(WebView webview)
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

    public boolean b(WebView webview)
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
