// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photosphere.PhotosphereViewerActivity;

public final class hea
    implements Runnable
{

    private PhotosphereViewerActivity a;

    public hea(PhotosphereViewerActivity photospherevieweractivity)
    {
        a = photospherevieweractivity;
        super();
    }

    public final void run()
    {
        PhotosphereViewerActivity photospherevieweractivity = a;
        if (!photospherevieweractivity.isFinishing() && !photospherevieweractivity.e)
        {
            photospherevieweractivity.d.b().a(photospherevieweractivity.getString(b.vl)).a(true);
        }
    }
}
