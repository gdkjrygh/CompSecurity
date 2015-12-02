// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;
import com.facebook.i.a.a.b;
import com.facebook.i.a.a.e;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            d, c, b, m, 
//            l

public class k
    implements e
{

    public k()
    {
    }

    public b a(Uri uri, int i)
    {
        if (d.a.equals(uri))
        {
            return new c(i);
        }
        if (com.facebook.messages.ipc.peer.d.e.equals(uri))
        {
            return new com.facebook.messages.ipc.peer.b(i);
        }
        if (d.m.equals(uri))
        {
            return new m(i);
        }
        if (d.o.equals(uri))
        {
            return new l(i);
        } else
        {
            return null;
        }
    }
}
