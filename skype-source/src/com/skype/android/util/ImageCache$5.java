// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.support.v4.util.g;
import com.skype.Contact;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util:
//            ImageCache

final class c
    implements Callable
{

    final boolean a;
    final Contact b;
    final long c;
    final int d = 1;
    final ImageCache e;

    public final Object call()
        throws Exception
    {
        g g1;
        byte abyte0[];
        if (a)
        {
            g1 = ImageCache.a(b);
        } else
        {
            g1 = new g(b.getIdentity(), b.getAvatarImageProp());
        }
        abyte0 = (byte[])g1.b;
        if (abyte0 == null || abyte0.length == 0)
        {
            return null;
        } else
        {
            return ImageCache.a(e, (String)g1.a, c, abyte0, d);
        }
    }

    (ImageCache imagecache, boolean flag, Contact contact, long l)
    {
        e = imagecache;
        a = flag;
        b = contact;
        c = l;
        super();
    }
}
