// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.os.Bundle;
import com.tremorvideo.a.b;
import com.tremorvideo.a.d;
import java.util.Dictionary;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fa, ea, dm, ez, 
//            ct

class fb
    implements Runnable
{

    final dm a;
    final Bundle b;
    final fa c;

    fb(fa fa1, dm dm1, Bundle bundle)
    {
        c = fa1;
        a = dm1;
        b = bundle;
        super();
    }

    public void run()
    {
        Dictionary dictionary = c.d.g();
        Bundle bundle = new Bundle();
        if (dictionary.get("link") != null)
        {
            bundle.putString("link", (String)dictionary.get("link"));
        }
        if (dictionary.get("description") != null)
        {
            bundle.putString("description", (String)dictionary.get("description"));
        }
        if (dictionary.get("name") != null)
        {
            bundle.putString("name", (String)dictionary.get("name"));
        }
        if (dictionary.get("message") != null)
        {
            bundle.putString("message", (String)dictionary.get("message"));
        }
        if (dictionary.get("image") != null)
        {
            bundle.putString("picture", (String)dictionary.get("image"));
        }
        if (dictionary.get("video") != null)
        {
            bundle.putString("source", (String)dictionary.get("video"));
        }
        bundle.putSerializable("access_token", c.b.b());
        c.b.a("feed", bundle, "POST");
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        c.b.a(c.a);
_L1:
        Exception exception;
        a.dismiss();
        if (flag)
        {
            c.c.a(b);
        } else
        {
            c.c.a(new d("A connection error occured."));
        }
        ez.a(null);
        return;
        exception;
        flag = false;
_L2:
        ct.a(exception);
          goto _L1
        exception;
        flag = flag1;
          goto _L2
    }
}
