// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roidapp.imagelib.g;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            TemplateClipView

final class o
    implements Runnable
{

    final TemplateClipView a;

    o(TemplateClipView templateclipview)
    {
        a = templateclipview;
        super();
    }

    public final void run()
    {
        List list = TemplateClipView.a(a);
        list;
        JVM INSTR monitorenter ;
        RelativeLayout relativelayout;
        if (TemplateClipView.a(a).isEmpty() || TemplateClipView.b(a)[TemplateClipView.c(a)] == -1 || TemplateClipView.b(a)[TemplateClipView.c(a)] >= TemplateClipView.a(a).size())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        relativelayout = (RelativeLayout)((ImageView)((View)TemplateClipView.a(a).get(TemplateClipView.b(a)[TemplateClipView.c(a)])).findViewById(g.o)).getParent();
        if (relativelayout == null) goto _L2; else goto _L1
_L1:
        a.scrollTo(relativelayout.getLeft(), 0);
_L3:
        list;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.scrollTo(0, 0);
          goto _L3
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        a.scrollTo(0, 0);
          goto _L3
    }
}
