// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.fragments:
//            ImageCaptureFragment

final class this._cls0
    implements Provider
{

    final ImageCaptureFragment this$0;

    private SessionOcrResponseHandler get()
    {
        return currentSessionHandler;
    }

    public final volatile Object get()
    {
        return get();
    }

    andler()
    {
        this$0 = ImageCaptureFragment.this;
        super();
    }
}
