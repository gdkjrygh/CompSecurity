// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.a;

import android.content.Context;
import android.net.Uri;
import com.appboy.ui.d.d;
import java.util.List;

// Referenced classes of package com.appboy.ui.a:
//            f, b, e, d

public final class a
{

    public static com.appboy.ui.a.d a(Context context, String s)
    {
        if (!d.a(s))
        {
            Uri uri = Uri.parse(s);
            if (f.a().contains(uri.getScheme()))
            {
                return new f(s);
            }
            if ("intent".equals(uri.getScheme()))
            {
                return new b(context.getPackageName(), uri);
            } else
            {
                return new e(uri, null);
            }
        } else
        {
            return null;
        }
    }
}
