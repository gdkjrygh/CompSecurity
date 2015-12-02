// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.b.a;

import android.content.Context;
import android.os.Bundle;
import java.io.File;

// Referenced classes of package com.qihoo.b.a:
//            a, b

public class d
{

    private static boolean a = false;

    public static void a(Context context, Bundle bundle, b b)
    {
        if (a || context.getFilesDir() == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        String s = context.getFilesDir().getParent();
        String s1 = (new File((new File(s, "lib")).getAbsolutePath(), "libumder.so")).getAbsolutePath();
        try
        {
            context = (new a(context, bundle, b)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        context = (new StringBuilder(String.valueOf(s1))).append(" ").append(s).append(" lib ").append(s).append(" just4test ").append(context).toString();
        if (Runtime.getRuntime().exec(context) != null)
        {
            a = true;
        }
    }

}
