// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

final class beg
    implements android.view.View.OnClickListener
{

    private bee a;

    beg(bee bee1)
    {
        a = bee1;
        super();
    }

    public final void onClick(View view)
    {
        if (bee.a(a).g || bee.a(a).p || bee.a(a).q)
        {
            return;
        }
        view = bee.b(a).a;
        if (view == bdp.c || view == bdp.d)
        {
            bee.b(a).j();
            bee.a(a).a();
        }
        bee.c(a).b(9);
    }
}
