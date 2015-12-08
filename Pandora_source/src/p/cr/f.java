// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.net.Uri;
import p.cm.n;

public class f
    implements k.c
{

    public f()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        return new p.cp.b.c(new n(uri.getQueryParameter("category"), uri.getQueryParameter("name")));
    }
}
