// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import me.lyft.android.ui.camera.CaptureResultView;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedCarDocumentPreView

public class 
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CapturedCarDocumentPreView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, CapturedCarDocumentPreView capturedcardocumentpreview, Object obj)
    {
        capturedcardocumentpreview.captureResultView = (CaptureResultView)viewinjector.captureResultView((View)viewinjector.captureResultView(obj, 0x7f0d00bc, "field 'captureResultView'"), 0x7f0d00bc, "field 'captureResultView'");
    }

    public volatile void reset(Object obj)
    {
        reset((CapturedCarDocumentPreView)obj);
    }

    public void reset(CapturedCarDocumentPreView capturedcardocumentpreview)
    {
        capturedcardocumentpreview.captureResultView = null;
    }

    public ()
    {
    }
}
