// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.facebook.FacebookException;
import com.facebook.widget.PickerFragment;
import com.kohls.mcommerce.opal.common.util.Logger;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookActivity

class this._cls0
    implements com.facebook.widget.orListener
{

    final FacebookActivity this$0;

    public void onError(PickerFragment pickerfragment, FacebookException facebookexception)
    {
        if (!FacebookActivity.access$300(FacebookActivity.this))
        {
            FacebookActivity.access$400(FacebookActivity.this).setDisplayedChild(0);
            Toast.makeText(FacebookActivity.this, getResources().getString(0x7f080116), 0).show();
        }
        Logger.debug(FacebookActivity.access$1500(), facebookexception.getMessage());
    }

    ()
    {
        this$0 = FacebookActivity.this;
        super();
    }
}
