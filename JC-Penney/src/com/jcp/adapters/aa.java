// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.jcp.fragments.ShoppingBagFragment;
import com.jcp.fragments.t;
import com.jcp.h.a;
import com.jcp.model.Coupons;

// Referenced classes of package com.jcp.adapters:
//            CouponAdapter

class aa
    implements android.view.View.OnClickListener
{

    final Coupons a;
    final CouponAdapter b;

    aa(CouponAdapter couponadapter, Coupons coupons)
    {
        b = couponadapter;
        a = coupons;
        super();
    }

    public void onClick(View view)
    {
        Object obj;
label0:
        {
            com.jcp.h.a.z();
            obj = a.getCode();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                view = new ShoppingBagFragment();
                Bundle bundle = new Bundle();
                bundle.putString("CouponCode", ((String) (obj)));
                view.g(bundle);
                obj = com.jcp.adapters.CouponAdapter.a(b);
                if (!(obj instanceof t))
                {
                    break label0;
                }
                ((t)obj).b(view, "ShoppingCart");
            }
            return;
        }
        throw new com.jcp.d.a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
            ((Activity) (obj)).getComponentName().getClassName(), com/jcp/fragments/t.getName()
        }));
    }
}
