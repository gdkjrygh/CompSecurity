// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.i.a.a.b;
import com.facebook.i.a.a.d;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            d

public class m extends b
{

    private boolean b;

    public m(int i)
    {
        super(d.m, i);
    }

    public void a()
    {
        b = false;
    }

    public void a(Uri uri, d d1)
    {
        if (d.n.equals(uri))
        {
            d1.a = Boolean.valueOf(b);
            if (b)
            {
                d1.b = true;
            }
        }
    }

    public void a(Bundle bundle)
    {
        bundle.putBoolean(d.n.getPath(), b);
    }

    public boolean a(Uri uri, Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d.n.equals(uri))
        {
            boolean flag2 = b;
            b = Boolean.TRUE.equals(obj);
            flag = flag1;
            if (flag2 != b)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void b(Bundle bundle)
    {
        b = bundle.getBoolean(d.n.getPath(), false);
    }
}
