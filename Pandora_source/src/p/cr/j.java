// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.net.Uri;

// Referenced classes of package p.cr:
//            a

public class j
    implements k.c
{

    public j()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        uri = uri.buildUpon().path("/").appendPath("account").appendPath("billing").build();
        return (new a()).a(uri);
    }
}
