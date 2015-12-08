// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import java.util.List;

// Referenced classes of package com.skype.android.widget:
//            FacepileTileView

final class a
    implements AsyncCallback
{

    final FacepileTileView a;

    public final void done(AsyncResult asyncresult)
    {
label0:
        {
            if (asyncresult.e())
            {
                Bitmap bitmap = (Bitmap)asyncresult.a();
                if (bitmap != null)
                {
                    FacepileTileView.a(a, bitmap);
                }
                int i;
                if (FacepileTileView.a(a) < FacepileTileView.b(a).size())
                {
                    i = FacepileTileView.a(a) - 1;
                } else
                {
                    i = FacepileTileView.b(a).size();
                }
                asyncresult = (Integer)asyncresult.b();
                if (a.getChildCount() < i && asyncresult.intValue() < FacepileTileView.b(a).size() - 1)
                {
                    break label0;
                }
                FacepileTileView.c(a);
            }
            return;
        }
        this;
        JVM INSTR monitorenter ;
        FacepileTileView.d(a);
        this;
        JVM INSTR monitorexit ;
        FacepileTileView.a(a, FacepileTileView.e(a), FacepileTileView.f(a));
        return;
        asyncresult;
        this;
        JVM INSTR monitorexit ;
        throw asyncresult;
    }

    (FacepileTileView facepiletileview)
    {
        a = facepiletileview;
        super();
    }
}
