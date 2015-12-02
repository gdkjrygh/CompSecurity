// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c.a;

import android.util.Log;
import com.android.volley.VolleyError;

// Referenced classes of package com.qihoo.security.appbox.c.a:
//            b

class a
    implements com.android.volley.toolbox.._cls1
{

    final b a;

    public void a(VolleyError volleyerror)
    {
    }

    public void a(com.android.volley.toolbox.._cls1 _pcls1, boolean flag)
    {
        if (_pcls1 == null)
        {
            Log.e(b.c(), (new StringBuilder()).append("imagecontainer = null ").append(flag).toString());
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
