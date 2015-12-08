// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.main;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;

// Referenced classes of package com.google.android.gms.games.ui.client.main:
//            ClientSettingsActivity

final class this._cls0
    implements ResultCallback
{

    final ClientSettingsActivity this$0;

    public final volatile void onResult(Result result)
    {
        result = ClientSettingsActivity.this;
        DialogFragmentUtil.dismiss(result, "com.google.android.gms.games.ui.dialog.progressDialog");
        result.setResult(10001);
        result.finish();
    }

    ()
    {
        this$0 = ClientSettingsActivity.this;
        super();
    }
}
