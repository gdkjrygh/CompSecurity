// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.appboy.ui.a:
//            d

public final class e
    implements d
{

    private final Intent a = new Intent("android.intent.action.VIEW");

    public e(Uri uri, Bundle bundle)
    {
        a.setData(uri);
        if (bundle != null)
        {
            a.putExtras(bundle);
        }
    }

    public final void a(Context context)
    {
        if (a.resolveActivity(context.getPackageManager()) != null)
        {
            context.startActivity(a);
        }
    }
}
