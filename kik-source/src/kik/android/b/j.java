// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import com.android.volley.p;
import com.android.volley.toolbox.a;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;
import com.kik.cache.ad;
import com.kik.m.k;
import java.io.File;
import kik.a.e.q;
import kik.android.util.bx;
import kik.android.util.d;

public final class j
{

    private static ad b;
    private Context a;
    private q c;

    public j(Context context, q q1)
    {
        a = context;
        c = q1;
        File file;
        file = new File(a.getCacheDir(), "cardsIcons");
        q1 = a.getDir("cardsIcons", 0);
        context = q1;
        if (q1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        context = new File(a.getCacheDir(), "cardsIcons");
        if (file.exists())
        {
            file.delete();
        }
        if (context != null)
        {
            try
            {
                if (context.exists())
                {
                    context.delete();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                bx.a(context);
            }
        }
        q1 = a.getDir("volleyCardsIcons", 0);
        context = q1;
        if (q1 == null)
        {
            context = new File(a.getCacheDir(), "volleyCardsIcons");
        }
        d.a(context, b());
        if (b == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new h();
            } else
            {
                context = new e(AndroidHttpClient.newInstance("AN"));
            }
            context = new a(context);
            context = new p(new com.android.volley.toolbox.d(b(), 0x500000), context, 2);
            context.a();
            b = new ad(context, k.a(), null);
        }
        return;
    }

    public static ad a()
    {
        return b;
    }

    private File b()
    {
        return c.a("volleyCardsIcons");
    }
}
