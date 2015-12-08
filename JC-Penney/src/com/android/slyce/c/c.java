// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.c;

import android.content.Context;
import com.android.slyce.k.g;
import com.android.slyce.k.h;
import java.io.IOException;
import java.net.URISyntaxException;

// Referenced classes of package com.android.slyce.c:
//            i, a, f

class c
    implements Runnable
{

    final Context a;
    final String b;
    final f c;
    final a d;

    c(a a1, Context context, String s, f f)
    {
        d = a1;
        a = context;
        b = s;
        c = f;
        super();
    }

    public void run()
    {
        Object obj = g.a(a);
        obj = new i(((g) (obj)).d(), ((g) (obj)).c());
        try
        {
            String s = ((i) (obj)).a(((i) (obj)).a(i.a, b));
            ((i) (obj)).a();
            obj = com.android.slyce.c.a.a(d, s);
            com.android.slyce.c.a.a(d, ((org.json.JSONObject) (obj)), c);
            return;
        }
        catch (IOException ioexception) { }
        catch (URISyntaxException urisyntaxexception) { }
        h.a(com.android.slyce.c.a.a(), "Exception on 2D search image url");
    }
}
