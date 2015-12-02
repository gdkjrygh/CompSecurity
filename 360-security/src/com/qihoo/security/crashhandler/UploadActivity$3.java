// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.content.Intent;
import android.view.View;
import com.qihoo.security.lite.AppEnterActivity;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.crashhandler:
//            UploadActivity

class a
    implements android.view.ner
{

    final UploadActivity a;

    public void onClick(View view)
    {
        Utils.dismissDialog(UploadActivity.c(a));
        view = new Intent(a, com/qihoo/security/lite/AppEnterActivity);
        view.setFlags(0x10000000);
        a.startActivity(view);
        UploadActivity.b(a);
    }

    (UploadActivity uploadactivity)
    {
        a = uploadactivity;
        super();
    }
}
