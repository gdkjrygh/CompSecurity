// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.c.b.g;
import com.dropbox.client2.DropboxAPI;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            b

public final class d
    implements g
{

    private final DropboxAPI a;

    public d(DropboxAPI dropboxapi)
    {
        a = dropboxapi;
    }

    public final c a(Object obj, int i, int j)
    {
        obj = (String)obj;
        return new b(a, ((String) (obj)));
    }
}
