// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

final class ang.Object
    implements gfh
{

    private Uri a;
    private ggu b;

    public final void a(long l)
    {
        Uri uri = ggu.b(a);
        Context context;
        if (ggu.a(b, uri, l))
        {
            if ((context = (Context)ggu.a(b).get()) != null)
            {
                context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.URL_OPEN").setData(Uri.parse(uri.getQueryParameter("returnUrl"))));
                return;
            }
        }
    }

    (ggu ggu1, Uri uri)
    {
        b = ggu1;
        a = uri;
        super();
    }
}
