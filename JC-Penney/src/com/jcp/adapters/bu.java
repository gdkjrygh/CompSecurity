// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.text.TextUtils;
import android.view.View;
import com.jcp.activities.MainActivity;
import com.jcp.productcategories.modal.Modal;
import com.jcp.util.ae;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            ProductCategoriesAdapter

class bu
    implements android.view.View.OnClickListener
{

    final int a;
    final String b;
    final ProductCategoriesAdapter c;

    bu(ProductCategoriesAdapter productcategoriesadapter, int i, String s)
    {
        c = productcategoriesadapter;
        a = i;
        b = s;
        super();
    }

    public void onClick(View view)
    {
        if (a != 0) goto _L2; else goto _L1
_L1:
        c.a = 0;
_L4:
        if (a == 0)
        {
            ProductCategoriesAdapter.a(c).n();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (c.a > a)
        {
            c.a = a;
        } else
        if (c.a != a)
        {
            view = c;
            view.a = ((ProductCategoriesAdapter) (view)).a + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (ProductCategoriesAdapter.b(c) != null && a < ProductCategoriesAdapter.b(c).size())
        {
            if (((Modal)ProductCategoriesAdapter.b(c).get(1)).isLocalAdCategory())
            {
                ProductCategoriesAdapter.a(c, 1, a, b);
                return;
            }
            if (!TextUtils.isEmpty(((Modal)ProductCategoriesAdapter.b(c).get(a)).getMobile()) && "Gallery".equalsIgnoreCase(((Modal)ProductCategoriesAdapter.b(c).get(a)).getMobile()))
            {
                view = ((Modal)ProductCategoriesAdapter.b(c).get(a)).getId();
                String s = ((Modal)ProductCategoriesAdapter.b(c).get(a)).getName();
                String s1 = ((Modal)ProductCategoriesAdapter.b(c).get(a)).getUrl();
                ProductCategoriesAdapter.a(c, a);
                ProductCategoriesAdapter.a(c).a(view, s, s1, c.a);
                return;
            } else
            {
                ProductCategoriesAdapter.a(c).a(((Modal)ProductCategoriesAdapter.b(c).get(a)).getId(), b, c.a, ProductCategoriesAdapter.b(c), a);
                return;
            }
        }
        if (ProductCategoriesAdapter.b(c) != null)
        {
            ae.a(ProductCategoriesAdapter.a(), (new StringBuilder()).append("position = ").append(a).append(" while myList.size() = ").append(ProductCategoriesAdapter.b(c).size()).toString());
            return;
        } else
        {
            ae.a(ProductCategoriesAdapter.a(), "myList == null");
            return;
        }
    }
}
