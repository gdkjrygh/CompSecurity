// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.app.ProgressDialog;
import android.content.Intent;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.onboarding.auth.tasks.RecoverPasswordTask;
import com.soundcloud.android.utils.AndroidUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            RecoverActivity

class ordTask extends RecoverPasswordTask
{

    private ProgressDialog progressDialog;
    final RecoverActivity this$0;

    protected void onPostExecute(Boolean boolean1)
    {
        if (!isFinishing() && progressDialog != null)
        {
            try
            {
                progressDialog.dismiss();
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        setResult(-1, (new Intent()).putExtra("success", boolean1).putExtra("error", getFirstError()));
        finish();
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected void onPreExecute()
    {
        if (!isFinishing())
        {
            progressDialog = AndroidUtils.showProgress(RecoverActivity.this, 0x7f07009e);
        }
    }

    ordTask(PublicApi publicapi)
    {
        this$0 = RecoverActivity.this;
        super(publicapi);
    }
}
