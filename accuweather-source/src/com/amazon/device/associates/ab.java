// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            p, bo, bm, ah, 
//            n, OpenProductPageRequest, a, bq, 
//            OpenSearchPageRequest, ad, c, OpenRetailPageRequest

public class ab
{

    private static ab a = null;
    private boolean b;

    private ab(Context context, String s, Set set)
    {
        b = false;
        if (context == null || s == null || "".equals(s))
        {
            p.b("MAIN", "Initialize failed due to invalid input.");
            throw new IllegalArgumentException("Invalid input.");
        }
        bo.a(context, s);
        (new bm()).execute(new String[0]);
        ah.a();
        if (set != null)
        {
            try
            {
                n.a((String[])set.toArray(new String[0]));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                p.b("MAIN", "Initialize failed");
            }
            break MISSING_BLOCK_LABEL_100;
        }
        n.a(null);
        return;
    }

    public static ab a(Context context, String s, Set set)
    {
        if (a == null)
        {
            a = new ab(context, s, set);
        }
        return a;
    }

    public void a(View view, OpenProductPageRequest openproductpagerequest)
    {
        if (openproductpagerequest == null || openproductpagerequest.getProductId() == null || openproductpagerequest.getProductId().trim().equals(""))
        {
            openproductpagerequest = null;
        } else
        {
            openproductpagerequest = openproductpagerequest.getProductId();
        }
        if (!b)
        {
            b = true;
            (new a(openproductpagerequest)).a(view);
            b = false;
        }
    }

    public void a(OpenRetailPageRequest openretailpagerequest)
    {
        if (openretailpagerequest == null)
        {
            return;
        }
        if (openretailpagerequest instanceof OpenProductPageRequest)
        {
            openretailpagerequest = bq.b(((OpenProductPageRequest)openretailpagerequest).getProductId());
        } else
        if (openretailpagerequest instanceof OpenSearchPageRequest)
        {
            openretailpagerequest = bq.a((OpenSearchPageRequest)openretailpagerequest);
        } else
        {
            openretailpagerequest = bq.a();
        }
        bq.d(openretailpagerequest);
    }

    public final boolean a(WebView webview, String s)
    {
        return ad.a(webview, s);
    }

    public void b(View view, OpenProductPageRequest openproductpagerequest)
    {
        if (openproductpagerequest == null || openproductpagerequest.getProductId() == null || openproductpagerequest.getProductId().trim().equals(""))
        {
            openproductpagerequest = null;
        } else
        {
            openproductpagerequest = openproductpagerequest.getProductId().trim();
        }
        if (!b)
        {
            b = true;
            (new c(openproductpagerequest)).a(view);
            b = false;
        }
    }

}
