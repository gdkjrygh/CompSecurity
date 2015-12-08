// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.ArrayList;

final class hnx
    implements mpj
{

    private hnw a;

    hnx(hnw hnw1)
    {
        a = hnw1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1 && a.e.b(ag.G))
        {
            a.d = new ArrayList(a.e.a(ag.G));
            Object obj = (hpe)a.b.b().a(hpe);
            intent = a;
            java.util.List list = a.d;
            String s = ((hpe) (obj)).a.a;
            obj = ((hnw) (intent)).a.h();
            if ((jcm)((ay) (obj)).a("com.google.android.apps.photos.remotemedia.ui.EditAlbumPhotosMixin.upload_fragment_from_album") == null)
            {
                intent = jcm.a(list, new eqp(s, ((hnw) (intent)).c));
                ((ay) (obj)).a().a(intent, "com.google.android.apps.photos.remotemedia.ui.EditAlbumPhotosMixin.upload_fragment_from_album").b();
                ((ay) (obj)).b();
                return;
            }
        }
    }
}
