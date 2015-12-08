// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbLoginActivity

final class ab
    implements android.content.DialogInterface.OnClickListener
{

    final FbLoginActivity a;

    ab(FbLoginActivity fbloginactivity)
    {
        a = fbloginactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.setResult(0);
        a.finish();
    }
}
