// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookWebShareActivity

static final class Q
    implements com.facebook.widget.r
{

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (bundle.getString("post_id") != null)
        {
            FacebookWebShareActivity.dispayMsg();
        }
        FacebookWebShareActivity.access$102(true);
        return;
        bundle;
        bundle.printStackTrace();
        return;
    }

    Q()
    {
    }
}
