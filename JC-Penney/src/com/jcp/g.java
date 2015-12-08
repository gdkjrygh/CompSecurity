// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp;

import android.os.Bundle;
import android.text.TextUtils;
import com.jcp.activities.MainActivity;
import com.jcp.b.b;
import com.jcp.fragments.ProductDetailFragment;

// Referenced classes of package com.jcp:
//            e

class g
    implements Runnable
{

    final String a;
    final e b;

    g(e e1, String s)
    {
        b = e1;
        a = s;
        super();
    }

    public void run()
    {
        if (a != null)
        {
            if (a.contains("/products/"))
            {
                String s = a.substring(a.lastIndexOf("/") + 1);
                com.jcp.b.b.d(false);
                ProductDetailFragment productdetailfragment = new ProductDetailFragment();
                Bundle bundle1 = new Bundle();
                bundle1.putString("ProductURL", "");
                bundle1.putString("PPID", s);
                bundle1.putBoolean("ProductDetails", true);
                bundle1.putBoolean("SEARCH", true);
                bundle1.putString("SEARCH_TAG", com.jcp.e.b(b));
                bundle1.putBoolean("is_web_id_search", true);
                productdetailfragment.g(bundle1);
                e.a(b).c(productdetailfragment, "ProductDetailFragment");
            }
        } else
        if (!TextUtils.isEmpty(e.c(b)) && e.c(b).startsWith("http"))
        {
            Bundle bundle = new Bundle();
            bundle.putString("SELECTED_VALUE", e.c(b));
            bundle.putString("SEARCH_TAG", com.jcp.e.b(b));
            bundle.putBoolean("progress", false);
            bundle.putBoolean("SEARCH", true);
            e.a(b).a(bundle);
            return;
        }
    }
}
