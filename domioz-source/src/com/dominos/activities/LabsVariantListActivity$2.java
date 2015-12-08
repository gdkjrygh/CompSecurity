// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.AdapterView;
import com.dominos.MobileSession;
import com.dominos.adapters.LabsVariantListAdapter;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;

// Referenced classes of package com.dominos.activities:
//            LabsVariantListActivity

class this._cls0
    implements android.widget.tener
{

    final LabsVariantListActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = variantListAdapter.getItem(i);
        view = new LabsProductLine(adapterview);
        mMenuManager.loadOptionsFromMenu(view);
        view.resetToDefaultOptions();
        if (isRestoreProductLineInEdit)
        {
            ((ProductWizardManager)mMobileSession.getManager("product_wizard_manager")).setNewVariantFromVariantListActivity(adapterview);
            finish();
        }
    }

    dManager()
    {
        this$0 = LabsVariantListActivity.this;
        super();
    }
}
