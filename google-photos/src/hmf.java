// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.ArrayList;

final class hmf
    implements mpj
{

    private hme a;

    hmf(hme hme1)
    {
        a = hme1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1)
        {
            a.d = new ArrayList(a.e.a(ag.G));
            a.b.c();
            Object obj = a;
            ArrayList arraylist = a.d;
            intent = ((hme) (obj)).a.h();
            if ((jcm)intent.a("com.google.android.apps.photos.remotemedia.ui.AddToEnvelopeMenuItemHandler.upload_fragment_tag") == null)
            {
                obj = jcm.a(arraylist, new hma(((hme) (obj)).c.b()));
                intent.a().a(((am) (obj)), "com.google.android.apps.photos.remotemedia.ui.AddToEnvelopeMenuItemHandler.upload_fragment_tag").b();
                intent.b();
            }
        }
    }
}
