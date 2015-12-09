// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.squareup.picasso.Picasso;

final class ang.Object
    implements Runnable
{

    private Uri a;
    private dvq b;

    public final void run()
    {
        ((gft)dmz.a(gft)).a().a(a).a(dvq.g(b));
    }

    (dvq dvq1, Uri uri)
    {
        b = dvq1;
        a = uri;
        super();
    }
}
