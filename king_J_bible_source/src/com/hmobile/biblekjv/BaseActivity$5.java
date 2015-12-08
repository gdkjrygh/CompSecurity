// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class this._cls0
    implements com.facebook.widget.pleteListener
{

    final BaseActivity this$0;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception == null)
        {
            bundle = bundle.getString("post_id");
            if (bundle != null)
            {
                hideProgress();
                Toast.makeText(BaseActivity.this, (new StringBuilder("Posted story, id: ")).append(bundle).toString(), 0).show();
                if (is_finished)
                {
                    bundle = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                    bundle.addFlags(0x4000000);
                    startActivity(bundle);
                    finish();
                }
                return;
            } else
            {
                hideProgress();
                Toast.makeText(getApplicationContext(), "Publish cancelled", 0).show();
                finish();
                return;
            }
        }
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            hideProgress();
            Toast.makeText(getApplicationContext(), "Publish cancelled", 0).show();
            return;
        } else
        {
            hideProgress();
            Toast.makeText(getApplicationContext(), "Error posting story", 0).show();
            return;
        }
    }

    edException()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
