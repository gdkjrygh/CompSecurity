// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

final class beh
    implements android.view.View.OnClickListener
{

    private bee a;

    beh(bee bee1)
    {
        a = bee1;
        super();
    }

    public final void onClick(View view)
    {
        if (!bee.a(a).p && !bee.a(a).q)
        {
            if (((CropOverlayView) (view = bee.a(a))).c != null)
            {
                view.f = ((CropOverlayView) (view)).f + 1;
                if (!((CropOverlayView) (view)).g)
                {
                    view.b();
                    return;
                }
            }
        }
    }
}
