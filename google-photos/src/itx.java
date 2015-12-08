// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.google.android.apps.photos.photosphere.PhotosphereViewerActivity;

final class itx
    implements android.view.View.OnClickListener
{

    private itf a;

    itx(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void onClick(View view)
    {
        if (itf.l(a) != null)
        {
            view = new Intent(a.O_(), com/google/android/apps/photos/photosphere/PhotosphereViewerActivity);
            view.putExtra("com.google.android.apps.photos.core.media", itf.l(a));
            a.a(view);
            return;
        } else
        {
            itf.o(a).a();
            return;
        }
    }
}
