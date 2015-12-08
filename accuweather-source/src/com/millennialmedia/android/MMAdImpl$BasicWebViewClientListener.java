// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMAdImpl, MMAdImplController, MMWebView

static class adImplRef extends ner
{

    WeakReference adImplRef;

    public void onPageFinished(String s)
    {
        MMAdImpl mmadimpl;
        mmadimpl = (MMAdImpl)adImplRef.get();
        if (mmadimpl == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        mmadimpl.setClickable(true);
        if (mmadimpl.controller == null || mmadimpl.controller.webView == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s = mmadimpl.controller.webView;
        s;
        JVM INSTR monitorenter ;
        if (!mmadimpl.controller.webView.hasWindowFocus())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        mmadimpl.controller.webView.setMraidViewableVisible();
_L2:
        return;
        mmadimpl.controller.webView.setMraidViewableHidden();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void onPageStarted(String s)
    {
        s = (MMAdImpl)adImplRef.get();
        if (s != null)
        {
            s.setClickable(false);
        }
    }

    ner(MMAdImpl mmadimpl)
    {
        adImplRef = new WeakReference(mmadimpl);
    }
}
