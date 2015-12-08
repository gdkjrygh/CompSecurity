// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.ui.AppboyWebViewActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.appboy.ui.a:
//            d

public final class f
    implements d
{

    private static final List c = Collections.unmodifiableList(Arrays.asList(new String[] {
        "http", "https", "ftp", "ftps", "about", "javascript"
    }));
    private final String a;
    private final Bundle b = null;

    public f(String s)
    {
        a = s;
    }

    public static List a()
    {
        return c;
    }

    public final void a(Context context)
    {
        Intent intent = new Intent(context, com/appboy/ui/AppboyWebViewActivity);
        if (b != null)
        {
            intent.putExtras(b);
        }
        intent.putExtra("url", a);
        context.startActivity(intent);
    }

}
