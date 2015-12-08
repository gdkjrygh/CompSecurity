// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.DialogInterface;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.db.custom.DBSearchPlacesHelper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FindinStoreActivity

class this._cls0
    implements android.content.kListener
{

    final FindinStoreActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            dialoginterface = new DBSearchPlacesHelper();
            try
            {
                dialoginterface.deleteAll("SearchPlaces");
                showSuggestionItems(null, false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (DialogInterface dialoginterface)
            {
                UtilityMethods.showToast(getApplicationContext(), getString(0x7f0800f9), 0);
            }
            return;
        } else
        {
            onBackPressed();
            return;
        }
    }

    ()
    {
        this$0 = FindinStoreActivity.this;
        super();
    }
}
