// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.photosphere.PhotosphereViewerActivity;

public final class hed
    implements android.view.View.OnClickListener
{

    private PhotosphereViewerActivity a;

    public hed(PhotosphereViewerActivity photospherevieweractivity)
    {
        a = photospherevieweractivity;
        super();
    }

    public final void onClick(View view)
    {
        PhotosphereViewerActivity.c(a).c();
        a.finish();
    }
}
