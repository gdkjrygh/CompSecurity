// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.photos.downsync.GooglePhotoDownsyncService;

public final class ffa
    implements ngs
{

    private final noz a;
    private Context b;

    public ffa(Context context)
    {
        b = context;
        a = noz.a(context, 3, "SyncAccountExt", new String[] {
            "sync"
        });
    }

    public final void a(int i)
    {
        Object obj1 = (mmv)olm.a(b, mmv);
        Object obj = ((mmv) (obj1)).a(i);
        if (a.a())
        {
            noy.a(i);
        }
        if (((mmx) (obj)).c("logged_in"))
        {
            obj = ((mmx) (obj)).b("account_name");
            if (a.a())
            {
                noy.a(i);
            }
            GooglePhotoDownsyncService.a(b, ((String) (obj)));
            return;
        }
        obj1 = ((mmv) (obj1)).b(i);
        obj = ((mmx) (obj)).b("account_name");
        if (a.a())
        {
            noy.a(i);
        }
        GooglePhotoDownsyncService.b(b, ((String) (obj)));
        ((gcc)olm.a(b, gcc)).c(i);
        ((gcf)olm.a(b, gcf)).c(i);
        nlm.a(b);
        ((mmz) (obj1)).d();
    }
}
