// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.photos.photosphere.PhotosphereViewerActivity;

public final class hec
    implements mfh
{

    private PhotosphereViewerActivity a;

    public hec(PhotosphereViewerActivity photospherevieweractivity)
    {
        a = photospherevieweractivity;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (intent != null)
        {
            a.startActivity(intent);
        } else
        {
            PhotosphereViewerActivity.b(a);
        }
        PhotosphereViewerActivity.c(a).c();
        a.finish();
    }

    public final void c()
    {
        PhotosphereViewerActivity.b(a);
        PhotosphereViewerActivity.c(a).c();
        a.finish();
    }
}
