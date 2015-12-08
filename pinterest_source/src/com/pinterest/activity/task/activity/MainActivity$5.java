// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class this._cls0
    implements com.facebook.widget.pleteListener
{

    final MainActivity this$0;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception == null)
        {
            bundle = bundle.getString("post_id");
            if (bundle != null)
            {
                Application.showToast((new StringBuilder("Posted story, id: ")).append(bundle).toString());
                return;
            } else
            {
                Application.showToast("Publish cancelled");
                return;
            }
        }
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            Application.showToast("Publish cancelled");
            return;
        } else
        {
            Application.showToast("Error posting story");
            return;
        }
    }

    _cls9()
    {
        this$0 = MainActivity.this;
        super();
    }
}
