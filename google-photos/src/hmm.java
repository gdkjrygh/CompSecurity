// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

final class hmm
    implements dhf, nus, omb, opv
{

    private final am a;
    private did b;
    private Context c;

    public hmm(am am1)
    {
        a = am1;
    }

    private void b()
    {
        if (!b.w(c))
        {
            ay ay = a.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.b;
            nuq1.c = "OfflineRetryTagEditAlbum";
            nuq1.e = true;
            nuo.a(ay, nuq1);
            return;
        }
        if (b.d())
        {
            b.f();
        }
        b.a("com.google.android.apps.photos.remotemedia.ui.enter_album_edit_mode", new Bundle());
    }

    public final String a()
    {
        return "OfflineRetryTagEditAlbum";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        b = (did)olm1.a(did);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public final void b(MenuItem menuitem)
    {
        b();
    }

    public final void c_(Bundle bundle)
    {
        b();
    }
}
