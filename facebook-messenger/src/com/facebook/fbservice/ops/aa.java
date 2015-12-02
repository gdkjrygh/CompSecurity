// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.app.ProgressDialog;
import android.content.Context;
import com.facebook.base.b.a;

// Referenced classes of package com.facebook.fbservice.ops:
//            ab

public class aa
    implements ab
{

    private final Context a;
    private final String b;
    private ProgressDialog c;

    public aa(Context context, int i)
    {
        a = context;
        b = context.getString(i);
    }

    public aa(Context context, String s)
    {
        a = context;
        b = s;
    }

    public void a()
    {
        if (c == null)
        {
            c = new ProgressDialog(a);
            c.setCancelable(false);
            c.setMessage(b);
            com.facebook.base.b.a.a(c);
            c.show();
        }
    }

    public void b()
    {
        if (c != null && c.isShowing())
        {
            c.dismiss();
            c = null;
        }
    }
}
