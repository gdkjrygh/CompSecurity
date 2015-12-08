// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.a.a;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.sony.snei.np.android.a.a:
//            e, c

final class 
    implements 
{

    public final boolean a(Context context)
    {
        if (e.b() != null)
        {
            return true;
        }
        context = e.a(context);
        if (TextUtils.isEmpty(context))
        {
            return false;
        } else
        {
            e.a(context);
            return true;
        }
    }

    public final c b(Context context)
    {
        return new e(context);
    }

    ()
    {
    }
}
