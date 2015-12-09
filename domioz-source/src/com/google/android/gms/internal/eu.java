// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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

// Referenced classes of package com.google.android.gms.internal:
//            fb, ez, ey, fa, 
//            ex, ew, ev, fm, 
//            fl

public class eu
{

    private eu()
    {
    }

    eu(byte byte0)
    {
        this();
    }

    public static eu a(int i)
    {
        if (i >= 19)
        {
            return new fb();
        }
        if (i >= 18)
        {
            return new ez();
        }
        if (i >= 17)
        {
            return new ey();
        }
        if (i >= 16)
        {
            return new fa();
        }
        if (i >= 14)
        {
            return new ex();
        }
        if (i >= 11)
        {
            return new ew();
        }
        if (i >= 9)
        {
            return new ev();
        } else
        {
            return new eu();
        }
    }

    public int a()
    {
        return 0;
    }

    public WebChromeClient a(fl fl)
    {
        return null;
    }

    public fm a(fl fl, boolean flag)
    {
        return new fm(fl, flag);
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
        return false;
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
}
