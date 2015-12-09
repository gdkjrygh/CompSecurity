// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.view.View;
import com.jcp.activities.AssistantsImageKnowledgeActivity;
import com.jcp.productentity.ProductUtilsEntity;
import com.jcp.util.bv;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ec
    implements android.view.View.OnClickListener
{

    final ProductUtilsEntity a;
    final ProductDetailFragment b;

    ec(ProductDetailFragment productdetailfragment, ProductUtilsEntity productutilsentity)
    {
        b = productdetailfragment;
        a = productutilsentity;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(b.i(), com/jcp/activities/AssistantsImageKnowledgeActivity);
        view.putExtra("AssetReferenceURL", a.getAssetReferenceURL());
        view.putExtra("Editor", a.getEditor());
        view.putExtra("Title", bv.b(a.getTitle()));
        view.addFlags(32768);
        view.addFlags(0x4000000);
        b.a(view);
    }
}
