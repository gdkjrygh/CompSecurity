// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.content.ContentResolver;
import android.net.Uri;

// Referenced classes of package com.facebook.orca.camera.a:
//            d, b, m, c

public class l
    implements d
{

    private static final Class a = com/facebook/orca/camera/a/b;
    private c b;
    private Uri c;

    public l(ContentResolver contentresolver, Uri uri)
    {
        c = uri;
        b = new m(this, contentresolver, uri);
    }

    public c a(int i)
    {
        if (i == 0)
        {
            return b;
        } else
        {
            return null;
        }
    }

    public c a(Uri uri)
    {
        if (uri.equals(c))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public void a()
    {
        b = null;
        c = null;
    }

    public int b()
    {
        return 1;
    }

}
